package l;

/* JADX INFO: renamed from: l.᩸ᩴܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7I1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C21770 implements InterfaceC10795 {
    @Override // l.InterfaceC10795
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
        return C1622.m5502(this, interfaceC10795);
    }

    @Override // l.InterfaceC10795
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
        return C1622.m5503(this, interfaceC10795);
    }

    @Override // l.InterfaceC10795
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo2465(int i) {
        int i2 = C2164.f7153;
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

    @Override // l.InterfaceC10795
    public final C7679 negate() {
        C5855 c5855 = C14403.f44164;
        return C7679.m20568(this);
    }
}
