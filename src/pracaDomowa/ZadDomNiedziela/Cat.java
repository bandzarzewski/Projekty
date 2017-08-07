package pracaDomowa.ZadDomNiedziela;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    //@Override
    public void speak() {
        System.out.println("Miauu");
    }

    //    @Override
    public void likeRunning() {
        System.out.println("Cats doesn't like water ");
    }


}
