package l;

/* JADX INFO: renamed from: l.ܶᩳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: B7KX */
/* JADX INFO: loaded from: classes4.dex */
public class C15391 implements InterfaceC21743 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C3581 f47126;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AbstractC4308 f47127;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public AbstractC19810 f47128;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11139 f47129;

    @Override // l.InterfaceC21743
    /* JADX INFO: renamed from: ֫ */
    public C8526 mo20425(C8526 c8526) {
        return c8526;
    }

    public C15391(C11139 c11139, AbstractC19810 abstractC19810) {
        this.f47129 = c11139;
        this.f47128 = abstractC19810;
    }

    @Override // l.InterfaceC21743
    /* JADX INFO: renamed from: ֫ */
    public AbstractC4308 mo20424() {
        if (this.f47127 == null) {
            C2609 c2609M8239 = C2609.m8239();
            C11139 c11139 = this.f47129;
            this.f47127 = new C10658(c2609M8239, c11139.f33440.f66501, C2609.m8239(), c11139.f33440.f66481);
        }
        return this.f47127;
    }

    @Override // l.InterfaceC21743
    /* JADX INFO: renamed from: ᩳ */
    public C3581 mo20426() {
        if (this.f47126 == null) {
            AbstractC19810 abstractC19810 = this.f47128;
            long jMo16084 = abstractC19810.mo16084() & 16384;
            C11139 c11139 = this.f47129;
            this.f47126 = new C3581((jMo16084 == 0 || c11139.f33442.m17562(abstractC19810.f17560).f13890 != c11139.f33440.f66527) ? (abstractC19810.mo16084() & 7) | 68719476736L : 68719476738L, c11139.f33438.f18879, mo20424(), this.f47128);
        }
        return this.f47126;
    }

    @Override // l.InterfaceC21743
    /* JADX INFO: renamed from: ܽ */
    public AbstractC4308 mo21938() {
        return AbstractC4308.f13885;
    }

    @Override // l.InterfaceC21743
    /* JADX INFO: renamed from: ۧ */
    public C2609 mo21937() {
        return C2609.m8239();
    }
}
