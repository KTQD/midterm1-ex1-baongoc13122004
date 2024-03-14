abstract class Item {
    public String name;
    private String description;
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    protected String id;

    float price;
    void showInfo(){

    }
    public Item(String name, String description, String id, float price){
        this.description=description;
        this.name = name;
        this.id=id;
        this.price=price;
    }

