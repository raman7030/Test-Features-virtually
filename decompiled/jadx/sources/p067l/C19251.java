package p067l;

import android.util.Pair;
import org.bouncycastle.math.p080ec.custom.sec.SecP160R1Field;

/* JADX INFO: renamed from: l.ᩳۖۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: I8NX */
/* JADX INFO: loaded from: classes5.dex */
public final class C19251 implements InterfaceC24615 {

    /* JADX INFO: renamed from: ֫ */
    public final long f57532;

    /* JADX INFO: renamed from: ۧ */
    public final long[] f57533;

    /* JADX INFO: renamed from: ܽ */
    public final long[] f57534;

    @Override // p067l.InterfaceC24615
    /* JADX INFO: renamed from: ۧ */
    public final long mo19816() {
        return 0L;
    }

    @Override // p067l.InterfaceC11402
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo8955() {
        return true;
    }

    @Override // p067l.InterfaceC24615
    /* JADX INFO: renamed from: ᩳ */
    public final long mo19818() {
        return -1L;
    }

    @Override // p067l.InterfaceC24615
    /* JADX INFO: renamed from: ᩻ */
    public final int mo19819() {
        return SecP160R1Field.PInv;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C19251 m43862(long j, C22306 c22306, long j2) {
        int[] iArr = c22306.f70445;
        int length = iArr.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = j;
        long j3 = 0;
        jArr2[0] = 0;
        for (int i2 = 1; i2 <= length; i2++) {
            int i3 = i2 - 1;
            j += (long) (c22306.f70443 + iArr[i3]);
            j3 += (long) (c22306.f70447 + c22306.f70446[i3]);
            jArr[i2] = j;
            jArr2[i2] = j3;
        }
        return new C19251(j2, jArr, jArr2);
    }

    public C19251(long j, long[] jArr, long[] jArr2) {
        this.f57533 = jArr;
        this.f57534 = jArr2;
        this.f57532 = j == -9223372036854775807L ? C5792.m12990(jArr2[jArr2.length - 1]) : j;
    }

    @Override // p067l.InterfaceC11402
    /* JADX INFO: renamed from: ֫ */
    public final C8719 mo4119(long j) {
        Pair pairM43861 = m43861(C5792.m13013(C5792.m12992(j, 0L, this.f57532)), this.f57534, this.f57533);
        C10731 c10731 = new C10731(C5792.m12990(((Long) pairM43861.first).longValue()), ((Long) pairM43861.second).longValue());
        return new C8719(c10731, c10731);
    }

    @Override // p067l.InterfaceC24615
    /* JADX INFO: renamed from: ۧ */
    public final long mo19817(long j) {
        return C5792.m12990(((Long) m43861(j, this.f57533, this.f57534).second).longValue());
    }

    @Override // p067l.InterfaceC11402
    /* JADX INFO: renamed from: ۜ */
    public final long mo8953() {
        return this.f57532;
    }

    /* JADX INFO: renamed from: ֫ */
    public static Pair m43861(long j, long[] jArr, long[] jArr2) {
        int iM13012 = C5792.m13012(jArr, j, true);
        long j2 = jArr[iM13012];
        long j3 = jArr2[iM13012];
        int i = iM13012 + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i];
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((j4 == j2 ? 0.0d : (j - j2) / (j4 - j2)) * (jArr2[i] - j3))) + j3));
    }
}
