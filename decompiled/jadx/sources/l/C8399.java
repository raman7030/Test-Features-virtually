package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۠᩶ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: T72Q */
/* JADX INFO: loaded from: classes3.dex */
public final class C8399 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Object f25749 = new Object();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static long f25750;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m22008(AbstractC13921 abstractC13921, List list, int i) {
        C2499 c2499 = C2499.f7958;
        if (abstractC13921 == c2499) {
            if (list.isEmpty() || i < 0 || i >= list.size()) {
                throw new IllegalArgumentException("Invalid music playlist");
            }
            if (abstractC13921 == c2499 && !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    try {
                        if (((InterfaceC17889) it.next()).mo24433().m36507()) {
                        }
                    } catch (RuntimeException unused) {
                    }
                }
                synchronized (f25749) {
                    m22003(i, 0, list);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m22005(AbstractC13921 abstractC13921, int i) {
        if (abstractC13921 != C2499.f7958) {
            return;
        }
        synchronized (f25749) {
            if (ApplicationC20075.f65008.contains("mpl")) {
                ApplicationC20075.f65008.edit().mo25853(i, "mpi").remove("mpp").apply();
                f25750++;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m22006(AbstractC13921 abstractC13921, int i, int i2) {
        if (abstractC13921 != C2499.f7958) {
            return;
        }
        synchronized (f25749) {
            if (ApplicationC20075.f65008.contains("mpl") && ApplicationC20075.f65008.mo18252(21, "mpi") && ApplicationC20075.f65008.getInt("mpi", -1) == i) {
                InterfaceC13049 interfaceC13049Edit = ApplicationC20075.f65008.edit();
                if (i2 > 0) {
                    interfaceC13049Edit.mo25853(i2, "mpp");
                } else {
                    interfaceC13049Edit.remove("mpp");
                }
                interfaceC13049Edit.apply();
                f25750++;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m22004(AbstractC13921 abstractC13921) {
        if (abstractC13921 != C2499.f7958) {
            return;
        }
        synchronized (f25749) {
            if (ApplicationC20075.f65008.contains("mpp")) {
                ApplicationC20075.f65008.edit().remove("mpp").apply();
                f25750++;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C1343 m22002() {
        boolean zContains;
        byte[] bArrMo18253;
        int i;
        int i2;
        boolean z;
        long j;
        int i3;
        synchronized (f25749) {
            zContains = ApplicationC20075.f65008.contains("mpl");
            bArrMo18253 = ApplicationC20075.f65008.mo18252(25, "mpl") ? ApplicationC20075.f65008.mo18253("mpl", (byte[]) null) : null;
            i = ApplicationC20075.f65008.mo18252(21, "mpi") ? ApplicationC20075.f65008.getInt("mpi", -1) : -1;
            boolean zContains2 = ApplicationC20075.f65008.contains("mpp");
            boolean z2 = !zContains2 || ApplicationC20075.f65008.mo18252(21, "mpp");
            i2 = z2 ? ApplicationC20075.f65008.getInt("mpp", 0) : 0;
            z = zContains2 && (!z2 || i2 <= 0);
            if (i2 <= 0) {
                i2 = 0;
            }
            j = f25750;
        }
        if (bArrMo18253 == null || bArrMo18253.length == 0) {
            return new C1343(null, zContains, 0, j);
        }
        try {
            ArrayList arrayListM22001 = m22001(bArrMo18253);
            if (i < 0 || i >= arrayListM22001.size()) {
                throw new IllegalArgumentException("Invalid music playlist index");
            }
            ArrayList arrayList = new ArrayList(arrayListM22001.size());
            ArrayList arrayList2 = new ArrayList(arrayListM22001.size());
            boolean z3 = false;
            for (int i4 = 0; i4 < arrayListM22001.size(); i4++) {
                try {
                    AbstractC15440 abstractC15440M39866 = C16999.m39866((String) arrayListM22001.get(i4), new String[0]);
                    if (abstractC15440M39866.mo23119()) {
                        C9555 c9555 = new C9555(abstractC15440M39866);
                        if (c9555.mo36971().startsWith("audio/")) {
                            arrayList.add(c9555);
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
                return new C1343(null, true, 0, j);
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
            return new C1343(new C2608(C2499.f7958, arrayList, i5), arrayList.size() != arrayListM22001.size() || z, i3, j);
        } catch (RuntimeException unused2) {
            return new C1343(null, true, 0, j);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m22007(C1343 c1343) {
        synchronized (f25749) {
            if (f25750 != c1343.m4689()) {
                return false;
            }
            if (!c1343.m4690()) {
                return true;
            }
            C2608 c2608M4688 = c1343.m4688();
            if (c2608M4688 != null) {
                m22003(c2608M4688.m8232(), c1343.m4691(), c2608M4688.m8233());
            } else {
                ApplicationC20075.f65008.edit().remove("mpl").remove("mpi").remove("mpp").apply();
                f25750++;
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m22001(byte[] bArr) {
        C12951 c12951M31485 = C12951.m31485(bArr);
        if (c12951M31485.readInt() != 1297107969) {
            throw new IllegalArgumentException("Unsupported music playlist format");
        }
        int i = c12951M31485.readInt();
        if (i <= 0 || i > c12951M31485.available()) {
            throw new IllegalArgumentException("Invalid music playlist size");
        }
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            String strM31506 = c12951M31485.m31506();
            if (strM31506.isEmpty()) {
                throw new IllegalArgumentException("Invalid music path");
            }
            arrayList.add(strM31506);
        }
        if (c12951M31485.available() == 0) {
            return arrayList;
        }
        throw new IllegalArgumentException("Trailing music playlist data");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m22003(int i, int i2, List list) {
        ArrayList<String> arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC17889) it.next()).getPath());
        }
        InterfaceC13049 interfaceC13049Edit = ApplicationC20075.f65008.edit();
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("Empty music playlist");
        }
        C10130 c10130M43030 = C18515.m43030(1297107969);
        c10130M43030.writeInt(arrayList.size());
        for (String str : arrayList) {
            if (str == null || str.isEmpty()) {
                throw new IllegalArgumentException("Invalid music path");
            }
            c10130M43030.m25439(str);
        }
        InterfaceC13049 interfaceC13049Mo25853 = interfaceC13049Edit.mo25855("mpl", c10130M43030.m25427()).mo25853(i, "mpi");
        if (i2 > 0) {
            interfaceC13049Mo25853.mo25853(i2, "mpp");
        } else {
            interfaceC13049Mo25853.remove("mpp");
        }
        interfaceC13049Mo25853.apply();
        f25750++;
    }
}
