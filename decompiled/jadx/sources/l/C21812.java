package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩸᩶ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 14V2 */
/* JADX INFO: loaded from: classes.dex */
public final class C21812 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19866 f69887;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC20401 f69888;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f69889;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21812(ActivityC20401 activityC20401, AbstractActivityC3346 abstractActivityC3346, String str, C19866 c19866) {
        super(abstractActivityC3346, -1);
        this.f69888 = activityC20401;
        this.f69889 = str;
        this.f69887 = c19866;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2170() {
        String strM31260 = m31260();
        if (strM31260.length() == 0 || strM31260.equalsIgnoreCase(this.f69889)) {
            m31262();
            return;
        }
        AbstractC15440 abstractC15440M45691 = this.f69887.m45691();
        AbstractC15440 abstractC15440M36524 = abstractC15440M45691.m36524(strM31260.concat(".mtd"));
        if (abstractC15440M36524.mo23120()) {
            m31263(R.string.MT_Protector);
            return;
        }
        abstractC15440M45691.mo23551(abstractC15440M36524);
        ActivityC20401.m46723(this.f69888);
        m31262();
    }
}
