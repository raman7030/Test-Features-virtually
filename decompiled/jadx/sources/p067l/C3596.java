package p067l;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.֨ᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3596 extends AbstractC22592 implements InterfaceC10124 {
    @Override // p067l.InterfaceC16847
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC17736.m40300b(this, consumer);
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC17736.m40305g(this, consumer);
    }

    @Override // p067l.AbstractC22592
    /* JADX INFO: renamed from: e */
    public final AbstractC22592 mo6603e(InterfaceC16847 interfaceC16847) {
        return new C3596(this.f71313b, interfaceC16847, this.f71312a);
    }

    @Override // p067l.AbstractC22592
    /* JADX INFO: renamed from: d */
    public final void mo6602d() {
        C14305 c14305 = new C14305();
        this.f71319h = c14305;
        C12826.requireNonNull(c14305);
        this.f71316e = this.f71313b.mo25630g0(new C8961(c14305, 1));
        this.f71317f = new C18546(16, this);
    }

    @Override // p067l.AbstractC22592, p067l.InterfaceC16847
    public final InterfaceC3437 trySplit() {
        return (InterfaceC10124) super.trySplit();
    }

    @Override // p067l.AbstractC22592, p067l.InterfaceC16847
    public final InterfaceC10124 trySplit() {
        return (InterfaceC10124) super.trySplit();
    }

    @Override // p067l.AbstractC22592, p067l.InterfaceC16847
    public final InterfaceC16847 trySplit() {
        return (InterfaceC10124) super.trySplit();
    }

    @Override // p067l.InterfaceC3437
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        double d;
        C12826.requireNonNull(doubleConsumer);
        boolean zM50630a = m50630a();
        if (zM50630a) {
            C14305 c14305 = (C14305) this.f71319h;
            long j = this.f71318g;
            int iM10211r = c14305.m10211r(j);
            if (c14305.f65670c == 0 && iM10211r == 0) {
                d = ((double[]) c14305.f10942e)[(int) j];
            } else {
                d = ((double[][]) c14305.f10943f)[iM10211r][(int) (j - c14305.f65671d[iM10211r])];
            }
            doubleConsumer.accept(d);
        }
        return zM50630a;
    }

    @Override // p067l.InterfaceC3437
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        if (this.f71319h == null && !this.f71320i) {
            C12826.requireNonNull(doubleConsumer);
            m50632c();
            C12826.requireNonNull(doubleConsumer);
            C8961 c8961 = new C8961(doubleConsumer, 0);
            this.f71313b.mo25629f0(this.f71315d, c8961);
            this.f71320i = true;
            return;
        }
        while (tryAdvance(doubleConsumer)) {
        }
    }
}
