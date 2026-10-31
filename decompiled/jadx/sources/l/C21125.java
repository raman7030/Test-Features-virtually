package l;

import com.google.android.material.motion.MotionUtils;
import java.util.Arrays;

/* JADX INFO: renamed from: l.᩷᩷ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z8LG */
/* JADX INFO: loaded from: classes5.dex */
public final class C21125 implements InterfaceC9505 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f68131;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long[] f68132;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long[] f68133;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f68134;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int[] f68135;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long[] f68136;

    @Override // l.InterfaceC9505
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo6829() {
        return true;
    }

    public C21125(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f68135 = iArr;
        this.f68136 = jArr;
        this.f68132 = jArr2;
        this.f68133 = jArr3;
        int length = iArr.length;
        this.f68134 = length;
        if (length > 0) {
            this.f68131 = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f68131 = 0L;
        }
    }

    @Override // l.InterfaceC9505
    /* JADX INFO: renamed from: ֫ */
    public final C6682 mo1721(long j) {
        long[] jArr = this.f68133;
        int iM11036 = C3603.m11036(jArr, j, true);
        long j2 = jArr[iM11036];
        long[] jArr2 = this.f68136;
        C8799 c8799 = new C8799(j2, jArr2[iM11036]);
        if (j2 >= j || iM11036 == this.f68134 - 1) {
            return new C6682(c8799, c8799);
        }
        int i = iM11036 + 1;
        return new C6682(c8799, new C8799(jArr[i], jArr2[i]));
    }

    @Override // l.InterfaceC9505
    /* JADX INFO: renamed from: ۜ */
    public final long mo6827() {
        return this.f68131;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f68134 + ", sizes=" + Arrays.toString(this.f68135) + ", offsets=" + Arrays.toString(this.f68136) + ", timeUs=" + Arrays.toString(this.f68133) + ", durationsUs=" + Arrays.toString(this.f68132) + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
