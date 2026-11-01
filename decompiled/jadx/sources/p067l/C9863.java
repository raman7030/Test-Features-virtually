package p067l;

/* JADX INFO: renamed from: l.۠ۖۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8RL */
/* JADX INFO: loaded from: classes3.dex */
public final class C9863 implements InterfaceC20593 {

    /* JADX INFO: renamed from: ֫ */
    public int f27347;

    /* JADX INFO: renamed from: ۧ */
    public final C19203 f27348;

    /* JADX INFO: renamed from: ܽ */
    public final int f27349;

    /* JADX INFO: renamed from: ܿ */
    public int f27350;

    /* JADX INFO: renamed from: ᩳ */
    public final int f27351;

    @Override // p067l.InterfaceC20593
    /* JADX INFO: renamed from: ۧ */
    public final int mo5413() {
        return -1;
    }

    public C9863(C9815 c9815) {
        C19203 c19203 = c9815.f27154;
        this.f27348 = c19203;
        c19203.m43730(12);
        this.f27349 = c19203.m43738() & 255;
        this.f27351 = c19203.m43738();
    }

    @Override // p067l.InterfaceC20593
    /* JADX INFO: renamed from: ܽ */
    public final int mo5414() {
        return this.f27351;
    }

    @Override // p067l.InterfaceC20593
    /* JADX INFO: renamed from: ֫ */
    public final int mo5412() {
        C19203 c19203 = this.f27348;
        int i = this.f27349;
        if (i == 8) {
            return c19203.m43702();
        }
        if (i == 16) {
            return c19203.m43710();
        }
        int i2 = this.f27350;
        this.f27350 = i2 + 1;
        if (i2 % 2 == 0) {
            int iM43702 = c19203.m43702();
            this.f27347 = iM43702;
            return (iM43702 & 240) >> 4;
        }
        return this.f27347 & 15;
    }
}
