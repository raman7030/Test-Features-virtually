package l;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܿۤܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964K */
/* JADX INFO: loaded from: classes5.dex */
public final class C17289 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC15440 f52978;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Bitmap f52979;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceOnClickListenerC19407 f52980;

    public C17289(DialogInterfaceOnClickListenerC19407 dialogInterfaceOnClickListenerC19407, AbstractC15440 abstractC15440) {
        this.f52980 = dialogInterfaceOnClickListenerC19407;
        this.f52978 = abstractC15440;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        DialogInterfaceOnClickListenerC19407 dialogInterfaceOnClickListenerC19407 = this.f52980;
        m20267(dialogInterfaceOnClickListenerC19407.f62792.m39056(), R.string.MT_Protector);
        this.f52979 = DialogInterfaceOnClickListenerC19407.m44690(dialogInterfaceOnClickListenerC19407.f62796.m12090());
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        DialogInterfaceOnClickListenerC19407 dialogInterfaceOnClickListenerC19407 = this.f52980;
        C18090 c18090 = new C18090(dialogInterfaceOnClickListenerC19407.f62788);
        try {
            try {
                C8918 c8918 = new C8918(this.f52978);
                try {
                    c8918.m23012("icon.png");
                    this.f52979.compress(Bitmap.CompressFormat.PNG, 90, c8918.m23007());
                    if (dialogInterfaceOnClickListenerC19407.f62796.m12093() != 0) {
                        C12534 c12534 = new C12534(0, new C23326(c18090.m42193(c18090.m42211("resources.arsc"), (C19277) null)));
                        C9028 c9028M23280 = C9028.m23280();
                        DialogInterfaceOnClickListenerC19407.m44694(c18090, c8918, c12534, dialogInterfaceOnClickListenerC19407.f62796.m12093(), false, c9028M23280);
                        if (c9028M23280.mo14956() != 0) {
                            c8918.m23012("resources.arsc");
                            c9028M23280.m23282(c8918.m23007());
                        }
                        c8918.close();
                        c18090.close();
                        return;
                    }
                    c8918.close();
                    c18090.close();
                    return;
                } catch (Throwable th) {
                    try {
                        c8918.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                c18090.close();
                throw th3;
            }
            c18090.close();
        } catch (Throwable th4) {
            th3.addSuppressed(th4);
        }
        throw th3;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        DialogInterfaceOnClickListenerC19407 dialogInterfaceOnClickListenerC19407 = this.f52980;
        dialogInterfaceOnClickListenerC19407.f62789.dismiss();
        dialogInterfaceOnClickListenerC19407.f62792.m39005(this.f52978);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f52980.f62792.m39056().m10223(exc, (DialogInterface.OnDismissListener) null);
        this.f52978.mo23552();
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        m20273();
        C15528.m36596();
    }
}
