package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.StringTokenizer;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;

/* JADX INFO: renamed from: l.ܶ۫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: S9JY */
/* JADX INFO: loaded from: classes4.dex */
public final class C15222 extends AbstractC18772 {
    @Override // l.AbstractC18772
    /* JADX INFO: renamed from: ֫ */
    public final int mo13606(AbstractC5366 abstractC5366) {
        C21574 c21574 = (C21574) abstractC5366;
        if (c21574.f72265 == null) {
            m36014(c21574);
        }
        return c21574.f72265.length;
    }

    @Override // l.AbstractC18772
    /* JADX INFO: renamed from: ֫ */
    public final void mo13607(AbstractC5366 abstractC5366, C15948 c15948) throws IOException {
        C21574 c21574 = (C21574) abstractC5366;
        if (c21574.f72265 == null) {
            m36014(c21574);
        }
        c15948.write(c21574.f72265);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m36014(C21574 c21574) {
        String str = c21574.f69304;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
        byteArrayOutputStream.write((Integer.parseInt(stringTokenizer.nextToken()) * 40) + Integer.parseInt(stringTokenizer.nextToken()));
        while (stringTokenizer.hasMoreTokens()) {
            BigInteger bigInteger = new BigInteger(stringTokenizer.nextToken());
            if (bigInteger.intValue() <= 0 || bigInteger.intValue() >= 127) {
                for (int iBitLength = ((bigInteger.bitLength() / 7) + (bigInteger.bitLength() % 7 > 0 ? 1 : 0)) - 1; iBitLength >= 0; iBitLength--) {
                    byte bByteValue = (byte) (bigInteger.shiftRight(iBitLength * 7).byteValue() & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID);
                    if (iBitLength > 0) {
                        bByteValue = (byte) (bByteValue | GCMSIVBlockCipher.MASK);
                    }
                    byteArrayOutputStream.write(bByteValue);
                }
            } else {
                byteArrayOutputStream.write(bigInteger.intValue());
            }
        }
        c21574.f72265 = byteArrayOutputStream.toByteArray();
    }
}
