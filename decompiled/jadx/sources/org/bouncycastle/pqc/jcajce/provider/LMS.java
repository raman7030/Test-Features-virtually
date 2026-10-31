package org.bouncycastle.pqc.jcajce.provider;

import l.C18515;
import l.C19462;
import l.C21639;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;

/* JADX INFO: loaded from: classes2.dex */
public class LMS {
    public static final String PREFIX = "org.bouncycastle.pqc.jcajce.provider.lms.";

    public class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sbM43029 = C18515.m43029(configurableProvider, "KeyFactory.LMS", "org.bouncycastle.pqc.jcajce.provider.lms.LMSKeyFactorySpi", "Alg.Alias.KeyFactory.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier = PKCSObjectIdentifiers.id_alg_hss_lms_hashsig;
            C19462.m44861(sbM43029, aSN1ObjectIdentifier, configurableProvider, "LMS");
            configurableProvider.addAlgorithm(C21639.m48907(configurableProvider, "KeyPairGenerator.LMS", "org.bouncycastle.pqc.jcajce.provider.lms.LMSKeyPairGeneratorSpi", "Alg.Alias.KeyPairGenerator.", aSN1ObjectIdentifier), "LMS");
            configurableProvider.addAlgorithm("Signature.LMS", "org.bouncycastle.pqc.jcajce.provider.lms.LMSSignatureSpi$generic");
            configurableProvider.addAlgorithm("Alg.Alias.Signature." + aSN1ObjectIdentifier, "LMS");
        }
    }
}
