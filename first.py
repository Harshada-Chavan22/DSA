import sys
from collections import defaultdict, deque

# Set higher recursion limit for safety, though not strictly needed for BFS
# sys.setrecursionlimit(2000) 

# Global structures to be populated by build_graph
graph = defaultdict(list)
spot_to_trees = defaultdict(set)
unique_spots = set()
global_tree_idx = 0

def build_graph(data_lines):
    global global_tree_idx, graph, spot_to_trees, unique_spots
    
    # Reset globals for clean execution (useful in a testing environment)
    graph.clear()
    spot_to_trees.clear()
    unique_spots.clear()
    global_tree_idx = 0

    current_tree_data = []
    
    # 1. Parse Input and Store Tree Data
    for line in data_lines:
        if line == 'break':
            # Process the completed tree's data for the current tree_idx
            for spots in current_tree_data:
                A = spots[0]
                B_list = spots[1:]

                # All spots in this branch belong to the current tree
                for spot in spots:
                    spot_to_trees[spot].add(global_tree_idx)
                    unique_spots.add(spot)
                    
                # Add within-tree edges (Climb/Descend)
                for B in B_list:
                    # Climbing Down (B -> A): Cost 0
                    graph[(B, global_tree_idx)].append((A, global_tree_idx, 0))
                    # Climbing Up (A -> B): Cost 1
                    graph[(A, global_tree_idx)].append((B, global_tree_idx, 1))

            global_tree_idx += 1
            current_tree_data = []
        else:
            # Accumulate lines for the current tree
            try:
                spots = [int(s) for s in line.split()]
                current_tree_data.append(spots)
            except ValueError:
                pass
                
    # --- 2. Add Tree Switching Edges ---
    for spot in unique_spots:
        trees = spot_to_trees[spot]
        if len(trees) > 1:
            # Add bidirectional switch edges (Cost 1)
            tree_list = list(trees)
            for i in range(len(tree_list)):
                for j in range(i + 1, len(tree_list)):
                    T1, T2 = tree_list[i], tree_list[j]
                    
                    # Switch T1 <-> T2 (Cost 1)
                    graph[(spot, T1)].append((spot, T2, 1))
                    graph[(spot, T2)].append((spot, T1, 1))


def solve():
    # Read all input from stdin
    input_data = sys.stdin.read().split()
    if not input_data:
        print(0)
        return

    try:
        N = int(input_data[0])
        end_idx = 1 + N
        start_spot = int(input_data[end_idx])
        dest_spot = int(input_data[end_idx + 1])
        tree_lines = input_data[1 : end_idx]

    except (IndexError, ValueError):
        print(0)
        return

    # Build the combined (Spot, Tree) graph
    build_graph(tree_lines)
    
    # --- 3. 0-1 BFS ---

    start_trees = spot_to_trees.get(start_spot)
    if not start_trees:
        print(0)
        return
        
    # Start on the first tree the spot belongs to (since the problem says ONE tree only)
    start_tree = list(start_trees)[0]
    start_node = (start_spot, start_tree)
    
    # dist: minimum energy to reach (spot_id, tree_id)
    dist = defaultdict(lambda: float('inf'))
    dist[start_node] = 0
    
    dq = deque([start_node])
    
    # Track the minimum cost to the DESTINATION SPOT (regardless of tree)
    min_energy_to_dest = float('inf')

    while dq:
        u_spot, u_tree = dq.popleft()
        current_cost = dist[(u_spot, u_tree)]
        
        # Check if we reached the destination
        if u_spot == dest_spot:
            # Update the global minimum and continue if this path is shorter
            min_energy_to_dest = min(min_energy_to_dest, current_cost)
            # Optimization: If the current minimum is 0, we can stop
            if min_energy_to_dest == 0:
                print(0)
                return

        # Optimization: If the current cost is already greater than the best cost found 
        # for the destination, we can safely prune this path.
        if current_cost >= min_energy_to_dest:
             continue 
        
        # Explore neighbors
        for v_spot, v_tree, edge_cost in graph[(u_spot, u_tree)]:
            new_cost = current_cost + edge_cost
            v_node = (v_spot, v_tree)
            
            if new_cost < dist[v_node]:
                dist[v_node] = new_cost
                
                # 0-1 BFS rule
                if edge_cost == 0:
                    dq.appendleft(v_node)
                else:
                    dq.append(v_node)

    # Output the result
    if min_energy_to_dest != float('inf'):
        print(min_energy_to_dest)
    else:
        print(0)

if __name__ == "__main__":
    solve()