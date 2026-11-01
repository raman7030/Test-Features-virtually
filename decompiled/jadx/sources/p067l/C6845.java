package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۙܳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 91EZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C6845 implements InterfaceC8186 {
    @Override // p067l.InterfaceC8186
    /* JADX INFO: renamed from: ֫ */
    public final void mo6237(C20337 c20337, C12210 c12210, C20635 c20635) throws C3870 {
        boolean zM27013 = true;
        c20337.m45913(true);
        C9091 c9091 = new C9091();
        C19964 c19964M46637 = c20635.m46637("parent");
        if (c19964M46637 != null) {
            String strM45304 = c19964M46637.m45304();
            Integer numM15679 = m15679(strM45304);
            if (numM15679 != null) {
                c9091.f24647 = numM15679.intValue();
                c9091.f24648 = 17;
            } else {
                zM27013 = C11774.m27013(strM45304, c9091);
            }
            if (!zM27013) {
                throw new C3870(C6988.m16053("Expected integer value: parent=\"", c19964M46637.m45304(), "\""), c19964M46637);
            }
            c20337.m45904(c9091.f24647);
        }
        Iterator itM46631 = C20635.m46631(c20635);
        while (itM46631.hasNext()) {
            C20635 c20636 = (C20635) itM46631.next();
            m15680(c20337, c12210, c20636).m15877(m15678(c20636, c9091));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m15678(C20635 c20635, C9091 c9091) throws C3870 {
        boolean zM27013;
        C19964 c19964M46637 = c20635.m46637("id");
        if (c19964M46637 == null) {
            return -1;
        }
        String strM45304 = c19964M46637.m45304();
        Integer numM15679 = m15679(strM45304);
        if (numM15679 != null) {
            c9091.f24647 = numM15679.intValue();
            c9091.f24648 = 17;
            zM27013 = true;
        } else {
            zM27013 = C11774.m27013(strM45304, c9091);
        }
        if (zM27013) {
            return c9091.f24647;
        }
        throw new C3870(C6988.m16053("Expected integer value: id=\"", c19964M46637.m45304(), "\""), c19964M46637);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Integer m15679(String str) {
        if (str.length() == 10 && str.regionMatches(true, 0, "0x", 0, 2)) {
            str = str.substring(2);
        }
        if (str.length() == 8 && C11774.m27005(str)) {
            return Integer.valueOf(C11774.m27008(str));
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ */
    public static C6925 m15680(C20337 c20337, C12210 c12210, C20635 c20635) throws C3870 {
        String strM46644 = c20635.m46644();
        strM46644.getClass();
        switch (strM46644) {
            case "dynamic-attribute":
                C6925 c6925M30842 = C13551.m30842(c20337, c12210, c20635);
                c6925M30842.m15878(8);
                return c6925M30842;
            case "fraction":
                return C13551.m30849(c20337, c12210, c20635);
            case "reference":
                return C13551.m30843(c20337, c20635, c12210, true);
            case "string":
                return C13551.m30847(c20337, c12210, c20635);
            case "bool":
                return C13551.m30848(c20337, c12210, c20635);
            case "attribute":
                return C13551.m30842(c20337, c12210, c20635);
            case "color":
                return C13551.m30850(c20337, c12210, c20635);
            case "dimen":
                return C13551.m30852(c20337, c12210, c20635);
            case "float":
                return C13551.m30851(c20337, c12210, c20635);
            case "dynamic-reference":
                C6925 c6925M30843 = C13551.m30843(c20337, c20635, c12210, false);
                c6925M30843.m15878(7);
                return c6925M30843;
            case "integer":
                return C13551.m30853(c20337, c12210, c20635);
            default:
                throw new C3870("Unknown tag <" + c20635.m46644() + ">", c20635);
        }
    }
}
