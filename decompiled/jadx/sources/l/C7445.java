package l;

import android.graphics.RectF;
import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.۟ۨۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: M6JW */
/* JADX INFO: loaded from: classes3.dex */
public final class C7445 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final RectF f22865 = new RectF();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f22866 = -1;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f22864 = -1;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m19979(long j, RectF rectF, boolean z) {
        long jMax = Math.max(1L, j - this.f22866);
        float f = rectF.left;
        RectF rectF2 = this.f22865;
        boolean z2 = this.f22866 >= 0 && (Math.max(Math.max(Math.abs(f - rectF2.left), Math.abs(rectF.top - rectF2.top)), Math.max(Math.abs(rectF.right - rectF2.right), Math.abs(rectF.bottom - rectF2.bottom))) * 1000.0f) / ((float) jMax) <= Math.min(rectF.width(), rectF.height()) * 0.4f;
        rectF2.set(rectF);
        this.f22866 = j;
        if (!z) {
            this.f22864 = -1L;
            return 0L;
        }
        if (this.f22864 < 0) {
            this.f22864 = j;
        }
        return Math.max(0L, Math.min(z2 ? 40L : 80L, (this.f22864 + ((long) (z2 ? UMErrorCode.E_UM_BE_NOT_MAINPROCESS : 400))) - j));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19980() {
        this.f22864 = -1L;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m19981() {
        this.f22864 = -1L;
        this.f22866 = -1L;
        this.f22865.setEmpty();
    }
}
