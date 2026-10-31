package l;

import android.content.ClipboardManager;
import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.֡֨ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1XC */
/* JADX INFO: loaded from: classes2.dex */
public final class C0083 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ClipboardManager f1016 = (ClipboardManager) C4925.m14335().getSystemService("clipboard");

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AbstractDialogInterfaceOnClickListenerC12849 f1017;

    public C0083(C16560 c16560) {
        C19135 c19135 = new C19135(c16560.m39056(), c16560);
        c19135.m31258(R.string.MT_Protector);
        c19135.m31250((CharSequence) C6554.m18061(2000, c16560.m39020()));
        c19135.m31279(2);
        c19135.m31281();
        this.f1017 = c19135;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m1042(C0083 c0083) {
        ClipboardManager clipboardManager = c0083.f1016;
        if (clipboardManager.hasPrimaryClip()) {
            CharSequence text = clipboardManager.getText();
            AbstractDialogInterfaceOnClickListenerC12849 abstractDialogInterfaceOnClickListenerC12849 = c0083.f1017;
            abstractDialogInterfaceOnClickListenerC12849.m31250((CharSequence) (text == null ? "" : text.toString()));
            abstractDialogInterfaceOnClickListenerC12849.m31242();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1043() {
        AbstractDialogInterfaceOnClickListenerC12849 abstractDialogInterfaceOnClickListenerC12849 = this.f1017;
        abstractDialogInterfaceOnClickListenerC12849.m31266(true);
        abstractDialogInterfaceOnClickListenerC12849.m31282().setOnClickListener(new View.OnClickListener() { // from class: l.ᩴ֨ܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0083.m1042(this.f57187);
            }
        });
    }
}
