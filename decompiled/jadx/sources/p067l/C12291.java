package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۤܿܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AWI */
/* JADX INFO: loaded from: classes3.dex */
public final class C12291 extends AbstractDialogInterfaceOnClickListenerC14580 {

    /* JADX INFO: renamed from: ۟ */
    public final /* synthetic */ ActivityC2822 f34331;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12291(ActivityC2822 activityC2822, ActivityC2822 activityC2823) {
        super(activityC2823, -1);
        this.f34331 = activityC2822;
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC14580
    /* JADX INFO: renamed from: ᩴ */
    public final void mo4537() {
        String strM33346 = m33346();
        if (!strM33346.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C16903("…", new C12962(22), null));
            ((ArrayList) C10199.m23790()).add(new C7517(strM33346, arrayList));
            C10199.m23791();
            ActivityC2822 activityC2822 = this.f34331;
            activityC2822.m4488();
            activityC2822.f4840.m4420(activityC2822.f4838.size() - 1);
        }
        m33348();
    }
}
