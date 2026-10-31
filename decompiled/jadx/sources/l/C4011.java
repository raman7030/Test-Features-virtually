package l;

import android.content.DialogInterface;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۘܳ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: OAHZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C4011 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2450 f12732;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC3163 f12733;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f12734;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f12735;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f12736;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Main f12737;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f12738;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f12739;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractDialogInterfaceOnClickListenerC12849 f12740;

    public C4011(Main main, int i, String str, AbstractC3163 abstractC3163, String str2, String str3, C2450 c2450, String str4, AbstractDialogInterfaceOnClickListenerC12849 abstractDialogInterfaceOnClickListenerC12849) {
        this.f12737 = main;
        this.f12738 = i;
        this.f12735 = str;
        this.f12733 = abstractC3163;
        this.f12739 = str2;
        this.f12736 = str3;
        this.f12732 = c2450;
        this.f12734 = str4;
        this.f12740 = abstractDialogInterfaceOnClickListenerC12849;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20267(this.f12737, R.string.MT_Protector);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() throws Exception {
        String str = this.f12735;
        String str2 = this.f12736;
        String str3 = this.f12739;
        AbstractC3163 abstractC3163 = this.f12733;
        int i = this.f12738;
        if (i == 0) {
            String strM24393 = C9523.m24393(str, System.currentTimeMillis() + ".tmp");
            abstractC3163.mo9684(str3, strM24393);
            try {
                abstractC3163.mo9684(str2, str3);
                abstractC3163.mo9684(strM24393, str2);
                return;
            } catch (Exception e) {
                try {
                    abstractC3163.mo9684(strM24393, str3);
                } catch (Exception unused) {
                }
                throw e;
            }
        }
        if (i == 1) {
            String strM24394 = C9523.m24393(str, System.currentTimeMillis() + ".tmp");
            abstractC3163.mo9684(str3, strM24394);
            try {
                abstractC3163.mo9684(str2, str3);
                abstractC3163.mo9701(strM24394, false);
                return;
            } catch (Exception e2) {
                try {
                    abstractC3163.mo9684(strM24394, str3);
                } catch (Exception unused2) {
                }
                throw e2;
            }
        }
        if (i != 2) {
            return;
        }
        String strMo9709 = abstractC3163.mo9709(str3 + ".bak");
        abstractC3163.mo9684(str3, strMo9709);
        try {
            abstractC3163.mo9684(str2, str3);
        } catch (Exception e3) {
            try {
                abstractC3163.mo9684(strMo9709, str3);
            } catch (Exception unused3) {
            }
            throw e3;
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        this.f12732.m7920(this.f12734);
        this.f12740.m31262();
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f12737.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        m20273();
        this.f12732.m7905();
        C15528.m36595(this.f12733.mo9688());
    }
}
