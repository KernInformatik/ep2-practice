import java.io.IOException;
import java.util.Map;

/**
 * Collects and writes simulation log information.
 *
 * <p>This class stores simulation-step exceptions that occurred during
 * the simulation. It also keeps a text output stream open so that new
 * log entries can be written while the simulation is running.</p>
 *
 * <p>The logger uses predefined Java collection classes internally.</p>
 */
public class SimulationLogger {

    //TODO: all variables are private.

    /**
     * Creates a new simulation logger that writes to the specified file.
     *
     * <p>If the file already exists, new log entries are appended to the
     * existing content.</p>
     *
     * @param fileName the output file name; {@code fileName != null}
     * @throws IOException if the file cannot be opened for writing
     */
    public SimulationLogger(String fileName) throws IOException {

        //TODO: implement constructor.
    }

    /**
     * Records and writes a simulation-step exception.
     *
     * <p>The exception is stored internally and immediately written to the
     * log file. The output stream is flushed after writing so that the log
     * file is updated while the simulation is running.</p>
     *
     * @param exception the exception to record; {@code exception != null}
     */
    public void log(SimulationStepException exception) {

        //TODO: implement method.
    }

    /**
     * Returns the number of simulation steps for which at least one
     * unresolved collision was recorded.
     *
     * @return the number of recorded failed simulation steps
     */
    public int failedStepCount() {

        //TODO: implement method.
        return -1;
    }

    /**
     * Returns the total number of unresolved collisions recorded so far.
     *
     * @return the total number of unresolved collisions
     */
    public int unresolvedCollisionCount() {

        //TODO: implement method.
        return -1;
    }

    /**
     * Closes this logger.
     *
     * <p>Closing the logger flushes any buffered output and releases the
     * underlying file resource. After this method has been called, no further
     * log entries should be written.</p>
     */
    public void close() {

        //TODO: implement method.
    }

    /**
     * Reads a simulation log file and returns the number of unresolved
     * collisions recorded for each simulation step.
     *
     * <p>The log file is expected to contain one unresolved collision per line.
     * Each relevant line starts with a step entry of the form
     * {@code step=<number>}.</p>
     *
     * <p>Example line:</p>
     *
     * <pre>
     * step=24; ant=Ant@2c039ac6; obstacle=Ant@5f3a4b84
     * </pre>
     *
     * <p>The returned map associates each simulation step with the number of
     * unresolved collisions recorded for that step. If the same step occurs
     * multiple times in the file, the counts are accumulated.</p>
     *
     * @param fileName the log file name; {@code fileName != null}
     * @return a map associating simulation steps with unresolved collision counts
     * @throws IOException if the file cannot be read
     */
    public static Map<Integer, Integer> readCollisionsPerStep(String fileName)
            throws IOException {

        //TODO: implement method.
        return null;
    }
}