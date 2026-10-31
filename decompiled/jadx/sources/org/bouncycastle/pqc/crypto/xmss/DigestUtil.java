package org.bouncycastle.pqc.crypto.xmss;

import java.util.HashMap;
import java.util.Map;
import l.C20094;
import l.C9005;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.digests.SHAKEDigest;

/* JADX INFO: loaded from: classes2.dex */
public class DigestUtil {
    public static Map nameToOid = new HashMap();
    public static Map oidToName = new HashMap();

    static {
        Map map = nameToOid;
        ASN1ObjectIdentifier aSN1ObjectIdentifier = NISTObjectIdentifiers.id_sha256;
        map.put(XMSSKeyParameters.SHA_256, aSN1ObjectIdentifier);
        Map map2 = nameToOid;
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = NISTObjectIdentifiers.id_sha512;
        map2.put(XMSSKeyParameters.SHA_512, aSN1ObjectIdentifier2);
        Map map3 = nameToOid;
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = NISTObjectIdentifiers.id_shake128;
        map3.put("SHAKE128", aSN1ObjectIdentifier3);
        Map map4 = nameToOid;
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = NISTObjectIdentifiers.id_shake256;
        map4.put("SHAKE256", aSN1ObjectIdentifier4);
        oidToName.put(aSN1ObjectIdentifier, XMSSKeyParameters.SHA_256);
        oidToName.put(aSN1ObjectIdentifier2, XMSSKeyParameters.SHA_512);
        oidToName.put(aSN1ObjectIdentifier3, "SHAKE128");
        oidToName.put(aSN1ObjectIdentifier4, "SHAKE256");
    }

    public static Digest getDigest(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_sha256)) {
            return new SHA256Digest();
        }
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_sha512)) {
            return new SHA512Digest();
        }
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_shake128)) {
            return new SHAKEDigest(128);
        }
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_shake256)) {
            return new SHAKEDigest(256);
        }
        throw new IllegalArgumentException(C9005.m23242("unrecognized digest OID: ", aSN1ObjectIdentifier));
    }

    public static String getDigestName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        String str = (String) oidToName.get(aSN1ObjectIdentifier);
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException(C9005.m23242("unrecognized digest oid: ", aSN1ObjectIdentifier));
    }

    public static ASN1ObjectIdentifier getDigestOID(String str) {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) nameToOid.get(str);
        if (aSN1ObjectIdentifier != null) {
            return aSN1ObjectIdentifier;
        }
        throw new IllegalArgumentException(C20094.m46315("unrecognized digest name: ", str));
    }
}
