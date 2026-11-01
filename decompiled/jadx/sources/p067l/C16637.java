package p067l;

/* JADX INFO: renamed from: l.ܶۚ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 34PY */
/* JADX INFO: loaded from: classes5.dex */
public class C16637 extends C10485 {

    /* JADX INFO: renamed from: ᩺ */
    public C21215 f48907;

    @Override // p067l.C10485
    /* JADX INFO: renamed from: ۫֫ */
    public final boolean mo24195() {
        return true;
    }

    public C16637(AbstractC12224 abstractC12224, AbstractC7783 abstractC7783, AbstractC6462 abstractC6462, AbstractC6462 abstractC6463, C21215 c21215) {
        super(abstractC7783, abstractC6463, abstractC12224);
        this.f29021 = abstractC6463;
        mo23233(abstractC6462);
        this.f48907 = c21215;
    }

    @Override // p067l.C10485, p067l.AbstractC6462
    /* JADX INFO: renamed from: ֫ */
    public final C16637 mo3770(C22082 c22082) {
        AbstractC21195 abstractC21195 = this.f16705;
        AbstractC6462 abstractC6462Mo14803 = mo14803();
        mo14803();
        return new C9933(this, abstractC21195, abstractC6462Mo14803, this.f29021, this.f48907, c22082);
    }

    @Override // p067l.C10485, p067l.AbstractC6462
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5291(InterfaceC22556 interfaceC22556, Object obj) {
        return interfaceC22556.mo4510(this, obj);
    }

    @Override // p067l.AbstractC6462, p067l.InterfaceC7730
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        m14775(sb, false);
        sb.append("capture#");
        sb.append((((long) hashCode()) & 4294967295L) % 997);
        sb.append(" of ");
        sb.append(this.f48907);
        return sb.toString();
    }
}
