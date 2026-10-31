package org.bouncycastle.pqc.jcajce.provider;

import l.C18515;
import l.C19462;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.pqc.jcajce.provider.bike.BIKEKeyFactorySpi;

/* JADX INFO: loaded from: classes2.dex */
public class BIKE {
    public static final String PREFIX = "org.bouncycastle.pqc.jcajce.provider.bike.";

    public class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("KeyFactory.BIKE", "org.bouncycastle.pqc.jcajce.provider.bike.BIKEKeyFactorySpi");
            configurableProvider.addAlgorithm("KeyPairGenerator.BIKE", "org.bouncycastle.pqc.jcajce.provider.bike.BIKEKeyPairGeneratorSpi");
            configurableProvider.addAlgorithm("KeyGenerator.BIKE", "org.bouncycastle.pqc.jcajce.provider.bike.BIKEKeyGeneratorSpi");
            BIKEKeyFactorySpi bIKEKeyFactorySpi = new BIKEKeyFactorySpi();
            StringBuilder sbM43029 = C18515.m43029(configurableProvider, "Cipher.BIKE", "org.bouncycastle.pqc.jcajce.provider.bike.BIKECipherSpi$Base", "Alg.Alias.Cipher.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier = BCObjectIdentifiers.pqc_kem_bike;
            C19462.m44861(sbM43029, aSN1ObjectIdentifier, configurableProvider, "BIKE");
            addCipherAlgorithm(configurableProvider, "BIKE128", "org.bouncycastle.pqc.jcajce.provider.bike.BIKECipherSpi$BIKE128", BCObjectIdentifiers.bike128);
            addCipherAlgorithm(configurableProvider, "BIKE192", "org.bouncycastle.pqc.jcajce.provider.bike.BIKECipherSpi$BIKE192", BCObjectIdentifiers.bike192);
            addCipherAlgorithm(configurableProvider, "BIKE256", "org.bouncycastle.pqc.jcajce.provider.bike.BIKECipherSpi$BIKE256", BCObjectIdentifiers.bike256);
            registerOid(configurableProvider, aSN1ObjectIdentifier, "BIKE", bIKEKeyFactorySpi);
        }
    }
}
