package org.bouncycastle.jcajce.provider.util;

import java.util.Map;
import l.C19462;
import l.C22870;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: loaded from: classes.dex */
public abstract class AsymmetricAlgorithmProvider extends AlgorithmProvider {
    public void addSignatureAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        addSignatureAlgorithm(configurableProvider, str, str2, str3, null);
    }

    public void addSignatureAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        String strM50967 = C22870.m50967(str, "WITH", str2);
        String strM50968 = C22870.m50967(str, "with", str2);
        String strM50969 = C22870.m50967(str, "With", str2);
        String strM509610 = C22870.m50967(str, "/", str2);
        configurableProvider.addAlgorithm("Signature." + strM50967, str3);
        configurableProvider.addAlgorithm("Alg.Alias.Signature." + strM50968, strM50967);
        configurableProvider.addAlgorithm("Alg.Alias.Signature." + strM50969, strM50967);
        configurableProvider.addAlgorithm("Alg.Alias.Signature." + strM509610, strM50967);
        if (aSN1ObjectIdentifier != null) {
            configurableProvider.addAlgorithm("Alg.Alias.Signature." + aSN1ObjectIdentifier, strM50967);
            C19462.m44861(new StringBuilder("Alg.Alias.Signature.OID."), aSN1ObjectIdentifier, configurableProvider, strM50967);
        }
    }

    public void addSignatureAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3, ASN1ObjectIdentifier aSN1ObjectIdentifier, Map map) {
        String strM50967 = C22870.m50967(str, "WITH", str2);
        String strM50968 = C22870.m50967(str, "with", str2);
        String strM50969 = C22870.m50967(str, "With", str2);
        String strM509610 = C22870.m50967(str, "/", str2);
        configurableProvider.addAlgorithm("Signature." + strM50967, str3);
        configurableProvider.addAlgorithm("Alg.Alias.Signature." + strM50968, strM50967);
        configurableProvider.addAlgorithm("Alg.Alias.Signature." + strM50969, strM50967);
        configurableProvider.addAlgorithm("Alg.Alias.Signature." + strM509610, strM50967);
        if (aSN1ObjectIdentifier != null) {
            configurableProvider.addAlgorithm("Alg.Alias.Signature." + aSN1ObjectIdentifier, strM50967);
            C19462.m44861(new StringBuilder("Alg.Alias.Signature.OID."), aSN1ObjectIdentifier, configurableProvider, strM50967);
        }
        configurableProvider.addAttributes("Signature." + strM50967, map);
    }

    public void addSignatureAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        configurableProvider.addAlgorithm("Signature." + str, str2);
        if (aSN1ObjectIdentifier != null) {
            configurableProvider.addAlgorithm("Alg.Alias.Signature." + aSN1ObjectIdentifier, str);
            C19462.m44861(new StringBuilder("Alg.Alias.Signature.OID."), aSN1ObjectIdentifier, configurableProvider, str);
        }
    }

    public void registerOidAlgorithmParameters(ConfigurableProvider configurableProvider, ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters." + aSN1ObjectIdentifier, str);
    }

    public void addCipherAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        configurableProvider.addAlgorithm("Cipher." + str, str2);
        if (aSN1ObjectIdentifier != null) {
            configurableProvider.addAlgorithm("Alg.Alias.Cipher." + aSN1ObjectIdentifier, str);
            C19462.m44861(new StringBuilder("Alg.Alias.Cipher.OID."), aSN1ObjectIdentifier, configurableProvider, str);
        }
    }

    public void addKeyFactoryAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, ASN1ObjectIdentifier aSN1ObjectIdentifier, AsymmetricKeyInfoConverter asymmetricKeyInfoConverter) {
        configurableProvider.addAlgorithm("KeyFactory." + str, str2);
        if (aSN1ObjectIdentifier != null) {
            configurableProvider.addAlgorithm("Alg.Alias.KeyFactory." + aSN1ObjectIdentifier, str);
            C19462.m44861(new StringBuilder("Alg.Alias.KeyFactory.OID."), aSN1ObjectIdentifier, configurableProvider, str);
            configurableProvider.addKeyInfoConverter(aSN1ObjectIdentifier, asymmetricKeyInfoConverter);
        }
    }

    public void addKeyGeneratorAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        configurableProvider.addAlgorithm("KeyGenerator." + str, str2);
        if (aSN1ObjectIdentifier != null) {
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator." + aSN1ObjectIdentifier, str);
            C19462.m44861(new StringBuilder("Alg.Alias.KeyGenerator.OID."), aSN1ObjectIdentifier, configurableProvider, str);
        }
    }

    public void addKeyPairGeneratorAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        configurableProvider.addAlgorithm("KeyPairGenerator." + str, str2);
        if (aSN1ObjectIdentifier != null) {
            configurableProvider.addAlgorithm("Alg.Alias.KeyPairGenerator." + aSN1ObjectIdentifier, str);
            C19462.m44861(new StringBuilder("Alg.Alias.KeyPairGenerator.OID."), aSN1ObjectIdentifier, configurableProvider, str);
        }
    }

    public void addSignatureAlias(ConfigurableProvider configurableProvider, String str, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        configurableProvider.addAlgorithm("Alg.Alias.Signature." + aSN1ObjectIdentifier, str);
        C19462.m44861(new StringBuilder("Alg.Alias.Signature.OID."), aSN1ObjectIdentifier, configurableProvider, str);
    }

    public void registerKeyFactoryOid(ConfigurableProvider configurableProvider, ASN1ObjectIdentifier aSN1ObjectIdentifier, String str, AsymmetricKeyInfoConverter asymmetricKeyInfoConverter) {
        configurableProvider.addAlgorithm("Alg.Alias.KeyFactory." + aSN1ObjectIdentifier, str);
        C19462.m44861(new StringBuilder("Alg.Alias.KeyFactory.OID."), aSN1ObjectIdentifier, configurableProvider, str);
        configurableProvider.addKeyInfoConverter(aSN1ObjectIdentifier, asymmetricKeyInfoConverter);
    }

    public void registerOid(ConfigurableProvider configurableProvider, ASN1ObjectIdentifier aSN1ObjectIdentifier, String str, AsymmetricKeyInfoConverter asymmetricKeyInfoConverter) {
        configurableProvider.addAlgorithm("Alg.Alias.KeyFactory." + aSN1ObjectIdentifier, str);
        C19462.m44861(new StringBuilder("Alg.Alias.KeyPairGenerator."), aSN1ObjectIdentifier, configurableProvider, str);
        configurableProvider.addKeyInfoConverter(aSN1ObjectIdentifier, asymmetricKeyInfoConverter);
    }

    public void registerOidAlgorithmParameterGenerator(ConfigurableProvider configurableProvider, ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + aSN1ObjectIdentifier, str);
        C19462.m44861(new StringBuilder("Alg.Alias.AlgorithmParameters."), aSN1ObjectIdentifier, configurableProvider, str);
    }
}
