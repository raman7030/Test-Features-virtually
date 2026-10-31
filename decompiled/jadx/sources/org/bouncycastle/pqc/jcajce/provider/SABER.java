package org.bouncycastle.pqc.jcajce.provider;

import l.C18515;
import l.C19462;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.pqc.jcajce.provider.saber.SABERKeyFactorySpi;

/* JADX INFO: loaded from: classes2.dex */
public class SABER {
    public static final String PREFIX = "org.bouncycastle.pqc.jcajce.provider.saber.";

    public class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("KeyFactory.SABER", "org.bouncycastle.pqc.jcajce.provider.saber.SABERKeyFactorySpi");
            configurableProvider.addAlgorithm("KeyPairGenerator.SABER", "org.bouncycastle.pqc.jcajce.provider.saber.SABERKeyPairGeneratorSpi");
            configurableProvider.addAlgorithm("KeyGenerator.SABER", "org.bouncycastle.pqc.jcajce.provider.saber.SABERKeyGeneratorSpi");
            SABERKeyFactorySpi sABERKeyFactorySpi = new SABERKeyFactorySpi();
            StringBuilder sbM43029 = C18515.m43029(configurableProvider, "Cipher.SABER", "org.bouncycastle.pqc.jcajce.provider.saber.SABERCipherSpi$Base", "Alg.Alias.Cipher.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier = BCObjectIdentifiers.pqc_kem_saber;
            C19462.m44861(sbM43029, aSN1ObjectIdentifier, configurableProvider, "SABER");
            registerOid(configurableProvider, aSN1ObjectIdentifier, "SABER", sABERKeyFactorySpi);
            registerOidAlgorithmParameters(configurableProvider, aSN1ObjectIdentifier, "SABER");
        }
    }
}
