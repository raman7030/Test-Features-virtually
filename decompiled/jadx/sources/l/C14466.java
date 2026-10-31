package l;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import bin.mt.plus.R;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ܳۤܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964K */
/* JADX INFO: loaded from: classes4.dex */
public final class C14466 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC15440 f44336;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Bitmap f44337;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f44338;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceOnClickListenerC19407 f44339;

    public C14466(DialogInterfaceOnClickListenerC19407 dialogInterfaceOnClickListenerC19407, AbstractC15440 abstractC15440, int i) {
        this.f44339 = dialogInterfaceOnClickListenerC19407;
        this.f44336 = abstractC15440;
        this.f44338 = i;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        DialogInterfaceOnClickListenerC19407 dialogInterfaceOnClickListenerC19407 = this.f44339;
        m20267(dialogInterfaceOnClickListenerC19407.f62792.m39056(), R.string.MT_Protector);
        this.f44337 = DialogInterfaceOnClickListenerC19407.m44690(dialogInterfaceOnClickListenerC19407.f62796.m12090());
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() throws IOException {
        OutputStream outputStreamMo23555 = this.f44336.mo23555(false);
        try {
            int i = this.f44338;
            if (i == 1) {
                this.f44337.compress(Bitmap.CompressFormat.PNG, 90, outputStreamMo23555);
            } else if (i == 2) {
                this.f44337.compress(Bitmap.CompressFormat.WEBP, 90, outputStreamMo23555);
            }
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
        DialogInterfaceOnClickListenerC19407 dialogInterfaceOnClickListenerC19407 = this.f44339;
        dialogInterfaceOnClickListenerC19407.f62789.dismiss();
        dialogInterfaceOnClickListenerC19407.f62792.m39005(this.f44336);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f44339.f62792.m39056().m10223(exc, (DialogInterface.OnDismissListener) null);
        this.f44336.mo23552();
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        m20273();
        C15528.m36596();
    }
}
