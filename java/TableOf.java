public class TableOf 
{
    public static void main(String[] args) 
    {
        for(int tableNum=1; tableNum<=10; tableNum++)
        {
            //     if(tableNum %2 ==0)
            int mul;
                for (mul = 1; mul <= 10; mul++) 
               {
                int secOut = tableNum*mul;
               
                // int secOut = tableNum*mul;
                if(secOut%2==0)
                {
                    for(int multiplier =1; multiplier<=10; multiplier++)
                    {
                        System.out.println(mul*multiplier);
                    }
                }
            }
            }
            
        }
    }

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

// public class TableOf {
//     public static void main(String[] args) {
//         for(int tableNum = 1; tableNum <=10; tableNum++)
//         {
//             for(int mul = 1; mul <=10; mul++)
//             {
                
//                     System.out.print(tableNum * mul);
//                     System.out.print(" ");
                
//             }
//             System.out.println();
//         }
    
        
//     }
// }

