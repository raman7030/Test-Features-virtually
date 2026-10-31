package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܳۡ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: TAIM */
/* JADX INFO: loaded from: classes4.dex */
public final class C14430 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f44231;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16560 f44232;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f44233;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C10917 f44234;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f44235;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5259 f44236;

    public C14430(C5259 c5259, C16560 c16560, String str, boolean z, String str2) {
        this.f44236 = c5259;
        this.f44232 = c16560;
        this.f44233 = str;
        this.f44231 = z;
        this.f44235 = str2;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        this.f44234 = this.f44232.m39027();
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() throws C14501, IOException {
        C5259 c5259 = this.f44236;
        AbstractC3163 abstractC3163Mo6020 = c5259.mo6020();
        String str = this.f44233;
        if (abstractC3163Mo6020.mo9703(str)) {
            throw new C14501(R.string.MT_Protector);
        }
        if (this.f44231) {
            c5259.mo6020().mo9702(str);
        } else {
            c5259.mo6020().mo9693(0L, str).close();
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        this.f44232.m39053(this.f44235);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f44232.m39056().m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        this.f44234.m27224();
        C15528.m36595(this.f44236.mo6020().mo9688());
    }
}
