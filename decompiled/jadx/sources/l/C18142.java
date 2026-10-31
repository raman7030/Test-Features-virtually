package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ᩳܶ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 09LR */
/* JADX INFO: loaded from: classes5.dex */
public final class C18142 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC16024 f56432;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18142(ActivityC16024 activityC16024, ActivityC16024 activityC16025) {
        super(activityC16025, -1);
        this.f56432 = activityC16024;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2170() {
        try {
            this.f56432.f49434.m32866(m31260());
            m31262();
        } catch (IllegalArgumentException unused) {
            m31263(R.string.MT_Protector);
        }
    }
}
