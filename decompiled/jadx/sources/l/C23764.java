package l;

import java.util.function.IntFunction;
import java.util.function.IntPredicate;

/* JADX INFO: renamed from: l.᩻ܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C23764 extends AbstractC7081 {
    public final /* synthetic */ IntPredicate s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23764(AbstractC6375 abstractC6375, int i, IntPredicate intPredicate) {
        super(abstractC6375, i);
        this.s = intPredicate;
    }

    @Override // l.AbstractC12725
    public final InterfaceC15234 o0(AbstractC12725 abstractC12725, InterfaceC15234 interfaceC15234) {
        return EnumC7330.ORDERED.s(abstractC12725.m) ? n0(abstractC12725, interfaceC15234, new C23742(25)).spliterator() : new C13948((InterfaceC18764) abstractC12725.h0(interfaceC15234), this.s);
    }

    @Override // l.AbstractC12725
    public final InterfaceC5214 n0(AbstractC9198 abstractC9198, InterfaceC15234 interfaceC15234, IntFunction intFunction) {
        return (InterfaceC5214) new C15901(this, abstractC9198, interfaceC15234, intFunction).invoke();
    }

    @Override // l.AbstractC12725
    public final InterfaceC0585 q0(int i, InterfaceC0585 interfaceC0585) {
        return new C6209(this, interfaceC0585);
    }
}
