package p067l;

import com.alipay.sdk.p010m.p055w.C0233a;
import java.nio.charset.Charset;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ᩳ֡ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: MAUA */
/* JADX INFO: loaded from: classes4.dex */
public final class C19186 {

    /* JADX INFO: renamed from: ֫ */
    public static final Charset f57350;

    static {
        Pattern.compile("(?i)\\bcharset=\\s*(?:[\"'])?([^\\s,;\"']*)");
        Charset charsetForName = Charset.forName(C0233a.f1077D);
        f57350 = charsetForName;
        charsetForName.name();
        "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    }
}
