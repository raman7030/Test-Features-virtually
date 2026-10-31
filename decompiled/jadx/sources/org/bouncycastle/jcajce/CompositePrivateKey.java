package org.bouncycastle.jcajce;

import java.io.IOException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import l.C20195;
import l.C3200;
import l.C5127;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.sec.ECPrivateKey;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x9.ECNamedCurveTable;
import org.bouncycastle.crypto.util.PrivateKeyFactory;
import org.bouncycastle.crypto.util.PrivateKeyInfoFactory;
import org.bouncycastle.internal.asn1.iana.IANAObjectIdentifiers;
import org.bouncycastle.internal.asn1.misc.MiscObjectIdentifiers;
import org.bouncycastle.jcajce.interfaces.MLDSAPrivateKey;
import org.bouncycastle.jcajce.provider.asymmetric.compositesignatures.CompositeIndex;
import org.bouncycastle.jcajce.provider.asymmetric.compositesignatures.KeyFactorySpi;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Exceptions;

/* JADX INFO: loaded from: classes.dex */
public class CompositePrivateKey implements PrivateKey {
    public AlgorithmIdentifier algorithmIdentifier;
    public final List keys;
    public final List providers;

    public class Builder {
        public final AlgorithmIdentifier algorithmIdentifier;
        public int count;
        public final PrivateKey[] keys;
        public final Provider[] providers;

        public Builder(AlgorithmIdentifier algorithmIdentifier) {
            this.keys = new PrivateKey[2];
            this.providers = new Provider[2];
            this.count = 0;
            this.algorithmIdentifier = algorithmIdentifier;
        }

        public Builder addPrivateKey(PrivateKey privateKey) {
            return addPrivateKey(privateKey, (Provider) null);
        }

        public Builder addPrivateKey(PrivateKey privateKey, String str) {
            return addPrivateKey(privateKey, Security.getProvider(str));
        }

        public Builder addPrivateKey(PrivateKey privateKey, Provider provider) {
            int i = this.count;
            PrivateKey[] privateKeyArr = this.keys;
            if (i == privateKeyArr.length) {
                throw new IllegalStateException(C3200.m9831(this.keys.length, " allowed in composite", new StringBuilder("only ")));
            }
            privateKeyArr[i] = privateKey;
            Provider[] providerArr = this.providers;
            this.count = i + 1;
            providerArr[i] = provider;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public CompositePrivateKey build() {
            Provider[] providerArr = this.providers;
            return (providerArr[0] == null && providerArr[1] == null) ? new CompositePrivateKey(this.algorithmIdentifier, this.keys, null) : new CompositePrivateKey(this.algorithmIdentifier, this.keys, providerArr);
        }
    }

    public CompositePrivateKey(ASN1ObjectIdentifier aSN1ObjectIdentifier, PrivateKey... privateKeyArr) {
        this(new AlgorithmIdentifier(aSN1ObjectIdentifier), privateKeyArr);
    }

    public CompositePrivateKey(PrivateKeyInfo privateKeyInfo) {
        try {
            if (!CompositeIndex.isAlgorithmSupported(privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm())) {
                throw new IllegalStateException("Unable to create CompositePrivateKey from PrivateKeyInfo");
            }
            CompositePrivateKey compositePrivateKey = (CompositePrivateKey) new KeyFactorySpi().generatePrivate(privateKeyInfo);
            if (compositePrivateKey == null) {
                throw new IllegalStateException("Unable to create CompositePrivateKey from PrivateKeyInfo");
            }
            this.keys = compositePrivateKey.getPrivateKeys();
            this.providers = null;
            this.algorithmIdentifier = compositePrivateKey.getAlgorithmIdentifier();
        } catch (IOException e) {
            throw Exceptions.illegalStateException(e.getMessage(), e);
        }
    }

    public CompositePrivateKey(AlgorithmIdentifier algorithmIdentifier, PrivateKey... privateKeyArr) {
        this.algorithmIdentifier = algorithmIdentifier;
        if (privateKeyArr == null || privateKeyArr.length == 0) {
            throw new IllegalArgumentException("at least one private key must be provided for the composite private key");
        }
        ArrayList arrayList = new ArrayList(privateKeyArr.length);
        for (PrivateKey privateKey : privateKeyArr) {
            arrayList.add(processKey(privateKey));
        }
        this.keys = C20195.unmodifiableList(arrayList);
        this.providers = null;
    }

    public CompositePrivateKey(AlgorithmIdentifier algorithmIdentifier, PrivateKey[] privateKeyArr, Provider[] providerArr) {
        List listUnmodifiableList;
        this.algorithmIdentifier = algorithmIdentifier;
        if (privateKeyArr.length != 2) {
            throw new IllegalArgumentException("two keys required for composite private key");
        }
        ArrayList arrayList = new ArrayList(privateKeyArr.length);
        int i = 0;
        if (providerArr == null) {
            while (i < privateKeyArr.length) {
                arrayList.add(processKey(privateKeyArr[i]));
                i++;
            }
            listUnmodifiableList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(providerArr.length);
            while (i < privateKeyArr.length) {
                arrayList2.add(providerArr[i]);
                arrayList.add(processKey(privateKeyArr[i]));
                i++;
            }
            listUnmodifiableList = C20195.unmodifiableList(arrayList2);
        }
        this.providers = listUnmodifiableList;
        this.keys = C20195.unmodifiableList(arrayList);
    }

    public CompositePrivateKey(PrivateKey... privateKeyArr) {
        this(MiscObjectIdentifiers.id_composite_key, privateKeyArr);
    }

    public static Builder builder(String str) {
        return builder(CompositeUtil.getOid(str));
    }

    public static Builder builder(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return new Builder(new AlgorithmIdentifier(aSN1ObjectIdentifier));
    }

    private PrivateKey processKey(PrivateKey privateKey) {
        if (!(privateKey instanceof MLDSAPrivateKey)) {
            return privateKey;
        }
        try {
            return ((MLDSAPrivateKey) privateKey).getPrivateKey(true);
        } catch (Exception unused) {
            return privateKey;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CompositePrivateKey) {
            CompositePrivateKey compositePrivateKey = (CompositePrivateKey) obj;
            if (compositePrivateKey.getAlgorithmIdentifier().equals(this.algorithmIdentifier) && this.keys.equals(compositePrivateKey.keys)) {
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
        return "PKCS#8";
    }

    public List getPrivateKeys() {
        return this.keys;
    }

    public List getProviders() {
        return this.providers;
    }

    public int hashCode() {
        return this.keys.hashCode();
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        int i = 0;
        if (this.algorithmIdentifier.getAlgorithm().on(IANAObjectIdentifiers.id_alg)) {
            try {
                byte[] seed = ((MLDSAPrivateKey) this.keys.get(0)).getSeed();
                byte[] octets = PrivateKeyInfoFactory.createPrivateKeyInfo(PrivateKeyFactory.createKey(((PrivateKey) this.keys.get(1)).getEncoded())).getPrivateKey().getOctets();
                if (((PrivateKey) this.keys.get(1)).getAlgorithm().contains("Ed")) {
                    octets = ASN1OctetString.getInstance(octets).getOctets();
                } else if (((PrivateKey) this.keys.get(1)).getAlgorithm().contains("EC")) {
                    ECPrivateKey eCPrivateKey = ECPrivateKey.getInstance(octets);
                    octets = new ECPrivateKey(ECNamedCurveTable.getByOID(ASN1ObjectIdentifier.getInstance(eCPrivateKey.getParametersObject())).getCurve().getFieldSize(), eCPrivateKey.getKey(), eCPrivateKey.getParametersObject()).getEncoded();
                }
                return new PrivateKeyInfo(this.algorithmIdentifier, Arrays.concatenate(seed, octets)).getEncoded();
            } catch (IOException e) {
                throw new IllegalStateException(C5127.m14678(e, new StringBuilder("unable to encode composite public key: ")));
            }
        }
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        if (this.algorithmIdentifier.getAlgorithm().equals((ASN1Primitive) MiscObjectIdentifiers.id_composite_key)) {
            while (i < this.keys.size()) {
                aSN1EncodableVector.add(PrivateKeyInfo.getInstance(((PrivateKey) this.keys.get(i)).getEncoded()));
                i++;
            }
            try {
                return new PrivateKeyInfo(this.algorithmIdentifier, new DERSequence(aSN1EncodableVector)).getEncoded(ASN1Encoding.DER);
            } catch (IOException e2) {
                throw new IllegalStateException(C5127.m14678(e2, new StringBuilder("unable to encode composite private key: ")));
            }
        }
        byte[] bArrConcatenate = null;
        while (i < this.keys.size()) {
            bArrConcatenate = Arrays.concatenate(bArrConcatenate, PrivateKeyInfo.getInstance(((PrivateKey) this.keys.get(i)).getEncoded()).getPrivateKey().getOctets());
            i++;
        }
        try {
            return new PrivateKeyInfo(this.algorithmIdentifier, bArrConcatenate).getEncoded(ASN1Encoding.DER);
        } catch (IOException e3) {
            throw new IllegalStateException(C5127.m14678(e3, new StringBuilder("unable to encode composite private key: ")));
        }
    }
}
