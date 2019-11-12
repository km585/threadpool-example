public class Job implements Runnable{
    private int jobNumber;
    
    job (int jobNumber){
        this.jobNumber=jobNumber;
    }
    
    public void run(){
        try {
            Thread.sleep((int)1000);
        }catch (InterruptionException e){
        
        }
        
        System.out.println("Job: " + jobNumber + " is ending in thread : "+ + Thread.currentThread().getName());
    }   
        
}
