package p067l;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import bin.p000mt.plus.R;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ܳۤܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964K */
/* JADX INFO: loaded from: classes4.dex */
public final class C16117 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ AbstractC17043 f47430;

    /* JADX INFO: renamed from: ܳ */
    public Bitmap f47431;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ int f47432;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ DialogInterfaceOnClickListenerC20813 f47433;

    public C16117(DialogInterfaceOnClickListenerC20813 dialogInterfaceOnClickListenerC20813, AbstractC17043 abstractC17043, int i) {
        this.f47433 = dialogInterfaceOnClickListenerC20813;
        this.f47430 = abstractC17043;
        this.f47432 = i;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        DialogInterfaceOnClickListenerC20813 dialogInterfaceOnClickListenerC20813 = this.f47433;
        m22243(dialogInterfaceOnClickListenerC20813.f65402.m41282(), R.string.MT_Protector);
        this.f47431 = DialogInterfaceOnClickListenerC20813.m46984(dialogInterfaceOnClickListenerC20813.f65406.m14010());
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() throws IOException {
        OutputStream outputStreamMo25506 = this.f47430.mo25506(false);
        try {
            int i = this.f47432;
            if (i == 1) {
                this.f47431.compress(Bitmap.CompressFormat.PNG, 90, outputStreamMo25506);
            } else if (i == 2) {
                this.f47431.compress(Bitmap.CompressFormat.WEBP, 90, outputStreamMo25506);
            }
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
        DialogInterfaceOnClickListenerC20813 dialogInterfaceOnClickListenerC20813 = this.f47433;
        dialogInterfaceOnClickListenerC20813.f65399.dismiss();
        dialogInterfaceOnClickListenerC20813.f65402.m41231(this.f47430);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f47433.f65402.m41282().m12259(exc, (DialogInterface.OnDismissListener) null);
        this.f47430.mo25503();
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        m22249();
        C17127.m38756();
    }
}
