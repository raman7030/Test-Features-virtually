package com.umeng.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.utils.UMUtils;

/* JADX INFO: renamed from: com.umeng.common.a */
/* JADX INFO: compiled from: NBKR */
/* JADX INFO: loaded from: classes.dex */
public class C0743a {

    /* JADX INFO: renamed from: a */
    public static String f3020a = null;

    /* JADX INFO: renamed from: b */
    public static final String f3021b = "umeng+";

    /* JADX INFO: renamed from: c */
    public static final String f3022c = "ek__id";

    /* JADX INFO: renamed from: d */
    public static final String f3023d = "ek_key";

    /* JADX INFO: renamed from: e */
    public static String f3024e = "";

    /* JADX INFO: renamed from: f */
    public static final String f3025f = "umeng_subprocess_info";

    /* JADX INFO: renamed from: g */
    public static String f3026g = "";

    /* JADX INFO: renamed from: h */
    public static C0743a f3027h;

    /* JADX INFO: renamed from: a */
    public static C0743a m2698a() {
        if (f3027h == null) {
            synchronized (C0743a.class) {
                if (f3027h == null) {
                    f3027h = new C0743a();
                }
            }
        }
        return f3027h;
    }

    /* JADX INFO: renamed from: c */
    private String m2699c(String str) {
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

    /* JADX INFO: renamed from: a */
    public void m2701a(Context context) {
        try {
            if (TextUtils.isEmpty(f3020a)) {
                String multiProcessSP = UMUtils.getMultiProcessSP(context, "ek__id");
                if (!TextUtils.isEmpty(multiProcessSP)) {
                    f3024e = m2699c(multiProcessSP);
                    UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>>> primaryKey: " + f3024e);
                }
                SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(f3025f, 0);
                if (sharedPreferences != null) {
                    f3026g = sharedPreferences.getString("ek__id", null);
                    UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>> 子进程备份秘钥：主进程key: " + f3026g);
                }
                f3020a = m2699c(UMUtils.genId());
                UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>>> 正式秘钥：key: " + f3020a);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public String m2700a(String str) {
        try {
            return TextUtils.isEmpty(f3020a) ? str : Base64.encodeToString(DataHelper.encrypt(str.getBytes(), f3020a.getBytes()), 0);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public String m2702b(String str) {
        try {
            return TextUtils.isEmpty(f3020a) ? str : new String(DataHelper.decrypt(Base64.decode(str.getBytes(), 0), f3020a.getBytes()));
        } catch (Exception unused) {
            UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>> 子进程事件数据解密失败!");
            String str2 = null;
            if (TextUtils.isEmpty(f3024e)) {
                return null;
            }
            UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>> 子进程事件数据解密失败，换老秘钥重试");
            try {
                String str3 = new String(DataHelper.decrypt(Base64.decode(str.getBytes(), 0), f3024e.getBytes()));
                try {
                    UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>> 子进程事件数据解密失败，换老秘钥重试成功。");
                    return str3;
                } catch (Exception unused2) {
                    str2 = str3;
                    UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>> 子进程事件数据解密失败，换老秘钥重试失败。换子进程备份key重试。");
                    try {
                        String str4 = new String(DataHelper.decrypt(Base64.decode(str.getBytes(), 0), f3026g.getBytes()));
                        try {
                            UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>> 子进程事件数据解密失败，子进程备份key重试成功。");
                            return str4;
                        } catch (Throwable unused3) {
                            str2 = str4;
                            UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>> 子进程事件数据解密失败，子进程备份key重试失败。");
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
