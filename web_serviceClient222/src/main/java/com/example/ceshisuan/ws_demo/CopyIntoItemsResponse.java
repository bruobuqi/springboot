
package com.example.ceshisuan.ws_demo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="CopyIntoItemsResult" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="Results" type="{http://schemas.microsoft.com/sharepoint/soap/}CopyResultCollection" minOccurs="0"/>
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
    "copyIntoItemsResult",
    "results"
})
@XmlRootElement(name = "CopyIntoItemsResponse")
public class CopyIntoItemsResponse {

    @XmlElement(name = "CopyIntoItemsResult")
    @XmlSchemaType(name = "unsignedInt")
    protected long copyIntoItemsResult;
    @XmlElement(name = "Results")
    protected CopyResultCollection results;

    /**
     * 获取copyIntoItemsResult属性的值。
     * 
     */
    public long getCopyIntoItemsResult() {
        return copyIntoItemsResult;
    }

    /**
     * 设置copyIntoItemsResult属性的值。
     * 
     */
    public void setCopyIntoItemsResult(long value) {
        this.copyIntoItemsResult = value;
    }

    /**
     * 获取results属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CopyResultCollection }
     *     
     */
    public CopyResultCollection getResults() {
        return results;
    }

    /**
     * 设置results属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CopyResultCollection }
     *     
     */
    public void setResults(CopyResultCollection value) {
        this.results = value;
    }

}
