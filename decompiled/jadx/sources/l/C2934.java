package l;

import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ۗ֫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2934 extends AbstractC17392 {
    public final C12453 j;
    public final boolean k;

    public C2934(C12453 c12453, boolean z, AbstractC12725 abstractC12725, InterfaceC15234 interfaceC15234) {
        super(abstractC12725, interfaceC15234);
        this.k = z;
        this.j = c12453;
    }

    public C2934(C2934 c2934, InterfaceC15234 interfaceC15234) {
        super(c2934, interfaceC15234);
        this.k = c2934.k;
        this.j = c2934.j;
    }

    @Override // l.AbstractC13158
    public final AbstractC13158 c(InterfaceC15234 interfaceC15234) {
        return new C2934(this, interfaceC15234);
    }

    @Override // l.AbstractC17392
    public final Object h() {
        return this.j.b;
    }

    @Override // l.AbstractC13158
    public final Object a() {
        AbstractC9198 abstractC9198 = this.a;
        InterfaceC8347 interfaceC8347 = (InterfaceC8347) this.j.d.get();
        abstractC9198.f0(this.b, interfaceC8347);
        Object obj = interfaceC8347.get();
        if (this.k) {
            if (obj != null) {
                AbstractC13158 abstractC13158 = this;
                while (abstractC13158 != null) {
                    AbstractC13158 abstractC13159 = (AbstractC13158) abstractC13158.getCompleter();
                    if (abstractC13159 != null && abstractC13159.d != abstractC13158) {
                        g();
                        return obj;
                    }
                    abstractC13158 = abstractC13159;
                }
                AtomicReference atomicReference = this.h;
                while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
                }
                return obj;
            }
        } else if (obj != null) {
            AtomicReference atomicReference2 = this.h;
            while (!atomicReference2.compareAndSet(null, obj) && atomicReference2.get() == null) {
            }
        }
        return null;
    }

    @Override // l.AbstractC13158, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        if (this.k) {
            C2934 c2934 = (C2934) this.d;
            C2934 c2935 = null;
            while (c2934 != c2935) {
                Object objI = c2934.i();
                if (objI != null && this.j.c.test(objI)) {
                    d(objI);
                    AbstractC13158 abstractC13158 = this;
                    while (abstractC13158 != null) {
                        AbstractC13158 abstractC13159 = (AbstractC13158) abstractC13158.getCompleter();
                        if (abstractC13159 != null && abstractC13159.d != abstractC13158) {
                            g();
                            break;
                        }
                        abstractC13158 = abstractC13159;
                    }
                    AtomicReference atomicReference = this.h;
                    while (!atomicReference.compareAndSet(null, objI) && atomicReference.get() == null) {
                    }
                    break;
                }
                c2935 = c2934;
                c2934 = (C2934) this.e;
            }
        }
        super.onCompletion(countedCompleter);
    }
}
