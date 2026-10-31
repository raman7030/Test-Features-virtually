package org.bouncycastle.jcajce.provider.symmetric;

import l.C12662;
import l.C18473;
import l.C19462;
import l.C20382;
import l.C5368;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.engines.RC4Engine;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes.dex */
public final class ARC4 {

    /* JADX INFO: loaded from: classes2.dex */
    public class Base extends BaseStreamCipher {
        public Base() {
            super(new RC4Engine(), 0);
        }
    }

    public class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("RC4", 128, new CipherKeyGenerator());
        }
    }

    public class Mappings extends AlgorithmProvider {
        public static final String PREFIX = ARC4.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            C12662.m30943(str, "$Base", "Cipher.ARC4", sb, configurableProvider);
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", PKCSObjectIdentifiers.rc4, "ARC4");
            C12662.m30943(str, "$KeyGen", "KeyGenerator.ARC4", C20382.m46696("Alg.Alias.Cipher.ARCFOUR", "ARC4", "Alg.Alias.Cipher.RC4", "ARC4", configurableProvider), configurableProvider);
            StringBuilder sbM15340 = C5368.m15340(str, "$PBEWithSHAAnd128BitKeyFactory", "SecretKeyFactory.PBEWITHSHAAND128BITRC4", C20382.m46696("Alg.Alias.KeyGenerator.RC4", "ARC4", "Alg.Alias.KeyGenerator.1.2.840.113549.3.4", "ARC4", configurableProvider), configurableProvider);
            sbM15340.append(str);
            sbM15340.append("$PBEWithSHAAnd40BitKeyFactory");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHSHAAND40BITRC4", sbM15340.toString());
            StringBuilder sb2 = new StringBuilder("Alg.Alias.AlgorithmParameters.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier = PKCSObjectIdentifiers.pbeWithSHAAnd128BitRC4;
            StringBuilder sbM42951 = C18473.m42951("PKCS12PBE", "Alg.Alias.AlgorithmParameters.", sb2, aSN1ObjectIdentifier, configurableProvider);
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = PKCSObjectIdentifiers.pbeWithSHAAnd40BitRC4;
            C19462.m44861(sbM42951, aSN1ObjectIdentifier2, configurableProvider, "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND40BITRC4", "PKCS12PBE");
            C12662.m30943(str, "$PBEWithSHAAnd40Bit", "Cipher.PBEWITHSHAAND40BITRC4", C5368.m15340(str, "$PBEWithSHAAnd128Bit", "Cipher.PBEWITHSHAAND128BITRC4", C20382.m46696("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND128BITRC4", "PKCS12PBE", "Alg.Alias.AlgorithmParameters.PBEWITHSHAANDRC4", "PKCS12PBE", configurableProvider), configurableProvider), configurableProvider);
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", aSN1ObjectIdentifier, "PBEWITHSHAAND128BITRC4");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", aSN1ObjectIdentifier2, "PBEWITHSHAAND40BITRC4");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND128BITRC4", "PBEWITHSHAAND128BITRC4");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND40BITRC4", "PBEWITHSHAAND40BITRC4");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", aSN1ObjectIdentifier, "PBEWITHSHAAND128BITRC4");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", aSN1ObjectIdentifier2, "PBEWITHSHAAND40BITRC4");
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class PBEWithSHAAnd128Bit extends BaseStreamCipher {
        public PBEWithSHAAnd128Bit() {
            super(new RC4Engine(), 0, 128, 1);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class PBEWithSHAAnd128BitKeyFactory extends PBESecretKeyFactory {
        public PBEWithSHAAnd128BitKeyFactory() {
            super("PBEWithSHAAnd128BitRC4", PKCSObjectIdentifiers.pbeWithSHAAnd128BitRC4, true, 2, 1, 128, 0);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class PBEWithSHAAnd40Bit extends BaseStreamCipher {
        public PBEWithSHAAnd40Bit() {
            super(new RC4Engine(), 0, 40, 1);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class PBEWithSHAAnd40BitKeyFactory extends PBESecretKeyFactory {
        public PBEWithSHAAnd40BitKeyFactory() {
            super("PBEWithSHAAnd128BitRC4", PKCSObjectIdentifiers.pbeWithSHAAnd128BitRC4, true, 2, 1, 40, 0);
        }
    }
}
