package com.umeng.commonsdk.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.umeng.commonsdk.debug.UMRTLog;
import java.util.HashMap;

/* JADX INFO: renamed from: com.umeng.commonsdk.utils.b */
/* JADX INFO: compiled from: TAJ0 */
/* JADX INFO: loaded from: classes.dex */
public class C0830b {

    /* JADX INFO: renamed from: a */
    public static HashMap f3573a = new HashMap();

    /* JADX INFO: renamed from: b */
    public static Object f3574b = new Object();

    public C0830b() {
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.utils.b$a */
    /* JADX INFO: compiled from: TAJ0 */
    public class a {

        /* JADX INFO: renamed from: a */
        public static final C0830b f3575a = new C0830b();
    }

    /* JADX INFO: renamed from: a */
    public static C0830b m3304a() {
        return a.f3575a;
    }

    /* JADX INFO: renamed from: a */
    public PackageInfo m3305a(Context context, String str, int i) {
        PackageInfo packageInfo;
        synchronized (f3574b) {
            if (f3573a.containsKey(str)) {
                UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>> pkg： " + str + ", pkgInfo缓存命中，直接返回");
                packageInfo = (PackageInfo) f3573a.get(str);
            } else {
                try {
                    packageInfo = context.getPackageManager().getPackageInfo(str, i);
                    UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>> pkg： " + str + ", 获取pkgInfo并缓存");
                    f3573a.put(str, packageInfo);
                } catch (PackageManager.NameNotFoundException unused) {
                    f3573a.put(str, null);
                    UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>> pkg: " + str + "，目标包未安装。");
                    packageInfo = null;
                }
            }
        }
        return packageInfo;
    }
}
