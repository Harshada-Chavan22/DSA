public class MergeSortedLists {
    public static void main(String[] args) {
        ListNode* mergeTwoLists(ListNode* head1, ListNode* head2) {
            if(head1 == NULL || head2 == NULL)
            {
                return head1 == NULL ? head2 : head1;
            }
            //case 1:
            if(head1-> val <= head2->val)
            {
                head1->next = mergeTwoLists(head1->next, head2);
                return head1;
            }
            //case 2:
            else
            {
                head2->next = mergeTwoLists(head1, head2->next);
                return head2;
                //this is the recursive approach to merge two sorted linked lists. The function takes two pointers to the heads of the two lists and compares their values. It recursively merges the lists by adjusting the next pointers accordingly. If one of the lists is empty, it returns the other list as the merged result.
                //so this is the recursive approach to merge two sorted linked lists. The function takes two pointers to the heads of the two lists and compares their values. It recursively merges the lists by adjusting the next pointers accordingly. If one of the lists is empty, it returns the other list as the merged result.
                //actually this line is the recursive approach to merge two sorted linked lists. The function takes two pointers to the heads of the two lists and compares their values. It recursively merges the lists by adjusting the next pointers accordingly. If one of the lists is empty, it returns the other list as the merged result.
            }
        }
    }

}
