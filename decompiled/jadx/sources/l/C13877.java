package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܰܳۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes4.dex */
public final class C13877 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public String f41384;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f41385;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f41386;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f41387;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC7528 f41388;

    public C13877(ViewOnClickListenerC7528 viewOnClickListenerC7528, AbstractActivityC3346 abstractActivityC3346, String str) {
        this.f41388 = viewOnClickListenerC7528;
        this.f41387 = abstractActivityC3346;
        this.f41385 = str;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20267(this.f41387, R.string.MT_Protector);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() throws C1637, IOException {
        String strM36489 = C16999.m39866(this.f41385, new String[0]).m36489();
        this.f41386 = strM36489;
        String strM7978 = AbstractC2489.m7978(strM36489);
        if (strM7978 == null) {
            throw new C1637(this.f41388.getString(R.string.MT_Protector));
        }
        this.f41384 = C15472.m36561(1, 1, strM7978);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        String strM34214 = C14336.m34214(this.f41384);
        String strM34210 = C14336.m34210(this.f41384);
        if (strM34214.length() > 130 || C11661.m28545(strM34214)) {
            strM34214 = "# TOO_LONG_NAME/";
        }
        if (strM34210.length() > 100) {
            strM34210 = strM34210.substring(0, 50) + "_too_long_" + Long.toHexString(((long) strM34210.hashCode()) & 4294967295L);
        }
        this.f41388.m20190(R.string.MT_Protector, strM34214, strM34210, true, new InterfaceC19763() { // from class: l.᩺ܳۢ
            @Override // l.InterfaceC19763
            /* JADX INFO: renamed from: ֫ */
            public final Object mo6973(Object obj, Object obj2) {
                return this.f74162.f41386;
            }
        });
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f41387.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}
