package p067l;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: renamed from: l.᩸۠ */
/* JADX INFO: compiled from: 91JR */
/* JADX INFO: loaded from: classes5.dex */
public final class C1906 extends C1136 {

    /* JADX INFO: renamed from: ۡۧ */
    public int f71745;

    /* JADX INFO: renamed from: ۢۧ */
    public int f71746;

    /* JADX INFO: renamed from: ֫ۧ */
    public C1206 f71740 = new C1206(this);

    /* JADX INFO: renamed from: ۧۧ */
    public C1671 f71747 = new C1671(this);

    /* JADX INFO: renamed from: ۜۧ */
    public InterfaceC1521 f71743 = null;

    /* JADX INFO: renamed from: ܳۧ */
    public boolean f71749 = false;

    /* JADX INFO: renamed from: ܺۧ */
    public C1696 f71750 = new C1696();

    /* JADX INFO: renamed from: ܿۧ */
    public int f71752 = 0;

    /* JADX INFO: renamed from: ۘۧ */
    public int f71742 = 0;

    /* JADX INFO: renamed from: ۖۧ */
    public C1766[] f71741 = new C1766[4];

    /* JADX INFO: renamed from: ᩳۧ */
    public C1766[] f71753 = new C1766[4];

    /* JADX INFO: renamed from: ᩷ۧ */
    public int f71756 = 257;

    /* JADX INFO: renamed from: ᩴۧ */
    public boolean f71754 = false;

    /* JADX INFO: renamed from: ܽۧ */
    public boolean f71751 = false;

    /* JADX INFO: renamed from: ֡ۧ */
    public WeakReference f71739 = null;

    /* JADX INFO: renamed from: ۟֫ */
    public WeakReference f71744 = null;

    /* JADX INFO: renamed from: ᩵ۧ */
    public WeakReference f71755 = null;

    /* JADX INFO: renamed from: ܰ֫ */
    public WeakReference f71748 = null;

    /* JADX INFO: renamed from: ᩻ۧ */
    public C1976 f71757 = new C1976();

    /* JADX INFO: renamed from: ֫ */
    public final void m50902(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f71746 = i6;
        this.f71745 = i7;
        this.f71740.m21665(this, i, i2, i3, i4, i5);
    }

    /* JADX INFO: renamed from: ۘ֫ */
    public final void m50907() {
        this.f71740.m21664(this);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m50904(InterfaceC1521 interfaceC1521) {
        this.f71743 = interfaceC1521;
        this.f71747.m41568(interfaceC1521);
    }

    /* JADX INFO: renamed from: ۜ֫ */
    public final InterfaceC1521 m50908() {
        return this.f71743;
    }

    /* JADX INFO: renamed from: ᩻֫ */
    public final void m50918() {
        this.f71750.getClass();
    }

    /* JADX INFO: renamed from: ۠ */
    public final void m50909(int i) {
        this.f71756 = i;
        C1696.f55974 = m50901(512);
    }

    /* JADX INFO: renamed from: ᩷֫ */
    public final int m50917() {
        return this.f71756;
    }

    /* JADX INFO: renamed from: ֨ */
    public final boolean m50901(int i) {
        return (this.f71756 & i) == i;
    }

    @Override // p067l.C1136, p067l.C1591
    /* JADX INFO: renamed from: ᩺ */
    public final void mo18537() {
        this.f71750.m42752();
        this.f71746 = 0;
        this.f71745 = 0;
        super.mo18537();
    }

    /* JADX INFO: renamed from: ۖ֫ */
    public final boolean m50906() {
        return this.f71754;
    }

    /* JADX INFO: renamed from: ۡ֫ */
    public final boolean m50910() {
        return this.f71751;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m50916(C1101 c1101) {
        WeakReference weakReference = this.f71739;
        if (weakReference == null || weakReference.get() == null || c1101.m16914() > ((C1101) this.f71739.get()).m16914()) {
            this.f71739 = new WeakReference(c1101);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m50912(C1101 c1101) {
        WeakReference weakReference = this.f71755;
        if (weakReference == null || weakReference.get() == null || c1101.m16914() > ((C1101) this.f71755.get()).m16914()) {
            this.f71755 = new WeakReference(c1101);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m50903(C1101 c1101) {
        WeakReference weakReference = this.f71748;
        if (weakReference == null || weakReference.get() == null || c1101.m16914() > ((C1101) this.f71748.get()).m16914()) {
            this.f71748 = new WeakReference(c1101);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m50913(C1696 c1696) {
        boolean zM50901 = m50901(64);
        mo9822(c1696, zM50901);
        int size = this.f21023.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            C1591 c1591 = (C1591) this.f21023.get(i);
            c1591.m37869(0, false);
            c1591.m37869(1, false);
            if (c1591 instanceof C0961) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                C1591 c1592 = (C1591) this.f21023.get(i2);
                if (c1592 instanceof C0961) {
                    ((C0961) c1592).m9824();
                }
            }
        }
        for (int i3 = 0; i3 < size; i3++) {
            C1591 c1593 = (C1591) this.f21023.get(i3);
            c1593.getClass();
            if ((c1593 instanceof C1346) || (c1593 instanceof C0996)) {
                c1593.mo9822(c1696, zM50901);
            }
        }
        if (C1696.f55974) {
            HashSet<C1591> hashSet = new HashSet();
            for (int i4 = 0; i4 < size; i4++) {
                C1591 c1594 = (C1591) this.f21023.get(i4);
                c1594.getClass();
                if (!(c1594 instanceof C1346) && !(c1594 instanceof C0996)) {
                    hashSet.add(c1594);
                }
            }
            m37878(this, c1696, hashSet, this.f49244[0] == EnumC1241.WRAP_CONTENT ? 0 : 1, false);
            for (C1591 c1595 : hashSet) {
                C1451.m31867(this, c1696, c1595);
                c1595.mo9822(c1696, zM50901);
            }
        } else {
            for (int i5 = 0; i5 < size; i5++) {
                C1591 c1596 = (C1591) this.f21023.get(i5);
                if (c1596 instanceof C1906) {
                    EnumC1241[] enumC1241Arr = c1596.f49244;
                    EnumC1241 enumC1241 = enumC1241Arr[0];
                    EnumC1241 enumC1242 = enumC1241Arr[1];
                    EnumC1241 enumC1243 = EnumC1241.WRAP_CONTENT;
                    if (enumC1241 == enumC1243) {
                        c1596.m37875(EnumC1241.FIXED);
                    }
                    if (enumC1242 == enumC1243) {
                        c1596.m37904(EnumC1241.FIXED);
                    }
                    c1596.mo9822(c1696, zM50901);
                    if (enumC1241 == enumC1243) {
                        c1596.m37875(enumC1241);
                    }
                    if (enumC1242 == enumC1243) {
                        c1596.m37904(enumC1242);
                    }
                } else {
                    C1451.m31867(this, c1696, c1596);
                    if (!(c1596 instanceof C1346) && !(c1596 instanceof C0996)) {
                        c1596.mo9822(c1696, zM50901);
                    }
                }
            }
        }
        if (this.f71752 > 0) {
            C1031.m13425(this, c1696, null, 0);
        }
        if (this.f71742 > 0) {
            C1031.m13425(this, c1696, null, 1);
        }
    }

    @Override // p067l.C1591
    /* JADX INFO: renamed from: ֫ */
    public final void mo37880(boolean z, boolean z2) {
        super.mo37880(z, z2);
        int size = this.f21023.size();
        for (int i = 0; i < size; i++) {
            ((C1591) this.f21023.get(i)).mo37880(z, z2);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m50914(boolean z) {
        this.f71749 = z;
    }

    /* JADX INFO: renamed from: ܺ֫ */
    public final boolean m50915() {
        return this.f71749;
    }

    /* JADX WARN: Code duplicated, block: B:136:0x02af  */
    /* JADX WARN: Code duplicated, block: B:139:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:141:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:147:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:155:0x0319 A[PHI: r0 r8
      0x0319: PHI (r0v18 boolean) = (r0v17 boolean), (r0v22 boolean) binds: [B:140:0x02d6, B:154:0x0318] A[DONT_GENERATE, DONT_INLINE]
      0x0319: PHI (r8v13 boolean) = (r8v12 boolean), (r8v15 boolean) binds: [B:140:0x02d6, B:154:0x0318] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24 */
    @Override // p067l.C1136
    /* JADX INFO: renamed from: ܳ֫ */
    public final void mo18536() {
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        int iMax;
        int iMax2;
        EnumC1241 enumC1241;
        EnumC1241 enumC1242;
        boolean z4;
        ?? r0;
        EnumC1241 enumC1243;
        int i2 = 0;
        this.f49283 = 0;
        this.f49241 = 0;
        this.f71754 = false;
        this.f71751 = false;
        int size = this.f21023.size();
        int iMax3 = Math.max(0, m37911());
        int iMax4 = Math.max(0, m37890());
        EnumC1241[] enumC1241Arr = this.f49244;
        EnumC1241 enumC1244 = enumC1241Arr[1];
        EnumC1241 enumC1245 = enumC1241Arr[0];
        if (C1451.m31868(this.f71756, 1)) {
            C2021.m54847(this, this.f71743);
            for (int i3 = 0; i3 < size; i3++) {
                C1591 c1591 = (C1591) this.f21023.get(i3);
                if (c1591.m37898() && !(c1591 instanceof C0996) && !(c1591 instanceof C0961) && !(c1591 instanceof C1346) && !c1591.m37906()) {
                    EnumC1241 enumC1241M37899 = c1591.m37899(0);
                    EnumC1241 enumC1241M378910 = c1591.m37899(1);
                    EnumC1241 enumC1246 = EnumC1241.MATCH_CONSTRAINT;
                    if (enumC1241M37899 != enumC1246 || c1591.f49265 == 1 || enumC1241M378910 != enumC1246 || c1591.f49290 == 1) {
                        m50900(c1591, this.f71743, new C1976());
                    }
                }
            }
        }
        if (size <= 2 || !((enumC1245 == (enumC1243 = EnumC1241.WRAP_CONTENT) || enumC1244 == enumC1243) && C1451.m31868(this.f71756, 1024) && C1181.m20467(this, this.f71743))) {
            z = false;
        } else {
            if (enumC1245 == enumC1243) {
                if (iMax3 < m37911() && iMax3 > 0) {
                    m37928(iMax3);
                    this.f71754 = true;
                } else {
                    iMax3 = m37911();
                }
            }
            if (enumC1244 == enumC1243) {
                if (iMax4 < m37890() && iMax4 > 0) {
                    m37891(iMax4);
                    this.f71751 = true;
                } else {
                    iMax4 = m37890();
                }
            }
            z = true;
        }
        boolean z5 = m50901(64) || m50901(128);
        C1696 c1696 = this.f71750;
        c1696.getClass();
        c1696.f55988 = false;
        if (this.f71756 != 0 && z5) {
            c1696.f55988 = true;
        }
        ArrayList arrayList = this.f21023;
        EnumC1241[] enumC1241Arr2 = this.f49244;
        EnumC1241 enumC1247 = enumC1241Arr2[0];
        EnumC1241 enumC1248 = EnumC1241.WRAP_CONTENT;
        boolean z6 = enumC1247 == enumC1248 || enumC1241Arr2[1] == enumC1248;
        this.f71752 = 0;
        this.f71742 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            C1591 c1592 = (C1591) this.f21023.get(i4);
            if (c1592 instanceof C1136) {
                ((C1136) c1592).mo18536();
            }
        }
        boolean zM50901 = m50901(64);
        int i5 = 0;
        boolean z7 = true;
        while (z7) {
            i5++;
            try {
                c1696.m42752();
                this.f71752 = i2;
                this.f71742 = i2;
                m37877(c1696);
                for (int i6 = 0; i6 < size; i6++) {
                    ((C1591) this.f21023.get(i6)).m37877(c1696);
                }
                m50913(c1696);
                try {
                    WeakReference weakReference = this.f71739;
                    if (weakReference != null && weakReference.get() != null) {
                        c1696.m42749(c1696.m42742((C1101) this.f71739.get()), c1696.m42742(this.f49281), i2, 5);
                        this.f71739 = null;
                    }
                    WeakReference weakReference2 = this.f71755;
                    if (weakReference2 != null && weakReference2.get() != null) {
                        c1696.m42749(c1696.m42742(this.f49253), c1696.m42742((C1101) this.f71755.get()), i2, 5);
                        this.f71755 = null;
                    }
                    WeakReference weakReference3 = this.f71744;
                    if (weakReference3 != null && weakReference3.get() != null) {
                        c1696.m42749(c1696.m42742((C1101) this.f71744.get()), c1696.m42742(this.f49261), i2, 5);
                        this.f71744 = null;
                    }
                    WeakReference weakReference4 = this.f71748;
                    if (weakReference4 != null && weakReference4.get() != null) {
                        c1696.m42749(c1696.m42742(this.f49279), c1696.m42742((C1101) this.f71748.get()), i2, 5);
                        this.f71748 = null;
                    }
                    c1696.m42753();
                    z2 = true;
                } catch (Exception e) {
                    e = e;
                    z7 = true;
                    System.out.println("EXCEPTION : " + e);
                    z2 = z7;
                }
            } catch (Exception e2) {
                e = e2;
            }
            boolean[] zArr = C1451.f39578;
            if (z2) {
                zArr[2] = false;
                boolean zM50902 = m50901(64);
                mo11500(c1696, zM50902);
                int i7 = 0;
                for (int size2 = this.f21023.size(); i7 < size2; size2 = size2) {
                    ((C1591) this.f21023.get(i7)).mo11500(c1696, zM50902);
                    i7++;
                }
            } else {
                mo11500(c1696, zM50901);
                for (int i8 = 0; i8 < size; i8++) {
                    ((C1591) this.f21023.get(i8)).mo11500(c1696, zM50901);
                }
            }
            if (z6 && i5 < 8 && zArr[2]) {
                int i9 = 0;
                int iMax5 = 0;
                int iMax6 = 0;
                while (i9 < size) {
                    C1591 c1593 = (C1591) this.f21023.get(i9);
                    iMax5 = Math.max(iMax5, c1593.m37911() + c1593.f49283);
                    iMax6 = Math.max(iMax6, c1593.m37890() + c1593.f49241);
                    i9++;
                    size = size;
                }
                i = size;
                int iMax7 = Math.max(this.f49285, iMax5);
                int iMax8 = Math.max(this.f49247, iMax6);
                EnumC1241 enumC1249 = EnumC1241.WRAP_CONTENT;
                if (enumC1245 != enumC1249 || m37911() >= iMax7) {
                    z3 = false;
                } else {
                    m37928(iMax7);
                    this.f49244[0] = enumC1249;
                    z3 = true;
                    z = true;
                }
                if (enumC1244 == enumC1249 && m37890() < iMax8) {
                    m37891(iMax8);
                    this.f49244[1] = enumC1249;
                    z3 = true;
                    z = true;
                }
                iMax = Math.max(this.f49285, m37911());
                if (iMax > m37911()) {
                    m37928(iMax);
                    this.f49244[0] = EnumC1241.FIXED;
                    z3 = true;
                    z = true;
                }
                iMax2 = Math.max(this.f49247, m37890());
                if (iMax2 > m37890()) {
                    m37891(iMax2);
                    this.f49244[1] = EnumC1241.FIXED;
                    z3 = true;
                    z = true;
                }
                if (z) {
                    z7 = z3;
                } else {
                    enumC1241 = this.f49244[0];
                    enumC1242 = EnumC1241.WRAP_CONTENT;
                    if (enumC1241 == enumC1242 || iMax3 <= 0 || m37911() <= iMax3) {
                        z4 = z3;
                        r0 = 1;
                    } else {
                        r0 = 1;
                        this.f71754 = true;
                        this.f49244[0] = EnumC1241.FIXED;
                        m37928(iMax3);
                        z4 = true;
                        z = true;
                    }
                    if (this.f49244[r0] == enumC1242 || iMax4 <= 0 || m37890() <= iMax4) {
                        z3 = z4;
                        z7 = z3;
                    } else {
                        this.f71751 = r0;
                        this.f49244[r0] = EnumC1241.FIXED;
                        m37891(iMax4);
                        z = true;
                        z7 = true;
                    }
                }
                i2 = 0;
                size = i;
            } else {
                i = size;
                z3 = false;
            }
            z = z;
            iMax = Math.max(this.f49285, m37911());
            if (iMax > m37911()) {
                m37928(iMax);
                this.f49244[0] = EnumC1241.FIXED;
                z3 = true;
                z = true;
            }
            iMax2 = Math.max(this.f49247, m37890());
            if (iMax2 > m37890()) {
                m37891(iMax2);
                this.f49244[1] = EnumC1241.FIXED;
                z3 = true;
                z = true;
            }
            if (z) {
                enumC1241 = this.f49244[0];
                enumC1242 = EnumC1241.WRAP_CONTENT;
                if (enumC1241 == enumC1242) {
                    z4 = z3;
                    r0 = 1;
                } else {
                    z4 = z3;
                    r0 = 1;
                }
                if (this.f49244[r0] == enumC1242) {
                }
                z3 = z4;
                z7 = z3;
            } else {
                z7 = z3;
            }
            i2 = 0;
            size = i;
        }
        boolean z8 = z;
        this.f21023 = arrayList;
        if (z8) {
            EnumC1241[] enumC1241Arr3 = this.f49244;
            enumC1241Arr3[0] = enumC1245;
            enumC1241Arr3[1] = enumC1244;
        }
        mo18535(c1696.m42750());
    }

    /* JADX INFO: renamed from: ۢ֫ */
    public final C1696 m50911() {
        return this.f71750;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m50905(C1591 c1591, int i) {
        if (i == 0) {
            int i2 = this.f71752 + 1;
            C1766[] c1766Arr = this.f71753;
            if (i2 >= c1766Arr.length) {
                this.f71753 = (C1766[]) Arrays.copyOf(c1766Arr, c1766Arr.length * 2);
            }
            C1766[] c1766Arr2 = this.f71753;
            int i3 = this.f71752;
            c1766Arr2[i3] = new C1766(c1591, 0, this.f71749);
            this.f71752 = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.f71742 + 1;
            C1766[] c1766Arr3 = this.f71741;
            if (i4 >= c1766Arr3.length) {
                this.f71741 = (C1766[]) Arrays.copyOf(c1766Arr3, c1766Arr3.length * 2);
            }
            C1766[] c1766Arr4 = this.f71741;
            int i5 = this.f71742;
            c1766Arr4[i5] = new C1766(c1591, 1, this.f71749);
            this.f71742 = i5 + 1;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m50900(C1591 c1591, InterfaceC1521 interfaceC1521, C1976 c1976) {
        int i;
        int i2;
        if (interfaceC1521 == null) {
            return;
        }
        EnumC1241[] enumC1241Arr = c1591.f49244;
        int[] iArr = c1591.f49239;
        c1976.f76476 = enumC1241Arr[0];
        c1976.f76484 = enumC1241Arr[1];
        c1976.f76479 = c1591.m37911();
        c1976.f76478 = c1591.m37890();
        c1976.f76485 = false;
        c1976.f76481 = 0;
        EnumC1241 enumC1241 = c1976.f76476;
        EnumC1241 enumC1242 = EnumC1241.MATCH_CONSTRAINT;
        boolean z = enumC1241 == enumC1242;
        boolean z2 = c1976.f76484 == enumC1242;
        boolean z3 = z && c1591.f49228 > 0.0f;
        boolean z4 = z2 && c1591.f49228 > 0.0f;
        if (z && c1591.m37919(0) && c1591.f49265 == 0 && !z3) {
            c1976.f76476 = EnumC1241.WRAP_CONTENT;
            if (z2 && c1591.f49290 == 0) {
                c1976.f76476 = EnumC1241.FIXED;
            }
            z = false;
        }
        if (z2 && c1591.m37919(1) && c1591.f49290 == 0 && !z4) {
            c1976.f76484 = EnumC1241.WRAP_CONTENT;
            if (z && c1591.f49265 == 0) {
                c1976.f76484 = EnumC1241.FIXED;
            }
            z2 = false;
        }
        if (c1591.mo9825()) {
            c1976.f76476 = EnumC1241.FIXED;
            z = false;
        }
        if (c1591.mo9831()) {
            c1976.f76484 = EnumC1241.FIXED;
            z2 = false;
        }
        if (z3) {
            if (iArr[0] == 4) {
                c1976.f76476 = EnumC1241.FIXED;
            } else if (!z2) {
                EnumC1241 enumC1243 = c1976.f76484;
                EnumC1241 enumC1244 = EnumC1241.FIXED;
                if (enumC1243 == enumC1244) {
                    i2 = c1976.f76478;
                } else {
                    c1976.f76476 = EnumC1241.WRAP_CONTENT;
                    interfaceC1521.mo35045(c1591, c1976);
                    i2 = c1976.f76480;
                }
                c1976.f76476 = enumC1244;
                int i3 = c1591.f49242;
                if (i3 == 0 || i3 == -1) {
                    c1976.f76479 = (int) (c1591.f49228 * i2);
                } else {
                    c1976.f76479 = (int) (c1591.f49228 / i2);
                }
            }
        }
        if (z4) {
            if (iArr[1] == 4) {
                c1976.f76484 = EnumC1241.FIXED;
            } else if (!z) {
                EnumC1241 enumC1245 = c1976.f76476;
                EnumC1241 enumC1246 = EnumC1241.FIXED;
                if (enumC1245 == enumC1246) {
                    i = c1976.f76479;
                } else {
                    c1976.f76484 = EnumC1241.WRAP_CONTENT;
                    interfaceC1521.mo35045(c1591, c1976);
                    i = c1976.f76477;
                }
                c1976.f76484 = enumC1246;
                int i4 = c1591.f49242;
                if (i4 == 0 || i4 == -1) {
                    c1976.f76478 = (int) (i / c1591.f49228);
                } else {
                    c1976.f76478 = (int) (i * c1591.f49228);
                }
            }
        }
        interfaceC1521.mo35045(c1591, c1976);
        c1591.m37928(c1976.f76477);
        c1591.m37891(c1976.f76480);
        c1591.m37879(c1976.f76482);
        c1591.m37910(c1976.f76483);
        c1976.f76481 = 0;
    }
}
