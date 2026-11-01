package p067l;

import java.util.concurrent.CountedCompleter;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ᩳᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC19690 extends CountedCompleter implements InterfaceC2925 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC16847 f59849a;

    /* JADX INFO: renamed from: b */
    public final AbstractC11111 f59850b;

    /* JADX INFO: renamed from: c */
    public final long f59851c;

    /* JADX INFO: renamed from: d */
    public final long f59852d;

    /* JADX INFO: renamed from: e */
    public final long f59853e;

    /* JADX INFO: renamed from: f */
    public int f59854f;

    /* JADX INFO: renamed from: g */
    public int f59855g;

    /* JADX INFO: renamed from: a */
    public abstract AbstractC19690 mo32148a(InterfaceC16847 interfaceC16847, long j, long j2);

    public /* synthetic */ void accept(double d) {
        AbstractC11111.m25611m();
        throw null;
    }

    public /* synthetic */ void accept(int i) {
        AbstractC11111.m25618t();
        throw null;
    }

    @Override // p067l.InterfaceC2925
    public /* synthetic */ void accept(long j) {
        AbstractC11111.m25619u();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C24719.$default$andThen(this, consumer);
    }

    @Override // p067l.InterfaceC2925
    public final /* synthetic */ void end() {
    }

    @Override // p067l.InterfaceC2925
    /* JADX INFO: renamed from: f */
    public final /* synthetic */ boolean mo4233f() {
        return false;
    }

    public AbstractC19690(InterfaceC16847 interfaceC16847, AbstractC11111 abstractC11111, int i) {
        this.f59849a = interfaceC16847;
        this.f59850b = abstractC11111;
        this.f59851c = AbstractC14874.m33979e(interfaceC16847.estimateSize());
        this.f59852d = 0L;
        this.f59853e = i;
    }

    public AbstractC19690(AbstractC19690 abstractC19690, InterfaceC16847 interfaceC16847, long j, long j2, int i) {
        super(abstractC19690);
        this.f59849a = interfaceC16847;
        this.f59850b = abstractC19690.f59850b;
        this.f59851c = abstractC19690.f59851c;
        this.f59852d = j;
        this.f59853e = j2;
        if (j < 0 || j2 < 0 || (j + j2) - 1 >= i) {
            throw new IllegalArgumentException(String.format("offset and length interval [%d, %d + %d) is not within array size interval [0, %d)", Long.valueOf(j), Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i)));
        }
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        InterfaceC16847 interfaceC16847TrySplit;
        InterfaceC16847 interfaceC16847 = this.f59849a;
        AbstractC19690 abstractC19690Mo32148a = this;
        while (interfaceC16847.estimateSize() > abstractC19690Mo32148a.f59851c && (interfaceC16847TrySplit = interfaceC16847.trySplit()) != null) {
            abstractC19690Mo32148a.setPendingCount(1);
            long jEstimateSize = interfaceC16847TrySplit.estimateSize();
            abstractC19690Mo32148a.mo32148a(interfaceC16847TrySplit, abstractC19690Mo32148a.f59852d, jEstimateSize).fork();
            abstractC19690Mo32148a = abstractC19690Mo32148a.mo32148a(interfaceC16847, abstractC19690Mo32148a.f59852d + jEstimateSize, abstractC19690Mo32148a.f59853e - jEstimateSize);
        }
        abstractC19690Mo32148a.f59850b.mo25629f0(interfaceC16847, abstractC19690Mo32148a);
        abstractC19690Mo32148a.propagateCompletion();
    }

    @Override // p067l.InterfaceC2925
    /* JADX INFO: renamed from: c */
    public final void mo4231c(long j) {
        long j2 = this.f59853e;
        if (j > j2) {
            throw new IllegalStateException("size passed to Sink.begin exceeds array length");
        }
        int i = (int) this.f59852d;
        this.f59854f = i;
        this.f59855g = i + ((int) j2);
    }
}
