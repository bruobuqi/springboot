
package com.example.ceshisuan.ws_demo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CopyErrorCode�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="CopyErrorCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Success"/>
 *     &lt;enumeration value="DestinationInvalid"/>
 *     &lt;enumeration value="DestinationMWS"/>
 *     &lt;enumeration value="SourceInvalid"/>
 *     &lt;enumeration value="DestinationCheckedOut"/>
 *     &lt;enumeration value="InvalidUrl"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CopyErrorCode")
@XmlEnum
public enum CopyErrorCode {

    @XmlEnumValue("Success")
    SUCCESS("Success"),
    @XmlEnumValue("DestinationInvalid")
    DESTINATION_INVALID("DestinationInvalid"),
    @XmlEnumValue("DestinationMWS")
    DESTINATION_MWS("DestinationMWS"),
    @XmlEnumValue("SourceInvalid")
    SOURCE_INVALID("SourceInvalid"),
    @XmlEnumValue("DestinationCheckedOut")
    DESTINATION_CHECKED_OUT("DestinationCheckedOut"),
    @XmlEnumValue("InvalidUrl")
    INVALID_URL("InvalidUrl"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    CopyErrorCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CopyErrorCode fromValue(String v) {
        for (CopyErrorCode c: CopyErrorCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
