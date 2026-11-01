package p067l;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* JADX INFO: renamed from: l.ܰ۬ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 92WK */
/* JADX INFO: loaded from: classes4.dex */
public final class C15519 extends C21953 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ AbstractC9485 f44357;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15519(AbstractC9485 abstractC9485, Context context) {
        super(context);
        this.f44357 = abstractC9485;
    }

    @Override // p067l.C21953, p067l.AbstractC16860
    public final void onTargetFound(View view, C22897 c22897, C3450 c3450) {
        AbstractC9485 abstractC9485 = this.f44357;
        C14849 c14849 = abstractC9485.mRecyclerView;
        if (c14849 == null) {
            return;
        }
        int[] iArrCalculateDistanceToFinalSnap = abstractC9485.calculateDistanceToFinalSnap(c14849.getLayoutManager(), view);
        int i = iArrCalculateDistanceToFinalSnap[0];
        int i2 = iArrCalculateDistanceToFinalSnap[1];
        int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i2)));
        if (iCalculateTimeForDeceleration > 0) {
            c3450.m6115(i, i2, this.mDecelerateInterpolator, iCalculateTimeForDeceleration);
        }
    }

    @Override // p067l.C21953
    public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }
}
