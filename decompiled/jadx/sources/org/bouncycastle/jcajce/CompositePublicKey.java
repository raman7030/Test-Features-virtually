package org.bouncycastle.jcajce;

import java.io.IOException;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.internal.asn1.iana.IANAObjectIdentifiers;
import org.bouncycastle.internal.asn1.misc.MiscObjectIdentifiers;
import org.bouncycastle.jcajce.provider.asymmetric.compositesignatures.CompositeIndex;
import org.bouncycastle.jcajce.provider.asymmetric.compositesignatures.KeyFactorySpi;
import org.bouncycastle.pqc.crypto.util.PublicKeyFactory;
import org.bouncycastle.pqc.crypto.util.SubjectPublicKeyInfoFactory;
import org.bouncycastle.util.Arrays;
import p067l.C21562;
import p067l.C5410;
import p067l.C7241;

/* JADX INFO: loaded from: classes.dex */
public class CompositePublicKey implements PublicKey {
    public final AlgorithmIdentifier algorithmIdentifier;
    public final List keys;
    public final List providers;

    public class Builder {
        public final AlgorithmIdentifier algorithmIdentifier;
        public int count;
        public final PublicKey[] keys;
        public final Provider[] providers;

        public Builder(AlgorithmIdentifier algorithmIdentifier) {
            this.keys = new PublicKey[2];
            this.providers = new Provider[2];
            this.count = 0;
            this.algorithmIdentifier = algorithmIdentifier;
        }

        public Builder addPublicKey(PublicKey publicKey) {
            return addPublicKey(publicKey, (Provider) null);
        }

        public Builder addPublicKey(PublicKey publicKey, String str) {
            return addPublicKey(publicKey, Security.getProvider(str));
        }

        public Builder addPublicKey(PublicKey publicKey, Provider provider) {
            int i = this.count;
            PublicKey[] publicKeyArr = this.keys;
            if (i == publicKeyArr.length) {
                throw new IllegalStateException(C5410.m11876(this.keys.length, " allowed in composite", new StringBuilder("only ")));
            }
            publicKeyArr[i] = publicKey;
            Provider[] providerArr = this.providers;
            this.count = i + 1;
            providerArr[i] = provider;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public CompositePublicKey build() {
            Provider[] providerArr = this.providers;
            return (providerArr[0] == null && providerArr[1] == null) ? new CompositePublicKey(this.algorithmIdentifier, this.keys, null) : new CompositePublicKey(this.algorithmIdentifier, this.keys, providerArr);
        }
    }

    public CompositePublicKey(ASN1ObjectIdentifier aSN1ObjectIdentifier, PublicKey... publicKeyArr) {
        this(new AlgorithmIdentifier(aSN1ObjectIdentifier), publicKeyArr);
    }

    public CompositePublicKey(AlgorithmIdentifier algorithmIdentifier, PublicKey... publicKeyArr) {
        this.algorithmIdentifier = algorithmIdentifier;
        if (publicKeyArr == null || publicKeyArr.length == 0) {
            throw new IllegalArgumentException("at least one public key must be provided for the composite public key");
        }
        ArrayList arrayList = new ArrayList(publicKeyArr.length);
        for (PublicKey publicKey : publicKeyArr) {
            arrayList.add(publicKey);
        }
        this.keys = C21562.unmodifiableList(arrayList);
        this.providers = null;
    }

    public CompositePublicKey(AlgorithmIdentifier algorithmIdentifier, PublicKey[] publicKeyArr, Provider[] providerArr) {
        List listUnmodifiableList;
        this.algorithmIdentifier = algorithmIdentifier;
        if (publicKeyArr.length != 2) {
            throw new IllegalArgumentException("two keys required for composite private key");
        }
        ArrayList arrayList = new ArrayList(publicKeyArr.length);
        int i = 0;
        if (providerArr == null) {
            while (i < publicKeyArr.length) {
                arrayList.add(publicKeyArr[i]);
                i++;
            }
            listUnmodifiableList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(providerArr.length);
            while (i < publicKeyArr.length) {
                arrayList2.add(providerArr[i]);
                arrayList.add(publicKeyArr[i]);
                i++;
            }
            listUnmodifiableList = C21562.unmodifiableList(arrayList2);
        }
        this.providers = listUnmodifiableList;
        this.keys = C21562.unmodifiableList(arrayList);
    }

    public CompositePublicKey(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        try {
            if (!CompositeIndex.isAlgorithmSupported(subjectPublicKeyInfo.getAlgorithm().getAlgorithm())) {
                throw new IllegalStateException("unable to create CompositePublicKey from SubjectPublicKeyInfo");
            }
            CompositePublicKey compositePublicKey = (CompositePublicKey) new KeyFactorySpi().generatePublic(subjectPublicKeyInfo);
            if (compositePublicKey == null) {
                throw new IllegalStateException("unable to create CompositePublicKey from SubjectPublicKeyInfo");
            }
            this.keys = compositePublicKey.getPublicKeys();
            this.algorithmIdentifier = compositePublicKey.getAlgorithmIdentifier();
            this.providers = null;
        } catch (IOException e) {
            throw new IllegalStateException(e.getMessage(), e);
        }
    }

    public CompositePublicKey(PublicKey... publicKeyArr) {
        this(MiscObjectIdentifiers.id_composite_key, publicKeyArr);
    }

    public static Builder builder(String str) {
        return builder(CompositeUtil.getOid(str));
    }

    public static Builder builder(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return new Builder(new AlgorithmIdentifier(aSN1ObjectIdentifier));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CompositePublicKey) {
            CompositePublicKey compositePublicKey = (CompositePublicKey) obj;
            if (compositePublicKey.getAlgorithmIdentifier().equals(this.algorithmIdentifier) && this.keys.equals(compositePublicKey.keys)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return CompositeIndex.getAlgorithmName(this.algorithmIdentifier.getAlgorithm());
    }

    public AlgorithmIdentifier getAlgorithmIdentifier() {
        return this.algorithmIdentifier;
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public List getProviders() {
        return this.providers;
    }

    public List getPublicKeys() {
        return this.keys;
    }

    public int hashCode() {
        return this.keys.hashCode();
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        if (this.algorithmIdentifier.getAlgorithm().m55304on(IANAObjectIdentifiers.id_alg)) {
            try {
                return new SubjectPublicKeyInfo(getAlgorithmIdentifier(), Arrays.concatenate(SubjectPublicKeyInfoFactory.createSubjectPublicKeyInfo(PublicKeyFactory.createKey(((PublicKey) this.keys.get(0)).getEncoded())).getPublicKeyData().getBytes(), org.bouncycastle.crypto.util.SubjectPublicKeyInfoFactory.createSubjectPublicKeyInfo(org.bouncycastle.crypto.util.PublicKeyFactory.createKey(((PublicKey) this.keys.get(1)).getEncoded())).getPublicKeyData().getBytes())).getEncoded();
            } catch (IOException e) {
                throw new IllegalStateException(C7241.m16586(e, new StringBuilder("unable to encode composite public key: ")));
            }
        }
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        for (int i = 0; i < this.keys.size(); i++) {
            aSN1EncodableVector.add(this.algorithmIdentifier.getAlgorithm().equals((ASN1Primitive) MiscObjectIdentifiers.id_composite_key) ? SubjectPublicKeyInfo.getInstance(((PublicKey) this.keys.get(i)).getEncoded()) : SubjectPublicKeyInfo.getInstance(((PublicKey) this.keys.get(i)).getEncoded()).getPublicKeyData());
        }
        try {
            return new SubjectPublicKeyInfo(this.algorithmIdentifier, new DERSequence(aSN1EncodableVector)).getEncoded(ASN1Encoding.DER);
        } catch (IOException e2) {
            throw new IllegalStateException(C7241.m16586(e2, new StringBuilder("unable to encode composite public key: ")));
        }
    }
}
