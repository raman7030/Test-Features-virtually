package l;

/* JADX INFO: renamed from: l.֫۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N3OT */
/* JADX INFO: loaded from: classes2.dex */
public final class C1687 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC2393 f5853;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C10338 f5854;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C1687 m5687(String str, String str2, AbstractC2393 abstractC2393) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        StringBuilder sb = new StringBuilder("form-data; name=");
        C10860.m27155(sb, str);
        if (str2 != null) {
            sb.append("; filename=");
            C10860.m27155(sb, str2);
        }
        C12454 c12454 = new C12454();
        String string = sb.toString();
        C10338.m26135("Content-Disposition");
        c12454.m30616("Content-Disposition", string);
        C10338 c10338 = new C10338(c12454);
        if (c10338.m26137("Content-Type") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Type");
        }
        if (c10338.m26137("Content-Length") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Length");
        }
        return new C1687(c10338, abstractC2393);
    }

    public C1687(C10338 c10338, AbstractC2393 abstractC2393) {
        this.f5854 = c10338;
        this.f5853 = abstractC2393;
    }
}
