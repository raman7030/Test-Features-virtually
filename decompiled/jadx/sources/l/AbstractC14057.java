package l;

import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;

/* JADX INFO: renamed from: l.ܰ᩷֡, reason: contains not printable characters */
/* JADX INFO: compiled from: W5CQ */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC14057 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC23230 m33659(Charset charset) {
        return new C11942(charset);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC23230 m33658(String str) {
        Charset charsetDefaultCharset;
        try {
            int i = C8789.f26773;
            charsetDefaultCharset = Charset.defaultCharset();
            if (str != null) {
                charsetDefaultCharset = Charset.forName(str);
            }
        } catch (UnsupportedCharsetException unused) {
            charsetDefaultCharset = Charset.defaultCharset();
        }
        return new C11942(charsetDefaultCharset);
    }
}
