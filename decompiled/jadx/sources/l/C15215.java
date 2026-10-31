package l;

/* JADX INFO: renamed from: l.ܶۨ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: A8DI */
/* JADX INFO: loaded from: classes4.dex */
public final class C15215 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0399 f46696;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f46697 = false;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C8161 f46698;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC22977 f46699;

    public C15215(C8161 c8161, C0399 c0399) {
        AbstractC22977 abstractC22977M39784;
        this.f46698 = c8161;
        this.f46696 = c0399;
        if (c8161.m21633(EnumC1105.CONTENT_CHECKSUM)) {
            C16959.m39782();
            abstractC22977M39784 = C16959.m39784();
        } else {
            abstractC22977M39784 = null;
        }
        this.f46699 = abstractC22977M39784;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m36004(EnumC1105 enumC1105) {
        return this.f46698.m21633(enumC1105);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C8161 m36008() {
        return this.f46698;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C0399 m36006() {
        return this.f46696;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36003(int i, byte[] bArr) {
        this.f46699.mo19983(i, bArr);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m36002() {
        return this.f46699.mo19982();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m36005() {
        this.f46697 = true;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m36007() {
        return this.f46697;
    }
}
