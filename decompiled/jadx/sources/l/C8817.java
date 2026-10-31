package l;

import android.os.SystemClock;

/* JADX INFO: renamed from: l.ۡۤۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: J2BI */
/* JADX INFO: loaded from: classes3.dex */
public final class C8817 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f26880;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f26881;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m22793() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (jUptimeMillis - this.f26880 <= this.f26881) {
            return true;
        }
        this.f26880 = jUptimeMillis;
        return false;
    }

    public C8817(int i) {
        this.f26881 = i;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static C8817 m22790() {
        return new C8817(10);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static C8817 m22787() {
        return new C8817(2000);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static C8817 m22788() {
        return new C8817(250);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static C8817 m22789() {
        return new C8817(150);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C8817 m22786(int i) {
        return new C8817(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m22791() {
        return !m22793();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m22792() {
        this.f26880 = SystemClock.uptimeMillis();
    }
}
