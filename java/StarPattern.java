public class StarPattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
    int limit = (i % 2 == 1) ? (i + 1) / 2 : 6 - (i / 2);

    for (int j = 1; j <= limit; j++) {
        System.out.print("*");
    }
    System.out.println();
}

        // for(int i=1; i<=5; i++)
        // {
        //     for(int j=1; j<=5; j++)
        //         System.out.print("*");
        //         System.out.println();
        // }
        // System.out.println();
        // for(int gsc = 1; gsc<=5 ; gsc++)
        // {
        //     int sc = (gsc<=5)? gsc : 6-gsc;
        //     for(int i=1; i<=sc; i++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
            
        // }
        // for(int gsc = 1; gsc<=5 ; gsc++)
        // {
        //     for(int i=1; i<=gsc || i<=6-gsc; i++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
            
        // }
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


// for(int gsc = 1; gsc<=5 ; gsc++)
//         {
//             for(int i=1; i<=gsc; i++)
//             {
//                 System.out.print("*");
//             }
//             
//             for(int j=1; j<=6-gsc; j++)
//             {
//                 System.out.print("*");
//             }
//             System.out.println();
//         } how this replace above code

// for (int gsc = 1; gsc <= 5; gsc++) {

//     for (int k = 1; k <= 6-gsc; k++) {
//         System.out.print("*");
//         System.out.println();
//     }

//     System.out.println();
// }

// for (int gsc = 1; gsc <= 5; gsc++) {

//     for (int k = 1; k <= 5; k++) {

//         // first line: increasing stars
//         if (k <= gsc) {
//             System.out.print("*");
//         }

//         // move to next line exactly after gsc stars
//         if (k == gsc) {
//             System.out.println();
//         }

//         // second line: decreasing stars
//         if (k <= 6 - gsc) {
//             System.out.print("*");
//         }
//     }
//     System.out.println();
// }

// for (int gsc = 5; gsc >= 1; gsc--) {

//     for (int i = 1; i <= gsc; i++) {
//         System.out.print("*");
//     }
//     System.out.println();

//     for (int j = 1; j <= 6 - gsc; j++) {
//         System.out.print("*");
//     }
//     System.out.println();
// }
//     *
// *****
//    ** 
//  **** 
//   *** 
//   *** 
//  **** 
//    ** 
// ***** 
//     *     

// for (int i = 1; i <= 5; i++) {

//     for (int j = 1; j <= 5; j++) {

//         if (j <= i) {
//             System.out.print("*");
//         }

//         if (j == i) {
//             System.out.println();
//         }

//         if (j <= 6 - i) {
//             System.out.print("*");
//         }
//     }
//     System.out.println();
// }
}
}
