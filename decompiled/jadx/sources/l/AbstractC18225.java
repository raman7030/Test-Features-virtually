package l;

import java.util.concurrent.CountedCompleter;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ᩳᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC18225 extends CountedCompleter implements InterfaceC0585 {
    public final InterfaceC15234 a;
    public final AbstractC9198 b;
    public final long c;
    public final long d;
    public final long e;
    public int f;
    public int g;

    public abstract AbstractC18225 a(InterfaceC15234 interfaceC15234, long j, long j2);

    public /* synthetic */ void accept(double d) {
        AbstractC9198.m();
        throw null;
    }

    public /* synthetic */ void accept(int i) {
        AbstractC9198.t();
        throw null;
    }

    @Override // l.InterfaceC0585
    public /* synthetic */ void accept(long j) {
        AbstractC9198.u();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C23517.$default$andThen(this, consumer);
    }

    @Override // l.InterfaceC0585
    public final /* synthetic */ void end() {
    }

    @Override // l.InterfaceC0585
    public final /* synthetic */ boolean f() {
        return false;
    }

    public AbstractC18225(InterfaceC15234 interfaceC15234, AbstractC9198 abstractC9198, int i) {
        this.a = interfaceC15234;
        this.b = abstractC9198;
        this.c = AbstractC13158.e(interfaceC15234.estimateSize());
        this.d = 0L;
        this.e = i;
    }

    public AbstractC18225(AbstractC18225 abstractC18225, InterfaceC15234 interfaceC15234, long j, long j2, int i) {
        super(abstractC18225);
        this.a = interfaceC15234;
        this.b = abstractC18225.b;
        this.c = abstractC18225.c;
        this.d = j;
        this.e = j2;
        if (j < 0 || j2 < 0 || (j + j2) - 1 >= i) {
            throw new IllegalArgumentException(String.format("offset and length interval [%d, %d + %d) is not within array size interval [0, %d)", Long.valueOf(j), Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i)));
        }
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        InterfaceC15234 interfaceC15234TrySplit;
        InterfaceC15234 interfaceC15234 = this.a;
        AbstractC18225 abstractC18225A = this;
        while (interfaceC15234.estimateSize() > abstractC18225A.c && (interfaceC15234TrySplit = interfaceC15234.trySplit()) != null) {
            abstractC18225A.setPendingCount(1);
            long jEstimateSize = interfaceC15234TrySplit.estimateSize();
            abstractC18225A.a(interfaceC15234TrySplit, abstractC18225A.d, jEstimateSize).fork();
            abstractC18225A = abstractC18225A.a(interfaceC15234, abstractC18225A.d + jEstimateSize, abstractC18225A.e - jEstimateSize);
        }
        abstractC18225A.b.f0(interfaceC15234, abstractC18225A);
        abstractC18225A.propagateCompletion();
    }

    @Override // l.InterfaceC0585
    public final void c(long j) {
        long j2 = this.e;
        if (j > j2) {
            throw new IllegalStateException("size passed to Sink.begin exceeds array length");
        }
        int i = (int) this.d;
        this.f = i;
        this.g = i + ((int) j2);
    }
}
