package p067l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ۘ᩹᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: M1ZN */
/* JADX INFO: loaded from: classes3.dex */
public final class C6401 extends AbstractDialogInterfaceOnClickListenerC5327 {

    /* JADX INFO: renamed from: ۛ */
    public final /* synthetic */ C7742 f16567;

    /* JADX INFO: renamed from: ۟ */
    public final /* synthetic */ C12574 f16568;

    /* JADX INFO: renamed from: ۨ */
    public final /* synthetic */ AbstractC17043 f16569;

    /* JADX INFO: renamed from: ܰ */
    public final /* synthetic */ C4697 f16570;

    /* JADX INFO: renamed from: ᩺ */
    public final /* synthetic */ String f16571;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6401(C7742 c7742, C18107 c18107, String str, boolean z, String str2, C4697 c4697, C12574 c12574, String str3, AbstractC17043 abstractC17043) {
        super(c18107, str, z, str2);
        this.f16567 = c7742;
        this.f16570 = c4697;
        this.f16568 = c12574;
        this.f16571 = str3;
        this.f16569 = abstractC17043;
        if (c4697.m9966() == 1) {
            m11533(c4697.m9961().getName());
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        final C4697 c4697 = this.f16570;
        final String strM11534 = c4697.m9966() == 1 ? m11534() : "";
        if (i == -1) {
            final int iM11531 = m11531();
            final int iM11535 = m11535();
            final boolean zM11536 = m11536();
            boolean zM28980 = this.f16568.m28980();
            final AbstractC17043 abstractC17043 = this.f16569;
            if (zM28980) {
                C11896.m27214(new InterfaceC14577() { // from class: l.ۖ᩹᩻
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
                        C7742.m17870(this.f11859.f16567, c4697, abstractC17043, iM11531, iM11535, zM11536, strM11534, c13457, z);
                    }
                }, c4697.m9965(), this.f16571);
            } else {
                C7742.m17870(this.f16567, c4697, abstractC17043, iM11531, iM11535, zM11536, strM11534, null, false);
            }
        }
    }
}
