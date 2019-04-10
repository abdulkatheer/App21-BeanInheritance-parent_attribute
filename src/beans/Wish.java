package beans;

public class Wish {
    private String name;
    private String wish;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWish() {
        return wish;
    }

    public void setWish(String wish) {
        this.wish = wish;
    }

    public void wishUser(){
        System.out.println("Welcome " + this.getName() + ", " + this.getWish());
    }
}
