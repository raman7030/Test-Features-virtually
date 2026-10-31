package l;

import android.widget.TextView;

/* JADX INFO: renamed from: l.᩹ۗܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4HD */
/* JADX INFO: loaded from: classes.dex */
public final class C22019 implements InterfaceC20858 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC6746 f70577;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14506 f70578;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f70579;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16955 f70580;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC0206 f70581;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC12846 f70582;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f70583;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11667 f70584;

    public C22019(boolean z, C14506 c14506, DialogInterfaceC0206 dialogInterfaceC0206, InterfaceC12846 interfaceC12846, InterfaceC6746 interfaceC6746, C16955 c16955, C11667 c11667, TextView textView) {
        this.f70579 = z;
        this.f70578 = c14506;
        this.f70581 = dialogInterfaceC0206;
        this.f70582 = interfaceC12846;
        this.f70577 = interfaceC6746;
        this.f70580 = c16955;
        this.f70584 = c11667;
        this.f70583 = textView;
    }

    @Override // l.InterfaceC20858
    public final void onSuccess() {
        boolean z = this.f70579;
        InterfaceC12846 interfaceC12846 = this.f70582;
        DialogInterfaceC0206 dialogInterfaceC0206 = this.f70581;
        if (z) {
            if (!this.f70578.m34618(dialogInterfaceC0206)) {
                return;
            }
            if (!dialogInterfaceC0206.m1442()) {
                interfaceC12846.onCanceled();
                return;
            }
        }
        this.f70577.mo18361(this.f70580);
        dialogInterfaceC0206.dismiss();
        interfaceC12846.mo3776(this.f70584, false);
    }

    @Override // l.InterfaceC20858
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo25586(Exception exc) {
        boolean z = this.f70579;
        InterfaceC12846 interfaceC12846 = this.f70582;
        DialogInterfaceC0206 dialogInterfaceC0206 = this.f70581;
        if (z) {
            if (!this.f70578.m34618(dialogInterfaceC0206)) {
                return true;
            }
            if (!dialogInterfaceC0206.m1442()) {
                interfaceC12846.onCanceled();
                return true;
            }
        }
        if (exc instanceof C21730) {
            C8863.m22892(this.f70583, (C21730) exc);
            dialogInterfaceC0206.m1447().setEnabled(false);
            return true;
        }
        return interfaceC12846.mo3777(exc);
    }

    @Override // l.InterfaceC20858
    public final void onCanceled() {
        this.f70581.dismiss();
        this.f70582.onCanceled();
    }
}
