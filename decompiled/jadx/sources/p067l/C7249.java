package p067l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ۚۙ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: R5YB */
/* JADX INFO: loaded from: classes3.dex */
public final class C7249 implements InterfaceC14577 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ AbstractC22672 f18913;

    public C7249(AbstractC22672 abstractC22672) {
        this.f18913 = abstractC22672;
    }

    @Override // p067l.InterfaceC14577
    public final void onCanceled() {
        this.f18913.mo31727();
    }

    @Override // p067l.InterfaceC14577
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo6050(Exception exc) {
        this.f18913.f71508.m41282().m12259(exc, new DialogInterface.OnDismissListener() { // from class: l.֡ۙ᩻
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f4211.f18913.mo31727();
            }
        });
        return true;
    }

    @Override // p067l.InterfaceC14577
    /* JADX INFO: renamed from: ֫ */
    public final void mo6049(C13457 c13457, boolean z) {
        new C16635(this.f18913, c13457, z).m22250();
    }
}
