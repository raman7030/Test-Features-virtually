package p067l;

import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.۫ۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14129 extends AbstractC19690 implements InterfaceC7580 {

    /* JADX INFO: renamed from: h */
    public final double[] f40122h;

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void m45213n(Object obj) {
        mo12365n((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC17736.m40299a(this, doubleConsumer);
    }

    @Override // p067l.InterfaceC7580
    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void mo12365n(Double d) {
        AbstractC11111.m25612n(this, d);
    }

    public C14129(InterfaceC16847 interfaceC16847, AbstractC11111 abstractC11111, double[] dArr) {
        super(interfaceC16847, abstractC11111, dArr.length);
        this.f40122h = dArr;
    }

    public C14129(C14129 c14129, InterfaceC16847 interfaceC16847, long j, long j2) {
        super(c14129, interfaceC16847, j, j2, c14129.f40122h.length);
        this.f40122h = c14129.f40122h;
    }

    @Override // p067l.AbstractC19690
    /* JADX INFO: renamed from: a */
    public final AbstractC19690 mo32148a(InterfaceC16847 interfaceC16847, long j, long j2) {
        return new C14129(this, interfaceC16847, j, j2);
    }

    @Override // p067l.AbstractC19690, p067l.InterfaceC2925
    public final void accept(double d) {
        int i = this.f59854f;
        if (i >= this.f59855g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f59854f));
        }
        double[] dArr = this.f40122h;
        this.f59854f = i + 1;
        dArr[i] = d;
    }
}
