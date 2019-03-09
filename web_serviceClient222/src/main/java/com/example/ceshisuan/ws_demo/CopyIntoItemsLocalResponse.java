
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
     * ��ȡcopyIntoItemsLocalResult���Ե�ֵ��
     * 
     */
    public long getCopyIntoItemsLocalResult() {
        return copyIntoItemsLocalResult;
    }

    /**
     * ����copyIntoItemsLocalResult���Ե�ֵ��
     * 
     */
    public void setCopyIntoItemsLocalResult(long value) {
        this.copyIntoItemsLocalResult = value;
    }

    /**
     * ��ȡresults���Ե�ֵ��
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
     * ����results���Ե�ֵ��
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
