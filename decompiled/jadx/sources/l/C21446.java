package l;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: renamed from: l.᩸۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 91JR */
/* JADX INFO: loaded from: classes5.dex */
public final class C21446 extends C5923 {

    /* JADX INFO: renamed from: ۡۧ, reason: not valid java name and contains not printable characters */
    public int f69047;

    /* JADX INFO: renamed from: ۢۧ, reason: not valid java name and contains not printable characters */
    public int f69048;

    /* JADX INFO: renamed from: ֫ۧ, reason: not valid java name and contains not printable characters */
    public C7334 f69042 = new C7334(this);

    /* JADX INFO: renamed from: ۧۧ, reason: not valid java name and contains not printable characters */
    public C16711 f69049 = new C16711(this);

    /* JADX INFO: renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC13683 f69045 = null;

    /* JADX INFO: renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public boolean f69051 = false;

    /* JADX INFO: renamed from: ܺۧ, reason: not valid java name and contains not printable characters */
    public C17212 f69052 = new C17212();

    /* JADX INFO: renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public int f69054 = 0;

    /* JADX INFO: renamed from: ۘۧ, reason: not valid java name and contains not printable characters */
    public int f69044 = 0;

    /* JADX INFO: renamed from: ۖۧ, reason: not valid java name and contains not printable characters */
    public C18624[] f69043 = new C18624[4];

    /* JADX INFO: renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public C18624[] f69055 = new C18624[4];

    /* JADX INFO: renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public int f69058 = 257;

    /* JADX INFO: renamed from: ᩴۧ, reason: not valid java name and contains not printable characters */
    public boolean f69056 = false;

    /* JADX INFO: renamed from: ܽۧ, reason: not valid java name and contains not printable characters */
    public boolean f69053 = false;

    /* JADX INFO: renamed from: ֡ۧ, reason: not valid java name and contains not printable characters */
    public WeakReference f69041 = null;

    /* JADX INFO: renamed from: ۟֫, reason: not valid java name and contains not printable characters */
    public WeakReference f69046 = null;

    /* JADX INFO: renamed from: ᩵ۧ, reason: not valid java name and contains not printable characters */
    public WeakReference f69057 = null;

    /* JADX INFO: renamed from: ܰ֫, reason: not valid java name and contains not printable characters */
    public WeakReference f69050 = null;

    /* JADX INFO: renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public C22856 f69059 = new C22856();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48565(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f69048 = i6;
        this.f69047 = i7;
        this.f69042.m19692(this, i, i2, i3, i4, i5);
    }

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public final void m48570() {
        this.f69042.m19691(this);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48567(InterfaceC13683 interfaceC13683) {
        this.f69045 = interfaceC13683;
        this.f69049.m39332(interfaceC13683);
    }

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC13683 m48571() {
        return this.f69045;
    }

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final void m48581() {
        this.f69052.getClass();
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final void m48572(int i) {
        this.f69058 = i;
        C17212.f52792 = m48564(512);
    }

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public final int m48580() {
        return this.f69058;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m48564(int i) {
        return (this.f69058 & i) == i;
    }

    @Override // l.C5923, l.C15094
    /* JADX INFO: renamed from: ᩺ */
    public final void mo16611() {
        this.f69052.m40505();
        this.f69048 = 0;
        this.f69047 = 0;
        super.mo16611();
    }

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public final boolean m48569() {
        return this.f69056;
    }

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public final boolean m48573() {
        return this.f69053;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m48579(C5218 c5218) {
        WeakReference weakReference = this.f69041;
        if (weakReference == null || weakReference.get() == null || c5218.m15004() > ((C5218) this.f69041.get()).m15004()) {
            this.f69041 = new WeakReference(c5218);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m48575(C5218 c5218) {
        WeakReference weakReference = this.f69057;
        if (weakReference == null || weakReference.get() == null || c5218.m15004() > ((C5218) this.f69057.get()).m15004()) {
            this.f69057 = new WeakReference(c5218);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48566(C5218 c5218) {
        WeakReference weakReference = this.f69050;
        if (weakReference == null || weakReference.get() == null || c5218.m15004() > ((C5218) this.f69050.get()).m15004()) {
            this.f69050 = new WeakReference(c5218);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m48576(C17212 c17212) {
        boolean zM48564 = m48564(64);
        mo7759(c17212, zM48564);
        int size = this.f18169.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            C15094 c15094 = (C15094) this.f18169.get(i);
            c15094.m35711(0, false);
            c15094.m35711(1, false);
            if (c15094 instanceof C2396) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                C15094 c15095 = (C15094) this.f18169.get(i2);
                if (c15095 instanceof C2396) {
                    ((C2396) c15095).m7761();
                }
            }
        }
        for (int i3 = 0; i3 < size; i3++) {
            C15094 c15096 = (C15094) this.f18169.get(i3);
            c15096.getClass();
            if ((c15096 instanceof C10157) || (c15096 instanceof C3101)) {
                c15096.mo7759(c17212, zM48564);
            }
        }
        if (C17212.f52792) {
            HashSet<C15094> hashSet = new HashSet();
            for (int i4 = 0; i4 < size; i4++) {
                C15094 c15097 = (C15094) this.f18169.get(i4);
                c15097.getClass();
                if (!(c15097 instanceof C10157) && !(c15097 instanceof C3101)) {
                    hashSet.add(c15097);
                }
            }
            m35720(this, c17212, hashSet, this.f46124[0] == EnumC8040.WRAP_CONTENT ? 0 : 1, false);
            for (C15094 c15098 : hashSet) {
                C12273.m29805(this, c17212, c15098);
                c15098.mo7759(c17212, zM48564);
            }
        } else {
            for (int i5 = 0; i5 < size; i5++) {
                C15094 c15099 = (C15094) this.f18169.get(i5);
                if (c15099 instanceof C21446) {
                    EnumC8040[] enumC8040Arr = c15099.f46124;
                    EnumC8040 enumC8040 = enumC8040Arr[0];
                    EnumC8040 enumC8041 = enumC8040Arr[1];
                    EnumC8040 enumC8042 = EnumC8040.WRAP_CONTENT;
                    if (enumC8040 == enumC8042) {
                        c15099.m35717(EnumC8040.FIXED);
                    }
                    if (enumC8041 == enumC8042) {
                        c15099.m35746(EnumC8040.FIXED);
                    }
                    c15099.mo7759(c17212, zM48564);
                    if (enumC8040 == enumC8042) {
                        c15099.m35717(enumC8040);
                    }
                    if (enumC8041 == enumC8042) {
                        c15099.m35746(enumC8041);
                    }
                } else {
                    C12273.m29805(this, c17212, c15099);
                    if (!(c15099 instanceof C10157) && !(c15099 instanceof C3101)) {
                        c15099.mo7759(c17212, zM48564);
                    }
                }
            }
        }
        if (this.f69054 > 0) {
            C3807.m11489(this, c17212, null, 0);
        }
        if (this.f69044 > 0) {
            C3807.m11489(this, c17212, null, 1);
        }
    }

    @Override // l.C15094
    /* JADX INFO: renamed from: ֫ */
    public final void mo35722(boolean z, boolean z2) {
        super.mo35722(z, z2);
        int size = this.f18169.size();
        for (int i = 0; i < size; i++) {
            ((C15094) this.f18169.get(i)).mo35722(z, z2);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m48577(boolean z) {
        this.f69051 = z;
    }

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public final boolean m48578() {
        return this.f69051;
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
    @Override // l.C5923
    /* JADX INFO: renamed from: ܳ֫ */
    public final void mo16610() {
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        int iMax;
        int iMax2;
        EnumC8040 enumC8040;
        EnumC8040 enumC8041;
        boolean z4;
        ?? r0;
        EnumC8040 enumC8042;
        int i2 = 0;
        this.f46163 = 0;
        this.f46121 = 0;
        this.f69056 = false;
        this.f69053 = false;
        int size = this.f18169.size();
        int iMax3 = Math.max(0, m35753());
        int iMax4 = Math.max(0, m35732());
        EnumC8040[] enumC8040Arr = this.f46124;
        EnumC8040 enumC8043 = enumC8040Arr[1];
        EnumC8040 enumC8044 = enumC8040Arr[0];
        if (C12273.m29806(this.f69058, 1)) {
            C23767.m52438(this, this.f69045);
            for (int i3 = 0; i3 < size; i3++) {
                C15094 c15094 = (C15094) this.f18169.get(i3);
                if (c15094.m35740() && !(c15094 instanceof C3101) && !(c15094 instanceof C2396) && !(c15094 instanceof C10157) && !c15094.m35748()) {
                    EnumC8040 enumC8040M35741 = c15094.m35741(0);
                    EnumC8040 enumC8040M35742 = c15094.m35741(1);
                    EnumC8040 enumC8045 = EnumC8040.MATCH_CONSTRAINT;
                    if (enumC8040M35741 != enumC8045 || c15094.f46145 == 1 || enumC8040M35742 != enumC8045 || c15094.f46170 == 1) {
                        m48563(c15094, this.f69045, new C22856());
                    }
                }
            }
        }
        if (size <= 2 || !((enumC8044 == (enumC8042 = EnumC8040.WRAP_CONTENT) || enumC8043 == enumC8042) && C12273.m29806(this.f69058, 1024) && C6834.m18518(this, this.f69045))) {
            z = false;
        } else {
            if (enumC8044 == enumC8042) {
                if (iMax3 < m35753() && iMax3 > 0) {
                    m35770(iMax3);
                    this.f69056 = true;
                } else {
                    iMax3 = m35753();
                }
            }
            if (enumC8043 == enumC8042) {
                if (iMax4 < m35732() && iMax4 > 0) {
                    m35733(iMax4);
                    this.f69053 = true;
                } else {
                    iMax4 = m35732();
                }
            }
            z = true;
        }
        boolean z5 = m48564(64) || m48564(128);
        C17212 c17212 = this.f69052;
        c17212.getClass();
        c17212.f52806 = false;
        if (this.f69058 != 0 && z5) {
            c17212.f52806 = true;
        }
        ArrayList arrayList = this.f18169;
        EnumC8040[] enumC8040Arr2 = this.f46124;
        EnumC8040 enumC8046 = enumC8040Arr2[0];
        EnumC8040 enumC8047 = EnumC8040.WRAP_CONTENT;
        boolean z6 = enumC8046 == enumC8047 || enumC8040Arr2[1] == enumC8047;
        this.f69054 = 0;
        this.f69044 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            C15094 c15095 = (C15094) this.f18169.get(i4);
            if (c15095 instanceof C5923) {
                ((C5923) c15095).mo16610();
            }
        }
        boolean zM48564 = m48564(64);
        int i5 = 0;
        boolean z7 = true;
        while (z7) {
            i5++;
            try {
                c17212.m40505();
                this.f69054 = i2;
                this.f69044 = i2;
                m35719(c17212);
                for (int i6 = 0; i6 < size; i6++) {
                    ((C15094) this.f18169.get(i6)).m35719(c17212);
                }
                m48576(c17212);
                try {
                    WeakReference weakReference = this.f69041;
                    if (weakReference != null && weakReference.get() != null) {
                        c17212.m40502(c17212.m40495((C5218) this.f69041.get()), c17212.m40495(this.f46161), i2, 5);
                        this.f69041 = null;
                    }
                    WeakReference weakReference2 = this.f69057;
                    if (weakReference2 != null && weakReference2.get() != null) {
                        c17212.m40502(c17212.m40495(this.f46133), c17212.m40495((C5218) this.f69057.get()), i2, 5);
                        this.f69057 = null;
                    }
                    WeakReference weakReference3 = this.f69046;
                    if (weakReference3 != null && weakReference3.get() != null) {
                        c17212.m40502(c17212.m40495((C5218) this.f69046.get()), c17212.m40495(this.f46141), i2, 5);
                        this.f69046 = null;
                    }
                    WeakReference weakReference4 = this.f69050;
                    if (weakReference4 != null && weakReference4.get() != null) {
                        c17212.m40502(c17212.m40495(this.f46159), c17212.m40495((C5218) this.f69050.get()), i2, 5);
                        this.f69050 = null;
                    }
                    c17212.m40506();
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
            boolean[] zArr = C12273.f36562;
            if (z2) {
                zArr[2] = false;
                boolean zM48565 = m48564(64);
                mo9457(c17212, zM48565);
                int i7 = 0;
                for (int size2 = this.f18169.size(); i7 < size2; size2 = size2) {
                    ((C15094) this.f18169.get(i7)).mo9457(c17212, zM48565);
                    i7++;
                }
            } else {
                mo9457(c17212, zM48564);
                for (int i8 = 0; i8 < size; i8++) {
                    ((C15094) this.f18169.get(i8)).mo9457(c17212, zM48564);
                }
            }
            if (z6 && i5 < 8 && zArr[2]) {
                int i9 = 0;
                int iMax5 = 0;
                int iMax6 = 0;
                while (i9 < size) {
                    C15094 c15096 = (C15094) this.f18169.get(i9);
                    iMax5 = Math.max(iMax5, c15096.m35753() + c15096.f46163);
                    iMax6 = Math.max(iMax6, c15096.m35732() + c15096.f46121);
                    i9++;
                    size = size;
                }
                i = size;
                int iMax7 = Math.max(this.f46165, iMax5);
                int iMax8 = Math.max(this.f46127, iMax6);
                EnumC8040 enumC8048 = EnumC8040.WRAP_CONTENT;
                if (enumC8044 != enumC8048 || m35753() >= iMax7) {
                    z3 = false;
                } else {
                    m35770(iMax7);
                    this.f46124[0] = enumC8048;
                    z3 = true;
                    z = true;
                }
                if (enumC8043 == enumC8048 && m35732() < iMax8) {
                    m35733(iMax8);
                    this.f46124[1] = enumC8048;
                    z3 = true;
                    z = true;
                }
                iMax = Math.max(this.f46165, m35753());
                if (iMax > m35753()) {
                    m35770(iMax);
                    this.f46124[0] = EnumC8040.FIXED;
                    z3 = true;
                    z = true;
                }
                iMax2 = Math.max(this.f46127, m35732());
                if (iMax2 > m35732()) {
                    m35733(iMax2);
                    this.f46124[1] = EnumC8040.FIXED;
                    z3 = true;
                    z = true;
                }
                if (z) {
                    z7 = z3;
                } else {
                    enumC8040 = this.f46124[0];
                    enumC8041 = EnumC8040.WRAP_CONTENT;
                    if (enumC8040 == enumC8041 || iMax3 <= 0 || m35753() <= iMax3) {
                        z4 = z3;
                        r0 = 1;
                    } else {
                        r0 = 1;
                        this.f69056 = true;
                        this.f46124[0] = EnumC8040.FIXED;
                        m35770(iMax3);
                        z4 = true;
                        z = true;
                    }
                    if (this.f46124[r0] == enumC8041 || iMax4 <= 0 || m35732() <= iMax4) {
                        z3 = z4;
                        z7 = z3;
                    } else {
                        this.f69053 = r0;
                        this.f46124[r0] = EnumC8040.FIXED;
                        m35733(iMax4);
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
            iMax = Math.max(this.f46165, m35753());
            if (iMax > m35753()) {
                m35770(iMax);
                this.f46124[0] = EnumC8040.FIXED;
                z3 = true;
                z = true;
            }
            iMax2 = Math.max(this.f46127, m35732());
            if (iMax2 > m35732()) {
                m35733(iMax2);
                this.f46124[1] = EnumC8040.FIXED;
                z3 = true;
                z = true;
            }
            if (z) {
                enumC8040 = this.f46124[0];
                enumC8041 = EnumC8040.WRAP_CONTENT;
                if (enumC8040 == enumC8041) {
                    z4 = z3;
                    r0 = 1;
                } else {
                    z4 = z3;
                    r0 = 1;
                }
                if (this.f46124[r0] == enumC8041) {
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
        this.f18169 = arrayList;
        if (z8) {
            EnumC8040[] enumC8040Arr3 = this.f46124;
            enumC8040Arr3[0] = enumC8044;
            enumC8040Arr3[1] = enumC8043;
        }
        mo16609(c17212.m40503());
    }

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public final C17212 m48574() {
        return this.f69052;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48568(C15094 c15094, int i) {
        if (i == 0) {
            int i2 = this.f69054 + 1;
            C18624[] c18624Arr = this.f69055;
            if (i2 >= c18624Arr.length) {
                this.f69055 = (C18624[]) Arrays.copyOf(c18624Arr, c18624Arr.length * 2);
            }
            C18624[] c18624Arr2 = this.f69055;
            int i3 = this.f69054;
            c18624Arr2[i3] = new C18624(c15094, 0, this.f69051);
            this.f69054 = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.f69044 + 1;
            C18624[] c18624Arr3 = this.f69043;
            if (i4 >= c18624Arr3.length) {
                this.f69043 = (C18624[]) Arrays.copyOf(c18624Arr3, c18624Arr3.length * 2);
            }
            C18624[] c18624Arr4 = this.f69043;
            int i5 = this.f69044;
            c18624Arr4[i5] = new C18624(c15094, 1, this.f69051);
            this.f69044 = i5 + 1;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48563(C15094 c15094, InterfaceC13683 interfaceC13683, C22856 c22856) {
        int i;
        int i2;
        if (interfaceC13683 == null) {
            return;
        }
        EnumC8040[] enumC8040Arr = c15094.f46124;
        int[] iArr = c15094.f46119;
        c22856.f73745 = enumC8040Arr[0];
        c22856.f73753 = enumC8040Arr[1];
        c22856.f73748 = c15094.m35753();
        c22856.f73747 = c15094.m35732();
        c22856.f73754 = false;
        c22856.f73750 = 0;
        EnumC8040 enumC8040 = c22856.f73745;
        EnumC8040 enumC8041 = EnumC8040.MATCH_CONSTRAINT;
        boolean z = enumC8040 == enumC8041;
        boolean z2 = c22856.f73753 == enumC8041;
        boolean z3 = z && c15094.f46108 > 0.0f;
        boolean z4 = z2 && c15094.f46108 > 0.0f;
        if (z && c15094.m35761(0) && c15094.f46145 == 0 && !z3) {
            c22856.f73745 = EnumC8040.WRAP_CONTENT;
            if (z2 && c15094.f46170 == 0) {
                c22856.f73745 = EnumC8040.FIXED;
            }
            z = false;
        }
        if (z2 && c15094.m35761(1) && c15094.f46170 == 0 && !z4) {
            c22856.f73753 = EnumC8040.WRAP_CONTENT;
            if (z && c15094.f46145 == 0) {
                c22856.f73753 = EnumC8040.FIXED;
            }
            z2 = false;
        }
        if (c15094.mo7762()) {
            c22856.f73745 = EnumC8040.FIXED;
            z = false;
        }
        if (c15094.mo7768()) {
            c22856.f73753 = EnumC8040.FIXED;
            z2 = false;
        }
        if (z3) {
            if (iArr[0] == 4) {
                c22856.f73745 = EnumC8040.FIXED;
            } else if (!z2) {
                EnumC8040 enumC8042 = c22856.f73753;
                EnumC8040 enumC8043 = EnumC8040.FIXED;
                if (enumC8042 == enumC8043) {
                    i2 = c22856.f73747;
                } else {
                    c22856.f73745 = EnumC8040.WRAP_CONTENT;
                    interfaceC13683.mo32930(c15094, c22856);
                    i2 = c22856.f73749;
                }
                c22856.f73745 = enumC8043;
                int i3 = c15094.f46122;
                if (i3 == 0 || i3 == -1) {
                    c22856.f73748 = (int) (c15094.f46108 * i2);
                } else {
                    c22856.f73748 = (int) (c15094.f46108 / i2);
                }
            }
        }
        if (z4) {
            if (iArr[1] == 4) {
                c22856.f73753 = EnumC8040.FIXED;
            } else if (!z) {
                EnumC8040 enumC8044 = c22856.f73745;
                EnumC8040 enumC8045 = EnumC8040.FIXED;
                if (enumC8044 == enumC8045) {
                    i = c22856.f73748;
                } else {
                    c22856.f73753 = EnumC8040.WRAP_CONTENT;
                    interfaceC13683.mo32930(c15094, c22856);
                    i = c22856.f73746;
                }
                c22856.f73753 = enumC8045;
                int i4 = c15094.f46122;
                if (i4 == 0 || i4 == -1) {
                    c22856.f73747 = (int) (i / c15094.f46108);
                } else {
                    c22856.f73747 = (int) (i * c15094.f46108);
                }
            }
        }
        interfaceC13683.mo32930(c15094, c22856);
        c15094.m35770(c22856.f73746);
        c15094.m35733(c22856.f73749);
        c15094.m35721(c22856.f73751);
        c15094.m35752(c22856.f73752);
        c22856.f73750 = 0;
    }
}
