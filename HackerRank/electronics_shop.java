/*
[HackerRank]: Given the price lists for the store's keyboards and USB drives, and Monica's budget, find and print the amount of money Monica will spend. If she doesn't have enough money to both a keyboard and a USB drive, print -1 instead. She will buy only the two required items.
*/

static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        Arrays.sort(keyboards);
        Arrays.sort(drives);
        int kLen = keyboards.length;
        int dLen = drives.length;
        int start = 0, diff = Integer.MAX_VALUE;
        int end = dLen-1, res = -1;
        while ( start < kLen && end >= 0){
            int sum = keyboards[start] + drives[end];
            if ( sum == b){
                res = sum;
                break;
            }
            else if ( sum < b ){
                if (diff > (b - sum)){
                    diff = b - sum;
                    res = sum;
                }
                start++; 
            }
            else if( sum > b){
                end--;
            }
        }
        return res;
    }
