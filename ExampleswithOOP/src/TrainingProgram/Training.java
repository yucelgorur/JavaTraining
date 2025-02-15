package TrainingProgram;
public class Training {
    private int burpeeNumber;
    private int pushupNumber;
    private int situpNumber;
    private int squatNumber;

    public Training(int burpeeNumber, int pushupNumber, int situpNumber, int squatNumber) {
        this.burpeeNumber = burpeeNumber;
        this.pushupNumber = pushupNumber;
        this.situpNumber = situpNumber;
        this.squatNumber = squatNumber;
    }

    public int getBurpeeNumber() {
        return burpeeNumber;
    }

    public void setBurpeeNumber(int burpeeNumber) {
        this.burpeeNumber = burpeeNumber;
    }

    public int getPushupNumber() {
        return pushupNumber;
    }

    public void setPushupNumber(int pushupNumber) {
        this.pushupNumber = pushupNumber;
    }

    public int getSitupNumber() {
        return situpNumber;
    }

    public void setSitupNumber(int situpNumber) {
        this.situpNumber = situpNumber;
    }

    public int getSquatNumber() {
        return squatNumber;
    }

    public void setSquatNumber(int squatNumber) {
        this.squatNumber = squatNumber;
    }

    public void doExercise(String exerciseType, int count){
        if (exerciseType.equals("Burpee")){
            doBurpee(count);
        } else if (exerciseType.equals("Pushup")) {
            doPushup(count);
        }else if (exerciseType.equals("Situp")) {
            doSitup(count);
        }else if (exerciseType.equals("Squat")) {
            dosquat(count);
        }else {
            System.out.println("Uygun hareket bulunamadı.");
        }
    }
    public void doBurpee(int count){
        if (burpeeNumber==0){
            System.out.println("Yapılacak burpee kalmadı");
        }if (burpeeNumber - count < 0 ){
            System.out.println("Hedefi aştınız, tebrikler!");
            burpeeNumber = 0;
            System.out.println("Kalan burpee sayısı: " +burpeeNumber);
        }else {
            burpeeNumber -=count;
            System.out.println("Kalan burpee sayisi: " + burpeeNumber);
        }
    }
    public void doPushup(int count){
        if (pushupNumber==0){
            System.out.println("Yapılacak pushup kalmadı");
        }if (pushupNumber - count < 0 ){
            System.out.println("Hedefi aştınız, tebrikler!");
            pushupNumber = 0;
            System.out.println("Kalan Pushup sayısı: " + pushupNumber);
        }else {
            pushupNumber -=count;
            System.out.println("Kalan Pushup sayisi: " + pushupNumber);
        }
    }
    public void doSitup(int count){
        if (situpNumber==0){
            System.out.println("Yapılacak situp kalmadı");
        }if (situpNumber - count < 0 ){
            System.out.println("Hedefi aştınız, tebrikler!");
            situpNumber = 0;
            System.out.println("Kalan situp sayısı: " +burpeeNumber);
        }else {
            situpNumber -=count;
            System.out.println("Kalan situp sayisi: " + burpeeNumber);
        }
    }
    public void dosquat(int count){
        if (squatNumber==0){
            System.out.println("Yapılacak squad kalmadı");
        }if (squatNumber - count < 0 ){
            System.out.println("Hedefi aştınız, tebrikler!");
            squatNumber = 0;
            System.out.println("Kalan squad sayısı: " +squatNumber);
        }else {
            squatNumber -=count;
            System.out.println("Kalan squad sayisi: " + squatNumber);
        }
    }
    public boolean doneExercise(){
        return (burpeeNumber == 0) && (pushupNumber == 0) && (situpNumber == 0) && (squatNumber == 0);
    }

}
