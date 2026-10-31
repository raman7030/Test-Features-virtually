package l;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.᩶ۢ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: L7IG */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC20078 {
    CR("\r"),
    CRLF("\r\n"),
    LF("\n");


    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f65018;

    EnumC20078(String str) {
        C11003.requireNonNull(str, "lineSeparator");
        this.f65018 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public byte[] m46271(Charset charset) {
        return this.f65018.getBytes(charset);
    }

    public String getString() {
        return this.f65018;
    }
}
