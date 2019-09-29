/*
[HackerRank] : Print a single line of  space-separated integers denoting the final state of the array after performing  left rotations.
*/

// Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
        int aLen = a.length;
        d = d % aLen;
        int i, j;
        for ( i = 0; i < d; i++){
            int first =  a[0];
            for ( j = 0 ; j < aLen-1; j++){
                a[j] = a[j+1];
            }
            a[j] = first;
        }
        return a;
    }
