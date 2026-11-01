package p067l;

import bin.p000mt.plus.R;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.᩻ܶᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes.dex */
public final class C24972 extends AbstractC9542 {

    /* JADX INFO: renamed from: ֡ */
    public final /* synthetic */ int f79731;

    /* JADX INFO: renamed from: ֨ */
    public final /* synthetic */ String f79732;

    /* JADX INFO: renamed from: ۖ */
    public final /* synthetic */ CharSequence f79733;

    /* JADX INFO: renamed from: ۘ */
    public final /* synthetic */ boolean f79734;

    /* JADX INFO: renamed from: ۚ */
    public final /* synthetic */ String f79735;

    /* JADX INFO: renamed from: ۜ */
    public AbstractC17043 f79736;

    /* JADX INFO: renamed from: ۠ */
    public final /* synthetic */ String f79737;

    /* JADX INFO: renamed from: ۡ */
    public final /* synthetic */ ActivityC17874 f79738;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ C23631 f79739;

    /* JADX INFO: renamed from: ܳ */
    public C16434 f79740;

    /* JADX INFO: renamed from: ܺ */
    public final /* synthetic */ int f79741;

    /* JADX INFO: renamed from: ᩴ */
    public final /* synthetic */ boolean f79742;

    /* JADX INFO: renamed from: ᩵ */
    public final /* synthetic */ boolean f79743;

    /* JADX INFO: renamed from: ᩷ */
    public int f79744;

    /* JADX INFO: renamed from: ᩻ */
    public final C11084 f79745;

    public C24972(C23631 c23631, int i, InterfaceC9768 interfaceC9768, String str, ActivityC17874 activityC17874, boolean z, boolean z2, int i2, String str2, boolean z3, String str3) {
        this.f79739 = c23631;
        this.f79741 = i;
        this.f79733 = interfaceC9768;
        this.f79735 = str;
        this.f79738 = activityC17874;
        this.f79743 = z;
        this.f79742 = z2;
        this.f79731 = i2;
        this.f79737 = str2;
        this.f79734 = z3;
        this.f79732 = str3;
        this.f79745 = C11084.m25530(c23631.getViewLifecycleOwner());
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        C16434 c16434M37346;
        C24301 c24301 = new C24301(0, this.f79741, false, 0, null, null, null);
        C23631 c23631 = this.f79739;
        C13693 c13693 = c23631.f75231;
        String str = this.f79735;
        if (c13693 == null) {
            c16434M37346 = C16434.m37344(this.f79733, str, c24301, -1, null);
        } else {
            c16434M37346 = C16434.m37346(c23631.f75231, str, c24301);
        }
        this.f79740 = c16434M37346;
        m22243(this.f79738, R.string.MT_Protector);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        this.f79736 = C17853.f53280.m38693(this.f79743 ? ".mhtml" : ".html");
        synchronized (this.f79739.f75223) {
            C16434 c16434 = this.f79740;
            try {
                if (this.f79742) {
                    C15639 c15639M37348 = c16434.m37348(this.f79731);
                    this.f79744 = c15639M37348.m35532();
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(this.f79736.mo25506(false), StandardCharsets.UTF_8));
                    try {
                        C12879.m29507(c15639M37348, this.f79737, this.f79734, this.f79738.getAssets(), bufferedWriter, this.f79738.getString(R.string.MT_Protector));
                        bufferedWriter.close();
                    } catch (Throwable th) {
                        try {
                            bufferedWriter.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } else {
                    c16434.m37351(this.f79736);
                }
                if (c16434 != null) {
                    c16434.close();
                }
            } catch (Throwable th3) {
                if (c16434 != null) {
                    try {
                        c16434.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        if (this.f79745.m25532()) {
            boolean z = this.f79742;
            String str = this.f79737;
            String str2 = this.f79732;
            ActivityC17874 activityC17874 = this.f79738;
            if (z) {
                ActivityC3244.m5596(activityC17874, str2, str, this.f79736, this.f79744);
            } else {
                ActivityC3244.m5597(activityC17874, str2, str, this.f79743, this.f79736);
            }
            this.f79736 = null;
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        if (this.f79745.m25532()) {
            if (exc instanceof C4161) {
                C22682.m50793(R.string.MT_Protector);
            } else {
                this.f79739.m52484(exc, this.f79738);
            }
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        C16434 c16434 = this.f79740;
        if (c16434 != null) {
            c16434.close();
        }
        AbstractC17043 abstractC17043 = this.f79736;
        if (abstractC17043 != null) {
            abstractC17043.mo25503();
        }
        m22249();
    }
}
