package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ᩴۨ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 51FV */
/* JADX INFO: loaded from: classes5.dex */
public final class C20185 implements InterfaceC3736 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C20856 f62469;

    /* JADX INFO: renamed from: ۧ */
    public final C3065 f62470;

    public C20185(C20856 c20856, C3065 c3065) {
        this.f62469 = c20856;
        C12826.requireNonNull(c3065);
        this.f62470 = c3065;
    }

    @Override // p067l.InterfaceC3736
    public final String getPath() {
        return this.f62470.f5532;
    }

    @Override // p067l.InterfaceC3736
    /* JADX INFO: renamed from: ֫ */
    public final String mo7189() {
        try {
            return C20856.m47089(this.f62470);
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final C20635 m45663() {
        byte[] bArrM30466;
        C3065 c3065 = this.f62470;
        C12828 c12828 = c3065.f5534;
        if (c12828 == null) {
            C12828 c12829 = c3065.f5539;
            C12826.requireNonNull(c12829);
            C13337 c13337 = new C13337(c12829.m29402());
            try {
                c13337.seek(c3065.f5538);
                if (c3065.f5533) {
                    byte[] bArrM30467 = c13337.m30466();
                    bArrM30466 = C6054.m13644(bArrM30467, bArrM30467.length);
                } else {
                    bArrM30466 = c13337.m30466();
                }
                c13337.close();
                return C20635.m46635(new C14677(bArrM30466));
            } catch (Throwable th) {
                try {
                    c13337.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        C12828 c12828M47104 = this.f62469.m47104(c12828);
        C20635 c20635M47106 = C20856.m47106(c12828, c12828M47104);
        return c20635M47106 != null ? c20635M47106 : C20856.m47094(c12828M47104);
    }

    @Override // p067l.InterfaceC3736
    /* JADX INFO: renamed from: ֫ */
    public final void mo7190(String str) {
        C20856 c20856 = this.f62469;
        try {
            c20856.m47119(this.f62470, str);
        } catch (Exception e) {
            c20856.f65533.mo4062(e);
        }
    }
}
