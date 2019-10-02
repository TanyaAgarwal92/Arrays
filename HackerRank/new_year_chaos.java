/*
[HackerRank] : Print an integer denoting the minimum number of bribes needed to get the queue into its final state. Print Too chaotic if the state is invalid, i.e. it requires a person to have bribed more than  people.
*/

// Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
        int qLen = q.length;
        int bribes = 0;
        boolean chaotic = false;
        for ( int i = qLen -1 ; i >= 0; i--){
            if ( q[i] == i + 1){
                continue;
            }
            else if ( q[i - 1] == i + 1){
                bribes++;
                int temp = q[i-1];
                q[i-1] = q[i];
                q[i] = temp;
            }
            else if ( q[i - 2] == i + 1){
                bribes += 2;
                q[i-2] = q[i-1];
                q[i-1] = q[i];
                q[i] = i + 1;
            }
            else{
                chaotic = true;
                break;
            }
        }
        if(chaotic){
            System.out.println("Too chaotic");
        }
        else{
            System.out.println(bribes);
        }
    }
