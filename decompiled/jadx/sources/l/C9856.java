package l;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* JADX INFO: renamed from: l.ۢ᩸ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9AZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C9856 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f29821;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f29822 = false;

    public C9856() {
        PackageInfo packageInfoM14304;
        boolean z = C2094.f6977;
        try {
            packageInfoM14304 = C4925.m14304("bin.mt.termex");
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfoM14304 = null;
        }
        this.f29821 = packageInfoM14304 != null ? packageInfoM14304.lastUpdateTime : 0L;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m24925() {
        PackageInfo packageInfoM14304;
        boolean z = C2094.f6977;
        try {
            packageInfoM14304 = C4925.m14304("bin.mt.termex");
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfoM14304 = null;
        }
        return (packageInfoM14304 == null || packageInfoM14304.lastUpdateTime == this.f29821) ? false : true;
    }
}
