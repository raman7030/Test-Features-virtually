package p067l;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ۜᩴ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: C7LA */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC8965 {
    SYNTHETIC(4096),
    MANDATED(32768);


    /* JADX INFO: renamed from: ᩸ */
    public final int f24288;

    /* JADX INFO: renamed from: ֫ */
    public static int m20703(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            i |= ((EnumC8965) it.next()).f24288;
        }
        return i;
    }

    EnumC8965(int i) {
        this.f24288 = i;
    }
}
