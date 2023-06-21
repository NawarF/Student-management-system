
package main;



public class Student {
    
    String firstName,nikeName;
    int std_number;
    

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getNikeName() {
        return nikeName;
    }

    public void setNikeName(String nikeName) {
        this.nikeName = nikeName;
    }

    public int getStd_number() {
        return std_number;
    }

    public void setStd_number(int std_number) {
        this.std_number = std_number;
    }
 
        
    @Override
    public String toString() {
       return    std_number + "                          "+ firstName + "                          "+ nikeName.toUpperCase();
     
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.std_number;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (this.std_number != other.std_number) {
            return false;
        }
        return true;
    }
    
    
}
