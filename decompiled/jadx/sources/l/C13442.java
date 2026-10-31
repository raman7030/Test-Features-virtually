package l;

import java.util.EnumSet;

/* JADX INFO: renamed from: l.۬᩻۠, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13442 extends AbstractC20708 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20002 f40165;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13442(C20002 c20002, AbstractC10370 abstractC10370, EnumC16970 enumC16970, EnumSet enumSet) {
        super(c20002, abstractC10370, enumC16970, enumSet);
        this.f40165 = c20002;
    }

    @Override // l.AbstractC20708
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo10868(EnumC6596 enumC6596) {
        return super.mo10868(enumC6596) && this.f40165.f64763;
    }

    @Override // l.AbstractC20708
    /* JADX INFO: renamed from: ֫ */
    public final void mo2858(int i, AbstractC5698 abstractC5698) {
        if (abstractC5698.f17559 == EnumC1296.f4582) {
            abstractC5698.f17563 |= 2305843009213693952L;
        }
        C20002 c20002 = this.f40165;
        char cM46124 = c20002.m46124();
        C18837 c18837 = new C18837();
        for (int i2 = 0; i2 < cM46124; i2++) {
            C21221 c21221 = new C21221(abstractC5698, c20002.f64767.m46288(c20002.m46124()), c20002.f64767.m46287(c20002.m46124()));
            c20002.m46119(c21221, EnumC6596.MEMBER);
            c18837.m43511(c21221);
        }
        ((C14163) abstractC5698).m33815(c18837.m43517());
    }
}
