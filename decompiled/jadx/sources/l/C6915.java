package l;

import java.util.function.IntFunction;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۜܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6915 extends AbstractC20573 implements InterfaceC2228 {
    public final /* synthetic */ int s;
    public final /* synthetic */ Predicate t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6915(AbstractC11401 abstractC11401, int i, Predicate predicate, int i2) {
        super(abstractC11401, i);
        this.s = i2;
        this.t = predicate;
    }

    @Override // l.AbstractC12725
    public final InterfaceC15234 o0(AbstractC12725 abstractC12725, InterfaceC15234 interfaceC15234) {
        switch (this.s) {
            case 0:
                return EnumC7330.ORDERED.s(abstractC12725.m) ? n0(abstractC12725, interfaceC15234, new C23742(11)).spliterator() : new C8326(abstractC12725.h0(interfaceC15234), this.t, 1);
            default:
                return EnumC7330.ORDERED.s(abstractC12725.m) ? n0(abstractC12725, interfaceC15234, new C23742(11)).spliterator() : new C8326(abstractC12725.h0(interfaceC15234), this.t, 0);
        }
    }

    @Override // l.AbstractC12725
    public final InterfaceC5214 n0(AbstractC9198 abstractC9198, InterfaceC15234 interfaceC15234, IntFunction intFunction) {
        switch (this.s) {
            case 0:
                return (InterfaceC5214) new C15901(this, abstractC9198, interfaceC15234, intFunction).invoke();
            default:
                return (InterfaceC5214) new C1791(this, abstractC9198, interfaceC15234, intFunction).invoke();
        }
    }

    @Override // l.InterfaceC2228
    public InterfaceC19868 d(InterfaceC8948 interfaceC8948, boolean z) {
        return new C1270(this, interfaceC8948, z);
    }

    @Override // l.AbstractC12725
    public final InterfaceC0585 q0(int i, InterfaceC0585 interfaceC0585) {
        switch (this.s) {
            case 0:
                return new C20136(this, interfaceC0585);
            default:
                return new C1270(this, interfaceC0585, false);
        }
    }
}
