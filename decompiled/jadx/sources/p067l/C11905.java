package p067l;

import com.alipay.sdk.p010m.p055w.C0233a;
import com.alipay.sdk.p010m.p058y.C0249l;
import com.google.android.material.motion.MotionUtils;
import java.util.HashMap;
import java.util.Map;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: renamed from: l.ۤۘ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Q2DX */
/* JADX INFO: loaded from: classes3.dex */
public final class C11905 {

    /* JADX INFO: renamed from: ֫ */
    public static final C7881 f33149;

    /* JADX INFO: renamed from: ۧ */
    public static final C7881 f33150;

    /* JADX INFO: renamed from: ܽ */
    public static final C7881 f33151;

    /* JADX INFO: renamed from: ᩳ */
    public static final C7881 f33152;

    static {
        HashMap map = new HashMap();
        map.put("\"", "\\\"");
        map.put("\\", "\\\\");
        C19693 c19693 = new C19693(C21562.unmodifiableMap(map));
        Map map2 = C12988.f36545;
        f33150 = new C7881(c19693, new C19693(map2), new C18351());
        HashMap map3 = new HashMap();
        map3.put("'", "\\'");
        map3.put("\"", "\\\"");
        map3.put("\\", "\\\\");
        map3.put("/", "\\/");
        f33149 = new C7881(new C19693(C21562.unmodifiableMap(map3)), new C19693(map2), new C18351());
        HashMap map4 = new HashMap();
        map4.put("\"", "\\\"");
        map4.put("\\", "\\\\");
        map4.put("/", "\\/");
        new C7881(new C19693(C21562.unmodifiableMap(map4)), new C19693(map2), new C18351());
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
        Map map6 = C12988.f36542;
        C19693 c19694 = new C19693(map6);
        Map map7 = C12988.f36537;
        new C7881(c19694, new C19693(map7), new C19693(C21562.unmodifiableMap(map5)), C19022.m43219(127, 132), C19022.m43219(134, 159), new C10976());
        HashMap map8 = new HashMap();
        map8.put(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, "");
        map8.put("\u000b", "&#11;");
        map8.put("\f", "&#12;");
        map8.put("\ufffe", "");
        map8.put("\uffff", "");
        f33151 = new C7881(new C19693(map6), new C19693(map7), new C19693(C21562.unmodifiableMap(map8)), C19022.m43219(1, 8), C19022.m43219(14, 31), C19022.m43219(127, 132), C19022.m43219(134, 159), new C10976());
        C19693 c19695 = new C19693(map6);
        Map map9 = C12988.f36546;
        new C7881(c19695, new C19693(map9));
        new C7881(new C19693(map6), new C19693(map9), new C19693(C12988.f36543));
        new C15256();
        HashMap map10 = new HashMap();
        map10.put("|", "\\|");
        map10.put(C0233a.f1084p, "\\&");
        map10.put(C0249l.f1196b, "\\;");
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
        new C19693(C21562.unmodifiableMap(map10));
        HashMap map11 = new HashMap();
        map11.put("\\\\", "\\");
        map11.put("\\\"", "\"");
        map11.put("\\'", "'");
        map11.put("\\", "");
        C8964 c8964 = new C8964();
        C11647 c11647 = new C11647();
        Map map12 = C12988.f36539;
        f33152 = new C7881(c8964, c11647, new C19693(map12), new C19693(C21562.unmodifiableMap(map11)));
        new C7881(new C8964(), new C11647(), new C19693(map12));
        Map map13 = C12988.f36544;
        C19693 c19696 = new C19693(map13);
        Map map14 = C12988.f36538;
        new C7881(c19696, new C19693(map14), new C25057(new EnumC16339[0]));
        new C7881(new C19693(map13), new C19693(map14), new C19693(C12988.f36541), new C25057(new EnumC16339[0]));
        new C7881(new C19693(map13), new C19693(C12988.f36540), new C25057(new EnumC16339[0]));
        new C9222();
        new C13916();
    }
}
