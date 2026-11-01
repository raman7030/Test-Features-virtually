package p067l;

import android.database.DataSetObserver;

/* JADX INFO: renamed from: l.֨֨ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: G135 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3121 extends DataSetObserver {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ ActivityC16532 f5679;

    public C3121(ActivityC16532 activityC16532) {
        this.f5679 = activityC16532;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        ActivityC16532 activityC16532 = this.f5679;
        activityC16532.f48580.setVisibility(activityC16532.f48582.getCount() == 0 ? 0 : 8);
    }
}
