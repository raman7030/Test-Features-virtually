package p067l;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.᩶ۢ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: L7IG */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC21450 {
    CR("\r"),
    CRLF("\r\n"),
    LF("\n");


    /* JADX INFO: renamed from: ᩸ */
    public final String f67658;

    EnumC21450(String str) {
        C12826.requireNonNull(str, "lineSeparator");
        this.f67658 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public byte[] m48587(Charset charset) {
        return this.f67658.getBytes(charset);
    }

    public String getString() {
        return this.f67658;
    }
}
