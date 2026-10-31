package l;

import android.app.Activity;
import android.os.SystemClock;

/* JADX INFO: renamed from: l.ۤۛ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: W52J */
/* JADX INFO: loaded from: classes3.dex */
public final class C10114 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public volatile boolean f30454;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public volatile boolean f30455 = true;

    public C10114(Activity activity) {
        C10975.m27286();
        activity.runOnUiThread(new RunnableC8425(3, this, activity));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m25395(C10114 c10114) {
        c10114.f30455 = false;
        c10114.f30454 = true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m25394(C10114 c10114) {
        c10114.f30455 = false;
        c10114.f30454 = false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m25396() {
        C10975.m27286();
        while (this.f30455) {
            SystemClock.sleep(100L);
        }
        return this.f30454;
    }
}
