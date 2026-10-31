package l;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: l.᩹֫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21984 {
    public final InterfaceC15234 a;
    public final boolean b;
    public final int c;
    public final long d;
    public final AtomicLong e;

    public abstract InterfaceC15234 b(InterfaceC15234 interfaceC15234);

    public AbstractC21984(InterfaceC15234 interfaceC15234, long j, long j2) {
        this.a = interfaceC15234;
        this.b = j2 < 0;
        this.d = j2 >= 0 ? j2 : 0L;
        this.c = 128;
        this.e = new AtomicLong(j2 >= 0 ? j + j2 : j);
    }

    public AbstractC21984(InterfaceC15234 interfaceC15234, AbstractC21984 abstractC21984) {
        this.a = interfaceC15234;
        this.b = abstractC21984.b;
        this.e = abstractC21984.e;
        this.d = abstractC21984.d;
        this.c = abstractC21984.c;
    }

    public final long a(long j) {
        long j2;
        boolean z;
        long jMin;
        do {
            j2 = this.e.get();
            z = this.b;
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
        } while (!this.e.compareAndSet(j2, j2 - jMin));
        if (z) {
            return Math.max(j - jMin, 0L);
        }
        long j3 = this.d;
        return j2 > j3 ? Math.max(jMin - (j2 - j3), 0L) : jMin;
    }

    public final EnumC15632 e() {
        if (this.e.get() > 0) {
            return EnumC15632.MAYBE_MORE;
        }
        return this.b ? EnumC15632.UNLIMITED : EnumC15632.NO_MORE;
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public final InterfaceC15234 m49469trySplit() {
        InterfaceC15234 interfaceC15234TrySplit;
        if (this.e.get() == 0 || (interfaceC15234TrySplit = this.a.trySplit()) == null) {
            return null;
        }
        return b(interfaceC15234TrySplit);
    }

    public final long estimateSize() {
        return this.a.estimateSize();
    }

    public final int characteristics() {
        return this.a.characteristics() & (-16465);
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC1124 m49467trySplit() {
        return (InterfaceC1124) m49469trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC18764 m49470trySplit() {
        return (InterfaceC18764) m49469trySplit();
    }

    public /* bridge */ /* synthetic */ InterfaceC0418 trySplit() {
        return (InterfaceC0418) m49469trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC8160 m49468trySplit() {
        return (InterfaceC8160) m49469trySplit();
    }
}
