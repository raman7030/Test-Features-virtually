package l;

import android.content.ContextWrapper;
import android.os.Build;

/* JADX INFO: renamed from: l.۫ܰ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 08PI */
/* JADX INFO: loaded from: classes4.dex */
public final class C12440 implements InterfaceC13850 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ContextWrapper f37435;

    public C12440(ContextWrapper contextWrapper) {
        this.f37435 = contextWrapper;
    }

    @Override // l.InterfaceC13850
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC10846 mo13243(C23023 c23023) {
        ContextWrapper contextWrapper;
        int i = Build.VERSION.SDK_INT;
        if (i >= 23 && (i >= 31 || ((contextWrapper = this.f37435) != null && i >= 28 && contextWrapper.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen")))) {
            int iM24807 = C9786.m24807(c23023.f74104.f25614);
            C19956.m46035("Creating an asynchronous MediaCodec adapter for track type " + C3603.m11045(iM24807));
            return new C8207(new C5385(iM24807), new C1151(iM24807)).mo13243(c23023);
        }
        return new C4495().mo13243(c23023);
    }
}
