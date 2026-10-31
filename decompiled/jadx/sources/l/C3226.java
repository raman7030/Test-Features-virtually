package l;

/* JADX INFO: renamed from: l.ۗ۫֡, reason: contains not printable characters */
/* JADX INFO: compiled from: G5OY */
/* JADX INFO: loaded from: classes3.dex */
public final class C3226 extends AbstractC6068 implements InterfaceC4333, InterfaceC0804 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InterfaceC15347 f10154;

    @Override // l.InterfaceC7860
    /* JADX INFO: renamed from: ܽ */
    public final int mo8424() {
        return 9;
    }

    public C3226(InterfaceC15347 interfaceC15347) {
        this.f10154 = interfaceC15347;
    }

    @Override // l.InterfaceC4333
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String mo9896() {
        InterfaceC15347 interfaceC15347 = this.f10154;
        if (interfaceC15347 == null) {
            return null;
        }
        return interfaceC15347.getString();
    }

    @Override // l.InterfaceC4333
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15347 mo9897() {
        return this.f10154;
    }

    @Override // l.InterfaceC0804
    /* JADX INFO: renamed from: ֫ */
    public final void mo3030(C19357 c19357) {
        InterfaceC15347 interfaceC15347 = this.f10154;
        if (interfaceC15347 != null) {
            this.f10154 = c19357.m44616(interfaceC15347.getString());
        }
    }
}
