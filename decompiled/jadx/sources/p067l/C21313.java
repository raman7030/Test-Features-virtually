package p067l;

import java.io.UnsupportedEncodingException;

/* JADX INFO: renamed from: l.᩶ۙ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: N5OE */
/* JADX INFO: loaded from: classes4.dex */
public final class C21313 {

    /* JADX INFO: renamed from: ֫ */
    public final String[] f67172;

    /* JADX INFO: renamed from: ۧ */
    public final byte[][] f67173;

    public C21313(C12556 c12556) {
        c12556.m28944();
        c12556.m28944();
        c12556.m28944();
        int iM28944 = c12556.m28944();
        this.f67172 = new String[iM28944];
        this.f67173 = new byte[iM28944][];
        for (int i = 0; i < iM28944; i++) {
            int iM28945 = c12556.m28944();
            try {
                this.f67172[i] = new String(c12556.m28942(iM28945), 0, iM28945 - 1, "US-ASCII");
                this.f67173[i] = c12556.m28942(20);
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
