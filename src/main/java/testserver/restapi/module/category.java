package testserver.restapi.module;

public class category {

	private int id_category;
	private String name;
	
	
	public int getId_category() {
		return id_category;
	}
	public void setId_category(int id_category) {
		this.id_category = id_category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "category [id_category=" + id_category + ", name=" + name + "]";
	}
	
	
}
