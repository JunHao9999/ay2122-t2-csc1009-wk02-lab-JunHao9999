public class MainQ3 {
    public static void main(String[] args) {
        long totalMilliseconds=System.currentTimeMillis();
//        System.out.println(totalMilliseconds+" milliseconds");
        long totalSeconds=totalMilliseconds/1000;
//        System.out.println(totalSeconds+" seconds");
        int currentSeconds=(int)totalSeconds%60;
//        System.out.println(currentSeconds+" current second");
        int totalMinutes=(int)totalSeconds/60;
//        System.out.println(totalMinutes+" minutes");
        int currentMinutes=totalMinutes%60;
//        System.out.println(currentMinutes+" current minute");
        int totalHours=totalMinutes/60;
//        System.out.println(totalHours+" hours");
        int currentHours=totalHours%24;
//        System.out.println(currentHours+" current hour");
        System.out.println("Current time is "+currentHours+":"+currentMinutes+":"+currentSeconds+ " GMT");
    }
}
