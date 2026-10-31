package org.bouncycastle.jce.provider;

import java.security.InvalidAlgorithmParameterException;
import java.security.PublicKey;
import java.security.cert.CertPath;
import java.security.cert.CertPathParameters;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertPathValidatorResult;
import java.security.cert.CertPathValidatorSpi;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.PKIXCertPathValidatorResult;
import java.security.cert.PKIXParameters;
import java.security.cert.PKIXRevocationChecker;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.TBSCertificate;
import org.bouncycastle.jcajce.PKIXCertRevocationChecker;
import org.bouncycastle.jcajce.PKIXExtendedBuilderParameters;
import org.bouncycastle.jcajce.PKIXExtendedParameters;
import org.bouncycastle.jcajce.interfaces.BCX509Certificate;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jce.exception.ExtCertPathValidatorException;
import org.bouncycastle.x509.ExtendedPKIXParameters;

/* JADX INFO: loaded from: classes.dex */
public class PKIXCertPathValidatorSpi_8 extends CertPathValidatorSpi {
    public final JcaJceHelper helper;
    public final boolean isForCRLCheck;

    public PKIXCertPathValidatorSpi_8() {
        this(false);
    }

    public PKIXCertPathValidatorSpi_8(boolean z) {
        this.helper = new BCJcaJceHelper();
        this.isForCRLCheck = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void checkCertificate(X509Certificate x509Certificate) throws AnnotatedException {
        if (!(x509Certificate instanceof BCX509Certificate)) {
            try {
                TBSCertificate.getInstance(x509Certificate.getTBSCertificate());
                return;
            } catch (IllegalArgumentException e) {
                throw new AnnotatedException(e.getMessage());
            } catch (CertificateEncodingException e2) {
                throw new AnnotatedException("unable to process TBSCertificate", e2);
            }
        }
        try {
            if (((BCX509Certificate) x509Certificate).getTBSCertificateNative() != null) {
                return;
            }
            e = null;
            throw new AnnotatedException("unable to process TBSCertificate", e);
        } catch (RuntimeException e3) {
            e = e3;
        }
    }

    @Override // java.security.cert.CertPathValidatorSpi
    public PKIXCertPathChecker engineGetRevocationChecker() {
        return new ProvRevocationChecker(this.helper);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.security.cert.CertPathValidatorSpi
    public CertPathValidatorResult engineValidate(CertPath certPath, CertPathParameters certPathParameters) throws CertPathValidatorException, InvalidAlgorithmParameterException {
        PKIXExtendedParameters baseParameters;
        X500Name ca;
        PublicKey cAPublicKey;
        HashSet hashSet;
        int iPrepareNextCertM;
        int iPrepareNextCertI2;
        ArrayList[] arrayListArr;
        ArrayList arrayList;
        HashSet hashSet2;
        if (certPathParameters instanceof PKIXParameters) {
            PKIXExtendedParameters.Builder builder = new PKIXExtendedParameters.Builder((PKIXParameters) certPathParameters);
            if (certPathParameters instanceof ExtendedPKIXParameters) {
                ExtendedPKIXParameters extendedPKIXParameters = (ExtendedPKIXParameters) certPathParameters;
                builder.setUseDeltasEnabled(extendedPKIXParameters.isUseDeltasEnabled());
                builder.setValidityModel(extendedPKIXParameters.getValidityModel());
            }
            baseParameters = builder.build();
        } else if (certPathParameters instanceof PKIXExtendedBuilderParameters) {
            baseParameters = ((PKIXExtendedBuilderParameters) certPathParameters).getBaseParameters();
        } else {
            if (!(certPathParameters instanceof PKIXExtendedParameters)) {
                throw new InvalidAlgorithmParameterException("Parameters must be a " + PKIXParameters.class.getName() + " instance.");
            }
            baseParameters = (PKIXExtendedParameters) certPathParameters;
        }
        if (baseParameters.getTrustAnchors() == null) {
            throw new InvalidAlgorithmParameterException("trustAnchors is null, this is not allowed for certification path validation.");
        }
        List<? extends Certificate> certificates = certPath.getCertificates();
        int size = certificates.size();
        if (certificates.isEmpty()) {
            throw new CertPathValidatorException("Certification path is empty.", null, certPath, -1);
        }
        Date validityDate = CertPathValidatorUtilities.getValidityDate(baseParameters, new Date());
        Set initialPolicies = baseParameters.getInitialPolicies();
        try {
            TrustAnchor trustAnchorFindTrustAnchor = CertPathValidatorUtilities.findTrustAnchor((X509Certificate) certificates.get(certificates.size() - 1), baseParameters.getTrustAnchors(), baseParameters.getSigProvider());
            if (trustAnchorFindTrustAnchor != null) {
                checkCertificate(trustAnchorFindTrustAnchor.getTrustedCert());
                PKIXExtendedParameters pKIXExtendedParametersBuild = new PKIXExtendedParameters.Builder(baseParameters).setTrustAnchor(trustAnchorFindTrustAnchor).build();
                ArrayList arrayList2 = new ArrayList();
                PKIXCertRevocationChecker provRevocationChecker = null;
                for (PKIXCertPathChecker pKIXCertPathChecker : pKIXExtendedParametersBuild.getCertPathCheckers()) {
                    pKIXCertPathChecker.init(false);
                    if (!(pKIXCertPathChecker instanceof PKIXRevocationChecker)) {
                        arrayList2.add(pKIXCertPathChecker);
                    } else {
                        if (provRevocationChecker != null) {
                            throw new CertPathValidatorException("only one PKIXRevocationChecker allowed");
                        }
                        provRevocationChecker = pKIXCertPathChecker instanceof PKIXCertRevocationChecker ? (PKIXCertRevocationChecker) pKIXCertPathChecker : new WrappedRevocationChecker(pKIXCertPathChecker);
                    }
                }
                if (pKIXExtendedParametersBuild.isRevocationEnabled() && provRevocationChecker == null) {
                    provRevocationChecker = new ProvRevocationChecker(this.helper);
                }
                PKIXCertRevocationChecker pKIXCertRevocationChecker = provRevocationChecker;
                int i = size + 1;
                ArrayList[] arrayListArr2 = new ArrayList[i];
                for (int i2 = 0; i2 < i; i2++) {
                    arrayListArr2[i2] = new ArrayList();
                }
                HashSet hashSet3 = new HashSet();
                hashSet3.add("2.5.29.32.0");
                PKIXPolicyNode pKIXPolicyNode = new PKIXPolicyNode(new ArrayList(), 0, hashSet3, null, new HashSet(), "2.5.29.32.0", false);
                arrayListArr2[0].add(pKIXPolicyNode);
                PKIXNameConstraintValidator pKIXNameConstraintValidator = new PKIXNameConstraintValidator();
                HashSet hashSet4 = new HashSet();
                int i3 = pKIXExtendedParametersBuild.isExplicitPolicyRequired() ? 0 : i;
                int i4 = pKIXExtendedParametersBuild.isAnyPolicyInhibited() ? 0 : i;
                if (pKIXExtendedParametersBuild.isPolicyMappingInhibited()) {
                    i = 0;
                }
                X509Certificate trustedCert = trustAnchorFindTrustAnchor.getTrustedCert();
                try {
                    if (trustedCert != null) {
                        ca = PrincipalUtils.getSubjectPrincipal(trustedCert);
                        cAPublicKey = trustedCert.getPublicKey();
                    } else {
                        ca = PrincipalUtils.getCA(trustAnchorFindTrustAnchor);
                        cAPublicKey = trustAnchorFindTrustAnchor.getCAPublicKey();
                    }
                    try {
                        AlgorithmIdentifier algorithmIdentifier = CertPathValidatorUtilities.getAlgorithmIdentifier(cAPublicKey);
                        algorithmIdentifier.getAlgorithm();
                        algorithmIdentifier.getParameters();
                        int i5 = i;
                        if (pKIXExtendedParametersBuild.getTargetConstraints() != null && !pKIXExtendedParametersBuild.getTargetConstraints().match((Certificate) certificates.get(0))) {
                            throw new ExtCertPathValidatorException("Target certificate in certification path does not match targetConstraints.", null, certPath, 0);
                        }
                        PublicKey publicKey = cAPublicKey;
                        X500Name x500Name = ca;
                        X509Certificate x509Certificate = trustedCert;
                        PKIXPolicyNode pKIXPolicyNode2 = pKIXPolicyNode;
                        int i6 = i3;
                        X509Certificate x509Certificate2 = null;
                        int i7 = i5;
                        int i8 = size;
                        int i9 = i4;
                        int size2 = certificates.size() - 1;
                        int i10 = i9;
                        while (size2 >= 0) {
                            int i11 = size - size2;
                            int i12 = i8;
                            X509Certificate x509Certificate3 = (X509Certificate) certificates.get(size2);
                            int i13 = i10;
                            boolean z = size2 == certificates.size() + (-1);
                            try {
                                checkCertificate(x509Certificate3);
                                List<? extends Certificate> list = certificates;
                                PKIXExtendedParameters pKIXExtendedParameters = pKIXExtendedParametersBuild;
                                PKIXExtendedParameters pKIXExtendedParameters2 = pKIXExtendedParametersBuild;
                                int iPrepareNextCertI1 = i6;
                                Date date = validityDate;
                                Date date2 = validityDate;
                                int i14 = i7;
                                int i15 = size2;
                                PKIXNameConstraintValidator pKIXNameConstraintValidator2 = pKIXNameConstraintValidator;
                                ArrayList[] arrayListArr3 = arrayListArr2;
                                ArrayList arrayList3 = arrayList2;
                                TrustAnchor trustAnchor = trustAnchorFindTrustAnchor;
                                RFC3280CertPathUtilities.processCertA(certPath, pKIXExtendedParameters, date, pKIXCertRevocationChecker, size2, publicKey, z, x500Name, x509Certificate);
                                RFC3280CertPathUtilities.processCertBC(certPath, i15, pKIXNameConstraintValidator2, this.isForCRLCheck);
                                PKIXPolicyNode pKIXPolicyNodeProcessCertE = RFC3280CertPathUtilities.processCertE(certPath, i15, RFC3280CertPathUtilities.processCertD(certPath, i15, hashSet4, pKIXPolicyNode2, arrayListArr3, i13, this.isForCRLCheck));
                                RFC3280CertPathUtilities.processCertF(certPath, i15, pKIXPolicyNodeProcessCertE, iPrepareNextCertI1);
                                if (i11 == size) {
                                    iPrepareNextCertM = i12;
                                    iPrepareNextCertI2 = i14;
                                    arrayListArr = arrayListArr3;
                                    arrayList = arrayList3;
                                    pKIXPolicyNode2 = pKIXPolicyNodeProcessCertE;
                                    i10 = i13;
                                } else if (x509Certificate3 == null || x509Certificate3.getVersion() != 1) {
                                    RFC3280CertPathUtilities.prepareNextCertA(certPath, i15);
                                    arrayListArr = arrayListArr3;
                                    PKIXPolicyNode pKIXPolicyNodePrepareCertB = RFC3280CertPathUtilities.prepareCertB(certPath, i15, arrayListArr, pKIXPolicyNodeProcessCertE, i14);
                                    RFC3280CertPathUtilities.prepareNextCertG(certPath, i15, pKIXNameConstraintValidator2);
                                    int iPrepareNextCertH1 = RFC3280CertPathUtilities.prepareNextCertH1(certPath, i15, iPrepareNextCertI1);
                                    int iPrepareNextCertH2 = RFC3280CertPathUtilities.prepareNextCertH2(certPath, i15, i14);
                                    int iPrepareNextCertH3 = RFC3280CertPathUtilities.prepareNextCertH3(certPath, i15, i13);
                                    iPrepareNextCertI1 = RFC3280CertPathUtilities.prepareNextCertI1(certPath, i15, iPrepareNextCertH1);
                                    iPrepareNextCertI2 = RFC3280CertPathUtilities.prepareNextCertI2(certPath, i15, iPrepareNextCertH2);
                                    int iPrepareNextCertJ = RFC3280CertPathUtilities.prepareNextCertJ(certPath, i15, iPrepareNextCertH3);
                                    RFC3280CertPathUtilities.prepareNextCertK(certPath, i15);
                                    iPrepareNextCertM = RFC3280CertPathUtilities.prepareNextCertM(certPath, i15, RFC3280CertPathUtilities.prepareNextCertL(certPath, i15, i12));
                                    RFC3280CertPathUtilities.prepareNextCertN(certPath, i15);
                                    Set<String> criticalExtensionOIDs = x509Certificate3.getCriticalExtensionOIDs();
                                    if (criticalExtensionOIDs != null) {
                                        hashSet2 = new HashSet(criticalExtensionOIDs);
                                        hashSet2.remove(RFC3280CertPathUtilities.KEY_USAGE);
                                        hashSet2.remove(RFC3280CertPathUtilities.CERTIFICATE_POLICIES);
                                        hashSet2.remove(RFC3280CertPathUtilities.POLICY_MAPPINGS);
                                        hashSet2.remove(RFC3280CertPathUtilities.INHIBIT_ANY_POLICY);
                                        hashSet2.remove(RFC3280CertPathUtilities.ISSUING_DISTRIBUTION_POINT);
                                        hashSet2.remove(RFC3280CertPathUtilities.DELTA_CRL_INDICATOR);
                                        hashSet2.remove(RFC3280CertPathUtilities.POLICY_CONSTRAINTS);
                                        hashSet2.remove(RFC3280CertPathUtilities.BASIC_CONSTRAINTS);
                                        hashSet2.remove(RFC3280CertPathUtilities.SUBJECT_ALTERNATIVE_NAME);
                                        hashSet2.remove(RFC3280CertPathUtilities.NAME_CONSTRAINTS);
                                    } else {
                                        hashSet2 = new HashSet();
                                    }
                                    arrayList = arrayList3;
                                    RFC3280CertPathUtilities.prepareNextCertO(certPath, i15, hashSet2, arrayList);
                                    X500Name subjectPrincipal = PrincipalUtils.getSubjectPrincipal(x509Certificate3);
                                    try {
                                        PublicKey nextWorkingKey = CertPathValidatorUtilities.getNextWorkingKey(certPath.getCertificates(), i15, this.helper);
                                        AlgorithmIdentifier algorithmIdentifier2 = CertPathValidatorUtilities.getAlgorithmIdentifier(nextWorkingKey);
                                        algorithmIdentifier2.getAlgorithm();
                                        algorithmIdentifier2.getParameters();
                                        pKIXPolicyNode2 = pKIXPolicyNodePrepareCertB;
                                        i10 = iPrepareNextCertJ;
                                        x500Name = subjectPrincipal;
                                        publicKey = nextWorkingKey;
                                        x509Certificate = x509Certificate3;
                                    } catch (CertPathValidatorException e) {
                                        throw new CertPathValidatorException("Next working key could not be retrieved.", e, certPath, i15);
                                    }
                                } else {
                                    if (i11 != 1 || !x509Certificate3.equals(trustAnchor.getTrustedCert())) {
                                        throw new CertPathValidatorException("Version 1 certificates can't be used as CA ones.", null, certPath, i15);
                                    }
                                    iPrepareNextCertM = i12;
                                    iPrepareNextCertI2 = i14;
                                    arrayListArr = arrayListArr3;
                                    arrayList = arrayList3;
                                    pKIXPolicyNode2 = pKIXPolicyNodeProcessCertE;
                                    i10 = i13;
                                }
                                i6 = iPrepareNextCertI1;
                                int i16 = iPrepareNextCertM;
                                i7 = iPrepareNextCertI2;
                                arrayListArr2 = arrayListArr;
                                arrayList2 = arrayList;
                                pKIXNameConstraintValidator = pKIXNameConstraintValidator2;
                                trustAnchorFindTrustAnchor = trustAnchor;
                                certificates = list;
                                validityDate = date2;
                                size2 = i15 - 1;
                                x509Certificate2 = x509Certificate3;
                                i8 = i16;
                                pKIXExtendedParametersBuild = pKIXExtendedParameters2;
                            } catch (AnnotatedException e2) {
                                throw new CertPathValidatorException(e2.getMessage(), e2.getUnderlyingException(), certPath, size2);
                            }
                        }
                        PKIXExtendedParameters pKIXExtendedParameters3 = pKIXExtendedParametersBuild;
                        ArrayList arrayList4 = arrayList2;
                        TrustAnchor trustAnchor2 = trustAnchorFindTrustAnchor;
                        int i17 = size2;
                        ArrayList[] arrayListArr4 = arrayListArr2;
                        int i18 = i17 + 1;
                        int iWrapupCertB = RFC3280CertPathUtilities.wrapupCertB(certPath, i18, RFC3280CertPathUtilities.wrapupCertA(i6, x509Certificate2));
                        Set<String> criticalExtensionOIDs2 = x509Certificate2.getCriticalExtensionOIDs();
                        if (criticalExtensionOIDs2 != null) {
                            hashSet = new HashSet(criticalExtensionOIDs2);
                            hashSet.remove(RFC3280CertPathUtilities.KEY_USAGE);
                            hashSet.remove(RFC3280CertPathUtilities.CERTIFICATE_POLICIES);
                            hashSet.remove(RFC3280CertPathUtilities.POLICY_MAPPINGS);
                            hashSet.remove(RFC3280CertPathUtilities.INHIBIT_ANY_POLICY);
                            hashSet.remove(RFC3280CertPathUtilities.ISSUING_DISTRIBUTION_POINT);
                            hashSet.remove(RFC3280CertPathUtilities.DELTA_CRL_INDICATOR);
                            hashSet.remove(RFC3280CertPathUtilities.POLICY_CONSTRAINTS);
                            hashSet.remove(RFC3280CertPathUtilities.BASIC_CONSTRAINTS);
                            hashSet.remove(RFC3280CertPathUtilities.SUBJECT_ALTERNATIVE_NAME);
                            hashSet.remove(RFC3280CertPathUtilities.NAME_CONSTRAINTS);
                            hashSet.remove(RFC3280CertPathUtilities.CRL_DISTRIBUTION_POINTS);
                            hashSet.remove(Extension.extendedKeyUsage.getId());
                        } else {
                            hashSet = new HashSet();
                        }
                        RFC3280CertPathUtilities.wrapupCertF(certPath, i18, arrayList4, hashSet);
                        X509Certificate x509Certificate4 = x509Certificate2;
                        PKIXPolicyNode pKIXPolicyNodeWrapupCertG = RFC3280CertPathUtilities.wrapupCertG(certPath, pKIXExtendedParameters3, initialPolicies, i18, arrayListArr4, pKIXPolicyNode2, hashSet4);
                        if (iWrapupCertB > 0 || pKIXPolicyNodeWrapupCertG != null) {
                            return new PKIXCertPathValidatorResult(trustAnchor2, pKIXPolicyNodeWrapupCertG, x509Certificate4.getPublicKey());
                        }
                        throw new CertPathValidatorException("Path processing failed on policy.", null, certPath, i17);
                    } catch (CertPathValidatorException e3) {
                        throw new ExtCertPathValidatorException("Algorithm identifier of public key of trust anchor could not be read.", e3, certPath, -1);
                    }
                } catch (RuntimeException e4) {
                    throw new ExtCertPathValidatorException("Subject of trust anchor could not be (re)encoded.", e4, certPath, -1);
                }
            }
            try {
                throw new CertPathValidatorException("Trust anchor for certification path not found.", null, certPath, -1);
            } catch (AnnotatedException e5) {
                e = e5;
            }
        } catch (AnnotatedException e6) {
            e = e6;
        }
        throw new CertPathValidatorException(e.getMessage(), e.getUnderlyingException(), certPath, certificates.size() - 1);
    }
}
