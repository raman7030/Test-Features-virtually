package p067l;

/* JADX INFO: renamed from: l.ᩴۚܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6QT */
/* JADX INFO: loaded from: classes5.dex */
public final class C20004 implements InterfaceC12628 {

    /* JADX INFO: renamed from: ֫ */
    public final long[] f60814;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f60815;

    /* JADX INFO: renamed from: ܽ */
    public final int[] f60816;

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

    public C20004(long[] jArr, int[] iArr, boolean z) {
        this.f60814 = jArr;
        this.f60816 = iArr;
        this.f60815 = z;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0041 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x0042 A[RETURN] */
    @Override // p067l.InterfaceC12628
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4821(int i) {
        boolean z;
        long[] jArr = this.f60814;
        if (i < (jArr.length << 6)) {
            if (((1 << i) & jArr[i >>> 6]) != 0) {
                return true;
            }
            return false;
        }
        boolean z2 = this.f60815;
        if (i < 65536) {
            return z2;
        }
        int[] iArr = this.f60816;
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

    @Override // p067l.InterfaceC12628
    public final C9667 negate() {
        C7933 c7933 = C16057.f47257;
        return C9667.m22548(this);
    }
}
