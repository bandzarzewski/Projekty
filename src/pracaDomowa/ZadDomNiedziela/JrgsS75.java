package pracaDomowa.ZadDomNiedziela;

/**
 * Created by Maciek on 28.07.2017.
 */
public class JrgsS75 {
    boolean talerze = true;
    boolean beben = true;

    void zagrajNaBebnie() {
        System.out.println("Bam, bam, baaam");
    }

    void zagrajNaTalerzach() {
        System.out.println("brzdęk, brzeeedeek");
    }

}

class Test {
    public static void main(String[] args) {


        JrgsS75 p = new JrgsS75();
        p.zagrajNaTalerzach();
        p.beben = false;
        p.zagrajNaBebnie();

        if (p.beben == true) {
            p.zagrajNaBebnie();
        }
    }
}