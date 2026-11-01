package p067l;

import android.widget.Button;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۘ᩸᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 9981 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6381 extends AbstractC3947 {
    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo3869(C4697 c4697) {
        return c4697.m9964("trash");
    }

    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ܽ */
    public final void mo3868(C4697 c4697) {
        c4697.m9955("trash");
        int iM9966 = c4697.m9966();
        Button buttonM3860 = m7832(c4697, R.string.MT_Protector, iM9966 == 1 ? C7050.m16203(R.string.MT_Protector, c4697.m9961().mo39151()) : C7050.m16203(R.string.MT_Protector, Integer.valueOf(iM9966))).m3860();
        buttonM3860.setClickable(false);
        C7050.m16206(300L, new RunnableC23634(2, buttonM3860));
    }

    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ܿ */
    public final void mo4692(C4697 c4697) {
        int i = C16723.f49313;
        C3313 c3313 = new C3313(C5040.class);
        c3313.m5788(c4697.m9957());
        c3313.m5789(c4697);
        c3313.m5777("deleteFrom", c4697.m9958());
        c3313.m5778("recycle", false);
        c3313.m5778("speedMode", false);
        c3313.m5773(0, "minTotal");
        c3313.m5772();
    }
}
