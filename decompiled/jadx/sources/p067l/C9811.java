package p067l;

import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.۠֡᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: C5P7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9811 extends AbstractDialogInterfaceOnClickListenerC14580 {

    /* JADX INFO: renamed from: ۟ */
    public final /* synthetic */ ActivityC16516 f27150;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9811(ActivityC16516 activityC16516, ActivityC16516 activityC16517) {
        super(activityC16517, -1);
        this.f27150 = activityC16516;
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC14580
    /* JADX INFO: renamed from: ᩴ */
    public final void mo4537() {
        String strM33346 = m33346();
        boolean zIsEmpty = strM33346.isEmpty();
        ActivityC16516 activityC16516 = this.f27150;
        if (zIsEmpty) {
            strM33346 = activityC16516.getString(R.string.MT_Protector);
        }
        activityC16516.f48550 = strM33346;
        for (TextView textView : activityC16516.f48552) {
            textView.setText(strM33346);
        }
        ApplicationC21448.f67649.edit().putString("font_viewer_displayed_text", activityC16516.f48550).apply();
        m33348();
    }
}
