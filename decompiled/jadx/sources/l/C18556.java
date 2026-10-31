package l;

/* JADX INFO: renamed from: l.ᩴۚܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6QT */
/* JADX INFO: loaded from: classes5.dex */
public final class C18556 implements InterfaceC10795 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long[] f57591;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f57592;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int[] f57593;

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

    public C18556(long[] jArr, int[] iArr, boolean z) {
        this.f57591 = jArr;
        this.f57593 = iArr;
        this.f57592 = z;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0041 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x0042 A[RETURN] */
    @Override // l.InterfaceC10795
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo2465(int i) {
        boolean z;
        long[] jArr = this.f57591;
        if (i < (jArr.length << 6)) {
            if (((1 << i) & jArr[i >>> 6]) != 0) {
                return true;
            }
            return false;
        }
        boolean z2 = this.f57592;
        if (i < 65536) {
            return z2;
        }
        int[] iArr = this.f57593;
        int length = (iArr.length / 2) - 1;
        int i2 = 0;
        while (i2 <= length) {
            int i3 = (i2 + length) >>> 1;
            int i4 = i3 * 2;
            int i5 = iArr[i4];
            int i6 = iArr[i4 + 1];
            if (i < i5) {
                length = i3 - 1;
            } else {
                if (i <= i6) {
                    z = true;
                    if (z2 != z) {
                        return true;
                    }
                    return false;
                }
                i2 = i3 + 1;
            }
        }
        z = false;
        if (z2 != z) {
            return true;
        }
        return false;
    }

    @Override // l.InterfaceC10795
    public final C7679 negate() {
        C5855 c5855 = C14403.f44164;
        return C7679.m20568(this);
    }
}
