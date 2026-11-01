package p067l;

import android.util.Pair;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۖ᩹֫, reason: contains not printable characters */
/* JADX INFO: compiled from: I8C0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5043 implements Comparable {

    /* JADX INFO: renamed from: ۗ */
    public final C19203 f11583 = new C19203(3);

    /* JADX INFO: renamed from: ۙ */
    public int f11584;

    /* JADX INFO: renamed from: ۛ */
    public long f11585;

    /* JADX INFO: renamed from: ۤ */
    public final int f11586;

    /* JADX INFO: renamed from: ۨ */
    public final C19203 f11587;

    /* JADX INFO: renamed from: ۫ */
    public final C8072 f11588;

    /* JADX INFO: renamed from: ۬ */
    public final ArrayList f11589;

    /* JADX INFO: renamed from: ᩶ */
    public long f11590;

    /* JADX INFO: renamed from: ᩸ */
    public final C6384 f11591;

    /* JADX INFO: renamed from: ᩹ */
    public final int f11592;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long jM10753 = m10753();
        long jM10754 = ((C5043) obj).m10753();
        if (jM10753 == jM10754) {
            return 0;
        }
        if (jM10753 == -9223372036854775807L) {
            return 1;
        }
        if (jM10754 == -9223372036854775807L) {
            return -1;
        }
        return Long.compare(jM10753, jM10754);
    }

    public C5043(int i, int i2, C19203 c19203, C8072 c8072) {
        this.f11592 = i;
        this.f11586 = i2;
        this.f11587 = c19203;
        this.f11588 = c8072;
        C6384 c6384 = new C6384();
        c6384.m14603();
        this.f11591 = c6384;
        ArrayList arrayList = new ArrayList();
        this.f11589 = arrayList;
        this.f11584 = Integer.MIN_VALUE;
        arrayList.add(Pair.create(0L, Integer.valueOf(UMErrorCode.E_UM_BE_NOT_MAINPROCESS)));
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m10753() {
        C6384 c6384 = this.f11591;
        if (!c6384.m14601()) {
            return -9223372036854775807L;
        }
        return this.f11590 + m10752(this.f11589, c6384.f16531, this.f11585, this.f11586);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m10754(InterfaceC20790 interfaceC20790, boolean z) {
        C6384 c6384 = this.f11591;
        if (c6384.m14601()) {
            long j = this.f11590;
            long j2 = c6384.f16531;
            long j3 = this.f11585;
            int i = this.f11586;
            ArrayList arrayList = this.f11589;
            this.f11590 = j + m10752(arrayList, j2, j3, i);
            C19203 c19203 = this.f11587;
            if (z) {
                int i2 = c6384.f16535;
                int i3 = i2 >>> 4;
                if (i2 != 255 && i2 != 240 && (i3 == 8 || i3 == 9)) {
                    c19203.m43724(c6384.f16532);
                    this.f11584 = c6384.f16535;
                    c6384.m14603();
                    return;
                }
            }
            int i4 = c6384.f16532;
            int i5 = c6384.f16528;
            int i6 = i4 - i5;
            c19203.m43724(i5);
            int i7 = c6384.f16535;
            if (i7 != 255 && i7 != 240) {
                c19203.m43724(i6);
                c19203 = this.f11583;
                c19203.m43730(0);
                c6384.m14600(c19203.m43728());
                i6 = c6384.f16533;
            } else if (i7 == 255) {
                long j4 = c6384.f16534;
                if (j4 != -9223372036854775807L) {
                    int i8 = (int) (60000000 / j4);
                    long j5 = this.f11585;
                    if (this.f11592 == 2) {
                        m10756(i8, j5);
                    } else {
                        C19124.m43466((C19124) this.f11588.f21292, i8, j5);
                    }
                }
            }
            int i9 = i6;
            interfaceC20790.mo10500(i9, c19203);
            interfaceC20790.mo10502(this.f11590, 0, i9, 0, null);
            if (arrayList.size() > 1) {
                Pair pair = (Pair) C10810.m24926(arrayList);
                arrayList.clear();
                arrayList.add(pair);
            }
            this.f11584 = c6384.f16535;
            c6384.m14603();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m10755() {
        C6384 c6384 = this.f11591;
        if (c6384.m14601()) {
            return;
        }
        if (c6384.m14602(this.f11584, this.f11587)) {
            this.f11585 += c6384.f16531;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m10756(int i, long j) {
        this.f11589.add(Pair.create(Long.valueOf(j), Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m10757() {
        this.f11590 = 0L;
        this.f11585 = 0L;
        this.f11584 = Integer.MIN_VALUE;
        this.f11587.m43730(0);
        this.f11583.m43730(0);
        this.f11591.m14603();
        ArrayList arrayList = this.f11589;
        arrayList.clear();
        arrayList.add(Pair.create(0L, Integer.valueOf(UMErrorCode.E_UM_BE_NOT_MAINPROCESS)));
    }

    /* JADX INFO: renamed from: ֫ */
    public static long m10752(ArrayList arrayList, long j, long j2, int i) {
        long jIntValue = 0;
        long j3 = j;
        long j4 = j2;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Pair pair = (Pair) arrayList.get(size);
            long jMin = Math.min(j3, j4 - ((Long) pair.first).longValue());
            C23877.m52960(jMin >= 0);
            jIntValue += (60000000 * jMin) / (((long) ((Integer) pair.second).intValue()) * ((long) i));
            j3 -= jMin;
            j4 -= jMin;
        }
        return ((j3 * 60000000) / (((long) ((Integer) ((Pair) C10810.m24926(arrayList)).second).intValue()) * ((long) i))) + jIntValue;
    }
}
