package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.۬ܿܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AWI */
/* JADX INFO: loaded from: classes4.dex */
public final class C14972 extends AbstractDialogInterfaceOnClickListenerC14580 {

    /* JADX INFO: renamed from: ֫֫ */
    public final /* synthetic */ C7517 f42777;

    /* JADX INFO: renamed from: ۟ */
    public final /* synthetic */ ActivityC2822 f42778;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14972(ActivityC2822 activityC2822, ActivityC2822 activityC2823, C7517 c7517) {
        super(activityC2823, -1);
        this.f42778 = activityC2822;
        this.f42777 = c7517;
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC14580
    /* JADX INFO: renamed from: ᩴ */
    public final void mo4537() {
        String strM33346 = m33346();
        if (strM33346.isEmpty()) {
            m33349(R.string.MT_Protector);
            return;
        }
        this.f42777.m17412(strM33346);
        C10199.m23791();
        AbstractC13787 abstractC13787M4409 = this.f42778.f4840.m4409();
        C12826.requireNonNull(abstractC13787M4409);
        abstractC13787M4409.m31441();
        m33348();
    }
}
