package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ۚۙ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: R5YB */
/* JADX INFO: loaded from: classes3.dex */
public final class C5135 implements InterfaceC12846 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC21363 f16074;

    public C5135(AbstractC21363 abstractC21363) {
        this.f16074 = abstractC21363;
    }

    @Override // l.InterfaceC12846
    public final void onCanceled() {
        this.f16074.mo29665();
    }

    @Override // l.InterfaceC12846
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo3777(Exception exc) {
        this.f16074.f68812.m39056().m10223(exc, new DialogInterface.OnDismissListener() { // from class: l.֡ۙ᩻
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f1432.f16074.mo29665();
            }
        });
        return true;
    }

    @Override // l.InterfaceC12846
    /* JADX INFO: renamed from: ֫ */
    public final void mo3776(C11667 c11667, boolean z) {
        new C15011(this.f16074, c11667, z).m20274();
    }
}
