package cdxy.demo.lession16_17.pojo;

public class Teacher {
    private Integer id;
    private String username;
    private String password;
    private Integer gender;
    private String email;
    private Departement departement;

    public Teacher() {
    }

    public Teacher(Integer id, String username, String password, Integer gender, String email, Departement departement) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.gender = gender;
        this.email = email;
        this.departement = departement;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDepartement(Departement departement) {
        this.departement = departement;
    }

    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Integer getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public Departement getDepartement() {
        return departement;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", gender=" + gender +
                ", email='" + email + '\'' +
                ", departement=" + departement +
                '}';
    }
}
