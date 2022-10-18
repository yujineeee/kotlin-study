package lecture10.java;

public class JavaCat extends JavaAnimal{

    protected JavaCat(String species) {
        super(species, 4);
    }

    @Override
    public void move() {
        System.out.println("고양이 사뿐사뿐");
    }
}
