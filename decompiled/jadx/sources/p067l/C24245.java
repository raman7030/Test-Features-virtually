package p067l;

import android.content.DialogInterface;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩺۬᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 81ID */
/* JADX INFO: loaded from: classes.dex */
public final class C24245 extends AbstractC9542 {

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ C15527 f76831;

    public C24245(C15527 c15527) {
        this.f76831 = c15527;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22242(this.f76831.f44364.f9055);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() throws IOException {
        InterfaceC14770 interfaceC14770Edit = ApplicationC21448.f67649.edit();
        C15527 c15527 = this.f76831;
        interfaceC14770Edit.putString("dex_backup_name", c15527.m33346()).apply();
        C4110 c4110 = c15527.f44364;
        c4110.f9054.m48753(c15527.m33346());
        c4110.f9052 = c4110.f9054.m48752();
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        C15527 c15527 = this.f76831;
        c15527.m33348();
        C4110 c4110 = c15527.f44364;
        c4110.f9056.notifyDataSetChanged();
        c4110.f9053.m3862();
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f76831.f44364.f9055.m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        m22249();
    }
}
