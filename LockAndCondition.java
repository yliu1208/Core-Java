import java.util.*; 
import java.util.concurrent.locks.*; 

public class LockAndCondition {
    private final double[] accounts; 
    private Lock bankLock; 
    private Condition sufficientFunds; 

    public LockAndCondition (int n, double initialBalance) {
        accounts = new double[n]; 
        Arrays.fill(accounts, initialBalance); 
        bankLock = new RecentrantLock(); 
        sufficientFunds = bankLock.newCondition(); 
    } 

    
    
}
