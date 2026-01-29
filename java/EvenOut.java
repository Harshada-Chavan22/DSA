public class EvenOut {
    public static void main(String[] args) {
        for(int tableNum=1; tableNum<=10; tableNum++)
        {
                System.out.println();
                int diff = (tableNum %2 ==1)?2:1;
                for(int mul = diff; mul<=10; mul+=diff)
                {
                    System.out.print(tableNum * mul);
                    System.out.print(" ");
                }
                
                
        }
        System.out.println();

        // for(int tableNum=1; tableNum<=10; tableNum++)
        // {
        //         System.out.println();
        //         if(tableNum %2 ==1)
        //         {
        //             for (int mul = 2; mul <= 10; mul+=2) 
        //             {
        //                 System.out.print(tableNum * mul);
        //                 System.out.print(" ");
        //             }        
        //         }
        //         else
        //         {
        //             for (int mul = 1; mul <= 10; mul++) 
        //             {
        //                 System.out.print(tableNum * mul);
        //                 System.out.print(" ");
        //             } 
        //         }
                
                
        // }
        // System.out.println();

        // for(int tableNum=1; tableNum<=10; tableNum++)
        // {
        //         System.out.println();
        //         for (int mul = 1; mul <= 10; mul++) 
        //        {
        //            if((tableNum * mul) %2 == 0)
        //         System.out.print(tableNum * mul);
        //         System.out.print(" ");
        //        }
        // }
        // System.out.println();
    }
}
