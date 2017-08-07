package pracaDomowa.ZadDomNiedziela.RozwiazanieZad;

/**
 * Created by sp0rk on 17/07/17.
 */
public class Doberman extends Dog {
    public Doberman(String name) {
        super(name);
    }

    @Override
    void speak() {
        System.out.println("WOOOOOOOOF!");
    }
}
