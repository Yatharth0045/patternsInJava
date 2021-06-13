public class triangles {
    public static void main(String[] args) throws Exception{
        int N=20;
        int X=N;
        int Y=(N*2+1);
        int L=(Y/2+1);
        int R=(Y/2+1);
        int Mid=N+1;
        int L2=0;
        int R2=0;
        if(N%2==0){
            L2=Mid-(N/2-1);
            R2=Mid+(N/2-1);
        }else{
            L2=Mid-(N/2-1);
            R2=Mid+(N/2-1);
        }
        for (int i=1; i<=X; i++)
        {
            for(int j=1; j<=Y; j++){
                if(j>=L && j<=R){
                    if(i>=X/2+1){
                        if(j>=L2 && j<=R2){
                            System.out.print(":");
                        }else{
                            System.out.print("#");
                        }
                    }else{
                        System.out.print("#");
                    }
                }else{
                    System.out.print(":");
                }
                Thread.sleep(1);
            }
            L--;
            R++;
            if(i>=X/2+1){
                L2++;
                R2--;
            }
            System.out.println("");
        }   
    }
}