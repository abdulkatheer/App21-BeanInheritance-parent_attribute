package beans;

public class Hai {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHai(){
        System.out.println("Hai " + this.getName() + "!");
    }
}
