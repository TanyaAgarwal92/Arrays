/*
[HackerRank] : You are given an unordered array consisting of consecutive integers  [1, 2, 3, ..., n] without any duplicates. You are allowed to swap any two elements. You need to find the minimum number of swaps required to sort the array in ascending order.
*/

// Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
        int arrLen = arr.length;
        int minSwaps = 0;
        boolean visited[] = new boolean[arrLen];
        for ( int i = 0; i < arrLen ; i++){
            if ( arr[i] == i+1){
                visited[i] = true;
                continue;
            }
            else if ( !visited[arr[i] - 1]){
                visited[i] = true;
                int temp = arr[i];
                int hops = 1;
                while ( temp != i+1 ){
                    visited[temp - 1] = true;
                    temp = arr[temp -1];
                    hops++;
                }
                minSwaps += hops - 1;
            }
        }
        return minSwaps;
    }
