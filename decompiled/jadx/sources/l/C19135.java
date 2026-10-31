package l;

import android.R;
import bin.mt.plus.Main;

/* JADX INFO: renamed from: l.᩵֨ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1XC */
/* JADX INFO: loaded from: classes5.dex */
public final class C19135 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16560 f60320;

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* JADX INFO: renamed from: ۘ */
    public final void mo7756() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19135(Main main, C16560 c16560) {
        super(main, R.string.paste);
        this.f60320 = c16560;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2170() {
        String strM31260 = m31260();
        if (!strM31260.startsWith("/")) {
            strM31260 = "/".concat(strM31260);
        }
        boolean zEndsWith = strM31260.endsWith("/");
        C16560 c16560 = this.f60320;
        if (!zEndsWith && c16560.m39044().mo6014(strM31260)) {
            c16560.m39053(C9523.m24404(strM31260));
            strM31260 = C9523.m24406(strM31260);
        }
        c16560.m39033(strM31260, false);
        m31262();
    }
}
