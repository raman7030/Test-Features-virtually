package p067l;

import android.widget.CheckBox;

/* JADX INFO: renamed from: l.ۖ۠ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC4661 implements Runnable {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ ActivityC17874 f10478;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C23631 f10479;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ CheckBox f10480;

    public /* synthetic */ RunnableC4661(C23631 c23631, CheckBox checkBox, ActivityC17874 activityC17874) {
        this.f10479 = c23631;
        this.f10480 = checkBox;
        this.f10478 = activityC17874;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C23631 c23631 = this.f10479;
        c23631.getClass();
        boolean zIsChecked = this.f10480.isChecked();
        ActivityC17874 activityC17874 = this.f10478;
        if (!zIsChecked) {
            activityC17874.m40669(false);
        } else {
            c23631.m52572();
            activityC17874.m40664(false);
        }
    }
}
