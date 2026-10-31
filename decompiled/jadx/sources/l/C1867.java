package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.֫ܰܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: G16V */
/* JADX INFO: loaded from: classes2.dex */
public final class C1867 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f6359;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC16683 f6360;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1867(ActivityC16683 activityC16683, ActivityC16683 activityC16684, String str) {
        super(activityC16684, -1);
        this.f6360 = activityC16683;
        this.f6359 = str;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2170() {
        ActivityC16683 activityC16683 = this.f6360;
        String strM31260 = m31260();
        if (strM31260.length() == 0) {
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
            C16249.m38216(this.f6359, strM31260);
        } catch (IOException e) {
            activityC16683.m10223(e, (DialogInterface.OnDismissListener) null);
        }
        activityC16683.f51210 = C16249.m38218();
        activityC16683.f51211.notifyDataSetChanged();
        m31262();
    }
}
