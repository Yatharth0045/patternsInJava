public class heartPattern {
    public static void main(String[] args) throws Exception{
        int midADecreaseX = 29;
        int midADecreaseY = 69;
        int midBDecreaseX = 33;
        int midBDecreaseY = 64;
        int midCDecreaseX = 45;
        int midCDecreaseY = 53;
        int midCIncrementCounter = 2;
        for(int i = 1; i<=35; i++){
            for(int j=1; j<=100;j++){
                if(i == 7 && ((j>=33 && j <=44) || (j>=56 && j <=67))){
                    System.out.print("@");
                }else if(i == 8 && ((j>=43 && j <=47) || (j>=53 && j <=57) || (j>=30 && j <=34) || (j>=66 && j <=70) )){
                    System.out.print("@");
                }else if(i == 9 && ((j>=47 && j <=49) || (j>=51 && j <=53) || (j>=29 && j <=31) || (j>=69 && j <=71) )){
                    System.out.print("@");
                }else if( i==10 && ((j>=28 && j <=30) || (j>=70 && j <=72) || j==50 )){
                    System.out.print("@");
                }else if((i>=11 && i<=13) && ((j>=28 && j <=30) || (j>=70 && j <=72))){
                    System.out.print("@");
                }else if((i>=14 && i<=16) && ((j>=midADecreaseX && j <=(midADecreaseX+2)) || (j>=midADecreaseY && j <=(midADecreaseY+2)))){
                    System.out.print("@");
                }else if((i>=17 && i<=20) && ((j>=midBDecreaseX && j <=(midBDecreaseX+3)) || (j>=midBDecreaseY && j <=(midBDecreaseY+3)))){
                    System.out.print("@");
                }else if((i>=21 && i<=22) && ((j>=midCDecreaseX && j <=(midCDecreaseX+midCIncrementCounter)) || (j>=midCDecreaseY && j <=(midCDecreaseY+midCIncrementCounter)))){
                    System.out.print("@");
                }else if( i==23 && j==50){
                    System.out.print("@");
                }else{
                    System.out.print(":");
                }
                Thread.sleep(1);
            }
            if(i>=14 && i<=16){
                midADecreaseX+=1;
                midADecreaseY-=1;
            }
            if(i>=17 && i<=20){
                midBDecreaseX+=3;
                midBDecreaseY-=3;
            }
            if(i>=21 && i<=22){
                midCIncrementCounter-=1;
                midCDecreaseX+=3;
                midCDecreaseY-=2;
            }
            System.out.println();
        }        
    }
}
