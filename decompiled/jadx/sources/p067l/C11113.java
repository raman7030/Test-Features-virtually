package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ۡ᩺᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: P1EM */
/* JADX INFO: loaded from: classes3.dex */
public final class C11113 {

    /* JADX INFO: renamed from: ֫ */
    public C20856 f30821;

    /* JADX INFO: renamed from: ۧ */
    public boolean f30822;

    /* JADX INFO: renamed from: ܽ */
    public Map f30823;

    public C11113(C20856 c20856, boolean z) {
        this.f30821 = c20856;
        this.f30822 = z;
    }

    /* JADX INFO: renamed from: ֫ */
    public final List m25632(String str) {
        return (List) this.f30823.get(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m25633(ActivityC18686 activityC18686, Exception exc) {
        activityC18686.m12259(exc, (DialogInterface.OnDismissListener) null);
        boolean z = exc instanceof C7760;
        if (z) {
            C7760 c7760 = (C7760) exc;
            C20699 c20699M46760 = C20699.m46760(c7760.f20361, c7760.f20360);
            c20699M46760.f63908 = false;
            activityC18686.m42599(c7760.m17914(), c20699M46760);
            this.f30821.m47114(c7760.m17914());
        }
        if (z || (exc instanceof C3870)) {
            C22682.m50793(R.string.MT_Protector);
        }
    }
}
