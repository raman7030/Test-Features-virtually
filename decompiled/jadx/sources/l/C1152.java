package l;

/* JADX INFO: renamed from: l.֨ܰۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 14MA */
/* JADX INFO: loaded from: classes2.dex */
public final class C1152 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final char[] f4170 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m3949(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            if (sb.length() > 0) {
                sb.append(' ');
            }
            char[] cArr = f4170;
            sb.append(cArr[(b >> 4) & 15]);
            sb.append(cArr[b & 15]);
        }
        return sb.toString();
    }
}
