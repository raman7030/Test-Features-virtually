package l;

import com.alipay.sdk.m.w.a;
import com.alipay.sdk.m.y.l;
import com.google.android.material.motion.MotionUtils;
import java.util.HashMap;
import java.util.Map;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: renamed from: l.ۤۘ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Q2DX */
/* JADX INFO: loaded from: classes3.dex */
public final class C10035 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C5801 f30191;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C5801 f30192;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C5801 f30193;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C5801 f30194;

    static {
        HashMap map = new HashMap();
        map.put("\"", "\\\"");
        map.put("\\", "\\\\");
        C18229 c18229 = new C18229(C20195.unmodifiableMap(map));
        Map map2 = C11174.f33544;
        f30192 = new C5801(c18229, new C18229(map2), new C16817());
        HashMap map3 = new HashMap();
        map3.put("'", "\\'");
        map3.put("\"", "\\\"");
        map3.put("\\", "\\\\");
        map3.put("/", "\\/");
        f30191 = new C5801(new C18229(C20195.unmodifiableMap(map3)), new C18229(map2), new C16817());
        HashMap map4 = new HashMap();
        map4.put("\"", "\\\"");
        map4.put("\\", "\\\\");
        map4.put("/", "\\/");
        new C5801(new C18229(C20195.unmodifiableMap(map4)), new C18229(map2), new C16817());
        HashMap map5 = new HashMap();
        map5.put(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, "");
        map5.put("\u0001", "");
        map5.put("\u0002", "");
        map5.put("\u0003", "");
        map5.put("\u0004", "");
        map5.put("\u0005", "");
        map5.put("\u0006", "");
        map5.put("\u0007", "");
        map5.put("\b", "");
        map5.put("\u000b", "");
        map5.put("\f", "");
        map5.put("\u000e", "");
        map5.put("\u000f", "");
        map5.put("\u0010", "");
        map5.put("\u0011", "");
        map5.put("\u0012", "");
        map5.put("\u0013", "");
        map5.put("\u0014", "");
        map5.put("\u0015", "");
        map5.put("\u0016", "");
        map5.put("\u0017", "");
        map5.put("\u0018", "");
        map5.put("\u0019", "");
        map5.put("\u001a", "");
        map5.put("\u001b", "");
        map5.put("\u001c", "");
        map5.put("\u001d", "");
        map5.put("\u001e", "");
        map5.put("\u001f", "");
        map5.put("\ufffe", "");
        map5.put("\uffff", "");
        Map map6 = C11174.f33541;
        C18229 c182210 = new C18229(map6);
        Map map7 = C11174.f33536;
        new C5801(c182210, new C18229(map7), new C18229(C20195.unmodifiableMap(map5)), C17523.m40960(127, 132), C17523.m40960(134, 159), new C9057());
        HashMap map8 = new HashMap();
        map8.put(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, "");
        map8.put("\u000b", "&#11;");
        map8.put("\f", "&#12;");
        map8.put("\ufffe", "");
        map8.put("\uffff", "");
        f30193 = new C5801(new C18229(map6), new C18229(map7), new C18229(C20195.unmodifiableMap(map8)), C17523.m40960(1, 8), C17523.m40960(14, 31), C17523.m40960(127, 132), C17523.m40960(134, 159), new C9057());
        C18229 c182211 = new C18229(map6);
        Map map9 = C11174.f33545;
        new C5801(c182211, new C18229(map9));
        new C5801(new C18229(map6), new C18229(map9), new C18229(C11174.f33542));
        new C13561();
        HashMap map10 = new HashMap();
        map10.put("|", "\\|");
        map10.put(a.p, "\\&");
        map10.put(l.b, "\\;");
        map10.put("<", "\\<");
        map10.put(">", "\\>");
        map10.put(MotionUtils.EASING_TYPE_FORMAT_START, "\\(");
        map10.put(MotionUtils.EASING_TYPE_FORMAT_END, "\\)");
        map10.put("$", "\\$");
        map10.put("`", "\\`");
        map10.put("\\", "\\\\");
        map10.put("\"", "\\\"");
        map10.put("'", "\\'");
        map10.put(" ", "\\ ");
        map10.put("\t", "\\\t");
        map10.put("\r\n", "");
        map10.put("\n", "");
        map10.put("*", "\\*");
        map10.put("?", "\\?");
        map10.put("[", "\\[");
        map10.put("#", "\\#");
        map10.put("~", "\\~");
        map10.put("=", "\\=");
        map10.put("%", "\\%");
        new C18229(C20195.unmodifiableMap(map10));
        HashMap map11 = new HashMap();
        map11.put("\\\\", "\\");
        map11.put("\\\"", "\"");
        map11.put("\\'", "'");
        map11.put("\\", "");
        C6940 c6940 = new C6940();
        C9763 c9763 = new C9763();
        Map map12 = C11174.f33538;
        f30194 = new C5801(c6940, c9763, new C18229(map12), new C18229(C20195.unmodifiableMap(map11)));
        new C5801(new C6940(), new C9763(), new C18229(map12));
        Map map13 = C11174.f33543;
        C18229 c182212 = new C18229(map13);
        Map map14 = C11174.f33537;
        new C5801(c182212, new C18229(map14), new C23873(new EnumC14700[0]));
        new C5801(new C18229(map13), new C18229(map14), new C18229(C11174.f33540), new C23873(new EnumC14700[0]));
        new C5801(new C18229(map13), new C18229(C11174.f33539), new C23873(new EnumC14700[0]));
        new C7212();
        new C12151();
    }
}
