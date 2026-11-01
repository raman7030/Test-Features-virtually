package p067l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۠᩶ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: T72Q */
/* JADX INFO: loaded from: classes3.dex */
public final class C10351 {

    /* JADX INFO: renamed from: ֫ */
    public static final Object f28662 = new Object();

    /* JADX INFO: renamed from: ۧ */
    public static long f28663;

    /* JADX INFO: renamed from: ֫ */
    public static boolean m23978(AbstractC15599 abstractC15599, List list, int i) {
        C4744 c4744 = C4744.f10749;
        if (abstractC15599 == c4744) {
            if (list.isEmpty() || i < 0 || i >= list.size()) {
                throw new IllegalArgumentException("Invalid music playlist");
            }
            if (abstractC15599 == c4744 && !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    try {
                        if (((InterfaceC19370) it.next()).mo26445().m38665()) {
                        }
                    } catch (RuntimeException unused) {
                    }
                }
                synchronized (f28662) {
                    m23973(i, 0, list);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m23975(AbstractC15599 abstractC15599, int i) {
        if (abstractC15599 != C4744.f10749) {
            return;
        }
        synchronized (f28662) {
            if (ApplicationC21448.f67649.contains("mpl")) {
                ApplicationC21448.f67649.edit().mo27875(i, "mpi").remove("mpp").apply();
                f28663++;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m23976(AbstractC15599 abstractC15599, int i, int i2) {
        if (abstractC15599 != C4744.f10749) {
            return;
        }
        synchronized (f28662) {
            if (ApplicationC21448.f67649.contains("mpl") && ApplicationC21448.f67649.mo20200(21, "mpi") && ApplicationC21448.f67649.getInt("mpi", -1) == i) {
                InterfaceC14770 interfaceC14770Edit = ApplicationC21448.f67649.edit();
                if (i2 > 0) {
                    interfaceC14770Edit.mo27875(i2, "mpp");
                } else {
                    interfaceC14770Edit.remove("mpp");
                }
                interfaceC14770Edit.apply();
                f28663++;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m23974(AbstractC15599 abstractC15599) {
        if (abstractC15599 != C4744.f10749) {
            return;
        }
        synchronized (f28662) {
            if (ApplicationC21448.f67649.contains("mpp")) {
                ApplicationC21448.f67649.edit().remove("mpp").apply();
                f28663++;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C3645 m23972() {
        boolean zContains;
        byte[] bArrMo20201;
        int i;
        int i2;
        boolean z;
        long j;
        int i3;
        synchronized (f28662) {
            zContains = ApplicationC21448.f67649.contains("mpl");
            bArrMo20201 = ApplicationC21448.f67649.mo20200(25, "mpl") ? ApplicationC21448.f67649.mo20201("mpl", (byte[]) null) : null;
            i = ApplicationC21448.f67649.mo20200(21, "mpi") ? ApplicationC21448.f67649.getInt("mpi", -1) : -1;
            boolean zContains2 = ApplicationC21448.f67649.contains("mpp");
            boolean z2 = !zContains2 || ApplicationC21448.f67649.mo20200(21, "mpp");
            i2 = z2 ? ApplicationC21448.f67649.getInt("mpp", 0) : 0;
            z = zContains2 && (!z2 || i2 <= 0);
            if (i2 <= 0) {
                i2 = 0;
            }
            j = f28663;
        }
        if (bArrMo20201 == null || bArrMo20201.length == 0) {
            return new C3645(null, zContains, 0, j);
        }
        try {
            ArrayList arrayListM23971 = m23971(bArrMo20201);
            if (i < 0 || i >= arrayListM23971.size()) {
                throw new IllegalArgumentException("Invalid music playlist index");
            }
            ArrayList arrayList = new ArrayList(arrayListM23971.size());
            ArrayList arrayList2 = new ArrayList(arrayListM23971.size());
            boolean z3 = false;
            for (int i4 = 0; i4 < arrayListM23971.size(); i4++) {
                try {
                    AbstractC17043 abstractC17043M42109 = C18524.m42109((String) arrayListM23971.get(i4), new String[0]);
                    if (abstractC17043M42109.mo25093()) {
                        C11450 c11450 = new C11450(abstractC17043M42109);
                        if (c11450.mo39137().startsWith("audio/")) {
                            arrayList.add(c11450);
                            arrayList2.add(Integer.valueOf(i4));
                            if (i4 == i) {
                                z3 = true;
                            }
                        }
                    }
                } catch (RuntimeException unused) {
                }
            }
            if (arrayList.isEmpty()) {
                return new C3645(null, true, 0, j);
            }
            int iIntValue = ((Integer) arrayList2.get(0)).intValue();
            int iAbs = Math.abs(iIntValue - i);
            int i5 = 0;
            for (int i6 = 1; i6 < arrayList2.size(); i6++) {
                int iIntValue2 = ((Integer) arrayList2.get(i6)).intValue();
                int iAbs2 = Math.abs(iIntValue2 - i);
                if (iAbs2 < iAbs || (iAbs2 == iAbs && iIntValue2 > iIntValue)) {
                    i5 = i6;
                    iIntValue = iIntValue2;
                    iAbs = iAbs2;
                }
            }
            if (z3 || i2 <= 0) {
                i3 = i2;
            } else {
                z = true;
                i3 = 0;
            }
            return new C3645(new C4847(C4744.f10749, arrayList, i5), arrayList.size() != arrayListM23971.size() || z, i3, j);
        } catch (RuntimeException unused2) {
            return new C3645(null, true, 0, j);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m23977(C3645 c3645) {
        synchronized (f28662) {
            if (f28663 != c3645.m6921()) {
                return false;
            }
            if (!c3645.m6922()) {
                return true;
            }
            C4847 c4847M6920 = c3645.m6920();
            if (c4847M6920 != null) {
                m23973(c4847M6920.m10273(), c3645.m6923(), c4847M6920.m10274());
            } else {
                ApplicationC21448.f67649.edit().remove("mpl").remove("mpi").remove("mpp").apply();
                f28663++;
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m23971(byte[] bArr) {
        C14677 c14677M33572 = C14677.m33572(bArr);
        if (c14677M33572.readInt() != 1297107969) {
            throw new IllegalArgumentException("Unsupported music playlist format");
        }
        int i = c14677M33572.readInt();
        if (i <= 0 || i > c14677M33572.available()) {
            throw new IllegalArgumentException("Invalid music playlist size");
        }
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            String strM33593 = c14677M33572.m33593();
            if (strM33593.isEmpty()) {
                throw new IllegalArgumentException("Invalid music path");
            }
            arrayList.add(strM33593);
        }
        if (c14677M33572.available() == 0) {
            return arrayList;
        }
        throw new IllegalArgumentException("Trailing music playlist data");
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m23973(int i, int i2, List list) {
        ArrayList<String> arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC19370) it.next()).getPath());
        }
        InterfaceC14770 interfaceC14770Edit = ApplicationC21448.f67649.edit();
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("Empty music playlist");
        }
        C11996 c11996M45308 = C19965.m45308(1297107969);
        c11996M45308.writeInt(arrayList.size());
        for (String str : arrayList) {
            if (str == null || str.isEmpty()) {
                throw new IllegalArgumentException("Invalid music path");
            }
            c11996M45308.m27459(str);
        }
        InterfaceC14770 interfaceC14770Mo27875 = interfaceC14770Edit.mo27877("mpl", c11996M45308.m27447()).mo27875(i, "mpi");
        if (i2 > 0) {
            interfaceC14770Mo27875.mo27875(i2, "mpp");
        } else {
            interfaceC14770Mo27875.remove("mpp");
        }
        interfaceC14770Mo27875.apply();
        f28663++;
    }
}
