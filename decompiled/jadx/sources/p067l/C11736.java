package p067l;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* JADX INFO: renamed from: l.ۢ᩸ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9AZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C11736 {

    /* JADX INFO: renamed from: ֫ */
    public final long f32774;

    /* JADX INFO: renamed from: ۧ */
    public boolean f32775 = false;

    public C11736() {
        PackageInfo packageInfoM16201;
        boolean z = C4359.f9761;
        try {
            packageInfoM16201 = C7050.m16201("bin.mt.termex");
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfoM16201 = null;
        }
        this.f32774 = packageInfoM16201 != null ? packageInfoM16201.lastUpdateTime : 0L;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m26940() {
        PackageInfo packageInfoM16201;
        boolean z = C4359.f9761;
        try {
            packageInfoM16201 = C7050.m16201("bin.mt.termex");
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfoM16201 = null;
        }
        return (packageInfoM16201 == null || packageInfoM16201.lastUpdateTime == this.f32774) ? false : true;
    }
}
