package pl.sda.day6.geometr;

/**
 * Created by RENT on 2017-07-04.
 */
public abstract class Polygon extends Figure {

    private int numOfVerts;

    public Polygon(int numOfVerts) {
        this.numOfVerts = numOfVerts;
    }

    public int getNumOfVersts() { // metoda zapamieta ilosc wierzcholkow
        return numOfVerts;
    }

}
