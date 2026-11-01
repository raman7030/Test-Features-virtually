package p067l;

/* JADX INFO: renamed from: l.֡۫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: U4HR */
/* JADX INFO: loaded from: classes3.dex */
public final class C2755 extends AbstractC7450 {
    @Override // p067l.AbstractC7450, p067l.AbstractC10132
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ AbstractC10132 mo4316() {
        mo4316();
        return this;
    }

    public C2755() {
        super(EnumC3426.StartTag);
        this.f19505 = new C16166();
    }

    @Override // p067l.AbstractC7450, p067l.AbstractC10132
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC7450 mo4316() {
        super.mo4316();
        this.f19505 = new C16166();
        return this;
    }

    public final String toString() {
        C16166 c16166 = this.f19505;
        if (c16166 == null || c16166.size() <= 0) {
            return C10965.m25286(new StringBuilder("<"), m17217(), ">");
        }
        return "<" + m17217() + " " + this.f19505.toString() + ">";
    }
}
