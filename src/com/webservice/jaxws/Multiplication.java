
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

@XmlRootElement(name = "multiplication", namespace = "http://webservice.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "multiplication", namespace = "http://webservice.com/", propOrder = {"arg0", "arg1"})

public class Multiplication {

    @XmlElement(name = "arg0")
    private int arg0;
    @XmlElement(name = "arg1")
    private int arg1;

    public int getArg0() {
        return this.arg0;
    }

    public void setArg0(int newArg0)  {
        this.arg0 = newArg0;
    }

    public int getArg1() {
        return this.arg1;
    }

    public void setArg1(int newArg1)  {
        this.arg1 = newArg1;
    }

}

