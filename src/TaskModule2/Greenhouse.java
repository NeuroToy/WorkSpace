package TaskModule2;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "plant"
})
@XmlRootElement(name = "greenhouse")
public class Greenhouse {

	@XmlElement(required = true)
    private List<Plant> plant;

    public List<Plant> getPlant() {
        if (plant == null) {
            plant = new ArrayList<Plant>();
        }
        return this.plant;
    }

	@Override
	public String toString() {
		return "Greenhouse [plant=" + plant + "]";
	}
}
