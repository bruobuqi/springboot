
package com.example.ceshisuan.ws_demo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡsourceUrl���Ե�ֵ��
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
     * ����sourceUrl���Ե�ֵ��
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
     * ��ȡdestinationUrls���Ե�ֵ��
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
     * ����destinationUrls���Ե�ֵ��
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
