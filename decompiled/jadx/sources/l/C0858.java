package l;

import android.content.DialogInterface;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.֨ۗ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Z3WS */
/* JADX INFO: loaded from: classes2.dex */
public final class C0858 extends AbstractC7548 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7914 f3345;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f3346;

    public C0858(C7914 c7914, String str) {
        this.f3345 = c7914;
        this.f3346 = str;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20267(this.f3345.f24501, R.string.MT_Protector);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() throws C1637 {
        long jM20531 = this.f3345.f24504.m20531();
        C18237 c18237M42480 = C18237.m42480(4198);
        c18237M42480.m42484(jM20531);
        c18237M42480.m42491(this.f3346);
        C23881 c23881M42495 = c18237M42480.m42495();
        if (!c23881M42495.m52607()) {
            throw new C1637(C1575.m5392(c23881M42495, R.string.MT_Protector));
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        C7914 c7914 = this.f3345;
        c7914.m31262();
        c7914.f24503.dismiss();
        c7914.f24502.mo6161(c7914.f24501);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f3345.f24501.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}
