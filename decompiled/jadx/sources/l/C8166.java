package l;

/* JADX INFO: renamed from: l.۠۫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: W7SR */
/* JADX INFO: loaded from: classes4.dex */
public class C8166 extends AbstractC20536 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C6755 f25167;

    @Override // l.C2086, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public AbstractC4308 mo2140(Object obj, AbstractC4308 abstractC4308) {
        return !abstractC4308.m12913(EnumC9454.DEFERRED) ? abstractC4308 : mo2259((C1110) abstractC4308, obj);
    }

    /* JADX INFO: renamed from: ֫ */
    public AbstractC4308 mo2259(C1110 c1110, Object obj) {
        C6755 c6755 = this.f25167;
        int iOrdinal = c6755.f20970.ordinal();
        if (iOrdinal == 0) {
            return c1110.mo3821(c6755.f20972, c6755.f20969);
        }
        if (iOrdinal == 1) {
            AbstractC4308 abstractC4308 = c1110.f4048.f16086;
            return abstractC4308 == null ? AbstractC4308.f13885 : abstractC4308;
        }
        C12171.m29636();
        throw null;
    }

    public C8166(C12399 c12399, EnumC13829 enumC13829, AbstractC5698 abstractC5698, EnumC16761 enumC16761) {
        this.f25167 = new C6755(c12399, enumC13829, abstractC5698, enumC16761, c12399.f37349.f20931, c12399.f37355, c12399.f37343.f19598);
    }
}
