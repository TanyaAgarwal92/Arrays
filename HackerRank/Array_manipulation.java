/*
[HackerRank] : Starting with a 1-indexed array of zeros and a list of operations, for each operation add a value to each of the array element between two given indices, inclusive. Once all operations have been performed, return the maximum value in your array.
*/

// Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {
        long arr[] = new long[n+1];
        int noQueries = queries.length;
        for ( int i = 0; i < noQueries; i++){
            int start = queries[i][0];
            int end = queries[i][1];
            int add = queries[i][2];
            arr[start - 1] += add;
            arr[end] -= add;
        }
        long max = 0, sum = 0;
        for( int i = 0; i < n; i++){
            sum += arr[i];
            max = Math.max( max, sum);
        }
        return max;
    }
