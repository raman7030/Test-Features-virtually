package p067l;

/* JADX INFO: renamed from: l.֨ܰۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 14MA */
/* JADX INFO: loaded from: classes2.dex */
public final class C3463 {

    /* JADX INFO: renamed from: ֫ */
    public static final char[] f6939 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: ֫ */
    public static String m6190(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            if (sb.length() > 0) {
                sb.append(' ');
            }
            char[] cArr = f6939;
            sb.append(cArr[(b >> 4) & 15]);
            sb.append(cArr[b & 15]);
        }
        return sb.toString();
    }
}
