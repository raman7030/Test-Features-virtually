package l;

/* JADX INFO: renamed from: l.ۡܽ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9001 extends AbstractC1075 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C9232 f27349;

    /* JADX INFO: renamed from: ֫ */
    public AbstractC9001 mo9814(C0384 c0384) {
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract EnumC20521 mo9815(AbstractC5698 abstractC5698);

    public AbstractC9001(AbstractC4308 abstractC4308, EnumC16761 enumC16761, C9232 c9232, C2609 c2609, C2609 c26010, AbstractC10370 abstractC10370) {
        super(abstractC10370, abstractC4308, c2609, c26010, enumC16761);
        this.f27349 = c9232;
    }

    @Override // l.AbstractC1075
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC5698 mo3658(C1755 c1755, InterfaceC3109 interfaceC3109, AbstractC5698 abstractC5698, AbstractC5698 abstractC5699) {
        if (abstractC5699.f17559 != EnumC1296.f4566) {
            return abstractC5699;
        }
        C11391 c11391 = (C11391) abstractC5699.mo7048();
        AbstractC4308 abstractC4308 = this.f3940;
        return (AbstractC5698) c11391.f34080.f72597.m17497(c11391.f34081.m8250(), abstractC4308, true).orElse(c11391);
    }
}
