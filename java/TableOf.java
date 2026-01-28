public class TableOf 
{
    public static void main(String[] args) 
    {
        for(int tableNum=1; tableNum<=100; tableNum++)
        {
            if(tableNum %2 ==0)
            for (int mul = 1; mul <= 10; mul++) 
            {
                System.out.println(tableNum * mul);
            }
        }
    }
}


