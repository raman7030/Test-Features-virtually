package p067l;

/* JADX INFO: renamed from: l.ܳۢ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: O44L */
/* JADX INFO: loaded from: classes3.dex */
public final class C16091 {

    /* JADX INFO: renamed from: ֫ */
    public C3666 f47348;

    /* JADX INFO: renamed from: ܳ */
    public C8374 f47350;

    /* JADX INFO: renamed from: ᩳ */
    public C22004 f47353;

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC9701[] f47349 = new AbstractC9701[9];

    /* JADX INFO: renamed from: ᩻ */
    public final C14395 f47354 = new C14395(this, 8);

    /* JADX INFO: renamed from: ܿ */
    public final C18103 f47352 = new C18103(this, false);

    /* JADX INFO: renamed from: ܽ */
    public final C18103 f47351 = new C18103(this, true);

    public C16091(C3666 c3666, C22004 c22004, C8374 c8374) {
        this.f47348 = c3666;
        this.f47350 = c8374;
        for (int i = 0; i < 8; i++) {
            this.f47349[i] = new C19445(this, i);
        }
        this.f47349[8] = this.f47354;
        this.f47353 = c22004;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C18103 m36603() {
        return this.f47352;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C18103 m36602() {
        return this.f47351;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC9701 m36601(AbstractC6462 abstractC6462) {
        return this.f47349[C3666.m7020(abstractC6462)];
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4022 m36599(C13818 c13818) {
        return new C4022(this, c13818.mo18010(this.f47350), c13818.f39049);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C8360 m36600(int i) {
        return new C8360(this, i, null, null);
    }
}
