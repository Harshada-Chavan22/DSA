public class StarCount {
    public static void main(String[] args) {

        for (int i = 1; i <= 9; i++) 
            {
        int stars = (i <= 5) ? i : 10 - i;

        for (int j = 1; j <= stars; j++) {
        System.out.print("*");
        }
        System.out.println();
    }

        // for (int i = 1; i <= 5; i++) 
        // {
        //     for (int j = 1; j <= i; j++) 
        //     {
        //          System.out.print("*");    
        //          //System.out.println();
        //     }    
        //     System.out.println();
        // }
        // for (int i = 4; i >= 1; i--) 
        // {
        //     for (int j = 1; j <= i; j++) 
        //     {
        //          System.out.print("*");    
        //          //System.out.println();
        //     }    
        //     System.out.println();
        // }
        
        // for (int i = 5; i >= 1; i--) 
        // {
        //     for (int j = 1; j <= i; j++) 
        //     {
        //          System.out.print("*");    
        //          //System.out.println();
        //     }    
        //     System.out.println();
        // }
        
        // for (int i = 1; i <= 5; i++) 
        // {
        //     for (int j = 1; j <= i; j++) 
        //     {
        //          System.out.print("*");    
                 
        //     }    
        //     System.out.println();
        // }
        
    }
    
}
