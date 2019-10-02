/*
[HackerRank] : Print a single integer that denotes the minimum number of elements Karl must delete for all elements in the array to be equal.
*/

// Complete the equalizeArray function below.
    static int equalizeArray(int[] arr) {
        Hashtable<Integer, Integer> frequency = new Hashtable();
        for ( int i : arr){
            if ( frequency.containsKey(i)){
                frequency.put(i, frequency.get(i) + 1);
            }
            else{
                frequency.put(i, 1);
            }
        }
        int max = 0;
        for ( int j : frequency.keySet()){
            if ( frequency.get(j) > max){
                max = frequency.get(j);
            }
        }
        int result = arr.length - max;
        return result;
    }
