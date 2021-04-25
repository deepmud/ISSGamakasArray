package amakasArray;

public class AmakaRecoverArray {

    public void decodeArray(int[] a, int[] b, int n){
        for(int i = 0; i < n; i++){
            a[i] = decodeInteger(a[i]);
        }
    }

    private int decodeInteger(int a) {
        int mask = 225;       //mask (a) with 255 which equal to 11111111 in binary digits
        a = a & mask;          //query (a) with (mask)
        a = a >> 5;           //right shift 5 times

        return a;
    }
}
