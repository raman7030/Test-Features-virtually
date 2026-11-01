package com.umeng.commonsdk.statistics.common;

import android.text.TextUtils;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Formatter;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class ULog {
    public static boolean DEBUG = false;
    public static final int LEVEL_DEBUG = 2;
    public static final int LEVEL_ERROR = 5;
    public static final int LEVEL_INFO = 3;
    public static final int LEVEL_VERBOSE = 1;
    public static final int LEVEL_WARN = 4;
    public static int LOG_MAXLENGTH = 2000;
    public static String TAG = "ULog";

    /* JADX INFO: renamed from: i */
    public static void m2988i(Locale locale, String str, Object... objArr) {
        try {
            m2984i(TAG, new Formatter(locale).format(str, objArr).toString(), (Throwable) null);
        } catch (Throwable th) {
            m2981e(th);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m2976d(Locale locale, String str, Object... objArr) {
        try {
            m2972d(TAG, new Formatter(locale).format(str, objArr).toString(), (Throwable) null);
        } catch (Throwable th) {
            m2981e(th);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m2982e(Locale locale, String str, Object... objArr) {
        try {
            m2978e(TAG, new Formatter(locale).format(str, objArr).toString(), (Throwable) null);
        } catch (Throwable th) {
            m2981e(th);
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m2994v(Locale locale, String str, Object... objArr) {
        try {
            m2990v(TAG, new Formatter(locale).format(str, objArr).toString(), (Throwable) null);
        } catch (Throwable th) {
            m2981e(th);
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m3000w(Locale locale, String str, Object... objArr) {
        try {
            m2996w(TAG, new Formatter(locale).format(str, objArr).toString(), (Throwable) null);
        } catch (Throwable th) {
            m2981e(th);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m2986i(String str, Object... objArr) {
        try {
            if (str.contains("%")) {
                m2984i(TAG, new Formatter().format(str, objArr).toString(), (Throwable) null);
            } else {
                m2984i(str, objArr != null ? (String) objArr[0] : "", (Throwable) null);
            }
        } catch (Throwable th) {
            m2981e(th);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m2974d(String str, Object... objArr) {
        try {
            if (str.contains("%")) {
                m2972d(TAG, new Formatter().format(str, objArr).toString(), (Throwable) null);
            } else {
                m2972d(str, objArr != null ? (String) objArr[0] : "", (Throwable) null);
            }
        } catch (Throwable th) {
            m2981e(th);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m2980e(String str, Object... objArr) {
        try {
            if (str.contains("%")) {
                m2978e(TAG, new Formatter().format(str, objArr).toString(), (Throwable) null);
            } else {
                m2978e(str, objArr != null ? (String) objArr[0] : "", (Throwable) null);
            }
        } catch (Throwable th) {
            m2981e(th);
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m2992v(String str, Object... objArr) {
        try {
            if (str.contains("%")) {
                m2990v(TAG, new Formatter().format(str, objArr).toString(), (Throwable) null);
            } else {
                m2990v(str, objArr != null ? (String) objArr[0] : "", (Throwable) null);
            }
        } catch (Throwable th) {
            m2981e(th);
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m2998w(String str, Object... objArr) {
        try {
            if (str.contains("%")) {
                m2996w(TAG, new Formatter().format(str, objArr).toString(), (Throwable) null);
            } else {
                m2996w(str, objArr != null ? (String) objArr[0] : "", (Throwable) null);
            }
        } catch (Throwable th) {
            m2981e(th);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m2987i(Throwable th) {
        m2984i(TAG, (String) null, th);
    }

    /* JADX INFO: renamed from: v */
    public static void m2993v(Throwable th) {
        m2990v(TAG, (String) null, th);
    }

    /* JADX INFO: renamed from: w */
    public static void m2999w(Throwable th) {
        m2996w(TAG, (String) null, th);
    }

    /* JADX INFO: renamed from: d */
    public static void m2975d(Throwable th) {
        m2972d(TAG, (String) null, th);
    }

    /* JADX INFO: renamed from: e */
    public static void m2981e(Throwable th) {
        m2978e(TAG, (String) null, th);
    }

    /* JADX INFO: renamed from: i */
    public static void m2985i(String str, Throwable th) {
        m2984i(TAG, str, th);
    }

    /* JADX INFO: renamed from: v */
    public static void m2991v(String str, Throwable th) {
        m2990v(TAG, str, th);
    }

    /* JADX INFO: renamed from: w */
    public static void m2997w(String str, Throwable th) {
        m2996w(TAG, str, th);
    }

    /* JADX INFO: renamed from: d */
    public static void m2973d(String str, Throwable th) {
        m2972d(TAG, str, th);
    }

    /* JADX INFO: renamed from: e */
    public static void m2979e(String str, Throwable th) {
        m2978e(TAG, str, th);
    }

    /* JADX INFO: renamed from: v */
    public static void m2989v(String str) {
        m2990v(TAG, str, (Throwable) null);
    }

    /* JADX INFO: renamed from: d */
    public static void m2971d(String str) {
        m2972d(TAG, str, (Throwable) null);
    }

    /* JADX INFO: renamed from: i */
    public static void m2983i(String str) {
        m2984i(TAG, str, (Throwable) null);
    }

    /* JADX INFO: renamed from: w */
    public static void m2995w(String str) {
        m2996w(TAG, str, (Throwable) null);
    }

    /* JADX INFO: renamed from: e */
    public static void m2977e(String str) {
        m2978e(TAG, str, (Throwable) null);
    }

    /* JADX INFO: renamed from: v */
    public static void m2990v(String str, String str2, Throwable th) {
        if (DEBUG) {
            print(1, str, str2, th);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m2972d(String str, String str2, Throwable th) {
        if (DEBUG) {
            print(2, str, str2, th);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m2984i(String str, String str2, Throwable th) {
        if (DEBUG) {
            print(3, str, str2, th);
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m2996w(String str, String str2, Throwable th) {
        if (DEBUG) {
            print(4, str, str2, th);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m2978e(String str, String str2, Throwable th) {
        if (DEBUG) {
            print(5, str, str2, th);
        }
    }

    public static void print(int i, String str, String str2, Throwable th) {
        if (!TextUtils.isEmpty(str2)) {
            int length = str2.length();
            int i2 = LOG_MAXLENGTH;
            int i3 = 0;
            int i4 = 0;
            while (i3 < 100) {
                if (length <= i2) {
                    if (i != 1 && i != 2 && i != 3 && i != 4 && i != 5) {
                        break;
                    }
                    str2.substring(i4, length);
                    break;
                }
                if (i == 1) {
                    str2.substring(i4, i2);
                } else if (i == 2) {
                    str2.substring(i4, i2);
                } else if (i == 3) {
                    str2.substring(i4, i2);
                } else if (i == 4) {
                    str2.substring(i4, i2);
                } else if (i == 5) {
                    str2.substring(i4, i2);
                }
                i3++;
                i4 = i2;
                i2 = LOG_MAXLENGTH + i2;
            }
        }
        if (th != null) {
            TextUtils.isEmpty(getStackTrace(th));
        }
    }

    public static String getStackTrace(Throwable th) {
        PrintWriter printWriter;
        StringWriter stringWriter = null;
        PrintWriter printWriter2 = null;
        try {
            StringWriter stringWriter2 = new StringWriter();
            try {
                PrintWriter printWriter3 = new PrintWriter(stringWriter2);
                try {
                    th.printStackTrace(printWriter3);
                    printWriter3.flush();
                    stringWriter2.flush();
                    String string = stringWriter2.toString();
                    try {
                        stringWriter2.close();
                    } catch (Throwable unused) {
                    }
                    printWriter3.close();
                    return string;
                } catch (Throwable unused2) {
                    printWriter2 = printWriter3;
                    printWriter = printWriter2;
                    stringWriter = stringWriter2;
                    if (stringWriter != null) {
                        try {
                            stringWriter.close();
                        } catch (Throwable unused3) {
                        }
                    }
                    if (printWriter != null) {
                        printWriter.close();
                    }
                    return "";
                }
            } catch (Throwable unused4) {
            }
        } catch (Throwable unused5) {
            printWriter = null;
        }
    }
}
