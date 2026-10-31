package org.bouncycastle.pqc.crypto.xwing;

import org.bouncycastle.crypto.EncapsulatedSecretExtractor;
import org.bouncycastle.crypto.params.X25519PublicKeyParameters;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMExtractor;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class XWingKEMExtractor implements EncapsulatedSecretExtractor {
    public static final int MLKEM_CIPHERTEXT_SIZE = 1088;
    public final XWingPrivateKeyParameters key;
    public final MLKEMExtractor mlkemExtractor;

    public XWingKEMExtractor(XWingPrivateKeyParameters xWingPrivateKeyParameters) {
        this.key = xWingPrivateKeyParameters;
        this.mlkemExtractor = new MLKEMExtractor(xWingPrivateKeyParameters.getKyberPrivateKey());
    }

    @Override // org.bouncycastle.crypto.EncapsulatedSecretExtractor
    public byte[] extractSecret(byte[] bArr) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 1088);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, 1088, bArr.length);
        byte[] bArrComputeSSX = XWingKEMGenerator.computeSSX(new X25519PublicKeyParameters(bArrCopyOfRange2, 0), this.key.getXDHPrivateKey());
        byte[] bArrComputeSharedSecret = XWingKEMGenerator.computeSharedSecret(this.key.getXDHPublicKey().getEncoded(), this.mlkemExtractor.extractSecret(bArrCopyOfRange), bArrCopyOfRange2, bArrComputeSSX);
        Arrays.clear(bArrComputeSSX);
        return bArrComputeSharedSecret;
    }

    @Override // org.bouncycastle.crypto.EncapsulatedSecretExtractor
    public int getEncapsulationLength() {
        return this.mlkemExtractor.getEncapsulationLength() + 32;
    }
}
