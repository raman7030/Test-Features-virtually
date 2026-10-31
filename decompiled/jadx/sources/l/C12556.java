package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.۫ܿܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AWI */
/* JADX INFO: loaded from: classes4.dex */
public final class C12556 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f37856;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC0477 f37857;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12556(ActivityC0477 activityC0477, ActivityC0477 activityC0478, int i) {
        super(activityC0478, -1);
        this.f37857 = activityC0477;
        this.f37856 = i;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2170() {
        String strM31260 = m31260();
        if (!strM31260.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C15293("…", new C11146(22), null));
            List listM21821 = C8239.m21821();
            int i = this.f37856 + 1;
            ((ArrayList) listM21821).add(i, new C5417(strM31260, arrayList));
            C8239.m21822();
            ActivityC0477 activityC0477 = this.f37857;
            activityC0477.m2107();
            activityC0477.f2066.m2043(i);
        }
        m31262();
    }
}
