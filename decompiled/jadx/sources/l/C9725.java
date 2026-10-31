package l;

/* JADX INFO: renamed from: l.ۢܿۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31MV */
/* JADX INFO: loaded from: classes3.dex */
public final class C9725 extends AbstractC16073 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final CharSequence f29471;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C13272 f29472;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final CharSequence f29473;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C13272 f29474;

    public C9725(C13272 c13272, C13272 c13273, CharSequence charSequence, CharSequence charSequence2, InterfaceC6818 interfaceC6818, C4701 c4701) {
        super(charSequence.length(), charSequence2.length(), interfaceC6818, c4701);
        this.f29472 = c13272;
        this.f29474 = c13273;
        this.f29471 = charSequence;
        this.f29473 = charSequence2;
    }

    @Override // l.AbstractC16073
    /* JADX INFO: renamed from: ֫ */
    public final void mo23270(int i, int i2, int i3, int i4) {
        for (C22340 c22340 : C12567.m30804(this.f29471.subSequence(i, i2), this.f29473.subSequence(i3, i4), this.f49545).mo6219()) {
            int i5 = c22340.f72397;
            this.f49543.m40750(i + i5, c22340.f72398 + i3, c22340.f72395 - i5);
        }
    }

    @Override // l.AbstractC16073
    /* JADX INFO: renamed from: ֫ */
    public final C21635 mo23269(int i) {
        C13272 c13272 = this.f29472;
        return new C21635(c13272.f39743[i], c13272.m32237(i));
    }

    @Override // l.AbstractC16073
    /* JADX INFO: renamed from: ۧ */
    public final C21635 mo23271(int i) {
        C13272 c13272 = this.f29474;
        return new C21635(c13272.f39743[i], c13272.m32237(i));
    }
}
