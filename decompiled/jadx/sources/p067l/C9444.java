package p067l;

import android.graphics.RectF;
import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.۟ۨۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: M6JW */
/* JADX INFO: loaded from: classes3.dex */
public final class C9444 {

    /* JADX INFO: renamed from: ۧ */
    public final RectF f25777 = new RectF();

    /* JADX INFO: renamed from: ܽ */
    public long f25778 = -1;

    /* JADX INFO: renamed from: ֫ */
    public long f25776 = -1;

    /* JADX INFO: renamed from: ֫ */
    public final long m21954(long j, RectF rectF, boolean z) {
        long jMax = Math.max(1L, j - this.f25778);
        float f = rectF.left;
        RectF rectF2 = this.f25777;
        boolean z2 = this.f25778 >= 0 && (Math.max(Math.max(Math.abs(f - rectF2.left), Math.abs(rectF.top - rectF2.top)), Math.max(Math.abs(rectF.right - rectF2.right), Math.abs(rectF.bottom - rectF2.bottom))) * 1000.0f) / ((float) jMax) <= Math.min(rectF.width(), rectF.height()) * 0.4f;
        rectF2.set(rectF);
        this.f25778 = j;
        if (!z) {
            this.f25776 = -1L;
            return 0L;
        }
        if (this.f25776 < 0) {
            this.f25776 = j;
        }
        return Math.max(0L, Math.min(z2 ? 40L : 80L, (this.f25776 + ((long) (z2 ? UMErrorCode.E_UM_BE_NOT_MAINPROCESS : 400))) - j));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m21955() {
        this.f25776 = -1L;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m21956() {
        this.f25776 = -1L;
        this.f25778 = -1L;
        this.f25777.setEmpty();
    }
}
