package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.field.Position;

abstract  public class Car {

    /** The position of the car on the grid */
    private Position pos;

    public Car (Position pos) {
        this.pos=pos;
    }


    //Getters&&Setters-------------------------------------------------------
    public Position getPos() {
        return pos;
    }

    //Methods----------------------------------------------------------------

    public boolean isCrashed() {
        return false;
    }


}
