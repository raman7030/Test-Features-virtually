package p067l;

/* JADX INFO: renamed from: l.ۤܿܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: CBJ0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12289 extends AbstractC6924 {
    @Override // p067l.AbstractC6924
    /* JADX INFO: renamed from: ۧ */
    public final int mo4465() {
        return m15874().m34267().mo9224();
    }

    @Override // p067l.AbstractC6924
    /* JADX INFO: renamed from: ֫ */
    public final void mo4463(C19705 c19705) {
        m15874().m34267().mo9227(c19705, this);
    }

    @Override // p067l.AbstractC6924
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC6924 mo6236(int i) {
        return mo4462(m15873().m48575(i));
    }

    @Override // p067l.AbstractC6924
    /* JADX INFO: renamed from: ܺ */
    public final String mo4466() {
        AbstractC13630 abstractC13630M34267 = m15874().m34267();
        abstractC13630M34267.getClass();
        String strM34269 = m15874().m34269();
        String strMo9225 = abstractC13630M34267.mo9225(this);
        String strMo9228 = abstractC13630M34267.mo9228(this);
        StringBuilder sbM34407 = C15033.m34407(100, strM34269);
        if (strMo9225.length() != 0) {
            sbM34407.append(' ');
            sbM34407.append(strMo9225);
        }
        if (strMo9228.length() != 0) {
            sbM34407.append(" // ");
            sbM34407.append(strMo9228);
        }
        return sbM34407.toString();
    }
}
