package l;

import android.os.SystemClock;

/* JADX INFO: renamed from: l.ܶ۫ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 05B9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15226 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f46731;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f46732;

    public C15226(int i) {
        this.f46731 = i;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m36033() {
        this.f46732 = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36032() {
        int iCurrentTimeMillis = (int) (((long) this.f46731) - (System.currentTimeMillis() - this.f46732));
        if (iCurrentTimeMillis > 0) {
            SystemClock.sleep(iCurrentTimeMillis);
        }
    }
}
