package p067l;

import android.app.Activity;
import android.os.SystemClock;

/* JADX INFO: renamed from: l.ۤۛ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: W52J */
/* JADX INFO: loaded from: classes3.dex */
public final class C11981 {

    /* JADX INFO: renamed from: ֫ */
    public volatile boolean f33416;

    /* JADX INFO: renamed from: ۧ */
    public volatile boolean f33417 = true;

    public C11981(Activity activity) {
        C12799.m29348();
        activity.runOnUiThread(new RunnableC10376(3, this, activity));
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ void m27415(C11981 c11981) {
        c11981.f33417 = false;
        c11981.f33416 = true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m27414(C11981 c11981) {
        c11981.f33417 = false;
        c11981.f33416 = false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m27416() {
        C12799.m29348();
        while (this.f33417) {
            SystemClock.sleep(100L);
        }
        return this.f33416;
    }
}
