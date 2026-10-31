package l;

/* JADX INFO: renamed from: l.ᩳۜۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 079R */
/* JADX INFO: loaded from: classes4.dex */
public final class C17884 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f54611;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f54612;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f54613;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f54614;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f54615;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f54616;

    public C17884(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f54616 = str;
        this.f54612 = str2;
        this.f54611 = str3;
        this.f54615 = str4;
        this.f54614 = str5;
        this.f54613 = str6;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C17884 m41854(String str) {
        return new C17884("entry_text", str, null, null, null, null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17884 m41850(String str) {
        return new C17884("axml", str, null, null, null, null);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C17884 m41852(String str) {
        return new C17884("dex_class_smali", null, str, null, null, null);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C17884 m41853(String str, String str2) {
        return new C17884("dex_method_smali", null, str, str2, null, null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17884 m41851(String str, String str2) {
        return new C17884("dex_field_smali", null, str, null, str2, null);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static C17884 m41855(String str) {
        return new C17884("resource_item", null, null, null, null, str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m41856() {
        String str = this.f54612;
        if (str != null) {
            return str;
        }
        String str2 = this.f54615;
        String str3 = this.f54611;
        if (str2 != null) {
            return str3 + " " + str2;
        }
        String str4 = this.f54614;
        if (str4 != null) {
            return str3 + " " + str4;
        }
        String str5 = this.f54613;
        return str5 != null ? str5 : str3;
    }
}
