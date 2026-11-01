package p067l;

import android.view.View;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۤ᩶ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5LN */
/* JADX INFO: loaded from: classes4.dex */
public final class C12368 extends AbstractDialogInterfaceOnClickListenerC14580 {

    /* JADX INFO: renamed from: ֫֫ */
    public final /* synthetic */ DialogInterfaceC2564 f34507;

    /* JADX INFO: renamed from: ۟ */
    public final /* synthetic */ C15957 f34508;

    /* JADX INFO: renamed from: ۧ֫ */
    public final /* synthetic */ View f34509;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12368(C15957 c15957, Main main, DialogInterfaceC2564 dialogInterfaceC2564, View view) {
        super(main, -1);
        this.f34508 = c15957;
        this.f34507 = dialogInterfaceC2564;
        this.f34509 = view;
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC14580
    /* JADX INFO: renamed from: ᩴ */
    public final void mo4537() {
        String strM33346 = m33346();
        if (strM33346.isEmpty()) {
            m33348();
            return;
        }
        try {
            int i = Integer.parseInt(strM33346);
            if (i < 0) {
                throw new NumberFormatException();
            }
            m33348();
            while (C15957.f46182.size() > i) {
                C15957.f46182.remove(C15957.f46182.size() - 1);
            }
            C15957.m36244();
            this.f34507.dismiss();
            boolean zIsEmpty = C15957.f46182.isEmpty();
            C15957 c15957 = this.f34508;
            if (zIsEmpty) {
                c15957.f46192.setEnabled(false);
            } else {
                c15957.m36218(this.f34509);
            }
        } catch (NumberFormatException unused) {
            m33349(R.string.MT_Protector);
        }
    }
}
