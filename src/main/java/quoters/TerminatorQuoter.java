package quoters;

import quoters.annotations.DeprecatedClass;
import quoters.annotations.InjectRandomInt;
import quoters.annotations.PostProxy;
import quoters.annotations.Profiling;

import javax.annotation.PostConstruct;
import java.util.stream.IntStream;

/**
 * Terminator Quoter.
 */
@Profiling
@DeprecatedClass(newImpl = T1000.class)
public class TerminatorQuoter implements Quoter {

    @InjectRandomInt(min = 2, max = 9)
    private int repeat;

    private String message;

    @PostConstruct
    public void init() {
        System.out.println("Phase 2");
        System.out.println(repeat);
    }

    public TerminatorQuoter() {
        System.out.println("Phase 1");
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    @PostProxy
    public void sayQuote() {

        System.out.println("Phase 3");
        IntStream.range(0, repeat).forEach(i ->
                System.out.println("message = " + message));
    }
}
