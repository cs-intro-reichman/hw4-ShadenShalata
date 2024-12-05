public class Primes {
    public static void main(String[] args) {
        // Replace this statement with your code
        int n= Integer.parseInt(args[0]);
        boolean [] arr=new boolean[n+1];
        arr[0]=false;
        arr[1]=false;
        int cnt=0;
        System.out.println("Prime numbers up to "+n+":");
        for (int i = 2; i < arr.length; i++)
        {
            arr[i]=true;
        }
        int p=2;
        while(p<=Math.sqrt(n))
        {
            for (int i = p+1; i < arr.length; i++)
        {
            if(i%p==0)arr[i]=false;
        }
        for(int j=p+1;j<arr.length;j++)
        {
            if(arr[j]==true)
            {
                p=j;
                j=arr.length;
            }
        }
        }
        for (int i = 2; i < arr.length; i++)
        {
            if(arr[i]==true)
            {
                System.out.println(i);
                cnt++;
            }
        }
        System.out.println("There are "+cnt+" primes between 2 and "+n+" ("+((cnt*100)/n)+"% are primes)");
        


    }
}