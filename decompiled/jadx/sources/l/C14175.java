package l;

/* JADX INFO: renamed from: l.ܳ֡ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6QT */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C14175 implements InterfaceC10795 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f42808;

    public /* synthetic */ C14175(int i) {
        this.f42808 = i;
    }

    @Override // l.InterfaceC10795
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
        return C1622.m5502(this, interfaceC10795);
    }

    @Override // l.InterfaceC10795
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo2465(int i) {
        switch (this.f42808) {
            case 0:
                C5855 c5855 = C14403.f44164;
                return true;
            default:
                if ((i & 65534) != 65534) {
                    return i >= 64976 && i <= 65007;
                }
                return true;
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
