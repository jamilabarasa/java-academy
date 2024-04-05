package Academy;

public class Encapsulation {
    /*
    Encapsulation is to make sure sensitive data is hidden from users
    to achieve this you must declare class and variables/attributes as private
    provide get and set methods to access and update the value of a private variable
    a private variable has only access to its class (class outside has no access)
    however it is possible to access them if we provide get and set methods
    the get method returns the variable value while set method sets the variable value
    the syntax for both start with get and set followed by the name of the variable with the first
    letter in upper case
    example

     */

    private String name;

    //Getter
    public String getName() {
        return name; //getter method returns the value of the variable name
    }

    //Setter
    private void setName(String newName) {
        this.name = newName;//setter method sets the value of the variable name
    }

    /*
    Why Encapsulation??
    Increased security of data.
    Better control of class attributes and methods.
    Class attributes can be made read-only if you use only get methods and can be made write-only
    if you use only set methods.
    Flexible:programmer can change one part of coding without affecting other parts
     */

    

}
