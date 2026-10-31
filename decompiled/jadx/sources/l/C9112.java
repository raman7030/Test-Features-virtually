package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۡ᩶ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 251F */
/* JADX INFO: loaded from: classes3.dex */
public final class C9112 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Pattern f27606;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C9170 f27607;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f27608;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractViewOnClickListenerC16166 f27609;

    public C9112(AbstractViewOnClickListenerC16166 abstractViewOnClickListenerC16166, Pattern pattern, String str) {
        this.f27609 = abstractViewOnClickListenerC16166;
        this.f27606 = pattern;
        this.f27608 = str;
        this.f27607 = C9170.m23579(abstractViewOnClickListenerC16166.f49801);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20267(this.f27609.f49801, R.string.MT_Protector);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        this.f27609.mo2796(this.f27606, this.f27608);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        if (this.f27607.m23581()) {
            this.f27609.mo2795();
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        if (this.f27607.m23581()) {
            this.f27609.f49801.m10223(exc, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}
