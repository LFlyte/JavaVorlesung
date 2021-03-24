package messdaten;

public class Main {
    	public static void main(String[] args) {
		TemperatureData a = new TemperatureData();
		a.humidity = 0.2;
		a.temperature = 30.5;
		a.timestamp = java.time.LocalDateTime.now();
		a.id = 1;
		
		TemperatureData b = new TemperatureData();
		b.humidity = 0.4;
		b.temperature = 26.7;
		b.timestamp = java.time.LocalDateTime.now();
		b.id = 2;
		
		TemperatureData c = new TemperatureData();
		c.humidity = 0.6;
		c.temperature = 23.1;
		c.timestamp = java.time.LocalDateTime.now();
		c.id = 3;
		
		System.out.println(a.getTemperatureInFahrenheit());
		System.out.println(b.getTemperatureInFahrenheit());
		System.out.println(c.getTemperatureInFahrenheit());
		
		a.printToConsole();
		b.printToConsole();
		c.printToConsole();
	}
}
