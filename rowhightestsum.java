import java.util.Scanner;

public class rowhightestsum {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int r,c,max = 0,row = 0;

        System.out.println("Rows:");
        r = sc.nextInt();
        System.out.println("Columns:");
        c = sc.nextInt();

        int a[][] = new int[r][c];
        System.out.println("Enter elements:");
        for(int i=0;i<r;i++){
            int sum=0;

            for(int j=0;j<c;j++) {
                a[i][j] = sc.nextInt();
                sum = sum + a[i][j];
            }
            if(sum>max){
                max = sum;
                row = i;
            }
    }
    System.out.println("After removing row:");

    for(int i=0;i<r;i++){
        if(i==row){
            continue;
        }
        for(int j=0;j<c;j++){
            System.out.print(a[i][j] + " ");
        }
        System.out.println();
        }
    }
}
