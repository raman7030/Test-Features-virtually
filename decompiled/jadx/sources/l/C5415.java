package l;

/* JADX INFO: renamed from: l.ۚܳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2BA4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5415 extends AbstractC10438 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C15375 f16895;

    public C5415(C13259 c13259, C10191 c10191, C20069 c20069, C15375 c15375) {
        super(c13259, c10191, c20069);
        if (c15375 == null) {
            throw new NullPointerException("target == null");
        }
        this.f16895 = c15375;
    }

    @Override // l.AbstractC4793
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC4793 mo3993(C13259 c13259) {
        return new C5415(c13259, m13983(), m13993(), this.f16895);
    }

    @Override // l.AbstractC4793
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC4793 mo2081(C20069 c20069) {
        return new C5415(m13994(), m13983(), c20069, this.f16895);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C15375 m15495() {
        return this.f16895;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int m15496() {
        return this.f16895.m13990();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m15497() {
        return this.f16895.m13990() - m13990();
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m15498() {
        return m13985() && this.f16895.m13985();
    }

    @Override // l.AbstractC4793
    /* JADX INFO: renamed from: ֫ */
    public final String mo2080() {
        C15375 c15375 = this.f16895;
        return c15375 == null ? "????" : c15375.m13984();
    }
}
