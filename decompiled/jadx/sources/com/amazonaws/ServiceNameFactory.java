package com.amazonaws;

import com.amazonaws.internal.config.HttpClientConfig;
import com.amazonaws.internal.config.InternalConfig;

/* JADX INFO: loaded from: classes.dex */
public enum ServiceNameFactory {
    ;

    /* JADX INFO: renamed from: ֫ */
    public static String m1367(String str) {
        HttpClientConfig httpClientConfigM1452 = InternalConfig.Factory.m1455().m1452(str);
        if (httpClientConfigM1452 == null) {
            return null;
        }
        return httpClientConfigM1452.m1451();
    }
}
