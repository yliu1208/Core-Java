public class ThreadInterrupt {
    public static void main(String[] args) throws InterruptedException {
        Runnable task1 = () -> {
            try {
                for(int i = 0; i < 100; i++) {
                    System.out.println("Task 1: " + i); 
                    Thread.sleep(100); 
                }
            } catch (InterruptedException e) {
                System.out.println("Having caught InterruptedException, Thread.sleep ends."); 
                return; 
            }
        }; 

        Runnable task2 = () -> {
            try {
                for(int i = 0; i < 100; i++) {
                    System.out.println("Task 2: " + i); 
                    Thread.sleep(100); 
                }
            } catch (InterruptedException e) {
                System.out.println("Having caught InterruptedException, Thread.sleep ends."); 
                return; 
            }
        }; 

        Thread thread1 = new Thread(task1); 
        Thread thread2 = new Thread(task2); 
        thread1.start(); 
        thread2.start(); 
        Thread.sleep(3000); 
        thread1.interrupt();
    }
}