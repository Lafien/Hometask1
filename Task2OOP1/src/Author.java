import java.util.Objects;

public class Author {
    private  String name;
    private  String email;
    private  String gender;

    public Author(String name, String email, String gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public  String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) &&
                Objects.equals(email, author.email) &&
                Objects.equals(gender, author.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, gender);
    }

    @Override
    public String toString() {
        return "Author[name="+name + ",email=" + email + ",gender=" + gender + "]";
    }

    public  String getGender() {
        return gender;
    }
}
