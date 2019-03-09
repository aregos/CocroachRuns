import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TaskManager <R,C extends Callable<R>>{
    private ExecutorService executor = Executors.newSingleThreadExecutor();
}
