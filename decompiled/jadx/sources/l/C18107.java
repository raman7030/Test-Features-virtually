package l;

/* JADX INFO: renamed from: l.ᩳܳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 01M8 */
/* JADX INFO: loaded from: classes5.dex */
public class C18107 extends AbstractC17401 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C6112 f56362;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C6112 f56363;

    @Override // l.AbstractC17401
    /* JADX INFO: renamed from: ֫ */
    public void mo34827(int i, int i2, int i3, int i4) {
        C6112 c6112 = new C6112(i, i2, i3 - i, i4 - i2);
        C6112 c6113 = this.f56362;
        if (c6113 != null) {
            c6113.f18731 = c6112;
        } else {
            this.f56363 = c6112;
        }
        this.f56362 = c6112;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1879 m42227() {
        m40749();
        return new C23129(this.f56363, m40755(), m40754());
    }
}
