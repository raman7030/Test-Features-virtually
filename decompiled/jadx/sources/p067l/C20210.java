package p067l;

/* JADX INFO: renamed from: l.ᩴ۬ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 98WG */
/* JADX INFO: loaded from: classes4.dex */
public final class C20210 {
    /* JADX INFO: renamed from: ֫ */
    public static String m45702(InterfaceC16855 interfaceC16855) {
        String str = ((AbstractC21551) interfaceC16855).f67969;
        if ("br".equals(str)) {
            return "\n";
        }
        if ("img".equals(str)) {
            String str2 = (String) interfaceC16855.attributes().get("alt");
            return (str2 == null || str2.length() == 0) ? "￼" : str2;
        }
        if ("iframe".equals(str)) {
            return EnumC11265.f31372;
        }
        return null;
    }
}
