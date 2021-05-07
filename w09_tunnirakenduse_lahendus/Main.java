public class Main {
    public static String[] type = { "1-10", "10-1", "a-k", "k-a"};
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++){
            try {
                new Thread(getRunnable(), type[i]).start();
                Thread.sleep(500);
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    public static Runnable getRunnable(){
        return () -> {
            for (int i = 0; i < 10; i++){
                try {
                    (Thread.currentThread().getName().equals("1-10")){
                        System.out.println(Thread.currentThread().getName() + ": " + (i+1));
                    }
                    Thread.sleep(500);
                } catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }
        };
    }
}
