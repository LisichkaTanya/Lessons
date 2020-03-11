package Composition;

/**
 * Here we use has-a relationship
 */
public class People {
    private Job job;

    public People (){
        this.job = new Job();
        job.setSalary(150_000);
    }
    public int getSalary (){
        return job.getSalary();
    }
}
