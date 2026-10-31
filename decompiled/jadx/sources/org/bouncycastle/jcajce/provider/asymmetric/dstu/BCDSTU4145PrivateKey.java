package org.bouncycastle.jcajce.provider.asymmetric.dstu;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPrivateKeySpec;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Null;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.ua.DSTU4145BinaryField;
import org.bouncycastle.asn1.ua.DSTU4145ECBinary;
import org.bouncycastle.asn1.ua.DSTU4145NamedCurves;
import org.bouncycastle.asn1.ua.DSTU4145Params;
import org.bouncycastle.asn1.ua.DSTU4145PointEncoder;
import org.bouncycastle.asn1.ua.UAObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x9.X962Parameters;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECPoint;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.bouncycastle.jce.interfaces.ECPointEncoder;
import org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.spec.ECNamedCurveParameterSpec;
import org.bouncycastle.jce.spec.ECNamedCurveSpec;
import org.bouncycastle.math.ec.ECCurve;

/* JADX INFO: loaded from: classes2.dex */
public class BCDSTU4145PrivateKey implements ECPrivateKey, org.bouncycastle.jce.interfaces.ECPrivateKey, PKCS12BagAttributeCarrier, ECPointEncoder {
    public static final long serialVersionUID = 7245981689601667138L;
    public String algorithm;
    public transient PKCS12BagAttributeCarrierImpl attrCarrier;
    public transient BigInteger d;
    public transient ECParameterSpec ecSpec;
    public transient ASN1BitString publicKey;
    public boolean withCompression;

    public BCDSTU4145PrivateKey() {
        this.algorithm = "DSTU4145";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
    }

    public BCDSTU4145PrivateKey(String str, ECPrivateKeyParameters eCPrivateKeyParameters) {
        this.algorithm = "DSTU4145";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = str;
        this.d = eCPrivateKeyParameters.getD();
        this.ecSpec = null;
    }

    public BCDSTU4145PrivateKey(String str, ECPrivateKeyParameters eCPrivateKeyParameters, BCDSTU4145PublicKey bCDSTU4145PublicKey, ECParameterSpec eCParameterSpec) {
        this.algorithm = "DSTU4145";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        ECDomainParameters parameters = eCPrivateKeyParameters.getParameters();
        this.algorithm = str;
        this.d = eCPrivateKeyParameters.getD();
        if (eCParameterSpec == null) {
            this.ecSpec = new ECParameterSpec(EC5Util.convertCurve(parameters.getCurve(), parameters.getSeed()), EC5Util.convertPoint(parameters.getG()), parameters.getN(), parameters.getH().intValue());
        } else {
            this.ecSpec = eCParameterSpec;
        }
        this.publicKey = getPublicKeyDetails(bCDSTU4145PublicKey);
    }

    public BCDSTU4145PrivateKey(String str, ECPrivateKeyParameters eCPrivateKeyParameters, BCDSTU4145PublicKey bCDSTU4145PublicKey, org.bouncycastle.jce.spec.ECParameterSpec eCParameterSpec) {
        this.algorithm = "DSTU4145";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        ECDomainParameters parameters = eCPrivateKeyParameters.getParameters();
        this.algorithm = str;
        this.d = eCPrivateKeyParameters.getD();
        this.ecSpec = eCParameterSpec == null ? new ECParameterSpec(EC5Util.convertCurve(parameters.getCurve(), parameters.getSeed()), EC5Util.convertPoint(parameters.getG()), parameters.getN(), parameters.getH().intValue()) : new ECParameterSpec(EC5Util.convertCurve(eCParameterSpec.getCurve(), eCParameterSpec.getSeed()), EC5Util.convertPoint(eCParameterSpec.getG()), eCParameterSpec.getN(), eCParameterSpec.getH().intValue());
        this.publicKey = getPublicKeyDetails(bCDSTU4145PublicKey);
    }

    public BCDSTU4145PrivateKey(ECPrivateKey eCPrivateKey) {
        this.algorithm = "DSTU4145";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.d = eCPrivateKey.getS();
        this.algorithm = eCPrivateKey.getAlgorithm();
        this.ecSpec = eCPrivateKey.getParams();
    }

    public BCDSTU4145PrivateKey(ECPrivateKeySpec eCPrivateKeySpec) {
        this.algorithm = "DSTU4145";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.d = eCPrivateKeySpec.getS();
        this.ecSpec = eCPrivateKeySpec.getParams();
    }

    public BCDSTU4145PrivateKey(PrivateKeyInfo privateKeyInfo) {
        this.algorithm = "DSTU4145";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        populateFromPrivKeyInfo(privateKeyInfo);
    }

    public BCDSTU4145PrivateKey(BCDSTU4145PrivateKey bCDSTU4145PrivateKey) {
        this.algorithm = "DSTU4145";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.d = bCDSTU4145PrivateKey.d;
        this.ecSpec = bCDSTU4145PrivateKey.ecSpec;
        this.withCompression = bCDSTU4145PrivateKey.withCompression;
        this.attrCarrier = bCDSTU4145PrivateKey.attrCarrier;
        this.publicKey = bCDSTU4145PrivateKey.publicKey;
    }

    public BCDSTU4145PrivateKey(org.bouncycastle.jce.spec.ECPrivateKeySpec eCPrivateKeySpec) {
        this.algorithm = "DSTU4145";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.d = eCPrivateKeySpec.getD();
        this.ecSpec = eCPrivateKeySpec.getParams() != null ? EC5Util.convertSpec(EC5Util.convertCurve(eCPrivateKeySpec.getParams().getCurve(), eCPrivateKeySpec.getParams().getSeed()), eCPrivateKeySpec.getParams()) : null;
    }

    private ASN1BitString getPublicKeyDetails(BCDSTU4145PublicKey bCDSTU4145PublicKey) {
        try {
            return SubjectPublicKeyInfo.getInstance(ASN1Primitive.fromByteArray(bCDSTU4145PublicKey.getEncoded())).getPublicKeyData();
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0182  */
    /* JADX WARN: Code duplicated, block: B:30:0x018d  */
    private void populateFromPrivKeyInfo(PrivateKeyInfo privateKeyInfo) {
        org.bouncycastle.jce.spec.ECParameterSpec eCParameterSpec;
        ECParameterSpec eCParameterSpec2;
        ASN1Encodable privateKey;
        X962Parameters x962Parameters = X962Parameters.getInstance(privateKeyInfo.getPrivateKeyAlgorithm().getParameters());
        if (!x962Parameters.isNamedCurve()) {
            if (x962Parameters.isImplicitlyCA()) {
                this.ecSpec = null;
            } else {
                ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(x962Parameters.getParameters());
                if (aSN1Sequence.getObjectAt(0) instanceof ASN1Integer) {
                    X9ECParameters x9ECParameters = X9ECParameters.getInstance(x962Parameters.getParameters());
                    eCParameterSpec2 = new ECParameterSpec(EC5Util.convertCurve(x9ECParameters.getCurve(), x9ECParameters.getSeed()), EC5Util.convertPoint(x9ECParameters.getG()), x9ECParameters.getN(), x9ECParameters.getH().intValue());
                } else {
                    DSTU4145Params dSTU4145Params = DSTU4145Params.getInstance(aSN1Sequence);
                    if (dSTU4145Params.isNamedCurve()) {
                        ASN1ObjectIdentifier namedCurve = dSTU4145Params.getNamedCurve();
                        ECDomainParameters byOID = DSTU4145NamedCurves.getByOID(namedCurve);
                        eCParameterSpec = new ECNamedCurveParameterSpec(namedCurve.getId(), byOID.getCurve(), byOID.getG(), byOID.getN(), byOID.getH(), byOID.getSeed());
                    } else {
                        DSTU4145ECBinary eCBinary = dSTU4145Params.getECBinary();
                        byte[] b = eCBinary.getB();
                        ASN1ObjectIdentifier algorithm = privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm();
                        ASN1ObjectIdentifier aSN1ObjectIdentifier = UAObjectIdentifiers.dstu4145le;
                        if (algorithm.equals((ASN1Primitive) aSN1ObjectIdentifier)) {
                            reverseBytes(b);
                        }
                        DSTU4145BinaryField field = eCBinary.getField();
                        ECCurve.F2m f2m = new ECCurve.F2m(field.getM(), field.getK1(), field.getK2(), field.getK3(), eCBinary.getA(), new BigInteger(1, b), (BigInteger) null, (BigInteger) null);
                        byte[] g = eCBinary.getG();
                        if (privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm().equals((ASN1Primitive) aSN1ObjectIdentifier)) {
                            reverseBytes(g);
                        }
                        eCParameterSpec = new org.bouncycastle.jce.spec.ECParameterSpec(f2m, DSTU4145PointEncoder.decodePoint(f2m, g), eCBinary.getN());
                    }
                    this.ecSpec = new ECParameterSpec(EC5Util.convertCurve(eCParameterSpec.getCurve(), eCParameterSpec.getSeed()), EC5Util.convertPoint(eCParameterSpec.getG()), eCParameterSpec.getN(), eCParameterSpec.getH().intValue());
                }
            }
            privateKey = privateKeyInfo.parsePrivateKey();
            if (privateKey instanceof ASN1Integer) {
                this.d = ASN1Integer.getInstance(privateKey).getValue();
                return;
            }
            org.bouncycastle.asn1.sec.ECPrivateKey eCPrivateKey = org.bouncycastle.asn1.sec.ECPrivateKey.getInstance(privateKey);
            this.d = eCPrivateKey.getKey();
            this.publicKey = eCPrivateKey.getPublicKey();
        }
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = ASN1ObjectIdentifier.getInstance(x962Parameters.getParameters());
        X9ECParameters namedCurveByOid = ECUtil.getNamedCurveByOid(aSN1ObjectIdentifier2);
        if (namedCurveByOid == null) {
            ECDomainParameters byOID2 = DSTU4145NamedCurves.getByOID(aSN1ObjectIdentifier2);
            eCParameterSpec2 = new ECNamedCurveSpec(aSN1ObjectIdentifier2.getId(), EC5Util.convertCurve(byOID2.getCurve(), byOID2.getSeed()), EC5Util.convertPoint(byOID2.getG()), byOID2.getN(), byOID2.getH());
        } else {
            eCParameterSpec2 = new ECNamedCurveSpec(ECUtil.getCurveName(aSN1ObjectIdentifier2), EC5Util.convertCurve(namedCurveByOid.getCurve(), namedCurveByOid.getSeed()), EC5Util.convertPoint(namedCurveByOid.getG()), namedCurveByOid.getN(), namedCurveByOid.getH());
        }
        this.ecSpec = eCParameterSpec2;
        privateKey = privateKeyInfo.parsePrivateKey();
        if (privateKey instanceof ASN1Integer) {
            this.d = ASN1Integer.getInstance(privateKey).getValue();
            return;
        }
        org.bouncycastle.asn1.sec.ECPrivateKey eCPrivateKey2 = org.bouncycastle.asn1.sec.ECPrivateKey.getInstance(privateKey);
        this.d = eCPrivateKey2.getKey();
        this.publicKey = eCPrivateKey2.getPublicKey();
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        populateFromPrivKeyInfo(PrivateKeyInfo.getInstance(ASN1Primitive.fromByteArray((byte[]) objectInputStream.readObject())));
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
    }

    private void reverseBytes(byte[] bArr) {
        for (int i = 0; i < bArr.length / 2; i++) {
            byte b = bArr[i];
            bArr[i] = bArr[(bArr.length - 1) - i];
            bArr[(bArr.length - 1) - i] = b;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public org.bouncycastle.jce.spec.ECParameterSpec engineGetSpec() {
        ECParameterSpec eCParameterSpec = this.ecSpec;
        return eCParameterSpec != null ? EC5Util.convertSpec(eCParameterSpec) : BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCDSTU4145PrivateKey)) {
            return false;
        }
        BCDSTU4145PrivateKey bCDSTU4145PrivateKey = (BCDSTU4145PrivateKey) obj;
        return getD().equals(bCDSTU4145PrivateKey.getD()) && engineGetSpec().equals(bCDSTU4145PrivateKey.engineGetSpec());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.algorithm;
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public ASN1Encodable getBagAttribute(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return this.attrCarrier.getBagAttribute(aSN1ObjectIdentifier);
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public Enumeration getBagAttributeKeys() {
        return this.attrCarrier.getBagAttributeKeys();
    }

    @Override // org.bouncycastle.jce.interfaces.ECPrivateKey
    public BigInteger getD() {
        return this.d;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0090  */
    /* JADX WARN: Code duplicated, block: B:15:0x009c  */
    /* JADX WARN: Code duplicated, block: B:18:0x00af A[Catch: IOException -> 0x00df, TryCatch #0 {IOException -> 0x00df, blocks: (B:16:0x00a5, B:18:0x00af, B:20:0x00d8, B:19:0x00c4), top: B:23:0x00a5 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x00c4 A[Catch: IOException -> 0x00df, TryCatch #0 {IOException -> 0x00df, blocks: (B:16:0x00a5, B:18:0x00af, B:20:0x00d8, B:19:0x00c4), top: B:23:0x00a5 }] */
    @Override // java.security.Key
    public byte[] getEncoded() {
        X962Parameters x962Parameters;
        X962Parameters x962Parameters2;
        int orderBitLength;
        org.bouncycastle.asn1.sec.ECPrivateKey eCPrivateKey;
        PrivateKeyInfo privateKeyInfo;
        ECParameterSpec eCParameterSpec = this.ecSpec;
        try {
            if (!(eCParameterSpec instanceof ECNamedCurveSpec)) {
                if (eCParameterSpec == null) {
                    x962Parameters2 = new X962Parameters((ASN1Null) DERNull.INSTANCE);
                    orderBitLength = ECUtil.getOrderBitLength(BouncyCastleProvider.CONFIGURATION, null, getS());
                } else {
                    ECCurve eCCurveConvertCurve = EC5Util.convertCurve(eCParameterSpec.getCurve());
                    x962Parameters = new X962Parameters(new X9ECParameters(eCCurveConvertCurve, new X9ECPoint(EC5Util.convertPoint(eCCurveConvertCurve, this.ecSpec.getGenerator()), this.withCompression), this.ecSpec.getOrder(), BigInteger.valueOf(this.ecSpec.getCofactor()), this.ecSpec.getCurve().getSeed()));
                }
                if (this.publicKey != null) {
                    eCPrivateKey = new org.bouncycastle.asn1.sec.ECPrivateKey(orderBitLength, getS(), this.publicKey, x962Parameters2);
                } else {
                    eCPrivateKey = new org.bouncycastle.asn1.sec.ECPrivateKey(orderBitLength, getS(), x962Parameters2);
                }
                if (this.algorithm.equals("DSTU4145")) {
                    privateKeyInfo = new PrivateKeyInfo(new AlgorithmIdentifier(UAObjectIdentifiers.dstu4145be, x962Parameters2.toASN1Primitive()), eCPrivateKey.toASN1Primitive());
                } else {
                    privateKeyInfo = new PrivateKeyInfo(new AlgorithmIdentifier(X9ObjectIdentifiers.id_ecPublicKey, x962Parameters2.toASN1Primitive()), eCPrivateKey.toASN1Primitive());
                }
                return privateKeyInfo.getEncoded(ASN1Encoding.DER);
            }
            ASN1ObjectIdentifier namedCurveOid = ECUtil.getNamedCurveOid(((ECNamedCurveSpec) eCParameterSpec).getName());
            if (namedCurveOid == null) {
                namedCurveOid = new ASN1ObjectIdentifier(((ECNamedCurveSpec) this.ecSpec).getName());
            }
            x962Parameters = new X962Parameters(namedCurveOid);
            if (this.algorithm.equals("DSTU4145")) {
                privateKeyInfo = new PrivateKeyInfo(new AlgorithmIdentifier(UAObjectIdentifiers.dstu4145be, x962Parameters2.toASN1Primitive()), eCPrivateKey.toASN1Primitive());
            } else {
                privateKeyInfo = new PrivateKeyInfo(new AlgorithmIdentifier(X9ObjectIdentifiers.id_ecPublicKey, x962Parameters2.toASN1Primitive()), eCPrivateKey.toASN1Primitive());
            }
            return privateKeyInfo.getEncoded(ASN1Encoding.DER);
        } catch (IOException unused) {
            return null;
        }
        X962Parameters x962Parameters3 = x962Parameters;
        orderBitLength = ECUtil.getOrderBitLength(BouncyCastleProvider.CONFIGURATION, this.ecSpec.getOrder(), getS());
        x962Parameters2 = x962Parameters3;
        if (this.publicKey != null) {
            eCPrivateKey = new org.bouncycastle.asn1.sec.ECPrivateKey(orderBitLength, getS(), this.publicKey, x962Parameters2);
        } else {
            eCPrivateKey = new org.bouncycastle.asn1.sec.ECPrivateKey(orderBitLength, getS(), x962Parameters2);
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    @Override // org.bouncycastle.jce.interfaces.ECKey
    public org.bouncycastle.jce.spec.ECParameterSpec getParameters() {
        ECParameterSpec eCParameterSpec = this.ecSpec;
        if (eCParameterSpec == null) {
            return null;
        }
        return EC5Util.convertSpec(eCParameterSpec);
    }

    @Override // java.security.interfaces.ECKey
    public ECParameterSpec getParams() {
        return this.ecSpec;
    }

    @Override // java.security.interfaces.ECPrivateKey
    public BigInteger getS() {
        return this.d;
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public boolean hasFriendlyName() {
        return this.attrCarrier.hasFriendlyName();
    }

    public int hashCode() {
        return getD().hashCode() ^ engineGetSpec().hashCode();
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public void setBagAttribute(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Encodable aSN1Encodable) {
        this.attrCarrier.setBagAttribute(aSN1ObjectIdentifier, aSN1Encodable);
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public void setFriendlyName(String str) {
        this.attrCarrier.setFriendlyName(str);
    }

    @Override // org.bouncycastle.jce.interfaces.ECPointEncoder
    public void setPointFormat(String str) {
        this.withCompression = !"UNCOMPRESSED".equalsIgnoreCase(str);
    }

    public String toString() {
        return ECUtil.privateKeyToString(this.algorithm, this.d, engineGetSpec());
    }
}
