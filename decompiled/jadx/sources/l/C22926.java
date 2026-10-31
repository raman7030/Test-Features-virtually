package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩺ۤۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 77HF */
/* JADX INFO: loaded from: classes.dex */
public final class C22926 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m51015(String str, long j, long j2) {
        C11638 c11638;
        if (j2 < 180000) {
            return;
        }
        if (j < 5000) {
            m51017(str);
            return;
        }
        if (j2 - j < 10000) {
            m51017(str);
            return;
        }
        ArrayList arrayListM51014 = m51014();
        Iterator it = arrayListM51014.iterator();
        do {
            if (!it.hasNext()) {
                c11638 = null;
                break;
            }
            c11638 = (C11638) it.next();
        } while (!c11638.f34722.equals(str));
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (c11638 != null) {
            c11638.f34723 = j;
            c11638.f34720 = j2;
            c11638.f34721 = jCurrentTimeMillis;
        } else {
            arrayListM51014.add(new C11638(str, j, j2, jCurrentTimeMillis));
        }
        if (arrayListM51014.size() > 100) {
            Collections.sort(arrayListM51014, new C5993());
            while (arrayListM51014.size() > 100) {
                C18473.m42953(arrayListM51014, 1);
            }
        }
        m51016(arrayListM51014);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m51013(String str) {
        ArrayList<C11638> arrayListM51014 = m51014();
        for (C11638 c11638 : arrayListM51014) {
            if (c11638.f34722.equals(str)) {
                long j = c11638.f34723;
                if (j <= 0 || j > c11638.f34720) {
                    break;
                    break;
                }
                c11638.f34721 = System.currentTimeMillis();
                m51016(arrayListM51014);
                return c11638.f34723;
            }
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m51017(String str) {
        ArrayList arrayListM51014 = m51014();
        for (int i = 0; i < arrayListM51014.size(); i++) {
            if (((C11638) arrayListM51014.get(i)).f34722.equals(str)) {
                arrayListM51014.remove(i);
                m51016(arrayListM51014);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m51014() {
        ArrayList arrayList = new ArrayList();
        try {
            C12951 c12951M31485 = C12951.m31485(ApplicationC20075.f65008.mo18253("vpp", (byte[]) null));
            c12951M31485.m31490(1699025492);
            int i = c12951M31485.readByte() & 255;
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(new C11638(c12951M31485.m31506(), c12951M31485.readLong(), c12951M31485.readLong(), c12951M31485.readLong()));
            }
            return arrayList;
        } catch (Exception unused) {
            arrayList.clear();
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m51016(ArrayList arrayList) {
        C10130 c10130M43030 = C18515.m43030(1699025492);
        c10130M43030.writeByte(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C11638 c11638 = (C11638) it.next();
            c10130M43030.m25439(c11638.f34722);
            c10130M43030.m25431(c11638.f34723);
            c10130M43030.m25431(c11638.f34720);
            c10130M43030.m25431(c11638.f34721);
        }
        ApplicationC20075.f65008.edit().mo25855("vpp", c10130M43030.m25427()).apply();
    }
}
