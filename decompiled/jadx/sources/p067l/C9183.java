package p067l;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: l.۟ۖ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: UAIG */
/* JADX INFO: loaded from: classes2.dex */
public final class C9183 {

    /* JADX INFO: renamed from: ֫ */
    public int f24848;

    /* JADX INFO: renamed from: ۧ */
    public final AtomicLong[] f24849 = new AtomicLong[100];

    public C9183() {
        for (int i = 0; i < 100; i++) {
            this.f24849[i] = new AtomicLong(-1L);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m21142(C5057 c5057) {
        long millis = c5057.toMillis();
        synchronized (this) {
            this.f24849[this.f24848].set(millis);
            int i = this.f24848 + 1;
            this.f24848 = i;
            if (i == 100) {
                this.f24848 = 0;
            }
        }
    }

    public final String toString() {
        List list;
        StringBuilder sb = new StringBuilder("StatsStore [");
        synchronized (this) {
            list = (List) C23573.stream(this.f24849, 0, this.f24848).collect(C24205.toList());
        }
        sb.append(list);
        sb.append("], size=100, index=");
        return C5410.m11876(this.f24848, "]", sb);
    }
}
