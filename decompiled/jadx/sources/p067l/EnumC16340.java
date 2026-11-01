package p067l;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ܳᩴ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: C7LA */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC16340 {
    SYNTHETIC(4096),
    MANDATED(32768);


    /* JADX INFO: renamed from: ᩸ */
    public final int f48017;

    /* JADX INFO: renamed from: ֫ */
    public static int m37139(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            i |= ((EnumC16340) it.next()).f48017;
        }
        return i;
    }

    EnumC16340(int i) {
        this.f48017 = i;
    }
}
