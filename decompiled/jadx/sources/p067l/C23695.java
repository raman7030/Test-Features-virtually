package p067l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.᩹ܿ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 98AW */
/* JADX INFO: loaded from: classes.dex */
public final class C23695 extends AbstractDialogInterfaceOnClickListenerC5327 {

    /* JADX INFO: renamed from: ۛ */
    public final /* synthetic */ C14307 f75415;

    /* JADX INFO: renamed from: ۨ */
    public final /* synthetic */ String f75416;

    /* JADX INFO: renamed from: ܰ */
    public final /* synthetic */ C12574 f75417;

    /* JADX INFO: renamed from: ᩺ */
    public final /* synthetic */ C4697 f75418;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23695(C14307 c14307, C18107 c18107, String str, boolean z, String str2, C12574 c12574, C4697 c4697, String str3) {
        super(c18107, str, z, str2);
        this.f75415 = c14307;
        this.f75417 = c12574;
        this.f75418 = c4697;
        this.f75416 = str3;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            final int iM11531 = m11531();
            final int iM11535 = m11535();
            boolean zM28980 = this.f75417.m28980();
            final C4697 c4697 = this.f75418;
            if (zM28980) {
                C11896.m27214(new InterfaceC14577() { // from class: l.᩸ܿ᩻
                    @Override // p067l.InterfaceC14577
                    public final /* synthetic */ void onCanceled() {
                    }

                    @Override // p067l.InterfaceC14577
                    /* JADX INFO: renamed from: ֫ */
                    public final /* synthetic */ boolean mo6050(Exception exc) {
                        return false;
                    }

                    @Override // p067l.InterfaceC14577
                    /* JADX INFO: renamed from: ֫ */
                    public final void mo6049(C13457 c13457, boolean z) {
                        C14307.m32867(this.f72408.f75415, c4697, iM11531, iM11535, c13457, z);
                    }
                }, c4697.m9965(), this.f75416);
            } else {
                C14307.m32867(this.f75415, c4697, iM11531, iM11535, null, false);
            }
        }
    }
}
