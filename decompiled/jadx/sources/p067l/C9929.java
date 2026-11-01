package p067l;

import com.alipay.sdk.p010m.p055w.C0233a;
import java.nio.charset.Charset;
import org.bouncycastle.i18n.LocalizedMessage;

/* JADX INFO: renamed from: l.۠ۙ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: H4JG */
/* JADX INFO: loaded from: classes3.dex */
public final class C9929 {

    /* JADX INFO: renamed from: ֫ */
    public static final Charset f27508;

    static {
        Charset charsetForName = Charset.forName(C0233a.f1077D);
        C13045.m29865(charsetForName, "forName(...)");
        f27508 = charsetForName;
        C13045.m29865(Charset.forName("UTF-16"), "forName(...)");
        C13045.m29865(Charset.forName("UTF-16BE"), "forName(...)");
        C13045.m29865(Charset.forName("UTF-16LE"), "forName(...)");
        C13045.m29865(Charset.forName("US-ASCII"), "forName(...)");
        C13045.m29865(Charset.forName(LocalizedMessage.DEFAULT_ENCODING), "forName(...)");
    }
}
