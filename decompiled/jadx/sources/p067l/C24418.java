package p067l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: l.᩺᩵ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: UB7S */
/* JADX INFO: loaded from: classes.dex */
public final class C24418 {

    /* JADX INFO: renamed from: ֫ */
    public EnumC2960 f77321;

    /* JADX INFO: renamed from: ۧ */
    public boolean f77322 = false;

    /* JADX INFO: renamed from: ܽ */
    public EnumC13690 f77323;

    /* JADX INFO: renamed from: ֫ */
    public static boolean m53886(C12349 c12349, int i, ArrayList arrayList, int i2) {
        C8325 c8325 = (C8325) c12349.f34460.get(i);
        AbstractC20674 abstractC20674 = (AbstractC20674) arrayList.get(i2);
        if (!m53885(c8325, abstractC20674)) {
            return false;
        }
        EnumC21067 enumC21067 = c8325.f22270;
        if (enumC21067 == EnumC21067.DESCENDANT) {
            if (i != 0) {
                while (i2 > 0) {
                    i2--;
                    if (m53886(c12349, i - 1, arrayList, i2)) {
                    }
                }
                return false;
            }
            return true;
        }
        if (enumC21067 == EnumC21067.CHILD) {
            return m53886(c12349, i - 1, arrayList, i2 - 1);
        }
        int iM53881 = m53881(arrayList, i2, abstractC20674);
        if (iM53881 <= 0) {
            return false;
        }
        return m53887(c12349, i - 1, arrayList, i2, (AbstractC20674) abstractC20674.f18930.getChildren().get(iM53881 - 1));
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m53887(C12349 c12349, int i, ArrayList arrayList, int i2, AbstractC20674 abstractC20674) {
        C8325 c8325 = (C8325) c12349.f34460.get(i);
        if (!m53885(c8325, abstractC20674)) {
            return false;
        }
        EnumC21067 enumC21067 = c8325.f22270;
        if (enumC21067 == EnumC21067.DESCENDANT) {
            if (i != 0) {
                while (i2 >= 0) {
                    if (!m53886(c12349, i - 1, arrayList, i2)) {
                        i2--;
                    }
                }
                return false;
            }
            return true;
        }
        if (enumC21067 == EnumC21067.CHILD) {
            return m53886(c12349, i - 1, arrayList, i2);
        }
        int iM53881 = m53881(arrayList, i2, abstractC20674);
        if (iM53881 <= 0) {
            return false;
        }
        return m53887(c12349, i - 1, arrayList, i2, (AbstractC20674) abstractC20674.f18930.getChildren().get(iM53881 - 1));
    }

    public C24418(EnumC2960 enumC2960, EnumC13690 enumC13690) {
        this.f77321 = enumC2960;
        this.f77323 = enumC13690;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C14360 m53891(String str) {
        C20396 c20396 = new C20396(str);
        c20396.m47954();
        return m53889(c20396);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m53884(String str, EnumC2960 enumC2960) {
        C20396 c20396 = new C20396(str);
        c20396.m47954();
        for (EnumC2960 enumC2961 : m53882(c20396)) {
            if (enumC2961 == EnumC2960.all || enumC2961 == enumC2960) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m53882(C20396 c20396) {
        ArrayList arrayList = new ArrayList();
        while (!c20396.m47955()) {
            String str = c20396.f66737;
            String strSubstring = null;
            if (!c20396.m47955()) {
                int i = c20396.f66740;
                char cCharAt = str.charAt(i);
                if ((cCharAt >= 'A' && cCharAt <= 'Z') || (cCharAt >= 'a' && cCharAt <= 'z')) {
                    int iM47948 = c20396.m47948();
                    while (true) {
                        if ((iM47948 < 65 || iM47948 > 90) && (iM47948 < 97 || iM47948 > 122)) {
                            break;
                        }
                        iM47948 = c20396.m47948();
                    }
                    strSubstring = str.substring(i, c20396.f66740);
                } else {
                    c20396.f66740 = i;
                }
            }
            if (strSubstring == null) {
                break;
            }
            try {
                arrayList.add(EnumC2960.valueOf(strSubstring));
            } catch (IllegalArgumentException unused) {
            }
            if (!c20396.m47960()) {
                break;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m53883(C14360 c14360, C20396 c20396) throws C11008 {
        int iIntValue;
        String strM46069 = c20396.m46069();
        c20396.m47954();
        if (strM46069 == null) {
            throw new C11008("Invalid '@' rule");
        }
        int i = 0;
        if (!this.f77322 && strM46069.equals("media")) {
            ArrayList arrayListM53882 = m53882(c20396);
            if (!c20396.m47951('{')) {
                throw new C11008("Invalid @media rule: missing rule set");
            }
            c20396.m47954();
            Iterator it = arrayListM53882.iterator();
            while (true) {
                if (!it.hasNext()) {
                    m53889(c20396);
                    break;
                }
                EnumC2960 enumC2960 = (EnumC2960) it.next();
                if (enumC2960 == EnumC2960.all || enumC2960 == this.f77321) {
                    this.f77322 = true;
                    c14360.m32955(m53889(c20396));
                    this.f77322 = false;
                    break;
                }
            }
            if (!c20396.m47955() && !c20396.m47951('}')) {
                throw new C11008("Invalid @media rule: expected '}' at end of rule set");
            }
        } else if (this.f77322 || !strM46069.equals("import")) {
            while (!c20396.m47955() && ((iIntValue = c20396.m47957().intValue()) != 59 || i != 0)) {
                if (iIntValue != 123) {
                    if (iIntValue == 125 && i > 0 && (i = i - 1) == 0) {
                        break;
                    }
                } else {
                    i++;
                }
            }
        } else {
            String strM46067 = c20396.m46067();
            if (strM46067 == null) {
                strM46067 = c20396.m46068();
            }
            if (strM46067 == null) {
                throw new C11008("Invalid @import rule: expected string or url()");
            }
            c20396.m47954();
            m53882(c20396);
            if (!c20396.m47955() && !c20396.m47951(';')) {
                throw new C11008("Invalid @media rule: expected '}' at end of rule set");
            }
        }
        c20396.m47954();
    }

    /* JADX INFO: renamed from: ۧ */
    private C14360 m53889(C20396 c20396) {
        C14360 c14360 = new C14360();
        while (!c20396.m47955()) {
            try {
                if (!c20396.m47952("<!--") && !c20396.m47952("-->")) {
                    if (c20396.m47951('@')) {
                        m53883(c14360, c20396);
                    } else if (!m53890(c14360, c20396)) {
                        break;
                    }
                }
            } catch (C11008 e) {
                e.getMessage();
                return c14360;
            }
        }
        return c14360;
    }

    /* JADX INFO: renamed from: ۧ */
    private boolean m53890(C14360 c14360, C20396 c20396) throws C11008 {
        ArrayList<C12349> arrayListM46065 = c20396.m46065();
        if (arrayListM46065 == null || arrayListM46065.isEmpty()) {
            return false;
        }
        if (!c20396.m47951('{')) {
            throw new C11008("Malformed rule block: expected '{'");
        }
        c20396.m47954();
        C22015 c22015 = new C22015();
        do {
            String strM46069 = c20396.m46069();
            c20396.m47954();
            if (!c20396.m47951(':')) {
                throw new C11008("Expected ':'");
            }
            c20396.m47954();
            String str = c20396.f66737;
            String strSubstring = null;
            if (!c20396.m47955()) {
                int i = c20396.f66740;
                int iCharAt = str.charAt(i);
                int i2 = i;
                while (iCharAt != -1 && iCharAt != 59 && iCharAt != 125 && iCharAt != 33 && iCharAt != 10 && iCharAt != 13) {
                    if (!C21226.m47946(iCharAt)) {
                        i2 = c20396.f66740 + 1;
                    }
                    iCharAt = c20396.m47948();
                }
                if (c20396.f66740 > i) {
                    strSubstring = str.substring(i, i2);
                } else {
                    c20396.f66740 = i;
                }
            }
            if (strSubstring == null) {
                throw new C11008("Expected property value");
            }
            c20396.m47954();
            if (c20396.m47951('!')) {
                c20396.m47954();
                if (!c20396.m47952("important")) {
                    throw new C11008("Malformed rule set: found unexpected '!'");
                }
                c20396.m47954();
            }
            c20396.m47951(';');
            C5132.m10935(c22015, strM46069, strSubstring);
            c20396.m47954();
            if (c20396.m47955()) {
                break;
            }
        } while (!c20396.m47951('}'));
        c20396.m47954();
        for (C12349 c12349 : arrayListM46065) {
            C15030 c15030 = new C15030();
            c15030.f42938 = c12349;
            c15030.f42940 = c22015;
            c15030.f42939 = this.f77323;
            c14360.m32956(c15030);
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m53888(C12349 c12349, AbstractC20674 abstractC20674) {
        ArrayList arrayList = new ArrayList();
        Object obj = abstractC20674.f18930;
        while (true) {
            if (obj == null) {
                break;
            }
            arrayList.add(0, obj);
            obj = ((C7262) obj).f18930;
        }
        int size = arrayList.size() - 1;
        ArrayList arrayList2 = c12349.f34460;
        if ((arrayList2 == null ? 0 : arrayList2.size()) != 1) {
            ArrayList arrayList3 = c12349.f34460;
            return m53887(c12349, (arrayList3 != null ? arrayList3.size() : 0) - 1, arrayList, size, abstractC20674);
        }
        return m53885((C8325) c12349.f34460.get(0), abstractC20674);
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m53881(ArrayList arrayList, int i, AbstractC20674 abstractC20674) {
        int i2 = 0;
        if (i < 0) {
            return 0;
        }
        Object obj = arrayList.get(i);
        InterfaceC5921 interfaceC5921 = abstractC20674.f18930;
        if (obj != interfaceC5921) {
            return -1;
        }
        Iterator it = interfaceC5921.getChildren().iterator();
        while (it.hasNext()) {
            if (((C7262) it.next()) == abstractC20674) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m53885(C8325 c8325, AbstractC20674 abstractC20674) {
        ArrayList arrayList;
        String str = c8325.f22272;
        if (str != null && !str.equals(abstractC20674.mo3870().toLowerCase(Locale.US))) {
            return false;
        }
        ArrayList<C17712> arrayList2 = c8325.f22269;
        if (arrayList2 != null) {
            for (C17712 c17712 : arrayList2) {
                String str2 = c17712.f52904;
                String str3 = c17712.f52906;
                if (str2.equals("id")) {
                    if (!str3.equals(abstractC20674.f63863)) {
                        return false;
                    }
                } else if (!str2.equals(Name.LABEL) || (arrayList = abstractC20674.f63864) == null || !arrayList.contains(str3)) {
                    return false;
                }
            }
        }
        ArrayList arrayList3 = c8325.f22271;
        if (arrayList3 == null) {
            return true;
        }
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            if (!((InterfaceC7655) it.next()).mo6894(abstractC20674)) {
                return false;
            }
        }
        return true;
    }
}
