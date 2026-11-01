package com.umeng.analytics.pro;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.utils.C0832d;
import java.util.ArrayList;
import java.util.List;
import p067l.C17588;
import p067l.C7470;

/* JADX INFO: renamed from: com.umeng.analytics.pro.y */
/* JADX INFO: compiled from: ABLA */
/* JADX INFO: loaded from: classes.dex */
public class C0729y {

    /* JADX INFO: renamed from: c */
    public static volatile C0729y f2970c;

    /* JADX INFO: renamed from: a */
    public InterfaceC0727w f2971a = new C0728x();

    /* JADX INFO: renamed from: b */
    public String f2972b;

    /* JADX INFO: renamed from: d */
    public List f2973d;

    /* JADX INFO: renamed from: e */
    public String f2974e;

    /* JADX INFO: renamed from: com.umeng.analytics.pro.y$a */
    /* JADX INFO: compiled from: ABLA */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo2647a(String str, long j, long j2, long j3);

        /* JADX INFO: renamed from: a */
        void mo2648a(String str, String str2, long j, long j2, long j3);
    }

    /* JADX INFO: renamed from: a */
    public static C0729y m2667a() {
        if (f2970c == null) {
            synchronized (C0729y.class) {
                if (f2970c == null) {
                    f2970c = new C0729y();
                }
            }
        }
        return f2970c;
    }

    /* JADX INFO: renamed from: a */
    public void m2676a(long j) {
        this.f2971a.mo2663a(j);
    }

    /* JADX INFO: renamed from: b */
    public long m2678b() {
        return this.f2971a.mo2661a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX INFO: renamed from: a */
    public String m2674a(Context context) throws Throwable {
        ?? appContext = UMGlobalContext.getAppContext(context);
        if (appContext == 0) {
            return "";
        }
        try {
            try {
                synchronized (C0729y.class) {
                    try {
                        return PreferenceWrapper.getDefault(appContext).getString(C0725u.f2952d, "");
                    } catch (Throwable th) {
                        th = th;
                        appContext = "";
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception unused) {
            return "";
        }
        try {
            throw th;
        } catch (Exception unused2) {
            return appContext;
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized String m2679b(Context context) {
        Context appContext = UMGlobalContext.getAppContext(context);
        if (appContext == null) {
            return "";
        }
        this.f2972b = m2682d(appContext);
        if (m2683e(appContext)) {
            try {
                this.f2972b = m2669f(appContext);
            } catch (Exception unused) {
            }
        }
        return this.f2972b;
    }

    /* JADX INFO: renamed from: c */
    public String m2681c(Context context) {
        Context appContext = UMGlobalContext.getAppContext(context);
        if (appContext == null) {
            return "";
        }
        try {
            this.f2972b = m2669f(appContext);
        } catch (Exception unused) {
        }
        return this.f2972b;
    }

    /* JADX INFO: renamed from: d */
    public String m2682d(Context context) {
        if (TextUtils.isEmpty(this.f2972b)) {
            try {
                this.f2972b = PreferenceWrapper.getDefault(context).getString("session_id", null);
            } catch (Exception unused) {
            }
        }
        return this.f2972b;
    }

    /* JADX INFO: renamed from: a */
    public String m2675a(Context context, long j) {
        if (TextUtils.isEmpty(this.f2974e)) {
            String strM40051 = C17588.m40051(j, "SUB");
            StringBuilder sbM17248 = C7470.m17248(strM40051);
            sbM17248.append(String.format("%0" + (32 - strM40051.length()) + "d", 0));
            this.f2974e = sbM17248.toString();
        }
        return this.f2974e;
    }

    /* JADX INFO: renamed from: e */
    public boolean m2683e(Context context) {
        if (TextUtils.isEmpty(this.f2972b)) {
            this.f2972b = m2682d(context);
        }
        return TextUtils.isEmpty(this.f2972b) || m2673j(context) || m2670g(context);
    }

    /* JADX INFO: renamed from: f */
    private String m2669f(Context context) {
        try {
            SharedPreferences.Editor editorEdit = PreferenceWrapper.getDefault(context).edit();
            editorEdit.putString(C0725u.f2952d, m2682d(context));
            editorEdit.commit();
        } catch (Exception unused) {
        }
        long jM2671h = m2671h(context);
        long jM2672i = m2672i(context);
        String str = this.f2972b;
        long jM2636a = C0725u.m2636a(context);
        long j = jM2636a * 5000;
        UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>>*** 读取 foreground count 值完成，count次数：" + jM2636a);
        if (FieldManager.allow(C0832d.f3591E)) {
            if (UMWorkDispatch.eventHasExist()) {
                UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>>*** 读取 foreground count druation值完成，终止checker timer.");
                UMWorkDispatch.removeEvent();
            } else {
                UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>>*** 读取 foreground count druation值完成，无未处理check timer事件。");
            }
        } else {
            UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>>*** foreground count druation云控参数关闭。");
        }
        m2668a(jM2672i, jM2671h, j, str, false);
        this.f2972b = this.f2971a.mo2662a(context);
        m2668a(jM2672i, jM2671h, j, str, true);
        this.f2971a.mo2664a(context, this.f2972b);
        return this.f2972b;
    }

    /* JADX INFO: renamed from: g */
    private boolean m2670g(Context context) {
        return !TextUtils.isEmpty(this.f2972b) && C0713i.m2480a(context).m2492a(this.f2972b) > 0;
    }

    /* JADX INFO: renamed from: a */
    private long m2666a(Context context, String str) {
        long j;
        try {
            j = PreferenceWrapper.getDefault(context).getLong(str, 0L);
        } catch (Exception unused) {
            j = 0;
        }
        return j <= 0 ? System.currentTimeMillis() : j;
    }

    /* JADX INFO: renamed from: h */
    private long m2671h(Context context) {
        return m2666a(context, C0725u.f2954f);
    }

    /* JADX INFO: renamed from: i */
    private long m2672i(Context context) {
        return m2666a(context, C0725u.f2949a);
    }

    /* JADX INFO: renamed from: a */
    private void m2668a(long j, long j2, long j3, String str, boolean z) {
        List<a> list = this.f2973d;
        if (list != null) {
            for (a aVar : list) {
                if (z) {
                    try {
                        aVar.mo2648a(str, this.f2972b, j, j2, j3);
                    } catch (Exception unused) {
                    }
                } else {
                    aVar.mo2647a(this.f2972b, j, j2, j3);
                }
            }
        }
    }

    /* JADX INFO: renamed from: j */
    private boolean m2673j(Context context) {
        Context appContext = UMGlobalContext.getAppContext(context);
        try {
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(appContext);
            long j = sharedPreferences.getLong(C0725u.f2953e, 0L);
            long j2 = sharedPreferences.getLong(C0725u.f2954f, 0L);
            if (FieldManager.allow(C0832d.f3591E) && j > 0 && j2 == 0) {
                long jM2636a = C0725u.m2636a(appContext);
                if (jM2636a > 0) {
                    UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>> last session end time stamp = 0, reconstruct it by foreground count value.");
                    j2 = j + (jM2636a * 5000);
                }
            }
            UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "--->>> interval of last session is: " + (j2 - j));
            return this.f2971a.mo2665a(j, j2);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2677a(a aVar) {
        if (aVar == null) {
            return;
        }
        if (this.f2973d == null) {
            this.f2973d = new ArrayList();
        }
        if (this.f2973d.contains(aVar)) {
            return;
        }
        this.f2973d.add(aVar);
    }

    /* JADX INFO: renamed from: b */
    public void m2680b(a aVar) {
        List list;
        if (aVar == null || (list = this.f2973d) == null || list.size() == 0) {
            return;
        }
        this.f2973d.remove(aVar);
    }
}
