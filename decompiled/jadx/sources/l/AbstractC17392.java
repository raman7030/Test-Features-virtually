package l;

import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ܿܰᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC17392 extends AbstractC13158 {
    public final AtomicReference h;
    public volatile boolean i;

    public abstract Object h();

    public AbstractC17392(AbstractC9198 abstractC9198, InterfaceC15234 interfaceC15234) {
        super(abstractC9198, interfaceC15234);
        this.h = new AtomicReference(null);
    }

    public AbstractC17392(AbstractC17392 abstractC17392, InterfaceC15234 interfaceC15234) {
        super(abstractC17392, interfaceC15234);
        this.h = abstractC17392.h;
    }

    @Override // l.AbstractC13158, java.util.concurrent.CountedCompleter
    public final void compute() {
        Object objH;
        InterfaceC15234 interfaceC15234TrySplit;
        InterfaceC15234 interfaceC15234 = this.b;
        long jEstimateSize = interfaceC15234.estimateSize();
        long jE = this.c;
        if (jE == 0) {
            jE = AbstractC13158.e(jEstimateSize);
            this.c = jE;
        }
        AtomicReference atomicReference = this.h;
        boolean z = false;
        AbstractC17392 abstractC17392 = this;
        while (true) {
            objH = atomicReference.get();
            if (objH != null) {
                break;
            }
            boolean z2 = abstractC17392.i;
            if (!z2) {
                CountedCompleter<?> completer = abstractC17392.getCompleter();
                while (true) {
                    AbstractC17392 abstractC17393 = (AbstractC17392) ((AbstractC13158) completer);
                    if (z2 || abstractC17393 == null) {
                        break;
                    }
                    z2 = abstractC17393.i;
                    completer = abstractC17393.getCompleter();
                }
            }
            if (z2) {
                objH = abstractC17392.h();
                break;
            }
            if (jEstimateSize <= jE || (interfaceC15234TrySplit = interfaceC15234.trySplit()) == null) {
                objH = abstractC17392.a();
                break;
            }
            AbstractC17392 abstractC17394 = (AbstractC17392) abstractC17392.c(interfaceC15234TrySplit);
            abstractC17392.d = abstractC17394;
            AbstractC17392 abstractC17395 = (AbstractC17392) abstractC17392.c(interfaceC15234);
            abstractC17392.e = abstractC17395;
            abstractC17392.setPendingCount(1);
            if (z) {
                interfaceC15234 = interfaceC15234TrySplit;
                abstractC17392 = abstractC17394;
                abstractC17394 = abstractC17395;
            } else {
                abstractC17392 = abstractC17395;
            }
            z = !z;
            abstractC17394.fork();
            jEstimateSize = interfaceC15234.estimateSize();
        }
        abstractC17392.d(objH);
        abstractC17392.tryComplete();
    }

    @Override // l.AbstractC13158
    public final void d(Object obj) {
        if (!b()) {
            this.f = obj;
        } else if (obj != null) {
            AtomicReference atomicReference = this.h;
            while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
            }
        }
    }

    @Override // l.AbstractC13158, java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final Object getRawResult() {
        return i();
    }

    public final Object i() {
        if (b()) {
            Object obj = this.h.get();
            return obj == null ? h() : obj;
        }
        return this.f;
    }

    public void f() {
        this.i = true;
    }

    public final void g() {
        AbstractC17392 abstractC17392 = this;
        for (AbstractC17392 abstractC17393 = (AbstractC17392) ((AbstractC13158) getCompleter()); abstractC17393 != null; abstractC17393 = (AbstractC17392) ((AbstractC13158) abstractC17393.getCompleter())) {
            if (abstractC17393.d == abstractC17392) {
                AbstractC17392 abstractC17394 = (AbstractC17392) abstractC17393.e;
                if (!abstractC17394.i) {
                    abstractC17394.f();
                }
            }
            abstractC17392 = abstractC17393;
        }
    }
}
