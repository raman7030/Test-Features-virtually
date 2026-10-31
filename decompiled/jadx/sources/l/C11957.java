package l;

import android.os.Bundle;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۨ᩷ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 61L9 */
/* JADX INFO: loaded from: classes.dex */
public final class C11957 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۢᩳ᩶, reason: not valid java name and contains not printable characters */
    private static final short[] f35797;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f35798;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f35799;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f35800;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Bundle f35801;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C11273 f35802;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC1748 f35803;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f35804 = true;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C19697 f35805;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f35806;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f35807;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ byte[] f35808;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C9170 f35809;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C11273 f35810;

    static {
        ApplicationC12518.m30701(95);
        f35797 = new short[]{3964, 18965, 19038, 19035, 19022, 19035, 18964, 18955, 18964, 18952};
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public native void mo1007(Exception exc);

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public native void mo1009();

    public C11957(ActivityC1748 activityC1748, boolean z, boolean z2, byte[] bArr, String str, int i, ArrayList arrayList, Bundle bundle) {
        this.f35803 = activityC1748;
        this.f35800 = z;
        this.f35807 = z2;
        this.f35808 = bArr;
        this.f35798 = str;
        this.f35799 = i;
        this.f35806 = arrayList;
        this.f35801 = bundle;
        this.f35809 = C9170.m23579(activityC1748);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [l.ۙ᩷ᩳ] */
    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        ActivityC1748 activityC1748 = this.f35803;
        activityC1748.f6046 = true;
        activityC1748.f6064.m20081();
        m20271(activityC1748, this.f35809, (RunnableC4901) new Runnable() { // from class: l.ۙ᩷ᩳ
            @Override // java.lang.Runnable
            public final void run() {
                C11957.m29234(this.f15479);
            }
        });
        if (this.f35800) {
            return;
        }
        activityC1748.f6055.m11731(activityC1748.f6067.f40729, activityC1748.f6052.f40729);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m29234(C11957 c11957) {
        C13136 c13136 = c11957.f23322;
        C7473 c7473 = c11957.f35803.f6064;
        C11003.requireNonNull(c7473);
        c13136.m31860(new RunnableC6312(0, c7473));
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        String string;
        String str;
        if (this.f35809.m23581()) {
            boolean zM29233 = m29233();
            ActivityC1748 activityC1748 = this.f35803;
            if (zM29233) {
                activityC1748.finish();
                return;
            }
            if (this.f35810 != null && this.f35802 != null) {
                activityC1748.f6064.m20089();
                activityC1748.f6057 = this.f35810.f33778;
                activityC1748.f6065 = this.f35802.f33778;
                C12392 c12392M20096 = activityC1748.f6064.m20096();
                c12392M20096.m30456(false);
                c12392M20096.m30303();
                C12392 c12392M20077 = activityC1748.f6064.m20077();
                c12392M20077.m30456(false);
                c12392M20077.m30303();
                activityC1748.f6064.m20079();
                activityC1748.m5856();
                C12534 c12534 = activityC1748.f6057.f74221;
                C12534 c12535 = activityC1748.f6065.f74221;
                if (C23196.m51454() && (c12534 != null || c12535 != null)) {
                    if ((c12534 != null && c12534.m30769() == null) || (c12535 != null && c12535.m30769() == null)) {
                        string = activityC1748.getString(R.string.MT_Protector);
                        str = "arsc_not_found";
                    } else if (((activityC1748.f6057.f74222 > 0 && c12534 != null && c12534.m30775()) || (activityC1748.f6065.f74222 > 0 && c12535 != null && c12535.m30775())) && ActivityC16315.m38430()) {
                        string = activityC1748.getString(R.string.MT_Protector);
                        str = "arsc_confused";
                    }
                    DialogInterfaceOnClickListenerC10816.m27035(activityC1748, str, string, false);
                }
                if (activityC1748.f6057.m51241()) {
                    for (int i = 0; i < activityC1748.f6057.f74222; i += activityC1748.f6057.f74222) {
                        activityC1748.f6064.m20096().m30343(new C18886(activityC1748, activityC1748.f6057.f74221, activityC1748.f6057.f74225));
                    }
                } else {
                    activityC1748.f6064.m20096().m30428(activityC1748.f6055.m11746());
                }
                if (activityC1748.f6065.m51241()) {
                    for (int i2 = 0; i2 < activityC1748.f6065.f74222; i2 += activityC1748.f6065.f74222) {
                        activityC1748.f6064.m20077().m30343(new C18886(activityC1748, activityC1748.f6065.f74221, activityC1748.f6065.f74225));
                    }
                } else {
                    activityC1748.f6064.m20077().m30428(activityC1748.f6055.m11744());
                }
            }
            if (this.f35801 != null) {
                activityC1748.f6064.m20096().m30405();
                activityC1748.f6064.m20077().m30405();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean m29233() {
        C13136 c13136 = this.f23322;
        ActivityC1748 activityC1748 = this.f35803;
        if (activityC1748.f6064.m20096().m30493() || activityC1748.f6064.m20077().m30493()) {
            return true;
        }
        return c13136 != null && c13136.m31868();
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        ActivityC1748 activityC1748 = this.f35803;
        activityC1748.f6064.m20091();
        m20273();
        C19697 c19697 = this.f35805;
        if (c19697 != null) {
            c19697.m45389();
        }
        if (this.f35809.m23581()) {
            activityC1748.f6050.m37588((activityC1748.f6057 != null && activityC1748.f6057.m51241()) || (activityC1748.f6065 != null && activityC1748.f6065.m51241()));
            C12392 c12392M20095 = activityC1748.f6064.m20095();
            activityC1748.f6050.m37592(c12392M20095.m30296());
            activityC1748.f6050.m37571(c12392M20095.m30383());
            if (!activityC1748.f6056) {
                activityC1748.f6050.m37578(activityC1748.f6064.m20076());
            }
            activityC1748.f6050.m37570(activityC1748.f6064.m20096().m30297());
            activityC1748.f6050.m37590(activityC1748.f6064.m20077().m30297());
            activityC1748.f6055.m11739();
            ActivityC1748.m5832(activityC1748, this.f35799);
            activityC1748.f6046 = false;
        }
    }
}
