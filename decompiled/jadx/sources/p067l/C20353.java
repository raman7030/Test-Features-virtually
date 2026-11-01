package p067l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ᩴᩳۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q1K7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20353 {

    /* JADX INFO: renamed from: ֫ */
    public C12828 f62841;

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ C2917 f62842;

    /* JADX INFO: renamed from: ۧ */
    public int f62843;

    /* JADX INFO: renamed from: ܳ */
    public OutputStream f62844;

    /* JADX INFO: renamed from: ܽ */
    public int f62845 = -1;

    /* JADX INFO: renamed from: ܿ */
    public C5173 f62846;

    /* JADX INFO: renamed from: ᩳ */
    public C5173 f62847;

    /* JADX INFO: renamed from: ᩻ */
    public C5173 f62848;

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m45927() {
        OutputStream outputStream = this.f62844;
        if (outputStream != null) {
            C2700.m4192(outputStream);
            this.f62844 = null;
        }
        this.f62845 = -1;
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m45928(String str, C14679 c14679) {
        try {
            AbstractC17043 abstractC17043M29402 = this.f62841.m29402();
            int iMo25101 = this.f62845;
            if (iMo25101 == -1) {
                iMo25101 = abstractC17043M29402.mo25094() ? (int) abstractC17043M29402.mo25101() : 0;
            }
            int iM33605 = c14679.m33605();
            if (this.f62848 == null) {
                this.f62848 = new C5173(this.f62842.f5047.m29402().mo25506(true));
            }
            if (this.f62846 == null) {
                this.f62846 = new C5173(this.f62842.f5049.m29402().mo25506(true));
            }
            if (this.f62844 == null) {
                this.f62844 = abstractC17043M29402.mo25506(true);
            }
            this.f62844.write(c14679.m33603(), 0, iM33605);
            this.f62844.flush();
            C2917.m4733(this.f62842, this.f62843);
            this.f62842.f5058.put(str, new C21024(this.f62843, iMo25101, iM33605));
            this.f62845 = iMo25101 + iM33605;
            boolean z = str.length() <= 20000;
            C5173 c5173 = z ? this.f62848 : this.f62846;
            if (z) {
                C14009.m31811(c5173, C7855.m18152(str));
                C7855.m18155(c5173, str);
            } else {
                C14009.m31808(c5173, C7855.m18152(str));
                C7855.m18155(c5173, str);
            }
            C14009.m31811(c5173, this.f62843);
            C14009.m31808(c5173, iMo25101);
            C14009.m31808(c5173, iM33605);
            c5173.flush();
            if (this.f62845 >= 524288) {
                this.f62843++;
                this.f62841 = new C12828(this.f62842.f5056, String.valueOf(this.f62843));
                m45927();
            }
        } catch (IOException e) {
            m45929();
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final synchronized void m45929() {
        C5173 c5173 = this.f62848;
        if (c5173 != null) {
            C2700.m4192(c5173);
            this.f62848 = null;
        }
        C5173 c5174 = this.f62846;
        if (c5174 != null) {
            C2700.m4192(c5174);
            this.f62846 = null;
        }
        C5173 c5175 = this.f62847;
        if (c5175 != null) {
            C2700.m4192(c5175);
            this.f62847 = null;
        }
        m45927();
    }

    public C20353(C2917 c2917) {
        this.f62842 = c2917;
        AbstractC17043 abstractC17043M4722 = C2917.m4722(c2917, this.f62843);
        while (abstractC17043M4722.mo25094() && abstractC17043M4722.mo25101() >= 524288) {
            int i = this.f62843 + 1;
            this.f62843 = i;
            abstractC17043M4722 = C2917.m4722(c2917, i);
        }
        this.f62841 = new C12828(c2917.f5056, String.valueOf(this.f62843));
    }
}
