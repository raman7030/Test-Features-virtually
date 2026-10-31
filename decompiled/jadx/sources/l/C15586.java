package l;

/* JADX INFO: renamed from: l.ܺ֡ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6QT */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15586 implements InterfaceC10795 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f48018;

    public /* synthetic */ C15586(int i) {
        this.f48018 = i;
    }

    @Override // l.InterfaceC10795
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
        return C1622.m5502(this, interfaceC10795);
    }

    @Override // l.InterfaceC10795
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo2465(int i) {
        switch (this.f48018) {
            case 0:
                return (i == 10 || i == 13 || (i | 1) == 8233 || i == 133) ? false : true;
            default:
                return Character.isTitleCase(i);
        }
    }

    @Override // l.InterfaceC10795
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
        return C1622.m5503(this, interfaceC10795);
    }

    @Override // l.InterfaceC10795
    public final C7679 negate() {
        C5855 c5855 = C14403.f44164;
        return C7679.m20568(this);
    }
}
