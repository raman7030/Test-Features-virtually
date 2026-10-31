package l;

/* JADX INFO: renamed from: l.۬۫֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 35M1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13103 extends AbstractC6068 implements InterfaceC2922, InterfaceC0804 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public InterfaceC21699 f39231;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC15347 f39232;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f39233;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InterfaceC15347 f39234;

    @Override // l.InterfaceC7860
    /* JADX INFO: renamed from: ܽ */
    public final int mo8424() {
        return 3;
    }

    public C13103(int i, InterfaceC15347 interfaceC15347, InterfaceC21699 interfaceC21699, InterfaceC15347 interfaceC15348) {
        this.f39233 = i;
        this.f39234 = interfaceC15347;
        this.f39231 = interfaceC21699;
        this.f39232 = interfaceC15348;
    }

    @Override // l.InterfaceC2922
    /* JADX INFO: renamed from: ֫ */
    public final int mo8920() {
        return this.f39233;
    }

    @Override // l.InterfaceC2922
    /* JADX INFO: renamed from: ᩻ */
    public final InterfaceC15347 mo8923() {
        return this.f39234;
    }

    @Override // l.InterfaceC2922
    /* JADX INFO: renamed from: ۡ */
    public final InterfaceC21699 mo8921() {
        return this.f39231;
    }

    @Override // l.InterfaceC2922
    /* JADX INFO: renamed from: ᩴ */
    public final InterfaceC15347 mo8922() {
        return this.f39232;
    }

    @Override // l.InterfaceC21972
    public final String getName() {
        InterfaceC15347 interfaceC15347 = this.f39234;
        if (interfaceC15347 == null) {
            return null;
        }
        return interfaceC15347.getString();
    }

    @Override // l.InterfaceC21972
    public final String getType() {
        InterfaceC21699 interfaceC21699 = this.f39231;
        if (interfaceC21699 == null) {
            return null;
        }
        return interfaceC21699.getType();
    }

    @Override // l.InterfaceC21972
    public final String getSignature() {
        InterfaceC15347 interfaceC15347 = this.f39232;
        if (interfaceC15347 == null) {
            return null;
        }
        return interfaceC15347.getString();
    }

    @Override // l.InterfaceC0804
    /* JADX INFO: renamed from: ֫ */
    public final void mo3030(C19357 c19357) {
        InterfaceC15347 interfaceC15347 = this.f39234;
        if (interfaceC15347 != null) {
            this.f39234 = c19357.m44616(interfaceC15347.getString());
        }
        InterfaceC21699 interfaceC21699 = this.f39231;
        if (interfaceC21699 != null) {
            this.f39231 = c19357.f68957.m34448(interfaceC21699.getType());
        }
        InterfaceC15347 interfaceC15348 = this.f39232;
        if (interfaceC15348 != null) {
            this.f39232 = c19357.m44616(interfaceC15348.getString());
        }
    }
}
