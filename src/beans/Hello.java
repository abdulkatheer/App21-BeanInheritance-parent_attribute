package beans;

public class Hello {
    private String name;
    private String message;
    private String wish;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getWish() {
        return wish;
    }

    public void setWish(String wish) {
        this.wish = wish;
    }

    public void sayHello() {
        System.out.println("Hello " + this.getName() + ", " + this.getMessage() + " " + this.getWish());
    }
}
