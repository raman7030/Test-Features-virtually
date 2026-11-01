package p067l;

import java.lang.ref.ReferenceQueue;

/* JADX INFO: renamed from: l.᩻᩹ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes.dex */
public final class C25169 implements InterfaceC5723 {

    /* JADX INFO: renamed from: ᩶ */
    public final C14240 f80526;

    /* JADX INFO: renamed from: ᩸ */
    public final C12189 f80527;

    /* JADX INFO: renamed from: ᩹ */
    public volatile InterfaceC5723 f80528;

    @Override // p067l.InterfaceC5723
    public final InterfaceC25109 getEntry() {
        return null;
    }

    @Override // p067l.InterfaceC5723
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC5723 mo8869(ReferenceQueue referenceQueue, Object obj, InterfaceC25109 interfaceC25109) {
        return this;
    }

    @Override // p067l.InterfaceC5723
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo12720() {
        return true;
    }

    public C25169() {
        this(ConcurrentMapC16391.f48157);
    }

    public C25169(InterfaceC5723 interfaceC5723) {
        this.f80527 = C12189.m28150();
        this.f80526 = C14240.m32720();
        this.f80528 = interfaceC5723;
    }

    @Override // p067l.InterfaceC5723
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo12721() {
        return this.f80528.mo12721();
    }

    @Override // p067l.InterfaceC5723
    /* JADX INFO: renamed from: ۧ */
    public final int mo8870() {
        return this.f80528.mo8870();
    }

    @Override // p067l.InterfaceC5723
    /* JADX INFO: renamed from: ֫ */
    public final void mo12719(Object obj) {
        if (obj != null) {
            this.f80527.mo28151(obj);
        } else {
            this.f80528 = ConcurrentMapC16391.f48157;
        }
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [l.ܳ᩹ܺ] */
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceFutureC5483 m55237(Object obj, AbstractC20456 abstractC20456) {
        InterfaceFutureC5483 interfaceFutureC5483M23727;
        try {
            this.f80526.m32722();
            if (this.f80528.get() == null) {
                Object objMo18067 = abstractC20456.mo18067(obj);
                return this.f80527.mo28151(objMo18067) ? this.f80527 : C10177.m23726(objMo18067);
            }
            abstractC20456.getClass();
            obj.getClass();
            return C10177.m23728(C10177.m23726(abstractC20456.mo18067(obj)), new InterfaceC18263() { // from class: l.ܳ᩹ܺ
                @Override // p067l.InterfaceC18263
                public final Object apply(Object obj2) {
                    this.f48331.f80527.mo28151(obj2);
                    return obj2;
                }
            }, C14200.m32670());
        } catch (Throwable th) {
            if (!this.f80527.mo28152(th)) {
                interfaceFutureC5483M23727 = C10177.m23727(th);
            } else {
                interfaceFutureC5483M23727 = this.f80527;
            }
            if (th instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            return interfaceFutureC5483M23727;
        }
    }

    @Override // p067l.InterfaceC5723
    /* JADX INFO: renamed from: ᩳ */
    public final Object mo12722() {
        return C13530.m30788(this.f80527);
    }

    @Override // p067l.InterfaceC5723
    public final Object get() {
        return this.f80528.get();
    }
}
