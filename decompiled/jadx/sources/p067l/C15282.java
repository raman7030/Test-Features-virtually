package p067l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܰۙۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: P7FQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C15282 {
    /* JADX INFO: renamed from: ֫ */
    public static void m34781(int i, String str) {
        C24000 c24000;
        if (i < 0) {
            m34783(str);
            return;
        }
        ArrayList arrayListM34780 = m34780();
        Iterator it = arrayListM34780.iterator();
        do {
            if (!it.hasNext()) {
                c24000 = null;
                break;
            }
            c24000 = (C24000) it.next();
        } while (!c24000.f76219.equals(str));
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (c24000 != null) {
            c24000.f76218 = i;
            c24000.f76217 = jCurrentTimeMillis;
        } else {
            arrayListM34780.add(new C24000(str, i, jCurrentTimeMillis));
        }
        if (arrayListM34780.size() > 100) {
            Collections.sort(arrayListM34780, new C13272());
            while (arrayListM34780.size() > 100) {
                C19925.m45229(arrayListM34780, 1);
            }
        }
        m34782(arrayListM34780);
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m34779(String str) {
        ArrayList<C24000> arrayListM34780 = m34780();
        for (C24000 c24000 : arrayListM34780) {
            if (c24000.f76219.equals(str)) {
                if (c24000.f76218 < 0) {
                    return -1;
                }
                c24000.f76217 = System.currentTimeMillis();
                m34782(arrayListM34780);
                return c24000.f76218;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m34783(String str) {
        ArrayList arrayListM34780 = m34780();
        for (int i = 0; i < arrayListM34780.size(); i++) {
            if (((C24000) arrayListM34780.get(i)).f76219.equals(str)) {
                arrayListM34780.remove(i);
                m34782(arrayListM34780);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m34780() {
        ArrayList arrayList = new ArrayList();
        try {
            byte[] bArrMo20201 = ApplicationC21448.f67649.mo20201("vats", (byte[]) null);
            if (bArrMo20201 != null && bArrMo20201.length != 0) {
                C14677 c14677M33572 = C14677.m33572(bArrMo20201);
                c14677M33572.m33577(1699025494);
                int i = c14677M33572.readByte() & 255;
                for (int i2 = 0; i2 < i; i2++) {
                    arrayList.add(new C24000(c14677M33572.m33593(), c14677M33572.readInt(), c14677M33572.readLong()));
                }
            }
            return arrayList;
        } catch (Exception unused) {
            arrayList.clear();
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m34782(ArrayList arrayList) {
        C11996 c11996M45308 = C19965.m45308(1699025494);
        c11996M45308.writeByte(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C24000 c24000 = (C24000) it.next();
            c11996M45308.m27459(c24000.f76219);
            c11996M45308.writeInt(c24000.f76218);
            c11996M45308.m27451(c24000.f76217);
        }
        ApplicationC21448.f67649.edit().mo27877("vats", c11996M45308.m27447()).apply();
    }
}
