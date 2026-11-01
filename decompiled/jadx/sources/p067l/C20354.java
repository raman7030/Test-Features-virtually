package p067l;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: l.ᩴᩳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8SE */
/* JADX INFO: loaded from: classes5.dex */
public final class C20354 extends AbstractC2918 {

    /* JADX INFO: renamed from: ֡ */
    public final long f62849;

    /* JADX INFO: renamed from: ֨ */
    public float f62850;

    /* JADX INFO: renamed from: ۖ */
    public long f62851;

    /* JADX INFO: renamed from: ۘ */
    public final long f62852;

    /* JADX INFO: renamed from: ۚ */
    public final long f62853;

    /* JADX INFO: renamed from: ۜ */
    public final float f62854;

    /* JADX INFO: renamed from: ۠ */
    public int f62855;

    /* JADX INFO: renamed from: ۡ */
    public final C15849 f62856;

    /* JADX INFO: renamed from: ۢ */
    public final float f62857;

    /* JADX INFO: renamed from: ܶ */
    public int f62858;

    /* JADX INFO: renamed from: ܺ */
    public AbstractC12978 f62859;

    /* JADX INFO: renamed from: ᩴ */
    public final int f62860;

    /* JADX INFO: renamed from: ᩵ */
    public final int f62861;

    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC14968 f62862;

    /* JADX INFO: renamed from: ᩻ */
    public final AbstractC16192 f62863;

    @Override // p067l.InterfaceC11617
    /* JADX INFO: renamed from: ۧ */
    public final Object mo6031() {
        return null;
    }

    public C20354(C15020 c15020, int[] iArr, InterfaceC14968 interfaceC14968, long j, long j2, long j3, AbstractC16192 abstractC16192) {
        super(c15020, iArr);
        if (j3 < j) {
            C21334.m48351("Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j3 = j;
        }
        this.f62862 = interfaceC14968;
        this.f62849 = j * 1000;
        this.f62852 = j2 * 1000;
        this.f62853 = j3 * 1000;
        this.f62861 = 1279;
        this.f62860 = 719;
        this.f62854 = 0.7f;
        this.f62857 = 0.75f;
        this.f62863 = AbstractC16192.copyOf((Collection) abstractC16192);
        this.f62856 = InterfaceC17980.f53699;
        this.f62850 = 1.0f;
        this.f62855 = 0;
        this.f62851 = -9223372036854775807L;
    }

    @Override // p067l.AbstractC2918, p067l.InterfaceC11617
    /* JADX INFO: renamed from: ܳ */
    public final void mo4757() {
        this.f62851 = -9223372036854775807L;
        this.f62859 = null;
    }

    @Override // p067l.AbstractC2918, p067l.InterfaceC11617
    /* JADX INFO: renamed from: ᩳ */
    public final void mo4760() {
        this.f62859 = null;
    }

    @Override // p067l.AbstractC2918, p067l.InterfaceC11617
    /* JADX INFO: renamed from: ֫ */
    public final void mo4749(float f) {
        this.f62850 = f;
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
    @Override // p067l.InterfaceC11617
    /* JADX INFO: renamed from: ֫ */
    public final void mo6030(long j, long j2, long j3, List list, InterfaceC19683[] interfaceC19683Arr) {
        long jM45931;
        long jMo17167;
        long jMo17166;
        int i;
        int i2;
        int iM4747;
        int iM45930;
        long jMin;
        int i3;
        int i4;
        long j4;
        this.f62856.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i5 = this.f62858;
        if (i5 < interfaceC19683Arr.length && interfaceC19683Arr[i5].next()) {
            InterfaceC19683 interfaceC19683 = interfaceC19683Arr[this.f62858];
            jMo17167 = interfaceC19683.mo17167();
            jMo17166 = interfaceC19683.mo17166();
        } else {
            int length = interfaceC19683Arr.length;
            int i6 = 0;
            while (true) {
                if (i6 < length) {
                    InterfaceC19683 interfaceC19684 = interfaceC19683Arr[i6];
                    if (interfaceC19684.next()) {
                        jMo17167 = interfaceC19684.mo17167();
                        jMo17166 = interfaceC19684.mo17166();
                    } else {
                        i6++;
                    }
                } else {
                    jM45931 = m45931(list);
                    break;
                }
            }
            i = this.f62855;
            if (i == 0) {
                this.f62855 = 1;
                this.f62858 = m45930(jElapsedRealtime, jM45931);
                return;
            }
            i2 = this.f62858;
            if (list.isEmpty()) {
                iM4747 = -1;
            } else {
                iM4747 = m4747(((AbstractC12978) C10810.m24926(list)).f26379);
            }
            if (iM4747 != -1) {
                i = ((AbstractC12978) C10810.m24926(list)).f26377;
                i2 = iM4747;
            }
            iM45930 = m45930(jElapsedRealtime, jM45931);
            if (iM45930 != i2 && !mo4751(i2, jElapsedRealtime)) {
                C10307 c10307Mo4748 = mo4748(i2);
                C10307 c10307Mo4749 = mo4748(iM45930);
                jMin = this.f62849;
                if (j3 != -9223372036854775807L) {
                    if (jM45931 != -9223372036854775807L) {
                        j4 = j3 - jM45931;
                    } else {
                        j4 = j3;
                    }
                    jMin = Math.min((long) (j4 * this.f62857), jMin);
                }
                i3 = c10307Mo4749.f28541;
                i4 = c10307Mo4748.f28541;
                if ((i3 <= i4 && j2 < jMin) || (i3 < i4 && j2 >= this.f62852)) {
                }
            }
            if (iM45930 != i2) {
                i = 3;
            }
            this.f62855 = i;
            this.f62858 = iM45930;
        }
        jM45931 = jMo17167 - jMo17166;
        i = this.f62855;
        if (i == 0) {
            this.f62855 = 1;
            this.f62858 = m45930(jElapsedRealtime, jM45931);
            return;
        }
        i2 = this.f62858;
        if (list.isEmpty()) {
            iM4747 = -1;
        } else {
            iM4747 = m4747(((AbstractC12978) C10810.m24926(list)).f26379);
        }
        if (iM4747 != -1) {
            i = ((AbstractC12978) C10810.m24926(list)).f26377;
            i2 = iM4747;
        }
        iM45930 = m45930(jElapsedRealtime, jM45931);
        if (iM45930 != i2) {
            C10307 c10307Mo47410 = mo4748(i2);
            C10307 c10307Mo47411 = mo4748(iM45930);
            jMin = this.f62849;
            if (j3 != -9223372036854775807L) {
                if (jM45931 != -9223372036854775807L) {
                    j4 = j3 - jM45931;
                } else {
                    j4 = j3;
                }
                jMin = Math.min((long) (j4 * this.f62857), jMin);
            }
            i3 = c10307Mo47411.f28541;
            i4 = c10307Mo47410.f28541;
            iM45930 = i3 <= i4 ? i2 : i2;
        }
        if (iM45930 != i2) {
            i = 3;
        }
        this.f62855 = i;
        this.f62858 = iM45930;
    }

    @Override // p067l.InterfaceC11617
    /* JADX INFO: renamed from: ֫ */
    public final int mo6029() {
        return this.f62858;
    }

    @Override // p067l.InterfaceC11617
    /* JADX INFO: renamed from: ᩷ */
    public final int mo6032() {
        return this.f62855;
    }

    @Override // p067l.AbstractC2918, p067l.InterfaceC11617
    /* JADX INFO: renamed from: ֫ */
    public final int mo4746(long j, List list) {
        int i;
        int i2;
        this.f62856.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = this.f62851;
        if (j2 != -9223372036854775807L && jElapsedRealtime - j2 < 1000 && (list.isEmpty() || ((AbstractC12978) C10810.m24926(list)).equals(this.f62859))) {
            return list.size();
        }
        this.f62851 = jElapsedRealtime;
        this.f62859 = list.isEmpty() ? null : (AbstractC12978) C10810.m24926(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long jM13014 = C5792.m13014(((AbstractC12978) list.get(size - 1)).f26381 - j, this.f62850);
        long j3 = this.f62853;
        if (jM13014 >= j3) {
            C10307 c10307Mo4748 = mo4748(m45930(jElapsedRealtime, m45931(list)));
            for (int i3 = 0; i3 < size; i3++) {
                AbstractC12978 abstractC12978 = (AbstractC12978) list.get(i3);
                C10307 c10307 = abstractC12978.f26379;
                if (C5792.m13014(abstractC12978.f26381 - j, this.f62850) >= j3 && c10307.f28541 < c10307Mo4748.f28541 && (i = c10307.f28523) != -1 && i <= this.f62860 && (i2 = c10307.f28547) != -1 && i2 <= this.f62861 && i < c10307Mo4748.f28523) {
                    return i3;
                }
            }
        }
        return size;
    }

    /* JADX INFO: renamed from: ֫ */
    public static long m45931(List list) {
        if (!list.isEmpty()) {
            AbstractC12978 abstractC12978 = (AbstractC12978) C10810.m24926(list);
            long j = abstractC12978.f26381;
            if (j != -9223372036854775807L) {
                long j2 = abstractC12978.f26380;
                if (j2 != -9223372036854775807L) {
                    return j2 - j;
                }
            }
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: renamed from: ֫ */
    private int m45930(long j, long j2) {
        long jMo30995 = (long) (((long) (this.f62862.mo30995() * this.f62854)) / this.f62850);
        AbstractC16192 abstractC16192 = this.f62863;
        if (!abstractC16192.isEmpty()) {
            int i = 1;
            while (i < abstractC16192.size() - 1 && ((C4931) abstractC16192.get(i)).f11232 < jMo30995) {
                i++;
            }
            C4931 c4931 = (C4931) abstractC16192.get(i - 1);
            C4931 c4932 = (C4931) abstractC16192.get(i);
            long j3 = c4931.f11232;
            float f = (jMo30995 - j3) / (c4932.f11232 - j3);
            long j4 = c4931.f11231;
            jMo30995 = ((long) (f * (c4932.f11231 - j4))) + j4;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f5064; i3++) {
            if (j == Long.MIN_VALUE || !mo4751(i3, j)) {
                if (mo4748(i3).f28541 <= jMo30995) {
                    return i3;
                }
                i2 = i3;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC16192 m45932(C22346[] c22346Arr) {
        int i;
        long j;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (true) {
            i = 1;
            if (i2 >= c22346Arr.length) {
                break;
            }
            C22346 c22346 = c22346Arr[i2];
            if (c22346 != null && c22346.f70542.length > 1) {
                int i3 = AbstractC16192.f47662;
                C4123 c4123 = new C4123();
                c4123.m18184(new C4931(0L, 0L));
                arrayList.add(c4123);
            } else {
                arrayList.add(null);
            }
            i2++;
        }
        int length = c22346Arr.length;
        long[][] jArr = new long[length][];
        int i4 = 0;
        while (true) {
            j = -1;
            if (i4 >= c22346Arr.length) {
                break;
            }
            C22346 c22347 = c22346Arr[i4];
            if (c22347 != null) {
                int[] iArr = c22347.f70542;
                jArr[i4] = new long[iArr.length];
                for (int i5 = 0; i5 < iArr.length; i5++) {
                    long j2 = c22347.f70541.m34395(iArr[i5]).f28541;
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
        m45933(arrayList, jArr3);
        InterfaceC5445 interfaceC5445Mo38030 = AbstractC21481.m48685().m52229().mo38030();
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
                    interfaceC5445Mo38030.put(Double.valueOf(d == 0.0d ? 1.0d : (((d2 + dArr[i10]) * 0.5d) - dArr[0]) / d), Integer.valueOf(i7));
                }
            }
            i7++;
            i = 1;
            j = -1;
        }
        AbstractC16192 abstractC16192CopyOf = AbstractC16192.copyOf(interfaceC5445Mo38030.values());
        for (int i11 = 0; i11 < abstractC16192CopyOf.size(); i11++) {
            int iIntValue = ((Integer) abstractC16192CopyOf.get(i11)).intValue();
            int i12 = iArr2[iIntValue] + 1;
            iArr2[iIntValue] = i12;
            jArr3[iIntValue] = jArr[iIntValue][i12];
            m45933(arrayList, jArr3);
        }
        for (int i13 = 0; i13 < c22346Arr.length; i13++) {
            if (arrayList.get(i13) != null) {
                jArr3[i13] = jArr3[i13] * 2;
            }
        }
        m45933(arrayList, jArr3);
        C4123 c4124 = new C4123();
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            C4123 c4125 = (C4123) arrayList.get(i14);
            c4124.m18184(c4125 == null ? AbstractC16192.m36872of() : c4125.m8329());
        }
        return c4124.m8329();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m45933(ArrayList arrayList, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            C4123 c4123 = (C4123) arrayList.get(i);
            if (c4123 != null) {
                c4123.m18184(new C4931(j, jArr[i]));
            }
        }
    }
}
