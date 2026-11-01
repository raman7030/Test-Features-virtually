package p067l;

/* JADX INFO: renamed from: l.ۘܰᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6158 {

    /* JADX INFO: renamed from: a */
    public final long f15449a;

    /* JADX INFO: renamed from: b */
    public final long f15450b;

    /* JADX INFO: renamed from: c */
    public InterfaceC16847 f15451c;

    /* JADX INFO: renamed from: d */
    public long f15452d;

    /* JADX INFO: renamed from: e */
    public long f15453e;

    /* JADX INFO: renamed from: a */
    public abstract InterfaceC16847 mo4499a(InterfaceC16847 interfaceC16847, long j, long j2, long j3, long j4);

    public AbstractC6158(InterfaceC16847 interfaceC16847, long j, long j2, long j3, long j4) {
        this.f15451c = interfaceC16847;
        this.f15449a = j;
        this.f15450b = j2;
        this.f15452d = j3;
        this.f15453e = j4;
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public final InterfaceC16847 m56269trySplit() {
        long j = this.f15453e;
        if (this.f15449a >= j || this.f15452d >= j) {
            return null;
        }
        while (true) {
            InterfaceC16847 interfaceC16847TrySplit = this.f15451c.trySplit();
            if (interfaceC16847TrySplit == null) {
                return null;
            }
            long jEstimateSize = interfaceC16847TrySplit.estimateSize() + this.f15452d;
            long jMin = Math.min(jEstimateSize, this.f15450b);
            long j2 = this.f15449a;
            if (j2 >= jMin) {
                this.f15452d = jMin;
            } else {
                long j3 = this.f15450b;
                if (jMin >= j3) {
                    this.f15451c = interfaceC16847TrySplit;
                    this.f15453e = jMin;
                } else {
                    long j4 = this.f15452d;
                    if (j4 >= j2 && jEstimateSize <= j3) {
                        this.f15452d = jMin;
                        return interfaceC16847TrySplit;
                    }
                    this.f15452d = jMin;
                    return mo4499a(interfaceC16847TrySplit, j2, j3, j4, jMin);
                }
            }
        }
    }

    public final long estimateSize() {
        long j = this.f15453e;
        long j2 = this.f15449a;
        if (j2 < j) {
            return j - Math.max(j2, this.f15452d);
        }
        return 0L;
    }

    public final int characteristics() {
        return this.f15451c.characteristics();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC3437 m56267trySplit() {
        return (InterfaceC3437) m56269trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC20202 m56270trySplit() {
        return (InterfaceC20202) m56269trySplit();
    }

    public /* bridge */ /* synthetic */ InterfaceC2766 trySplit() {
        return (InterfaceC2766) m56269trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC10124 m56268trySplit() {
        return (InterfaceC10124) m56269trySplit();
    }
}
