package Clothes;

public class Clothes{

	private String size;
	private String color;
	
	public Clothes(){}
	
	public Clothes(String size){
		this();
		setsize(size);
	}
	
	public Clothes(String size,String color){
		this(size);
		setcolor(color);
	}
	
	public Clothes(String size,String color,int price){
		this(size,price);
		setprice(price);
	}
	
	public String getSize(){
		return this.size;
	}
	
	public void setSize(String size){
		this.size = size;
	}
	
	public String getColor(){
		return this.color;
	}
	
	public void setColor(String color){
		this.color = color;
	}
	
	public int getPrice(){
		return this.price;
	}  
	
	public void setPrice(int price){
		this.price = price;
	}

}