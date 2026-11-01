package com.umeng.commonsdk.debug;

import com.umeng.commonsdk.utils.UMUtils;

/* JADX INFO: loaded from: classes.dex */
public class UMRTLog {
    public static final String RTLOG_ENABLE = "1";
    public static final String RTLOG_PROP = "debug.umeng.rtlog";
    public static final String RTLOG_TAG = "MobclickRT";

    public static boolean shouldOutput() {
        return "1".equals(UMUtils.getSystemProperty(RTLOG_PROP, "0"));
    }

    /* JADX INFO: renamed from: e */
    public static void m2756e(String str, String str2) {
        if (shouldOutput()) {
            warpperMsg(str2, false);
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m2764w(String str, String str2) {
        if (shouldOutput()) {
            warpperMsg(str2, false);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m2757i(String str, String str2) {
        if (shouldOutput()) {
            warpperMsg(str2, false);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m2755d(String str, String str2) {
        if (shouldOutput()) {
            warpperMsg(str2, false);
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m2763v(String str, String str2) {
        if (shouldOutput()) {
            warpperMsg(str2, false);
        }
    }

    /* JADX INFO: renamed from: se */
    public static void m2759se(String str, String str2) {
        if (shouldOutput()) {
            warpperMsg(str2, true);
        }
    }

    /* JADX INFO: renamed from: sw */
    public static void m2762sw(String str, String str2) {
        if (shouldOutput()) {
            warpperMsg(str2, true);
        }
    }

    /* JADX INFO: renamed from: si */
    public static void m2760si(String str, String str2) {
        if (shouldOutput()) {
            warpperMsg(str2, true);
        }
    }

    /* JADX INFO: renamed from: sd */
    public static void m2758sd(String str, String str2) {
        if (shouldOutput()) {
            warpperMsg(str2, true);
        }
    }

    /* JADX INFO: renamed from: sv */
    public static void m2761sv(String str, String str2) {
        if (shouldOutput()) {
            warpperMsg(str2, true);
        }
    }

    public static String warpperMsg(String str, boolean z) {
        StringBuffer stringBuffer;
        if (!z) {
            return str;
        }
        try {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            if (stackTrace.length >= 3) {
                String fileName = stackTrace[2].getFileName();
                String methodName = stackTrace[2].getMethodName();
                int lineNumber = stackTrace[2].getLineNumber();
                stringBuffer = new StringBuffer();
                stringBuffer.append("<");
                stringBuffer.append(fileName);
                stringBuffer.append(":");
                stringBuffer.append(methodName);
                stringBuffer.append(":");
                stringBuffer.append(lineNumber);
                stringBuffer.append("> ");
                stringBuffer.append(str);
            } else {
                stringBuffer = null;
            }
            return stringBuffer.toString();
        } catch (Throwable unused) {
            return str;
        }
    }
}
