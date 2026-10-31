package l;

import bin.mt.plus.R;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.᩻ܶᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes.dex */
public final class C23783 extends AbstractC7548 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f76979;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f76980;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CharSequence f76981;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f76982;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f76983;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f76984;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f76985;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC16315 f76986;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22372 f76987;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C14799 f76988;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f76989;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f76990;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f76991;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f76992;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C9170 f76993;

    public C23783(C22372 c22372, int i, InterfaceC7785 interfaceC7785, String str, ActivityC16315 activityC16315, boolean z, boolean z2, int i2, String str2, boolean z3, String str3) {
        this.f76987 = c22372;
        this.f76989 = i;
        this.f76981 = interfaceC7785;
        this.f76983 = str;
        this.f76986 = activityC16315;
        this.f76991 = z;
        this.f76990 = z2;
        this.f76979 = i2;
        this.f76985 = str2;
        this.f76982 = z3;
        this.f76980 = str3;
        this.f76993 = C9170.m23579(c22372.getViewLifecycleOwner());
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        C14799 c14799M35199;
        C23077 c23077 = new C23077(0, this.f76989, false, 0, null, null, null);
        C22372 c22372 = this.f76987;
        C11915 c11915 = c22372.f72506;
        String str = this.f76983;
        if (c11915 == null) {
            c14799M35199 = C14799.m35197(this.f76981, str, c23077, -1, null);
        } else {
            c14799M35199 = C14799.m35199(c22372.f72506, str, c23077);
        }
        this.f76988 = c14799M35199;
        m20267(this.f76986, R.string.MT_Protector);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        this.f76984 = C16293.f50113.m36535(this.f76991 ? ".mhtml" : ".html");
        synchronized (this.f76987.f72498) {
            C14799 c14799 = this.f76988;
            try {
                if (this.f76990) {
                    C13963 c13963M35201 = c14799.m35201(this.f76979);
                    this.f76992 = c13963M35201.m33412();
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(this.f76984.mo23555(false), StandardCharsets.UTF_8));
                    try {
                        C11059.m27445(c13963M35201, this.f76985, this.f76982, this.f76986.getAssets(), bufferedWriter, this.f76986.getString(R.string.MT_Protector));
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
                    c14799.m35204(this.f76984);
                }
                if (c14799 != null) {
                    c14799.close();
                }
            } catch (Throwable th3) {
                if (c14799 != null) {
                    try {
                        c14799.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        if (this.f76993.m23581()) {
            boolean z = this.f76990;
            String str = this.f76985;
            String str2 = this.f76980;
            ActivityC16315 activityC16315 = this.f76986;
            if (z) {
                ActivityC0921.m3277(activityC16315, str2, str, this.f76984, this.f76992);
            } else {
                ActivityC0921.m3278(activityC16315, str2, str, this.f76991, this.f76984);
            }
            this.f76984 = null;
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        if (this.f76993.m23581()) {
            if (exc instanceof C1886) {
                C21374.m48457(R.string.MT_Protector);
            } else {
                this.f76987.m50144(exc, this.f76986);
            }
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        C14799 c14799 = this.f76988;
        if (c14799 != null) {
            c14799.close();
        }
        AbstractC15440 abstractC15440 = this.f76984;
        if (abstractC15440 != null) {
            abstractC15440.mo23552();
        }
        m20273();
    }
}
