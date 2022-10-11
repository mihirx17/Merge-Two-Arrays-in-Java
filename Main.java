public class Main {
    public static void merge_array(int a[],int b[]) {
        int k = 0;
        int total_length = a.length + a.length;
        int c[] = new int[total_length];
        for (int i = 0; i < a.length; i++) {
            c[k++] = a[i];

        }
        for (int j = 0; j < b.length; j++) {
            c[k++] = b[j];

        }
        System.out.println("Merge------------------------------------------------------------");
        for (int l = 0; l < total_length; l++) {
            System.out.print(" "+ c[l]);

        }
    }
    public static void main(String[] args) {

        int a[]={1,2,3,4};
        int b[]={5,6,7,8};
merge_array(a,b);

    }
}