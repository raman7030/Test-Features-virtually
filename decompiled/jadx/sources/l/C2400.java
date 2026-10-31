package l;

import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;

/* JADX INFO: renamed from: l.ۖ۠ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 74MB */
/* JADX INFO: loaded from: classes2.dex */
public final class C2400 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Charset f7657 = Charset.defaultCharset();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Charset f7658;

    static {
        Charset charsetForName;
        Charset charsetForName2 = null;
        try {
            charsetForName = Charset.forName("SJIS");
        } catch (UnsupportedCharsetException unused) {
            charsetForName = null;
        }
        f7658 = charsetForName;
        try {
            Charset.forName("GB2312");
        } catch (UnsupportedCharsetException unused2) {
        }
        try {
            charsetForName2 = Charset.forName("EUC_JP");
        } catch (UnsupportedCharsetException unused3) {
        }
        Charset charset = f7658;
        if ((charset == null || !charset.equals(f7657)) && charsetForName2 != null) {
            charsetForName2.equals(f7657);
        }
    }
}
