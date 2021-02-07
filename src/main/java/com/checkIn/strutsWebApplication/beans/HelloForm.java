package com.checkIn.strutsWebApplication.beans;

import org.apache.struts.action.ActionForm;

public class HelloForm extends ActionForm {
    private String surname;
    private String PNR;

    public HelloForm() {
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPNR() {
        return PNR;
    }

    public void setPNR(String PNR) {
        this.PNR = PNR;
    }
}
