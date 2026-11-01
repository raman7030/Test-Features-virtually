package p067l;

/* JADX INFO: renamed from: l.ۧۤۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: F6QC */
/* JADX INFO: loaded from: classes4.dex */
public final class C12761 extends C4150 {

    /* JADX INFO: renamed from: ܳ */
    public long f35933;

    /* JADX INFO: renamed from: ܿ */
    public final long f35934;

    public C12761(C14829 c14829, int i) {
        super(c14829);
        this.f35934 = Math.max(2000000L, ((long) i) * 1000);
    }

    @Override // p067l.C4150
    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC2808 mo8413(int i) {
        long j = this.f35933 + 1;
        this.f35933 = j;
        if ((j & 1023) == 0) {
            C22149.m49958();
            if (this.f35933 > this.f35934) {
                throw new IllegalArgumentException("Parser work exceeds formatter limit");
            }
        }
        return super.mo8413(i);
    }
}
