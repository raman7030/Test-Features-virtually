package p067l;

/* JADX INFO: renamed from: l.ܿۙۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: U9BR */
/* JADX INFO: loaded from: classes5.dex */
public final class C18634 extends AbstractC6997 {

    /* JADX INFO: renamed from: ܽ */
    public final AbstractC15951 f55628;

    public C18634(int i, AbstractC6997 abstractC6997, AbstractC15951 abstractC15951) {
        super(i, abstractC6997);
        this.f55628 = abstractC15951;
    }

    @Override // p067l.AbstractC6997
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC15773 mo12602(String str, boolean z) {
        AbstractC15951 abstractC15951 = this.f55628;
        abstractC15951.getClass();
        AbstractC15773 abstractC15773Mo12602 = super.mo12602(AbstractC15951.m36202(str), z);
        if (abstractC15773Mo12602 == null) {
            return null;
        }
        int i = this.f18222;
        return new C15713(i, str, abstractC15773Mo12602, abstractC15951).m35771(new C15713(i, null, abstractC15773Mo12602, abstractC15951));
    }

    @Override // p067l.AbstractC6997
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC15773 mo12601(int i, C24431 c24431, String str, boolean z) {
        AbstractC15951 abstractC15951 = this.f55628;
        abstractC15951.getClass();
        AbstractC15773 abstractC15773Mo12601 = super.mo12601(i, c24431, AbstractC15951.m36202(str), z);
        if (abstractC15773Mo12601 == null) {
            return null;
        }
        int i2 = this.f18222;
        return new C15713(i2, str, abstractC15773Mo12601, abstractC15951).m35771(new C15713(i2, null, abstractC15773Mo12601, abstractC15951));
    }
}
