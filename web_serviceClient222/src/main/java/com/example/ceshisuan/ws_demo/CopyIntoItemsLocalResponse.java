
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
 *         &lt;element name="CopyIntoItemsLocalResult" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
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
    "copyIntoItemsLocalResult",
    "results"
})
@XmlRootElement(name = "CopyIntoItemsLocalResponse")
public class CopyIntoItemsLocalResponse {

    @XmlElement(name = "CopyIntoItemsLocalResult")
    @XmlSchemaType(name = "unsignedInt")
    protected long copyIntoItemsLocalResult;
    @XmlElement(name = "Results")
    protected CopyResultCollection results;

    /**
     * 获取copyIntoItemsLocalResult属性的值。
     * 
     */
    public long getCopyIntoItemsLocalResult() {
        return copyIntoItemsLocalResult;
    }

    /**
     * 设置copyIntoItemsLocalResult属性的值。
     * 
     */
    public void setCopyIntoItemsLocalResult(long value) {
        this.copyIntoItemsLocalResult = value;
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
