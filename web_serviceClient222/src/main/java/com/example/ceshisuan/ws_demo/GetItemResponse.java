
package com.example.ceshisuan.ws_demo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
     * ��ȡgetItemResult���Ե�ֵ��
     * 
     */
    public long getGetItemResult() {
        return getItemResult;
    }

    /**
     * ����getItemResult���Ե�ֵ��
     * 
     */
    public void setGetItemResult(long value) {
        this.getItemResult = value;
    }

    /**
     * ��ȡfields���Ե�ֵ��
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
     * ����fields���Ե�ֵ��
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
     * ��ȡstream���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getStream() {
        return stream;
    }

    /**
     * ����stream���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setStream(byte[] value) {
        this.stream = value;
    }

}
