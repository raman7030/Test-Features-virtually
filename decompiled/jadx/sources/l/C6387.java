package l;

import java.util.EnumSet;

/* JADX INFO: renamed from: l.ۛ᩻۠, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6387 extends AbstractC20708 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20002 f19756;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6387(C20002 c20002, AbstractC10370 abstractC10370, EnumC16970 enumC16970, EnumSet enumSet) {
        super(c20002, abstractC10370, enumC16970, enumSet);
        this.f19756 = c20002;
    }

    @Override // l.AbstractC20708
    /* JADX INFO: renamed from: ֫ */
    public final void mo2858(int i, AbstractC5698 abstractC5698) {
        C20002 c20002 = this.f19756;
        if (!c20002.f64786) {
            c20002.f64769 += i;
            return;
        }
        c20002.m46124();
        c20002.m46124();
        c20002.f64769 += c20002.m46128();
        c20002.f64769 = (c20002.m46124() * '\b') + c20002.f64769;
        c20002.m46119(abstractC5698, EnumC6596.MEMBER);
        ((C3581) abstractC5698).f11368 = null;
    }
}
