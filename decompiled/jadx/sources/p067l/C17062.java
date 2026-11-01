package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ܶ᩶ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 14V2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17062 extends AbstractDialogInterfaceOnClickListenerC14580 {

    /* JADX INFO: renamed from: ۟ */
    public final /* synthetic */ ActivityC21758 f50452;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17062(ActivityC21758 activityC21758, ActivityC21758 activityC21759) {
        super(activityC21759, -1);
        this.f50452 = activityC21758;
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC14580
    /* JADX INFO: renamed from: ᩴ */
    public final void mo4537() {
        ActivityC21758 activityC21758 = this.f50452;
        String strTrim = m33346().trim();
        if (strTrim.isEmpty()) {
            m33348();
            return;
        }
        if (strTrim.contains("\\") || strTrim.contains("/")) {
            m33349(R.string.MT_Protector);
            return;
        }
        AbstractC17043 abstractC17043M8152 = C4069.m8152(strTrim);
        if (abstractC17043M8152.mo25094()) {
            m33349(R.string.MT_Protector);
            return;
        }
        try {
            abstractC17043M8152.m38668("{\n  \"example1\"\n  \"例子1\"\n}\n{\n  \"example2\"\n  \"例子2\"\n}\n{\n  \"LineBreak\\nLineBreak\"\n  \"换行\\n换行\"\n}\n");
            ActivityC21758.m49046(activityC21758);
            m33348();
        } catch (Exception e) {
            activityC21758.m12259(e, (DialogInterface.OnDismissListener) null);
        }
    }
}
