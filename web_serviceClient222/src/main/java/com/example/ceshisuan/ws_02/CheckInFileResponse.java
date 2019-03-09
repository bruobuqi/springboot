
package com.example.ceshisuan.ws_02;

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
 *         &lt;element name="CheckInFileResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "checkInFileResult"
})
@XmlRootElement(name = "CheckInFileResponse")
public class CheckInFileResponse {

    @XmlElement(name = "CheckInFileResult")
    protected boolean checkInFileResult;

    /**
     * ��ȡcheckInFileResult���Ե�ֵ��
     * 
     */
    public boolean isCheckInFileResult() {
        return checkInFileResult;
    }

    /**
     * ����checkInFileResult���Ե�ֵ��
     * 
     */
    public void setCheckInFileResult(boolean value) {
        this.checkInFileResult = value;
    }

}
