package l;

/* JADX INFO: renamed from: l.᩻᩸ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5NZ */
/* JADX INFO: loaded from: classes.dex */
public final class C23965 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Byte[] f77722;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f77723;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m52793(C23965 c23965, byte[] bArr) {
        c23965.getClass();
        int length = bArr.length;
        Byte[] bArr2 = c23965.f77722;
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

    public C23965(String str, String str2) {
        this.f77723 = str;
        String[] strArrSplit = str2.split(" ");
        this.f77722 = new Byte[strArrSplit.length];
        for (int i = 0; i < strArrSplit.length; i++) {
            String str3 = strArrSplit[i];
            if (str3.length() != 2) {
                throw new RuntimeException(str2);
            }
            if (!str3.equals("??")) {
                this.f77722[i] = Byte.valueOf((byte) Integer.parseInt(str3, 16));
            }
        }
    }
}
