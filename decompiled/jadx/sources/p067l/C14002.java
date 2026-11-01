package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.۫ۜۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 08W3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14002 extends AbstractDialogInterfaceOnClickListenerC14580 {

    /* JADX INFO: renamed from: ֫֫ */
    public final /* synthetic */ int f39509;

    /* JADX INFO: renamed from: ۟ */
    public final /* synthetic */ ActivityC13332 f39510;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14002(ActivityC13332 activityC13332, AbstractActivityC5549 abstractActivityC5549, int i) {
        super(abstractActivityC5549, -1);
        this.f39510 = activityC13332;
        this.f39509 = i;
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC14580
    /* JADX INFO: renamed from: ᩴ */
    public final void mo4537() {
        int i;
        try {
            i = Integer.parseInt(m33346());
        } catch (Exception unused) {
            i = 0;
        }
        if (i <= 0) {
            m33348();
        } else if (i > this.f39509) {
            C22682.m50793(R.string.MT_Protector);
        } else {
            new C14672(this, i).m22250();
        }
    }
}
