package p067l;

/* JADX INFO: renamed from: l.۬۬ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46PA */
/* JADX INFO: loaded from: classes4.dex */
public final class C14848 extends C4150 {

    /* JADX INFO: renamed from: ܳ */
    public long f42333;

    /* JADX INFO: renamed from: ܿ */
    public final long f42334;

    public C14848(C2544 c2544, int i) {
        super(c2544);
        this.f42334 = Math.max(2000000L, ((long) i) * 1000);
    }

    @Override // p067l.C4150
    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC2808 mo8413(int i) {
        long j = this.f42333 + 1;
        this.f42333 = j;
        if ((j & 1023) == 0) {
            C20195.m45697();
            if (this.f42333 > this.f42334) {
                throw new IllegalArgumentException("Parser work exceeds formatter limit");
            }
        }
        return super.mo8413(i);
    }
}
