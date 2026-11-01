package p067l;

import bin.p000mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۟᩺ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: G16V */
/* JADX INFO: loaded from: classes3.dex */
public final class C9766 extends AbstractDialogInterfaceOnClickListenerC14580 {

    /* JADX INFO: renamed from: ֫֫ */
    public final /* synthetic */ String f26972;

    /* JADX INFO: renamed from: ۟ */
    public final /* synthetic */ ActivityC18224 f26973;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9766(ActivityC18224 activityC18224, ActivityC18224 activityC18225, String str) {
        super(activityC18225, -1);
        this.f26973 = activityC18224;
        this.f26972 = str;
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC14580
    /* JADX INFO: renamed from: ᩴ */
    public final void mo4537() {
        String strM33346 = m33346();
        if (strM33346.length() != 0) {
            String str = this.f26972;
            if (!strM33346.equals(str)) {
                if (strM33346.contains("/") || strM33346.contains("\\")) {
                    m33349(R.string.MT_Protector);
                    return;
                }
                if (!str.equalsIgnoreCase(strM33346) && C17812.m40433(strM33346)) {
                    m33349(R.string.MT_Protector);
                    return;
                }
                if (!C17812.m40434(str, strM33346)) {
                    C22682.m50793(R.string.MT_Protector);
                }
                ArrayList arrayListM40432 = C17812.m40432();
                ActivityC18224 activityC18224 = this.f26973;
                activityC18224.f54395 = arrayListM40432;
                activityC18224.f54396.notifyDataSetChanged();
                m33348();
                return;
            }
        }
        m33348();
    }
}
