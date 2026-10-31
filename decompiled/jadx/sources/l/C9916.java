package l;

import java.util.EnumSet;

/* JADX INFO: renamed from: l.ۢ᩻۠, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9916 extends AbstractC20708 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20002 f29989;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9916(C20002 c20002, AbstractC10370 abstractC10370, EnumC16970 enumC16970, EnumSet enumSet) {
        super(c20002, abstractC10370, enumC16970, enumSet);
        this.f29989 = c20002;
    }

    @Override // l.AbstractC20708
    /* JADX INFO: renamed from: ֫ */
    public final void mo2858(int i, AbstractC5698 abstractC5698) {
        EnumC1296 enumC1296 = abstractC5698.f17559;
        EnumC1296 enumC1297 = EnumC1296.f4582;
        C20002 c20002 = this.f29989;
        if (enumC1296 == enumC1297) {
            C14163 c14163 = (C14163) abstractC5698;
            boolean z = true;
            c20002.f64754 = true;
            try {
                C19955 c19955 = (C19955) c14163.f17560;
                if (c14163 != c20002.f64760) {
                    z = false;
                }
                C12171.m29642(z);
                AbstractC10370 abstractC10370M46287 = c20002.f64767.m46287(c20002.m46124());
                byte[] bArrMo2757 = abstractC10370M46287.mo2757();
                int iMo2761 = abstractC10370M46287.mo2761();
                int iMo2759 = abstractC10370M46287.mo2759();
                c20002.f64774 = bArrMo2757;
                c20002.f64776 = iMo2761;
                c20002.f64764 = iMo2761 + iMo2759;
                c19955.f64616 = c20002.m46134();
                c19955.f64618 = c20002.m46135();
                C18837 c18837 = new C18837();
                while (c20002.f64776 != c20002.f64764) {
                    c18837.m43511(c20002.m46135());
                }
                c19955.f64620 = c18837.m43517();
                return;
            } finally {
                c20002.f64754 = false;
            }
        }
        C2609 c2609Mo12930 = abstractC5698.f17560.mo12930();
        AbstractC4308 abstractC4308M46288 = c20002.f64767.m46288(c20002.m46124());
        abstractC5698.f17560 = abstractC4308M46288;
        if (abstractC5698.f17559 == EnumC1296.f4571 && abstractC4308M46288.mo12930().isEmpty()) {
            abstractC5698.f17560.mo12945().f32061 = c2609Mo12930;
        }
    }
}
