public class randomMatrix {
    static int[] randomMat(int size,int maxvalue){
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = (int) Math.random()*maxvalue;
        }
        return a;
    }
}
