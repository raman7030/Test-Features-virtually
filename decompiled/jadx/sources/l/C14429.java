package l;

import android.content.DialogInterface;
import android.view.View;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܳۡ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: R7YU */
/* JADX INFO: loaded from: classes4.dex */
public final class C14429 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f44227;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC6669 f44228;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f44229;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC0206 f44230;

    public C14429(View view, ActivityC6669 activityC6669, DialogInterfaceC0206 dialogInterfaceC0206, String str) {
        this.f44228 = activityC6669;
        this.f44229 = str;
        this.f44230 = dialogInterfaceC0206;
        this.f44227 = view;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20267(this.f44228, R.string.MT_Protector);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() throws C14501 {
        ActivityC6669 activityC6669 = this.f44228;
        C23881 c23881M7784 = C2405.m7784(this.f44229, activityC6669.f20723.f76511);
        if (c23881M7784.m52607()) {
            return;
        }
        if (activityC6669.f20723.f76511) {
            throw new C14501(C1575.m5392(c23881M7784, R.string.MT_Protector));
        }
        throw new C14501(C1575.m5392(c23881M7784, R.string.MT_Protector));
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        C4925.m14316(new Runnable() { // from class: l.ܿۡ᩷
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC6669 activityC6669 = this.f52886.f44228;
                Main mainM36593 = C15528.m36593();
                if (mainM36593 != null) {
                    mainM36593.m10218(R.string.MT_Protector, activityC6669.f20723.f76513, false);
                } else {
                    C21374.m48464(activityC6669.f20723.f76513);
                }
            }
        }, 1000L);
        this.f44230.dismiss();
        C2405.m7823();
        this.f44228.finish();
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f44227.setEnabled(true);
        this.f44228.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}
