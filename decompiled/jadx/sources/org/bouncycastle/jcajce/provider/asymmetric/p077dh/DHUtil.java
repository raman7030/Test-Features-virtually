package org.bouncycastle.jcajce.provider.asymmetric.p077dh;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1BMPString$$ExternalSyntheticOutline0;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Fingerprint;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes.dex */
public class DHUtil {
    public static String generateKeyFingerprint(BigInteger bigInteger, DHParameters dHParameters) {
        return new Fingerprint(Arrays.concatenate(bigInteger.toByteArray(), dHParameters.getP().toByteArray(), dHParameters.getG().toByteArray())).toString();
    }

    public static String privateKeyToString(String str, BigInteger bigInteger, DHParameters dHParameters) {
        StringBuilder sb = new StringBuilder();
        String strLineSeparator = Strings.lineSeparator();
        BigInteger bigIntegerModPow = dHParameters.getG().modPow(bigInteger, dHParameters.getP());
        sb.append(str);
        sb.append(" Private Key [");
        ASN1BMPString$$ExternalSyntheticOutline0.m55303m(sb, generateKeyFingerprint(bigIntegerModPow, dHParameters), "]", strLineSeparator, "              Y: ");
        sb.append(bigIntegerModPow.toString(16));
        sb.append(strLineSeparator);
        return sb.toString();
    }

    public static String publicKeyToString(String str, BigInteger bigInteger, DHParameters dHParameters) {
        StringBuilder sb = new StringBuilder();
        String strLineSeparator = Strings.lineSeparator();
        sb.append(str);
        sb.append(" Public Key [");
        ASN1BMPString$$ExternalSyntheticOutline0.m55303m(sb, generateKeyFingerprint(bigInteger, dHParameters), "]", strLineSeparator, "             Y: ");
        sb.append(bigInteger.toString(16));
        sb.append(strLineSeparator);
        return sb.toString();
    }
}
