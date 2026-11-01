package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.᩻᩻ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: K14B */
/* JADX INFO: loaded from: classes.dex */
public final class C25205 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ String f80602;

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ C17828 f80603;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ ActivityC18686 f80604;

    public C25205(C17828 c17828, ActivityC18686 activityC18686, String str) {
        this.f80603 = c17828;
        this.f80604 = activityC18686;
        this.f80602 = str;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22243(this.f80604, R.string.MT_Protector);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() throws IOException {
        OutputStream outputStreamMo25506 = C18524.m42109(this.f80602, new String[0]).mo25506(false);
        try {
            this.f80603.f53203.m19925(outputStreamMo25506);
            if (outputStreamMo25506 != null) {
                outputStreamMo25506.close();
            }
        } catch (Throwable th) {
            if (outputStreamMo25506 != null) {
                try {
                    outputStreamMo25506.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        C22682.m50793(R.string.MT_Protector);
        C16114.m36688(this.f80602, true);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f80604.m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        m22249();
    }
}
