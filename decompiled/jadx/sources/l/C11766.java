package l;

import com.alipay.sdk.m.p.a;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.google.android.material.motion.MotionUtils;
import com.umeng.commonsdk.statistics.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import org.simpleframework.xml.core.AnnotationHandler;
import org.simpleframework.xml.strategy.Name;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۨܳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31G5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11766 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final HashMap f35119;

    static {
        HashMap map = new HashMap();
        f35119 = map;
        map.put(AnnotationHandler.ATTRIBUTE, new C21644());
        map.put("bool", new C22349());
        map.put(ColorResourcesTableCreator.RESOURCE_TYPE_NAME_COLOR, new C20233());
        map.put("dimen", new C3299());
        map.put(ClassTransform.FLOAT, new C23054());
        map.put("fraction", new C13881());
        map.put("id", new C7532());
        map.put("integer", new C2160());
        map.put(Name.REFER, new C18388());
        map.put("dynamic-reference", new C12471());
        map.put("dynamic-attribute", new C13176());
        C17682 c17682 = new C17682();
        map.put("string", c17682);
        map.put(MotionUtils.EASING_TYPE_PATH, c17682);
        map.put("complex", new C4710());
        C1182 c1182 = new C1182();
        map.put("string-array", c1182);
        map.put("integer-array", c1182);
        map.put("array", c1182);
        map.put("attr", new C15292());
        map.put("plurals", new C11333());
        map.put("style", new C14859());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m28799(C19220 c19220, C2678 c2678, C10355 c10355, HashMap map, C18116 c18116) {
        if (!c19220.m44350().equals("resources")) {
            throw new C1580("Expected tag: <resources>", c19220);
        }
        C18514 c18514M44343 = c19220.m44343("sparse");
        if (c18514M44343 != null && c18514M44343.m43026().equals("true")) {
            c2678.m8397(true);
        }
        C18514 c18514M44344 = c19220.m44343("offset16");
        if (c18514M44344 != null && c18514M44344.m43026().equals("true")) {
            c2678.m8395(true);
        }
        Iterator itM44337 = C19220.m44337(c19220);
        while (itM44337.hasNext()) {
            C19220 c19221 = (C19220) itM44337.next();
            C18514 c18514M44345 = c19221.m44343("name");
            if (c18514M44345 == null) {
                throw new C1580("Expected attr: name", c19221);
            }
            String strM43026 = c18514M44345.m43026();
            Integer num = (Integer) map.get(strM43026);
            if (num == null) {
                throw new C1580(C20087.m46306("Id definition not found: ", strM43026, " (in ", c2678.getType().getPath() + "/type-info.xml", MotionUtils.EASING_TYPE_FORMAT_END), c19221);
            }
            int iIntValue = num.intValue();
            boolean z = false;
            c2678.getType().m46611(iIntValue, strM43026, false);
            C18906 c18906M8392 = c2678.m8392(iIntValue);
            C18514 c18514M44346 = c19221.m44343("public");
            if (c18116.f56383) {
                c18906M8392.m43649(c18514M44346 == null || c18514M44346.m43026().equals("true"));
            } else {
                c18906M8392.m43649(c18514M44346 != null && c18514M44346.m43026().equals("true"));
            }
            C18514 c18514M44347 = c19221.m44343("weak");
            if (c18116.f56384) {
                c18906M8392.m43650(c18514M44347 == null || c18514M44347.m43026().equals("true"));
            } else {
                c18906M8392.m43650(c18514M44347 != null && c18514M44347.m43026().equals("true"));
            }
            C18514 c18514M44348 = c19221.m44343("compact");
            if (c18116.f56382) {
                c18906M8392.m43646(c18514M44348 == null || c18514M44348.m43026().equals("true"));
            } else {
                if (c18514M44348 != null && c18514M44348.m43026().equals("true")) {
                    z = true;
                }
                c18906M8392.m43646(z);
            }
            InterfaceC6121 interfaceC6121 = (InterfaceC6121) f35119.get(c19221.m44350());
            if (interfaceC6121 == null) {
                throw new C1580("Unknown tag <" + c19221.m44350() + ">", c19221);
            }
            interfaceC6121.mo3995(c18906M8392, c10355, c19221);
            c10355.m26160(c18906M8392.mo47884(), c19221.m22403(), c19221.m22402());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C4794 m28796(C18906 c18906, C19220 c19220, C10355 c10355, boolean z) throws C1580 {
        Integer numM28794;
        C0874 c0874M44347 = c19220.m44347();
        String strM3219 = c0874M44347.m3219();
        if (!strM3219.startsWith("@")) {
            throw new C1580("Expected reference value", c0874M44347);
        }
        int i = 1;
        String strSubstring = strM3219.substring(1);
        if (strSubstring.equals("null")) {
            numM28794 = 0;
        } else if (!strSubstring.equals(b.f)) {
            numM28794 = m28794(strSubstring);
            if (numM28794 == null) {
                int iMo26156 = c10355.mo26156(c18906.m43652().mo12858(), strSubstring);
                numM28794 = iMo26156 == -1 ? null : Integer.valueOf(iMo26156);
            }
        } else {
            if (!z) {
                throw new C1580("@empty is supported only by root <reference>", c0874M44347);
            }
            numM28794 = 1;
            i = 0;
        }
        if (numM28794 != null) {
            C4794 c4794M43639 = c18906.m43639(numM28794.intValue(), i, -1);
            c10355.m26162(c4794M43639, c0874M44347);
            return c4794M43639;
        }
        throw new C1580("Resource not found: @".concat(strSubstring), c0874M44347);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C4794 m28795(C18906 c18906, C10355 c10355, C19220 c19220) throws C1580 {
        Integer numM28794;
        C0874 c0874M44347 = c19220.m44347();
        String strM3219 = c0874M44347.m3219();
        if (!strM3219.startsWith("?")) {
            throw new C1580("Expected reference value", c0874M44347);
        }
        String strSubstring = strM3219.substring(1);
        if (strSubstring.equals("null")) {
            numM28794 = 0;
        } else {
            numM28794 = m28794(strSubstring);
            if (numM28794 == null) {
                int iMo26156 = c10355.mo26156(c18906.m43652().mo12858(), strSubstring);
                numM28794 = iMo26156 == -1 ? null : Integer.valueOf(iMo26156);
            }
        }
        if (numM28794 != null) {
            C4794 c4794M43639 = c18906.m43639(numM28794.intValue(), 2, -1);
            c10355.m26162(c4794M43639, c0874M44347);
            return c4794M43639;
        }
        throw new C1580("Resource not found: ?".concat(strSubstring), c0874M44347);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Integer m28794(String str) {
        if (str.length() == 10 && str.regionMatches(true, 0, "0x", 0, 2)) {
            str = str.substring(2);
        }
        if (str.length() == 8 && C9896.m24990(str)) {
            return Integer.valueOf(C9896.m24993(str));
        }
        return null;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static C4794 m28800(C18906 c18906, C10355 c10355, C19220 c19220) {
        int iM22403;
        int iM22402;
        StringBuilder sb = new StringBuilder();
        LinkedList linkedList = new LinkedList();
        m28798(c19220.m44345(), sb, linkedList);
        C4794 c4794M43640 = c18906.m43640(sb.toString(), linkedList.isEmpty() ? null : (C21916[]) linkedList.toArray(new C21916[0]), -1);
        if (!c4794M43640.mo5009() && !c4794M43640.mo5007() && !c4794M43640.mo5005()) {
            return c4794M43640;
        }
        ArrayList arrayListM44345 = c19220.m44345();
        if (arrayListM44345.isEmpty()) {
            iM22403 = c19220.m22402();
            iM22402 = iM22403;
        } else {
            iM22403 = ((AbstractC8636) arrayListM44345.get(0)).m22403();
            iM22402 = ((AbstractC8636) arrayListM44345.get(arrayListM44345.size() - 1)).m22402();
        }
        c10355.m26161(c4794M43640, iM22403, iM22402);
        return c4794M43640;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m28798(ArrayList arrayList, StringBuilder sb, LinkedList linkedList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC8636 abstractC8636 = (AbstractC8636) it.next();
            if (!abstractC8636.mo3218()) {
                if (abstractC8636.mo3218()) {
                    throw new UnsupportedOperationException();
                }
                m28797(sb, ((C0874) abstractC8636).m3219());
            } else {
                C19220 c19220M22400 = abstractC8636.m22400();
                int length = sb.length();
                StringBuilder sb2 = new StringBuilder(c19220M22400.m44350());
                for (C18514 c18514 : c19220M22400.m44351()) {
                    sb2.append(';');
                    sb2.append(c18514.m43025());
                    sb2.append(a.h);
                    sb2.append(c18514.m43026());
                }
                m28798(c19220M22400.m44345(), sb, linkedList);
                linkedList.addFirst(new C21916(sb2.toString(), length, sb.length()));
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m28797(StringBuilder sb, String str) {
        int i = 0;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\\') {
                if (i != str.length() - 1) {
                    i++;
                    sb.append(str.charAt(i));
                } else {
                    sb.append('\\');
                }
            } else {
                sb.append(cCharAt);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static C4794 m28804(C18906 c18906, C10355 c10355, C19220 c19220) throws C1580 {
        int i;
        C0874 c0874M44347 = c19220.m44347();
        String strM3219 = c0874M44347.m3219();
        C7073 c7073 = new C7073();
        if (C9896.m24995(strM3219, c7073) && (i = c7073.f21767) == 4) {
            C4794 c4794M43639 = c18906.m43639(c7073.f21766, i, -1);
            c10355.m26162(c4794M43639, c0874M44347);
            return c4794M43639;
        }
        throw new C1580("Expected float value", c0874M44347);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static C4794 m28805(C18906 c18906, C10355 c10355, C19220 c19220) throws C1580 {
        int i;
        C0874 c0874M44347 = c19220.m44347();
        String strM3219 = c0874M44347.m3219();
        C7073 c7073 = new C7073();
        if (C9896.m24995(strM3219, c7073) && (i = c7073.f21767) == 5) {
            C4794 c4794M43639 = c18906.m43639(c7073.f21766, i, -1);
            c10355.m26162(c4794M43639, c0874M44347);
            return c4794M43639;
        }
        throw new C1580("Expected dimen value", c0874M44347);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static C4794 m28802(C18906 c18906, C10355 c10355, C19220 c19220) throws C1580 {
        int i;
        C0874 c0874M44347 = c19220.m44347();
        String strM3219 = c0874M44347.m3219();
        C7073 c7073 = new C7073();
        if (C9896.m24995(strM3219, c7073) && (i = c7073.f21767) == 6) {
            C4794 c4794M43639 = c18906.m43639(c7073.f21766, i, -1);
            c10355.m26162(c4794M43639, c0874M44347);
            return c4794M43639;
        }
        throw new C1580("Expected fraction value", c0874M44347);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static C4794 m28806(C18906 c18906, C10355 c10355, C19220 c19220) throws C1580 {
        C0874 c0874M44347 = c19220.m44347();
        String strM3219 = c0874M44347.m3219();
        C7073 c7073 = new C7073();
        if (C9896.m24998(strM3219, c7073)) {
            C4794 c4794M43639 = c18906.m43639(c7073.f21766, c7073.f21767, -1);
            c10355.m26162(c4794M43639, c0874M44347);
            return c4794M43639;
        }
        throw new C1580("Expected integer value", c0874M44347);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C4794 m28801(C18906 c18906, C10355 c10355, C19220 c19220) throws C1580 {
        C0874 c0874M44347 = c19220.m44347();
        String strM3219 = c0874M44347.m3219();
        if (strM3219.equals("true")) {
            C4794 c4794M43639 = c18906.m43639(1, 18, -1);
            c10355.m26162(c4794M43639, c0874M44347);
            return c4794M43639;
        }
        if (strM3219.equals("false")) {
            C4794 c4794M436310 = c18906.m43639(0, 18, -1);
            c10355.m26162(c4794M436310, c0874M44347);
            return c4794M436310;
        }
        throw new C1580("Expected bool value", c0874M44347);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C4794 m28803(C18906 c18906, C10355 c10355, C19220 c19220) throws C1580 {
        C0874 c0874M44347 = c19220.m44347();
        String strM3219 = c0874M44347.m3219();
        C7073 c7073 = new C7073();
        if (C9896.m24991(strM3219, c7073)) {
            C4794 c4794M43639 = c18906.m43639(c7073.f21766, c7073.f21767, -1);
            c10355.m26162(c4794M43639, c0874M44347);
            return c4794M43639;
        }
        throw new C1580("Color value invalid -- must be #rgb, #argb, #rrggbb, or #aarrggbb: ".concat(strM3219), c0874M44347);
    }
}
