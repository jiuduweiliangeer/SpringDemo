package cdxy.demo.lession12.pojo;
/*SpringMVC会按请求参数名和POJO属性名进行自动匹配，自动为该对象填充属性值
* SpringMVC的目标方法可以接受哪些类型的参数
*   1.HttpServletRequest
*   2.HttpServletResponse
*   3.HttpSession
*   4,java.security.Principal
*   5.java.util.Local:表示一个国家使用的语言
*   6.InputStream
*   7.OutputStream
*   8.Writer
*   9.Reader*/
public class User {
    private String username;
    private String password;
    private Integer age;
    private String email;
    public User(){};
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Integer getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public User(String username, String password, Integer age, String email) {
        this.username = username;
        this.password = password;
        this.age = age;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
