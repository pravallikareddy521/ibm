package Streams;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlightStreamDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		List<Flight> flights=null;
		
		Stream<String> lines=Files.lines(Paths.get("src/flights.txt "));
		flights=lines.map(l ->{
			String[] a=l.split(",");
			return new Flight(Integer.parseInt(a[0],a[1],a[2],a[3]));
		}).collect(Collectors.toList());
		
		flights.forEach(System.out::println);
		
		//print details of flight 123
		System.out.println(flights.stream().filter(f ->123 == f.getCode()).findFirst().get());
		
		//print all flights of jet carrier
		flights.stream().filter(f -> f.getCarrier().equals("Jet")).collect(Collectors.toList()).forEach(System.out::println);
		//print flight by their route
		flights.stream().filter(f -> f.getSource().equals("Kochi"))&& f.getDestination().equals("Kolkota"))
		.collect(Collectors.toList()).forEach(System.out::println);

		


	}

}
