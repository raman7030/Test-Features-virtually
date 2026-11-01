package p067l;

/* JADX INFO: renamed from: l.ܽۡ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 945B */
/* JADX INFO: loaded from: classes5.dex */
public final class C18083 extends AbstractC6580 {

    /* JADX INFO: renamed from: ۨ */
    public final int f53992;

    /* JADX INFO: renamed from: ᩳ */
    public static C18083 m41136(AbstractC6462 abstractC6462) {
        return new C18083(EnumC11353.UNINITIALIZED_THIS, abstractC6462, -1, abstractC6462.m14785());
    }

    /* JADX INFO: renamed from: ֫ */
    public static C18083 m41135(int i, AbstractC6462 abstractC6462) {
        return new C18083(EnumC11353.UNINITIALIZED_OBJECT, abstractC6462, i, abstractC6462.m14785());
    }

    public C18083(EnumC11353 enumC11353, AbstractC6462 abstractC6462, int i, C22082 c22082) {
        super(enumC11353, abstractC6462, c22082);
        this.f53992 = i;
    }

    @Override // p067l.AbstractC6462
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6462 mo3770(C22082 c22082) {
        return new C18083(this.f16991, this.f16992, this.f53992, c22082);
    }
}
