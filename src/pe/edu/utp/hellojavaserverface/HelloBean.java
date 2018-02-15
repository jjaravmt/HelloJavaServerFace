package pe.edu.utp.hellojavaserverface;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class HelloBean implements Serializable {
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getWelcomeMessage(){
        return isValidName()?"Welcome "+firstName +" "+lastName:"";
    }

    public boolean isValidName(){
        return !(firstName.isEmpty()|| firstName == null);
    }
}
