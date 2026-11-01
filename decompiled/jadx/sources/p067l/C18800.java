package p067l;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ܿۤܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964K */
/* JADX INFO: loaded from: classes5.dex */
public final class C18800 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ AbstractC17043 f56160;

    /* JADX INFO: renamed from: ܳ */
    public Bitmap f56161;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ DialogInterfaceOnClickListenerC20813 f56162;

    public C18800(DialogInterfaceOnClickListenerC20813 dialogInterfaceOnClickListenerC20813, AbstractC17043 abstractC17043) {
        this.f56162 = dialogInterfaceOnClickListenerC20813;
        this.f56160 = abstractC17043;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        DialogInterfaceOnClickListenerC20813 dialogInterfaceOnClickListenerC20813 = this.f56162;
        m22243(dialogInterfaceOnClickListenerC20813.f65402.m41282(), R.string.MT_Protector);
        this.f56161 = DialogInterfaceOnClickListenerC20813.m46984(dialogInterfaceOnClickListenerC20813.f65406.m14010());
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        DialogInterfaceOnClickListenerC20813 dialogInterfaceOnClickListenerC20813 = this.f56162;
        C19561 c19561 = new C19561(dialogInterfaceOnClickListenerC20813.f65398);
        try {
            try {
                C10844 c10844 = new C10844(this.f56160);
                try {
                    c10844.m24986("icon.png");
                    this.f56161.compress(Bitmap.CompressFormat.PNG, 90, c10844.m24981());
                    if (dialogInterfaceOnClickListenerC20813.f65406.m14013() != 0) {
                        C14281 c14281 = new C14281(0, new C24538(c19561.m44452(c19561.m44470("resources.arsc"), (C20689) null)));
                        C10949 c10949M25224 = C10949.m25224();
                        DialogInterfaceOnClickListenerC20813.m46988(c19561, c10844, c14281, dialogInterfaceOnClickListenerC20813.f65406.m14013(), false, c10949M25224);
                        if (c10949M25224.mo16866() != 0) {
                            c10844.m24986("resources.arsc");
                            c10949M25224.m25226(c10844.m24981());
                        }
                        c10844.close();
                        c19561.close();
                        return;
                    }
                    c10844.close();
                    c19561.close();
                    return;
                } catch (Throwable th) {
                    try {
                        c10844.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                c19561.close();
                throw th3;
            }
            c19561.close();
        } catch (Throwable th4) {
            th3.addSuppressed(th4);
        }
        throw th3;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        DialogInterfaceOnClickListenerC20813 dialogInterfaceOnClickListenerC20813 = this.f56162;
        dialogInterfaceOnClickListenerC20813.f65399.dismiss();
        dialogInterfaceOnClickListenerC20813.f65402.m41231(this.f56160);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f56162.f65402.m41282().m12259(exc, (DialogInterface.OnDismissListener) null);
        this.f56160.mo25503();
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        m22249();
        C17127.m38756();
    }
}
