//import biuoop.DrawSurface;
//import biuoop.GUI;
//
///**
// * A Ball class.
// *
// * @author Nir Dunetz and Haim Gil.
// */
//public class Game {
//    private SpriteCollection sprites;
//    private GameEnvironment environment;
//    int[] nir=new int[10];
//
//    public void addCollidable(Collidable c) {
//        this.environment.addCollidable(c);
//    }
//
//    public void addSprite(Sprite s) {
//        this.sprites.addSprite(s);
//    }
//
//    // Initialize a new game: create the Blocks and Ball (and Paddle)
//    // and add them to the game.
//    public void initialize() {
//        Gui gui  = new GUI("Game", 800, 600);
//    }
//
//    // Run the game -- start the animation loop.
//    public void run() {
//        //...
//        int framesPerSecond = 60;
//        int millisecondsPerFrame = 1000 / framesPerSecond;
//        while (true) {
//            long startTime = System.currentTimeMillis(); // timing
//
//            DrawSurface d = gui.getDrawSurface();
//            this.sprites.drawAllOn(d);
//            gui.show(d);
//            this.sprites.notifyAllTimePassed();
//
//            // timing
//            long usedTime = System.currentTimeMillis() - startTime;
//            long milliSecondLeftToSleep = millisecondsPerFrame - usedTime;
//            if (milliSecondLeftToSleep > 0) {
//                sleeper.sleepFor(milliSecondLeftToSleep);
//            }
//        }
//    }