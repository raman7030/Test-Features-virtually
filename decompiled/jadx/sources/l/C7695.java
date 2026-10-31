package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.۟᩶ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 91US */
/* JADX INFO: loaded from: classes3.dex */
public final class C7695 extends AbstractC2821 implements InterfaceC8898, InterfaceC2548 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C5961 f23765;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final HashMap f23766;

    public C7695(C22016 c22016) {
        super(2);
        C5961 c5961 = new C5961();
        this.f23765 = c5961;
        this.f23766 = new HashMap();
        c22016.m49537(new C14044(this));
        c5961.mo16696(c22016.m49534());
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0042  */
    @Override // l.AbstractC2821, l.InterfaceC8898
    /* JADX INFO: renamed from: ֫ */
    public final void mo1225(C2966 c2966) {
        String strSubstring;
        String string;
        String strSubstring2;
        if (m20585(c2966) == null) {
            C2966 c2966M9077 = c2966.m9077();
            C5961 c5961 = this.f23765;
            if (c2966M9077 != null) {
                mo1225(c2966M9077);
                strSubstring = c2966M9077.mo13101() + "$";
                String strM45794 = c2966.m45794();
                int iLastIndexOf = strM45794.lastIndexOf(36);
                if (iLastIndexOf != -1) {
                    strSubstring2 = strM45794.substring(iLastIndexOf + 1);
                    if (!strSubstring2.matches("[0-9]+")) {
                        strSubstring2 = null;
                    }
                } else {
                    strSubstring2 = null;
                }
                if (strSubstring2 != null) {
                    String strM37867 = C16014.m37867(strSubstring, strSubstring2);
                    int iHashCode = strM37867.hashCode();
                    if (!c5961.contains(iHashCode)) {
                        c5961.add(iHashCode);
                        c2966.mo13103((Object) strM37867);
                        return;
                    }
                }
            } else {
                String strM45795 = c2966.m45794();
                int iLastIndexOf2 = strM45795.lastIndexOf(47);
                strSubstring = iLastIndexOf2 == -1 ? "" : strM45795.substring(0, iLastIndexOf2 + 1);
            }
            HashMap map = this.f23766;
            AbstractC0890 abstractC0890M3238 = (AbstractC0890) map.get(strSubstring);
            if (abstractC0890M3238 == null) {
                abstractC0890M3238 = AbstractC0890.m3238();
                map.put(strSubstring, abstractC0890M3238);
            }
            do {
                StringBuilder sbM15339 = C5368.m15339(strSubstring);
                sbM15339.append(abstractC0890M3238.mo3239());
                string = sbM15339.toString();
            } while (c5961.contains(string.hashCode()));
            c5961.add(string.hashCode());
            c2966.mo13103((Object) string);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m20585(C2966 c2966) {
        Object objMo13101 = c2966.mo13101();
        if (objMo13101 instanceof String) {
            return (String) objMo13101;
        }
        return null;
    }
}
