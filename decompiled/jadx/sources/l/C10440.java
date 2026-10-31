package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۤܿܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AWI */
/* JADX INFO: loaded from: classes3.dex */
public final class C10440 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC0477 f31367;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10440(ActivityC0477 activityC0477, ActivityC0477 activityC0478) {
        super(activityC0478, -1);
        this.f31367 = activityC0477;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2170() {
        String strM31260 = m31260();
        if (!strM31260.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C15293("…", new C11146(22), null));
            ((ArrayList) C8239.m21821()).add(new C5417(strM31260, arrayList));
            C8239.m21822();
            ActivityC0477 activityC0477 = this.f31367;
            activityC0477.m2107();
            activityC0477.f2066.m2043(activityC0477.f2064.size() - 1);
        }
        m31262();
    }
}
