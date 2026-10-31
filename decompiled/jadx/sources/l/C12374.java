package l;

import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.۫ۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12374 extends AbstractC18225 implements InterfaceC5483 {
    public final double[] h;

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        n((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC16169.a(this, doubleConsumer);
    }

    @Override // l.InterfaceC5483
    public final /* synthetic */ void n(Double d) {
        AbstractC9198.n(this, d);
    }

    public C12374(InterfaceC15234 interfaceC15234, AbstractC9198 abstractC9198, double[] dArr) {
        super(interfaceC15234, abstractC9198, dArr.length);
        this.h = dArr;
    }

    public C12374(C12374 c12374, InterfaceC15234 interfaceC15234, long j, long j2) {
        super(c12374, interfaceC15234, j, j2, c12374.h.length);
        this.h = c12374.h;
    }

    @Override // l.AbstractC18225
    public final AbstractC18225 a(InterfaceC15234 interfaceC15234, long j, long j2) {
        return new C12374(this, interfaceC15234, j, j2);
    }

    @Override // l.AbstractC18225, l.InterfaceC0585
    public final void accept(double d) {
        int i = this.f;
        if (i >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f));
        }
        double[] dArr = this.h;
        this.f = i + 1;
        dArr[i] = d;
    }
}
