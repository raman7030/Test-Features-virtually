package l;

import bin.mt.plus.R;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܰ᩻ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5R1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14155 extends AbstractC7548 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC6604 f42714;

    public C14155(ActivityC6604 activityC6604) {
        this.f42714 = activityC6604;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20267(this.f42714, R.string.MT_Protector);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        ActivityC6604 activityC6604 = this.f42714;
        C23537 c23537 = activityC6604.f20336;
        int i = C16999.f52136;
        c23537.f75575 = C16999.m39862(activityC6604.getIntent());
        C23537 c23538 = activityC6604.f20336;
        c23538.f75578 = C9028.m23279(c23538.f75575.m36506(), EnumC9734.CREATE);
        Iterator it = activityC6604.f20336.f75578.mo21936().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((InterfaceC4277) it.next()).mo12850().iterator();
            while (it2.hasNext()) {
                ((InterfaceC0748) it2.next()).mo2873();
            }
        }
        C23537 c23539 = activityC6604.f20336;
        c23539.f75569 = new C12534(0, c23539.f75578);
        C23537 c235310 = activityC6604.f20336;
        c235310.f75567 = c235310.f75578.mo14959();
        activityC6604.f20336.f75570 = true;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        this.f42714.m18111();
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f42714.m10224((Throwable) exc, true);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}
