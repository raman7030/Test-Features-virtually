package org.bouncycastle.pqc.jcajce.provider;

import l.C18515;
import l.C19462;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.pqc.jcajce.provider.frodo.FrodoKeyFactorySpi;

/* JADX INFO: loaded from: classes2.dex */
public class Frodo {
    public static final String PREFIX = "org.bouncycastle.pqc.jcajce.provider.frodo.";

    public class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("KeyFactory.FRODO", "org.bouncycastle.pqc.jcajce.provider.frodo.FrodoKeyFactorySpi");
            configurableProvider.addAlgorithm("KeyPairGenerator.FRODO", "org.bouncycastle.pqc.jcajce.provider.frodo.FrodoKeyPairGeneratorSpi");
            configurableProvider.addAlgorithm("KeyGenerator.FRODO", "org.bouncycastle.pqc.jcajce.provider.frodo.FrodoKeyGeneratorSpi");
            FrodoKeyFactorySpi frodoKeyFactorySpi = new FrodoKeyFactorySpi();
            StringBuilder sbM43029 = C18515.m43029(configurableProvider, "Cipher.FRODO", "org.bouncycastle.pqc.jcajce.provider.frodo.FrodoCipherSpi$Base", "Alg.Alias.Cipher.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier = BCObjectIdentifiers.pqc_kem_frodo;
            C19462.m44861(sbM43029, aSN1ObjectIdentifier, configurableProvider, "FRODO");
            registerOid(configurableProvider, aSN1ObjectIdentifier, "Frodo", frodoKeyFactorySpi);
        }
    }
}
