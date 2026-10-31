package l;

/* JADX INFO: renamed from: l.ۘᩳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: B7KX */
/* JADX INFO: loaded from: classes3.dex */
public final class C4104 extends C12193 {

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f13047;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public AbstractC4308 f13048;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1755 f13049;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC5515 f13050;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC12612 f13051;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4104(AbstractC5515 abstractC5515, AbstractC4308 abstractC4308, AbstractC19810 abstractC19810, C1755 c1755, boolean z, AbstractC12612 abstractC12612) {
        super(abstractC4308, abstractC19810);
        this.f13050 = abstractC5515;
        this.f13049 = c1755;
        this.f13047 = z;
        this.f13051 = abstractC12612;
    }

    @Override // l.AbstractC4308
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 mo12330() {
        if (this.f13048 == null) {
            C0575 c0575 = new C0575(this.f13050, this.f13049.f6075.f4739, mo12947(), this.f13047);
            this.f13051.mo988(c0575);
            this.f13048 = c0575.f2270;
        }
        return this.f13048;
    }
}
