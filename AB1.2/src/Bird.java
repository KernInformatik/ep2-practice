import codedraw.CodeDraw;

/**
 * The class {@code Bird} models a simple moving object in a two-dimensional space.
 *
 * A bird has a state (consisting of position and velocity vector).
 * The position determines the current location of the bird, while the velocity describes
 * direction and speed of movement.
 *
 * Birds can update their position over time and may adjust their velocity vector
 * in order to avoid other objects and maintain a minimum distance.
 */
public class Bird {

    //TODO: all variables and additional methods must be private.

    /**
     * Creates a new bird with an initial position and velocity in the given world.
     *
     * @param position the initial position; {@code position != null}
     * @param velocity the initial velocity; {@code velocity != null}
     * @param livesIn  the world the bird lives in; {@code livesIn != null}
     */
    public Bird(Vector2D position, Vector2D velocity, World livesIn) {

        //TODO: implement constructor.
    }

    /**
     * Computes the steering force based on the given array of birds and updates
     * this bird's position and velocity (use {@link ApplicationVector2D} to see how this works).
     *
     * <p>This method modifies {@code this}. It does not modify other birds.</p>
     *
     * @param birds the array of all birds in the simulation including {@code this};
     *              {@code birds != null}
     */
    public void calculateSteering(Bird[] birds) {

        //TODO: implement this method.
    }

    /**
     * Draws this bird onto the given {@link CodeDraw} canvas (use {@link ApplicationVector2D} to see how this works).
     *
     * <p>The bird is rendered as a small filled circle at its position and a short line
     * ("nose") indicating its current direction of movement.</p>
     *
     * @param cd the CodeDraw canvas to draw on; {@code cd != null}
     */
    public void draw(CodeDraw cd) {

        //TODO: implement this method.
    }
}
