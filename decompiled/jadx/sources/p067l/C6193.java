package p067l;

import android.view.View;
import bin.p000mt.plus.Main;

/* JADX INFO: renamed from: l.ۘܶܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: L5KK */
/* JADX INFO: loaded from: classes3.dex */
public final class C6193 extends AbstractViewOnClickListenerC3510 {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C20946 f15585;

    /* JADX INFO: renamed from: ᩶ */
    public final C18362 f15586;

    @Override // p067l.AbstractC13374
    /* JADX INFO: renamed from: ۧ */
    public final int mo8461() {
        return 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6193(C20946 c20946, Main main, C18362 c18362) {
        super(main);
        this.f15585 = c20946;
        this.f15586 = c18362;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C13596 m14021() {
        C18362 c18362 = this.f15586;
        C21265 c21265M41833 = c18362.m41833();
        if (c21265M41833 == null) {
            C19033 c19033M41834 = c18362.m41834();
            if (c19033M41834 != null) {
                C21265 c21265M9396 = c19033M41834.m43235() ? C21265.f66817 : C4463.m9371(c18362.m41824(), true).m9396();
                c18362.m41820(c21265M9396);
                return c21265M9396.f66884;
            }
            return C4463.m9371(c18362.m41824(), true).m9396().f66884;
        }
        return c21265M41833.f66884;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.f15585.f40549.m12191() || AbstractViewOnClickListenerC3510.f7107.m24763()) {
            return;
        }
        C18362 c18362 = this.f15586;
        C19033 c19033M41834 = c18362.m41834();
        Main main = this.f37526;
        if (c19033M41834 == null) {
            main.m125();
            AbstractC17043 abstractC17043M42109 = C18524.m42109(c18362.m41824(), new String[0]);
            C11245 c11245M130 = main.m130();
            C12826.requireNonNull(c11245M130);
            C18107 c18107M26079 = c11245M130.m26079();
            boolean zMo25087 = abstractC17043M42109.mo25087();
            if (!zMo25087) {
                c18107M26079.m41279(abstractC17043M42109.getName());
            }
            c18107M26079.m41259(zMo25087 ? abstractC17043M42109.mo25505() : abstractC17043M42109.getParent(), true);
            return;
        }
        if (main.m123(c19033M41834.m43234(), c18362.m41824(), c19033M41834.m43235())) {
            main.m125();
        }
    }
}
