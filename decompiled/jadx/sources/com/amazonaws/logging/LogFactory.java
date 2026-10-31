package com.amazonaws.logging;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class LogFactory {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f226 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final HashMap f227 = new HashMap();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static synchronized Log m302(Class cls) {
        String simpleName;
        simpleName = cls.getSimpleName();
        if (simpleName.length() > 23) {
            m303("LogFactory").mo300("Truncating log tag length as it exceed 23, the limit imposed by Android on certain API Levels");
            simpleName = simpleName.substring(0, 23);
        }
        return m303(simpleName);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static synchronized Log m303(String str) {
        Log androidLog;
        int i = 0;
        if (str.length() > 23) {
            m303("LogFactory").mo300("Truncating log tag length as it exceed 23, the limit imposed by Android on certain API Levels");
            str = str.substring(0, 23);
        }
        Log log = (Log) f227.get(str);
        if (log != null) {
            return log;
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        int length = stackTrace.length;
        while (true) {
            if (i < length) {
                if (stackTrace[i].getClassName().startsWith("org.junit.")) {
                    androidLog = new ConsoleLog(str);
                    break;
                }
                i++;
            } else {
                androidLog = new AndroidLog(str);
                break;
            }
        }
        f227.put(str, androidLog);
        return androidLog;
    }

    public enum Level {
        ALL(Integer.MIN_VALUE),
        TRACE(0),
        DEBUG(1),
        INFO(2),
        WARN(3),
        ERROR(4),
        OFF(Integer.MAX_VALUE);


        /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
        public final int f236;

        public int getValue() {
            return this.f236;
        }

        Level(int i) {
            this.f236 = i;
        }
    }
}
