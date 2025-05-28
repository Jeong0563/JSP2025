package producteg;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
	
	List<product> products = new ArrayList<product>();
	
	public ProductService() {
		product p = new product("101", "딥러닝", "신구문화사", 20000, "2022.4.2");
		products.add(p);
		p = new product("102", "텐서플로", "ai출판사", 30000, "2025.5.28");
		products.add(p);
		p = new product("103", "빅데이터", "사이언스", 35000, "2024.5.28");
		products.add(p);
	}
	public List<product>findAll() {
		return products;
	}
}
