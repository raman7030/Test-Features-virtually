package p067l;

import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;
import org.bouncycastle.crypto.generators.Poly1305KeyGenerator;
import org.bouncycastle.math.p080ec.rfc7748.X25519Field;

/* JADX INFO: renamed from: l.᩸᩷֨, reason: contains not printable characters */
/* JADX INFO: compiled from: G8EM */
/* JADX INFO: loaded from: classes.dex */
public final class C23107 implements InterfaceC12378 {

    /* JADX INFO: renamed from: ֫ */
    public int f72616;

    public C23107(int i) {
        this.f72616 = i;
    }

    @Override // p067l.InterfaceC12378
    /* JADX INFO: renamed from: ֫ */
    public final int mo12629(int i, int i2, byte[] bArr) {
        int i3 = (i2 + i) - 4;
        int i4 = i;
        while (i4 <= i3) {
            byte b = bArr[i4 + 3];
            if ((b & Poly1305KeyGenerator.R_MASK_LOW_2) == 148) {
                C19781.m44963(i4, ((C19781.m44962(i4, bArr) + (-(((this.f72616 + i4) - i) >>> 2))) & X25519Field.M26) | (-1811939328), bArr);
            } else if ((b & 159) == 144) {
                int iM44962 = C19781.m44962(i4, bArr);
                int i5 = ((iM44962 >>> 29) & 3) | ((iM44962 >>> 3) & 2097148);
                if (((i5 + WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) & 1835008) == 0) {
                    int i6 = i5 + (-(((this.f72616 + i4) - i) >>> 12));
                    C19781.m44963(i4, (iM44962 & (-1879048161)) | ((i6 & 3) << 29) | ((262140 & i6) << 3) | ((-(i6 & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT)) & 14680064), bArr);
                }
            }
            i4 += 4;
        }
        int i7 = i4 - i;
        this.f72616 += i7;
        return i7;
    }
}
