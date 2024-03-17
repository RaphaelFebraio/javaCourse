public class Main {
    public static void main(String[] args) {
        SmartTV smartTV = new SmartTV();

        smartTV.ligarTv();
        //System.out.println(smartTV.ligada);
        smartTV.mudarCanal(25);
        smartTV.mudarVolume(30);
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.diminuirVolume();
        smartTV.subirCanal();
        smartTV.descerCanal();
        smartTV.descerCanal();
        smartTV.descerCanal();

        smartTV.desligarTv();
        //System.out.println(smartTV.ligada);
    }
}
