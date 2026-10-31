package l;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ܽۨ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Z556 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16611 extends AbstractC18769 implements InterfaceC18444 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final C0225 f51032 = new C0225(C17615.f53826 * 2);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f51033 = 0;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f51034;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12918 f51035;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final int f51036;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f51037;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f51038 = -1;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f51039;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f51040;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f51041;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f51042;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C7980 f51043;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f51044;

    public C16611(C12918 c12918, C18729 c18729, C7980 c7980, int i, InterfaceC13848 interfaceC13848, InterfaceC13848 interfaceC13849, int i2) {
        this.f51035 = c12918;
        this.f51043 = c7980;
        c18729.getClass();
        int iM43363 = c18729.m43363() + i;
        this.f51037 = iM43363;
        this.f51042 = c18729.m43368();
        this.f51041 = c18729.m43368();
        this.f51034 = i2;
        this.f51040 = interfaceC13848.seekTo(iM43363);
        this.f51036 = interfaceC13849.seekTo(iM43363);
    }

    @Override // l.InterfaceC5471
    /* JADX INFO: renamed from: ܳ */
    public final String mo3566() {
        return this.f51043.getType();
    }

    @Override // l.InterfaceC18444
    /* JADX INFO: renamed from: ܽ */
    public final int mo3567() {
        return this.f51042;
    }

    @Override // l.InterfaceC5471
    public final String getName() {
        C12918 c12918 = this.f51035;
        return c12918.m31422(c12918.m31418().mo11935(m39122() + 4));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39131(Writer writer) {
        C12918 c12918 = this.f51035;
        c12918.m31385(c12918.m31418().mo11935(m39122() + 4), writer, false);
    }

    @Override // l.InterfaceC5471
    /* JADX INFO: renamed from: ᩳ */
    public final String mo3568() {
        C12918 c12918 = this.f51035;
        return c12918.m31401(c12918.m31418().mo11935(m39127() + 4));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m39135(Writer writer) {
        C12918 c12918 = this.f51035;
        c12918.m31386(writer, c12918.m31418().mo11935(m39127() + 4));
    }

    @Override // l.InterfaceC18444
    public final List getParameters() {
        if (m39126() > 0) {
            return new ArrayList(new C5863(this, mo3565()));
        }
        return AbstractC14545.of();
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final List m39128() {
        return AbstractC10844.m27107(this.f51035, this.f51036);
    }

    @Override // l.InterfaceC5471
    /* JADX INFO: renamed from: ۘ */
    public final List mo3565() {
        int iM39126 = m39126();
        if (iM39126 > 0) {
            return new C11508(this, iM39126 + 4, this.f51035.m31418().mo11935(iM39126));
        }
        return AbstractC14545.of();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m39134(Writer writer) {
        int iM39126 = m39126();
        if (iM39126 > 0) {
            C12918 c12918 = this.f51035;
            int iMo11935 = c12918.m31418().mo11935(iM39126);
            int i = iM39126 + 4;
            for (int i2 = 0; i2 < iMo11935; i2++) {
                c12918.m31386(writer, c12918.m31418().m11936((i2 * 2) + i));
            }
        }
    }

    @Override // l.InterfaceC18444
    public final Set getAnnotations() {
        return AbstractC10844.m27106(this.f51035, this.f51040);
    }

    @Override // l.InterfaceC18444
    /* JADX INFO: renamed from: ᩵ */
    public final Set mo3569() {
        int i = this.f51034;
        if (i == 7) {
            return AbstractC6079.of();
        }
        return EnumSet.copyOf((Collection) EnumC18481.m42970(i));
    }

    @Override // l.InterfaceC18444
    /* JADX INFO: renamed from: ᩷ۧ */
    public final C20846 mo3570() {
        int i = this.f51041;
        if (i > 0) {
            return new C20846(this.f51035, this, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39132(InterfaceC7274 interfaceC7274) {
        C12918 c12918 = this.f51035;
        if (c12918.m31420()) {
            throw new AssertionError("replaceNeverExecutedInstructionsWithNop is unsupported for direct const-string scan");
        }
        int i = this.f51041;
        if (i <= 0) {
            return;
        }
        AbstractC3912 abstractC3912M31418 = c12918.m31418();
        int iMo11935 = abstractC3912M31418.mo11935(i + 12);
        int i2 = i + 16;
        long j = (((long) iMo11935) * 2) + ((long) i2);
        if (j > 2147483647L) {
            throw new C15431(null, "Instruction list for method %s is out of range", this);
        }
        int i3 = (int) j;
        while (i2 < i3) {
            int iM11942 = abstractC3912M31418.m11942(i2);
            if (iM11942 == 0) {
                iM11942 = abstractC3912M31418.m11936(i2);
            }
            EnumC0841 enumC0841M21189 = c12918.mo27437().m21189(iM11942);
            int iM39123 = m39123(abstractC3912M31418, i2, enumC0841M21189);
            if (iM39123 <= 0) {
                throw new C15431(null, "Invalid instruction size in method %s at offset 0x%x", this, Integer.valueOf(i2));
            }
            long j2 = (((long) iM39123) * 2) + ((long) i2);
            if (j2 > i3) {
                throw new C15431(null, "The last instruction in method %s is truncated", this);
            }
            if (enumC0841M21189 == EnumC0841.f3137) {
                interfaceC7274.mo19516(abstractC3912M31418.m11936(i2 + 2));
            } else if (enumC0841M21189 == EnumC0841.f3220) {
                interfaceC7274.mo19516(abstractC3912M31418.mo11935(i2 + 2));
            }
            i2 = (int) j2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00bc A[SYNTHETIC] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m39129(int i, InterfaceC1795 interfaceC1795) {
        int iMo11933;
        long jMo11943;
        boolean zMo5981;
        C12918 c12918 = this.f51035;
        if (c12918.m31420()) {
            throw new AssertionError("replaceNeverExecutedInstructionsWithNop is unsupported for direct literal scan");
        }
        int i2 = this.f51041;
        if (i2 <= 0) {
            return -1;
        }
        AbstractC3912 abstractC3912M31418 = c12918.m31418();
        int iMo11935 = abstractC3912M31418.mo11935(i2 + 12);
        int i3 = i2 + 16;
        long j = 2;
        long j2 = (((long) iMo11935) * 2) + ((long) i3);
        if (j2 > 2147483647L) {
            throw new C15431(null, "Instruction list for method %s is out of range", this);
        }
        int i4 = (int) j2;
        int i5 = 0;
        while (i3 < i4) {
            int iM11942 = abstractC3912M31418.m11942(i3);
            if (iM11942 == 0) {
                iM11942 = abstractC3912M31418.m11936(i3);
            }
            EnumC0841 enumC0841M21189 = c12918.mo27437().m21189(iM11942);
            int iM39123 = m39123(abstractC3912M31418, i3, enumC0841M21189);
            if (iM39123 <= 0) {
                throw new C15431(null, "Invalid instruction size in method %s at offset 0x%x", this, Integer.valueOf(i3));
            }
            long j3 = (((long) iM39123) * j) + ((long) i3);
            if (j3 > i4) {
                throw new C15431(null, "The last instruction in method %s is truncated", this);
            }
            int i6 = i5 + 1;
            if (i5 >= i && enumC0841M21189 != null) {
                switch (C13623.f40632[enumC0841M21189.f3316.ordinal()]) {
                    case 8:
                        iMo11933 = (abstractC3912M31418.mo11933(i3 + 1) << 24) >> 28;
                        jMo11943 = iMo11933;
                        zMo5981 = interfaceC1795.mo5981(enumC0841M21189, jMo11943);
                        if (!zMo5981) {
                            return i6;
                        }
                        break;
                        break;
                    case 9:
                        iMo11933 = abstractC3912M31418.mo11943(i3 + 2);
                        jMo11943 = iMo11933;
                        zMo5981 = interfaceC1795.mo5981(enumC0841M21189, jMo11943);
                        if (!zMo5981) {
                            return i6;
                        }
                        break;
                    case 10:
                        iMo11933 = ((short) abstractC3912M31418.mo11943(i3 + 2)) << 16;
                        jMo11943 = iMo11933;
                        zMo5981 = interfaceC1795.mo5981(enumC0841M21189, jMo11943);
                        if (!zMo5981) {
                            return i6;
                        }
                        break;
                    case 11:
                        jMo11943 = ((long) ((short) abstractC3912M31418.mo11943(i3 + 2))) << 48;
                        zMo5981 = interfaceC1795.mo5981(enumC0841M21189, jMo11943);
                        if (!zMo5981) {
                            return i6;
                        }
                        break;
                    case 12:
                        iMo11933 = abstractC3912M31418.mo11933(i3 + 3);
                        jMo11943 = iMo11933;
                        zMo5981 = interfaceC1795.mo5981(enumC0841M21189, jMo11943);
                        if (!zMo5981) {
                            return i6;
                        }
                        break;
                    case 13:
                        iMo11933 = abstractC3912M31418.mo11943(i3 + 2);
                        jMo11943 = iMo11933;
                        zMo5981 = interfaceC1795.mo5981(enumC0841M21189, jMo11943);
                        if (!zMo5981) {
                            return i6;
                        }
                        break;
                    case 14:
                        iMo11933 = abstractC3912M31418.mo11937(i3 + 2);
                        jMo11943 = iMo11933;
                        zMo5981 = interfaceC1795.mo5981(enumC0841M21189, jMo11943);
                        if (!zMo5981) {
                            return i6;
                        }
                        break;
                    case 15:
                        jMo11943 = abstractC3912M31418.mo11940(i3 + 2);
                        zMo5981 = interfaceC1795.mo5981(enumC0841M21189, jMo11943);
                        if (!zMo5981) {
                            return i6;
                        }
                        break;
                    default:
                        zMo5981 = true;
                        if (!zMo5981) {
                            return i6;
                        }
                        break;
                }
            }
            i3 = (int) j3;
            i5 = i6;
            j = 2;
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0086  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m39130(int i, InterfaceC10968 interfaceC10968) {
        int iM11936;
        C12918 c12918 = this.f51035;
        if (c12918.m31420()) {
            throw new AssertionError("replaceNeverExecutedInstructionsWithNop is unsupported for direct reference scan");
        }
        int i2 = this.f51041;
        if (i2 <= 0) {
            return -1;
        }
        AbstractC3912 abstractC3912M31418 = c12918.m31418();
        int iMo11935 = abstractC3912M31418.mo11935(i2 + 12);
        int i3 = i2 + 16;
        long j = 2;
        long j2 = (((long) iMo11935) * 2) + ((long) i3);
        if (j2 > 2147483647L) {
            throw new C15431(null, "Instruction list for method %s is out of range", this);
        }
        int i4 = (int) j2;
        int i5 = 0;
        while (i3 < i4) {
            int iM11942 = abstractC3912M31418.m11942(i3);
            if (iM11942 == 0) {
                iM11942 = abstractC3912M31418.m11936(i3);
            }
            EnumC0841 enumC0841M21189 = c12918.mo27437().m21189(iM11942);
            int iM39123 = m39123(abstractC3912M31418, i3, enumC0841M21189);
            if (iM39123 <= 0) {
                throw new C15431(null, "Invalid instruction size in method %s at offset 0x%x", this, Integer.valueOf(i3));
            }
            long j3 = (((long) iM39123) * j) + ((long) i3);
            if (j3 > i4) {
                throw new C15431(null, "The last instruction in method %s is truncated", this);
            }
            int i6 = i5 + 1;
            if (i5 >= i && enumC0841M21189 != null && enumC0841M21189.f3318 != 7) {
                switch (C13623.f40632[enumC0841M21189.f3316.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        iM11936 = abstractC3912M31418.m11936(i3 + 2);
                        break;
                    case 7:
                        iM11936 = abstractC3912M31418.mo11935(i3 + 2);
                        break;
                    default:
                        iM11936 = -1;
                        break;
                }
                if (iM11936 >= 0) {
                    if (!interfaceC10968.mo27280(i5, enumC0841M21189.f3318, iM11936, enumC0841M21189)) {
                        return i6;
                    }
                }
            }
            i3 = (int) j3;
            i5 = i6;
            j = 2;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m39123(AbstractC3912 abstractC3912, int i, EnumC0841 enumC0841) {
        if (enumC0841 == null) {
            return 1;
        }
        int i2 = C13623.f40633[enumC0841.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                return (abstractC3912.m11936(i + 2) * 2) + 4;
            }
            if (i2 == 3) {
                return (abstractC3912.m11936(i + 2) * 4) + 2;
            }
            return enumC0841.f3316.f11595 / 2;
        }
        int iM11936 = abstractC3912.m11936(i + 2);
        if (iM11936 == 0) {
            return 4;
        }
        int iMo11937 = abstractC3912.mo11937(i + 4);
        if (iMo11937 < 0) {
            throw new C15431(null, "Invalid array-payload instruction: negative element count", new Object[0]);
        }
        long j = ((long) iM11936) * ((long) iMo11937);
        if (j > 2147483647L) {
            throw new C15431(null, "Invalid array-payload instruction: element width*count overflows", new Object[0]);
        }
        return ((((int) j) + 1) / 2) + 4;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private int m39122() {
        if (this.f51039 == 0) {
            this.f51039 = this.f51035.m31415(this.f51037);
        }
        return this.f51039;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private int m39127() {
        if (this.f51044 == 0) {
            C12918 c12918 = this.f51035;
            this.f51044 = c12918.m31399(c12918.m31418().m11936(m39122() + 2));
        }
        return this.f51044;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    private int m39126() {
        if (this.f51038 == -1) {
            this.f51038 = this.f51035.m31418().mo11935(m39127() + 8);
        }
        return this.f51038;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x011d A[PHI: r8
      0x011d: PHI (r8v3 l.ۨۖܽ) = (r8v2 l.ۨۖܽ), (r8v4 l.ۨۖܽ) binds: [B:66:0x011b, B:59:0x0106] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m39133(C16611 c16611, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C0225 c0225 = f51032;
        if (this.f51043.getType().equals(c16611.f51043.getType()) && getName().equals(c16611.getName()) && mo3568().equals(c16611.mo3568()) && C1321.m4613(mo3565(), c16611.mo3565()) && this.f51042 == c16611.f51042 && (((this.f51040 == 0 && c16611.f51040 == 0) || C3563.m10859(getAnnotations(), c16611.getAnnotations())) && ((this.f51034 == 7 && c16611.f51034 == 7) || C3563.m10859(mo3569(), c16611.mo3569())))) {
            C20846 c20846Mo3570 = mo3570();
            C20846 c20846Mo3571 = c16611.mo3570();
            boolean z6 = c20846Mo3570 == null || c20846Mo3570.m47669() == 0;
            boolean z7 = c20846Mo3571 == null || c20846Mo3571.m47669() == 0;
            if (z6 && z7) {
                return true;
            }
            if (!z6 && !z7 && (z3 || c20846Mo3570.mo3818() == c20846Mo3571.mo3818())) {
                C22357 c22357 = new C22357();
                c22357.f72438 = false;
                c22357.f72442 = true;
                c22357.f72440 = !z;
                c22357.f72437 = z3;
                c22357.f72441 = z4;
                c22357.f72439 = true;
                c22357.f72443 = z2;
                c22357.f72435 = this.f51035.mo27437().f24463;
                C1190 c1190 = new C1190(c22357, this, c20846Mo3570);
                C1190 c1191 = new C1190(c22357, c16611, c20846Mo3571);
                C11418 c11418M39124 = null;
                try {
                    try {
                        c11418M39124 = m39124(c1190, z5);
                        C7398 c7398 = new C7398(c11418M39124);
                        c1191.m4015(new C22796(c7398, z5));
                        c7398.m19921();
                        c1190.m4018();
                        c1191.m4018();
                        c0225.m1477(c11418M39124);
                        return true;
                    } catch (IOException e) {
                        e.printStackTrace(System.out);
                        c1190.m4018();
                        c1191.m4018();
                        if (c11418M39124 != null) {
                            c0225.m1477(c11418M39124);
                        }
                    } catch (C13747 unused) {
                        c1190.m4018();
                        c1191.m4018();
                        if (c11418M39124 != null) {
                            c0225.m1477(c11418M39124);
                        }
                    }
                } catch (Throwable th) {
                    c1190.m4018();
                    c1191.m4018();
                    if (c11418M39124 != null) {
                        c0225.m1477(c11418M39124);
                    }
                    throw th;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11418 m39124(C1190 c1190, boolean z) {
        C0225 c0225 = f51032;
        C11418 c11418 = (C11418) c0225.m1479();
        if (c11418 == null) {
            c11418 = new C11418();
        } else {
            c11418.m28185(0);
        }
        try {
            c1190.m4015(new C22796(new C22706(c11418), z));
            return c11418;
        } catch (IOException | RuntimeException e) {
            c0225.m1477(c11418);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static void m39125() {
        f51032.m1478();
    }
}
