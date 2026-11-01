package p067l;

/* JADX INFO: renamed from: l.ᩴ᩹ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0BJO */
/* JADX INFO: loaded from: classes5.dex */
public final class C20469 extends AbstractC23151 {

    /* JADX INFO: renamed from: ۧ */
    public final C8198 f63211;

    public C20469(AbstractC22481 abstractC22481) {
        this.f72742 = abstractC22481;
        this.f63211 = new C8198(abstractC22481);
    }

    @Override // p067l.AbstractC22481
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo5092(C21199 c21199, C21199 c211910) {
        for (int i = 0; i < c211910.mo12957(); i++) {
            AbstractC13152 abstractC13152M30131 = c211910.m30131(i);
            if ((abstractC13152M30131 instanceof C21199) && this.f63211.m18987(c211910, (C21199) abstractC13152M30131) != null) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return String.format(":has(%s)", this.f72742);
    }
}
