package p067l;

import android.view.View;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۧۢۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1PX */
/* JADX INFO: loaded from: classes4.dex */
public final class C12742 extends AbstractC13787 {

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ ActivityC10059 f35768;

    @Override // p067l.AbstractC13787
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo13851(View view, Object obj) {
        return view == obj;
    }

    @Override // p067l.AbstractC13787
    /* JADX INFO: renamed from: ۧ */
    public final int mo13852() {
        return 2;
    }

    public C12742(ActivityC10059 activityC10059) {
        this.f35768 = activityC10059;
    }

    @Override // p067l.AbstractC13787
    /* JADX INFO: renamed from: ֫ */
    public final CharSequence mo13848(int i) {
        return this.f35768.getString(i == 0 ? R.string.MT_Protector : R.string.MT_Protector);
    }

    @Override // p067l.AbstractC13787
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13849(C2798 c2798, int i) {
        ActivityC10059 activityC10059 = this.f35768;
        C14849 c14849 = i == 0 ? activityC10059.f27836.f10615 : activityC10059.f27837.f56099;
        c2798.addView(c14849);
        return c14849;
    }

    @Override // p067l.AbstractC13787
    /* JADX INFO: renamed from: ֫ */
    public final void mo13850(C2798 c2798, int i, Object obj) {
        ActivityC10059 activityC10059 = this.f35768;
        c2798.removeView(i == 0 ? activityC10059.f27836.f10615 : activityC10059.f27837.f56099);
    }
}
