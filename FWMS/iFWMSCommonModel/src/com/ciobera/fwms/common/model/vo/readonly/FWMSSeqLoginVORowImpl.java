package com.ciobera.fwms.common.model.vo.readonly;

import java.math.BigDecimal;

import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Aug 10 10:22:39 IST 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class FWMSSeqLoginVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        Nextval;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        protected int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        protected static final int firstIndex() {
            return firstIndex;
        }

        protected static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        protected static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }
    public static final int NEXTVAL = AttributesEnum.Nextval.index();

    /**
     * This is the default constructor (do not remove).
     */
    public FWMSSeqLoginVORowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute Nextval.
     * @return the Nextval
     */
    public BigDecimal getNextval() {
        return (BigDecimal) getAttributeInternal(NEXTVAL);
    }
}

