public class state extends country{
	protected String governor;
	protected String largCity;
	
	public state(String name, double area, String capital, double population, String governor, String largCity) {
		super(name, area, capital, population);
		this.governor = governor;
		this.largCity = largCity;
	}
    public String getgovernor(){
        return governor;
    }
    public void setgovernor(String governor){
        this.governor = governor;
    }
    public String getlargCity(){
        return largCity;
    }
    public void setlargCity(String largCity){
        this.largCity = largCity;
    }

	@Override
	public String toString() {
		return super.toString() + "State [governor= " + governor + ", largCity= " + largCity + "]";
    }
}

