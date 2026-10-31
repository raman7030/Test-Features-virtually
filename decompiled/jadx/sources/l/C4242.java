package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ۘ᩹᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: M1ZN */
/* JADX INFO: loaded from: classes3.dex */
public final class C4242 extends AbstractDialogInterfaceOnClickListenerC3113 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5653 f13750;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10738 f13751;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC15440 f13752;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2450 f13753;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f13754;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4242(C5653 c5653, C16560 c16560, String str, boolean z, String str2, C2450 c2450, C10738 c10738, String str3, AbstractC15440 abstractC15440) {
        super(c16560, str, z, str2);
        this.f13750 = c5653;
        this.f13753 = c2450;
        this.f13751 = c10738;
        this.f13754 = str3;
        this.f13752 = abstractC15440;
        if (c2450.m7918() == 1) {
            m9490(c2450.m7913().getName());
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        final C2450 c2450 = this.f13753;
        final String strM9491 = c2450.m7918() == 1 ? m9491() : "";
        if (i == -1) {
            final int iM9488 = m9488();
            final int iM9492 = m9492();
            final boolean zM9493 = m9493();
            boolean zM26936 = this.f13751.m26936();
            final AbstractC15440 abstractC15440 = this.f13752;
            if (zM26936) {
                C10025.m25197(new InterfaceC12846() { // from class: l.ۖ᩹᩻
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
                        C5653.m15942(this.f9062.f13750, c2450, abstractC15440, iM9488, iM9492, zM9493, strM9491, c11667, z);
                    }
                }, c2450.m7917(), this.f13754);
            } else {
                C5653.m15942(this.f13750, c2450, abstractC15440, iM9488, iM9492, zM9493, strM9491, null, false);
            }
        }
    }
}
