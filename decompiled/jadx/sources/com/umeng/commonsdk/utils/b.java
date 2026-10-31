package com.umeng.commonsdk.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.umeng.commonsdk.debug.UMRTLog;
import java.util.HashMap;

/* JADX INFO: compiled from: TAJ0 */
/* JADX INFO: loaded from: classes.dex */
public class b {
    public static HashMap a = new HashMap();
    public static Object b = new Object();

    public b() {
    }

    /* JADX INFO: compiled from: TAJ0 */
    public class a {
        public static final b a = new b();
    }

    public static b a() {
        return a.a;
    }

    public PackageInfo a(Context context, String str, int i) {
        PackageInfo packageInfo;
        synchronized (b) {
            if (a.containsKey(str)) {
                UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> pkg： " + str + ", pkgInfo缓存命中，直接返回");
                packageInfo = (PackageInfo) a.get(str);
            } else {
                try {
                    packageInfo = context.getPackageManager().getPackageInfo(str, i);
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> pkg： " + str + ", 获取pkgInfo并缓存");
                    a.put(str, packageInfo);
                } catch (PackageManager.NameNotFoundException unused) {
                    a.put(str, null);
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> pkg: " + str + "，目标包未安装。");
                    packageInfo = null;
                }
            }
        }
        return packageInfo;
    }
}
