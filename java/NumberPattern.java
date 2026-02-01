public class NumberPattern 
{
    public static void main(String[] args) {
        
    // for(int i = 1; i<=5; i++)
    // {
    //     for (int j = 1; j <= i; j++) 
    //     {
    //         System.out.print(i + " ");
    //     }
    //     System.out.println();
    // }
    
    //Inverted Pattern
    // for(int i = 5; i>=1; i--)
    // {
    //     for (int j = 1; j <= i; j++) 
    //     {
    //         System.out.print(i + " ");
    //     }
    //     System.out.println();
    // }
    // }

    // int initialization = 1;
    // int condition = 1;
    
    // for(int i=1; i<=5; i++)
    // {
    //     for(int j = initialization; j<=condition; j++)
    //     {
    //         System.out.print(j + " ");
    //     }
    //     initialization += 3;
    //     condition += 4;
    //     System.out.println();
    // }

    // for (int s=1, e=1; s<=13; s+=3, e+=4) 
    // {
    //     for(int i=s; i<=e; i++)
    //     {
    //         System.out.print(i + " ");
    //     }
    //     System.out.println();
    // }

    // int initialization = 1;
    // int condition = 1;
    
    // for(int i=1; i<=5; i++)
    // {
    //     for(int j = initialization; j<=condition; j+=2)
    //     {
    //         System.out.print(j + " ");
    //     }
    //     initialization += 1;
    //     condition += 3;
    //     System.out.println();
    // }

    // for (int s=1, e=1; s<=5; s+=1, e+=3) 
    // {
    //     for(int i=s; i<=e; i+=2)
    //     {
    //         System.out.print(i + " ");
    //     }
    //     System.out.println();
    // }

// +
// -+-+
// --+-+-+
// ---+-+-+-+
// ----+-+-+-+-+
// -----+-+-+-+-+-+

// int coni = 1;
// int conj = 1;
// for(int row = 1; row<=6; row++)
// {   
// for(int i=3; i<=coni; i++)
// {
//     System.out.print("-");
// }
// for(int j=1; j<=conj; j++)
// {
//     if(conj == 1)
//         System.out.print("+");
//     else
//         System.out.print("-+");
// }
// System.out.println();
// coni+=1;
// conj+=1;
// }

// int initialization = 1;

//         for (int i = 1; i <= 4; i++) {   

//             int condition = initialization + i - 1;

//             for (int j = initialization; j <= condition; j++) {
//             //     System.out.print(j + " ");
//             // }

//             // initialization = condition + 1; 
//             System.out.println();
//         }

 

        for (int i = 1; i <= 5; i++) {          
            for (int j = 1; j <= 5; j++) {      

                if (i == 1 || i == 5 || j == 1 || j == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // new line after each row
        }

    }
}
