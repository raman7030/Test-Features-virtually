package l;

/* JADX INFO: renamed from: l.ۘܰᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3987 {
    public final long a;
    public final long b;
    public InterfaceC15234 c;
    public long d;
    public long e;

    public abstract InterfaceC15234 a(InterfaceC15234 interfaceC15234, long j, long j2, long j3, long j4);

    public AbstractC3987(InterfaceC15234 interfaceC15234, long j, long j2, long j3, long j4) {
        this.c = interfaceC15234;
        this.a = j;
        this.b = j2;
        this.d = j3;
        this.e = j4;
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public final InterfaceC15234 m12030trySplit() {
        long j = this.e;
        if (this.a >= j || this.d >= j) {
            return null;
        }
        while (true) {
            InterfaceC15234 interfaceC15234TrySplit = this.c.trySplit();
            if (interfaceC15234TrySplit == null) {
                return null;
            }
            long jEstimateSize = interfaceC15234TrySplit.estimateSize() + this.d;
            long jMin = Math.min(jEstimateSize, this.b);
            long j2 = this.a;
            if (j2 >= jMin) {
                this.d = jMin;
            } else {
                long j3 = this.b;
                if (jMin >= j3) {
                    this.c = interfaceC15234TrySplit;
                    this.e = jMin;
                } else {
                    long j4 = this.d;
                    if (j4 >= j2 && jEstimateSize <= j3) {
                        this.d = jMin;
                        return interfaceC15234TrySplit;
                    }
                    this.d = jMin;
                    return a(interfaceC15234TrySplit, j2, j3, j4, jMin);
                }
            }
        }
    }

    public final long estimateSize() {
        long j = this.e;
        long j2 = this.a;
        if (j2 < j) {
            return j - Math.max(j2, this.d);
        }
        return 0L;
    }

    public final int characteristics() {
        return this.c.characteristics();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC1124 m12028trySplit() {
        return (InterfaceC1124) m12030trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC18764 m12031trySplit() {
        return (InterfaceC18764) m12030trySplit();
    }

    public /* bridge */ /* synthetic */ InterfaceC0418 trySplit() {
        return (InterfaceC0418) m12030trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC8160 m12029trySplit() {
        return (InterfaceC8160) m12030trySplit();
    }
}
