package l;

import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۠֡᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: C5P7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7831 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC14886 f24234;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7831(ActivityC14886 activityC14886, ActivityC14886 activityC14887) {
        super(activityC14887, -1);
        this.f24234 = activityC14886;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2170() {
        String strM31260 = m31260();
        boolean zIsEmpty = strM31260.isEmpty();
        ActivityC14886 activityC14886 = this.f24234;
        if (zIsEmpty) {
            strM31260 = activityC14886.getString(R.string.MT_Protector);
        }
        activityC14886.f45435 = strM31260;
        for (TextView textView : activityC14886.f45437) {
            textView.setText(strM31260);
        }
        ApplicationC20075.f65008.edit().putString("font_viewer_displayed_text", activityC14886.f45435).apply();
        m31262();
    }
}
