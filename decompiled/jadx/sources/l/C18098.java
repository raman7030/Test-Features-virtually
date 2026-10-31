package l;

import java.util.function.IntFunction;
import java.util.function.LongPredicate;

/* JADX INFO: renamed from: l.ᩳܰᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18098 extends AbstractC12269 {
    public final /* synthetic */ LongPredicate s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18098(AbstractC19162 abstractC19162, int i, LongPredicate longPredicate) {
        super(abstractC19162, i);
        this.s = longPredicate;
    }

    @Override // l.AbstractC12725
    public final InterfaceC15234 o0(AbstractC12725 abstractC12725, InterfaceC15234 interfaceC15234) {
        return EnumC7330.ORDERED.s(abstractC12725.m) ? n0(abstractC12725, interfaceC15234, new C23742(27)).spliterator() : new C23163((InterfaceC0418) abstractC12725.h0(interfaceC15234), this.s);
    }

    @Override // l.AbstractC12725
    public final InterfaceC5214 n0(AbstractC9198 abstractC9198, InterfaceC15234 interfaceC15234, IntFunction intFunction) {
        return (InterfaceC5214) new C15901(this, abstractC9198, interfaceC15234, intFunction).invoke();
    }

    @Override // l.AbstractC12725
    public final InterfaceC0585 q0(int i, InterfaceC0585 interfaceC0585) {
        return new C13430(this, interfaceC0585);
    }
}
