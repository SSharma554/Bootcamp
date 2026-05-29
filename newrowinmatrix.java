public class newrowinmatrix {
    public static void main(String[] args) {
        int arr[][] = {{1,2},{3,4}};
        int newrow[] = {5,6};

        int result[][] = new int[3][2];

        // Copy old matrix
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                result[i][j] = arr[i][j];
            }
        }

        // Insert new row
        for(int j=0;j<2;j++){
            result[2][j] = newrow[j];
        }

        // Print matrix
        System.out.println("Matrix after inserting row: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }  
}
