package p067l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩺ۤۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 77HF */
/* JADX INFO: loaded from: classes.dex */
public final class C24157 {
    /* JADX INFO: renamed from: ֫ */
    public static void m53406(String str, long j, long j2) {
        C13429 c13429;
        if (j2 < 180000) {
            return;
        }
        if (j < 5000) {
            m53408(str);
            return;
        }
        if (j2 - j < 10000) {
            m53408(str);
            return;
        }
        ArrayList arrayListM53405 = m53405();
        Iterator it = arrayListM53405.iterator();
        do {
            if (!it.hasNext()) {
                c13429 = null;
                break;
            }
            c13429 = (C13429) it.next();
        } while (!c13429.f37719.equals(str));
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (c13429 != null) {
            c13429.f37720 = j;
            c13429.f37717 = j2;
            c13429.f37718 = jCurrentTimeMillis;
        } else {
            arrayListM53405.add(new C13429(str, j, j2, jCurrentTimeMillis));
        }
        if (arrayListM53405.size() > 100) {
            Collections.sort(arrayListM53405, new C8064());
            while (arrayListM53405.size() > 100) {
                C19925.m45229(arrayListM53405, 1);
            }
        }
        m53407(arrayListM53405);
    }

    /* JADX INFO: renamed from: ֫ */
    public static long m53404(String str) {
        ArrayList<C13429> arrayListM53405 = m53405();
        for (C13429 c13429 : arrayListM53405) {
            if (c13429.f37719.equals(str)) {
                long j = c13429.f37720;
                if (j <= 0 || j > c13429.f37717) {
                    break;
                    break;
                }
                c13429.f37718 = System.currentTimeMillis();
                m53407(arrayListM53405);
                return c13429.f37720;
            }
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m53408(String str) {
        ArrayList arrayListM53405 = m53405();
        for (int i = 0; i < arrayListM53405.size(); i++) {
            if (((C13429) arrayListM53405.get(i)).f37719.equals(str)) {
                arrayListM53405.remove(i);
                m53407(arrayListM53405);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m53405() {
        ArrayList arrayList = new ArrayList();
        try {
            C14677 c14677M33572 = C14677.m33572(ApplicationC21448.f67649.mo20201("vpp", (byte[]) null));
            c14677M33572.m33577(1699025492);
            int i = c14677M33572.readByte() & 255;
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(new C13429(c14677M33572.m33593(), c14677M33572.readLong(), c14677M33572.readLong(), c14677M33572.readLong()));
            }
            return arrayList;
        } catch (Exception unused) {
            arrayList.clear();
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m53407(ArrayList arrayList) {
        C11996 c11996M45308 = C19965.m45308(1699025492);
        c11996M45308.writeByte(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C13429 c13429 = (C13429) it.next();
            c11996M45308.m27459(c13429.f37719);
            c11996M45308.m27451(c13429.f37720);
            c11996M45308.m27451(c13429.f37717);
            c11996M45308.m27451(c13429.f37718);
        }
        ApplicationC21448.f67649.edit().mo27877("vpp", c11996M45308.m27447()).apply();
    }
}
