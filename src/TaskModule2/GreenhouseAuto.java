//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.16 at 01:52:53 PM AST 
//

package TaskModule2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="plant" maxOccurs="5">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="soil">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="podzolic"/>
 *                         &lt;enumeration value="sod-podzolic"/>
 *                         &lt;enumeration value="dirt"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="origin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="visualParameters">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="size">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                   &lt;minInclusive value="0"/>
 *                                   &lt;maxInclusive value="1000"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute ref="{}color"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="growingTips">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="temperature">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;group ref="{}set"/>
 *                                     &lt;attribute ref="{}unit"/>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="watering">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;group ref="{}set"/>
 *                                     &lt;attribute ref="{}unit"/>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="multiplying">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="reproduction">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="stalk"/>
 *                                   &lt;enumeration value="seed"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "plant" })
@XmlRootElement(name = "greenhouse")
public class GreenhouseAuto {

	@XmlElement(required = true)
	protected List<GreenhouseAuto.Plant> plant;

	/**
	 * Gets the value of the plant property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the plant property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getPlant().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link GreenhouseAuto.Plant }
	 * 
	 * 
	 */
	public List<GreenhouseAuto.Plant> getPlant() {
		if (plant == null) {
			plant = new ArrayList<GreenhouseAuto.Plant>();
		}
		return this.plant;
	}

	/**
	 * <p>
	 * Java class for anonymous complex type.
	 * 
	 * <p>
	 * The following schema fragment specifies the expected content contained
	 * within this class.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *         &lt;element name="soil">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;enumeration value="podzolic"/>
	 *               &lt;enumeration value="sod-podzolic"/>
	 *               &lt;enumeration value="dirt"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="origin" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *         &lt;element name="visualParameters">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;sequence>
	 *                   &lt;element name="size">
	 *                     &lt;simpleType>
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
	 *                         &lt;minInclusive value="0"/>
	 *                         &lt;maxInclusive value="1000"/>
	 *                       &lt;/restriction>
	 *                     &lt;/simpleType>
	 *                   &lt;/element>
	 *                 &lt;/sequence>
	 *                 &lt;attribute ref="{}color"/>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *         &lt;element name="growingTips">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;sequence>
	 *                   &lt;element name="temperature">
	 *                     &lt;complexType>
	 *                       &lt;complexContent>
	 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                           &lt;group ref="{}set"/>
	 *                           &lt;attribute ref="{}unit"/>
	 *                         &lt;/restriction>
	 *                       &lt;/complexContent>
	 *                     &lt;/complexType>
	 *                   &lt;/element>
	 *                   &lt;element name="watering">
	 *                     &lt;complexType>
	 *                       &lt;complexContent>
	 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                           &lt;group ref="{}set"/>
	 *                           &lt;attribute ref="{}unit"/>
	 *                         &lt;/restriction>
	 *                       &lt;/complexContent>
	 *                     &lt;/complexType>
	 *                   &lt;/element>
	 *                 &lt;/sequence>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *         &lt;element name="multiplying">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;sequence>
	 *                   &lt;element name="reproduction">
	 *                     &lt;simpleType>
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                         &lt;enumeration value="stalk"/>
	 *                         &lt;enumeration value="seed"/>
	 *                       &lt;/restriction>
	 *                     &lt;/simpleType>
	 *                   &lt;/element>
	 *                 &lt;/sequence>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "name", "soil", "origin", "visualParameters", "growingTips", "multiplying" })
	public static class Plant {

		@XmlElement(required = true)
		protected String name;
		@XmlElement(required = true)
		protected String soil;
		@XmlElement(required = true)
		protected String origin;
		@XmlElement(required = true)
		protected GreenhouseAuto.Plant.VisualParameters visualParameters;
		@XmlElement(required = true)
		protected GreenhouseAuto.Plant.GrowingTips growingTips;
		@XmlElement(required = true)
		protected GreenhouseAuto.Plant.Multiplying multiplying;

		/**
		 * Gets the value of the name property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getName() {
			return name;
		}

		/**
		 * Sets the value of the name property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setName(String value) {
			this.name = value;
		}

		/**
		 * Gets the value of the soil property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getSoil() {
			return soil;
		}

		/**
		 * Sets the value of the soil property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setSoil(String value) {
			this.soil = value;
		}

		/**
		 * Gets the value of the origin property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getOrigin() {
			return origin;
		}

		/**
		 * Sets the value of the origin property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setOrigin(String value) {
			this.origin = value;
		}

		/**
		 * Gets the value of the visualParameters property.
		 * 
		 * @return possible object is
		 *         {@link GreenhouseAuto.Plant.VisualParameters }
		 * 
		 */
		public GreenhouseAuto.Plant.VisualParameters getVisualParameters() {
			return visualParameters;
		}

		/**
		 * Sets the value of the visualParameters property.
		 * 
		 * @param value
		 *            allowed object is
		 *            {@link GreenhouseAuto.Plant.VisualParameters }
		 * 
		 */
		public void setVisualParameters(GreenhouseAuto.Plant.VisualParameters value) {
			this.visualParameters = value;
		}

		/**
		 * Gets the value of the growingTips property.
		 * 
		 * @return possible object is {@link GreenhouseAuto.Plant.GrowingTips }
		 * 
		 */
		public GreenhouseAuto.Plant.GrowingTips getGrowingTips() {
			return growingTips;
		}

		/**
		 * Sets the value of the growingTips property.
		 * 
		 * @param value
		 *            allowed object is
		 *            {@link GreenhouseAuto.Plant.GrowingTips }
		 * 
		 */
		public void setGrowingTips(GreenhouseAuto.Plant.GrowingTips value) {
			this.growingTips = value;
		}

		/**
		 * Gets the value of the multiplying property.
		 * 
		 * @return possible object is {@link GreenhouseAuto.Plant.Multiplying }
		 * 
		 */
		public GreenhouseAuto.Plant.Multiplying getMultiplying() {
			return multiplying;
		}

		/**
		 * Sets the value of the multiplying property.
		 * 
		 * @param value
		 *            allowed object is
		 *            {@link GreenhouseAuto.Plant.Multiplying }
		 * 
		 */
		public void setMultiplying(GreenhouseAuto.Plant.Multiplying value) {
			this.multiplying = value;
		}

		/**
		 * <p>
		 * Java class for anonymous complex type.
		 * 
		 * <p>
		 * The following schema fragment specifies the expected content
		 * contained within this class.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;sequence>
		 *         &lt;element name="temperature">
		 *           &lt;complexType>
		 *             &lt;complexContent>
		 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                 &lt;group ref="{}set"/>
		 *                 &lt;attribute ref="{}unit"/>
		 *               &lt;/restriction>
		 *             &lt;/complexContent>
		 *           &lt;/complexType>
		 *         &lt;/element>
		 *         &lt;element name="watering">
		 *           &lt;complexType>
		 *             &lt;complexContent>
		 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                 &lt;group ref="{}set"/>
		 *                 &lt;attribute ref="{}unit"/>
		 *               &lt;/restriction>
		 *             &lt;/complexContent>
		 *           &lt;/complexType>
		 *         &lt;/element>
		 *       &lt;/sequence>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "temperature", "watering" })
		public static class GrowingTips {

			@XmlElement(required = true)
			protected GreenhouseAuto.Plant.GrowingTips.Temperature temperature;
			@XmlElement(required = true)
			protected GreenhouseAuto.Plant.GrowingTips.Watering watering;

			/**
			 * Gets the value of the temperature property.
			 * 
			 * @return possible object is
			 *         {@link GreenhouseAuto.Plant.GrowingTips.Temperature }
			 * 
			 */
			public GreenhouseAuto.Plant.GrowingTips.Temperature getTemperature() {
				return temperature;
			}

			/**
			 * Sets the value of the temperature property.
			 * 
			 * @param value
			 *            allowed object is
			 *            {@link GreenhouseAuto.Plant.GrowingTips.Temperature }
			 * 
			 */
			public void setTemperature(GreenhouseAuto.Plant.GrowingTips.Temperature value) {
				this.temperature = value;
			}

			/**
			 * Gets the value of the watering property.
			 * 
			 * @return possible object is
			 *         {@link GreenhouseAuto.Plant.GrowingTips.Watering }
			 * 
			 */
			public GreenhouseAuto.Plant.GrowingTips.Watering getWatering() {
				return watering;
			}

			/**
			 * Sets the value of the watering property.
			 * 
			 * @param value
			 *            allowed object is
			 *            {@link GreenhouseAuto.Plant.GrowingTips.Watering }
			 * 
			 */
			public void setWatering(GreenhouseAuto.Plant.GrowingTips.Watering value) {
				this.watering = value;
			}

			/**
			 * <p>
			 * Java class for anonymous complex type.
			 * 
			 * <p>
			 * The following schema fragment specifies the expected content
			 * contained within this class.
			 * 
			 * <pre>
			 * &lt;complexType>
			 *   &lt;complexContent>
			 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *       &lt;group ref="{}set"/>
			 *       &lt;attribute ref="{}unit"/>
			 *     &lt;/restriction>
			 *   &lt;/complexContent>
			 * &lt;/complexType>
			 * </pre>
			 * 
			 * 
			 */
			@XmlAccessorType(XmlAccessType.FIELD)
			@XmlType(name = "", propOrder = { "value" })
			public static class Temperature {

				@XmlElement(required = true)
				protected BigInteger value;
				@XmlAttribute(name = "unit")
				protected String unit;

				/**
				 * Gets the value of the value property.
				 * 
				 * @return possible object is {@link BigInteger }
				 * 
				 */
				public BigInteger getValue() {
					return value;
				}

				/**
				 * Sets the value of the value property.
				 * 
				 * @param value
				 *            allowed object is {@link BigInteger }
				 * 
				 */
				public void setValue(BigInteger value) {
					this.value = value;
				}

				/**
				 * Gets the value of the unit property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getUnit() {
					return unit;
				}

				/**
				 * Sets the value of the unit property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setUnit(String value) {
					this.unit = value;
				}

			}

			/**
			 * <p>
			 * Java class for anonymous complex type.
			 * 
			 * <p>
			 * The following schema fragment specifies the expected content
			 * contained within this class.
			 * 
			 * <pre>
			 * &lt;complexType>
			 *   &lt;complexContent>
			 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *       &lt;group ref="{}set"/>
			 *       &lt;attribute ref="{}unit"/>
			 *     &lt;/restriction>
			 *   &lt;/complexContent>
			 * &lt;/complexType>
			 * </pre>
			 * 
			 * 
			 */
			@XmlAccessorType(XmlAccessType.FIELD)
			@XmlType(name = "", propOrder = { "value" })
			public static class Watering {

				@XmlElement(required = true)
				protected BigInteger value;
				@XmlAttribute(name = "unit")
				protected String unit;

				/**
				 * Gets the value of the value property.
				 * 
				 * @return possible object is {@link BigInteger }
				 * 
				 */
				public BigInteger getValue() {
					return value;
				}

				/**
				 * Sets the value of the value property.
				 * 
				 * @param value
				 *            allowed object is {@link BigInteger }
				 * 
				 */
				public void setValue(BigInteger value) {
					this.value = value;
				}

				/**
				 * Gets the value of the unit property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getUnit() {
					return unit;
				}

				/**
				 * Sets the value of the unit property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setUnit(String value) {
					this.unit = value;
				}

			}

		}

		/**
		 * <p>
		 * Java class for anonymous complex type.
		 * 
		 * <p>
		 * The following schema fragment specifies the expected content
		 * contained within this class.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;sequence>
		 *         &lt;element name="reproduction">
		 *           &lt;simpleType>
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *               &lt;enumeration value="stalk"/>
		 *               &lt;enumeration value="seed"/>
		 *             &lt;/restriction>
		 *           &lt;/simpleType>
		 *         &lt;/element>
		 *       &lt;/sequence>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "reproduction" })
		public static class Multiplying {

			@XmlElement(required = true)
			protected String reproduction;

			/**
			 * Gets the value of the reproduction property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getReproduction() {
				return reproduction;
			}

			/**
			 * Sets the value of the reproduction property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setReproduction(String value) {
				this.reproduction = value;
			}

		}

		/**
		 * <p>
		 * Java class for anonymous complex type.
		 * 
		 * <p>
		 * The following schema fragment specifies the expected content
		 * contained within this class.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;sequence>
		 *         &lt;element name="size">
		 *           &lt;simpleType>
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
		 *               &lt;minInclusive value="0"/>
		 *               &lt;maxInclusive value="1000"/>
		 *             &lt;/restriction>
		 *           &lt;/simpleType>
		 *         &lt;/element>
		 *       &lt;/sequence>
		 *       &lt;attribute ref="{}color"/>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "size" })
		public static class VisualParameters {

			protected int size;
			@XmlAttribute(name = "color")
			protected String color;

			/**
			 * Gets the value of the size property.
			 * 
			 */
			public int getSize() {
				return size;
			}

			/**
			 * Sets the value of the size property.
			 * 
			 */
			public void setSize(int value) {
				this.size = value;
			}

			/**
			 * Gets the value of the color property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getColor() {
				return color;
			}

			/**
			 * Sets the value of the color property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setColor(String value) {
				this.color = value;
			}

		}

	}

}
