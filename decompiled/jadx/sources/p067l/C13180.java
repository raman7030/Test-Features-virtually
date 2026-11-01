package p067l;

/* JADX INFO: renamed from: l.ۨ֨ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6QT */
/* JADX INFO: loaded from: classes4.dex */
public final class C13180 implements InterfaceC12628 {

    /* JADX INFO: renamed from: ֫ */
    public final long[] f37033;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f37034;

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

    public C13180(long[] jArr, boolean z) {
        this.f37033 = jArr;
        this.f37034 = z;
    }

    @Override // p067l.InterfaceC12628
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4821(int i) {
        if (i < 65536) {
            int iM12395 = C5595.m12395(i);
            long[] jArr = this.f37033;
            if (iM12395 < (jArr.length << 6)) {
                return (jArr[iM12395 >>> 6] & (1 << iM12395)) != 0;
            }
        }
        return this.f37034;
    }

    @Override // p067l.InterfaceC12628
    public final C9667 negate() {
        C7933 c7933 = C16057.f47257;
        return C9667.m22548(this);
    }
}
