package p067l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.۫ܿܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AWI */
/* JADX INFO: loaded from: classes4.dex */
public final class C14302 extends AbstractDialogInterfaceOnClickListenerC14580 {

    /* JADX INFO: renamed from: ֫֫ */
    public final /* synthetic */ int f40882;

    /* JADX INFO: renamed from: ۟ */
    public final /* synthetic */ ActivityC2822 f40883;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14302(ActivityC2822 activityC2822, ActivityC2822 activityC2823, int i) {
        super(activityC2823, -1);
        this.f40883 = activityC2822;
        this.f40882 = i;
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC14580
    /* JADX INFO: renamed from: ᩴ */
    public final void mo4537() {
        String strM33346 = m33346();
        if (!strM33346.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C16903("…", new C12962(22), null));
            List listM23790 = C10199.m23790();
            int i = this.f40882 + 1;
            ((ArrayList) listM23790).add(i, new C7517(strM33346, arrayList));
            C10199.m23791();
            ActivityC2822 activityC2822 = this.f40883;
            activityC2822.m4488();
            activityC2822.f4840.m4420(i);
        }
        m33348();
    }
}
