package com.amazonaws.services.s3.model;

import l.C4860;

/* JADX INFO: loaded from: classes.dex */
public class CORSRule {

    public enum AllowedMethods {
        GET("GET"),
        PUT("PUT"),
        HEAD("HEAD"),
        POST("POST"),
        DELETE("DELETE");


        /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
        public final String f556;

        AllowedMethods(String str) {
            this.f556 = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f556;
        }

        /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
        public static AllowedMethods m538(String str) {
            for (AllowedMethods allowedMethods : values()) {
                String string = allowedMethods.toString();
                if ((string == null && str == null) || (string != null && string.equals(str))) {
                    return allowedMethods;
                }
            }
            throw new IllegalArgumentException(C4860.m14172("Cannot create enum from ", str, " value!"));
        }
    }
}
