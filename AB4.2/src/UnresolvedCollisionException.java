/**
 * Exception indicating that an ant could not resolve a collision during
 * one simulation step.
 *
 * <p>This exception stores information about the simulation step, the ant
 * involved in the unresolved collision, and the blocking physical object.</p>
 */
public class UnresolvedCollisionException extends StepException {

    //TODO: all variables are private.

    /**
     * Creates a new unresolved collision exception.
     *
     * @param step the simulation step in which the collision occurred;
     *             {@code step >= 0}
     * @param ant the ant involved in the collision; {@code ant != null}
     * @param obstacle the blocking physical object (typically an ant);
     *                 may be {@code null} if no single object is known
     */
    public UnresolvedCollisionException(
            int step,
            Ant ant,
            Physical obstacle) {

        super(step);

        //TODO: implement constructor.
    }

    /**
     * Returns the ant involved in the unresolved collision.
     *
     * @return the ant
     */
    public Ant getAnt() {

        //TODO: implement method.
        return null;
    }

    /**
     * Returns the blocking physical object.
     *
     * @return the blocking object, or {@code null} if no single object is known
     */
    public Physical getObstacle() {

        //TODO: implement method.
        return null;
    }

    /**
     * Returns a single-line textual representation suitable for log files.
     *
     * @return a log line describing this unresolved collision
     */
    @Override
    public String toString() {

        //TODO: implement method.
        return "";
    }
}