public class UAS_NO_7 {

    public static void main(String args[]){
        int n = 5;
        int i, j;
        for (i = 0; i < n; i++)
        {
            for (j = 1; j < n - i; j++)
            {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}


