package messdaten;
import java.time.LocalDateTime;

/*
 * ______________________________________
 * |TemperatureData						|
 * |––––––––––––––––––––––––––––––––––––|
 * |id:int								|
 * |timestamp:LocalDateTime				|
 * |temperature:double					|
 * |humidity:double						|
 * |––––––––––––––––––––––––––––––––––––|
 * |getTemperatureInFahrenheit()double;	|
 * |printToConsole();					|
 * |____________________________________|
 * 
 */

public class TemperatureData {
    
	//Attribute
    int id;
	LocalDateTime timestamp;
	double temperature;
	double humidity;
	
	//Methoden
	double getTemperatureInFahrenheit(){
		return this.temperature * 1.8 + 32;
	}
	void printToConsole() {
		System.out.println("TemperatureData:[" + "id: " + this.id + ", timestamp:" + this.timestamp + ", temperature: " + this.temperature + ", humidity: " + this.humidity + "]");
	}
}
