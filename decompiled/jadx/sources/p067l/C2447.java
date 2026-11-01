package p067l;

import android.content.ClipboardManager;
import android.view.View;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.֡֨ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1XC */
/* JADX INFO: loaded from: classes2.dex */
public final class C2447 {

    /* JADX INFO: renamed from: ֫ */
    public ClipboardManager f3790 = (ClipboardManager) C7050.m16232().getSystemService("clipboard");

    /* JADX INFO: renamed from: ۧ */
    public AbstractDialogInterfaceOnClickListenerC14580 f3791;

    public C2447(C18107 c18107) {
        C20554 c20554 = new C20554(c18107.m41282(), c18107);
        c20554.m33344(R.string.MT_Protector);
        c20554.m33336((CharSequence) C8597.m20011(2000, c18107.m41246()));
        c20554.m33365(2);
        c20554.m33367();
        this.f3791 = c20554;
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m3438(C2447 c2447) {
        ClipboardManager clipboardManager = c2447.f3790;
        if (clipboardManager.hasPrimaryClip()) {
            CharSequence text = clipboardManager.getText();
            AbstractDialogInterfaceOnClickListenerC14580 abstractDialogInterfaceOnClickListenerC14580 = c2447.f3791;
            abstractDialogInterfaceOnClickListenerC14580.m33336((CharSequence) (text == null ? "" : text.toString()));
            abstractDialogInterfaceOnClickListenerC14580.m33328();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m3439() {
        AbstractDialogInterfaceOnClickListenerC14580 abstractDialogInterfaceOnClickListenerC14580 = this.f3791;
        abstractDialogInterfaceOnClickListenerC14580.m33352(true);
        abstractDialogInterfaceOnClickListenerC14580.m33368().setOnClickListener(new View.OnClickListener() { // from class: l.ᩴ֨ܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C2447.m3438(this.f60405);
            }
        });
    }
}
