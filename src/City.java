
public class City {
	String name;
	int population;
	public City() {
		this.name="pune";
		this.population=400000;
	}

	public City(String nm,int pop) {
		this.name=nm;
		this.population=pop;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}
}
