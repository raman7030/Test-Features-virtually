package p067l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۜ۟ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: R790 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8656 {

    /* JADX INFO: renamed from: ۧ */
    public boolean f23245;

    /* JADX INFO: renamed from: ܽ */
    public long f23246;

    /* JADX INFO: renamed from: ᩳ */
    public long f23248;

    /* JADX INFO: renamed from: ܿ */
    public final HashMap f23247 = new HashMap();

    /* JADX INFO: renamed from: ֫ */
    public final HashMap f23244 = new HashMap();

    /* JADX INFO: renamed from: ۧ */
    public static ArrayList m20092(C8656 c8656, int i) {
        c8656.getClass();
        ArrayList arrayList = new ArrayList();
        for (C4633 c4633 : c8656.f23247.values()) {
            if (c4633.f10380 == i) {
                arrayList.add(c4633);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m20091(C8656 c8656, C4633 c4633) {
        c8656.f23247.put(Integer.valueOf(c4633.f10383), c4633);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003b  */
    /* JADX WARN: Code duplicated, block: B:21:0x0054  */
    /* JADX WARN: Code duplicated, block: B:23:0x005c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0069  */
    /* JADX INFO: renamed from: ᩳ */
    public static void m20098(C8656 c8656) {
        long jM3953;
        for (C4633 c4633 : c8656.m20087()) {
            if (c4633.f10382 <= 0 || c4633.f10381 || c4633.f10379) {
                throw new C20727();
            }
            long j = c8656.f23246;
            if (j > 0) {
                long j2 = c8656.f23248;
                if (j2 > 0) {
                    jM3953 = C2620.m3953(j, j2);
                } else if (c4633.f10386 <= 0 && c8656.f23248 > 0) {
                    jM3953 = C2620.m3953(c4633.f10386, c8656.f23248);
                } else if (c4633.f10385 > 0) {
                    jM3953 = C2620.m3953(c4633.f10385, c4633.f10382);
                } else {
                    jM3953 = -9223372036854775807L;
                }
            } else if (c4633.f10386 <= 0) {
                if (c4633.f10385 > 0) {
                    jM3953 = C2620.m3953(c4633.f10385, c4633.f10382);
                } else {
                    jM3953 = -9223372036854775807L;
                }
            } else if (c4633.f10385 > 0) {
                jM3953 = C2620.m3953(c4633.f10385, c4633.f10382);
            } else {
                jM3953 = -9223372036854775807L;
            }
            c4633.f10384 = jM3953;
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public static boolean m20097(C8656 c8656) {
        if (c8656.f23245) {
            return true;
        }
        Iterator it = c8656.f23247.values().iterator();
        while (it.hasNext()) {
            if (((C4633) it.next()).f10379) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public ArrayList m20087() {
        ArrayList arrayList = new ArrayList();
        for (C4633 c4633 : this.f23247.values()) {
            if (c4633.f10380 == 1 || c4633.f10380 == 2) {
                arrayList.add(c4633);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C16031 m20089(C8656 c8656, int i) {
        return (C16031) c8656.f23244.get(Integer.valueOf(i));
    }
}
