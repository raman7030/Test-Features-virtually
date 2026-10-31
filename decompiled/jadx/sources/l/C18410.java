package l;

/* JADX INFO: renamed from: l.ᩴ֡ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6QT */
/* JADX INFO: loaded from: classes5.dex */
public final class C18410 implements InterfaceC21938 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long[] f57157;

    @Override // l.InterfaceC10795
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
        return C21233.m48187(this, interfaceC10795);
    }

    @Override // l.InterfaceC10795
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
        return C21233.m48188(this, interfaceC10795);
    }

    public C18410(long[] jArr) {
        this.f57157 = jArr;
    }

    @Override // l.InterfaceC10795
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo2465(int i) {
        if (i >= 65536) {
            return false;
        }
        if (C22165.m49800(i)) {
            i = C22165.m49804(i);
        }
        long[] jArr = this.f57157;
        return i < (jArr.length << 6) && (jArr[i >>> 6] & (1 << i)) != 0;
    }

    @Override // l.InterfaceC10795
    public final C7679 negate() {
        C5855 c5855 = C14403.f44164;
        return C7679.m20568(this);
    }
}
