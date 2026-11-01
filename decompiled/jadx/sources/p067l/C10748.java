package p067l;

import android.os.SystemClock;

/* JADX INFO: renamed from: l.ۡۤۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: J2BI */
/* JADX INFO: loaded from: classes3.dex */
public final class C10748 {

    /* JADX INFO: renamed from: ֫ */
    public long f29805;

    /* JADX INFO: renamed from: ۧ */
    public final int f29806;

    /* JADX INFO: renamed from: ܽ */
    public final synchronized boolean m24763() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (jUptimeMillis - this.f29805 <= this.f29806) {
            return true;
        }
        this.f29805 = jUptimeMillis;
        return false;
    }

    public C10748(int i) {
        this.f29806 = i;
    }

    /* JADX INFO: renamed from: ᩻ */
    public static C10748 m24760() {
        return new C10748(10);
    }

    /* JADX INFO: renamed from: ܳ */
    public static C10748 m24757() {
        return new C10748(2000);
    }

    /* JADX INFO: renamed from: ܿ */
    public static C10748 m24758() {
        return new C10748(250);
    }

    /* JADX INFO: renamed from: ᩳ */
    public static C10748 m24759() {
        return new C10748(150);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C10748 m24756(int i) {
        return new C10748(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m24761() {
        return !m24763();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m24762() {
        this.f29805 = SystemClock.uptimeMillis();
    }
}
