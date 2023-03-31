package joojootottakai.olioviikko9;

import android.widget.Spinner;

import java.io.Serializable;

public class User implements Serializable {
    public String firstName;
    public String lastName;
    public String email;
    public String degreeProgram;
    public String degrees;

    protected int image;

    public User(String firstName, String lastName, String email, String degreeProgram, int image, String degrees) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.degreeProgram = degreeProgram;
        this.image = image;
        this.degrees = degrees;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getDegreeProgram() {
        return degreeProgram;
    }

    public int getImage() {
        return image;
    }

    public String getDegrees() {
        return degrees;
    }
}
