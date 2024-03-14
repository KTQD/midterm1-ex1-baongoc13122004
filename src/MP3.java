public class MP3 extends Item {
    private String duration;
    public MP3(String name, String description, String id, float price) {
        super(name, description, id, price);
    }
    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Description: " + getDescription());
        System.out.println("ID: " + id);
        System.out.println("Price: " + price);
        System.out.println("Duration: " + duration + " seconds");
    }
}
