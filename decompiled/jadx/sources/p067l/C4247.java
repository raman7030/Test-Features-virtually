package p067l;

import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.֫ܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4247 extends AbstractC18898 {

    /* JADX INFO: renamed from: j */
    public final C12233 f9408j;

    public C4247(C12233 c12233, AbstractC14463 abstractC14463, InterfaceC16847 interfaceC16847) {
        super(abstractC14463, interfaceC16847);
        this.f9408j = c12233;
    }

    public C4247(C4247 c4247, InterfaceC16847 interfaceC16847) {
        super(c4247, interfaceC16847);
        this.f9408j = c4247.f9408j;
    }

    @Override // p067l.AbstractC14874
    /* JADX INFO: renamed from: c */
    public final AbstractC14874 mo8156c(InterfaceC16847 interfaceC16847) {
        return new C4247(this, interfaceC16847);
    }

    @Override // p067l.AbstractC14874
    /* JADX INFO: renamed from: a */
    public final Object mo8155a() {
        AbstractC11111 abstractC11111 = this.f42401a;
        AbstractC4938 abstractC4938 = (AbstractC4938) ((Supplier) this.f9408j.f34178c).get();
        abstractC11111.mo25629f0(this.f42402b, abstractC4938);
        boolean z = abstractC4938.f11242b;
        if (z == ((EnumC21702) this.f9408j.f34177b).f68338b) {
            Boolean boolValueOf = Boolean.valueOf(z);
            AtomicReference atomicReference = this.f56420h;
            while (!atomicReference.compareAndSet(null, boolValueOf) && atomicReference.get() == null) {
            }
        }
        return null;
    }

    @Override // p067l.AbstractC18898
    /* JADX INFO: renamed from: h */
    public final Object mo8627h() {
        return Boolean.valueOf(!((EnumC21702) this.f9408j.f34177b).f68338b);
    }
}
