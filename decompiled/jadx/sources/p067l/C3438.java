package p067l;

import android.os.Looper;

/* JADX INFO: renamed from: l.֨۫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: UAXR */
/* JADX INFO: loaded from: classes2.dex */
public final class C3438 implements InterfaceC4604 {
    @Override // p067l.InterfaceC4604
    /* JADX INFO: renamed from: ֫ */
    public final C16848 mo6095() {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper == null) {
            throw new IllegalStateException("The main looper is not available");
        }
        return new C16848(C23555.m52343(mainLooper));
    }
}
