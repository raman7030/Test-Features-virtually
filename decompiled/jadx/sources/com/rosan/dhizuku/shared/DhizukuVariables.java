package com.rosan.dhizuku.shared;

import p067l.C12826;
import p067l.C17588;

/* JADX INFO: loaded from: classes.dex */
public class DhizukuVariables {
    public static final String BINDER_DESCRIPTOR = "com.rosan.dhizuku.server";
    public static final String EXTRA_CLIENT = "client";
    public static final String OFFICIAL_PACKAGE_NAME = "com.rosan.dhizuku";
    public static final String PARAM_CLIENT_REQUEST_PERMISSION_BINDER = "request_permission_binder";
    public static final String PARAM_CLIENT_UID = "uid";
    public static final String PARAM_COMPONENT = "component";
    public static final String PARAM_DHIZUKU_BINDER = "dhizuku_binder";
    public static final String PERMISSION_API = "com.rosan.dhizuku.permission.API";
    public static final String PROVIDER_METHOD_CLIENT = "client";
    public static final int TRANSACT_CODE_REMOTE_BINDER = 11;

    public static String getProviderAuthorityName(String str) {
        return C12826.equals(str, OFFICIAL_PACKAGE_NAME) ? "com.rosan.dhizuku.server.provider" : C17588.m40053(str, ".dhizuku_server.provider");
    }

    public static String getActionRequestPermission(String str) {
        return C12826.equals(str, OFFICIAL_PACKAGE_NAME) ? "com.rosan.dhizuku.action.request.permission" : C17588.m40053(str, ".action.REQUEST_DHIZUKU_PERMISSION");
    }
}
