package l;

import android.net.Uri;

/* JADX INFO: renamed from: l.֨۟ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 178J */
/* JADX INFO: loaded from: classes2.dex */
public final class C0971 implements InterfaceC21830 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Uri f3656;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC21830 f3657;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC1677 f3658;

    public C0971(InterfaceC21830 interfaceC21830, InterfaceC1677 interfaceC1677, Uri uri) {
        this.f3657 = interfaceC21830;
        this.f3658 = interfaceC1677;
        this.f3656 = uri;
    }

    @Override // l.InterfaceC21830
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC19383 mo3429(int i, int i2) {
        return this.f3657.mo3429(i, i2);
    }

    @Override // l.InterfaceC21830
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void mo3431() {
        this.f3657.mo3431();
    }

    @Override // l.InterfaceC21830
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo3430(InterfaceC9505 interfaceC9505) {
        Uri uri;
        C21125 c21125M24265;
        boolean z = interfaceC9505 instanceof C20794;
        InterfaceC21830 interfaceC21830 = this.f3657;
        if (!z || (uri = this.f3656) == null) {
            interfaceC21830.mo3430(interfaceC9505);
            return;
        }
        C21125 c21125 = null;
        try {
            InterfaceC7505 interfaceC7505M38732 = ((C16431) this.f3658).m38732(uri);
            if (interfaceC7505M38732 == null) {
                c21125M24265 = null;
            } else {
                try {
                    int i = C0265.f1551;
                    try {
                        c21125M24265 = new C9439(interfaceC7505M38732).m24265();
                    } catch (ArithmeticException | IllegalArgumentException | IndexOutOfBoundsException | C19317 unused) {
                        c21125M24265 = null;
                    }
                } catch (Throwable th) {
                    try {
                        interfaceC7505M38732.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            if (interfaceC7505M38732 != null) {
                interfaceC7505M38732.close();
            }
            c21125 = c21125M24265;
        } catch (Exception unused2) {
        }
        if (c21125 != null) {
            interfaceC9505 = c21125;
        }
        interfaceC21830.mo3430(interfaceC9505);
    }
}
