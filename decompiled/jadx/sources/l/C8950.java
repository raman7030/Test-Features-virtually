package l;

import android.content.DialogInterface;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۡܳ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: OAHZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C8950 extends AbstractC7548 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16004 f27198;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f27199;

    public C8950(C16004 c16004, String str) {
        this.f27198 = c16004;
        this.f27199 = str;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20267(this.f27198.f49378.m7917(), R.string.MT_Protector);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        C16004 c16004 = this.f27198;
        AbstractC3163 abstractC3163 = c16004.f49377;
        InterfaceC17889 interfaceC17889 = c16004.f49373;
        String path = interfaceC17889.getPath();
        String parent = interfaceC17889.getParent();
        String str = this.f27199;
        String strM24393 = C9523.m24393(parent, str);
        if (c16004.f49375 && str.equalsIgnoreCase(c16004.f49376)) {
            String strM24394 = C9523.m24393(interfaceC17889.getParent(), System.currentTimeMillis() + ".tmp");
            abstractC3163.mo9684(path, strM24394);
            abstractC3163.mo9684(strM24394, strM24393);
            return;
        }
        abstractC3163.mo9684(path, strM24393);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        C16004 c16004 = this.f27198;
        c16004.f49378.m7920(this.f27199);
        c16004.m31262();
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f27198.f49378.m7917().m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        m20273();
        C15528.m36595(this.f27198.f49377.mo9688());
    }
}
