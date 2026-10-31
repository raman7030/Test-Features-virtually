package l;

import java.io.UnsupportedEncodingException;
import org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi;
import org.bouncycastle.util.encoders.Base32Encoder;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ۗܽ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 04DU */
/* JADX INFO: loaded from: classes2.dex */
public final class C3349 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final byte[] f10610 = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, UTF8.S_P4A, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, KeyFactorySpi.x25519_type, KeyFactorySpi.x448_type, KeyFactorySpi.Ed25519_type, KeyFactorySpi.Ed448_type, 114, 115, 116, 117, 118, 119, 120, 121, 122, UTF8.S_P3A, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m10248(byte[] bArr) {
        byte[] bArr2;
        byte[] bArr3 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i = 0;
        int i2 = 0;
        while (true) {
            bArr2 = f10610;
            if (i >= length) {
                break;
            }
            bArr3[i2] = bArr2[(bArr[i] & 255) >> 2];
            int i3 = i + 1;
            bArr3[i2 + 1] = bArr2[((bArr[i] & 3) << 4) | ((bArr[i3] & 255) >> 4)];
            int i4 = i2 + 3;
            int i5 = (bArr[i3] & 15) << 2;
            int i6 = i + 2;
            bArr3[i2 + 2] = bArr2[i5 | ((bArr[i6] & 255) >> 6)];
            i2 += 4;
            bArr3[i4] = bArr2[bArr[i6] & 63];
            i += 3;
        }
        int length2 = bArr.length % 3;
        if (length2 == 1) {
            bArr3[i2] = bArr2[(bArr[length] & 255) >> 2];
            bArr3[i2 + 1] = bArr2[(bArr[length] & 3) << 4];
            bArr3[i2 + 2] = Base32Encoder.DEFAULT_PADDING;
            bArr3[i2 + 3] = Base32Encoder.DEFAULT_PADDING;
        } else if (length2 == 2) {
            bArr3[i2] = bArr2[(bArr[length] & 255) >> 2];
            int i7 = (bArr[length] & 3) << 4;
            int i8 = length + 1;
            bArr3[i2 + 1] = bArr2[((bArr[i8] & 255) >> 4) | i7];
            bArr3[i2 + 2] = bArr2[(bArr[i8] & 15) << 2];
            bArr3[i2 + 3] = Base32Encoder.DEFAULT_PADDING;
        }
        try {
            return new String(bArr3, "US-ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }
}
