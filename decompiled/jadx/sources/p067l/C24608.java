package p067l;

import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.᩻ۖۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 99PI */
/* JADX INFO: loaded from: classes.dex */
public final class C24608 {

    /* JADX INFO: renamed from: ۧ */
    public final Set f77906;

    /* JADX INFO: renamed from: ܽ */
    public final HashMap f77907 = new HashMap();

    /* JADX INFO: renamed from: ֫ */
    public final boolean f77905 = true;

    public C24608(C7174[] c7174Arr) {
        this.f77906 = Collections.newSetFromMap(new IdentityHashMap(c7174Arr.length));
        for (C7174 c7174 : c7174Arr) {
            this.f77906.add(c7174);
            m54244(c7174);
        }
        for (C7174 c7175 : this.f77906) {
            try {
                m54248(c7175, c7175.m16487());
            } catch (C8515 e) {
                throw new AssertionError(e);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m54244(C7174 c7174) {
        for (C7174 c7175 : c7174.m16488()) {
            if (this.f77906.add(c7175)) {
                m54244(c7175);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x002d, code lost:
    
        if ((r0 instanceof p067l.C22598) != false) goto L23;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC3150 m54246(String str, EnumC15890 enumC15890) {
        AbstractC3150 abstractC3150 = (AbstractC3150) this.f77907.get(str);
        if (abstractC3150 != null) {
            if (enumC15890 == EnumC15890.ALL_SYMBOLS || (enumC15890 == EnumC15890.TYPES_ONLY && ((abstractC3150 instanceof C19244) || (abstractC3150 instanceof C11198)))) {
                return abstractC3150;
            }
            if (enumC15890 == EnumC15890.AGGREGATES_ONLY) {
                if (!(abstractC3150 instanceof C19244)) {
                    if (!(abstractC3150 instanceof C11198)) {
                        if (!(abstractC3150 instanceof C18573)) {
                        }
                    }
                }
                return abstractC3150;
            }
        }
        Iterator it = this.f77906.iterator();
        while (it.hasNext()) {
            AbstractC3150 abstractC3151 = (AbstractC3150) ((C7174) it.next()).f18731.f77907.get(str);
            if (abstractC3151 != null) {
                if (enumC15890 == EnumC15890.ALL_SYMBOLS || (enumC15890 == EnumC15890.TYPES_ONLY && ((abstractC3151 instanceof C19244) || (abstractC3151 instanceof C11198)))) {
                    return abstractC3151;
                }
                if (enumC15890 == EnumC15890.AGGREGATES_ONLY && ((abstractC3151 instanceof C19244) || (abstractC3151 instanceof C11198) || (abstractC3151 instanceof C18573) || (abstractC3151 instanceof C22598))) {
                    return abstractC3151;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC3150 m54245(String str, AbstractC3150 abstractC3150, EnumC15890 enumC15890) {
        AbstractC3150 abstractC3150M54246;
        String string;
        int i = 0;
        if (str.startsWith(".")) {
            string = str.substring(1);
            abstractC3150M54246 = m54246(string, enumC15890);
        } else {
            int iIndexOf = str.indexOf(46);
            String strSubstring = iIndexOf == -1 ? str : str.substring(0, iIndexOf);
            StringBuilder sb = new StringBuilder(abstractC3150.mo3542());
            while (true) {
                int iLastIndexOf = sb.lastIndexOf(".");
                if (iLastIndexOf == -1) {
                    abstractC3150M54246 = m54246(str, enumC15890);
                    string = str;
                    break;
                }
                int i2 = iLastIndexOf + 1;
                sb.setLength(i2);
                sb.append(strSubstring);
                AbstractC3150 abstractC3150M54247 = m54246(sb.toString(), EnumC15890.AGGREGATES_ONLY);
                if (abstractC3150M54247 != null) {
                    if (iIndexOf != -1) {
                        sb.setLength(i2);
                        sb.append(str);
                        abstractC3150M54246 = m54246(sb.toString(), enumC15890);
                    } else {
                        abstractC3150M54246 = abstractC3150M54247;
                    }
                    string = sb.toString();
                    break;
                }
                sb.setLength(iLastIndexOf);
            }
        }
        if (abstractC3150M54246 != null) {
            return abstractC3150M54246;
        }
        if (!this.f77905 || enumC15890 != EnumC15890.TYPES_ONLY) {
            throw new C8515(abstractC3150, C6988.m16053("\"", str, "\" is not defined."), i);
        }
        C23268.f73123.warning("The descriptor for message type \"" + str + "\" cannot be found and a placeholder is created for it");
        C19244 c19244 = new C19244(string);
        this.f77906.add(c19244.mo3535());
        return c19244;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m54248(C7174 c7174, String str) {
        String strSubstring;
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf == -1) {
            strSubstring = str;
        } else {
            m54248(c7174, str.substring(0, iLastIndexOf));
            strSubstring = str.substring(iLastIndexOf + 1);
        }
        C18573 c18573 = new C18573(strSubstring, str, c7174);
        HashMap map = this.f77907;
        AbstractC3150 abstractC3150 = (AbstractC3150) map.put(str, c18573);
        if (abstractC3150 != null) {
            map.put(str, abstractC3150);
            if (abstractC3150 instanceof C18573) {
                return;
            }
            StringBuilder sbM11879 = C5410.m11879("\"", strSubstring, "\" is already defined (as something other than a package) in file \"");
            sbM11879.append(abstractC3150.mo3535().getName());
            sbM11879.append("\".");
            throw new C8515(c7174, sbM11879.toString());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m54247(AbstractC3150 abstractC3150) {
        String name = abstractC3150.getName();
        int i = 0;
        if (name.length() == 0) {
            throw new C8515(abstractC3150, "Missing name.", i);
        }
        for (int i2 = 0; i2 < name.length(); i2++) {
            char cCharAt = name.charAt(i2);
            if (('a' > cCharAt || cCharAt > 'z') && (('A' > cCharAt || cCharAt > 'Z') && cCharAt != '_' && ('0' > cCharAt || cCharAt > '9' || i2 <= 0))) {
                throw new C8515(abstractC3150, C6988.m16053("\"", name, "\" is not a valid identifier."), i);
            }
        }
        String strMo3542 = abstractC3150.mo3542();
        HashMap map = this.f77907;
        AbstractC3150 abstractC3151 = (AbstractC3150) map.put(strMo3542, abstractC3150);
        if (abstractC3151 != null) {
            map.put(strMo3542, abstractC3151);
            if (abstractC3150.mo3535() != abstractC3151.mo3535()) {
                StringBuilder sbM11879 = C5410.m11879("\"", strMo3542, "\" is already defined in file \"");
                sbM11879.append(abstractC3151.mo3535().getName());
                sbM11879.append("\".");
                throw new C8515(abstractC3150, sbM11879.toString(), i);
            }
            int iLastIndexOf = strMo3542.lastIndexOf(46);
            if (iLastIndexOf == -1) {
                throw new C8515(abstractC3150, C6988.m16053("\"", strMo3542, "\" is already defined."), i);
            }
            throw new C8515(abstractC3150, "\"" + strMo3542.substring(iLastIndexOf + 1) + "\" is already defined in \"" + strMo3542.substring(0, iLastIndexOf) + "\".", i);
        }
    }
}
