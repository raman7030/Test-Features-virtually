package p067l;

/* JADX INFO: renamed from: l.֫ۙۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 09BJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C3882 extends AbstractC6327 {

    /* JADX INFO: renamed from: ܽ */
    public final AbstractC15951 f8419;

    public C3882(int i, AbstractC6327 abstractC6327, AbstractC15951 abstractC15951) {
        super(i, abstractC6327);
        this.f8419 = abstractC15951;
    }

    @Override // p067l.AbstractC6327
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC15773 mo7677(String str, boolean z) {
        AbstractC15951 abstractC15951 = this.f8419;
        abstractC15951.getClass();
        AbstractC15773 abstractC15773Mo7677 = super.mo7677(AbstractC15951.m36202(str), z);
        if (abstractC15773Mo7677 == null) {
            return null;
        }
        int i = this.f16398;
        return new C15713(i, str, abstractC15773Mo7677, abstractC15951).m35771(new C15713(i, null, abstractC15773Mo7677, abstractC15951));
    }

    @Override // p067l.AbstractC6327
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC15773 mo7676(int i, C24431 c24431, String str, boolean z) {
        AbstractC15951 abstractC15951 = this.f8419;
        abstractC15951.getClass();
        AbstractC15773 abstractC15773Mo7676 = super.mo7676(i, c24431, AbstractC15951.m36202(str), z);
        if (abstractC15773Mo7676 == null) {
            return null;
        }
        int i2 = this.f16398;
        return new C15713(i2, str, abstractC15773Mo7676, abstractC15951).m35771(new C15713(i2, null, abstractC15773Mo7676, abstractC15951));
    }
}
