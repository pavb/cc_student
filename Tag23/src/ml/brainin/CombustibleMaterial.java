package ml.brainin;

public class CombustibleMaterial {
	private final int MIN_TEMPERATURE = 100;
	private String name;
	private int temperature;
	
	
	public CombustibleMaterial() {
		this("Default name", 100);
	}
	
	public CombustibleMaterial(String name, int tmprature) {
		setName(name);
		setTemperature(tmprature);
	}
	private String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	public int getTemperature() {
		return temperature;
	}
	private void setTemperature(int temprature) {
		if (temperature < 0) {
			this.temperature = MIN_TEMPERATURE;
		}else {
			this.temperature = temprature;
		}
	}
	@Override
	public String toString() {
		return "CombustibleMaterial [name=" + name + ", temperature=" + temperature + "]";
	}
	
	public void burning(ICombustible iCombustible) throws RuntimeException{
		System.out.println("Burning "+toString());
		iCombustible.burning(getTemperature());
	}
}
