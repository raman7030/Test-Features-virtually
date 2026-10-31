package l;

/* JADX INFO: renamed from: l.۬۬ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46PA */
/* JADX INFO: loaded from: classes4.dex */
public final class C13131 extends C1875 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f39278;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long f39279;

    public C13131(C0185 c0185, int i) {
        super(c0185);
        this.f39279 = Math.max(2000000L, ((long) i) * 1000);
    }

    @Override // l.C1875
    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC0463 mo6211(int i) {
        long j = this.f39278 + 1;
        this.f39278 = j;
        if ((j & 1023) == 0) {
            C18757.m43430();
            if (this.f39278 > this.f39279) {
                throw new IllegalArgumentException("Parser work exceeds formatter limit");
            }
        }
        return super.mo6211(i);
    }
}
