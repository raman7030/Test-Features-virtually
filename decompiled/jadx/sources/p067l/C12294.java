package p067l;

import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ۤܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12294 extends AbstractC22592 implements InterfaceC2766 {
    @Override // p067l.InterfaceC16847
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C20873.m47164a(this, consumer);
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C20873.m47165b(this, consumer);
    }

    @Override // p067l.AbstractC22592
    /* JADX INFO: renamed from: e */
    public final AbstractC22592 mo6603e(InterfaceC16847 interfaceC16847) {
        return new C12294(this.f71313b, interfaceC16847, this.f71312a);
    }

    @Override // p067l.AbstractC22592
    /* JADX INFO: renamed from: d */
    public final void mo6602d() {
        C7087 c7087 = new C7087();
        this.f71319h = c7087;
        C12826.requireNonNull(c7087);
        this.f71316e = this.f71313b.mo25630g0(new C7600(c7087, 1));
        this.f71317f = new C18546(18, this);
    }

    @Override // p067l.AbstractC22592, p067l.InterfaceC16847
    public final InterfaceC2766 trySplit() {
        return (InterfaceC2766) super.trySplit();
    }

    @Override // p067l.AbstractC22592, p067l.InterfaceC16847
    public final InterfaceC3437 trySplit() {
        return (InterfaceC2766) super.trySplit();
    }

    @Override // p067l.AbstractC22592, p067l.InterfaceC16847
    public final InterfaceC16847 trySplit() {
        return (InterfaceC2766) super.trySplit();
    }

    @Override // p067l.InterfaceC3437
    public final boolean tryAdvance(LongConsumer longConsumer) {
        long j;
        C12826.requireNonNull(longConsumer);
        boolean zM50630a = m50630a();
        if (zM50630a) {
            C7087 c7087 = (C7087) this.f71319h;
            long j2 = this.f71318g;
            int iM10211r = c7087.m10211r(j2);
            if (c7087.f65670c == 0 && iM10211r == 0) {
                j = ((long[]) c7087.f10942e)[(int) j2];
            } else {
                j = ((long[][]) c7087.f10943f)[iM10211r][(int) (j2 - c7087.f65671d[iM10211r])];
            }
            longConsumer.accept(j);
        }
        return zM50630a;
    }

    @Override // p067l.InterfaceC3437
    public final void forEachRemaining(LongConsumer longConsumer) {
        if (this.f71319h == null && !this.f71320i) {
            C12826.requireNonNull(longConsumer);
            m50632c();
            C12826.requireNonNull(longConsumer);
            C7600 c7600 = new C7600(longConsumer, 0);
            this.f71313b.mo25629f0(this.f71315d, c7600);
            this.f71320i = true;
            return;
        }
        while (tryAdvance(longConsumer)) {
        }
    }
}
