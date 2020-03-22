package cdxy.demo.lession1;

public class HelloWorld {
    private String name;

    public void setName(String name) {
        System.out.println("setName:"+name);
        this.name = name;
    }
    public void say(){
        System.out.println("say:"+this.name);
    }

    public HelloWorld() {
        System.out.println("Constructor...");
    }
}
