package l;

import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ۤܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10443 extends AbstractC21279 implements InterfaceC0418 {
    @Override // l.InterfaceC15234
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C19470.a(this, consumer);
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C19470.b(this, consumer);
    }

    @Override // l.AbstractC21279
    public final AbstractC21279 e(InterfaceC15234 interfaceC15234) {
        return new C10443(this.b, interfaceC15234, this.a);
    }

    @Override // l.AbstractC21279
    public final void d() {
        C4964 c4964 = new C4964();
        this.h = c4964;
        C11003.requireNonNull(c4964);
        this.e = this.b.g0(new C5504(c4964, 1));
        this.f = new C17022(18, this);
    }

    @Override // l.AbstractC21279, l.InterfaceC15234
    public final InterfaceC0418 trySplit() {
        return (InterfaceC0418) super.trySplit();
    }

    @Override // l.AbstractC21279, l.InterfaceC15234
    public final InterfaceC1124 trySplit() {
        return (InterfaceC0418) super.trySplit();
    }

    @Override // l.AbstractC21279, l.InterfaceC15234
    public final InterfaceC15234 trySplit() {
        return (InterfaceC0418) super.trySplit();
    }

    @Override // l.InterfaceC1124
    public final boolean tryAdvance(LongConsumer longConsumer) {
        long j;
        C11003.requireNonNull(longConsumer);
        boolean zA = a();
        if (zA) {
            C4964 c4964 = (C4964) this.h;
            long j2 = this.g;
            int iR = c4964.r(j2);
            if (c4964.c == 0 && iR == 0) {
                j = ((long[]) c4964.e)[(int) j2];
            } else {
                j = ((long[][]) c4964.f)[iR][(int) (j2 - c4964.d[iR])];
            }
            longConsumer.accept(j);
        }
        return zA;
    }

    @Override // l.InterfaceC1124
    public final void forEachRemaining(LongConsumer longConsumer) {
        if (this.h == null && !this.i) {
            C11003.requireNonNull(longConsumer);
            c();
            C11003.requireNonNull(longConsumer);
            C5504 c5504 = new C5504(longConsumer, 0);
            this.b.f0(this.d, c5504);
            this.i = true;
            return;
        }
        while (tryAdvance(longConsumer)) {
        }
    }
}
