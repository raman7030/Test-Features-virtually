package p067l;

/* JADX INFO: renamed from: l.ܺ֡ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6QT */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C17181 implements InterfaceC12628 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ int f51150;

    public /* synthetic */ C17181(int i) {
        this.f51150 = i;
    }

    @Override // p067l.InterfaceC12628
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ InterfaceC12628 mo4820(InterfaceC12628 interfaceC12628) {
        return C3910.m7732(this, interfaceC12628);
    }

    @Override // p067l.InterfaceC12628
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4821(int i) {
        switch (this.f51150) {
            case 0:
                return (i == 10 || i == 13 || (i | 1) == 8233 || i == 133) ? false : true;
            default:
                return Character.isTitleCase(i);
        }
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
