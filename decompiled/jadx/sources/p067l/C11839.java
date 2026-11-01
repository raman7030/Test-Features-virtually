package p067l;

/* JADX INFO: renamed from: l.ۤ֨ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6QT */
/* JADX INFO: loaded from: classes4.dex */
public final class C11839 implements InterfaceC23218 {

    /* JADX INFO: renamed from: ֫ */
    public final long[] f33035;

    @Override // p067l.InterfaceC12628
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ InterfaceC12628 mo4820(InterfaceC12628 interfaceC12628) {
        return C22548.m50518(this, interfaceC12628);
    }

    @Override // p067l.InterfaceC12628
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ InterfaceC12628 mo4822(InterfaceC12628 interfaceC12628) {
        return C22548.m50519(this, interfaceC12628);
    }

    public C11839(long[] jArr) {
        this.f33035 = jArr;
    }

    @Override // p067l.InterfaceC12628
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4821(int i) {
        if (i >= 65536) {
            return false;
        }
        int iM12395 = C5595.m12395(i);
        long[] jArr = this.f33035;
        return iM12395 < (jArr.length << 6) && (jArr[iM12395 >>> 6] & (1 << iM12395)) != 0;
    }

    @Override // p067l.InterfaceC12628
    public final C9667 negate() {
        C7933 c7933 = C16057.f47257;
        return C9667.m22548(this);
    }
}
