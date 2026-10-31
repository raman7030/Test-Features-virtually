package l;

import android.content.DialogInterface;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۖܳ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: OAHZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C2600 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f8213;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2450 f8214;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC17889 f8215;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f8216;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC3163 f8217;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractDialogInterfaceOnClickListenerC12849 f8218;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public String f8219;

    public C2600(InterfaceC17889 interfaceC17889, C2450 c2450, AbstractC3163 abstractC3163, AbstractDialogInterfaceOnClickListenerC12849 abstractDialogInterfaceOnClickListenerC12849) {
        this.f8215 = interfaceC17889;
        this.f8214 = c2450;
        this.f8217 = abstractC3163;
        this.f8218 = abstractDialogInterfaceOnClickListenerC12849;
        String path = interfaceC17889.getPath();
        this.f8216 = path;
        this.f8219 = C15472.m36561(4, 0, path);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20267(this.f8214.m7917(), R.string.MT_Protector);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        AbstractC3163 abstractC3163 = this.f8217;
        String str = this.f8219;
        boolean zMo9703 = abstractC3163.mo9703(str);
        String str2 = this.f8216;
        if (zMo9703) {
            String strM24393 = C9523.m24393(this.f8215.getParent(), System.currentTimeMillis() + ".tmp");
            abstractC3163.mo9684(str, strM24393);
            abstractC3163.mo9684(str2, str);
            abstractC3163.mo9684(strM24393, str2);
            this.f8213 = true;
            return;
        }
        abstractC3163.mo9684(str2, str);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        this.f8218.m31262();
        String str = this.f8219;
        String strM24404 = C9523.m24404(str);
        C2450 c2450 = this.f8214;
        c2450.m7920(strM24404);
        if (this.f8213) {
            DialogInterfaceOnClickListenerC10816.m27035(c2450.m7917(), "restore_backup", C4925.m14306(R.string.MT_Protector, C9523.m24404(str)), true);
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f8214.m7917().m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        m20273();
        this.f8214.m7905();
        C15528.m36595(this.f8217.mo9688());
    }
}
