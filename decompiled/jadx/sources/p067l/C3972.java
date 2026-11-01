package p067l;

/* JADX INFO: renamed from: l.֫۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N3OT */
/* JADX INFO: loaded from: classes2.dex */
public final class C3972 {

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC4643 f8632;

    /* JADX INFO: renamed from: ۧ */
    public final C12194 f8633;

    /* JADX INFO: renamed from: ֫ */
    public static C3972 m7920(String str, String str2, AbstractC4643 abstractC4643) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        StringBuilder sb = new StringBuilder("form-data; name=");
        C12690.m29200(sb, str);
        if (str2 != null) {
            sb.append("; filename=");
            C12690.m29200(sb, str2);
        }
        C14205 c14205 = new C14205();
        String string = sb.toString();
        C12194.m28160("Content-Disposition");
        c14205.m32681("Content-Disposition", string);
        C12194 c12194 = new C12194(c14205);
        if (c12194.m28162("Content-Type") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Type");
        }
        if (c12194.m28162("Content-Length") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Length");
        }
        return new C3972(c12194, abstractC4643);
    }

    public C3972(C12194 c12194, AbstractC4643 abstractC4643) {
        this.f8633 = c12194;
        this.f8632 = abstractC4643;
    }
}
