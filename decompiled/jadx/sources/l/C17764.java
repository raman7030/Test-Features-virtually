package l;

import android.util.Pair;
import org.bouncycastle.math.ec.custom.sec.SecP160R1Field;

/* JADX INFO: renamed from: l.ᩳۖۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: I8NX */
/* JADX INFO: loaded from: classes5.dex */
public final class C17764 implements InterfaceC23408 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f54338;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long[] f54339;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long[] f54340;

    @Override // l.InterfaceC23408
    /* JADX INFO: renamed from: ۧ */
    public final long mo17868() {
        return 0L;
    }

    @Override // l.InterfaceC9505
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo6829() {
        return true;
    }

    @Override // l.InterfaceC23408
    /* JADX INFO: renamed from: ᩳ */
    public final long mo17870() {
        return -1L;
    }

    @Override // l.InterfaceC23408
    /* JADX INFO: renamed from: ᩻ */
    public final int mo17871() {
        return SecP160R1Field.PInv;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17764 m41616(long j, C20978 c20978, long j2) {
        int[] iArr = c20978.f67759;
        int length = iArr.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = j;
        long j3 = 0;
        jArr2[0] = 0;
        for (int i2 = 1; i2 <= length; i2++) {
            int i3 = i2 - 1;
            j += (long) (c20978.f67757 + iArr[i3]);
            j3 += (long) (c20978.f67761 + c20978.f67760[i3]);
            jArr[i2] = j;
            jArr2[i2] = j3;
        }
        return new C17764(j2, jArr, jArr2);
    }

    public C17764(long j, long[] jArr, long[] jArr2) {
        this.f54339 = jArr;
        this.f54340 = jArr2;
        this.f54338 = j == -9223372036854775807L ? C3603.m11014(jArr2[jArr2.length - 1]) : j;
    }

    @Override // l.InterfaceC9505
    /* JADX INFO: renamed from: ֫ */
    public final C6682 mo1721(long j) {
        Pair pairM41615 = m41615(C3603.m11037(C3603.m11016(j, 0L, this.f54338)), this.f54340, this.f54339);
        C8799 c8799 = new C8799(C3603.m11014(((Long) pairM41615.first).longValue()), ((Long) pairM41615.second).longValue());
        return new C6682(c8799, c8799);
    }

    @Override // l.InterfaceC23408
    /* JADX INFO: renamed from: ۧ */
    public final long mo17869(long j) {
        return C3603.m11014(((Long) m41615(j, this.f54339, this.f54340).second).longValue());
    }

    @Override // l.InterfaceC9505
    /* JADX INFO: renamed from: ۜ */
    public final long mo6827() {
        return this.f54338;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Pair m41615(long j, long[] jArr, long[] jArr2) {
        int iM11036 = C3603.m11036(jArr, j, true);
        long j2 = jArr[iM11036];
        long j3 = jArr2[iM11036];
        int i = iM11036 + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i];
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((j4 == j2 ? 0.0d : (j - j2) / (j4 - j2)) * (jArr2[i] - j3))) + j3));
    }
}
