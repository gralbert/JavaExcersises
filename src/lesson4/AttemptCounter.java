package lesson4;

public class AttemptCounter {
    private static AttemptCounter instance;

    // private AttemptCounter(){}

    public static synchronized AttemptCounter getInstance(){
        if (instance == null){
            instance = new AttemptCounter();
        }
        return instance;
    }
}
