package l;

import android.util.Pair;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۖ᩹֫, reason: contains not printable characters */
/* JADX INFO: compiled from: I8C0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2814 implements Comparable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C17714 f8789 = new C17714(3);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f8790;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public long f8791;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f8792;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C17714 f8793;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C6001 f8794;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final ArrayList f8795;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f8796;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C4225 f8797;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f8798;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long jM8692 = m8692();
        long jM8693 = ((C2814) obj).m8692();
        if (jM8692 == jM8693) {
            return 0;
        }
        if (jM8692 == -9223372036854775807L) {
            return 1;
        }
        if (jM8693 == -9223372036854775807L) {
            return -1;
        }
        return Long.compare(jM8692, jM8693);
    }

    public C2814(int i, int i2, C17714 c17714, C6001 c6001) {
        this.f8798 = i;
        this.f8792 = i2;
        this.f8793 = c17714;
        this.f8794 = c6001;
        C4225 c4225 = new C4225();
        c4225.m12727();
        this.f8797 = c4225;
        ArrayList arrayList = new ArrayList();
        this.f8795 = arrayList;
        this.f8790 = Integer.MIN_VALUE;
        arrayList.add(Pair.create(0L, Integer.valueOf(UMErrorCode.E_UM_BE_NOT_MAINPROCESS)));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m8692() {
        C4225 c4225 = this.f8797;
        if (!c4225.m12725()) {
            return -9223372036854775807L;
        }
        return this.f8796 + m8691(this.f8795, c4225.f13718, this.f8791, this.f8792);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8693(InterfaceC19383 interfaceC19383, boolean z) {
        C4225 c4225 = this.f8797;
        if (c4225.m12725()) {
            long j = this.f8796;
            long j2 = c4225.f13718;
            long j3 = this.f8791;
            int i = this.f8792;
            ArrayList arrayList = this.f8795;
            this.f8796 = j + m8691(arrayList, j2, j3, i);
            C17714 c17714 = this.f8793;
            if (z) {
                int i2 = c4225.f13722;
                int i3 = i2 >>> 4;
                if (i2 != 255 && i2 != 240 && (i3 == 8 || i3 == 9)) {
                    c17714.m41478(c4225.f13719);
                    this.f8790 = c4225.f13722;
                    c4225.m12727();
                    return;
                }
            }
            int i4 = c4225.f13719;
            int i5 = c4225.f13715;
            int i6 = i4 - i5;
            c17714.m41478(i5);
            int i7 = c4225.f13722;
            if (i7 != 255 && i7 != 240) {
                c17714.m41478(i6);
                c17714 = this.f8789;
                c17714.m41484(0);
                c4225.m12724(c17714.m41482());
                i6 = c4225.f13720;
            } else if (i7 == 255) {
                long j4 = c4225.f13721;
                if (j4 != -9223372036854775807L) {
                    int i8 = (int) (60000000 / j4);
                    long j5 = this.f8791;
                    if (this.f8798 == 2) {
                        m8695(i8, j5);
                    } else {
                        C17630.m41220((C17630) this.f8794.f18441, i8, j5);
                    }
                }
            }
            int i9 = i6;
            interfaceC19383.mo8453(i9, c17714);
            interfaceC19383.mo8455(this.f8796, 0, i9, 0, null);
            if (arrayList.size() > 1) {
                Pair pair = (Pair) C8882.m22955(arrayList);
                arrayList.clear();
                arrayList.add(pair);
            }
            this.f8790 = c4225.f13722;
            c4225.m12727();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m8694() {
        C4225 c4225 = this.f8797;
        if (c4225.m12725()) {
            return;
        }
        if (c4225.m12726(this.f8790, this.f8793)) {
            this.f8791 += c4225.f13718;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m8695(int i, long j) {
        this.f8795.add(Pair.create(Long.valueOf(j), Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m8696() {
        this.f8796 = 0L;
        this.f8791 = 0L;
        this.f8790 = Integer.MIN_VALUE;
        this.f8793.m41484(0);
        this.f8789.m41484(0);
        this.f8797.m12727();
        ArrayList arrayList = this.f8795;
        arrayList.clear();
        arrayList.add(Pair.create(0L, Integer.valueOf(UMErrorCode.E_UM_BE_NOT_MAINPROCESS)));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m8691(ArrayList arrayList, long j, long j2, int i) {
        long jIntValue = 0;
        long j3 = j;
        long j4 = j2;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Pair pair = (Pair) arrayList.get(size);
            long jMin = Math.min(j3, j4 - ((Long) pair.first).longValue());
            C22632.m50634(jMin >= 0);
            jIntValue += (60000000 * jMin) / (((long) ((Integer) pair.second).intValue()) * ((long) i));
            j3 -= jMin;
            j4 -= jMin;
        }
        return ((j3 * 60000000) / (((long) ((Integer) ((Pair) C8882.m22955(arrayList)).second).intValue()) * ((long) i))) + jIntValue;
    }
}
