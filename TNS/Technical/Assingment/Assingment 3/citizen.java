public class citizen {
	protected String name;
	protected double area;
	
	public citizen(String name, double area) {
		super();
		this.name = name;
		this.area = area;
	}
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getArea(){
        return area;
    }
    public void setArea(double area){
        this.area = area;
    }


	@Override
	public String toString() {
		return "citizen [Name= " + name + ", area= " + area + "] ";
	}
		
	
}