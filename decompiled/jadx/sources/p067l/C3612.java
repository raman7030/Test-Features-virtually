package p067l;

/* JADX INFO: renamed from: l.֨ᩴܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7I1 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3612 implements InterfaceC12628 {
    @Override // p067l.InterfaceC12628
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ InterfaceC12628 mo4820(InterfaceC12628 interfaceC12628) {
        return C3910.m7732(this, interfaceC12628);
    }

    @Override // p067l.InterfaceC12628
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4821(int i) {
        if (i >= 48 && i <= 57) {
            return true;
        }
        if (i >= 65 && i <= 70) {
            return true;
        }
        if (i >= 97 && i <= 102) {
            return true;
        }
        if (i >= 65296 && i <= 65305) {
            return true;
        }
        if (i < 65313 || i > 65318) {
            return i >= 65345 && i <= 65350;
        }
        return true;
    }

    @Override // p067l.InterfaceC12628
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ InterfaceC12628 mo4822(InterfaceC12628 interfaceC12628) {
        return C3910.m7733(this, interfaceC12628);
    }

    @Override // p067l.InterfaceC12628
    public final C9667 negate() {
        C7933 c7933 = C16057.f47257;
        return C9667.m22548(this);
    }
}
