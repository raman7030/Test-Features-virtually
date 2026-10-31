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

    public static void e(String str, String str2) {
        if (shouldOutput()) {
            warpperMsg(str2, false);
        }
    }

    public static void w(String str, String str2) {
        if (shouldOutput()) {
            warpperMsg(str2, false);
        }
    }

    public static void i(String str, String str2) {
        if (shouldOutput()) {
            warpperMsg(str2, false);
        }
    }

    public static void d(String str, String str2) {
        if (shouldOutput()) {
            warpperMsg(str2, false);
        }
    }

    public static void v(String str, String str2) {
        if (shouldOutput()) {
            warpperMsg(str2, false);
        }
    }

    public static void se(String str, String str2) {
        if (shouldOutput()) {
            warpperMsg(str2, true);
        }
    }

    public static void sw(String str, String str2) {
        if (shouldOutput()) {
            warpperMsg(str2, true);
        }
    }

    public static void si(String str, String str2) {
        if (shouldOutput()) {
            warpperMsg(str2, true);
        }
    }

    public static void sd(String str, String str2) {
        if (shouldOutput()) {
            warpperMsg(str2, true);
        }
    }

    public static void sv(String str, String str2) {
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
