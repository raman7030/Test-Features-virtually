package p067l;

/* JADX INFO: renamed from: l.ᩳۜۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 079R */
/* JADX INFO: loaded from: classes4.dex */
public final class C19365 {

    /* JADX INFO: renamed from: ֫ */
    public final String f57808;

    /* JADX INFO: renamed from: ۧ */
    public final String f57809;

    /* JADX INFO: renamed from: ܳ */
    public final String f57810;

    /* JADX INFO: renamed from: ܽ */
    public final String f57811;

    /* JADX INFO: renamed from: ܿ */
    public final String f57812;

    /* JADX INFO: renamed from: ᩳ */
    public final String f57813;

    public C19365(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f57813 = str;
        this.f57809 = str2;
        this.f57808 = str3;
        this.f57812 = str4;
        this.f57811 = str5;
        this.f57810 = str6;
    }

    /* JADX INFO: renamed from: ܽ */
    public static C19365 m44101(String str) {
        return new C19365("entry_text", str, null, null, null, null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C19365 m44097(String str) {
        return new C19365("axml", str, null, null, null, null);
    }

    /* JADX INFO: renamed from: ۧ */
    public static C19365 m44099(String str) {
        return new C19365("dex_class_smali", null, str, null, null, null);
    }

    /* JADX INFO: renamed from: ۧ */
    public static C19365 m44100(String str, String str2) {
        return new C19365("dex_method_smali", null, str, str2, null, null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C19365 m44098(String str, String str2) {
        return new C19365("dex_field_smali", null, str, null, str2, null);
    }

    /* JADX INFO: renamed from: ᩳ */
    public static C19365 m44102(String str) {
        return new C19365("resource_item", null, null, null, null, str);
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m44103() {
        String str = this.f57809;
        if (str != null) {
            return str;
        }
        String str2 = this.f57812;
        String str3 = this.f57808;
        if (str2 != null) {
            return str3 + " " + str2;
        }
        String str4 = this.f57811;
        if (str4 != null) {
            return str3 + " " + str4;
        }
        String str5 = this.f57810;
        return str5 != null ? str5 : str3;
    }
}
