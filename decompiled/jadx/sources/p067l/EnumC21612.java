package p067l;

/* JADX INFO: renamed from: l.᩶ܶ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: W3YL */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC21612 {
    IN_FILE(".filename"),
    ADDITIONAL_IN_FILE(".filename.additional"),
    IN_FILES(".plural"),
    ADDITIONAL_IN_FILES(".plural.additional");


    /* JADX INFO: renamed from: ᩸ */
    public final String f68113;

    EnumC21612(String str) {
        this.f68113 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public String m48817(String str) {
        StringBuilder sbM17248 = C7470.m17248(str);
        sbM17248.append(this.f68113);
        return sbM17248.toString();
    }
}
