package l;

/* JADX INFO: renamed from: l.᩻ۡᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 71Y3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23599 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17249 f76507;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5276 f76508;

    /* JADX INFO: renamed from: ֫ */
    public abstract String mo1729();

    /* JADX INFO: renamed from: ֫ */
    public abstract boolean mo38920(InterfaceC7397 interfaceC7397);

    public AbstractC23599(C17249 c17249, InterfaceC5276 interfaceC5276) {
        this.f76507 = c17249;
        this.f76508 = interfaceC5276;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m52075(String str) {
        return !str.startsWith("L") ? str : str.substring(1, str.length() - 1).replace('/', '.');
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C1032 m52072(C17249 c17249, InterfaceC5471 interfaceC5471) {
        InterfaceC8566 interfaceC8566 = (InterfaceC8566) c17249.f52880.get(interfaceC5471.mo3566());
        if (interfaceC8566 == null || !EnumC15657.PUBLIC.m36866(interfaceC8566.mo2700())) {
            return null;
        }
        for (InterfaceC18444 interfaceC18444 : interfaceC8566.getMethods()) {
            if (interfaceC18444.equals(interfaceC5471)) {
                if (EnumC15657.PUBLIC.m36866(interfaceC18444.mo3567())) {
                    return (C1032) interfaceC18444;
                }
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m52074(InterfaceC5471 interfaceC5471, InterfaceC5471 interfaceC5472) {
        return interfaceC5471.mo3568().equals(interfaceC5472.mo3568()) && C1321.m4613(interfaceC5471.mo3565(), interfaceC5472.mo3565());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C12164 m52073(String str) {
        if (str.indexOf(42) == -1) {
            return C11459.m28259(16, str).matcher((CharSequence) "");
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
        return C11459.m28260(sb.toString()).matcher((CharSequence) "");
    }
}
