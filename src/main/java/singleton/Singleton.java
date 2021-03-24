package singleton;

public class Singleton {
    private static Singleton obj;
    /*
    * Private constructor is used to force use of
    * getInstance() to create singleton.
    * */
    private Singleton() {}

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    /*
    * equals() is used to compare two object reference obj1 and obj2
    * refer to same object.
    * */
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    /*
    * static is used so that getInstance() can be called without instantiating the class.
    * Singleton obj is not called until we call getInstance().
    * */
    public static Singleton getInstance()
    {
        if (obj==null)
            obj = new Singleton();
        return obj;
    }
}
