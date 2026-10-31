package l;

import android.content.DialogInterface;
import android.widget.Spinner;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.ᩳ۬ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5PI */
/* JADX INFO: loaded from: classes5.dex */
public final class C18073 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Main f56294;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Spinner f56295;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2978 f56296;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C22933 f56297;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16560 f56298;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2978 f56299;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8901 f56300;

    public C18073(C8901 c8901, Spinner spinner, Main main, C2978 c2978, C2978 c2979, C16560 c16560) {
        this.f56300 = c8901;
        this.f56295 = spinner;
        this.f56294 = main;
        this.f56299 = c2978;
        this.f56296 = c2979;
        this.f56298 = c16560;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        ApplicationC20075.f65008.edit().mo25853(this.f56295.getSelectedItemPosition(), "dex_fixer_dex_version");
        C22933 c22933 = new C22933(this.f56294);
        c22933.mo49542((Runnable) null);
        c22933.m51049(R.string.MT_Protector);
        c22933.m51038(R.string.MT_Protector);
        c22933.mo49547();
        this.f56297 = c22933;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        C16661 c16661 = new C16661(this);
        C8901 c8901 = this.f56300;
        c8901.f27071 = c16661;
        C8901.m22977(c8901.f27070, c8901.f27072, this.f56295.getSelectedItemPosition(), this.f56299.isChecked(), this.f56296.isChecked(), c8901.f27071);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() throws IOException {
        boolean zM51053 = this.f56297.m51053();
        C8901 c8901 = this.f56300;
        if (zM51053) {
            c8901.f27072.mo23552();
            return;
        }
        if (ApplicationC20075.f65008.getBoolean("dfb", true)) {
            c8901.f27070.m36529();
        } else {
            c8901.f27070.mo27929();
        }
        c8901.f27072.m36498(c8901.f27070, (Runnable) null);
        this.f56298.m39053(c8901.f27070.getName());
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        boolean zIsChecked = this.f56296.isChecked();
        Main main = this.f56294;
        if (!zIsChecked) {
            for (Throwable cause = exc; cause != null; cause = cause.getCause()) {
                String message = cause.getMessage();
                if (message != null && message.contains("Invalid element width")) {
                    exc = new Exception(main.getString(R.string.MT_Protector, main.getString(R.string.MT_Protector)), exc);
                    break;
                }
            }
        }
        main.m10223(exc, (DialogInterface.OnDismissListener) null);
        this.f56300.f27072.mo23552();
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        this.f56297.m51051();
        C15528.m36596();
    }
}
