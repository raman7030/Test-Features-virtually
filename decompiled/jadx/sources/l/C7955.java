package l;

import com.alipay.sdk.m.w.a;
import java.nio.charset.Charset;
import org.bouncycastle.i18n.LocalizedMessage;

/* JADX INFO: renamed from: l.۠ۙ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: H4JG */
/* JADX INFO: loaded from: classes3.dex */
public final class C7955 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Charset f24594;

    static {
        Charset charsetForName = Charset.forName(a.D);
        C11233.m27803(charsetForName, "forName(...)");
        f24594 = charsetForName;
        C11233.m27803(Charset.forName("UTF-16"), "forName(...)");
        C11233.m27803(Charset.forName("UTF-16BE"), "forName(...)");
        C11233.m27803(Charset.forName("UTF-16LE"), "forName(...)");
        C11233.m27803(Charset.forName("US-ASCII"), "forName(...)");
        C11233.m27803(Charset.forName(LocalizedMessage.DEFAULT_ENCODING), "forName(...)");
    }
}
