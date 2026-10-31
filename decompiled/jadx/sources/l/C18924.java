package l;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: l.ᩴᩳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8SE */
/* JADX INFO: loaded from: classes5.dex */
public final class C18924 extends AbstractC0578 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final long f59618;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public float f59619;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f59620;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final long f59621;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long f59622;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final float f59623;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f59624;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C14185 f59625;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final float f59626;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f59627;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public AbstractC11163 f59628;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f59629;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final int f59630;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC13257 f59631;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final AbstractC14545 f59632;

    @Override // l.InterfaceC9731
    /* JADX INFO: renamed from: ۧ */
    public final Object mo3759() {
        return null;
    }

    public C18924(C13312 c13312, int[] iArr, InterfaceC13257 interfaceC13257, long j, long j2, long j3, AbstractC14545 abstractC14545) {
        super(c13312, iArr);
        if (j3 < j) {
            C19956.m46037("Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j3 = j;
        }
        this.f59631 = interfaceC13257;
        this.f59618 = j * 1000;
        this.f59621 = j2 * 1000;
        this.f59622 = j3 * 1000;
        this.f59630 = 1279;
        this.f59629 = 719;
        this.f59623 = 0.7f;
        this.f59626 = 0.75f;
        this.f59632 = AbstractC14545.copyOf((Collection) abstractC14545);
        this.f59625 = InterfaceC16427.f50519;
        this.f59619 = 1.0f;
        this.f59624 = 0;
        this.f59620 = -9223372036854775807L;
    }

    @Override // l.AbstractC0578, l.InterfaceC9731
    /* JADX INFO: renamed from: ܳ */
    public final void mo2386() {
        this.f59620 = -9223372036854775807L;
        this.f59628 = null;
    }

    @Override // l.AbstractC0578, l.InterfaceC9731
    /* JADX INFO: renamed from: ᩳ */
    public final void mo2389() {
        this.f59628 = null;
    }

    @Override // l.AbstractC0578, l.InterfaceC9731
    /* JADX INFO: renamed from: ֫ */
    public final void mo2378(float f) {
        this.f59619 = f;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0047  */
    /* JADX WARN: Code duplicated, block: B:19:0x0051  */
    /* JADX WARN: Code duplicated, block: B:21:0x005a  */
    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Code duplicated, block: B:24:0x006a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0093  */
    /* JADX WARN: Code duplicated, block: B:34:0x0097  */
    /* JADX WARN: Code duplicated, block: B:35:0x009a  */
    /* JADX WARN: Code duplicated, block: B:48:0x00bd  */
    @Override // l.InterfaceC9731
    /* JADX INFO: renamed from: ֫ */
    public final void mo3758(long j, long j2, long j3, List list, InterfaceC18218[] interfaceC18218Arr) {
        long jM43665;
        long jMo15261;
        long jMo15260;
        int i;
        int i2;
        int iM2376;
        int iM43664;
        long jMin;
        int i3;
        int i4;
        long j4;
        this.f59625.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i5 = this.f59627;
        if (i5 < interfaceC18218Arr.length && interfaceC18218Arr[i5].next()) {
            InterfaceC18218 interfaceC18218 = interfaceC18218Arr[this.f59627];
            jMo15261 = interfaceC18218.mo15261();
            jMo15260 = interfaceC18218.mo15260();
        } else {
            int length = interfaceC18218Arr.length;
            int i6 = 0;
            while (true) {
                if (i6 < length) {
                    InterfaceC18218 interfaceC18219 = interfaceC18218Arr[i6];
                    if (interfaceC18219.next()) {
                        jMo15261 = interfaceC18219.mo15261();
                        jMo15260 = interfaceC18219.mo15260();
                    } else {
                        i6++;
                    }
                } else {
                    jM43665 = m43665(list);
                    break;
                }
            }
            i = this.f59624;
            if (i == 0) {
                this.f59624 = 1;
                this.f59627 = m43664(jElapsedRealtime, jM43665);
                return;
            }
            i2 = this.f59627;
            if (list.isEmpty()) {
                iM2376 = -1;
            } else {
                iM2376 = m2376(((AbstractC11163) C8882.m22955(list)).f23468);
            }
            if (iM2376 != -1) {
                i = ((AbstractC11163) C8882.m22955(list)).f23466;
                i2 = iM2376;
            }
            iM43664 = m43664(jElapsedRealtime, jM43665);
            if (iM43664 != i2 && !mo2380(i2, jElapsedRealtime)) {
                C8353 c8353Mo2377 = mo2377(i2);
                C8353 c8353Mo2378 = mo2377(iM43664);
                jMin = this.f59618;
                if (j3 != -9223372036854775807L) {
                    if (jM43665 != -9223372036854775807L) {
                        j4 = j3 - jM43665;
                    } else {
                        j4 = j3;
                    }
                    jMin = Math.min((long) (j4 * this.f59626), jMin);
                }
                i3 = c8353Mo2378.f25627;
                i4 = c8353Mo2377.f25627;
                if ((i3 <= i4 && j2 < jMin) || (i3 < i4 && j2 >= this.f59621)) {
                }
            }
            if (iM43664 != i2) {
                i = 3;
            }
            this.f59624 = i;
            this.f59627 = iM43664;
        }
        jM43665 = jMo15261 - jMo15260;
        i = this.f59624;
        if (i == 0) {
            this.f59624 = 1;
            this.f59627 = m43664(jElapsedRealtime, jM43665);
            return;
        }
        i2 = this.f59627;
        if (list.isEmpty()) {
            iM2376 = -1;
        } else {
            iM2376 = m2376(((AbstractC11163) C8882.m22955(list)).f23468);
        }
        if (iM2376 != -1) {
            i = ((AbstractC11163) C8882.m22955(list)).f23466;
            i2 = iM2376;
        }
        iM43664 = m43664(jElapsedRealtime, jM43665);
        if (iM43664 != i2) {
            C8353 c8353Mo2379 = mo2377(i2);
            C8353 c8353Mo23710 = mo2377(iM43664);
            jMin = this.f59618;
            if (j3 != -9223372036854775807L) {
                if (jM43665 != -9223372036854775807L) {
                    j4 = j3 - jM43665;
                } else {
                    j4 = j3;
                }
                jMin = Math.min((long) (j4 * this.f59626), jMin);
            }
            i3 = c8353Mo23710.f25627;
            i4 = c8353Mo2379.f25627;
            iM43664 = i3 <= i4 ? i2 : i2;
        }
        if (iM43664 != i2) {
            i = 3;
        }
        this.f59624 = i;
        this.f59627 = iM43664;
    }

    @Override // l.InterfaceC9731
    /* JADX INFO: renamed from: ֫ */
    public final int mo3757() {
        return this.f59627;
    }

    @Override // l.InterfaceC9731
    /* JADX INFO: renamed from: ᩷ */
    public final int mo3760() {
        return this.f59624;
    }

    @Override // l.AbstractC0578, l.InterfaceC9731
    /* JADX INFO: renamed from: ֫ */
    public final int mo2375(long j, List list) {
        int i;
        int i2;
        this.f59625.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = this.f59620;
        if (j2 != -9223372036854775807L && jElapsedRealtime - j2 < 1000 && (list.isEmpty() || ((AbstractC11163) C8882.m22955(list)).equals(this.f59628))) {
            return list.size();
        }
        this.f59620 = jElapsedRealtime;
        this.f59628 = list.isEmpty() ? null : (AbstractC11163) C8882.m22955(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long jM11038 = C3603.m11038(((AbstractC11163) list.get(size - 1)).f23470 - j, this.f59619);
        long j3 = this.f59622;
        if (jM11038 >= j3) {
            C8353 c8353Mo2377 = mo2377(m43664(jElapsedRealtime, m43665(list)));
            for (int i3 = 0; i3 < size; i3++) {
                AbstractC11163 abstractC11163 = (AbstractC11163) list.get(i3);
                C8353 c8353 = abstractC11163.f23468;
                if (C3603.m11038(abstractC11163.f23470 - j, this.f59619) >= j3 && c8353.f25627 < c8353Mo2377.f25627 && (i = c8353.f25609) != -1 && i <= this.f59629 && (i2 = c8353.f25633) != -1 && i2 <= this.f59630 && i < c8353Mo2377.f25609) {
                    return i3;
                }
            }
        }
        return size;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m43665(List list) {
        if (!list.isEmpty()) {
            AbstractC11163 abstractC11163 = (AbstractC11163) C8882.m22955(list);
            long j = abstractC11163.f23470;
            if (j != -9223372036854775807L) {
                long j2 = abstractC11163.f23469;
                if (j2 != -9223372036854775807L) {
                    return j2 - j;
                }
            }
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m43664(long j, long j2) {
        long jMo28945 = (long) (((long) (this.f59631.mo28945() * this.f59623)) / this.f59619);
        AbstractC14545 abstractC14545 = this.f59632;
        if (!abstractC14545.isEmpty()) {
            int i = 1;
            while (i < abstractC14545.size() - 1 && ((C2696) abstractC14545.get(i)).f8438 < jMo28945) {
                i++;
            }
            C2696 c2696 = (C2696) abstractC14545.get(i - 1);
            C2696 c2697 = (C2696) abstractC14545.get(i);
            long j3 = c2696.f8438;
            float f = (jMo28945 - j3) / (c2697.f8438 - j3);
            long j4 = c2696.f8437;
            jMo28945 = ((long) (f * (c2697.f8437 - j4))) + j4;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f2289; i3++) {
            if (j == Long.MIN_VALUE || !mo2380(i3, j)) {
                if (mo2377(i3).f25627 <= jMo28945) {
                    return i3;
                }
                i2 = i3;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC14545 m43666(C21020[] c21020Arr) {
        int i;
        long j;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (true) {
            i = 1;
            if (i2 >= c21020Arr.length) {
                break;
            }
            C21020 c21020 = c21020Arr[i2];
            if (c21020 != null && c21020.f67857.length > 1) {
                int i3 = AbstractC14545.f44556;
                C1846 c1846 = new C1846();
                c1846.m16264(new C2696(0L, 0L));
                arrayList.add(c1846);
            } else {
                arrayList.add(null);
            }
            i2++;
        }
        int length = c21020Arr.length;
        long[][] jArr = new long[length][];
        int i4 = 0;
        while (true) {
            j = -1;
            if (i4 >= c21020Arr.length) {
                break;
            }
            C21020 c21021 = c21020Arr[i4];
            if (c21021 != null) {
                int[] iArr = c21021.f67857;
                jArr[i4] = new long[iArr.length];
                for (int i5 = 0; i5 < iArr.length; i5++) {
                    long j2 = c21021.f67856.m32295(iArr[i5]).f25627;
                    long[] jArr2 = jArr[i4];
                    if (j2 == -1) {
                        j2 = 0;
                    }
                    jArr2[i5] = j2;
                }
                Arrays.sort(jArr[i4]);
            } else {
                jArr[i4] = new long[0];
            }
            i4++;
        }
        int[] iArr2 = new int[length];
        long[] jArr3 = new long[length];
        for (int i6 = 0; i6 < length; i6++) {
            long[] jArr4 = jArr[i6];
            jArr3[i6] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        m43667(arrayList, jArr3);
        InterfaceC3237 interfaceC3237Mo35872 = AbstractC20110.m46369().m49902().mo35872();
        int i7 = 0;
        while (i7 < length) {
            long[] jArr5 = jArr[i7];
            if (jArr5.length > i) {
                int length2 = jArr5.length;
                double[] dArr = new double[length2];
                int i8 = 0;
                while (true) {
                    long[] jArr6 = jArr[i7];
                    double dLog = 0.0d;
                    if (i8 >= jArr6.length) {
                        break;
                    }
                    long j3 = jArr6[i8];
                    if (j3 != j) {
                        dLog = Math.log(j3);
                    }
                    dArr[i8] = dLog;
                    i8++;
                }
                int i9 = length2 - 1;
                double d = dArr[i9] - dArr[0];
                int i10 = 0;
                while (i10 < i9) {
                    double d2 = dArr[i10];
                    i10++;
                    interfaceC3237Mo35872.put(Double.valueOf(d == 0.0d ? 1.0d : (((d2 + dArr[i10]) * 0.5d) - dArr[0]) / d), Integer.valueOf(i7));
                }
            }
            i7++;
            i = 1;
            j = -1;
        }
        AbstractC14545 abstractC14545CopyOf = AbstractC14545.copyOf(interfaceC3237Mo35872.values());
        for (int i11 = 0; i11 < abstractC14545CopyOf.size(); i11++) {
            int iIntValue = ((Integer) abstractC14545CopyOf.get(i11)).intValue();
            int i12 = iArr2[iIntValue] + 1;
            iArr2[iIntValue] = i12;
            jArr3[iIntValue] = jArr[iIntValue][i12];
            m43667(arrayList, jArr3);
        }
        for (int i13 = 0; i13 < c21020Arr.length; i13++) {
            if (arrayList.get(i13) != null) {
                jArr3[i13] = jArr3[i13] * 2;
            }
        }
        m43667(arrayList, jArr3);
        C1846 c1847 = new C1846();
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            C1846 c1848 = (C1846) arrayList.get(i14);
            c1847.m16264(c1848 == null ? AbstractC14545.of() : c1848.m6131());
        }
        return c1847.m6131();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m43667(ArrayList arrayList, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            C1846 c1846 = (C1846) arrayList.get(i);
            if (c1846 != null) {
                c1846.m16264(new C2696(j, jArr[i]));
            }
        }
    }
}
