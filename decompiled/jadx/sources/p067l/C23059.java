package p067l;

/* JADX INFO: renamed from: l.᩸ᩴܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7I1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23059 implements InterfaceC12628 {
    @Override // p067l.InterfaceC12628
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ InterfaceC12628 mo4820(InterfaceC12628 interfaceC12628) {
        return C3910.m7732(this, interfaceC12628);
    }

    @Override // p067l.InterfaceC12628
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ InterfaceC12628 mo4822(InterfaceC12628 interfaceC12628) {
        return C3910.m7733(this, interfaceC12628);
    }

    @Override // p067l.InterfaceC12628
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4821(int i) {
        int i2 = C4426.f9939;
        if (i > 127) {
            return Character.isLetterOrDigit(i);
        }
        if (97 <= i && i <= 122) {
            return true;
        }
        if (65 > i || i > 90) {
            return 48 <= i && i <= 57;
        }
        return true;
    }

    @Override // p067l.InterfaceC12628
    public final C9667 negate() {
        C7933 c7933 = C16057.f47257;
        return C9667.m22548(this);
    }
}
