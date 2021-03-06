/*****************************************************************************************************
 ** Program Name            - iWMSErrorHandler.java
 ** Program Description     - Error Handler class
 ** Date written            -
 ** Author                  - Umesh Agarwal
 ** Additional Information  -
 ** Copyright notice        -
 ******************************************************************************************************/

package com.ciobera.fwms.common.util.security;


import com.ciobera.fwms.common.util.utils.common.ADFUtil;

import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCErrorHandlerImpl;
import oracle.adf.model.BindingContext;

import oracle.jbo.AttrSetValException;

public class iFWMSErrorHandler extends DCErrorHandlerImpl {
    public iFWMSErrorHandler() {
        super(true);
    }

    public void reportException(DCBindingContainer dCBindingContainer,
                                Exception exception) {

        super.reportException(dCBindingContainer, exception);

    }

    public String getDisplayMessage(BindingContext bindingContext,
                                    Exception exception) {
        if (exception instanceof iFWMSJboException)
            return super.getDisplayMessage(bindingContext, exception);
        else if (exception instanceof AttrSetValException)
            return super.getDisplayMessage(bindingContext, exception);
        else
            return ADFUtil.getModelBundleMsg("Generic_Model_Err");
    }
}

