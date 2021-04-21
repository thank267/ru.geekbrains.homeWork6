package animals;

public abstract class Animal {

    private String name;

    private int run;

    private int MAX_RUN;

    private int swim;

    private int MAX_SWIM;

    public Animal(String name, int maxRun, int maxSwim) {
        setName(name);
        setMAX_RUN(maxRun);
        setMAX_SWIM(maxSwim);
    }


    /**
     * @return the run
     */
    public int getRun() {
        return run;
    }

    /**
     * @param run the run to set
     */
    public void setRun(int run) {
        this.run = run;
    }

    /**
     * @return the swim
     */
    public int getSwim() {
        return swim;
    }

    /**
     * @param swim the swim to set
     */
    public void setSwim(int swim) {
        this.swim = swim;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    final public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the mAX_RUN
     */
    final protected int getMAX_RUN() {
        return MAX_RUN;
    }

    /**
     * @param mAX_RUN the mAX_RUN to set
     */
    final protected void setMAX_RUN(int mAX_RUN) {
        MAX_RUN = mAX_RUN;
    }

    /**
     * @return the mAX_SWIM
     */
    final protected int getMAX_SWIM() {
        return MAX_SWIM;
    }

    /**
     * @param mAX_SWIM the mAX_SWIM to set
     */
    final protected void setMAX_SWIM(int mAX_SWIM) {
        MAX_SWIM = mAX_SWIM;
    }

    

    final protected boolean checkRun(int toRun) {

        return toRun > getMAX_RUN()?false:true;
       
    }

    final protected boolean checkSwim(int toSwim) {

        return toSwim > getMAX_SWIM() && toSwim!=Integer.MAX_VALUE? false : true;
        

    }


    

    



    
    
}
