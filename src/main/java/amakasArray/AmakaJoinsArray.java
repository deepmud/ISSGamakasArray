/*
        This Question was originally written in C programming language
        I rewrote it in Java language in this project

 */



package amakasArray;


//This is Amaka's own methods for joining her two arrays

public class AmakaJoinsArray {

    public int encodeInteger(int x, int n){
        n = n <<(1<<(1<<(1<<1)));
        x = x|n;
        return x;
    }

    public void encodeArray(int[] a, int[] b, int n){
        for(int i = 0; i < n; i++){
            a[i] = encodeInteger(a[i], b[i]);       //jshg
        }
    }
}
