package quoters;

import java.util.stream.IntStream;

/**
 * Terminator Quoter.
 */
public class TerminatorQuoter implements Quoter {

    @InjectRandomInt(min = 2, max = 9)
    private int repeat;

    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void sayQuote() {
        IntStream.range(0, repeat).forEach(i ->
                System.out.println("message = " + message));
    }
}
