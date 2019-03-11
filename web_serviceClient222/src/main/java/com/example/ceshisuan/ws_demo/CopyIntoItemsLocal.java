
package com.example.ceshisuan.ws_demo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SourceUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DestinationUrls" type="{http://schemas.microsoft.com/sharepoint/soap/}DestinationUrlCollection" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sourceUrl",
    "destinationUrls"
})
@XmlRootElement(name = "CopyIntoItemsLocal")
public class CopyIntoItemsLocal {

    @XmlElement(name = "SourceUrl")
    protected String sourceUrl;
    @XmlElement(name = "DestinationUrls")
    protected DestinationUrlCollection destinationUrls;

    /**
     * 获取sourceUrl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceUrl() {
        return sourceUrl;
    }

    /**
     * 设置sourceUrl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceUrl(String value) {
        this.sourceUrl = value;
    }

    /**
     * 获取destinationUrls属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DestinationUrlCollection }
     *     
     */
    public DestinationUrlCollection getDestinationUrls() {
        return destinationUrls;
    }

    /**
     * 设置destinationUrls属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DestinationUrlCollection }
     *     
     */
    public void setDestinationUrls(DestinationUrlCollection value) {
        this.destinationUrls = value;
    }

}
