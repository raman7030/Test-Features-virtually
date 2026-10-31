package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۘ᩺ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: L1Y0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4254 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f13778;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC19071 f13779;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4254(Main main, String str, InterfaceC19071 interfaceC19071) {
        super(main, -1);
        this.f13778 = str;
        this.f13779 = interfaceC19071;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2170() {
        String strM31260 = m31260();
        if (strM31260.contains("\\") || strM31260.contains("/")) {
            m31263(R.string.MT_Protector);
        } else if (C16999.m39866(C9523.m24393(this.f13778, strM31260), new String[0]).mo23120()) {
            m31263(R.string.MT_Protector);
        } else {
            m31262();
            this.f13779.mo2836(strM31260);
        }
    }
}
