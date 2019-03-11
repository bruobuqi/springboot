
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
 *         &lt;element name="GetItemResult" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="Fields" type="{http://schemas.microsoft.com/sharepoint/soap/}FieldInformationCollection" minOccurs="0"/>
 *         &lt;element name="Stream" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
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
    "getItemResult",
    "fields",
    "stream"
})
@XmlRootElement(name = "GetItemResponse")
public class GetItemResponse {

    @XmlElement(name = "GetItemResult")
    @XmlSchemaType(name = "unsignedInt")
    protected long getItemResult;
    @XmlElement(name = "Fields")
    protected FieldInformationCollection fields;
    @XmlElement(name = "Stream")
    protected byte[] stream;

    /**
     * 获取getItemResult属性的值。
     * 
     */
    public long getGetItemResult() {
        return getItemResult;
    }

    /**
     * 设置getItemResult属性的值。
     * 
     */
    public void setGetItemResult(long value) {
        this.getItemResult = value;
    }

    /**
     * 获取fields属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FieldInformationCollection }
     *     
     */
    public FieldInformationCollection getFields() {
        return fields;
    }

    /**
     * 设置fields属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInformationCollection }
     *     
     */
    public void setFields(FieldInformationCollection value) {
        this.fields = value;
    }

    /**
     * 获取stream属性的值。
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getStream() {
        return stream;
    }

    /**
     * 设置stream属性的值。
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setStream(byte[] value) {
        this.stream = value;
    }

}
