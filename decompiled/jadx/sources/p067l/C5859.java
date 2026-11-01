package p067l;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* JADX INFO: renamed from: l.ۘۗۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 63JU */
/* JADX INFO: loaded from: classes3.dex */
public final class C5859 extends C21953 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C19941 f14410;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5859(C19941 c19941, Context context) {
        super(context);
        this.f14410 = c19941;
    }

    @Override // p067l.C21953, p067l.AbstractC16860
    public final void onTargetFound(View view, C22897 c22897, C3450 c3450) {
        C19941 c19941 = this.f14410;
        int[] iArrCalculateDistanceToFinalSnap = c19941.calculateDistanceToFinalSnap(c19941.mRecyclerView.getLayoutManager(), view);
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

    @Override // p067l.C21953
    public final int calculateTimeForScrolling(int i) {
        return Math.min(100, super.calculateTimeForScrolling(i));
    }
}
