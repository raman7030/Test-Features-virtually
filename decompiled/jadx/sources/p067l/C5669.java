package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۗ᩶᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: K6KF */
/* JADX INFO: loaded from: classes2.dex */
public final class C5669 extends AbstractDialogInterfaceOnClickListenerC14580 {

    /* JADX INFO: renamed from: ۟ */
    public final /* synthetic */ C15056 f13795;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5669(C15056 c15056, AbstractActivityC5549 abstractActivityC5549) {
        super(abstractActivityC5549, -1);
        this.f13795 = c15056;
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC14580
    /* JADX INFO: renamed from: ᩴ */
    public final void mo4537() {
        String strTrim = m33346().trim();
        if (!C13161.m30149(strTrim)) {
            m33349(R.string.MT_Protector);
            return;
        }
        C13161.m30150(strTrim);
        this.f13795.mo9048();
        m33348();
    }
}
