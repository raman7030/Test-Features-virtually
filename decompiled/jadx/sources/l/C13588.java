package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܰۙۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: P7FQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C13588 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m32669(int i, String str) {
        C22761 c22761;
        if (i < 0) {
            m32671(str);
            return;
        }
        ArrayList arrayListM32668 = m32668();
        Iterator it = arrayListM32668.iterator();
        do {
            if (!it.hasNext()) {
                c22761 = null;
                break;
            }
            c22761 = (C22761) it.next();
        } while (!c22761.f73493.equals(str));
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (c22761 != null) {
            c22761.f73492 = i;
            c22761.f73491 = jCurrentTimeMillis;
        } else {
            arrayListM32668.add(new C22761(str, i, jCurrentTimeMillis));
        }
        if (arrayListM32668.size() > 100) {
            Collections.sort(arrayListM32668, new C11473());
            while (arrayListM32668.size() > 100) {
                C18473.m42953(arrayListM32668, 1);
            }
        }
        m32670(arrayListM32668);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m32667(String str) {
        ArrayList<C22761> arrayListM32668 = m32668();
        for (C22761 c22761 : arrayListM32668) {
            if (c22761.f73493.equals(str)) {
                if (c22761.f73492 < 0) {
                    return -1;
                }
                c22761.f73491 = System.currentTimeMillis();
                m32670(arrayListM32668);
                return c22761.f73492;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m32671(String str) {
        ArrayList arrayListM32668 = m32668();
        for (int i = 0; i < arrayListM32668.size(); i++) {
            if (((C22761) arrayListM32668.get(i)).f73493.equals(str)) {
                arrayListM32668.remove(i);
                m32670(arrayListM32668);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m32668() {
        ArrayList arrayList = new ArrayList();
        try {
            byte[] bArrMo18253 = ApplicationC20075.f65008.mo18253("vats", (byte[]) null);
            if (bArrMo18253 != null && bArrMo18253.length != 0) {
                C12951 c12951M31485 = C12951.m31485(bArrMo18253);
                c12951M31485.m31490(1699025494);
                int i = c12951M31485.readByte() & 255;
                for (int i2 = 0; i2 < i; i2++) {
                    arrayList.add(new C22761(c12951M31485.m31506(), c12951M31485.readInt(), c12951M31485.readLong()));
                }
            }
            return arrayList;
        } catch (Exception unused) {
            arrayList.clear();
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m32670(ArrayList arrayList) {
        C10130 c10130M43030 = C18515.m43030(1699025494);
        c10130M43030.writeByte(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C22761 c22761 = (C22761) it.next();
            c10130M43030.m25439(c22761.f73493);
            c10130M43030.writeInt(c22761.f73492);
            c10130M43030.m25431(c22761.f73491);
        }
        ApplicationC20075.f65008.edit().mo25855("vats", c10130M43030.m25427()).apply();
    }
}
