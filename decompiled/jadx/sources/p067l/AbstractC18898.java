package p067l;

import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ܿܰᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC18898 extends AbstractC14874 {

    /* JADX INFO: renamed from: h */
    public final AtomicReference f56420h;

    /* JADX INFO: renamed from: i */
    public volatile boolean f56421i;

    /* JADX INFO: renamed from: h */
    public abstract Object mo8627h();

    public AbstractC18898(AbstractC11111 abstractC11111, InterfaceC16847 interfaceC16847) {
        super(abstractC11111, interfaceC16847);
        this.f56420h = new AtomicReference(null);
    }

    public AbstractC18898(AbstractC18898 abstractC18898, InterfaceC16847 interfaceC16847) {
        super(abstractC18898, interfaceC16847);
        this.f56420h = abstractC18898.f56420h;
    }

    @Override // p067l.AbstractC14874, java.util.concurrent.CountedCompleter
    public final void compute() {
        Object objMo8627h;
        InterfaceC16847 interfaceC16847TrySplit;
        InterfaceC16847 interfaceC16847 = this.f42402b;
        long jEstimateSize = interfaceC16847.estimateSize();
        long jM33979e = this.f42403c;
        if (jM33979e == 0) {
            jM33979e = AbstractC14874.m33979e(jEstimateSize);
            this.f42403c = jM33979e;
        }
        AtomicReference atomicReference = this.f56420h;
        boolean z = false;
        AbstractC18898 abstractC18898 = this;
        while (true) {
            objMo8627h = atomicReference.get();
            if (objMo8627h != null) {
                break;
            }
            boolean z2 = abstractC18898.f56421i;
            if (!z2) {
                CountedCompleter<?> completer = abstractC18898.getCompleter();
                while (true) {
                    AbstractC18898 abstractC18899 = (AbstractC18898) ((AbstractC14874) completer);
                    if (z2 || abstractC18899 == null) {
                        break;
                    }
                    z2 = abstractC18899.f56421i;
                    completer = abstractC18899.getCompleter();
                }
            }
            if (z2) {
                objMo8627h = abstractC18898.mo8627h();
                break;
            }
            if (jEstimateSize <= jM33979e || (interfaceC16847TrySplit = interfaceC16847.trySplit()) == null) {
                objMo8627h = abstractC18898.mo8155a();
                break;
            }
            AbstractC18898 abstractC188910 = (AbstractC18898) abstractC18898.mo8156c(interfaceC16847TrySplit);
            abstractC18898.f42404d = abstractC188910;
            AbstractC18898 abstractC188911 = (AbstractC18898) abstractC18898.mo8156c(interfaceC16847);
            abstractC18898.f42405e = abstractC188911;
            abstractC18898.setPendingCount(1);
            if (z) {
                interfaceC16847 = interfaceC16847TrySplit;
                abstractC18898 = abstractC188910;
                abstractC188910 = abstractC188911;
            } else {
                abstractC18898 = abstractC188911;
            }
            z = !z;
            abstractC188910.fork();
            jEstimateSize = interfaceC16847.estimateSize();
        }
        abstractC18898.mo33981d(objMo8627h);
        abstractC18898.tryComplete();
    }

    @Override // p067l.AbstractC14874
    /* JADX INFO: renamed from: d */
    public final void mo33981d(Object obj) {
        if (!m33980b()) {
            this.f42406f = obj;
        } else if (obj != null) {
            AtomicReference atomicReference = this.f56420h;
            while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
            }
        }
    }

    @Override // p067l.AbstractC14874, java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final Object getRawResult() {
        return m43001i();
    }

    /* JADX INFO: renamed from: i */
    public final Object m43001i() {
        if (m33980b()) {
            Object obj = this.f56420h.get();
            return obj == null ? mo8627h() : obj;
        }
        return this.f42406f;
    }

    /* JADX INFO: renamed from: f */
    public void mo39846f() {
        this.f56421i = true;
    }

    /* JADX INFO: renamed from: g */
    public final void m43000g() {
        AbstractC18898 abstractC18898 = this;
        for (AbstractC18898 abstractC18899 = (AbstractC18898) ((AbstractC14874) getCompleter()); abstractC18899 != null; abstractC18899 = (AbstractC18898) ((AbstractC14874) abstractC18899.getCompleter())) {
            if (abstractC18899.f42404d == abstractC18898) {
                AbstractC18898 abstractC188910 = (AbstractC18898) abstractC18899.f42405e;
                if (!abstractC188910.f56421i) {
                    abstractC188910.mo39846f();
                }
            }
            abstractC18898 = abstractC18899;
        }
    }
}
