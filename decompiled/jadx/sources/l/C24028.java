package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.᩻᩻ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: K14B */
/* JADX INFO: loaded from: classes.dex */
public final class C24028 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f77850;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16266 f77851;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC17169 f77852;

    public C24028(C16266 c16266, ActivityC17169 activityC17169, String str) {
        this.f77851 = c16266;
        this.f77852 = activityC17169;
        this.f77850 = str;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20267(this.f77852, R.string.MT_Protector);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() throws IOException {
        OutputStream outputStreamMo23555 = C16999.m39866(this.f77850, new String[0]).mo23555(false);
        try {
            this.f77851.f50035.m17977(outputStreamMo23555);
            if (outputStreamMo23555 != null) {
                outputStreamMo23555.close();
            }
        } catch (Throwable th) {
            if (outputStreamMo23555 != null) {
                try {
                    outputStreamMo23555.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        C21374.m48457(R.string.MT_Protector);
        C14463.m34554(this.f77850, true);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f77852.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}
