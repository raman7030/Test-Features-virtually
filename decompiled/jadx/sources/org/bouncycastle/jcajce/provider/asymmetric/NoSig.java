package org.bouncycastle.jcajce.provider.asymmetric;

import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureSpi;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import p067l.C19925;
import p067l.C20865;

/* JADX INFO: loaded from: classes.dex */
public class NoSig {
    public static final String PREFIX = "org.bouncycastle.jcajce.provider.asymmetric.NoSig$";

    /* JADX INFO: loaded from: classes2.dex */
    public class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            C20865.m47157(C19925.m45227("org.bouncycastle.jcajce.provider.asymmetric.NoSig$SigSpi", "Signature.", new StringBuilder("Signature."), X509ObjectIdentifiers.id_alg_noSignature, configurableProvider), X509ObjectIdentifiers.id_alg_unsigned, configurableProvider, "org.bouncycastle.jcajce.provider.asymmetric.NoSig$SigSpi");
        }
    }

    public class SigSpi extends SignatureSpi {
        @Override // java.security.SignatureSpi
        public Object engineGetParameter(String str) {
            return null;
        }

        @Override // java.security.SignatureSpi
        public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
            throw new InvalidKeyException("attempt to pass private key to NoSig");
        }

        @Override // java.security.SignatureSpi
        public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
            throw new InvalidKeyException("attempt to pass public key to NoSig");
        }

        @Override // java.security.SignatureSpi
        public void engineSetParameter(String str, Object obj) {
        }

        @Override // java.security.SignatureSpi
        public byte[] engineSign() {
            return new byte[0];
        }

        @Override // java.security.SignatureSpi
        public void engineUpdate(byte b) {
        }

        @Override // java.security.SignatureSpi
        public void engineUpdate(byte[] bArr, int i, int i2) {
        }

        @Override // java.security.SignatureSpi
        public boolean engineVerify(byte[] bArr) {
            return false;
        }
    }
}
