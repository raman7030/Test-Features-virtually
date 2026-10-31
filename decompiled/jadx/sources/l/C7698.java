package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.۟᩶ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5LN */
/* JADX INFO: loaded from: classes3.dex */
public final class C7698 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C16415 f23779;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17079 f23780;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14298 f23781;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public TextView f23782;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC0206 f23783;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public TextView f23784;

    public C7698(C14298 c14298, C17079 c17079) {
        this.f23781 = c14298;
        this.f23780 = c17079;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        C14298 c14298 = this.f23781;
        View viewM10216 = c14298.f43107.m39056().m10216(R.layout.MT_Protector);
        this.f23782 = (TextView) viewM10216.findViewById(R.id.textView1);
        this.f23784 = (TextView) viewM10216.findViewById(R.id.textView2);
        int i = 1;
        this.f23782.setText(C4925.m14306(R.string.MT_Protector, 0));
        C16415 c16415 = new C16415(c14298.f43098.mo6007(), c14298.f43107.m39020());
        this.f23779 = c16415;
        if (c16415.f50494.equals("/")) {
            this.f23784.setText("/");
        } else {
            this.f23784.setText("./");
        }
        viewM10216.findViewById(R.id.MT_Protector).setOnClickListener(new ViewOnClickListenerC12303(i, this.f23780));
        C19258 c19258BuildDialog = c14298.f43107.m39056().buildDialog();
        c19258BuildDialog.m44428(false);
        c19258BuildDialog.m44421(viewM10216);
        this.f23783 = c19258BuildDialog.m44438();
        c14298.f43107.m39056().m118(true);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        C14298 c14298 = this.f23781;
        C14047 c14047 = new C14047(this);
        try {
            List list = c14298.f43109;
            C17079 c17079 = this.f23780;
            if (list != null) {
                c17079.m40092(c14298.f43098.mo6020(), c14298.f43109, c14047);
            } else {
                c17079.m40091(c14298.f43098.mo6020(), this.f23779.f50494, c14047, c14298.f43095);
            }
        } finally {
            this.f23779.m38677();
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        boolean zIsEmpty = this.f23779.f50492.isEmpty();
        C14298 c14298 = this.f23781;
        if (!zIsEmpty) {
            C14298.m34099(c14298.f43107, c14298.f43110, this.f23779);
        } else {
            C21374.m48457(R.string.MT_Protector);
        }
        if (!this.f23779.f50492.isEmpty() || c14298.f43109 == null) {
            c14298.f43110.mo13540(this.f23779);
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f23781.f43107.m39056().m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        this.f23783.dismiss();
        this.f23781.f43107.m39056().m118(false);
    }
}
