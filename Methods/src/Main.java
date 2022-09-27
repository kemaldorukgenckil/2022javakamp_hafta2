public class Main {
    public static void main(String[] args) {
       sayiBulmaca();

    }

    public static void sayiBulmaca(){ //camel case
        int[] sayilar = new int[]{1,2,5,7,9,0};
        int aranacak=10;
        boolean isOk = false;

        for (int sayibul:sayilar) {

            if(sayibul==aranacak){
                isOk=true;
            }


        }
         String mesaj="";
        if(isOk){
            mesaj="Sayı mevcuttur:"+aranacak;
            mesajVer(mesaj);
        }
        else{
            mesajVer("Sayı mevcut değildir:" +aranacak);
        }


    }

    public static void mesajVer(String mesaj){ //parametreli method
        System.out.println(mesaj);

    }

}