package com.amazonaws.services.p061s3.model;

import p067l.C6988;

/* JADX INFO: loaded from: classes.dex */
public class CORSRule {

    public enum AllowedMethods {
        GET("GET"),
        PUT("PUT"),
        HEAD("HEAD"),
        POST("POST"),
        DELETE("DELETE");


        /* JADX INFO: renamed from: ᩸ */
        public final String f1716;

        AllowedMethods(String str) {
            this.f1716 = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f1716;
        }

        /* JADX INFO: renamed from: ֫ */
        public static AllowedMethods m1704(String str) {
            for (AllowedMethods allowedMethods : values()) {
                String string = allowedMethods.toString();
                if ((string == null && str == null) || (string != null && string.equals(str))) {
                    return allowedMethods;
                }
            }
            throw new IllegalArgumentException(C6988.m16053("Cannot create enum from ", str, " value!"));
        }
    }
}
