package p067l;

/* JADX INFO: renamed from: l.᩻᩸ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5NZ */
/* JADX INFO: loaded from: classes.dex */
public final class C25145 {

    /* JADX INFO: renamed from: ֫ */
    public Byte[] f80474;

    /* JADX INFO: renamed from: ۧ */
    public String f80475;

    /* JADX INFO: renamed from: ֫ */
    public static boolean m55199(C25145 c25145, byte[] bArr) {
        c25145.getClass();
        int length = bArr.length;
        Byte[] bArr2 = c25145.f80474;
        if (length >= bArr2.length) {
            for (int i = 0; i < bArr2.length; i++) {
                Byte b = bArr2[i];
                if (b == null || b.byteValue() == bArr[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public C25145(String str, String str2) {
        this.f80475 = str;
        String[] strArrSplit = str2.split(" ");
        this.f80474 = new Byte[strArrSplit.length];
        for (int i = 0; i < strArrSplit.length; i++) {
            String str3 = strArrSplit[i];
            if (str3.length() != 2) {
                throw new RuntimeException(str2);
            }
            if (!str3.equals("??")) {
                this.f80474[i] = Byte.valueOf((byte) Integer.parseInt(str3, 16));
            }
        }
    }
}
