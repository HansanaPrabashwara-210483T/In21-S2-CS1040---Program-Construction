// Create an abstract class to create singers and dancers
abstract public class Artist {
    private String name; // A variable to store the name
    private String Role; // This is to specify weather artist is a singer ora dancer

    protected void setName(String name) {
        this.name = name;
    }

    protected void setRole(String role) {
        Role = role;
    } // Method to set the role

    protected String getName() {
        return name;
    }// Method to get te name
}
