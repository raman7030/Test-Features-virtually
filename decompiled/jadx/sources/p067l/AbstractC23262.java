package p067l;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: l.᩹֫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23262 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC16847 f73101a;

    /* JADX INFO: renamed from: b */
    public final boolean f73102b;

    /* JADX INFO: renamed from: c */
    public final int f73103c;

    /* JADX INFO: renamed from: d */
    public final long f73104d;

    /* JADX INFO: renamed from: e */
    public final AtomicLong f73105e;

    /* JADX INFO: renamed from: b */
    public abstract InterfaceC16847 mo7434b(InterfaceC16847 interfaceC16847);

    public AbstractC23262(InterfaceC16847 interfaceC16847, long j, long j2) {
        this.f73101a = interfaceC16847;
        this.f73102b = j2 < 0;
        this.f73104d = j2 >= 0 ? j2 : 0L;
        this.f73103c = 128;
        this.f73105e = new AtomicLong(j2 >= 0 ? j + j2 : j);
    }

    public AbstractC23262(InterfaceC16847 interfaceC16847, AbstractC23262 abstractC23262) {
        this.f73101a = interfaceC16847;
        this.f73102b = abstractC23262.f73102b;
        this.f73105e = abstractC23262.f73105e;
        this.f73104d = abstractC23262.f73104d;
        this.f73103c = abstractC23262.f73103c;
    }

    /* JADX INFO: renamed from: a */
    public final long m51804a(long j) {
        long j2;
        boolean z;
        long jMin;
        do {
            j2 = this.f73105e.get();
            z = this.f73102b;
            if (j2 != 0) {
                jMin = Math.min(j2, j);
                if (jMin <= 0) {
                    break;
                }
            } else {
                if (z) {
                    return j;
                }
                return 0L;
            }
        } while (!this.f73105e.compareAndSet(j2, j2 - jMin));
        if (z) {
            return Math.max(j - jMin, 0L);
        }
        long j3 = this.f73104d;
        return j2 > j3 ? Math.max(jMin - (j2 - j3), 0L) : jMin;
    }

    /* JADX INFO: renamed from: e */
    public final EnumC17225 m51805e() {
        if (this.f73105e.get() > 0) {
            return EnumC17225.MAYBE_MORE;
        }
        return this.f73102b ? EnumC17225.UNLIMITED : EnumC17225.NO_MORE;
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public final InterfaceC16847 m56571trySplit() {
        InterfaceC16847 interfaceC16847TrySplit;
        if (this.f73105e.get() == 0 || (interfaceC16847TrySplit = this.f73101a.trySplit()) == null) {
            return null;
        }
        return mo7434b(interfaceC16847TrySplit);
    }

    public final long estimateSize() {
        return this.f73101a.estimateSize();
    }

    public final int characteristics() {
        return this.f73101a.characteristics() & (-16465);
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC3437 m56569trySplit() {
        return (InterfaceC3437) m56571trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC20202 m56572trySplit() {
        return (InterfaceC20202) m56571trySplit();
    }

    public /* bridge */ /* synthetic */ InterfaceC2766 trySplit() {
        return (InterfaceC2766) m56571trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC10124 m56570trySplit() {
        return (InterfaceC10124) m56571trySplit();
    }
}
