public class TableOf 
{
    public static void main(String[] args) 
    {
        for(int tableNum=1; tableNum<=10; tableNum++)
        {
            for (int mul = 1; mul <= 10; mul++) 
            {
                System.out.println(tableNum * mul);
                for (int multiplier = 1; multiplier <= 10; multiplier++) 
                {
                    System.out.println(tableNum * mul * multiplier);
                }
            }
        }
    }
}
