package p067l;

/* JADX INFO: renamed from: l.۫ۧ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14119 {

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ C23663 f40075;

    /* JADX INFO: renamed from: ᩳ */
    public InterfaceC10096 f40078;

    /* JADX INFO: renamed from: ۧ */
    public C4848 f40074 = C4848.m10283();

    /* JADX INFO: renamed from: ܿ */
    public EnumC18298 f40077 = null;

    /* JADX INFO: renamed from: ܽ */
    public boolean f40076 = false;

    /* JADX INFO: renamed from: ֫ */
    public EnumC15511 f40073 = EnumC15511.SPECULATIVE;

    public C14119(C23663 c23663) {
        this.f40075 = c23663;
        this.f40078 = c23663.f75311;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32061(AbstractC7783 abstractC7783, C18258 c18258) {
        this.f40074 = this.f40074.m10286(new C14789(this.f40075.f75305.f40077, abstractC7783, c18258, null));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32060(AbstractC7783 abstractC7783, AbstractC6462 abstractC6462) {
        this.f40074 = this.f40074.m10286(new C14789(this.f40075.f75305.f40077, abstractC7783, null, abstractC6462));
    }

    /* JADX INFO: renamed from: ֫ */
    public final C8788 m32058(AbstractC7783 abstractC7783, C2733 c2733, C24626 c24626, C3686 c3686) {
        C8788 c8788Mo6101;
        C23663 c23663 = this.f40075;
        if (c24626 == null) {
            c8788Mo6101 = c23663.f75332.f40370;
        } else {
            c8788Mo6101 = c24626.f77961.mo6101();
        }
        C14152 c14152 = c23663.f75332;
        C12826.requireNonNull(c14152);
        return new C8788(c14152, this.f40073, abstractC7783, this.f40077, c2733, c8788Mo6101, c3686);
    }

    /* JADX INFO: renamed from: ֫ */
    public final EnumC15511 m32059() {
        return this.f40073;
    }
}
