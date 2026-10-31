package org.bouncycastle.asn1.x509;

import l.C22870;
import l.C6207;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.internal.asn1.misc.MiscObjectIdentifiers;

/* JADX INFO: loaded from: classes.dex */
public interface X509ObjectIdentifiers {
    public static final ASN1ObjectIdentifier attributeType;
    public static final ASN1ObjectIdentifier commonName;
    public static final ASN1ObjectIdentifier countryName;
    public static final ASN1ObjectIdentifier crlAccessMethod;
    public static final ASN1ObjectIdentifier id_PasswordBasedMac;
    public static final ASN1ObjectIdentifier id_SHA1;
    public static final ASN1ObjectIdentifier id_ad;
    public static final ASN1ObjectIdentifier id_ad_caIssuers;
    public static final ASN1ObjectIdentifier id_ad_ocsp;
    public static final ASN1ObjectIdentifier id_alg_noSignature;
    public static final ASN1ObjectIdentifier id_alg_unsigned;
    public static final ASN1ObjectIdentifier id_at_name;
    public static final ASN1ObjectIdentifier id_at_organizationIdentifier;
    public static final ASN1ObjectIdentifier id_at_telephoneNumber;
    public static final ASN1ObjectIdentifier id_ce;
    public static final ASN1ObjectIdentifier id_ea_rsa;
    public static final ASN1ObjectIdentifier id_ecdsa_with_shake128;
    public static final ASN1ObjectIdentifier id_ecdsa_with_shake256;
    public static final ASN1ObjectIdentifier id_pda;
    public static final ASN1ObjectIdentifier id_pe;
    public static final ASN1ObjectIdentifier id_pkix;
    public static final ASN1ObjectIdentifier id_rsassa_pss_shake128;
    public static final ASN1ObjectIdentifier id_rsassa_pss_shake256;
    public static final ASN1ObjectIdentifier localityName;
    public static final ASN1ObjectIdentifier ocspAccessMethod;
    public static final ASN1ObjectIdentifier organization;
    public static final ASN1ObjectIdentifier organizationalUnitName;
    public static final ASN1ObjectIdentifier pkix_algorithms;
    public static final ASN1ObjectIdentifier ripemd160;
    public static final ASN1ObjectIdentifier ripemd160WithRSAEncryption;
    public static final ASN1ObjectIdentifier stateOrProvinceName;

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifierM50969 = C22870.m50969("2.5.4");
        attributeType = aSN1ObjectIdentifierM50969;
        commonName = aSN1ObjectIdentifierM50969.branch("3").intern();
        countryName = aSN1ObjectIdentifierM50969.branch("6").intern();
        localityName = aSN1ObjectIdentifierM50969.branch("7").intern();
        stateOrProvinceName = aSN1ObjectIdentifierM50969.branch("8").intern();
        organization = aSN1ObjectIdentifierM50969.branch("10").intern();
        organizationalUnitName = aSN1ObjectIdentifierM50969.branch("11").intern();
        id_at_telephoneNumber = aSN1ObjectIdentifierM50969.branch("20").intern();
        id_at_name = aSN1ObjectIdentifierM50969.branch("41").intern();
        id_at_organizationIdentifier = aSN1ObjectIdentifierM50969.branch("97").intern();
        id_SHA1 = C22870.m50969(C6207.f19043);
        ripemd160 = C22870.m50969("1.3.36.3.2.1");
        ripemd160WithRSAEncryption = C22870.m50969("1.3.36.3.3.1.2");
        id_ea_rsa = C22870.m50969("2.5.8.1.1");
        ASN1ObjectIdentifier aSN1ObjectIdentifier = new ASN1ObjectIdentifier("1.3.6.1.5.5.7");
        id_pkix = aSN1ObjectIdentifier;
        id_pe = aSN1ObjectIdentifier.branch("1");
        ASN1ObjectIdentifier aSN1ObjectIdentifierBranch = aSN1ObjectIdentifier.branch("6");
        pkix_algorithms = aSN1ObjectIdentifierBranch;
        id_rsassa_pss_shake128 = aSN1ObjectIdentifierBranch.branch("30");
        id_rsassa_pss_shake256 = aSN1ObjectIdentifierBranch.branch("31");
        id_ecdsa_with_shake128 = aSN1ObjectIdentifierBranch.branch("32");
        id_ecdsa_with_shake256 = aSN1ObjectIdentifierBranch.branch("33");
        id_alg_noSignature = aSN1ObjectIdentifierBranch.branch("2");
        id_alg_unsigned = aSN1ObjectIdentifierBranch.branch("36");
        id_pda = aSN1ObjectIdentifier.branch("9");
        ASN1ObjectIdentifier aSN1ObjectIdentifierBranch2 = aSN1ObjectIdentifier.branch("48");
        id_ad = aSN1ObjectIdentifierBranch2;
        ASN1ObjectIdentifier aSN1ObjectIdentifierIntern = aSN1ObjectIdentifierBranch2.branch("2").intern();
        id_ad_caIssuers = aSN1ObjectIdentifierIntern;
        ASN1ObjectIdentifier aSN1ObjectIdentifierIntern2 = aSN1ObjectIdentifierBranch2.branch("1").intern();
        id_ad_ocsp = aSN1ObjectIdentifierIntern2;
        ocspAccessMethod = aSN1ObjectIdentifierIntern2;
        crlAccessMethod = aSN1ObjectIdentifierIntern;
        id_ce = new ASN1ObjectIdentifier("2.5.29");
        id_PasswordBasedMac = MiscObjectIdentifiers.entrust.branch("66.13");
    }
}
