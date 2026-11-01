package p067l;

import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ۗ֫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5157 extends AbstractC18898 {

    /* JADX INFO: renamed from: j */
    public final C14204 f12131j;

    /* JADX INFO: renamed from: k */
    public final boolean f12132k;

    public C5157(C14204 c14204, boolean z, AbstractC14463 abstractC14463, InterfaceC16847 interfaceC16847) {
        super(abstractC14463, interfaceC16847);
        this.f12132k = z;
        this.f12131j = c14204;
    }

    public C5157(C5157 c5157, InterfaceC16847 interfaceC16847) {
        super(c5157, interfaceC16847);
        this.f12132k = c5157.f12132k;
        this.f12131j = c5157.f12131j;
    }

    @Override // p067l.AbstractC14874
    /* JADX INFO: renamed from: c */
    public final AbstractC14874 mo8156c(InterfaceC16847 interfaceC16847) {
        return new C5157(this, interfaceC16847);
    }

    @Override // p067l.AbstractC18898
    /* JADX INFO: renamed from: h */
    public final Object mo8627h() {
        return this.f12131j.f40474b;
    }

    @Override // p067l.AbstractC14874
    /* JADX INFO: renamed from: a */
    public final Object mo8155a() {
        AbstractC11111 abstractC11111 = this.f42401a;
        InterfaceC10302 interfaceC10302 = (InterfaceC10302) this.f12131j.f40476d.get();
        abstractC11111.mo25629f0(this.f42402b, interfaceC10302);
        Object obj = interfaceC10302.get();
        if (this.f12132k) {
            if (obj != null) {
                AbstractC14874 abstractC14874 = this;
                while (abstractC14874 != null) {
                    AbstractC14874 abstractC14875 = (AbstractC14874) abstractC14874.getCompleter();
                    if (abstractC14875 != null && abstractC14875.f42404d != abstractC14874) {
                        m43000g();
                        return obj;
                    }
                    abstractC14874 = abstractC14875;
                }
                AtomicReference atomicReference = this.f56420h;
                while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
                }
                return obj;
            }
        } else if (obj != null) {
            AtomicReference atomicReference2 = this.f56420h;
            while (!atomicReference2.compareAndSet(null, obj) && atomicReference2.get() == null) {
            }
        }
        return null;
    }

    @Override // p067l.AbstractC14874, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        if (this.f12132k) {
            C5157 c5157 = (C5157) this.f42404d;
            C5157 c5158 = null;
            while (c5157 != c5158) {
                Object objM43001i = c5157.m43001i();
                if (objM43001i != null && this.f12131j.f40475c.test(objM43001i)) {
                    mo33981d(objM43001i);
                    AbstractC14874 abstractC14874 = this;
                    while (abstractC14874 != null) {
                        AbstractC14874 abstractC14875 = (AbstractC14874) abstractC14874.getCompleter();
                        if (abstractC14875 != null && abstractC14875.f42404d != abstractC14874) {
                            m43000g();
                            break;
                        }
                        abstractC14874 = abstractC14875;
                    }
                    AtomicReference atomicReference = this.f56420h;
                    while (!atomicReference.compareAndSet(null, objM43001i) && atomicReference.get() == null) {
                    }
                    break;
                }
                c5158 = c5157;
                c5157 = (C5157) this.f42405e;
            }
        }
        super.onCompletion(countedCompleter);
    }
}
