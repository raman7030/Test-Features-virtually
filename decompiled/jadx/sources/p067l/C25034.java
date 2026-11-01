package p067l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩻ܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C25034 extends AbstractC22592 implements InterfaceC20202 {
    @Override // p067l.InterfaceC16847
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C6120.m13914a(this, consumer);
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C6120.m13915b(this, consumer);
    }

    @Override // p067l.AbstractC22592
    /* JADX INFO: renamed from: e */
    public final AbstractC22592 mo6603e(InterfaceC16847 interfaceC16847) {
        return new C25034(this.f71313b, interfaceC16847, this.f71312a);
    }

    @Override // p067l.AbstractC22592
    /* JADX INFO: renamed from: d */
    public final void mo6602d() {
        C20932 c20932 = new C20932();
        this.f71319h = c20932;
        C12826.requireNonNull(c20932);
        this.f71316e = this.f71313b.mo25630g0(new C8290(c20932, 1));
        this.f71317f = new C18546(17, this);
    }

    @Override // p067l.AbstractC22592, p067l.InterfaceC16847
    public final InterfaceC3437 trySplit() {
        return (InterfaceC20202) super.trySplit();
    }

    @Override // p067l.AbstractC22592, p067l.InterfaceC16847
    public final InterfaceC16847 trySplit() {
        return (InterfaceC20202) super.trySplit();
    }

    @Override // p067l.AbstractC22592, p067l.InterfaceC16847
    public final InterfaceC20202 trySplit() {
        return (InterfaceC20202) super.trySplit();
    }

    @Override // p067l.InterfaceC3437
    public final boolean tryAdvance(IntConsumer intConsumer) {
        int i;
        C12826.requireNonNull(intConsumer);
        boolean zM50630a = m50630a();
        if (zM50630a) {
            C20932 c20932 = (C20932) this.f71319h;
            long j = this.f71318g;
            int iM10211r = c20932.m10211r(j);
            if (c20932.f65670c == 0 && iM10211r == 0) {
                i = ((int[]) c20932.f10942e)[(int) j];
            } else {
                i = ((int[][]) c20932.f10943f)[iM10211r][(int) (j - c20932.f65671d[iM10211r])];
            }
            intConsumer.accept(i);
        }
        return zM50630a;
    }

    @Override // p067l.InterfaceC3437
    public final void forEachRemaining(IntConsumer intConsumer) {
        if (this.f71319h == null && !this.f71320i) {
            C12826.requireNonNull(intConsumer);
            m50632c();
            C12826.requireNonNull(intConsumer);
            C8290 c8290 = new C8290(intConsumer, 0);
            this.f71313b.mo25629f0(this.f71315d, c8290);
            this.f71320i = true;
            return;
        }
        while (tryAdvance(intConsumer)) {
        }
    }
}
