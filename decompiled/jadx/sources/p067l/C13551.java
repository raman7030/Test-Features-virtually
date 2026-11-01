package p067l;

import com.alipay.sdk.p010m.p041p.C0184a;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.google.android.material.motion.MotionUtils;
import com.umeng.commonsdk.statistics.C0795b;
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
public final class C13551 {

    /* JADX INFO: renamed from: ֫ */
    public static final HashMap f38118;

    static {
        HashMap map = new HashMap();
        f38118 = map;
        map.put(AnnotationHandler.ATTRIBUTE, new C22939());
        map.put("bool", new C23609());
        map.put(ColorResourcesTableCreator.RESOURCE_TYPE_NAME_COLOR, new C21598());
        map.put("dimen", new C5504());
        map.put(ClassTransform.FLOAT, new C24279());
        map.put("fraction", new C15561());
        map.put("id", new C9527());
        map.put("integer", new C4422());
        map.put(Name.REFER, new C19845());
        map.put("dynamic-reference", new C14221());
        map.put("dynamic-attribute", new C14891());
        C19174 c19174 = new C19174();
        map.put("string", c19174);
        map.put(MotionUtils.EASING_TYPE_PATH, c19174);
        map.put("complex", new C6845());
        C3492 c3492 = new C3492();
        map.put("string-array", c3492);
        map.put("integer-array", c3492);
        map.put("array", c3492);
        map.put("attr", new C16902());
        map.put("plurals", new C13140());
        map.put("style", new C16491());
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m30846(C20635 c20635, C4914 c4914, C12210 c12210, HashMap map, C19586 c19586) {
        if (!c20635.m46644().equals("resources")) {
            throw new C3870("Expected tag: <resources>", c20635);
        }
        C19964 c19964M46637 = c20635.m46637("sparse");
        if (c19964M46637 != null && c19964M46637.m45304().equals("true")) {
            c4914.m10443(true);
        }
        C19964 c19964M46638 = c20635.m46637("offset16");
        if (c19964M46638 != null && c19964M46638.m45304().equals("true")) {
            c4914.m10441(true);
        }
        Iterator itM46631 = C20635.m46631(c20635);
        while (itM46631.hasNext()) {
            C20635 c20636 = (C20635) itM46631.next();
            C19964 c19964M46639 = c20636.m46637("name");
            if (c19964M46639 == null) {
                throw new C3870("Expected attr: name", c20636);
            }
            String strM45304 = c19964M46639.m45304();
            Integer num = (Integer) map.get(strM45304);
            if (num == null) {
                throw new C3870(C21459.m48622("Id definition not found: ", strM45304, " (in ", c4914.getType().getPath() + "/type-info.xml", MotionUtils.EASING_TYPE_FORMAT_END), c20636);
            }
            int iIntValue = num.intValue();
            boolean z = false;
            c4914.getType().m48934(iIntValue, strM45304, false);
            C20337 c20337M10438 = c4914.m10438(iIntValue);
            C19964 c19964M466310 = c20636.m46637("public");
            if (c19586.f59596) {
                c20337M10438.m45915(c19964M466310 == null || c19964M466310.m45304().equals("true"));
            } else {
                c20337M10438.m45915(c19964M466310 != null && c19964M466310.m45304().equals("true"));
            }
            C19964 c19964M466311 = c20636.m46637("weak");
            if (c19586.f59597) {
                c20337M10438.m45916(c19964M466311 == null || c19964M466311.m45304().equals("true"));
            } else {
                c20337M10438.m45916(c19964M466311 != null && c19964M466311.m45304().equals("true"));
            }
            C19964 c19964M466312 = c20636.m46637("compact");
            if (c19586.f59595) {
                c20337M10438.m45912(c19964M466312 == null || c19964M466312.m45304().equals("true"));
            } else {
                if (c19964M466312 != null && c19964M466312.m45304().equals("true")) {
                    z = true;
                }
                c20337M10438.m45912(z);
            }
            InterfaceC8186 interfaceC8186 = (InterfaceC8186) f38118.get(c20636.m46644());
            if (interfaceC8186 == null) {
                throw new C3870("Unknown tag <" + c20636.m46644() + ">", c20636);
            }
            interfaceC8186.mo6237(c20337M10438, c12210, c20636);
            c12210.m28187(c20337M10438.mo50214(), c20636.m24372(), c20636.m24371());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C6925 m30843(C20337 c20337, C20635 c20635, C12210 c12210, boolean z) throws C3870 {
        Integer numM30841;
        C3199 c3199M46641 = c20635.m46641();
        String strM5533 = c3199M46641.m5533();
        if (!strM5533.startsWith("@")) {
            throw new C3870("Expected reference value", c3199M46641);
        }
        int i = 1;
        String strSubstring = strM5533.substring(1);
        if (strSubstring.equals("null")) {
            numM30841 = 0;
        } else if (!strSubstring.equals(C0795b.f3347f)) {
            numM30841 = m30841(strSubstring);
            if (numM30841 == null) {
                int iMo28183 = c12210.mo28183(c20337.m45918().mo14722(), strSubstring);
                numM30841 = iMo28183 == -1 ? null : Integer.valueOf(iMo28183);
            }
        } else {
            if (!z) {
                throw new C3870("@empty is supported only by root <reference>", c3199M46641);
            }
            numM30841 = 1;
            i = 0;
        }
        if (numM30841 != null) {
            C6925 c6925M45905 = c20337.m45905(numM30841.intValue(), i, -1);
            c12210.m28189(c6925M45905, c3199M46641);
            return c6925M45905;
        }
        throw new C3870("Resource not found: @".concat(strSubstring), c3199M46641);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C6925 m30842(C20337 c20337, C12210 c12210, C20635 c20635) throws C3870 {
        Integer numM30841;
        C3199 c3199M46641 = c20635.m46641();
        String strM5533 = c3199M46641.m5533();
        if (!strM5533.startsWith("?")) {
            throw new C3870("Expected reference value", c3199M46641);
        }
        String strSubstring = strM5533.substring(1);
        if (strSubstring.equals("null")) {
            numM30841 = 0;
        } else {
            numM30841 = m30841(strSubstring);
            if (numM30841 == null) {
                int iMo28183 = c12210.mo28183(c20337.m45918().mo14722(), strSubstring);
                numM30841 = iMo28183 == -1 ? null : Integer.valueOf(iMo28183);
            }
        }
        if (numM30841 != null) {
            C6925 c6925M45905 = c20337.m45905(numM30841.intValue(), 2, -1);
            c12210.m28189(c6925M45905, c3199M46641);
            return c6925M45905;
        }
        throw new C3870("Resource not found: ?".concat(strSubstring), c3199M46641);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Integer m30841(String str) {
        if (str.length() == 10 && str.regionMatches(true, 0, "0x", 0, 2)) {
            str = str.substring(2);
        }
        if (str.length() == 8 && C11774.m27005(str)) {
            return Integer.valueOf(C11774.m27008(str));
        }
        return null;
    }

    /* JADX INFO: renamed from: ۜ */
    public static C6925 m30847(C20337 c20337, C12210 c12210, C20635 c20635) {
        int iM24372;
        int iM24371;
        StringBuilder sb = new StringBuilder();
        LinkedList linkedList = new LinkedList();
        m30845(c20635.m46639(), sb, linkedList);
        C6925 c6925M45906 = c20337.m45906(sb.toString(), linkedList.isEmpty() ? null : (C23198[]) linkedList.toArray(new C23198[0]), -1);
        if (!c6925M45906.mo7252() && !c6925M45906.mo7250() && !c6925M45906.mo7248()) {
            return c6925M45906;
        }
        ArrayList arrayListM46639 = c20635.m46639();
        if (arrayListM46639.isEmpty()) {
            iM24372 = c20635.m24371();
            iM24371 = iM24372;
        } else {
            iM24372 = ((AbstractC10576) arrayListM46639.get(0)).m24372();
            iM24371 = ((AbstractC10576) arrayListM46639.get(arrayListM46639.size() - 1)).m24371();
        }
        c12210.m28188(c6925M45906, iM24372, iM24371);
        return c6925M45906;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m30845(ArrayList arrayList, StringBuilder sb, LinkedList linkedList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC10576 abstractC10576 = (AbstractC10576) it.next();
            if (!abstractC10576.mo5532()) {
                if (abstractC10576.mo5532()) {
                    throw new UnsupportedOperationException();
                }
                m30844(sb, ((C3199) abstractC10576).m5533());
            } else {
                C20635 c20635M24369 = abstractC10576.m24369();
                int length = sb.length();
                StringBuilder sb2 = new StringBuilder(c20635M24369.m46644());
                for (C19964 c19964 : c20635M24369.m46645()) {
                    sb2.append(';');
                    sb2.append(c19964.m45303());
                    sb2.append(C0184a.f880h);
                    sb2.append(c19964.m45304());
                }
                m30845(c20635M24369.m46639(), sb, linkedList);
                linkedList.addFirst(new C23198(sb2.toString(), length, sb.length()));
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m30844(StringBuilder sb, String str) {
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

    /* JADX INFO: renamed from: ܿ */
    public static C6925 m30851(C20337 c20337, C12210 c12210, C20635 c20635) throws C3870 {
        int i;
        C3199 c3199M46641 = c20635.m46641();
        String strM5533 = c3199M46641.m5533();
        C9091 c9091 = new C9091();
        if (C11774.m27010(strM5533, c9091) && (i = c9091.f24648) == 4) {
            C6925 c6925M45905 = c20337.m45905(c9091.f24647, i, -1);
            c12210.m28189(c6925M45905, c3199M46641);
            return c6925M45905;
        }
        throw new C3870("Expected float value", c3199M46641);
    }

    /* JADX INFO: renamed from: ᩳ */
    public static C6925 m30852(C20337 c20337, C12210 c12210, C20635 c20635) throws C3870 {
        int i;
        C3199 c3199M46641 = c20635.m46641();
        String strM5533 = c3199M46641.m5533();
        C9091 c9091 = new C9091();
        if (C11774.m27010(strM5533, c9091) && (i = c9091.f24648) == 5) {
            C6925 c6925M45905 = c20337.m45905(c9091.f24647, i, -1);
            c12210.m28189(c6925M45905, c3199M46641);
            return c6925M45905;
        }
        throw new C3870("Expected dimen value", c3199M46641);
    }

    /* JADX INFO: renamed from: ܳ */
    public static C6925 m30849(C20337 c20337, C12210 c12210, C20635 c20635) throws C3870 {
        int i;
        C3199 c3199M46641 = c20635.m46641();
        String strM5533 = c3199M46641.m5533();
        C9091 c9091 = new C9091();
        if (C11774.m27010(strM5533, c9091) && (i = c9091.f24648) == 6) {
            C6925 c6925M45905 = c20337.m45905(c9091.f24647, i, -1);
            c12210.m28189(c6925M45905, c3199M46641);
            return c6925M45905;
        }
        throw new C3870("Expected fraction value", c3199M46641);
    }

    /* JADX INFO: renamed from: ᩻ */
    public static C6925 m30853(C20337 c20337, C12210 c12210, C20635 c20635) throws C3870 {
        C3199 c3199M46641 = c20635.m46641();
        String strM5533 = c3199M46641.m5533();
        C9091 c9091 = new C9091();
        if (C11774.m27013(strM5533, c9091)) {
            C6925 c6925M45905 = c20337.m45905(c9091.f24647, c9091.f24648, -1);
            c12210.m28189(c6925M45905, c3199M46641);
            return c6925M45905;
        }
        throw new C3870("Expected integer value", c3199M46641);
    }

    /* JADX INFO: renamed from: ۧ */
    public static C6925 m30848(C20337 c20337, C12210 c12210, C20635 c20635) throws C3870 {
        C3199 c3199M46641 = c20635.m46641();
        String strM5533 = c3199M46641.m5533();
        if (strM5533.equals("true")) {
            C6925 c6925M45905 = c20337.m45905(1, 18, -1);
            c12210.m28189(c6925M45905, c3199M46641);
            return c6925M45905;
        }
        if (strM5533.equals("false")) {
            C6925 c6925M45906 = c20337.m45905(0, 18, -1);
            c12210.m28189(c6925M45906, c3199M46641);
            return c6925M45906;
        }
        throw new C3870("Expected bool value", c3199M46641);
    }

    /* JADX INFO: renamed from: ܽ */
    public static C6925 m30850(C20337 c20337, C12210 c12210, C20635 c20635) throws C3870 {
        C3199 c3199M46641 = c20635.m46641();
        String strM5533 = c3199M46641.m5533();
        C9091 c9091 = new C9091();
        if (C11774.m27006(strM5533, c9091)) {
            C6925 c6925M45905 = c20337.m45905(c9091.f24647, c9091.f24648, -1);
            c12210.m28189(c6925M45905, c3199M46641);
            return c6925M45905;
        }
        throw new C3870("Color value invalid -- must be #rgb, #argb, #rrggbb, or #aarrggbb: ".concat(strM5533), c3199M46641);
    }
}
