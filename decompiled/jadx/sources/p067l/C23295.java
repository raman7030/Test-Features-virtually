package p067l;

import android.widget.TextView;

/* JADX INFO: renamed from: l.᩹ۗܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4HD */
/* JADX INFO: loaded from: classes.dex */
public final class C23295 implements InterfaceC22192 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ InterfaceC8780 f73290;

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ C16155 f73291;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ boolean f73292;

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ C18483 f73293;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ DialogInterfaceC2564 f73294;

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ InterfaceC14577 f73295;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ TextView f73296;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ C13457 f73297;

    public C23295(boolean z, C16155 c16155, DialogInterfaceC2564 dialogInterfaceC2564, InterfaceC14577 interfaceC14577, InterfaceC8780 interfaceC8780, C18483 c18483, C13457 c13457, TextView textView) {
        this.f73292 = z;
        this.f73291 = c16155;
        this.f73294 = dialogInterfaceC2564;
        this.f73295 = interfaceC14577;
        this.f73290 = interfaceC8780;
        this.f73293 = c18483;
        this.f73297 = c13457;
        this.f73296 = textView;
    }

    @Override // p067l.InterfaceC22192
    public final void onSuccess() {
        boolean z = this.f73292;
        InterfaceC14577 interfaceC14577 = this.f73295;
        DialogInterfaceC2564 dialogInterfaceC2564 = this.f73294;
        if (z) {
            if (!this.f73291.m36759(dialogInterfaceC2564)) {
                return;
            }
            if (!dialogInterfaceC2564.m3855()) {
                interfaceC14577.onCanceled();
                return;
            }
        }
        this.f73290.mo20309(this.f73293);
        dialogInterfaceC2564.dismiss();
        interfaceC14577.mo6049(this.f73297, false);
    }

    @Override // p067l.InterfaceC22192
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo27608(Exception exc) {
        boolean z = this.f73292;
        InterfaceC14577 interfaceC14577 = this.f73295;
        DialogInterfaceC2564 dialogInterfaceC2564 = this.f73294;
        if (z) {
            if (!this.f73291.m36759(dialogInterfaceC2564)) {
                return true;
            }
            if (!dialogInterfaceC2564.m3855()) {
                interfaceC14577.onCanceled();
                return true;
            }
        }
        if (exc instanceof C23021) {
            C10792.m24863(this.f73296, (C23021) exc);
            dialogInterfaceC2564.m3860().setEnabled(false);
            return true;
        }
        return interfaceC14577.mo6050(exc);
    }

    @Override // p067l.InterfaceC22192
    public final void onCanceled() {
        this.f73294.dismiss();
        this.f73295.onCanceled();
    }
}
