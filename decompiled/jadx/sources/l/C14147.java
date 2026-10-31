package l;

import java.util.EnumSet;

/* JADX INFO: renamed from: l.ܰ᩻۠, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14147 extends AbstractC20708 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20002 f42697;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14147(C20002 c20002, AbstractC10370 abstractC10370, EnumC16970 enumC16970, EnumSet enumSet) {
        super(c20002, abstractC10370, enumC16970, enumSet);
        this.f42697 = c20002;
    }

    @Override // l.AbstractC20708
    /* JADX INFO: renamed from: ֫ */
    public final void mo2858(int i, AbstractC5698 abstractC5698) {
        C20002 c20002 = this.f42697;
        char cM46124 = c20002.m46124();
        C2609 c2609M8239 = C2609.m8239();
        for (int i2 = 0; i2 < cM46124; i2++) {
            c2609M8239 = c2609M8239.m8246(c20002.f64767.m46280(c20002.m46124()).f17560);
        }
        if (abstractC5698.f17560.mo12930().isEmpty()) {
            abstractC5698.f17560.mo12945().f32061 = c2609M8239.m8250();
        }
    }
}
