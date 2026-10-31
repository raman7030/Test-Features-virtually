package org.bouncycastle.jcajce.provider.asymmetric;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;
import l.C18473;
import l.C18515;
import l.C5127;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.internal.asn1.misc.MiscObjectIdentifiers;
import org.bouncycastle.jcajce.provider.asymmetric.compositesignatures.KeyFactorySpi;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;
import org.bouncycastle.jcajce.util.ProviderJcaJceHelper;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* JADX INFO: loaded from: classes.dex */
public class COMPOSITE {
    public static final String PREFIX = "org.bouncycastle.jcajce.provider.asymmetric.COMPOSITE";
    public static AsymmetricKeyInfoConverter baseConverter;
    public static final Map compositeAttributes;

    /* JADX INFO: loaded from: classes2.dex */
    public class KeyFactory extends BaseKeyFactorySpi {
        @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
        public PrivateKey generatePrivate(PrivateKeyInfo privateKeyInfo) {
            return COMPOSITE.baseConverter.generatePrivate(privateKeyInfo);
        }

        @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
        public PublicKey generatePublic(SubjectPublicKeyInfo subjectPublicKeyInfo) {
            return COMPOSITE.baseConverter.generatePublic(subjectPublicKeyInfo);
        }

        @Override // java.security.KeyFactorySpi
        public Key engineTranslateKey(Key key) throws InvalidKeyException {
            try {
                if (key instanceof PrivateKey) {
                    return generatePrivate(PrivateKeyInfo.getInstance(key.getEncoded()));
                }
                if (key instanceof PublicKey) {
                    return generatePublic(SubjectPublicKeyInfo.getInstance(key.getEncoded()));
                }
                throw new InvalidKeyException("key not recognized");
            } catch (IOException e) {
                throw new InvalidKeyException(C5127.m14678(e, new StringBuilder("key could not be parsed: ")));
            }
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sbM43029 = C18515.m43029(configurableProvider, "KeyFactory.COMPOSITE", "org.bouncycastle.jcajce.provider.asymmetric.COMPOSITE$KeyFactory", "KeyFactory.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier = MiscObjectIdentifiers.id_alg_composite;
            StringBuilder sbM42951 = C18473.m42951("org.bouncycastle.jcajce.provider.asymmetric.COMPOSITE$KeyFactory", "KeyFactory.", C18473.m42951("org.bouncycastle.jcajce.provider.asymmetric.COMPOSITE$KeyFactory", "KeyFactory.OID.", sbM43029, aSN1ObjectIdentifier, configurableProvider), aSN1ObjectIdentifier, configurableProvider);
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = MiscObjectIdentifiers.id_composite_key;
            StringBuilder sbM42952 = C18473.m42951("org.bouncycastle.jcajce.provider.asymmetric.COMPOSITE$KeyFactory", "KeyFactory.OID.", sbM42951, aSN1ObjectIdentifier2, configurableProvider);
            sbM42952.append(aSN1ObjectIdentifier2);
            configurableProvider.addAlgorithm(sbM42952.toString(), "org.bouncycastle.jcajce.provider.asymmetric.COMPOSITE$KeyFactory");
            AsymmetricKeyInfoConverter unused = COMPOSITE.baseConverter = new KeyFactorySpi(new ProviderJcaJceHelper((BouncyCastleProvider) configurableProvider));
            configurableProvider.addKeyInfoConverter(aSN1ObjectIdentifier, COMPOSITE.baseConverter);
            configurableProvider.addKeyInfoConverter(aSN1ObjectIdentifier2, COMPOSITE.baseConverter);
        }
    }

    static {
        HashMap map = new HashMap();
        compositeAttributes = map;
        map.put("SupportedKeyClasses", "org.bouncycastle.jcajce.CompositePublicKey|org.bouncycastle.jcajce.CompositePrivateKey");
        map.put("SupportedKeyFormats", "PKCS#8|X.509");
    }
}
