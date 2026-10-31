package com.umeng.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.utils.UMUtils;

/* JADX INFO: compiled from: NBKR */
/* JADX INFO: loaded from: classes.dex */
public class a {
    public static String a = null;
    public static final String b = "umeng+";
    public static final String c = "ek__id";
    public static final String d = "ek_key";
    public static String e = "";
    public static final String f = "umeng_subprocess_info";
    public static String g = "";
    public static a h;

    public static a a() {
        if (h == null) {
            synchronized (a.class) {
                if (h == null) {
                    h = new a();
                }
            }
        }
        return h;
    }

    private String c(String str) {
        String string = "";
        try {
            String strSubstring = str.substring(1, 9);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < strSubstring.length(); i++) {
                char cCharAt = strSubstring.charAt(i);
                if (Character.isDigit(cCharAt)) {
                    if (Integer.parseInt(Character.toString(cCharAt)) == 0) {
                        sb.append(0);
                    } else {
                        sb.append(10 - Integer.parseInt(Character.toString(cCharAt)));
                    }
                } else {
                    sb.append(cCharAt);
                }
            }
            string = sb.toString();
            return string + new StringBuilder(string).reverse().toString();
        } catch (Throwable unused) {
            return string;
        }
    }

    public void a(Context context) {
        try {
            if (TextUtils.isEmpty(a)) {
                String multiProcessSP = UMUtils.getMultiProcessSP(context, "ek__id");
                if (!TextUtils.isEmpty(multiProcessSP)) {
                    e = c(multiProcessSP);
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>>> primaryKey: " + e);
                }
                SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(f, 0);
                if (sharedPreferences != null) {
                    g = sharedPreferences.getString("ek__id", null);
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 子进程备份秘钥：主进程key: " + g);
                }
                a = c(UMUtils.genId());
                UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>>> 正式秘钥：key: " + a);
            }
        } catch (Throwable unused) {
        }
    }

    public String a(String str) {
        try {
            return TextUtils.isEmpty(a) ? str : Base64.encodeToString(DataHelper.encrypt(str.getBytes(), a.getBytes()), 0);
        } catch (Exception unused) {
            return null;
        }
    }

    public String b(String str) {
        try {
            return TextUtils.isEmpty(a) ? str : new String(DataHelper.decrypt(Base64.decode(str.getBytes(), 0), a.getBytes()));
        } catch (Exception unused) {
            UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 子进程事件数据解密失败!");
            String str2 = null;
            if (TextUtils.isEmpty(e)) {
                return null;
            }
            UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 子进程事件数据解密失败，换老秘钥重试");
            try {
                String str3 = new String(DataHelper.decrypt(Base64.decode(str.getBytes(), 0), e.getBytes()));
                try {
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 子进程事件数据解密失败，换老秘钥重试成功。");
                    return str3;
                } catch (Exception unused2) {
                    str2 = str3;
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 子进程事件数据解密失败，换老秘钥重试失败。换子进程备份key重试。");
                    try {
                        String str4 = new String(DataHelper.decrypt(Base64.decode(str.getBytes(), 0), g.getBytes()));
                        try {
                            UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 子进程事件数据解密失败，子进程备份key重试成功。");
                            return str4;
                        } catch (Throwable unused3) {
                            str2 = str4;
                            UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 子进程事件数据解密失败，子进程备份key重试失败。");
                            return str2;
                        }
                    } catch (Throwable unused4) {
                    }
                }
            } catch (Exception unused5) {
            }
        }
    }
}
