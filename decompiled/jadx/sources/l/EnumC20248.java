package l;

/* JADX INFO: renamed from: l.᩶ܶ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: W3YL */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC20248 {
    IN_FILE(".filename"),
    ADDITIONAL_IN_FILE(".filename.additional"),
    IN_FILES(".plural"),
    ADDITIONAL_IN_FILES(".plural.additional");


    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f65464;

    EnumC20248(String str) {
        this.f65464 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String m46496(String str) {
        StringBuilder sbM15339 = C5368.m15339(str);
        sbM15339.append(this.f65464);
        return sbM15339.toString();
    }
}
