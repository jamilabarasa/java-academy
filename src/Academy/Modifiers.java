package Academy;

public class Modifiers {

    /*
    Access modifiers -used to set access levels for classes,attributes,methods and constructors,controls access levels
    Non access modifiers - do not control access level ,but provides other functionalities
     */

    /*
    Access modifiers for Classes
    Access modifiers for class we can use public or default
    puclic class is accessible by other classes
    default class is accessible by classes in the same package
     */

    /*
    Access modifiers for attributes,methods and constructors
    we can use public,private,default,protected
    public code is accessible for other classes
    default code is accessible by classes in the same package
    private the code is only accessible within the class it was declared
    protected the code is accessible within the classes of same package and subclasses

     */

    /*
    Non-Access modifiers for classes
    we can use final and abstract
    final class cannot be inherited by other classes
    abstract  class cannot be used to create objects,to access abstract class it has to be inherited from other classes

     */

    /*
    Non-Access modifiers for attributes and methods
    we can use final,static,attribute,transient,synchronized,volatile
    final methods and attributes cannot be overridden/modified
    static attributes and methods belong to the class rather the object
    abstract methods belongs to the abstract class and it does not have a body,body is provided by the subclass
    abstract can only be used in abstract class,and can only be used on methods
    abstract methods don't have a body,the body is provided by the subclass(inherited from)
    transient method are skipped when serializing the object containing them
    synchronized methods can only be accessed by one thread at a time
    volatile The value of an attribute is not cached thread-locally, and is always read from the "main memory"

     */
}
