package TaskModule2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class UnMarshalMain {

	public static void main(String[] args) {

		try {
			JAXBContext jc = JAXBContext.newInstance(Greenhouse.class);
			Unmarshaller u = jc.createUnmarshaller();
			FileReader reader = new FileReader("src/TaskModule2/GreenHouse.xml");
			Greenhouse greenhouse = (Greenhouse) u.unmarshal(reader);
			System.out.println(greenhouse);
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
