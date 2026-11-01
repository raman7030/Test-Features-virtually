package org.bouncycastle.pqc.jcajce.provider.mayo;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashSet;
import java.util.Set;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.p070bc.BCObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.pqc.jcajce.provider.util.BaseKeyFactorySpi;
import p067l.C22934;
import p067l.C9179;

/* JADX INFO: loaded from: classes2.dex */
public class MayoKeyFactorySpi extends BaseKeyFactorySpi {
    public static final Set keyOids;

    public class Mayo1 extends MayoKeyFactorySpi {
        public Mayo1() {
            super(BCObjectIdentifiers.mayo1);
        }
    }

    public class Mayo2 extends MayoKeyFactorySpi {
        public Mayo2() {
            super(BCObjectIdentifiers.mayo2);
        }
    }

    public class Mayo3 extends MayoKeyFactorySpi {
        public Mayo3() {
            super(BCObjectIdentifiers.mayo3);
        }
    }

    public class Mayo5 extends MayoKeyFactorySpi {
        public Mayo5() {
            super(BCObjectIdentifiers.mayo5);
        }
    }

    static {
        HashSet hashSet = new HashSet();
        keyOids = hashSet;
        hashSet.add(BCObjectIdentifiers.mayo1);
        hashSet.add(BCObjectIdentifiers.mayo2);
        hashSet.add(BCObjectIdentifiers.mayo3);
        hashSet.add(BCObjectIdentifiers.mayo5);
    }

    public MayoKeyFactorySpi() {
        super(keyOids);
    }

    public MayoKeyFactorySpi(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        super(aSN1ObjectIdentifier);
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) throws InvalidKeyException {
        if ((key instanceof BCMayoPrivateKey) || (key instanceof BCMayoPublicKey)) {
            return key;
        }
        throw new InvalidKeyException("Unsupported key type");
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PrivateKey generatePrivate(PrivateKeyInfo privateKeyInfo) {
        return new BCMayoPrivateKey(privateKeyInfo);
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PublicKey generatePublic(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        return new BCMayoPublicKey(subjectPublicKeyInfo);
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (key instanceof BCMayoPrivateKey) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(key.getEncoded());
            }
        } else {
            if (!(key instanceof BCMayoPublicKey)) {
                throw new InvalidKeySpecException(C9179.m21132(key, new StringBuilder("Unsupported key type: "), "."));
            }
            if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new X509EncodedKeySpec(key.getEncoded());
            }
        }
        throw new InvalidKeySpecException(C22934.m51253(cls, "Unknown key specification: ", "."));
    }
}
