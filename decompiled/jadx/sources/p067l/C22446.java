package p067l;

import com.google.android.material.motion.MotionUtils;
import java.util.Arrays;

/* JADX INFO: renamed from: l.᩷᩷ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z8LG */
/* JADX INFO: loaded from: classes5.dex */
public final class C22446 implements InterfaceC11402 {

    /* JADX INFO: renamed from: ֫ */
    public final long f70813;

    /* JADX INFO: renamed from: ۧ */
    public final long[] f70814;

    /* JADX INFO: renamed from: ܳ */
    public final long[] f70815;

    /* JADX INFO: renamed from: ܽ */
    public final int f70816;

    /* JADX INFO: renamed from: ܿ */
    public final int[] f70817;

    /* JADX INFO: renamed from: ᩳ */
    public final long[] f70818;

    @Override // p067l.InterfaceC11402
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo8955() {
        return true;
    }

    public C22446(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f70817 = iArr;
        this.f70818 = jArr;
        this.f70814 = jArr2;
        this.f70815 = jArr3;
        int length = iArr.length;
        this.f70816 = length;
        if (length > 0) {
            this.f70813 = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f70813 = 0L;
        }
    }

    @Override // p067l.InterfaceC11402
    /* JADX INFO: renamed from: ֫ */
    public final C8719 mo4119(long j) {
        long[] jArr = this.f70815;
        int iM13012 = C5792.m13012(jArr, j, true);
        long j2 = jArr[iM13012];
        long[] jArr2 = this.f70818;
        C10731 c10731 = new C10731(j2, jArr2[iM13012]);
        if (j2 >= j || iM13012 == this.f70816 - 1) {
            return new C8719(c10731, c10731);
        }
        int i = iM13012 + 1;
        return new C8719(c10731, new C10731(jArr[i], jArr2[i]));
    }

    @Override // p067l.InterfaceC11402
    /* JADX INFO: renamed from: ۜ */
    public final long mo8953() {
        return this.f70813;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f70816 + ", sizes=" + Arrays.toString(this.f70817) + ", offsets=" + Arrays.toString(this.f70818) + ", timeUs=" + Arrays.toString(this.f70815) + ", durationsUs=" + Arrays.toString(this.f70814) + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
