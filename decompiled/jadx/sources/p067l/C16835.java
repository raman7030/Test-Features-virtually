package p067l;

import com.google.android.material.color.ColorResourcesTableCreator;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.StringTokenizer;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;

/* JADX INFO: renamed from: l.ܶ۫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: S9JY */
/* JADX INFO: loaded from: classes4.dex */
public final class C16835 extends AbstractC20209 {
    @Override // p067l.AbstractC20209
    /* JADX INFO: renamed from: ֫ */
    public final int mo15481(AbstractC7468 abstractC7468) {
        C22872 c22872 = (C22872) abstractC7468;
        if (c22872.f74989 == null) {
            m38175(c22872);
        }
        return c22872.f74989.length;
    }

    @Override // p067l.AbstractC20209
    /* JADX INFO: renamed from: ֫ */
    public final void mo15482(AbstractC7468 abstractC7468, C17525 c17525) throws IOException {
        C22872 c22872 = (C22872) abstractC7468;
        if (c22872.f74989 == null) {
            m38175(c22872);
        }
        c17525.write(c22872.f74989);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m38175(C22872 c22872) {
        String str = c22872.f72006;
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
        c22872.f74989 = byteArrayOutputStream.toByteArray();
    }
}
