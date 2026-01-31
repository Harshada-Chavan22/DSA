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

    int initialization = 1;
    int condition = 1;
    
    for(int i=1; i<=5; i++)
    {
        for(int j = initialization; j<=condition; j++)
        {
            System.out.print(j + " ");
        }
        initialization += 3;
        condition += 4;
        System.out.println();
    }
}
}
