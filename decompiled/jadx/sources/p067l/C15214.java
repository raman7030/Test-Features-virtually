package p067l;

import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.ܰ֫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15214 extends AbstractC24187 implements DoubleConsumer {

    /* JADX INFO: renamed from: c */
    public final double[] f43400c;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC17736.m40299a(this, doubleConsumer);
    }

    public C15214(int i) {
        this.f43400c = new double[i];
    }

    @Override // p067l.AbstractC24187
    /* JADX INFO: renamed from: a */
    public final void mo26438a(Object obj, long j) {
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj;
        for (int i = 0; i < j; i++) {
            doubleConsumer.accept(this.f43400c[i]);
        }
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        int i = this.f76672b;
        this.f76672b = i + 1;
        this.f43400c[i] = d;
    }
}
