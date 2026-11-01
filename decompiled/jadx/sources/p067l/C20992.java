package p067l;

import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.᩵ܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20992 extends AbstractC19690 implements InterfaceC16336 {

    /* JADX INFO: renamed from: h */
    public final long[] f65902h;

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void m45213n(Object obj) {
        mo4235l((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return C4603.$default$andThen(this, longConsumer);
    }

    @Override // p067l.InterfaceC16336
    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void mo4235l(Long l2) {
        AbstractC11111.m25616r(this, l2);
    }

    public C20992(InterfaceC16847 interfaceC16847, AbstractC11111 abstractC11111, long[] jArr) {
        super(interfaceC16847, abstractC11111, jArr.length);
        this.f65902h = jArr;
    }

    public C20992(C20992 c20992, InterfaceC16847 interfaceC16847, long j, long j2) {
        super(c20992, interfaceC16847, j, j2, c20992.f65902h.length);
        this.f65902h = c20992.f65902h;
    }

    @Override // p067l.AbstractC19690
    /* JADX INFO: renamed from: a */
    public final AbstractC19690 mo32148a(InterfaceC16847 interfaceC16847, long j, long j2) {
        return new C20992(this, interfaceC16847, j, j2);
    }

    @Override // p067l.AbstractC19690, p067l.InterfaceC2925
    public final void accept(long j) {
        int i = this.f59854f;
        if (i >= this.f59855g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f59854f));
        }
        long[] jArr = this.f65902h;
        this.f59854f = i + 1;
        jArr[i] = j;
    }
}
