package org.bouncycastle.pqc.crypto.xmss;

import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.util.Integers;
import p067l.C20778;
import p067l.C21562;

/* JADX INFO: loaded from: classes2.dex */
public final class XMSSMTParameters {
    public static final Map paramsLookupTable;
    public final int height;
    public final int layers;
    public final XMSSOid oid;
    public final XMSSParameters xmssParams;

    public XMSSMTParameters(int i, int i2, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.height = i;
        this.layers = i2;
        this.xmssParams = new XMSSParameters(xmssTreeHeight(i, i2), aSN1ObjectIdentifier);
        this.oid = DefaultXMSSMTOid.lookup(getTreeDigest(), getTreeDigestSize(), getWinternitzParameter(), getLen(), getHeight(), i2);
    }

    public XMSSMTParameters(int i, int i2, Digest digest) {
        this(i, i2, DigestUtil.getDigestOID(digest.getAlgorithmName()));
    }

    public static XMSSMTParameters lookupByOID(int i) {
        return (XMSSMTParameters) paramsLookupTable.get(Integers.valueOf(i));
    }

    public static int xmssTreeHeight(int i, int i2) {
        if (i < 2) {
            throw new IllegalArgumentException("totalHeight must be > 1");
        }
        if (i % i2 != 0) {
            throw new IllegalArgumentException("layers must divide totalHeight without remainder");
        }
        int i3 = i / i2;
        if (i3 != 1) {
            return i3;
        }
        throw new IllegalArgumentException("height / layers must be greater than 1");
    }

    public int getHeight() {
        return this.height;
    }

    public int getLayers() {
        return this.layers;
    }

    public int getLen() {
        return this.xmssParams.getLen();
    }

    public XMSSOid getOid() {
        return this.oid;
    }

    public String getTreeDigest() {
        return this.xmssParams.getTreeDigest();
    }

    public ASN1ObjectIdentifier getTreeDigestOID() {
        return this.xmssParams.getTreeDigestOID();
    }

    public int getTreeDigestSize() {
        return this.xmssParams.getTreeDigestSize();
    }

    public WOTSPlus getWOTSPlus() {
        return this.xmssParams.getWOTSPlus();
    }

    public int getWinternitzParameter() {
        return this.xmssParams.getWinternitzParameter();
    }

    public XMSSParameters getXMSSParameters() {
        return this.xmssParams;
    }

    static {
        HashMap map = new HashMap();
        Integer numValueOf = Integers.valueOf(1);
        ASN1ObjectIdentifier aSN1ObjectIdentifier = NISTObjectIdentifiers.id_sha256;
        map.put(numValueOf, new XMSSMTParameters(20, 2, aSN1ObjectIdentifier));
        C20778.m46924(20, 4, aSN1ObjectIdentifier, map, Integers.valueOf(2));
        C20778.m46924(40, 2, aSN1ObjectIdentifier, map, Integers.valueOf(3));
        C20778.m46924(40, 4, aSN1ObjectIdentifier, map, Integers.valueOf(4));
        C20778.m46924(40, 8, aSN1ObjectIdentifier, map, Integers.valueOf(5));
        C20778.m46924(60, 3, aSN1ObjectIdentifier, map, Integers.valueOf(6));
        C20778.m46924(60, 6, aSN1ObjectIdentifier, map, Integers.valueOf(7));
        C20778.m46924(60, 12, aSN1ObjectIdentifier, map, Integers.valueOf(8));
        Integer numValueOf2 = Integers.valueOf(9);
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = NISTObjectIdentifiers.id_sha512;
        map.put(numValueOf2, new XMSSMTParameters(20, 2, aSN1ObjectIdentifier2));
        C20778.m46924(20, 4, aSN1ObjectIdentifier2, map, Integers.valueOf(10));
        C20778.m46924(40, 2, aSN1ObjectIdentifier2, map, Integers.valueOf(11));
        C20778.m46924(40, 4, aSN1ObjectIdentifier2, map, Integers.valueOf(12));
        C20778.m46924(40, 8, aSN1ObjectIdentifier2, map, Integers.valueOf(13));
        C20778.m46924(60, 3, aSN1ObjectIdentifier2, map, Integers.valueOf(14));
        C20778.m46924(60, 6, aSN1ObjectIdentifier2, map, Integers.valueOf(15));
        C20778.m46924(60, 12, aSN1ObjectIdentifier2, map, Integers.valueOf(16));
        Integer numValueOf3 = Integers.valueOf(17);
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = NISTObjectIdentifiers.id_shake128;
        map.put(numValueOf3, new XMSSMTParameters(20, 2, aSN1ObjectIdentifier3));
        C20778.m46924(20, 4, aSN1ObjectIdentifier3, map, Integers.valueOf(18));
        C20778.m46924(40, 2, aSN1ObjectIdentifier3, map, Integers.valueOf(19));
        C20778.m46924(40, 4, aSN1ObjectIdentifier3, map, Integers.valueOf(20));
        C20778.m46924(40, 8, aSN1ObjectIdentifier3, map, Integers.valueOf(21));
        C20778.m46924(60, 3, aSN1ObjectIdentifier3, map, Integers.valueOf(22));
        C20778.m46924(60, 6, aSN1ObjectIdentifier3, map, Integers.valueOf(23));
        C20778.m46924(60, 12, aSN1ObjectIdentifier3, map, Integers.valueOf(24));
        Integer numValueOf4 = Integers.valueOf(25);
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = NISTObjectIdentifiers.id_shake256;
        map.put(numValueOf4, new XMSSMTParameters(20, 2, aSN1ObjectIdentifier4));
        C20778.m46924(20, 4, aSN1ObjectIdentifier4, map, Integers.valueOf(26));
        C20778.m46924(40, 2, aSN1ObjectIdentifier4, map, Integers.valueOf(27));
        C20778.m46924(40, 4, aSN1ObjectIdentifier4, map, Integers.valueOf(28));
        C20778.m46924(40, 8, aSN1ObjectIdentifier4, map, Integers.valueOf(29));
        C20778.m46924(60, 3, aSN1ObjectIdentifier4, map, Integers.valueOf(30));
        C20778.m46924(60, 6, aSN1ObjectIdentifier4, map, Integers.valueOf(31));
        C20778.m46924(60, 12, aSN1ObjectIdentifier4, map, Integers.valueOf(32));
        paramsLookupTable = C21562.unmodifiableMap(map);
    }
}
