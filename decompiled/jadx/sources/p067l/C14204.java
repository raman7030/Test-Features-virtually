package p067l;

import java.util.function.Predicate;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.۫ܰᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14204 implements InterfaceC22373 {

    /* JADX INFO: renamed from: a */
    public final int f40473a;

    /* JADX INFO: renamed from: b */
    public final Object f40474b;

    /* JADX INFO: renamed from: c */
    public final Predicate f40475c;

    /* JADX INFO: renamed from: d */
    public final Supplier f40476d;

    public C14204(boolean z, EnumC10521 enumC10521, Object obj, Predicate predicate, Supplier supplier) {
        this.f40473a = (z ? 0 : EnumC9335.f25423r) | EnumC9335.f25426u;
        this.f40474b = obj;
        this.f40475c = predicate;
        this.f40476d = supplier;
    }

    @Override // p067l.InterfaceC22373
    /* JADX INFO: renamed from: j */
    public final int mo23312j() {
        return this.f40473a;
    }

    @Override // p067l.InterfaceC22373
    /* JADX INFO: renamed from: b */
    public final Object mo10392b(AbstractC14463 abstractC14463, InterfaceC16847 interfaceC16847) {
        InterfaceC10302 interfaceC10302 = (InterfaceC10302) this.f40476d.get();
        abstractC14463.mo25629f0(interfaceC16847, interfaceC10302);
        Object obj = interfaceC10302.get();
        return obj != null ? obj : this.f40474b;
    }

    @Override // p067l.InterfaceC22373
    /* JADX INFO: renamed from: e */
    public final Object mo10393e(AbstractC11111 abstractC11111, InterfaceC16847 interfaceC16847) {
        AbstractC14463 abstractC14463 = (AbstractC14463) abstractC11111;
        return new C5157(this, EnumC9335.ORDERED.m21660s(abstractC14463.f41316m), abstractC14463, interfaceC16847).invoke();
    }
}
