package quoters;

/**
 * @author Tit on 03.12.2017
 */
public class ProfilingController implements ProfilingControllerMBean {
    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    private boolean enabled = true;
}
