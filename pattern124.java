package JAP82.patterns;

public class pattern124 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1; i<=n; i++)
            {
                for(int j=1; j<=n; j++)
                {
                    if(i%2!=0)
                    {
                        System.out.print("1");
                    }
                    else
                    {
                        int result=(i/2);
                        System.out.print((char)(result+64));
                    }
                }
                System.out.println();
            }
            
    }
}
