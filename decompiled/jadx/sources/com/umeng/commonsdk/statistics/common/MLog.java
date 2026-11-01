package com.umeng.commonsdk.statistics.common;

import android.text.TextUtils;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Formatter;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class MLog {
    public static boolean DEBUG = false;
    public static final int LEVEL_DEBUG = 2;
    public static final int LEVEL_ERROR = 5;
    public static final int LEVEL_INFO = 3;
    public static final int LEVEL_VERBOSE = 1;
    public static final int LEVEL_WARN = 4;
    public static int LOG_MAXLENGTH = 2000;
    public static String TAG = "MobclickAgent";

    /* JADX INFO: renamed from: i */
    public static void m2958i(Locale locale, String str, Object... objArr) {
        try {
            m2954i(TAG, new Formatter(locale).format(str, objArr).toString(), (Throwable) null);
        } catch (Throwable th) {
            m2951e(th);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m2946d(Locale locale, String str, Object... objArr) {
        try {
            m2942d(TAG, new Formatter(locale).format(str, objArr).toString(), (Throwable) null);
        } catch (Throwable th) {
            m2951e(th);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m2952e(Locale locale, String str, Object... objArr) {
        try {
            m2948e(TAG, new Formatter(locale).format(str, objArr).toString(), (Throwable) null);
        } catch (Throwable th) {
            m2951e(th);
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m2964v(Locale locale, String str, Object... objArr) {
        try {
            m2960v(TAG, new Formatter(locale).format(str, objArr).toString(), (Throwable) null);
        } catch (Throwable th) {
            m2951e(th);
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m2970w(Locale locale, String str, Object... objArr) {
        try {
            m2966w(TAG, new Formatter(locale).format(str, objArr).toString(), (Throwable) null);
        } catch (Throwable th) {
            m2951e(th);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m2956i(String str, Object... objArr) {
        try {
            if (str.contains("%")) {
                m2954i(TAG, new Formatter().format(str, objArr).toString(), (Throwable) null);
            } else {
                m2954i(str, objArr != null ? (String) objArr[0] : "", (Throwable) null);
            }
        } catch (Throwable th) {
            m2951e(th);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m2944d(String str, Object... objArr) {
        try {
            if (str.contains("%")) {
                m2942d(TAG, new Formatter().format(str, objArr).toString(), (Throwable) null);
            } else {
                m2942d(str, objArr != null ? (String) objArr[0] : "", (Throwable) null);
            }
        } catch (Throwable th) {
            m2951e(th);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m2950e(String str, Object... objArr) {
        try {
            if (str.contains("%")) {
                m2948e(TAG, new Formatter().format(str, objArr).toString(), (Throwable) null);
            } else {
                m2948e(str, objArr != null ? (String) objArr[0] : "", (Throwable) null);
            }
        } catch (Throwable th) {
            m2951e(th);
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m2962v(String str, Object... objArr) {
        try {
            if (str.contains("%")) {
                m2960v(TAG, new Formatter().format(str, objArr).toString(), (Throwable) null);
            } else {
                m2960v(str, objArr != null ? (String) objArr[0] : "", (Throwable) null);
            }
        } catch (Throwable th) {
            m2951e(th);
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m2968w(String str, Object... objArr) {
        try {
            if (str.contains("%")) {
                m2966w(TAG, new Formatter().format(str, objArr).toString(), (Throwable) null);
            } else {
                m2966w(str, objArr != null ? (String) objArr[0] : "", (Throwable) null);
            }
        } catch (Throwable th) {
            m2951e(th);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m2957i(Throwable th) {
        m2954i(TAG, (String) null, th);
    }

    /* JADX INFO: renamed from: v */
    public static void m2963v(Throwable th) {
        m2960v(TAG, (String) null, th);
    }

    /* JADX INFO: renamed from: w */
    public static void m2969w(Throwable th) {
        m2966w(TAG, (String) null, th);
    }

    /* JADX INFO: renamed from: d */
    public static void m2945d(Throwable th) {
        m2942d(TAG, (String) null, th);
    }

    /* JADX INFO: renamed from: e */
    public static void m2951e(Throwable th) {
        m2948e(TAG, (String) null, th);
    }

    /* JADX INFO: renamed from: i */
    public static void m2955i(String str, Throwable th) {
        m2954i(TAG, str, th);
    }

    /* JADX INFO: renamed from: v */
    public static void m2961v(String str, Throwable th) {
        m2960v(TAG, str, th);
    }

    /* JADX INFO: renamed from: w */
    public static void m2967w(String str, Throwable th) {
        m2966w(TAG, str, th);
    }

    /* JADX INFO: renamed from: d */
    public static void m2943d(String str, Throwable th) {
        m2942d(TAG, str, th);
    }

    /* JADX INFO: renamed from: e */
    public static void m2949e(String str, Throwable th) {
        m2948e(TAG, str, th);
    }

    /* JADX INFO: renamed from: v */
    public static void m2959v(String str) {
        m2960v(TAG, str, (Throwable) null);
    }

    /* JADX INFO: renamed from: d */
    public static void m2941d(String str) {
        m2942d(TAG, str, (Throwable) null);
    }

    /* JADX INFO: renamed from: i */
    public static void m2953i(String str) {
        m2954i(TAG, str, (Throwable) null);
    }

    /* JADX INFO: renamed from: w */
    public static void m2965w(String str) {
        m2966w(TAG, str, (Throwable) null);
    }

    /* JADX INFO: renamed from: e */
    public static void m2947e(String str) {
        m2948e(TAG, str, (Throwable) null);
    }

    /* JADX INFO: renamed from: v */
    public static void m2960v(String str, String str2, Throwable th) {
        if (DEBUG) {
            print(1, str, str2, th);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m2942d(String str, String str2, Throwable th) {
        if (DEBUG) {
            print(2, str, str2, th);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m2954i(String str, String str2, Throwable th) {
        if (DEBUG) {
            print(3, str, str2, th);
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m2966w(String str, String str2, Throwable th) {
        if (DEBUG) {
            print(4, str, str2, th);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m2948e(String str, String str2, Throwable th) {
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
