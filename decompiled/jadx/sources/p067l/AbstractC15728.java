package p067l;

import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;

/* JADX INFO: renamed from: l.ܰ᩷֡, reason: contains not printable characters */
/* JADX INFO: compiled from: W5CQ */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15728 {
    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC24446 m35784(Charset charset) {
        return new C13718(charset);
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC24446 m35783(String str) {
        Charset charsetDefaultCharset;
        try {
            int i = C10721.f29698;
            charsetDefaultCharset = Charset.defaultCharset();
            if (str != null) {
                charsetDefaultCharset = Charset.forName(str);
            }
        } catch (UnsupportedCharsetException unused) {
            charsetDefaultCharset = Charset.defaultCharset();
        }
        return new C13718(charsetDefaultCharset);
    }
}
