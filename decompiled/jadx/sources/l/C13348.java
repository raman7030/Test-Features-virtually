package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.۬᩶᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: JAJQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C13348 implements Iterable {
    public final long getLast() {
        return 0L;
    }

    public final int hashCode() {
        if (1 > getLast()) {
            return -1;
        }
        return (int) (((long) 31) + (getLast() ^ (getLast() >>> 32)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C13348) {
            return (1 > getLast() && 1 > ((C13348) obj).getLast()) || getLast() == ((C13348) obj).getLast();
        }
        return false;
    }

    public final String toString() {
        return "1.." + getLast();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C3471(0L, 0L);
    }
}
