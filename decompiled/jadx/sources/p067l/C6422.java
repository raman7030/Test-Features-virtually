package p067l;

/* JADX INFO: renamed from: l.ۘ᩻֨, reason: contains not printable characters */
/* JADX INFO: compiled from: L1T5 */
/* JADX INFO: loaded from: classes2.dex */
public class C6422 {

    /* JADX INFO: renamed from: ֫ */
    public static volatile C6422 f16625;

    /* JADX INFO: renamed from: ֫ */
    public void mo7197(byte[] bArr) {
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo7198(int[] iArr) {
    }

    static {
        C6422 c6422 = new C6422();
        String property = System.getProperty("org.tukaani.xz.ArrayCache");
        if (property == null) {
            property = "Dummy";
        }
        if (property.equals("Basic")) {
            f16625 = C7763.f20377;
        } else {
            if (!property.equals("Dummy")) {
                throw new Error(C6988.m16053("Unsupported value '", property, "' in the system property org.tukaani.xz.ArrayCache. Supported values: Dummy, Basic"));
            }
            f16625 = c6422;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C6422 m14707() {
        return f16625;
    }

    /* JADX INFO: renamed from: ֫ */
    public byte[] mo7199(int i) {
        return new byte[i];
    }

    /* JADX INFO: renamed from: ֫ */
    public int[] mo7200(int i, boolean z) {
        return new int[i];
    }
}
