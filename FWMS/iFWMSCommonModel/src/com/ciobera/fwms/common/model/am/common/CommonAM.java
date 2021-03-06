package com.ciobera.fwms.common.model.am.common;

import java.util.Map;

import oracle.jbo.ApplicationModule;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Aug 12 19:10:12 IST 2017
// ---------------------------------------------------------------------
public interface CommonAM extends ApplicationModule {
    Map blockUser(String userId);

    Map clearWrongAttempt(String userId, String pc);

    Map findUserByLoginCredentials(String userId, String password);

    Map getUserWrongPasswordCount(String userId);

    Map logUserActivity(String userId, String pc, String screen, String type, String logMessage);

    Map logWrongAttempt(String userId, String pc);

    Map updateLoginCredentials(String userId, String password, String newPassword);
}

