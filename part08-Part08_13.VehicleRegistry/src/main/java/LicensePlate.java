
import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

    @Override
    public boolean equals(Object comparedObject) {
        // if the variables are located in the same place, they're the same
        if (this == comparedObject) {
            return true;
        }

        // if comparedObject is not of type LicensePlate, the objects aren't the same
        if (!(comparedObject instanceof LicensePlate)) {
            return false;
        }

        // let's convert the object to a LicensePlate-object
        LicensePlate comparedLicensePlate = (LicensePlate) comparedObject;

        // if the instance variables of the objects are the same, so are the objects
        if (this.country.equals(comparedLicensePlate.country)
                && this.liNumber.equals(comparedLicensePlate.liNumber)) {
            return true;
        }

        // otherwise, the objects aren't the same
        return false;
    }

    @Override
    public int hashCode() {
        if (this.country == null) {
            return this.liNumber.hashCode();
        }
        if (this.liNumber == null) {
            return this.country.hashCode();
        }
        return this.liNumber.hashCode() + this.country.hashCode();
    }

}
