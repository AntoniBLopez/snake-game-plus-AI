
package Code;
import processing.code.*;

public class Apple {
    public PVector position = new PVector(0,0);

    public Apple() {

    }

    // Le da una nueva posición a la manzana comprobando que en ella no haya una serpiente
    public void spawn(boolean[][] map) {
        boolean done = false;
        while(done == false) {
            int x = (int) random(0,24);
            int y = (int) random(0,24);

            if(map[y][x] == true) {
                done = true;
                position.x = x;
                position.y = y;
            }
        }
    }

    public PVector getPosition() {
        return position;
    }
}
