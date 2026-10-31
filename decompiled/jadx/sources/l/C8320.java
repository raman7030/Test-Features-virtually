package l;

/* JADX INFO: renamed from: l.۠ܿܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56MU */
/* JADX INFO: loaded from: classes4.dex */
public final class C8320 extends AbstractC8540 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C22431 f25528 = new C22431();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f25529 = true;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f25530;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f25531;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f25532;

    public C8320(String str, String str2, boolean z) {
        this.f25531 = z;
        this.f25530 = str;
        this.f25532 = str2;
    }

    @Override // l.InterfaceC2190
    /* JADX INFO: renamed from: ܿ */
    public final AbstractC11342 mo7223() {
        return this.f25528;
    }

    @Override // l.InterfaceC2190
    /* JADX INFO: renamed from: ֫ */
    public final C14721 mo7216(InterfaceC19124 interfaceC19124) {
        if (this.f25531) {
            return null;
        }
        if (interfaceC19124.getLine().m38335().toString().substring(interfaceC19124.getIndex()).trim().equals(this.f25530)) {
            return new C14721(-1, -1, true);
        }
        return C14721.m35022(interfaceC19124.getIndex());
    }

    @Override // l.AbstractC8540, l.InterfaceC2190
    /* JADX INFO: renamed from: ֫ */
    public final void mo7218(C16300 c16300) {
        boolean z = this.f25529;
        C22431 c22431 = this.f25528;
        if (z) {
            this.f25529 = false;
            if (this.f25531) {
                StringBuilder sb = c22431.f72680;
                String str = this.f25532;
                sb.append((CharSequence) str, 2, str.length() - 2);
                return;
            }
            return;
        }
        StringBuilder sb2 = c22431.f72680;
        sb2.append(c16300.m38335());
        sb2.append('\n');
    }
}
