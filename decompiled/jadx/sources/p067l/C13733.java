package p067l;

import android.os.Bundle;
import bin.p000mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۨ᩷ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 61L9 */
/* JADX INFO: loaded from: classes.dex */
public final class C13733 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۢᩳ᩶, reason: not valid java name and contains not printable characters */
    private static final short[] f82163;

    /* JADX INFO: renamed from: ֡ */
    public final /* synthetic */ String f38808;

    /* JADX INFO: renamed from: ۖ */
    public final /* synthetic */ int f38809;

    /* JADX INFO: renamed from: ۘ */
    public final /* synthetic */ boolean f38810;

    /* JADX INFO: renamed from: ۚ */
    public final /* synthetic */ Bundle f38811;

    /* JADX INFO: renamed from: ۜ */
    public C13083 f38812;

    /* JADX INFO: renamed from: ۡ */
    public final /* synthetic */ ActivityC4030 f38813;

    /* JADX INFO: renamed from: ۢ */
    public boolean f38814 = true;

    /* JADX INFO: renamed from: ܳ */
    public C21089 f38815;

    /* JADX INFO: renamed from: ܺ */
    public final /* synthetic */ ArrayList f38816;

    /* JADX INFO: renamed from: ᩴ */
    public final /* synthetic */ boolean f38817;

    /* JADX INFO: renamed from: ᩵ */
    public final /* synthetic */ byte[] f38818;

    /* JADX INFO: renamed from: ᩷ */
    public final C11084 f38819;

    /* JADX INFO: renamed from: ᩻ */
    public C13083 f38820;

    static {
        ApplicationC14266.m56479(95);
        f82163 = new short[]{3964, 18965, 19038, 19035, 19022, 19035, 18964, 18955, 18964, 18952};
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public native void mo3403(Exception exc);

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public native void mo3405();

    public C13733(ActivityC4030 activityC4030, boolean z, boolean z2, byte[] bArr, String str, int i, ArrayList arrayList, Bundle bundle) {
        this.f38813 = activityC4030;
        this.f38810 = z;
        this.f38817 = z2;
        this.f38818 = bArr;
        this.f38808 = str;
        this.f38809 = i;
        this.f38816 = arrayList;
        this.f38811 = bundle;
        this.f38819 = C11084.m25530(activityC4030);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [l.ۙ᩷ᩳ] */
    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        ActivityC4030 activityC4030 = this.f38813;
        activityC4030.f8822 = true;
        activityC4030.f8840.m22056();
        m22247(activityC4030, this.f38819, (RunnableC7027) new Runnable() { // from class: l.ۙ᩷ᩳ
            @Override // java.lang.Runnable
            public final void run() {
                C13733.m31288(this.f18312);
            }
        });
        if (this.f38810) {
            return;
        }
        activityC4030.f8831.m13667(activityC4030.f8843.f43810, activityC4030.f8828.f43810);
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ void m31288(C13733 c13733) {
        C14853 c14853 = c13733.f26234;
        C9471 c9471 = c13733.f38813.f8840;
        C12826.requireNonNull(c9471);
        c14853.m33952(new RunnableC8368(0, c9471));
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        String string;
        String str;
        if (this.f38819.m25532()) {
            boolean zM31287 = m31287();
            ActivityC4030 activityC4030 = this.f38813;
            if (zM31287) {
                activityC4030.finish();
                return;
            }
            if (this.f38820 != null && this.f38812 != null) {
                activityC4030.f8840.m22064();
                activityC4030.f8833 = this.f38820.f36778;
                activityC4030.f8841 = this.f38812.f36778;
                C14146 c14146M22071 = activityC4030.f8840.m22071();
                c14146M22071.m32520(false);
                c14146M22071.m32367();
                C14146 c14146M22052 = activityC4030.f8840.m22052();
                c14146M22052.m32520(false);
                c14146M22052.m32367();
                activityC4030.f8840.m22054();
                activityC4030.m8066();
                C14281 c14281 = activityC4030.f8833.f76966;
                C14281 c14282 = activityC4030.f8841.f76966;
                if (C24414.m53850() && (c14281 != null || c14282 != null)) {
                    if ((c14281 != null && c14281.m32841() == null) || (c14282 != null && c14282.m32841() == null)) {
                        string = activityC4030.getString(R.string.MT_Protector);
                        str = "arsc_not_found";
                    } else if (((activityC4030.f8833.f76967 > 0 && c14281 != null && c14281.m32847()) || (activityC4030.f8841.f76967 > 0 && c14282 != null && c14282.m32847())) && ActivityC17874.m40645()) {
                        string = activityC4030.getString(R.string.MT_Protector);
                        str = "arsc_confused";
                    }
                    DialogInterfaceOnClickListenerC12648.m29080(activityC4030, str, string, false);
                }
                if (activityC4030.f8833.m53634()) {
                    for (int i = 0; i < activityC4030.f8833.f76967; i += activityC4030.f8833.f76967) {
                        activityC4030.f8840.m22071().m32407(new C20318(activityC4030, activityC4030.f8833.f76966, activityC4030.f8833.f76970));
                    }
                } else {
                    activityC4030.f8840.m22071().m32492(activityC4030.f8831.m13682());
                }
                if (activityC4030.f8841.m53634()) {
                    for (int i2 = 0; i2 < activityC4030.f8841.f76967; i2 += activityC4030.f8841.f76967) {
                        activityC4030.f8840.m22052().m32407(new C20318(activityC4030, activityC4030.f8841.f76966, activityC4030.f8841.f76970));
                    }
                } else {
                    activityC4030.f8840.m22052().m32492(activityC4030.f8831.m13680());
                }
            }
            if (this.f38811 != null) {
                activityC4030.f8840.m22071().m32469();
                activityC4030.f8840.m22052().m32469();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۜ */
    public boolean m31287() {
        C14853 c14853 = this.f26234;
        ActivityC4030 activityC4030 = this.f38813;
        if (activityC4030.f8840.m22071().m32557() || activityC4030.f8840.m22052().m32557()) {
            return true;
        }
        return c14853 != null && c14853.m33960();
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        ActivityC4030 activityC4030 = this.f38813;
        activityC4030.f8840.m22066();
        m22249();
        C21089 c21089 = this.f38815;
        if (c21089 != null) {
            c21089.m47686();
        }
        if (this.f38819.m25532()) {
            activityC4030.f8826.m39760((activityC4030.f8833 != null && activityC4030.f8833.m53634()) || (activityC4030.f8841 != null && activityC4030.f8841.m53634()));
            C14146 c14146M22070 = activityC4030.f8840.m22070();
            activityC4030.f8826.m39764(c14146M22070.m32360());
            activityC4030.f8826.m39743(c14146M22070.m32447());
            if (!activityC4030.f8832) {
                activityC4030.f8826.m39750(activityC4030.f8840.m22051());
            }
            activityC4030.f8826.m39742(activityC4030.f8840.m22071().m32361());
            activityC4030.f8826.m39762(activityC4030.f8840.m22052().m32361());
            activityC4030.f8831.m13675();
            ActivityC4030.m8042(activityC4030, this.f38809);
            activityC4030.f8822 = false;
        }
    }
}
