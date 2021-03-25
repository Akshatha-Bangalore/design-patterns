package Prototype;

public class Album implements PrototypeCapable{

    private String name = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public PrototypeCapable clone() throws CloneNotSupportedException {
        System.out.println("Cloning Album object..");
        return (Album) super.clone();
    }


    @Override
    public String toString() {
        return "Album";
    }
}
