public class StarPattern {
    public static void main(String[] args) {
        for(int gsc = 1; gsc<=5 ; gsc++)
        {
            for(int i=1; i<=gsc && i<=6-gsc; i++)
            {
                System.out.print("*");
            }
            System.out.println();
            
        }
        // for(int gsc = 1; gsc<=5 ; gsc++)
        // {
        //     for(int i=1; i<=gsc; i++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        //     for(int j=1; j<=6-gsc; j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for(int gsc = 1, osc = 5; gsc<=5 && osc>=1; gsc++, osc--)
        // {
        //     for(int i=1; i<=gsc; i++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        //     for(int j=1; j<=osc; j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
    }
}
// * 
// ***** 
// ** 
// **** 
// *** 
// *** 
// **** 
// ** 
// *****
// *
