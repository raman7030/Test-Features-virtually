package l;

import android.content.DialogInterface;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܶ᩶ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 14V2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15460 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC20401 f47323;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15460(ActivityC20401 activityC20401, ActivityC20401 activityC20402) {
        super(activityC20402, -1);
        this.f47323 = activityC20401;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2170() {
        ActivityC20401 activityC20401 = this.f47323;
        String strTrim = m31260().trim();
        if (strTrim.isEmpty()) {
            m31262();
            return;
        }
        if (strTrim.contains("\\") || strTrim.contains("/")) {
            m31263(R.string.MT_Protector);
            return;
        }
        AbstractC15440 abstractC15440M5957 = C1789.m5957(strTrim);
        if (abstractC15440M5957.mo23120()) {
            m31263(R.string.MT_Protector);
            return;
        }
        try {
            abstractC15440M5957.m36510("{\n  \"example1\"\n  \"例子1\"\n}\n{\n  \"example2\"\n  \"例子2\"\n}\n{\n  \"LineBreak\\nLineBreak\"\n  \"换行\\n换行\"\n}\n");
            ActivityC20401.m46723(activityC20401);
            m31262();
        } catch (Exception e) {
            activityC20401.m10223(e, (DialogInterface.OnDismissListener) null);
        }
    }
}
