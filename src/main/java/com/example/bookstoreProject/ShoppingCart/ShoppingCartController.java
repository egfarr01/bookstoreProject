public class ShoppingCartController
{
    private String name = null;
    private double price;
    private boolean taxable;

    ShoppingCartController(String name, double price, boolean taxable) {
        this.name = name;
        this.price = price;
        this.taxable = taxable;
    }

    public String getName() {
        return name;
    }

    public boolean isTaxable() {
        return taxable;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTaxable(boolean taxable) {
        this.taxable = taxable;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
class ShoppingCart 
{
    ShoppingCart(items) 
    {
        this.items = items
    }

    getItems() 
    {
        return this.items
    }

}

public double cashRegister(ArrayList<Item> shoppingCart) 
{
    let sum = 0
    //shoppingCart.getItems().forEach(item) 
    //shoppingCart.getItems();

    //sum of entire cart:
    for(int i = 0; i < shoppingCart.size(); i++)
    {
         
        sum = sum + (item.getPrice() * 1.10)
        //sum = sum + item.getPrice()
        
    
    }

    //print shoping cart: 
    for(int i = 0; i < shoppingCart.size() i++)
    {
        System.out.println("printing item" + i);
        System.out.println(shoppingCart.get(i));    
    }
    
    return sum
}
item1 = new Item("item1",100,false)
item2 = new Item("item2",90,true)
item3 = new Item("item3",80,false)
item4 = new Item("item4",70,false)
console.log(cashRegister(new ShoppingCart([item1, item2, item3])));
console.log(cashRegister(new ShoppingCart([item4,item2])));