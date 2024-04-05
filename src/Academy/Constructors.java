package Academy;

public class Constructors {

    /*
    constructors are special methods used to initialize objects
    constructor is created when an object is created
    it can be used to set initial values for object attributes
    all classes have constructors by default,if you don't create one java creates for you,however
    you won't be able to set initial values for the object attributes
    constructor name must match the class name
    constructors is called when the object is created

     */

    int modelYear;
    String modelName;

    public Constructors(int year,String name){
       modelYear = year;
       modelName = name;
    }



}

