package core.job;

import org.apache.log4j.Logger;
import utils.STATE;

import java.util.Date;

/**
 * Abstract Job
 *
 * @author jiangxu
 */
public class AbstractJob {

    /**
     * Log for abstract job
     */
    protected static final Logger LOG = Logger.getLogger(AbstractJob.class);

    /**
     * Name of job
     */
    protected String name;

    /**
     * State of job
     * WAITING, STARTING, RUNNING, INTERRUPT, FINISH
     */
    protected STATE state;

    /**
     * Register time of job
     */
    protected Date registerTime;


    public AbstractJob(String name, STATE state, Date registerTime) {
        this.name = name;
        this.state = state;
        this.registerTime = registerTime;
    }
}
