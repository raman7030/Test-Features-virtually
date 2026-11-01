package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܰ᩺ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: G16V */
/* JADX INFO: loaded from: classes4.dex */
public final class C15800 extends AbstractDialogInterfaceOnClickListenerC14580 {

    /* JADX INFO: renamed from: ۟ */
    public final /* synthetic */ ActivityC18224 f45701;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15800(ActivityC18224 activityC18224, ActivityC18224 activityC18225) {
        super(activityC18225, -1);
        this.f45701 = activityC18224;
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC14580
    /* JADX INFO: renamed from: ᩴ */
    public final void mo4537() {
        ActivityC18224 activityC18224 = this.f45701;
        String strM33346 = m33346();
        if (strM33346.isEmpty()) {
            m33348();
            return;
        }
        if (strM33346.contains("/") || strM33346.contains("\\")) {
            m33349(R.string.MT_Protector);
            return;
        }
        if (C17812.m40433(strM33346)) {
            m33349(R.string.MT_Protector);
            return;
        }
        try {
            C17812.m40431(new C11108(strM33346));
            m33348();
            activityC18224.f54395 = C17812.m40432();
            activityC18224.f54396.notifyDataSetChanged();
        } catch (IOException e) {
            activityC18224.m12259(e, (DialogInterface.OnDismissListener) null);
        }
    }
}
