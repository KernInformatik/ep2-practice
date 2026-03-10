/**
 * Represents the simulation world in which birds move.
 *
 * <p>
 * The world is defined as a rectangular region with width {@code w}
 * and height {@code h}. It applies boundary rules to states that
 * leave this region.
 * </p>
 */
public class World {

    //TODO: object variables and additional methods must be private.

    /**
     * Creates a new world with the given dimensions.
     *
     * @param w the width of the world; {@code w > 0}
     * @param h the height of the world; {@code h > 0}
     */
    public World(int w, int h) {

        //TODO: implement constructor.
    }

    /**
     * Applies the world's boundary rule to the given state.
     *
     * <p>
     * If the position lies outside the world, it is wrapped to the
     * opposite side (torus topology). The velocity remains unchanged
     * (see also {@link ApplicationVector2D}).
     * </p>
     *
     * @param s the state to be adjusted; {@code s != null}
     * @return a new {@link State} whose position lies inside the world
     */
    public State enforceBoundary(State s) {

        //TODO: implement method.
        return null;
    }
}