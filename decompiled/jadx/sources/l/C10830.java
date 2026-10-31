package l;

import java.util.EnumSet;

/* JADX INFO: renamed from: l.ۧۜ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10830 extends AbstractC20708 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20002 f32574;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10830(C20002 c20002, AbstractC10370 abstractC10370, EnumC16970 enumC16970, EnumSet enumSet) {
        super(c20002, abstractC10370, enumC16970, enumSet);
        this.f32574 = c20002;
    }

    @Override // l.AbstractC20708
    /* JADX INFO: renamed from: ֫ */
    public final void mo2858(int i, AbstractC5698 abstractC5698) {
        C14163 c14163 = (C14163) abstractC5698;
        C20002 c20002 = this.f32574;
        AbstractC10370 abstractC10370M46287 = c20002.f64767.m46287(c20002.m46124());
        c14163.f42770 = new C8007(abstractC10370M46287);
        String string = abstractC10370M46287.toString();
        if (c14163.f17561.f17559 == EnumC1296.f4579 && string.endsWith(".java") && !string.equals(c14163.f17562.toString().concat(".java"))) {
            c14163.f17563 |= 17592186044416L;
        }
    }
}
