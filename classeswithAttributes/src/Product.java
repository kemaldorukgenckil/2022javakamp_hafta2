public class Product {

    //Constructor yapıcı method
    public Product(int _id,String name,String description,double price,int stockAmount,String renk){
        System.out.println("Yapıcı blok çalıştı"); //yapıcı method çalıştı

        this._id=_id;
        this.renk=renk;
        this.name=name;
        this.price=price;
        this.description=description;
        this.stockAmount =stockAmount;
    }

    public Product(){

    }

    // attribute and field
    private int _id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String renk;
    private String kod;

    //getter
    public int getId(){
        return _id;
    }
    //setter
    public void setId(int id){
        //this.id=id;
        // buradaki this buradaki classın idsidir, diğer id dışarıdan aldığımız
        _id=id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getRenk() {
        return renk;
    }



    public String getKod() {
        return this.name.substring(0,1) + _id;
    }


}
