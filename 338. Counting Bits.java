complexity--O(nLogn)

public int[] countBits(int n) {
        int[] arr = new int[n+1];
        for(int i=0;i<=n;i++){
            int m=i;
            int count =0;
            while(m>0){
                count+=m&1;
                m=m>>1;
            }
            arr[i]=count;
        }
        return arr;
    }
    
    Complexity-- O(n)
    
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        arr[0]=0;
        for(int i=1;i<=n;i++){
            arr[i]=arr[i/2]+i%2;
        }
        return arr;
    }
