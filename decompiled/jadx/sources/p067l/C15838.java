package p067l;

/* JADX INFO: renamed from: l.ܳ֡ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: N12S */
/* JADX INFO: loaded from: classes3.dex */
public final class C15838 {

    /* JADX INFO: renamed from: ֫ */
    public final String f45885;

    /* JADX INFO: renamed from: ۧ */
    public final String f45886;

    /* JADX INFO: renamed from: ܳ */
    public final String f45887;

    /* JADX INFO: renamed from: ܽ */
    public final long f45888;

    /* JADX INFO: renamed from: ܿ */
    public final String f45889;

    /* JADX INFO: renamed from: ᩳ */
    public final long f45890;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:24:0x0056  */
    /* JADX WARN: Code duplicated, block: B:29:0x005f  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a7  */
    public C15838(long j, long j2, String str, String str2) {
        String str3;
        String str4 = "zip";
        if (!str.equals("folder")) {
            String strM9383 = C4463.m9383(".".concat(str));
            strM9383.getClass();
            switch (strM9383) {
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
        this.f45889 = str3;
        if (!str2.equals("folder")) {
            String strM9384 = C4463.m9383(".".concat(str2));
            strM9384.getClass();
            switch (strM9384) {
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
        this.f45887 = str4;
        this.f45885 = str;
        this.f45886 = str2;
        this.f45888 = j;
        this.f45890 = j2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m35956(String str) {
        return str.equals(this.f45889) && str.equals(this.f45887);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m35955() {
        String str = this.f45889;
        boolean zEquals = "zip".equals(str);
        String str2 = this.f45887;
        if (zEquals && "apk".equals(str2)) {
            return true;
        }
        return "apk".equals(str) && "zip".equals(str2);
    }
}
