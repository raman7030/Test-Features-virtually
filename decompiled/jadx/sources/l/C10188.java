package l;

import android.widget.TextView;

/* JADX INFO: renamed from: l.ۤۡۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31PG */
/* JADX INFO: loaded from: classes3.dex */
public final class C10188 implements InterfaceC20858 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC13714 f30604;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16955 f30605;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC6746 f30606;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11667 f30607;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f30608;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f30609;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC0206 f30610;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14506 f30611;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f30612;

    @Override // l.InterfaceC20858
    public final /* synthetic */ void onCanceled() {
    }

    public C10188(ViewOnClickListenerC13714 viewOnClickListenerC13714, boolean z, C14506 c14506, DialogInterfaceC0206 dialogInterfaceC0206, InterfaceC6746 interfaceC6746, C16955 c16955, String str, C11667 c11667, TextView textView) {
        this.f30604 = viewOnClickListenerC13714;
        this.f30608 = z;
        this.f30611 = c14506;
        this.f30610 = dialogInterfaceC0206;
        this.f30606 = interfaceC6746;
        this.f30605 = c16955;
        this.f30612 = str;
        this.f30607 = c11667;
        this.f30609 = textView;
    }

    @Override // l.InterfaceC20858
    public final void onSuccess() {
        boolean z = this.f30608;
        DialogInterfaceC0206 dialogInterfaceC0206 = this.f30610;
        if (!z || (this.f30611.m34618(dialogInterfaceC0206) && dialogInterfaceC0206.m1442())) {
            this.f30606.mo18361(this.f30605);
            dialogInterfaceC0206.dismiss();
            new C5954(this.f30604, this.f30607, this.f30612).m20274();
        }
    }

    @Override // l.InterfaceC20858
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo25586(Exception exc) {
        boolean z = this.f30608;
        DialogInterfaceC0206 dialogInterfaceC0206 = this.f30610;
        if (z && (!this.f30611.m34618(dialogInterfaceC0206) || !dialogInterfaceC0206.m1442())) {
            return true;
        }
        if (!(exc instanceof C21730)) {
            return false;
        }
        C8863.m22892(this.f30609, (C21730) exc);
        dialogInterfaceC0206.m1447().setEnabled(false);
        return true;
    }
}
