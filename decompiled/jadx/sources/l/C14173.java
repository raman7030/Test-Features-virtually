package l;

/* JADX INFO: renamed from: l.ܳ֡ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: N12S */
/* JADX INFO: loaded from: classes3.dex */
public final class C14173 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f42798;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f42799;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f42800;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f42801;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f42802;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long f42803;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:24:0x0056  */
    /* JADX WARN: Code duplicated, block: B:29:0x005f  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a7  */
    public C14173(long j, long j2, String str, String str2) {
        String str3;
        String str4 = "zip";
        if (!str.equals("folder")) {
            String strM7304 = C2204.m7304(".".concat(str));
            strM7304.getClass();
            switch (strM7304) {
                case "application/vnd.android.package-archives":
                case "application/x-jar":
                case "application/zip":
                    str3 = "zip";
                    break;
                case "application/vnd.android.package-archive":
                    str3 = "apk";
                    break;
                default:
                    str3 = str;
                    break;
            }
        } else {
            str3 = str;
        }
        this.f42802 = str3;
        if (!str2.equals("folder")) {
            String strM7305 = C2204.m7304(".".concat(str2));
            strM7305.getClass();
            switch (strM7305) {
                case "application/vnd.android.package-archives":
                case "application/x-jar":
                case "application/zip":
                    break;
                case "application/vnd.android.package-archive":
                    str4 = "apk";
                    break;
                default:
                    str4 = str2;
                    break;
            }
        } else {
            str4 = str2;
        }
        this.f42800 = str4;
        this.f42798 = str;
        this.f42799 = str2;
        this.f42801 = j;
        this.f42803 = j2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m33824(String str) {
        return str.equals(this.f42802) && str.equals(this.f42800);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m33823() {
        String str = this.f42802;
        boolean zEquals = "zip".equals(str);
        String str2 = this.f42800;
        if (zEquals && "apk".equals(str2)) {
            return true;
        }
        return "apk".equals(str) && "zip".equals(str2);
    }
}
