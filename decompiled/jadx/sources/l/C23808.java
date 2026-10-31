package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.᩻ܺ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: CAG8 */
/* JADX INFO: loaded from: classes.dex */
public final class C23808 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6875 f77038;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C10403 f77039;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f77040;

    public C23808(AbstractActivityC3346 abstractActivityC3346, C6875 c6875) {
        this.f77040 = abstractActivityC3346;
        this.f77038 = c6875;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20267(this.f77040, R.string.MT_Protector);
        C13136 c13136 = this.f23322;
        C11003.requireNonNull(c13136);
        c13136.m31860(new RunnableC22934(3, c13136));
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() throws C19401 {
        try {
            try {
                m52488();
                if (this.f23322.m31868()) {
                    C10403 c10403 = this.f77039;
                    if (c10403 == null || !c10403.m15539()) {
                        return;
                    }
                } else {
                    try {
                        this.f23322.m31858(R.string.MT_Protector);
                        m52489();
                        if (this.f23322.m31868()) {
                            C10403 c10404 = this.f77039;
                            if (c10404 == null || !c10404.m15539()) {
                                return;
                            }
                        } else {
                            this.f23322.m31863(R.string.MT_Protector);
                            this.f77039.mo26242();
                            this.f77039.m13876();
                            if (this.f77039.m36355() != 226) {
                                throw new Exception(this.f77039.m36351());
                            }
                            C10403 c10405 = this.f77039;
                            if (c10405 == null || !c10405.m15539()) {
                                return;
                            }
                        }
                    } catch (C1637 e) {
                        throw e;
                    } catch (C19401 e2) {
                        throw e2;
                    } catch (Exception e3) {
                        throw new Exception(C4925.m14327(R.string.MT_Protector) + ": " + e3.getMessage(), e3);
                    }
                }
                try {
                    this.f77039.mo13861();
                } catch (IOException unused) {
                }
            } catch (Throwable th) {
                C10403 c10406 = this.f77039;
                if (c10406 != null && c10406.m15539()) {
                    try {
                        this.f77039.mo13861();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Exception e4) {
            throw new Exception(C4925.m14327(R.string.MT_Protector) + ": " + e4.getMessage(), e4);
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m52488() throws IOException {
        C6875 c6875 = this.f77038;
        C10403 c10403 = new C10403(!c6875.f21244, null);
        this.f77039 = c10403;
        c10403.m26240(c6875.f21249);
        this.f77039.m36354(c6875.f21242);
        C10403 c10404 = this.f77039;
        Charset.forName(c6875.f21242);
        c10404.getClass();
        this.f77039.m15531(c6875.f21245, c6875.f21246);
        if (c6875.f21248) {
            this.f77039.m13854();
            this.f77039.m33320();
            this.f77039.m33319();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m52489() throws C1637 {
        C6875 c6875 = this.f77038;
        String str = c6875.f21243;
        String str2 = c6875.f21247;
        if (str.equals("anonymous") && str2.isEmpty()) {
            str2 = "anonymous@";
        }
        if (this.f77039.m13868(str, str2)) {
            return;
        }
        StringBuilder sbM19190 = C7166.m19190(C4925.m14327(R.string.MT_Protector), ": ");
        sbM19190.append(this.f77039.m36351());
        throw new C1637(sbM19190.toString());
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        if (this.f23322.m31868()) {
            return;
        }
        C21374.m48457(R.string.MT_Protector);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        if (this.f23322.m31868()) {
            return;
        }
        this.f77040.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        if (this.f23322.m31868()) {
            return;
        }
        m20273();
    }
}
