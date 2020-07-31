package ml.brainin;

public class Oven {
	private int maxTemprature;
	private int currentTemprature;

	public void gefrigerate(int temperature) throws RuntimeException {
		this.setCurrentTemprature(this.getCurrentTemprature() - temperature);
		System.out.println("Rerfegerated. : "+temperature+"\n"+ toString());
		if (this.getCurrentTemprature() > getMaxTemprature()) {
			throw new RuntimeException("We can't cool it down, there will be an explosion! aaaaaaa ......");
		}
	}
	
	public void burning(ICombustible iCombustible) throws RuntimeException {
		this.setCurrentTemprature(this.getCurrentTemprature()+ iCombustible.getCombustionTemperature());
		System.out.println("Burning : "+ iCombustible.toString());
		System.out.println(toString());
		if (this.getCurrentTemprature() > getMaxTemprature()) {
			throw new RuntimeException("Attention! The oven is overheated.!");
		}
	}
	
	
	public Oven() {
		this(2500);
	}
	public Oven(int maxTemprature) {
		this.maxTemprature = maxTemprature;
	}
	private int getMaxTemprature() {
		return this.maxTemprature;
	}
	private void setMaxTemprature(int maxTemprature) {
		this.maxTemprature = maxTemprature;
	}
	private int getCurrentTemprature() {
		return this.currentTemprature;
	}
	private void setCurrentTemprature(int currentTemprature) {
		this.currentTemprature = currentTemprature;
	}

	@Override
	public String toString() {
		return "Oven state is : [maxTemprature=" + this.maxTemprature + ", currentTemprature=" + this.currentTemprature + "]";
	}




}
