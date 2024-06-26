public class country  extends citizen {
	protected String capital;
	protected double population;
	
	public country(String name, double area, String capital, Double population) {
		super(name, area);
		this.capital = capital;
		this.population = population;
	}
    public String getcapital(){
        return capital;
    }
    public void setcapital(String capital){
        this.capital = capital;
    }
    public Double getpopulation(){
        return population;
    }
    public void setpopulation(Double population){
        this.population = population;
    }

	@Override
	public String toString() {
		return super.toString() + "Country [capital= " + capital + ", population= " + population + "] ";
	}

	
	
	
}
