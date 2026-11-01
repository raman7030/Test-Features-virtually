package p067l;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.᩵֡֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 643O */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC20524 {
    DO_NOT_RESOLVE_BY_DEFAULT(1),
    WARN_DEPRECATED(2),
    WARN_DEPRECATED_REMOVAL(4),
    WARN_INCUBATING(8);


    /* JADX INFO: renamed from: ᩸ */
    public final int f63417;

    /* JADX INFO: renamed from: ֫ */
    public static int m46326(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            i |= ((EnumC20524) it.next()).f63417;
        }
        return i;
    }

    EnumC20524(int i) {
        this.f63417 = i;
    }
}
