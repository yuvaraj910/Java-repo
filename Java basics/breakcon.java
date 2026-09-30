public class breakcon {
    public static void main(String[] Args){
        int i =0;
        for (i = 0; i < 10 ; i++){


            if(i==2){
                continue;
            }
            else if(i==8){
                break;
            }
        
            System.out.println(i);
        }
    }
}
