package p067l;

/* JADX INFO: renamed from: l.֨ۖۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8RL */
/* JADX INFO: loaded from: classes2.dex */
public final class C3157 implements InterfaceC20593 {

    /* JADX INFO: renamed from: ֫ */
    public final C19203 f5778;

    /* JADX INFO: renamed from: ۧ */
    public final int f5779;

    /* JADX INFO: renamed from: ܽ */
    public final int f5780;

    public C3157(C9815 c9815, C10307 c10307) {
        C19203 c19203 = c9815.f27154;
        this.f5778 = c19203;
        c19203.m43730(12);
        int iM43738 = c19203.m43738();
        if ("audio/raw".equals(c10307.f28528)) {
            int iM13023 = C5792.m13023(c10307.f28519) * c10307.f28539;
            if (iM43738 == 0 || iM43738 % iM13023 != 0) {
                C21334.m48351("Audio sample size mismatch. stsd sample size: " + iM13023 + ", stsz sample size: " + iM43738);
                iM43738 = iM13023;
            }
        }
        this.f5779 = iM43738 == 0 ? -1 : iM43738;
        this.f5780 = c19203.m43738();
    }

    @Override // p067l.InterfaceC20593
    /* JADX INFO: renamed from: ܽ */
    public final int mo5414() {
        return this.f5780;
    }

    @Override // p067l.InterfaceC20593
    /* JADX INFO: renamed from: ۧ */
    public final int mo5413() {
        return this.f5779;
    }

    @Override // p067l.InterfaceC20593
    /* JADX INFO: renamed from: ֫ */
    public final int mo5412() {
        int i = this.f5779;
        return i == -1 ? this.f5778.m43738() : i;
    }
}
