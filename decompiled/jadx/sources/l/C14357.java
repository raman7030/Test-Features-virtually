package l;

import android.R;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ܳۜۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 98W2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14357 extends AbstractC15768 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String f43291;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f43292;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f43293;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC15768 f43294;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC15768 f43295;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f43296;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f43297;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final AbstractC15768 f43298;

    public C14357(C12951 c12951) {
        super(5);
        this.f43297 = c12951.m31506();
        this.f43292 = c12951.m31506();
        if (c12951.m31498()) {
            this.f43291 = c12951.m31506();
            this.f43298 = c12951.m31498() ? AbstractC15768.m37179(c12951) : null;
        } else {
            this.f43291 = null;
            this.f43298 = null;
        }
        if (c12951.m31498()) {
            this.f43296 = c12951.m31506();
            this.f43294 = c12951.m31498() ? AbstractC15768.m37179(c12951) : null;
        } else {
            this.f43296 = null;
            this.f43294 = null;
        }
        if (c12951.m31498()) {
            this.f43293 = c12951.m31506();
            this.f43295 = c12951.m31498() ? AbstractC15768.m37179(c12951) : null;
        } else {
            this.f43293 = null;
            this.f43295 = null;
        }
    }

    @Override // l.AbstractC15768
    /* JADX INFO: renamed from: ֫ */
    public final void mo5599(AbstractActivityC3346 abstractActivityC3346) {
        C19258 c19258BuildDialog = abstractActivityC3346.buildDialog();
        c19258BuildDialog.m44436(this.f43297);
        c19258BuildDialog.m44424("");
        String str = this.f43291;
        if (str != null) {
            c19258BuildDialog.m44441(str, new DialogInterfaceOnClickListenerC11543(5, this, abstractActivityC3346));
        }
        String str2 = this.f43296;
        if (str2 != null) {
            c19258BuildDialog.m44425(str2, new DialogInterfaceOnClickListenerC16474(0, this, abstractActivityC3346));
        }
        String str3 = this.f43293;
        if (str3 != null) {
            c19258BuildDialog.m44437(str3, new DialogInterfaceOnClickListenerC17886(0, this, abstractActivityC3346));
        }
        DialogInterfaceC0206 dialogInterfaceC0206M44438 = c19258BuildDialog.m44438();
        C8960.m23097(dialogInterfaceC0206M44438);
        TextView textView = (TextView) dialogInterfaceC0206M44438.m1433(R.id.message);
        textView.setLineSpacing(C11266.m27878(2.0f), 1.0f);
        textView.setTextIsSelectable(true);
        InterfaceC9103 interfaceC9103M38086 = AbstractC16157.m38086(abstractActivityC3346);
        interfaceC9103M38086.mo8505(new C17180(true).m46968());
        interfaceC9103M38086.build().mo38090(textView, this.f43292);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m34261(C14357 c14357, AbstractActivityC3346 abstractActivityC3346) {
        AbstractC15768 abstractC15768 = c14357.f43298;
        if (abstractC15768 != null) {
            abstractC15768.mo5599(abstractActivityC3346);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m34260(C14357 c14357, AbstractActivityC3346 abstractActivityC3346) {
        AbstractC15768 abstractC15768 = c14357.f43294;
        if (abstractC15768 != null) {
            abstractC15768.mo5599(abstractActivityC3346);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m34259(C14357 c14357, AbstractActivityC3346 abstractActivityC3346) {
        AbstractC15768 abstractC15768 = c14357.f43295;
        if (abstractC15768 != null) {
            abstractC15768.mo5599(abstractActivityC3346);
        }
    }
}
