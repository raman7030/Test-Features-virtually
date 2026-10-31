package l;

/* JADX INFO: renamed from: l.ۚܰ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: U4WH */
/* JADX INFO: loaded from: classes2.dex */
public final class C5383 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final byte[] f16737 = {100, 101, 120, 10, 0, 0, 0, 0};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m15354(int i) {
        int i2;
        if (i > 23) {
            switch (i) {
                case 24:
                case 25:
                    i2 = 37;
                    break;
                case 26:
                case 27:
                    i2 = 38;
                    break;
                case 28:
                case 29:
                    i2 = 39;
                    break;
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                    i2 = 40;
                    break;
                case 35:
                    i2 = 41;
                    break;
                default:
                    i2 = -1;
                    break;
            }
        } else {
            i2 = 35;
        }
        byte[] bArr = (byte[]) f16737.clone();
        if (i2 < 0) {
            throw new IllegalArgumentException("dexVersion must be within [0, 999]");
        }
        for (int i3 = 6; i3 >= 4; i3--) {
            bArr[i3] = (byte) ((i2 % 10) + 48);
            i2 /= 10;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m15355(AbstractC3912 abstractC3912) {
        if (abstractC3912.length() < 8) {
            return false;
        }
        int i = 0;
        while (true) {
            byte[] bArr = f16737;
            if (i >= 4) {
                for (int i2 = 4; i2 < 7; i2++) {
                    if (abstractC3912.mo11933(i2) < 48 || abstractC3912.mo11933(i2) > 57) {
                        return false;
                    }
                }
                return abstractC3912.mo11933(7) == bArr[7];
            }
            if (abstractC3912.mo11933(i) != bArr[i]) {
                return false;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m15353(AbstractC3912 abstractC3912) {
        if (!m15355(abstractC3912)) {
            return -1;
        }
        return (abstractC3912.mo11933(6) - 48) + ((abstractC3912.mo11933(5) - 48) * 10) + ((abstractC3912.mo11933(4) - 48) * 100);
    }
}
