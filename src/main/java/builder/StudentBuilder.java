package builder;


/*
* Builder class for companion class => Student
* */
public class StudentBuilder {

    /*
    * Builder class will have same fields as its companion class.
    * The only difference is that builder class fields will be static in contrast to its companion.
    * */
    private static int id;
    private static String name;
    private static String address;

    /*
    * A static builder() is written and this method will return an object of type `Builder`.
    * This is static because we don't want to create an unnecessary `Builder` object
    * */
    public static StudentBuilder builder(){
        return new StudentBuilder();
    }

    private StudentBuilder() {}

    /*
    * we will now have public setter methods to set each of the fields on the `Builder` object
    * The catch is that these setter methods will return the same `Builder` object on which they set value upon
    * */
    public StudentBuilder withId(int id)
    {
        this.id = id;
        return this;
    }
    public StudentBuilder withName(String name)
    {
        this.name = name;
        return this;
    }
    public StudentBuilder withAddress(String address)
    {
        this.address = address;
        return this;
    }

    /*
    * In the end, there will be one static build() whose job is to construct an object of type `Companion` and return it.
    * */
    public static Student build() {
        return new Student(id, name, address);
    }
}
