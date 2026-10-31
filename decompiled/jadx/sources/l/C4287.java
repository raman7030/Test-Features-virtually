package l;

/* JADX INFO: renamed from: l.ۙ֡֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 643O */
/* JADX INFO: loaded from: classes3.dex */
public final class C4287 extends AbstractC19810 implements InterfaceC16223 {
    public C4287(long j, AbstractC10370 abstractC10370, C8541 c8541, AbstractC5698 abstractC5698) {
        super(EnumC1296.f4582, j, abstractC10370, c8541, abstractC5698);
    }

    @Override // l.AbstractC5698, l.InterfaceC11970
    /* JADX INFO: renamed from: ֫ */
    public final EnumC23258 mo952() {
        return EnumC23258.TYPE_PARAMETER;
    }

    @Override // l.AbstractC19810, l.AbstractC5698, l.InterfaceC11970
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C2609 mo7180() {
        C2609<C6507> c2609Mo16081 = this.f17561.mo16081();
        int iIndexOf = this.f17561.mo7178().indexOf(this);
        C2609 c2609M8239 = C2609.m8239();
        for (C6507 c6507 : c2609Mo16081) {
            C9953 c9953 = c6507.f50415;
            EnumC9372 enumC9372 = c9953.f30045;
            if (enumC9372 == EnumC9372.CLASS_TYPE_PARAMETER || enumC9372 == EnumC9372.METHOD_TYPE_PARAMETER) {
                if (c9953.f30048 == iIndexOf) {
                    c2609M8239 = c2609M8239.m8246(c6507);
                }
            }
        }
        return c2609M8239.m8250();
    }

    @Override // l.InterfaceC11970
    /* JADX INFO: renamed from: ֫ */
    public final Object mo951(AbstractC8463 abstractC8463, Object obj) {
        return abstractC8463.mo10388(this, obj);
    }
}
