package l;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: l.۟ۖ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: UAIG */
/* JADX INFO: loaded from: classes2.dex */
public final class C7171 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f21968;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AtomicLong[] f21969 = new AtomicLong[100];

    public C7171() {
        for (int i = 0; i < 100; i++) {
            this.f21969[i] = new AtomicLong(-1L);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19195(C2828 c2828) {
        long millis = c2828.toMillis();
        synchronized (this) {
            this.f21969[this.f21968].set(millis);
            int i = this.f21968 + 1;
            this.f21968 = i;
            if (i == 100) {
                this.f21968 = 0;
            }
        }
    }

    public final String toString() {
        List list;
        StringBuilder sb = new StringBuilder("StatsStore [");
        synchronized (this) {
            list = (List) C22311.stream(this.f21969, 0, this.f21968).collect(C22976.toList());
        }
        sb.append(list);
        sb.append("], size=100, index=");
        return C3200.m9831(this.f21968, "]", sb);
    }
}
