package l;

/* JADX INFO: renamed from: l.ᩴ۬ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 98WG */
/* JADX INFO: loaded from: classes4.dex */
public final class C18773 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m43434(InterfaceC15243 interfaceC15243) {
        String str = ((AbstractC20184) interfaceC15243).f65321;
        if ("br".equals(str)) {
            return "\n";
        }
        if ("img".equals(str)) {
            String str2 = (String) interfaceC15243.attributes().get("alt");
            return (str2 == null || str2.length() == 0) ? "￼" : str2;
        }
        if ("iframe".equals(str)) {
            return EnumC9361.f28423;
        }
        return null;
    }
}
