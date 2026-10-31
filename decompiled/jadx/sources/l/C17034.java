package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.ܿ֫۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17034 extends AbstractC18009 {

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22406 f52209;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17034(C22406 c22406, AbstractC10370 abstractC10370, AbstractC4308 abstractC4308, C2609 c2609, C2609 c26010) {
        super(c22406, abstractC10370, abstractC4308, c2609, c26010);
        this.f52209 = c22406;
    }

    @Override // l.AbstractC18009
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC5698 mo17829(C1755 c1755, EnumC16761 enumC16761) {
        AbstractC4308 abstractC4308 = this.f3940;
        enumC16761.m39435();
        return this.f52209.m50306(c1755, abstractC4308, this.f3938, this.f3936, this.f3939, enumC16761.m39436());
    }

    @Override // l.AbstractC18009, l.AbstractC1075
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC5698 mo3658(C1755 c1755, InterfaceC3109 interfaceC3109, AbstractC5698 abstractC5698, AbstractC5698 abstractC5699) {
        if (abstractC5699.f17559.m4393()) {
            return super.mo3658(c1755, interfaceC3109, abstractC5698, abstractC5699);
        }
        C3581 c3581 = (C3581) abstractC5699;
        if ((c3581.f17563 & 70368744177664L) == 0) {
            return abstractC5699;
        }
        ((C8604) c1755.f6073).f26288 = EnumC16761.f51454;
        C22406 c22406 = this.f52209;
        C6735 c6735 = c22406.f72586;
        C12364 c12364 = c22406.f72579;
        C20661 c20661 = c6735.f20922;
        AbstractC4308 abstractC4308Mo12923 = c3581.f17560.mo12923();
        int i = C1631.f5724[c1755.f6072.f6074.mo989().ordinal()];
        if (i == 1) {
            C17844 c17844 = (C17844) c1755.f6072.f6074;
            if (C7260.m19458(c17844.f54512) == c1755.f6074) {
                abstractC4308Mo12923 = c17844.f54511.f16086;
            }
        } else if (i == 2 && C7260.m19458(((C10496) c1755.f6072.f6074).f31483) == c1755.f6074) {
            abstractC4308Mo12923 = c20661.f66501;
        }
        return c22406.m50318(abstractC5699, new C10658(this.f3936.m8243((Function) new C15035(c6735, c3581, c12364.f37061)), abstractC4308Mo12923, c3581.f17560.mo12930(), c20661.f66481));
    }
}
