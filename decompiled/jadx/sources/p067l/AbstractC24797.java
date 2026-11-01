package p067l;

/* JADX INFO: renamed from: l.᩻ۡᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 71Y3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24797 {

    /* JADX INFO: renamed from: ֫ */
    public final C18762 f79251;

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC7383 f79252;

    /* JADX INFO: renamed from: ֫ */
    public abstract String mo4127();

    /* JADX INFO: renamed from: ֫ */
    public abstract boolean mo41146(InterfaceC1209 interfaceC1209);

    public AbstractC24797(C18762 c18762, InterfaceC7383 interfaceC7383) {
        this.f79251 = c18762;
        this.f79252 = interfaceC7383;
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m54478(String str) {
        return !str.startsWith("L") ? str : str.substring(1, str.length() - 1).replace('/', '.');
    }

    /* JADX INFO: renamed from: ֫ */
    public static C3349 m54475(C18762 c18762, InterfaceC7568 interfaceC7568) {
        InterfaceC10509 interfaceC10509 = (InterfaceC10509) c18762.f56062.get(interfaceC7568.mo5853());
        if (interfaceC10509 == null || !EnumC17248.PUBLIC.m39032(interfaceC10509.mo5039())) {
            return null;
        }
        for (InterfaceC19897 interfaceC19897 : interfaceC10509.getMethods()) {
            if (interfaceC19897.equals(interfaceC7568)) {
                if (EnumC17248.PUBLIC.m39032(interfaceC19897.mo5854())) {
                    return (C3349) interfaceC19897;
                }
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m54477(InterfaceC7568 interfaceC7568, InterfaceC7568 interfaceC7569) {
        return interfaceC7568.mo5855().equals(interfaceC7569.mo5855()) && C3624.m6845(interfaceC7568.mo5852(), interfaceC7569.mo5852());
    }

    /* JADX INFO: renamed from: ֫ */
    public static C13929 m54476(String str) {
        if (str.indexOf(42) == -1) {
            return C13259.m30303(16, str).matcher((CharSequence) "");
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '*') {
                sb.append(".+");
            } else if (".^$[]*+?|(){}\\".indexOf(cCharAt) != -1) {
                sb.append('\\');
                sb.append(cCharAt);
            } else {
                sb.append(cCharAt);
            }
        }
        return C13259.m30304(sb.toString()).matcher((CharSequence) "");
    }
}
