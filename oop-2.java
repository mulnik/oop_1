Author.java
 
package prog;
 
import java.util.Scanner;
 
public class Author {
    Scanner in = new Scanner(System.in);
    private String name = "George Orwell";
    private String email;
    private char gender = 'M';
 
    public Author(){}
    public Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
 
    public void setEmail(){
        System.out.print("Enter the Email: ");
        this.email = in.nextLine();
    }
 
    public String getName(){
        return name;
    }
 
    public String getEmail(){
        return email;
    }
 
    public char getGender(){
        return gender;
    }
 
 
    public String ToString(){
        return getName() + " (" + getGender() + ") at " + getEmail();
    }
 
}
 
 
TestAuthor.java
 
package prog;
 
 
 
public class TestAuthor {
 
    public static void main(String[] args) {
 
        Author author = new Author();
        author.setEmail();
 
        System.out.print(author.ToString());
 
    }
}