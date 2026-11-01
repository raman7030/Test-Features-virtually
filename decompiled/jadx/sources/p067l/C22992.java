package p067l;

import java.util.Set;

/* JADX INFO: renamed from: l.᩸ܽۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7AI */
/* JADX INFO: loaded from: classes.dex */
public final class C22992 {

    /* JADX INFO: renamed from: ֫ */
    public final C20310 f72300;

    /* JADX INFO: renamed from: ۜ */
    public final int f72301;

    /* JADX INFO: renamed from: ۧ */
    public C12974 f72302;

    /* JADX INFO: renamed from: ܳ */
    public final String f72303;

    /* JADX INFO: renamed from: ܽ */
    public C12974 f72304;

    /* JADX INFO: renamed from: ܿ */
    public C12974 f72305;

    /* JADX INFO: renamed from: ᩳ */
    public C14944 f72306;

    /* JADX INFO: renamed from: ᩷ */
    public final Set f72307;

    /* JADX INFO: renamed from: ᩻ */
    public final String f72308;

    public C22992(C20310 c20310, int i, String str, String str2, Set set) {
        this.f72300 = c20310;
        this.f72301 = i;
        this.f72308 = str;
        this.f72303 = str2;
        this.f72307 = set;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C15614 m51338() {
        String str;
        C14944 c14944 = this.f72306;
        String str2 = this.f72308;
        if (c14944 == null) {
            return new C15614(str2, true, null, null, null, null, null, false);
        }
        C12974 c12974 = this.f72305;
        if (c12974 == null && (c12974 = this.f72302) == null) {
            c12974 = this.f72304;
        }
        if (c12974 != null) {
            String str3 = c12974.f36502;
            String strM23604 = ("item_list".equals(str3) || "null_value".equals(str3) || "unparsed".equals(str3) || (str = c12974.f36491) == null) ? null : C10127.m23604(0, str.length(), 300, str);
            C14944 c14945 = this.f72306;
            return new C15614(str2, false, c14945.f42670, c14945.f42669, c12974.f36488, str3, strM23604, c12974.f36490);
        }
        return new C15614(str2, false, c14944.f42670, c14944.f42669, null, "null_value", null, false);
    }
}
