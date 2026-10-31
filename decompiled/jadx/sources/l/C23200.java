package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: l.᩺᩵ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: UB7S */
/* JADX INFO: loaded from: classes.dex */
public final class C23200 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public EnumC0622 f74578;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f74579 = false;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public EnumC11912 f74580;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m51490(C10501 c10501, int i, ArrayList arrayList, int i2) {
        C6267 c6267 = (C6267) c10501.f31498.get(i);
        AbstractC19261 abstractC19261 = (AbstractC19261) arrayList.get(i2);
        if (!m51489(c6267, abstractC19261)) {
            return false;
        }
        EnumC19674 enumC19674 = c6267.f19407;
        if (enumC19674 == EnumC19674.DESCENDANT) {
            if (i != 0) {
                while (i2 > 0) {
                    i2--;
                    if (m51490(c10501, i - 1, arrayList, i2)) {
                    }
                }
                return false;
            }
            return true;
        }
        if (enumC19674 == EnumC19674.CHILD) {
            return m51490(c10501, i - 1, arrayList, i2 - 1);
        }
        int iM51485 = m51485(arrayList, i2, abstractC19261);
        if (iM51485 <= 0) {
            return false;
        }
        return m51491(c10501, i - 1, arrayList, i2, (AbstractC19261) abstractC19261.f16091.getChildren().get(iM51485 - 1));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m51491(C10501 c10501, int i, ArrayList arrayList, int i2, AbstractC19261 abstractC19261) {
        C6267 c6267 = (C6267) c10501.f31498.get(i);
        if (!m51489(c6267, abstractC19261)) {
            return false;
        }
        EnumC19674 enumC19674 = c6267.f19407;
        if (enumC19674 == EnumC19674.DESCENDANT) {
            if (i != 0) {
                while (i2 >= 0) {
                    if (!m51490(c10501, i - 1, arrayList, i2)) {
                        i2--;
                    }
                }
                return false;
            }
            return true;
        }
        if (enumC19674 == EnumC19674.CHILD) {
            return m51490(c10501, i - 1, arrayList, i2);
        }
        int iM51485 = m51485(arrayList, i2, abstractC19261);
        if (iM51485 <= 0) {
            return false;
        }
        return m51491(c10501, i - 1, arrayList, i2, (AbstractC19261) abstractC19261.f16091.getChildren().get(iM51485 - 1));
    }

    public C23200(EnumC0622 enumC0622, EnumC11912 enumC11912) {
        this.f74578 = enumC0622;
        this.f74580 = enumC11912;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12617 m51495(String str) {
        C18968 c18968 = new C18968(str);
        c18968.m45643();
        return m51493(c18968);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m51488(String str, EnumC0622 enumC0622) {
        C18968 c18968 = new C18968(str);
        c18968.m45643();
        for (EnumC0622 enumC0623 : m51486(c18968)) {
            if (enumC0623 == EnumC0622.all || enumC0623 == enumC0622) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m51486(C18968 c18968) {
        ArrayList arrayList = new ArrayList();
        while (!c18968.m45644()) {
            String str = c18968.f64100;
            String strSubstring = null;
            if (!c18968.m45644()) {
                int i = c18968.f64103;
                char cCharAt = str.charAt(i);
                if ((cCharAt >= 'A' && cCharAt <= 'Z') || (cCharAt >= 'a' && cCharAt <= 'z')) {
                    int iM45637 = c18968.m45637();
                    while (true) {
                        if ((iM45637 < 65 || iM45637 > 90) && (iM45637 < 97 || iM45637 > 122)) {
                            break;
                        }
                        iM45637 = c18968.m45637();
                    }
                    strSubstring = str.substring(i, c18968.f64103);
                } else {
                    c18968.f64103 = i;
                }
            }
            if (strSubstring == null) {
                break;
            }
            try {
                arrayList.add(EnumC0622.valueOf(strSubstring));
            } catch (IllegalArgumentException unused) {
            }
            if (!c18968.m45649()) {
                break;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m51487(C12617 c12617, C18968 c18968) throws C9090 {
        int iIntValue;
        String strM43802 = c18968.m43802();
        c18968.m45643();
        if (strM43802 == null) {
            throw new C9090("Invalid '@' rule");
        }
        int i = 0;
        if (!this.f74579 && strM43802.equals("media")) {
            ArrayList arrayListM51486 = m51486(c18968);
            if (!c18968.m45640('{')) {
                throw new C9090("Invalid @media rule: missing rule set");
            }
            c18968.m45643();
            Iterator it = arrayListM51486.iterator();
            while (true) {
                if (!it.hasNext()) {
                    m51493(c18968);
                    break;
                }
                EnumC0622 enumC0622 = (EnumC0622) it.next();
                if (enumC0622 == EnumC0622.all || enumC0622 == this.f74578) {
                    this.f74579 = true;
                    c12617.m30878(m51493(c18968));
                    this.f74579 = false;
                    break;
                }
            }
            if (!c18968.m45644() && !c18968.m45640('}')) {
                throw new C9090("Invalid @media rule: expected '}' at end of rule set");
            }
        } else if (this.f74579 || !strM43802.equals("import")) {
            while (!c18968.m45644() && ((iIntValue = c18968.m45646().intValue()) != 59 || i != 0)) {
                if (iIntValue != 123) {
                    if (iIntValue == 125 && i > 0 && (i = i - 1) == 0) {
                        break;
                    }
                } else {
                    i++;
                }
            }
        } else {
            String strM43800 = c18968.m43800();
            if (strM43800 == null) {
                strM43800 = c18968.m43801();
            }
            if (strM43800 == null) {
                throw new C9090("Invalid @import rule: expected string or url()");
            }
            c18968.m45643();
            m51486(c18968);
            if (!c18968.m45644() && !c18968.m45640(';')) {
                throw new C9090("Invalid @media rule: expected '}' at end of rule set");
            }
        }
        c18968.m45643();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private C12617 m51493(C18968 c18968) {
        C12617 c12617 = new C12617();
        while (!c18968.m45644()) {
            try {
                if (!c18968.m45641("<!--") && !c18968.m45641("-->")) {
                    if (c18968.m45640('@')) {
                        m51487(c12617, c18968);
                    } else if (!m51494(c12617, c18968)) {
                        break;
                    }
                }
            } catch (C9090 e) {
                e.getMessage();
                return c12617;
            }
        }
        return c12617;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m51494(C12617 c12617, C18968 c18968) throws C9090 {
        ArrayList<C10501> arrayListM43798 = c18968.m43798();
        if (arrayListM43798 == null || arrayListM43798.isEmpty()) {
            return false;
        }
        if (!c18968.m45640('{')) {
            throw new C9090("Malformed rule block: expected '{'");
        }
        c18968.m45643();
        C20672 c20672 = new C20672();
        do {
            String strM43802 = c18968.m43802();
            c18968.m45643();
            if (!c18968.m45640(':')) {
                throw new C9090("Expected ':'");
            }
            c18968.m45643();
            String str = c18968.f64100;
            String strSubstring = null;
            if (!c18968.m45644()) {
                int i = c18968.f64103;
                int iCharAt = str.charAt(i);
                int i2 = i;
                while (iCharAt != -1 && iCharAt != 59 && iCharAt != 125 && iCharAt != 33 && iCharAt != 10 && iCharAt != 13) {
                    if (!C19842.m45635(iCharAt)) {
                        i2 = c18968.f64103 + 1;
                    }
                    iCharAt = c18968.m45637();
                }
                if (c18968.f64103 > i) {
                    strSubstring = str.substring(i, i2);
                } else {
                    c18968.f64103 = i;
                }
            }
            if (strSubstring == null) {
                throw new C9090("Expected property value");
            }
            c18968.m45643();
            if (c18968.m45640('!')) {
                c18968.m45643();
                if (!c18968.m45641("important")) {
                    throw new C9090("Malformed rule set: found unexpected '!'");
                }
                c18968.m45643();
            }
            c18968.m45640(';');
            C2908.m8868(c20672, strM43802, strSubstring);
            c18968.m45643();
            if (c18968.m45644()) {
                break;
            }
        } while (!c18968.m45640('}'));
        c18968.m45643();
        for (C10501 c10501 : arrayListM43798) {
            C13322 c13322 = new C13322();
            c13322.f39872 = c10501;
            c13322.f39874 = c20672;
            c13322.f39873 = this.f74580;
            c12617.m30879(c13322);
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m51492(C10501 c10501, AbstractC19261 abstractC19261) {
        ArrayList arrayList = new ArrayList();
        Object obj = abstractC19261.f16091;
        while (true) {
            if (obj == null) {
                break;
            }
            arrayList.add(0, obj);
            obj = ((C5149) obj).f16091;
        }
        int size = arrayList.size() - 1;
        ArrayList arrayList2 = c10501.f31498;
        if ((arrayList2 == null ? 0 : arrayList2.size()) != 1) {
            ArrayList arrayList3 = c10501.f31498;
            return m51491(c10501, (arrayList3 != null ? arrayList3.size() : 0) - 1, arrayList, size, abstractC19261);
        }
        return m51489((C6267) c10501.f31498.get(0), abstractC19261);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m51485(ArrayList arrayList, int i, AbstractC19261 abstractC19261) {
        int i2 = 0;
        if (i < 0) {
            return 0;
        }
        Object obj = arrayList.get(i);
        InterfaceC3738 interfaceC3738 = abstractC19261.f16091;
        if (obj != interfaceC3738) {
            return -1;
        }
        Iterator it = interfaceC3738.getChildren().iterator();
        while (it.hasNext()) {
            if (((C5149) it.next()) == abstractC19261) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m51489(C6267 c6267, AbstractC19261 abstractC19261) {
        ArrayList arrayList;
        String str = c6267.f19409;
        if (str != null && !str.equals(abstractC19261.mo1457().toLowerCase(Locale.US))) {
            return false;
        }
        ArrayList<C16144> arrayList2 = c6267.f19406;
        if (arrayList2 != null) {
            for (C16144 c16144 : arrayList2) {
                String str2 = c16144.f49738;
                String str3 = c16144.f49740;
                if (str2.equals("id")) {
                    if (!str3.equals(abstractC19261.f60633)) {
                        return false;
                    }
                } else if (!str2.equals(Name.LABEL) || (arrayList = abstractC19261.f60634) == null || !arrayList.contains(str3)) {
                    return false;
                }
            }
        }
        ArrayList arrayList3 = c6267.f19408;
        if (arrayList3 == null) {
            return true;
        }
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            if (!((InterfaceC5562) it.next()).mo4662(abstractC19261)) {
                return false;
            }
        }
        return true;
    }
}
