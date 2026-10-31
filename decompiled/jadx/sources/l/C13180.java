package l;

import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.۬ܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13180 implements DoubleConsumer {
    public double a;
    public double b;
    public long count;
    public double sum;
    public double min = Double.POSITIVE_INFINITY;
    public double max = Double.NEGATIVE_INFINITY;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC16169.a(this, doubleConsumer);
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        this.count++;
        this.b += d;
        b(d);
        this.min = Math.min(this.min, d);
        this.max = Math.max(this.max, d);
    }

    public final void a(C13180 c13180) {
        this.count += c13180.count;
        this.b += c13180.b;
        b(c13180.sum);
        b(c13180.a);
        this.min = Math.min(this.min, c13180.min);
        this.max = Math.max(this.max, c13180.max);
    }

    public final void b(double d) {
        double d2 = d - this.a;
        double d3 = this.sum;
        double d4 = d3 + d2;
        this.a = (d4 - d3) - d2;
        this.sum = d4;
    }

    public final String toString() {
        double d;
        String simpleName = C13180.class.getSimpleName();
        Long lValueOf = Long.valueOf(this.count);
        double d2 = this.sum + this.a;
        if (Double.isNaN(d2) && Double.isInfinite(this.b)) {
            d2 = this.b;
        }
        Double dValueOf = Double.valueOf(d2);
        Double dValueOf2 = Double.valueOf(this.min);
        if (this.count > 0) {
            double d3 = this.sum + this.a;
            if (Double.isNaN(d3) && Double.isInfinite(this.b)) {
                d3 = this.b;
            }
            d = d3 / this.count;
        } else {
            d = 0.0d;
        }
        return String.format("%s{count=%d, sum=%f, min=%f, average=%f, max=%f}", simpleName, lValueOf, dValueOf, dValueOf2, Double.valueOf(d), Double.valueOf(this.max));
    }
}
