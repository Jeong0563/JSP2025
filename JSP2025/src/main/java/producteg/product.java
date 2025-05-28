package producteg;

public class product {
	private String id;
	private String name;
	private String maker;
	private int price;
	private String date;
	
	product (String id, String name, String maker, int price, String date) {
		this.id = id;
		this.setName(name);
		this.setMaker(maker);
		this.setPrice(price);
		this.setDate(date);
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
}
