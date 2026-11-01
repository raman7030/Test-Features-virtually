package p067l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.۠᩹᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: P1ZZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C10424 extends AbstractDialogInterfaceOnClickListenerC5327 {

    /* JADX INFO: renamed from: ۛ */
    public final /* synthetic */ C21824 f28822;

    /* JADX INFO: renamed from: ۨ */
    public final /* synthetic */ String f28823;

    /* JADX INFO: renamed from: ܰ */
    public final /* synthetic */ C12574 f28824;

    /* JADX INFO: renamed from: ᩺ */
    public final /* synthetic */ C4697 f28825;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10424(C21824 c21824, C18107 c18107, String str, boolean z, String str2, C12574 c12574, C4697 c4697, String str3) {
        super(c18107, str, z, str2);
        this.f28822 = c21824;
        this.f28824 = c12574;
        this.f28825 = c4697;
        this.f28823 = str3;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            boolean zM28980 = this.f28824.m28980();
            final C4697 c4697 = this.f28825;
            if (zM28980) {
                C11896.m27214(new InterfaceC14577() { // from class: l.֨᩹᩻
                    @Override // p067l.InterfaceC14577
                    public final /* synthetic */ void onCanceled() {
                    }

                    @Override // p067l.InterfaceC14577
                    /* JADX INFO: renamed from: ֫ */
                    public final void mo6049(C13457 c13457, boolean z) {
                        C10424 c10424 = this.f7868;
                        C21824.m49186(c10424.f28822, c4697, c10424.m11535(), c13457, z);
                    }

                    @Override // p067l.InterfaceC14577
                    /* JADX INFO: renamed from: ֫ */
                    public final /* synthetic */ boolean mo6050(Exception exc) {
                        return false;
                    }
                }, c4697.m9965(), this.f28823);
            } else {
                C21824.m49186(this.f28822, c4697, m11535(), null, false);
            }
        }
    }
}
