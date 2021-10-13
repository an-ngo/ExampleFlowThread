public class RunnableDemo implements Runnable {
    private Thread t;
    private String threadName;

    
    RunnableDemo(String name){
        this.threadName = name;
        System.out.println("Creating "+this.threadName);
    }
    @Override
    public void run() {
        System.out.println("Running "+threadName);// TODO Auto-generated method stub
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread: "+ threadName + ", "+i);
                //Stop loop after 50ms
                Thread.sleep(50);   
            }
        } catch (InterruptedException e) {
            System.out.println("Thread "+threadName +" interrupted.");//TODO: handle exception
        }
        System.out.println("Thread "+threadName+" exiting.");
    }
    
    public void start(){
        System.out.println("Starting "+threadName);
        if(t==null){
            t = new Thread(this);
            t.start();
        }
    }
}
