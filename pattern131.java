package JAP82.patterns;

public class pattern131 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1; i<=n; i++)
        {
            for(int j=n; j>=1; j--)
            {
                if(i<j)
                {
                    System.out.print(j);
                }
                else{
                    System.out.print(i);
                }
            }
            System.out.println();
        }
    }
}
