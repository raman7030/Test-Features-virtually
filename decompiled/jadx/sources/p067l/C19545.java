package p067l;

import android.content.DialogInterface;
import android.widget.Spinner;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.ᩳ۬ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5PI */
/* JADX INFO: loaded from: classes5.dex */
public final class C19545 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ Main f59499;

    /* JADX INFO: renamed from: ۡ */
    public final /* synthetic */ Spinner f59500;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ C0990 f59501;

    /* JADX INFO: renamed from: ܳ */
    public C24164 f59502;

    /* JADX INFO: renamed from: ܺ */
    public final /* synthetic */ C18107 f59503;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ C0990 f59504;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ C10828 f59505;

    public C19545(C10828 c10828, Spinner spinner, Main main, C0990 c0990, C0990 c0991, C18107 c18107) {
        this.f59505 = c10828;
        this.f59500 = spinner;
        this.f59499 = main;
        this.f59504 = c0990;
        this.f59501 = c0991;
        this.f59503 = c18107;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        ApplicationC21448.f67649.edit().mo27875(this.f59500.getSelectedItemPosition(), "dex_fixer_dex_version");
        C24164 c24164 = new C24164(this.f59499);
        c24164.mo51878((Runnable) null);
        c24164.m53440(R.string.MT_Protector);
        c24164.m53429(R.string.MT_Protector);
        c24164.mo51883();
        this.f59502 = c24164;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        C18203 c18203 = new C18203(this);
        C10828 c10828 = this.f59505;
        c10828.f29994 = c18203;
        C10828.m24948(c10828.f29993, c10828.f29995, this.f59500.getSelectedItemPosition(), this.f59504.isChecked(), this.f59501.isChecked(), c10828.f29994);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() throws IOException {
        boolean zM53444 = this.f59502.m53444();
        C10828 c10828 = this.f59505;
        if (zM53444) {
            c10828.f29995.mo25503();
            return;
        }
        if (ApplicationC21448.f67649.getBoolean("dfb", true)) {
            c10828.f29993.m38687();
        } else {
            c10828.f29993.mo29990();
        }
        c10828.f29995.m38656(c10828.f29993, (Runnable) null);
        this.f59503.m41279(c10828.f29993.getName());
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        boolean zIsChecked = this.f59501.isChecked();
        Main main = this.f59499;
        if (!zIsChecked) {
            for (Throwable cause = exc; cause != null; cause = cause.getCause()) {
                String message = cause.getMessage();
                if (message != null && message.contains("Invalid element width")) {
                    exc = new Exception(main.getString(R.string.MT_Protector, main.getString(R.string.MT_Protector)), exc);
                    break;
                }
            }
        }
        main.m12259(exc, (DialogInterface.OnDismissListener) null);
        this.f59505.f29995.mo25503();
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        this.f59502.m53442();
        C17127.m38756();
    }
}
