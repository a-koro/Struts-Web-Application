package com.checkIn.strutsWebApplication.actions;

import com.checkIn.strutsWebApplication.beans.HelloForm;
import org.apache.struts.action.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloAction extends Action {
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        HelloForm helloForm = (HelloForm) form;
        ActionForward fw = mapping.getInputForward();

        if (helloForm != null && helloForm.getSurname().equals("Korovesis")) {
            fw = mapping.findForward("success");
        }
        else {
            ActionErrors errors = new ActionErrors();
            errors.add("", new ActionMessage("hello.msg.err"));
            saveErrors(request, errors);
        }
        return fw;
    }
}
