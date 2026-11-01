package p067l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.۟᩶ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 91US */
/* JADX INFO: loaded from: classes3.dex */
public final class C9682 extends AbstractC5050 implements InterfaceC10825, InterfaceC4790 {

    /* JADX INFO: renamed from: ۧ */
    public final C8034 f26678;

    /* JADX INFO: renamed from: ܽ */
    public final HashMap f26679;

    public C9682(C23292 c23292) {
        super(2);
        C8034 c8034 = new C8034();
        this.f26678 = c8034;
        this.f26679 = new HashMap();
        c23292.m51873(new C15716(this));
        c8034.mo18622(c23292.m51870());
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0042  */
    @Override // p067l.AbstractC5050, p067l.InterfaceC10825
    /* JADX INFO: renamed from: ֫ */
    public final void mo3627(C5187 c5187) {
        String strSubstring;
        String string;
        String strSubstring2;
        if (m22565(c5187) == null) {
            C5187 c5187M11129 = c5187.m11129();
            C8034 c8034 = this.f26678;
            if (c5187M11129 != null) {
                mo3627(c5187M11129);
                strSubstring = c5187M11129.mo14965() + "$";
                String strM48106 = c5187.m48106();
                int iLastIndexOf = strM48106.lastIndexOf(36);
                if (iLastIndexOf != -1) {
                    strSubstring2 = strM48106.substring(iLastIndexOf + 1);
                    if (!strSubstring2.matches("[0-9]+")) {
                        strSubstring2 = null;
                    }
                } else {
                    strSubstring2 = null;
                }
                if (strSubstring2 != null) {
                    String strM40053 = C17588.m40053(strSubstring, strSubstring2);
                    int iHashCode = strM40053.hashCode();
                    if (!c8034.contains(iHashCode)) {
                        c8034.add(iHashCode);
                        c5187.mo14967((Object) strM40053);
                        return;
                    }
                }
            } else {
                String strM48107 = c5187.m48106();
                int iLastIndexOf2 = strM48107.lastIndexOf(47);
                strSubstring = iLastIndexOf2 == -1 ? "" : strM48107.substring(0, iLastIndexOf2 + 1);
            }
            HashMap map = this.f26679;
            AbstractC3214 abstractC3214M5552 = (AbstractC3214) map.get(strSubstring);
            if (abstractC3214M5552 == null) {
                abstractC3214M5552 = AbstractC3214.m5552();
                map.put(strSubstring, abstractC3214M5552);
            }
            do {
                StringBuilder sbM17248 = C7470.m17248(strSubstring);
                sbM17248.append(abstractC3214M5552.mo5553());
                string = sbM17248.toString();
            } while (c8034.contains(string.hashCode()));
            c8034.add(string.hashCode());
            c5187.mo14967((Object) string);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static String m22565(C5187 c5187) {
        Object objMo14965 = c5187.mo14965();
        if (objMo14965 instanceof String) {
            return (String) objMo14965;
        }
        return null;
    }
}
