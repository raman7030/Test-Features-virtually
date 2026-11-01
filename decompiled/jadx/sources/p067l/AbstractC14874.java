package p067l;

import java.util.concurrent.CountedCompleter;
import java.util.concurrent.ForkJoinPool;

/* JADX INFO: renamed from: l.۬ܰᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC14874 extends CountedCompleter {

    /* JADX INFO: renamed from: g */
    public static final int f42400g = ForkJoinPool.getCommonPoolParallelism() << 2;

    /* JADX INFO: renamed from: a */
    public final AbstractC11111 f42401a;

    /* JADX INFO: renamed from: b */
    public InterfaceC16847 f42402b;

    /* JADX INFO: renamed from: c */
    public long f42403c;

    /* JADX INFO: renamed from: d */
    public AbstractC14874 f42404d;

    /* JADX INFO: renamed from: e */
    public AbstractC14874 f42405e;

    /* JADX INFO: renamed from: f */
    public Object f42406f;

    /* JADX INFO: renamed from: a */
    public abstract Object mo8155a();

    /* JADX INFO: renamed from: c */
    public abstract AbstractC14874 mo8156c(InterfaceC16847 interfaceC16847);

    public AbstractC14874(AbstractC11111 abstractC11111, InterfaceC16847 interfaceC16847) {
        super(null);
        this.f42401a = abstractC11111;
        this.f42402b = interfaceC16847;
        this.f42403c = 0L;
    }

    public AbstractC14874(AbstractC14874 abstractC14874, InterfaceC16847 interfaceC16847) {
        super(abstractC14874);
        this.f42402b = interfaceC16847;
        this.f42401a = abstractC14874.f42401a;
        this.f42403c = abstractC14874.f42403c;
    }

    /* JADX INFO: renamed from: e */
    public static long m33979e(long j) {
        long j2 = j / ((long) f42400g);
        if (j2 > 0) {
            return j2;
        }
        return 1L;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public Object getRawResult() {
        return this.f42406f;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final void setRawResult(Object obj) {
        if (obj != null) {
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: renamed from: d */
    public void mo33981d(Object obj) {
        this.f42406f = obj;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m33980b() {
        return ((AbstractC14874) getCompleter()) == null;
    }

    @Override // java.util.concurrent.CountedCompleter
    public void compute() {
        InterfaceC16847 interfaceC16847TrySplit;
        InterfaceC16847 interfaceC16847 = this.f42402b;
        long jEstimateSize = interfaceC16847.estimateSize();
        long jM33979e = this.f42403c;
        if (jM33979e == 0) {
            jM33979e = m33979e(jEstimateSize);
            this.f42403c = jM33979e;
        }
        boolean z = false;
        AbstractC14874 abstractC14874 = this;
        while (jEstimateSize > jM33979e && (interfaceC16847TrySplit = interfaceC16847.trySplit()) != null) {
            AbstractC14874 abstractC14874Mo8156c = abstractC14874.mo8156c(interfaceC16847TrySplit);
            abstractC14874.f42404d = abstractC14874Mo8156c;
            AbstractC14874 abstractC14874Mo8156c2 = abstractC14874.mo8156c(interfaceC16847);
            abstractC14874.f42405e = abstractC14874Mo8156c2;
            abstractC14874.setPendingCount(1);
            if (z) {
                interfaceC16847 = interfaceC16847TrySplit;
                abstractC14874 = abstractC14874Mo8156c;
                abstractC14874Mo8156c = abstractC14874Mo8156c2;
            } else {
                abstractC14874 = abstractC14874Mo8156c2;
            }
            z = !z;
            abstractC14874Mo8156c.fork();
            jEstimateSize = interfaceC16847.estimateSize();
        }
        abstractC14874.mo33981d(abstractC14874.mo8155a());
        abstractC14874.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter
    public void onCompletion(CountedCompleter countedCompleter) {
        this.f42402b = null;
        this.f42405e = null;
        this.f42404d = null;
    }
}
