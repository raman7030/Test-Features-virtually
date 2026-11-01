package p067l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import bin.p000mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.۟᩶ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5LN */
/* JADX INFO: loaded from: classes3.dex */
public final class C9685 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public C17969 f26692;

    /* JADX INFO: renamed from: ۡ */
    public final /* synthetic */ C18600 f26693;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ C15957 f26694;

    /* JADX INFO: renamed from: ܳ */
    public TextView f26695;

    /* JADX INFO: renamed from: ᩷ */
    public DialogInterfaceC2564 f26696;

    /* JADX INFO: renamed from: ᩻ */
    public TextView f26697;

    public C9685(C15957 c15957, C18600 c18600) {
        this.f26694 = c15957;
        this.f26693 = c18600;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        C15957 c15957 = this.f26694;
        View viewM12252 = c15957.f46199.m41282().m12252(R.layout.MT_Protector);
        this.f26695 = (TextView) viewM12252.findViewById(R.id.textView1);
        this.f26697 = (TextView) viewM12252.findViewById(R.id.textView2);
        int i = 1;
        this.f26695.setText(C7050.m16203(R.string.MT_Protector, 0));
        C17969 c17969 = new C17969(c15957.f46190.mo8204(), c15957.f46199.m41246());
        this.f26692 = c17969;
        if (c17969.f53666.equals("/")) {
            this.f26697.setText("/");
        } else {
            this.f26697.setText("./");
        }
        viewM12252.findViewById(R.id.MT_Protector).setOnClickListener(new ViewOnClickListenerC14061(i, this.f26693));
        C20671 c20671BuildDialog = c15957.f46199.m41282().buildDialog();
        c20671BuildDialog.m46722(false);
        c20671BuildDialog.m46715(viewM12252);
        this.f26696 = c20671BuildDialog.m46732();
        c15957.f46199.m41282().m116(true);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        C15957 c15957 = this.f26694;
        C15719 c15719 = new C15719(this);
        try {
            List list = c15957.f46201;
            C18600 c18600 = this.f26693;
            if (list != null) {
                c18600.m42337(c15957.f46190.mo8217(), c15957.f46201, c15719);
            } else {
                c18600.m42336(c15957.f46190.mo8217(), this.f26692.f53666, c15719, c15957.f46187);
            }
        } finally {
            this.f26692.m40893();
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        boolean zIsEmpty = this.f26692.f53664.isEmpty();
        C15957 c15957 = this.f26694;
        if (!zIsEmpty) {
            C15957.m36232(c15957.f46199, c15957.f46202, this.f26692);
        } else {
            C22682.m50793(R.string.MT_Protector);
        }
        if (!this.f26692.f53664.isEmpty() || c15957.f46201 == null) {
            c15957.f46202.mo15431(this.f26692);
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f26694.f46199.m41282().m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        this.f26696.dismiss();
        this.f26694.f46199.m41282().m116(false);
    }
}
