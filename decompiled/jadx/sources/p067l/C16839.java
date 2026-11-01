package p067l;

import android.os.SystemClock;

/* JADX INFO: renamed from: l.ܶ۫ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 05B9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16839 {

    /* JADX INFO: renamed from: ֫ */
    public final int f49855;

    /* JADX INFO: renamed from: ۧ */
    public long f49856;

    public C16839(int i) {
        this.f49855 = i;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m38194() {
        this.f49856 = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38193() {
        int iCurrentTimeMillis = (int) (((long) this.f49855) - (System.currentTimeMillis() - this.f49856));
        if (iCurrentTimeMillis > 0) {
            SystemClock.sleep(iCurrentTimeMillis);
        }
    }
}
