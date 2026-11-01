package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ᩳܶ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 09LR */
/* JADX INFO: loaded from: classes5.dex */
public final class C19611 extends AbstractDialogInterfaceOnClickListenerC14580 {

    /* JADX INFO: renamed from: ۟ */
    public final /* synthetic */ ActivityC17598 f59647;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19611(ActivityC17598 activityC17598, ActivityC17598 activityC17599) {
        super(activityC17599, -1);
        this.f59647 = activityC17598;
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC14580
    /* JADX INFO: renamed from: ᩴ */
    public final void mo4537() {
        try {
            this.f59647.f52598.m34981(m33346());
            m33348();
        } catch (IllegalArgumentException unused) {
            m33349(R.string.MT_Protector);
        }
    }
}
