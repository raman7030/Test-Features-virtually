package l;

/* JADX INFO: renamed from: l.֨᩻۠, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1448 extends C19955 {

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public boolean f5162;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20002 f5163;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1448(C20002 c20002, AbstractC4308 abstractC4308, C2609 c2609, C14163 c14163) {
        super(c14163, abstractC4308, c2609);
        this.f5163 = c20002;
        this.f5162 = false;
    }

    @Override // l.C19955, l.AbstractC4308
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 mo4958() {
        C6319 c6319 = this.f5163.f64756;
        if (!this.f5162) {
            this.f5162 = true;
            this.f13890.m16103();
            AbstractC4308 abstractC4308Mo4958 = this.f13890.f17560.mo4958();
            C11488 c11488 = AbstractC4308.f13885;
            if (abstractC4308Mo4958 != c11488) {
                C2609 c2609Mo12934 = super.mo4958().mo12934();
                C2609 c2609Mo12935 = abstractC4308Mo4958.mo12934();
                if (c2609Mo12935.m8245() != c2609Mo12934.m8245()) {
                    super.mo4959(c6319.m17519(abstractC4308Mo4958));
                } else {
                    super.mo4959(c6319.m17488(abstractC4308Mo4958, c2609Mo12935, c2609Mo12934));
                }
            } else {
                super.mo4959(c11488);
            }
        }
        return super.mo4958();
    }

    @Override // l.C19955
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void mo4959(AbstractC4308 abstractC4308) {
        throw new UnsupportedOperationException();
    }
}
