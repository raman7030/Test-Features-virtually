package l;

import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.᩻ۖۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 99PI */
/* JADX INFO: loaded from: classes.dex */
public final class C23401 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Set f75160;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final HashMap f75161 = new HashMap();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f75159 = true;

    public C23401(C5057[] c5057Arr) {
        this.f75160 = Collections.newSetFromMap(new IdentityHashMap(c5057Arr.length));
        for (C5057 c5057 : c5057Arr) {
            this.f75160.add(c5057);
            m51846(c5057);
        }
        for (C5057 c5058 : this.f75160) {
            try {
                m51850(c5058, c5058.m14580());
            } catch (C6468 e) {
                throw new AssertionError(e);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m51846(C5057 c5057) {
        for (C5057 c5058 : c5057.m14581()) {
            if (this.f75160.add(c5058)) {
                m51846(c5058);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x002d, code lost:
    
        if ((r0 instanceof l.C21286) != false) goto L23;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC0823 m51848(String str, EnumC14228 enumC14228) {
        AbstractC0823 abstractC0823 = (AbstractC0823) this.f75161.get(str);
        if (abstractC0823 != null) {
            if (enumC14228 == EnumC14228.ALL_SYMBOLS || (enumC14228 == EnumC14228.TYPES_ONLY && ((abstractC0823 instanceof C17757) || (abstractC0823 instanceof C9291)))) {
                return abstractC0823;
            }
            if (enumC14228 == EnumC14228.AGGREGATES_ONLY) {
                if (!(abstractC0823 instanceof C17757)) {
                    if (!(abstractC0823 instanceof C9291)) {
                        if (!(abstractC0823 instanceof C17051)) {
                        }
                    }
                }
                return abstractC0823;
            }
        }
        Iterator it = this.f75160.iterator();
        while (it.hasNext()) {
            AbstractC0823 abstractC0824 = (AbstractC0823) ((C5057) it.next()).f15895.f75161.get(str);
            if (abstractC0824 != null) {
                if (enumC14228 == EnumC14228.ALL_SYMBOLS || (enumC14228 == EnumC14228.TYPES_ONLY && ((abstractC0824 instanceof C17757) || (abstractC0824 instanceof C9291)))) {
                    return abstractC0824;
                }
                if (enumC14228 == EnumC14228.AGGREGATES_ONLY && ((abstractC0824 instanceof C17757) || (abstractC0824 instanceof C9291) || (abstractC0824 instanceof C17051) || (abstractC0824 instanceof C21286))) {
                    return abstractC0824;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC0823 m51847(String str, AbstractC0823 abstractC0823, EnumC14228 enumC14228) {
        AbstractC0823 abstractC0823M51848;
        String string;
        int i = 0;
        if (str.startsWith(".")) {
            string = str.substring(1);
            abstractC0823M51848 = m51848(string, enumC14228);
        } else {
            int iIndexOf = str.indexOf(46);
            String strSubstring = iIndexOf == -1 ? str : str.substring(0, iIndexOf);
            StringBuilder sb = new StringBuilder(abstractC0823.mo1141());
            while (true) {
                int iLastIndexOf = sb.lastIndexOf(".");
                if (iLastIndexOf == -1) {
                    abstractC0823M51848 = m51848(str, enumC14228);
                    string = str;
                    break;
                }
                int i2 = iLastIndexOf + 1;
                sb.setLength(i2);
                sb.append(strSubstring);
                AbstractC0823 abstractC0823M51849 = m51848(sb.toString(), EnumC14228.AGGREGATES_ONLY);
                if (abstractC0823M51849 != null) {
                    if (iIndexOf != -1) {
                        sb.setLength(i2);
                        sb.append(str);
                        abstractC0823M51848 = m51848(sb.toString(), enumC14228);
                    } else {
                        abstractC0823M51848 = abstractC0823M51849;
                    }
                    string = sb.toString();
                    break;
                }
                sb.setLength(iLastIndexOf);
            }
        }
        if (abstractC0823M51848 != null) {
            return abstractC0823M51848;
        }
        if (!this.f75159 || enumC14228 != EnumC14228.TYPES_ONLY) {
            throw new C6468(abstractC0823, C4860.m14172("\"", str, "\" is not defined."), i);
        }
        C21991.f70408.warning("The descriptor for message type \"" + str + "\" cannot be found and a placeholder is created for it");
        C17757 c17757 = new C17757(string);
        this.f75160.add(c17757.mo1134());
        return c17757;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51850(C5057 c5057, String str) {
        String strSubstring;
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf == -1) {
            strSubstring = str;
        } else {
            m51850(c5057, str.substring(0, iLastIndexOf));
            strSubstring = str.substring(iLastIndexOf + 1);
        }
        C17051 c17051 = new C17051(strSubstring, str, c5057);
        HashMap map = this.f75161;
        AbstractC0823 abstractC0823 = (AbstractC0823) map.put(str, c17051);
        if (abstractC0823 != null) {
            map.put(str, abstractC0823);
            if (abstractC0823 instanceof C17051) {
                return;
            }
            StringBuilder sbM9834 = C3200.m9834("\"", strSubstring, "\" is already defined (as something other than a package) in file \"");
            sbM9834.append(abstractC0823.mo1134().getName());
            sbM9834.append("\".");
            throw new C6468(c5057, sbM9834.toString());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51849(AbstractC0823 abstractC0823) {
        String name = abstractC0823.getName();
        int i = 0;
        if (name.length() == 0) {
            throw new C6468(abstractC0823, "Missing name.", i);
        }
        for (int i2 = 0; i2 < name.length(); i2++) {
            char cCharAt = name.charAt(i2);
            if (('a' > cCharAt || cCharAt > 'z') && (('A' > cCharAt || cCharAt > 'Z') && cCharAt != '_' && ('0' > cCharAt || cCharAt > '9' || i2 <= 0))) {
                throw new C6468(abstractC0823, C4860.m14172("\"", name, "\" is not a valid identifier."), i);
            }
        }
        String strMo1141 = abstractC0823.mo1141();
        HashMap map = this.f75161;
        AbstractC0823 abstractC0824 = (AbstractC0823) map.put(strMo1141, abstractC0823);
        if (abstractC0824 != null) {
            map.put(strMo1141, abstractC0824);
            if (abstractC0823.mo1134() != abstractC0824.mo1134()) {
                StringBuilder sbM9834 = C3200.m9834("\"", strMo1141, "\" is already defined in file \"");
                sbM9834.append(abstractC0824.mo1134().getName());
                sbM9834.append("\".");
                throw new C6468(abstractC0823, sbM9834.toString(), i);
            }
            int iLastIndexOf = strMo1141.lastIndexOf(46);
            if (iLastIndexOf == -1) {
                throw new C6468(abstractC0823, C4860.m14172("\"", strMo1141, "\" is already defined."), i);
            }
            throw new C6468(abstractC0823, "\"" + strMo1141.substring(iLastIndexOf + 1) + "\" is already defined in \"" + strMo1141.substring(0, iLastIndexOf) + "\".", i);
        }
    }
}
