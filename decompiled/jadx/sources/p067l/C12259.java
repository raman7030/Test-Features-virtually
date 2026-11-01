package p067l;

import android.content.pm.PackageManager;
import android.content.pm.Signature;

/* JADX INFO: renamed from: l.ۤܽ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: UB1K */
/* JADX INFO: loaded from: classes4.dex */
public final class C12259 extends C14270 {
    @Override // p067l.C14940
    /* JADX INFO: renamed from: ֫ */
    public final Signature[] mo28283(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
