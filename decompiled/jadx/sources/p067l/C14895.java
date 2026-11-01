package p067l;

import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.۬ܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14895 implements DoubleConsumer {

    /* JADX INFO: renamed from: a */
    public double f42469a;

    /* JADX INFO: renamed from: b */
    public double f42470b;
    public long count;
    public double sum;
    public double min = Double.POSITIVE_INFINITY;
    public double max = Double.NEGATIVE_INFINITY;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC17736.m40299a(this, doubleConsumer);
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        this.count++;
        this.f42470b += d;
        m34100b(d);
        this.min = Math.min(this.min, d);
        this.max = Math.max(this.max, d);
    }

    /* JADX INFO: renamed from: a */
    public final void m34099a(C14895 c14895) {
        this.count += c14895.count;
        this.f42470b += c14895.f42470b;
        m34100b(c14895.sum);
        m34100b(c14895.f42469a);
        this.min = Math.min(this.min, c14895.min);
        this.max = Math.max(this.max, c14895.max);
    }

    /* JADX INFO: renamed from: b */
    public final void m34100b(double d) {
        double d2 = d - this.f42469a;
        double d3 = this.sum;
        double d4 = d3 + d2;
        this.f42469a = (d4 - d3) - d2;
        this.sum = d4;
    }

    public final String toString() {
        double d;
        String simpleName = C14895.class.getSimpleName();
        Long lValueOf = Long.valueOf(this.count);
        double d2 = this.sum + this.f42469a;
        if (Double.isNaN(d2) && Double.isInfinite(this.f42470b)) {
            d2 = this.f42470b;
        }
        Double dValueOf = Double.valueOf(d2);
        Double dValueOf2 = Double.valueOf(this.min);
        if (this.count > 0) {
            double d3 = this.sum + this.f42469a;
            if (Double.isNaN(d3) && Double.isInfinite(this.f42470b)) {
                d3 = this.f42470b;
            }
            d = d3 / this.count;
        } else {
            d = 0.0d;
        }
        return String.format("%s{count=%d, sum=%f, min=%f, average=%f, max=%f}", simpleName, lValueOf, dValueOf, dValueOf2, Double.valueOf(d), Double.valueOf(this.max));
    }
}
