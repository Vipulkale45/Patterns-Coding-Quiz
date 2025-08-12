package JAP82.patterns;

public class pattern156 {
    public static void main(String[] args) {
        int n=5;
        int count=n;
        for(int i=n; i>=1; i--)
        {
            int c=count;
            for(int j=i; j>1; j--)
            {
                System.out.print(" ");
            }
            for(int j=n; j>=i; j--)
            {
                System.out.print((char)(c+64));
                c-=j;
            }
            System.out.println();
            count+=i-1;
        }
    }
}
