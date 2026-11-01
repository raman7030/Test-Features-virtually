package com.umeng.analytics.pro;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.alipay.sdk.p010m.p058y.C0240c;
import com.umeng.commonsdk.debug.UMRTLog;
import java.util.ArrayList;
import p067l.EnumC4453;

/* JADX INFO: renamed from: com.umeng.analytics.pro.m */
/* JADX INFO: compiled from: UBMB */
/* JADX INFO: loaded from: classes.dex */
public class C0717m implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a */
    public static C0717m f2855a = new C0717m();

    /* JADX INFO: renamed from: b */
    public final int f2856b = EnumC4453.f9987;

    /* JADX INFO: renamed from: c */
    public boolean f2857c = false;

    /* JADX INFO: renamed from: d */
    public boolean f2858d = true;

    /* JADX INFO: renamed from: e */
    public Handler f2859e = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: f */
    public ArrayList f2860f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public a f2861g = new a();

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    /* JADX INFO: renamed from: com.umeng.analytics.pro.m$a */
    /* JADX INFO: compiled from: UBMB */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C0717m.this.f2857c && C0717m.this.f2858d) {
                C0717m.this.f2857c = false;
                UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "--->>> went background.");
                for (int i = 0; i < C0717m.this.f2860f.size(); i++) {
                    ((InterfaceC0718n) C0717m.this.f2860f.get(i)).mo2103n();
                }
                return;
            }
            UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "--->>> still foreground.");
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m2541a(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(f2855a);
        }
    }

    /* JADX INFO: renamed from: a */
    public static C0717m m2540a() {
        return f2855a;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m2546a(InterfaceC0718n interfaceC0718n) {
        if (interfaceC0718n != null) {
            this.f2860f.add(interfaceC0718n);
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m2547b(InterfaceC0718n interfaceC0718n) {
        if (interfaceC0718n != null) {
            for (int i = 0; i < this.f2860f.size(); i++) {
                if (this.f2860f.get(i) == interfaceC0718n) {
                    this.f2860f.remove(i);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        this.f2858d = false;
        this.f2857c = true;
        a aVar = this.f2861g;
        if (aVar != null) {
            this.f2859e.removeCallbacks(aVar);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.f2858d = true;
        a aVar = this.f2861g;
        if (aVar != null) {
            this.f2859e.removeCallbacks(aVar);
            this.f2859e.postDelayed(this.f2861g, C0240c.f1145a);
        }
    }
}
