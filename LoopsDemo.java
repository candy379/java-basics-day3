public class LoopsDemo {
    public static void main(String[] args){

//        for(int i=1;i<=10;i++){
//            System.out.println(i);
//        }
        for (int i=1;i<=100;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }

        for (int i=1;i<=10;i++) {
            System.out.println("\nTable: "+i);

            for(int j=1;j<=10;j++){
                System.out.println(i+"X"+j+"="+i*j);

            }
            System.out.println();
        }

    }
}
