package l;

import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۟᩺ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: G16V */
/* JADX INFO: loaded from: classes3.dex */
public final class C7783 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f24056;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC16683 f24057;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7783(ActivityC16683 activityC16683, ActivityC16683 activityC16684, String str) {
        super(activityC16684, -1);
        this.f24057 = activityC16683;
        this.f24056 = str;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2170() {
        String strM31260 = m31260();
        if (strM31260.length() != 0) {
            String str = this.f24056;
            if (!strM31260.equals(str)) {
                if (strM31260.contains("/") || strM31260.contains("\\")) {
                    m31263(R.string.MT_Protector);
                    return;
                }
                if (!str.equalsIgnoreCase(strM31260) && C16249.m38219(strM31260)) {
                    m31263(R.string.MT_Protector);
                    return;
                }
                if (!C16249.m38220(str, strM31260)) {
                    C21374.m48457(R.string.MT_Protector);
                }
                ArrayList arrayListM38218 = C16249.m38218();
                ActivityC16683 activityC16683 = this.f24057;
                activityC16683.f51210 = arrayListM38218;
                activityC16683.f51211.notifyDataSetChanged();
                m31262();
                return;
            }
        }
        m31262();
    }
}
