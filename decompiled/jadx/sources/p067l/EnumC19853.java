package p067l;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ᩴ֡֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 643O */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC19853 {
    OPEN(32),
    SYNTHETIC(4096),
    MANDATED(32768);


    /* JADX INFO: renamed from: ᩸ */
    public final int f60349;

    /* JADX INFO: renamed from: ֫ */
    public static int m45101(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            i |= ((EnumC19853) it.next()).f60349;
        }
        return i;
    }

    EnumC19853(int i) {
        this.f60349 = i;
    }
}
