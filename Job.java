public class Job implements Runnable{
    private int jobNumber;
    
    Job (int jobNumber){
        this.jobNumber=jobNumber;
    }
    
    public void run(){
        try {
            Thread.sleep((int)1000);
        }catch (InterruptedException e){
        
        }
        
        System.out.println("Job: " + jobNumber + " is ending in thread : "+ Thread.currentThread().getName());
    }   
        
}
