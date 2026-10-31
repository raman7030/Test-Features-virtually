package l;

/* JADX INFO: renamed from: l.ܿܿ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 195F */
/* JADX INFO: loaded from: classes4.dex */
public final class C17500 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f53459;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f53460;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f53461;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1978 f53462;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean f53463;

    public C17500(InterfaceC1978 interfaceC1978, C20344 c20344) {
        this.f53462 = interfaceC1978;
        this.f53461 = C23850.m52559(c20344.f65673);
        this.f53463 = c20344.f65668;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40886(String str) {
        InterfaceC1978 interfaceC1978 = this.f53462;
        boolean z = this.f53463;
        int i = this.f53461;
        if (i == 2) {
            if (this.f53459 || !z) {
                String str2 = this.f53460;
                if (str2 != null) {
                    interfaceC1978.mo6489(str2);
                    this.f53460 = null;
                }
                interfaceC1978.mo6486();
            }
            this.f53459 = false;
            this.f53460 = str;
            return;
        }
        if (!z || this.f53459) {
            if (i == 0) {
                interfaceC1978.mo6489(str);
            }
            interfaceC1978.mo6486();
            this.f53459 = false;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40884() {
        int i = this.f53461;
        InterfaceC1978 interfaceC1978 = this.f53462;
        boolean z = this.f53463;
        if (i == 2) {
            if (this.f53459 || !z) {
                String str = this.f53460;
                if (str != null) {
                    interfaceC1978.mo6489(str);
                    this.f53460 = null;
                }
                interfaceC1978.mo6486();
                return;
            }
            return;
        }
        if (this.f53459 || !z) {
            interfaceC1978.mo6486();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40885(char c) {
        String str = this.f53460;
        InterfaceC1978 interfaceC1978 = this.f53462;
        if (str != null) {
            interfaceC1978.mo6489(str);
            this.f53460 = null;
        }
        interfaceC1978.mo6487(c);
        this.f53459 = true;
    }
}
