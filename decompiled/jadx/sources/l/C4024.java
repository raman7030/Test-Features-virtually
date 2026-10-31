package l;

import android.view.View;
import bin.mt.plus.Main;

/* JADX INFO: renamed from: l.ۘܶܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: L5KK */
/* JADX INFO: loaded from: classes3.dex */
public final class C4024 extends AbstractViewOnClickListenerC1201 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19547 f12770;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C16828 f12771;

    @Override // l.AbstractC11580
    /* JADX INFO: renamed from: ۧ */
    public final int mo6259() {
        return 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4024(C19547 c19547, Main main, C16828 c16828) {
        super(main);
        this.f12770 = c19547;
        this.f12771 = c16828;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C11813 m12101() {
        C16828 c16828 = this.f12771;
        C19883 c19883M39597 = c16828.m39597();
        if (c19883M39597 == null) {
            C17534 c17534M39598 = c16828.m39598();
            if (c17534M39598 != null) {
                C19883 c19883M7317 = c17534M39598.m40975() ? C19883.f64181 : C2204.m7292(c16828.m39588(), true).m7317();
                c16828.m39584(c19883M7317);
                return c19883M7317.f64248;
            }
            return C2204.m7292(c16828.m39588(), true).m7317().f64248;
        }
        return c19883M39597.f64248;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.f12770.f37526.m10155() || AbstractViewOnClickListenerC1201.f4338.m22793()) {
            return;
        }
        C16828 c16828 = this.f12771;
        C17534 c17534M39598 = c16828.m39598();
        Main main = this.f34527;
        if (c17534M39598 == null) {
            main.m127();
            AbstractC15440 abstractC15440M39866 = C16999.m39866(c16828.m39588(), new String[0]);
            C9340 c9340M132 = main.m132();
            C11003.requireNonNull(c9340M132);
            C16560 c16560M24070 = c9340M132.m24070();
            boolean zMo23113 = abstractC15440M39866.mo23113();
            if (!zMo23113) {
                c16560M24070.m39053(abstractC15440M39866.getName());
            }
            c16560M24070.m39033(zMo23113 ? abstractC15440M39866.mo23554() : abstractC15440M39866.getParent(), true);
            return;
        }
        if (main.m125(c17534M39598.m40974(), c16828.m39588(), c17534M39598.m40975())) {
            main.m127();
        }
    }
}
