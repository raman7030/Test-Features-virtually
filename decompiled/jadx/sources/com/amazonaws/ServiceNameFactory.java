package com.amazonaws;

import com.amazonaws.internal.config.HttpClientConfig;
import com.amazonaws.internal.config.InternalConfig;

/* JADX INFO: loaded from: classes.dex */
public enum ServiceNameFactory {
    ;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m201(String str) {
        HttpClientConfig httpClientConfigM286 = InternalConfig.Factory.m289().m286(str);
        if (httpClientConfigM286 == null) {
            return null;
        }
        return httpClientConfigM286.m285();
    }
}
