package l;

import java.util.function.Predicate;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.۫ܰᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12453 implements InterfaceC21048 {
    public final int a;
    public final Object b;
    public final Predicate c;
    public final Supplier d;

    public C12453(boolean z, EnumC8578 enumC8578, Object obj, Predicate predicate, Supplier supplier) {
        this.a = (z ? 0 : EnumC7330.r) | EnumC7330.u;
        this.b = obj;
        this.c = predicate;
        this.d = supplier;
    }

    @Override // l.InterfaceC21048
    public final int j() {
        return this.a;
    }

    @Override // l.InterfaceC21048
    public final Object b(AbstractC12725 abstractC12725, InterfaceC15234 interfaceC15234) {
        InterfaceC8347 interfaceC8347 = (InterfaceC8347) this.d.get();
        abstractC12725.f0(interfaceC15234, interfaceC8347);
        Object obj = interfaceC8347.get();
        return obj != null ? obj : this.b;
    }

    @Override // l.InterfaceC21048
    public final Object e(AbstractC9198 abstractC9198, InterfaceC15234 interfaceC15234) {
        AbstractC12725 abstractC12725 = (AbstractC12725) abstractC9198;
        return new C2934(this, EnumC7330.ORDERED.s(abstractC12725.m), abstractC12725, interfaceC15234).invoke();
    }
}
