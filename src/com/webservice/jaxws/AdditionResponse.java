
package com.webservice.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 2.7.18
 * Sat Jul 22 16:18:43 CDT 2017
 * Generated source version: 2.7.18
 */

@XmlRootElement(name = "additionResponse", namespace = "http://webservice.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "additionResponse", namespace = "http://webservice.com/")

public class AdditionResponse {

    @XmlElement(name = "return")
    private int _return;

    public int getReturn() {
        return this._return;
    }

    public void setReturn(int new_return)  {
        this._return = new_return;
    }

}

