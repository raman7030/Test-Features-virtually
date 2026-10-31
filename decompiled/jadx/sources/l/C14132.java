package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܰ᩺ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: G16V */
/* JADX INFO: loaded from: classes4.dex */
public final class C14132 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC16683 f42615;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14132(ActivityC16683 activityC16683, ActivityC16683 activityC16684) {
        super(activityC16684, -1);
        this.f42615 = activityC16683;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2170() {
        ActivityC16683 activityC16683 = this.f42615;
        String strM31260 = m31260();
        if (strM31260.isEmpty()) {
            m31262();
            return;
        }
        if (strM31260.contains("/") || strM31260.contains("\\")) {
            m31263(R.string.MT_Protector);
            return;
        }
        if (C16249.m38219(strM31260)) {
            m31263(R.string.MT_Protector);
            return;
        }
        try {
            C16249.m38217(new C9195(strM31260));
            m31262();
            activityC16683.f51210 = C16249.m38218();
            activityC16683.f51211.notifyDataSetChanged();
        } catch (IOException e) {
            activityC16683.m10223(e, (DialogInterface.OnDismissListener) null);
        }
    }
}
