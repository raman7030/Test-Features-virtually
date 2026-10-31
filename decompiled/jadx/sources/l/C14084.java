package l;

import android.content.DialogInterface;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܰ᩸ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8UQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C14084 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2112 f42537;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14084(AbstractActivityC3346 abstractActivityC3346, C2112 c2112) {
        super(abstractActivityC3346, -1);
        this.f42537 = c2112;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2170() {
        String strTrim = m31260().trim();
        try {
            if (strTrim.isEmpty()) {
                throw new NumberFormatException();
            }
            int i = Integer.parseInt(strTrim);
            if (i < 1 || i > 999) {
                C21374.m48457(R.string.MT_Protector);
            } else {
                C21805.m49153(i);
                m31262();
            }
        } catch (NumberFormatException unused) {
            C21374.m48457(R.string.MT_Protector);
        }
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        C2112 c2112 = this.f42537;
        if (c2112.f7046 == this) {
            c2112.f7046 = null;
        }
    }
}
