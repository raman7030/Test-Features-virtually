package p067l;

import android.net.Uri;

/* JADX INFO: renamed from: l.֨۟ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 178J */
/* JADX INFO: loaded from: classes2.dex */
public final class C3291 implements InterfaceC23116 {

    /* JADX INFO: renamed from: ᩶ */
    public final Uri f6431;

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC23116 f6432;

    /* JADX INFO: renamed from: ᩹ */
    public final InterfaceC3962 f6433;

    public C3291(InterfaceC23116 interfaceC23116, InterfaceC3962 interfaceC3962, Uri uri) {
        this.f6432 = interfaceC23116;
        this.f6433 = interfaceC3962;
        this.f6431 = uri;
    }

    @Override // p067l.InterfaceC23116
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC20790 mo5732(int i, int i2) {
        return this.f6432.mo5732(i, i2);
    }

    @Override // p067l.InterfaceC23116
    /* JADX INFO: renamed from: ܳ */
    public final void mo5734() {
        this.f6432.mo5734();
    }

    @Override // p067l.InterfaceC23116
    /* JADX INFO: renamed from: ֫ */
    public final void mo5733(InterfaceC11402 interfaceC11402) {
        Uri uri;
        C22446 c22446M26275;
        boolean z = interfaceC11402 instanceof C22131;
        InterfaceC23116 interfaceC23116 = this.f6432;
        if (!z || (uri = this.f6431) == null) {
            interfaceC23116.mo5733(interfaceC11402);
            return;
        }
        C22446 c22446 = null;
        try {
            InterfaceC9501 interfaceC9501M40957 = ((C17984) this.f6433).m40957(uri);
            if (interfaceC9501M40957 == null) {
                c22446M26275 = null;
            } else {
                try {
                    int i = C2620.f4329;
                    try {
                        c22446M26275 = new C11339(interfaceC9501M40957).m26275();
                    } catch (ArithmeticException | IllegalArgumentException | IndexOutOfBoundsException | C20727 unused) {
                        c22446M26275 = null;
                    }
                } catch (Throwable th) {
                    try {
                        interfaceC9501M40957.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            if (interfaceC9501M40957 != null) {
                interfaceC9501M40957.close();
            }
            c22446 = c22446M26275;
        } catch (Exception unused2) {
        }
        if (c22446 != null) {
            interfaceC11402 = c22446;
        }
        interfaceC23116.mo5733(interfaceC11402);
    }
}
