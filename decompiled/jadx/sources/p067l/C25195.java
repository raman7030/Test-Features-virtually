package p067l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.᩻᩺᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: W7A7 */
/* JADX INFO: loaded from: classes.dex */
public final class C25195 {

    /* JADX INFO: renamed from: ֫ */
    public int f80583;

    /* JADX INFO: renamed from: ۧ */
    public int f80584 = -1;

    /* JADX INFO: renamed from: ܳ */
    public C5173 f80585;

    /* JADX INFO: renamed from: ܽ */
    public OutputStream f80586;

    /* JADX INFO: renamed from: ܿ */
    public C5173 f80587;

    /* JADX INFO: renamed from: ᩳ */
    public C5173 f80588;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ C20502 f80589;

    public C25195(C20502 c20502) {
        this.f80589 = c20502;
        AbstractC17043 abstractC17043M46234 = C20502.m46234(c20502, this.f80583);
        while (abstractC17043M46234.mo25094() && abstractC17043M46234.mo25101() >= 524288) {
            int i = this.f80583 + 1;
            this.f80583 = i;
            abstractC17043M46234 = C20502.m46234(c20502, i);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C5079 m55264(String str, C14679 c14679) throws IOException {
        C5173 c5173;
        int iM33605 = c14679.m33605();
        AbstractC17043 abstractC17043M46234 = C20502.m46234(this.f80589, this.f80583);
        int iMo25101 = this.f80584;
        if (iMo25101 == -1) {
            iMo25101 = abstractC17043M46234.mo25094() ? (int) abstractC17043M46234.mo25101() : 0;
        }
        if (iMo25101 > 0 && iMo25101 + iM33605 > 524288) {
            C2700.m4192(this.f80586);
            this.f80586 = null;
            this.f80584 = -1;
            int i = this.f80583 + 1;
            this.f80583 = i;
            abstractC17043M46234 = C20502.m46234(this.f80589, i);
            iMo25101 = abstractC17043M46234.mo25094() ? (int) abstractC17043M46234.mo25101() : 0;
        }
        if (this.f80583 > 65535) {
            throw new IOException("Too many smali cache data files");
        }
        if (this.f80586 == null) {
            this.f80586 = abstractC17043M46234.mo25506(true);
        }
        this.f80586.write(c14679.m33603(), 0, iM33605);
        this.f80586.flush();
        synchronized (this.f80589.f63307) {
            this.f80589.f63320.remove(Integer.valueOf(this.f80583));
        }
        C20502 c20502 = this.f80589;
        if (str.length() <= 20000) {
            if (this.f80585 == null) {
                this.f80585 = new C5173(c20502.f63306.mo25506(true));
            }
            c5173 = this.f80585;
        } else {
            if (this.f80587 == null) {
                this.f80587 = new C5173(c20502.f63319.mo25506(true));
            }
            c5173 = this.f80587;
        }
        if (str.length() <= 20000) {
            C14009.m31811(c5173, C7855.m18152(str));
            C7855.m18155(c5173, str);
        } else {
            C14009.m31808(c5173, C7855.m18152(str));
            C7855.m18155(c5173, str);
        }
        C14009.m31811(c5173, this.f80583);
        C14009.m31808(c5173, iMo25101);
        C14009.m31808(c5173, iM33605);
        c5173.flush();
        int i2 = iMo25101 + iM33605;
        this.f80584 = i2;
        int i3 = this.f80583;
        C5079 c5079 = new C5079(i3, iMo25101, iM33605);
        if (i2 >= 524288) {
            this.f80583 = i3 + 1;
            C2700.m4192(this.f80586);
            this.f80586 = null;
            this.f80584 = -1;
        }
        return c5079;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m55266(String str) throws IOException {
        if (this.f80588 == null) {
            this.f80588 = new C5173(this.f80589.f63314.mo25506(true));
        }
        C5173 c5173 = this.f80588;
        C14009.m31808(c5173, C7855.m18152(str));
        C7855.m18155(c5173, str);
        this.f80588.flush();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m55265() {
        C2700.m4192(this.f80586);
        C2700.m4192(this.f80585);
        C2700.m4192(this.f80587);
        C2700.m4192(this.f80588);
        this.f80586 = null;
        this.f80585 = null;
        this.f80587 = null;
        this.f80588 = null;
        this.f80584 = -1;
    }
}
