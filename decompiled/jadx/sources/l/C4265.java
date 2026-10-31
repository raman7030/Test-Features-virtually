package l;

/* JADX INFO: renamed from: l.ۘ᩻֨, reason: contains not printable characters */
/* JADX INFO: compiled from: L1T5 */
/* JADX INFO: loaded from: classes2.dex */
public class C4265 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static volatile C4265 f13808;

    /* JADX INFO: renamed from: ֫ */
    public void mo4954(byte[] bArr) {
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo4955(int[] iArr) {
    }

    static {
        C4265 c4265 = new C4265();
        String property = System.getProperty("org.tukaani.xz.ArrayCache");
        if (property == null) {
            property = "Dummy";
        }
        if (property.equals("Basic")) {
            f13808 = C5676.f17530;
        } else {
            if (!property.equals("Dummy")) {
                throw new Error(C4860.m14172("Unsupported value '", property, "' in the system property org.tukaani.xz.ArrayCache. Supported values: Dummy, Basic"));
            }
            f13808 = c4265;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C4265 m12843() {
        return f13808;
    }

    /* JADX INFO: renamed from: ֫ */
    public byte[] mo4956(int i) {
        return new byte[i];
    }

    /* JADX INFO: renamed from: ֫ */
    public int[] mo4957(int i, boolean z) {
        return new int[i];
    }
}
