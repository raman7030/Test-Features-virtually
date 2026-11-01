package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.۬᩶᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: JAJQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C15055 implements Iterable {
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
        if (obj instanceof C15055) {
            return (1 > getLast() && 1 > ((C15055) obj).getLast()) || getLast() == ((C15055) obj).getLast();
        }
        return false;
    }

    public final String toString() {
        return "1.." + getLast();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C5668(0L, 0L);
    }
}
