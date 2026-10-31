package l;

import java.io.UnsupportedEncodingException;

/* JADX INFO: renamed from: l.᩶ۙ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: N5OE */
/* JADX INFO: loaded from: classes4.dex */
public final class C19934 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String[] f64535;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte[][] f64536;

    public C19934(C10720 c10720) {
        c10720.m26904();
        c10720.m26904();
        c10720.m26904();
        int iM26904 = c10720.m26904();
        this.f64535 = new String[iM26904];
        this.f64536 = new byte[iM26904][];
        for (int i = 0; i < iM26904; i++) {
            int iM26905 = c10720.m26904();
            try {
                this.f64535[i] = new String(c10720.m26902(iM26905), 0, iM26905 - 1, "US-ASCII");
                this.f64536[i] = c10720.m26902(20);
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
