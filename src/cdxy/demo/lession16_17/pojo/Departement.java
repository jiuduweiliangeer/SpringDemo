package cdxy.demo.lession16_17.pojo;

public class Departement {
    private Integer id;
    private String departementname;

    public Departement() {

    }

    public Departement(Integer id, String departementname) {
        this.id = id;
        this.departementname = departementname;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDepartementname(String departementname) {
        this.departementname = departementname;
    }

    public Integer getId() {
        return id;
    }

    public String getDepartementname() {
        return departementname;
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", departementname='" + departementname + '\'' +
                '}';
    }
}
