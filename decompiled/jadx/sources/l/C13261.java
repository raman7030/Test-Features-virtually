package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۬ܿܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AWI */
/* JADX INFO: loaded from: classes4.dex */
public final class C13261 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5417 f39713;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC0477 f39714;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13261(ActivityC0477 activityC0477, ActivityC0477 activityC0478, C5417 c5417) {
        super(activityC0478, -1);
        this.f39714 = activityC0477;
        this.f39713 = c5417;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2170() {
        String strM31260 = m31260();
        if (strM31260.isEmpty()) {
            m31263(R.string.MT_Protector);
            return;
        }
        this.f39713.m15501(strM31260);
        C8239.m21822();
        AbstractC12014 abstractC12014M2032 = this.f39714.f2066.m2032();
        C11003.requireNonNull(abstractC12014M2032);
        abstractC12014M2032.m29381();
        m31262();
    }
}
