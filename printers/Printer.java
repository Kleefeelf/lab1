package printers;

public class Printer{
    int pagesPerMinute;
    int price;
    String name;
    String printType;
    
    private String color;
    private String paperFormat;
    private String seller;
    private String use;
    private String brand;

    static int printersQuantity = 0;

    protected boolean used; 
    protected boolean available;
    
    public Printer() {
        pagesPerMinute = 0;
        price = 0;
        name = "None";
        printType = "None";
        color = "None";
        paperFormat = "None";
        seller = "None";
        use = "None";
        brand = "None";
        used = false;
        available = false;
        printersQuantity += 1;
    }

    public Printer(String color, String paperFormat, String seller, String use) {
        this();
        this.color = color;
        this.paperFormat = paperFormat;
        this.seller = seller;
        this.use = use;
    }
    public Printer(int pagesPerMinute, int price, String name, String printType, String color, String paperFormat,
                String seller, String use, String brand, boolean used, boolean available){
                    this(color, paperFormat, seller, use);
                    this.pagesPerMinute = pagesPerMinute;
                    this.price = price;
                    this.name = name;
                    this.printType = printType;
                    this.brand = brand;
                    this.used = used;
                    this.available = available;
                }
    // Setters
    public void setPagesPerMinute(int pagesPerMinute){
        this.pagesPerMinute = pagesPerMinute;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPrintType(String printType){
        this.printType = printType;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setPaperFormat(String paperFormat){
        this.paperFormat = paperFormat;
    }
    public void setSeller(String seller){
        this.seller = seller;
    }
    public void setUse(String use){
        this.use = use;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setUsed(boolean used){
        this.used = used;
    }
    public void setAvailable(boolean available){
        this.available = available;
    }

    // Getters
    public String getName(){
        return this.name;
    }
    public int getPagesPerMinute(){
        return this.pagesPerMinute;
    }
    public int getPrice(){
        return this.price;
    }
    public String getPrintType(){
        return this.printType;
    }
    public String getColor(){
        return this.color;
    }
    public String getSeller() {
        return this.seller;
    }
    public String getUse(){
        return this.use;
    }
    public String getBrand(){
        return this.brand;
    }
    public boolean isUsed(){
        return this.used;
    }
    public boolean isAvailable(){
        return this.available;
    }
    public String toString(){
        return pagesPerMinute+ ", " + price + ", " + name + ", " + printType +
        ", " + color + ", " + paperFormat + ", " + seller + ", " + use + ", " +
        brand + ", " + used + ", " + available;
    }
    public static void printPrintersQuantity(){
        System.out.println(printersQuantity);
    }
    public void resetValues(int pagesPerMinute, int price, String name, String printType, String color, String paperFormat,
    String seller, String use, String brand, boolean used, boolean available){
        this.color = color;
        this.paperFormat = paperFormat;
        this.seller = seller;
        this.use = use;
        this.pagesPerMinute = pagesPerMinute;
        this.price = price;
        this.name = name;
        this.printType = printType;
        this.brand = brand;
        this.used = used;
        this.available = available;
    }
}