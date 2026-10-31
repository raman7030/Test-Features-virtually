package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.᩹ܿ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 98AW */
/* JADX INFO: loaded from: classes.dex */
public final class C22439 extends AbstractDialogInterfaceOnClickListenerC3113 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12561 f72689;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f72690;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10738 f72691;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2450 f72692;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22439(C12561 c12561, C16560 c16560, String str, boolean z, String str2, C10738 c10738, C2450 c2450, String str3) {
        super(c16560, str, z, str2);
        this.f72689 = c12561;
        this.f72691 = c10738;
        this.f72692 = c2450;
        this.f72690 = str3;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            final int iM9488 = m9488();
            final int iM9492 = m9492();
            boolean zM26936 = this.f72691.m26936();
            final C2450 c2450 = this.f72692;
            if (zM26936) {
                C10025.m25197(new InterfaceC12846() { // from class: l.᩸ܿ᩻
                    @Override // l.InterfaceC12846
                    public final /* synthetic */ void onCanceled() {
                    }

                    @Override // l.InterfaceC12846
                    /* JADX INFO: renamed from: ֫ */
                    public final /* synthetic */ boolean mo3777(Exception exc) {
                        return false;
                    }

                    @Override // l.InterfaceC12846
                    /* JADX INFO: renamed from: ֫ */
                    public final void mo3776(C11667 c11667, boolean z) {
                        C12561.m30792(this.f69701.f72689, c2450, iM9488, iM9492, c11667, z);
                    }
                }, c2450.m7917(), this.f72690);
            } else {
                C12561.m30792(this.f72689, c2450, iM9488, iM9492, null, false);
            }
        }
    }
}
