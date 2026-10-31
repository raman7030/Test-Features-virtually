package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۜ۟ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: R790 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6616 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f20368;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f20369;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f20371;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final HashMap f20370 = new HashMap();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashMap f20367 = new HashMap();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static ArrayList m18140(C6616 c6616, int i) {
        c6616.getClass();
        ArrayList arrayList = new ArrayList();
        for (C2383 c2383 : c6616.f20370.values()) {
            if (c2383.f7589 == i) {
                arrayList.add(c2383);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m18139(C6616 c6616, C2383 c2383) {
        c6616.f20370.put(Integer.valueOf(c2383.f7592), c2383);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003b  */
    /* JADX WARN: Code duplicated, block: B:21:0x0054  */
    /* JADX WARN: Code duplicated, block: B:23:0x005c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0069  */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m18146(C6616 c6616) {
        long jM1555;
        for (C2383 c2383 : c6616.m18135()) {
            if (c2383.f7591 <= 0 || c2383.f7590 || c2383.f7588) {
                throw new C19317();
            }
            long j = c6616.f20369;
            if (j > 0) {
                long j2 = c6616.f20371;
                if (j2 > 0) {
                    jM1555 = C0265.m1555(j, j2);
                } else if (c2383.f7595 <= 0 && c6616.f20371 > 0) {
                    jM1555 = C0265.m1555(c2383.f7595, c6616.f20371);
                } else if (c2383.f7594 > 0) {
                    jM1555 = C0265.m1555(c2383.f7594, c2383.f7591);
                } else {
                    jM1555 = -9223372036854775807L;
                }
            } else if (c2383.f7595 <= 0) {
                if (c2383.f7594 > 0) {
                    jM1555 = C0265.m1555(c2383.f7594, c2383.f7591);
                } else {
                    jM1555 = -9223372036854775807L;
                }
            } else if (c2383.f7594 > 0) {
                jM1555 = C0265.m1555(c2383.f7594, c2383.f7591);
            } else {
                jM1555 = -9223372036854775807L;
            }
            c2383.f7593 = jM1555;
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static boolean m18145(C6616 c6616) {
        if (c6616.f20368) {
            return true;
        }
        Iterator it = c6616.f20370.values().iterator();
        while (it.hasNext()) {
            if (((C2383) it.next()).f7588) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ArrayList m18135() {
        ArrayList arrayList = new ArrayList();
        for (C2383 c2383 : this.f20370.values()) {
            if (c2383.f7589 == 1 || c2383.f7589 == 2) {
                arrayList.add(c2383);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C14376 m18137(C6616 c6616, int i) {
        return (C14376) c6616.f20367.get(Integer.valueOf(i));
    }
}
