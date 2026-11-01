package p067l;

import android.widget.TextView;

/* JADX INFO: renamed from: l.ۤۡۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31PG */
/* JADX INFO: loaded from: classes3.dex */
public final class C12051 implements InterfaceC22192 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ ViewOnClickListenerC15402 f33566;

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ C18483 f33567;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ InterfaceC8780 f33568;

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ C13457 f33569;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ boolean f33570;

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ TextView f33571;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ DialogInterfaceC2564 f33572;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ C16155 f33573;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ String f33574;

    @Override // p067l.InterfaceC22192
    public final /* synthetic */ void onCanceled() {
    }

    public C12051(ViewOnClickListenerC15402 viewOnClickListenerC15402, boolean z, C16155 c16155, DialogInterfaceC2564 dialogInterfaceC2564, InterfaceC8780 interfaceC8780, C18483 c18483, String str, C13457 c13457, TextView textView) {
        this.f33566 = viewOnClickListenerC15402;
        this.f33570 = z;
        this.f33573 = c16155;
        this.f33572 = dialogInterfaceC2564;
        this.f33568 = interfaceC8780;
        this.f33567 = c18483;
        this.f33574 = str;
        this.f33569 = c13457;
        this.f33571 = textView;
    }

    @Override // p067l.InterfaceC22192
    public final void onSuccess() {
        boolean z = this.f33570;
        DialogInterfaceC2564 dialogInterfaceC2564 = this.f33572;
        if (!z || (this.f33573.m36759(dialogInterfaceC2564) && dialogInterfaceC2564.m3855())) {
            this.f33568.mo20309(this.f33567);
            dialogInterfaceC2564.dismiss();
            new C8027(this.f33566, this.f33569, this.f33574).m22250();
        }
    }

    @Override // p067l.InterfaceC22192
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo27608(Exception exc) {
        boolean z = this.f33570;
        DialogInterfaceC2564 dialogInterfaceC2564 = this.f33572;
        if (z && (!this.f33573.m36759(dialogInterfaceC2564) || !dialogInterfaceC2564.m3855())) {
            return true;
        }
        if (!(exc instanceof C23021)) {
            return false;
        }
        C10792.m24863(this.f33571, (C23021) exc);
        dialogInterfaceC2564.m3860().setEnabled(false);
        return true;
    }
}
