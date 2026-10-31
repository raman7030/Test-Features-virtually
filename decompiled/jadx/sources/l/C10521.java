package l;

import android.view.View;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۤ᩶ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5LN */
/* JADX INFO: loaded from: classes4.dex */
public final class C10521 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC0206 f31545;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14298 f31546;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f31547;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10521(C14298 c14298, Main main, DialogInterfaceC0206 dialogInterfaceC0206, View view) {
        super(main, -1);
        this.f31546 = c14298;
        this.f31545 = dialogInterfaceC0206;
        this.f31547 = view;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2170() {
        String strM31260 = m31260();
        if (strM31260.isEmpty()) {
            m31262();
            return;
        }
        try {
            int i = Integer.parseInt(strM31260);
            if (i < 0) {
                throw new NumberFormatException();
            }
            m31262();
            while (C14298.f43090.size() > i) {
                C14298.f43090.remove(C14298.f43090.size() - 1);
            }
            C14298.m34111();
            this.f31545.dismiss();
            boolean zIsEmpty = C14298.f43090.isEmpty();
            C14298 c14298 = this.f31546;
            if (zIsEmpty) {
                c14298.f43100.setEnabled(false);
            } else {
                c14298.m34085(this.f31547);
            }
        } catch (NumberFormatException unused) {
            m31263(R.string.MT_Protector);
        }
    }
}
