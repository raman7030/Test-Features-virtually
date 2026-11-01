package p067l;

import android.R;
import bin.p000mt.plus.Main;

/* JADX INFO: renamed from: l.᩵֨ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1XC */
/* JADX INFO: loaded from: classes5.dex */
public final class C20554 extends AbstractDialogInterfaceOnClickListenerC14580 {

    /* JADX INFO: renamed from: ۟ */
    public final /* synthetic */ C18107 f63552;

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC14580
    /* JADX INFO: renamed from: ۘ */
    public final void mo9819() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20554(Main main, C18107 c18107) {
        super(main, R.string.paste);
        this.f63552 = c18107;
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC14580
    /* JADX INFO: renamed from: ᩴ */
    public final void mo4537() {
        String strM33346 = m33346();
        if (!strM33346.startsWith("/")) {
            strM33346 = "/".concat(strM33346);
        }
        boolean zEndsWith = strM33346.endsWith("/");
        C18107 c18107 = this.f63552;
        if (!zEndsWith && c18107.m41270().mo8211(strM33346)) {
            c18107.m41279(C11419.m26414(strM33346));
            strM33346 = C11419.m26416(strM33346);
        }
        c18107.m41259(strM33346, false);
        m33348();
    }
}
