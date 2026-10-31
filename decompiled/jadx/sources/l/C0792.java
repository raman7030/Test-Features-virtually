package l;

import android.database.DataSetObserver;

/* JADX INFO: renamed from: l.֨֨ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: G135 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0792 extends DataSetObserver {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC14903 f2907;

    public C0792(ActivityC14903 activityC14903) {
        this.f2907 = activityC14903;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        ActivityC14903 activityC14903 = this.f2907;
        activityC14903.f45465.setVisibility(activityC14903.f45467.getCount() == 0 ? 0 : 8);
    }
}
