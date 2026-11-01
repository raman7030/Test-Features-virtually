package p067l;

import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۘ᩺ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: L1Y0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6412 extends AbstractDialogInterfaceOnClickListenerC14580 {

    /* JADX INFO: renamed from: ֫֫ */
    public final /* synthetic */ String f16595;

    /* JADX INFO: renamed from: ۟ */
    public final /* synthetic */ InterfaceC20494 f16596;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6412(Main main, String str, InterfaceC20494 interfaceC20494) {
        super(main, -1);
        this.f16595 = str;
        this.f16596 = interfaceC20494;
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC14580
    /* JADX INFO: renamed from: ᩴ */
    public final void mo4537() {
        String strM33346 = m33346();
        if (strM33346.contains("\\") || strM33346.contains("/")) {
            m33349(R.string.MT_Protector);
        } else if (C18524.m42109(C11419.m26403(this.f16595, strM33346), new String[0]).mo25094()) {
            m33349(R.string.MT_Protector);
        } else {
            m33348();
            this.f16596.mo5165(strM33346);
        }
    }
}
