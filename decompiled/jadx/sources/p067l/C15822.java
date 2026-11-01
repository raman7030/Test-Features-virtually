package p067l;

import bin.p000mt.plus.R;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܰ᩻ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5R1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15822 extends AbstractC9542 {

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ ActivityC8645 f45803;

    public C15822(ActivityC8645 activityC8645) {
        this.f45803 = activityC8645;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22243(this.f45803, R.string.MT_Protector);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        ActivityC8645 activityC8645 = this.f45803;
        C24738 c24738 = activityC8645.f23213;
        int i = C18524.f55316;
        c24738.f78321 = C18524.m42105(activityC8645.getIntent());
        C24738 c24739 = activityC8645.f23213;
        c24739.f78324 = C10949.m25223(c24739.f78321.m38664(), EnumC11620.CREATE);
        Iterator it = activityC8645.f23213.f78324.mo23906().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((InterfaceC6434) it.next()).mo14714().iterator();
            while (it2.hasNext()) {
                ((InterfaceC3080) it2.next()).mo5202();
            }
        }
        C24738 c247310 = activityC8645.f23213;
        c247310.f78315 = new C14281(0, c247310.f78324);
        C24738 c247311 = activityC8645.f23213;
        c247311.f78313 = c247311.f78324.mo16869();
        activityC8645.f23213.f78316 = true;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        this.f45803.m20063();
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f45803.m12260((Throwable) exc, true);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        m22249();
    }
}
