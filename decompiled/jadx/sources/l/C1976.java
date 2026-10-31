package l;

import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.֫ܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1976 extends AbstractC17392 {
    public final C10379 j;

    public C1976(C10379 c10379, AbstractC12725 abstractC12725, InterfaceC15234 interfaceC15234) {
        super(abstractC12725, interfaceC15234);
        this.j = c10379;
    }

    public C1976(C1976 c1976, InterfaceC15234 interfaceC15234) {
        super(c1976, interfaceC15234);
        this.j = c1976.j;
    }

    @Override // l.AbstractC13158
    public final AbstractC13158 c(InterfaceC15234 interfaceC15234) {
        return new C1976(this, interfaceC15234);
    }

    @Override // l.AbstractC13158
    public final Object a() {
        AbstractC9198 abstractC9198 = this.a;
        AbstractC2703 abstractC2703 = (AbstractC2703) ((Supplier) this.j.c).get();
        abstractC9198.f0(this.b, abstractC2703);
        boolean z = abstractC2703.b;
        if (z == ((EnumC20342) this.j.b).b) {
            Boolean boolValueOf = Boolean.valueOf(z);
            AtomicReference atomicReference = this.h;
            while (!atomicReference.compareAndSet(null, boolValueOf) && atomicReference.get() == null) {
            }
        }
        return null;
    }

    @Override // l.AbstractC17392
    public final Object h() {
        return Boolean.valueOf(!((EnumC20342) this.j.b).b);
    }
}
