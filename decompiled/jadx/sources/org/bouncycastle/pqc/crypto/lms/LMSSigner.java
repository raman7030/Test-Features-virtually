package org.bouncycastle.pqc.crypto.lms;

import java.io.IOException;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.pqc.crypto.MessageSigner;
import p067l.C7241;

/* JADX INFO: loaded from: classes2.dex */
public class LMSSigner implements MessageSigner {
    public LMSPrivateKeyParameters privKey;
    public LMSPublicKeyParameters pubKey;

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public void init(boolean z, CipherParameters cipherParameters) {
        if (z) {
            if (!(cipherParameters instanceof HSSPrivateKeyParameters)) {
                this.privKey = (LMSPrivateKeyParameters) cipherParameters;
                return;
            }
            HSSPrivateKeyParameters hSSPrivateKeyParameters = (HSSPrivateKeyParameters) cipherParameters;
            if (hSSPrivateKeyParameters.getL() != 1) {
                throw new IllegalArgumentException("only a single level HSS key can be used with LMS");
            }
            this.privKey = hSSPrivateKeyParameters.getRootKey();
            return;
        }
        if (!(cipherParameters instanceof HSSPublicKeyParameters)) {
            this.pubKey = (LMSPublicKeyParameters) cipherParameters;
            return;
        }
        HSSPublicKeyParameters hSSPublicKeyParameters = (HSSPublicKeyParameters) cipherParameters;
        if (hSSPublicKeyParameters.getL() != 1) {
            throw new IllegalArgumentException("only a single level HSS key can be used with LMS");
        }
        this.pubKey = hSSPublicKeyParameters.getLMSPublicKey();
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public byte[] generateSignature(byte[] bArr) {
        try {
            return LMS.generateSign(this.privKey, bArr).getEncoded();
        } catch (IOException e) {
            throw new IllegalStateException(C7241.m16586(e, new StringBuilder("unable to encode signature: ")));
        }
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public boolean verifySignature(byte[] bArr, byte[] bArr2) {
        try {
            return LMS.verifySignature(this.pubKey, LMSSignature.getInstance(bArr2), bArr);
        } catch (IOException e) {
            throw new IllegalStateException(C7241.m16586(e, new StringBuilder("unable to decode signature: ")));
        }
    }
}
