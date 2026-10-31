package l;

import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ۨܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11770 implements LongConsumer, IntConsumer {
    public long count;
    public long sum;
    public long min = C13132.FOREVER_NS;
    public long max = Long.MIN_VALUE;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C9407.$default$andThen(this, intConsumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return C2351.$default$andThen(this, longConsumer);
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        accept(i);
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        this.count++;
        this.sum += j;
        this.min = Math.min(this.min, j);
        this.max = Math.max(this.max, j);
    }

    public final void a(C11770 c11770) {
        this.count += c11770.count;
        this.sum += c11770.sum;
        this.min = Math.min(this.min, c11770.min);
        this.max = Math.max(this.max, c11770.max);
    }

    public final String toString() {
        String simpleName = C11770.class.getSimpleName();
        Long lValueOf = Long.valueOf(this.count);
        Long lValueOf2 = Long.valueOf(this.sum);
        Long lValueOf3 = Long.valueOf(this.min);
        long j = this.count;
        return String.format("%s{count=%d, sum=%d, min=%d, average=%f, max=%d}", simpleName, lValueOf, lValueOf2, lValueOf3, Double.valueOf(j > 0 ? this.sum / j : 0.0d), Long.valueOf(this.max));
    }
}
