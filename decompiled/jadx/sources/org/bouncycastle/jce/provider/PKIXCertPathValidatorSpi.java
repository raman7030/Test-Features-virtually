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
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.TBSCertificate;
import org.bouncycastle.jcajce.PKIXExtendedBuilderParameters;
import org.bouncycastle.jcajce.PKIXExtendedParameters;
import org.bouncycastle.jcajce.interfaces.BCX509Certificate;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jce.exception.ExtCertPathValidatorException;
import org.bouncycastle.x509.ExtendedPKIXParameters;

/* JADX INFO: loaded from: classes.dex */
public class PKIXCertPathValidatorSpi extends CertPathValidatorSpi {
    public final JcaJceHelper helper;
    public final boolean isForCRLCheck;

    public PKIXCertPathValidatorSpi() {
        this(false);
    }

    public PKIXCertPathValidatorSpi(boolean z) {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v8, types: [org.bouncycastle.asn1.x509.AlgorithmIdentifier] */
    @Override // java.security.cert.CertPathValidatorSpi
    public CertPathValidatorResult engineValidate(CertPath certPath, CertPathParameters certPathParameters) throws CertPathValidatorException, InvalidAlgorithmParameterException {
        PKIXExtendedParameters baseParameters;
        X500Name ca;
        PublicKey cAPublicKey;
        HashSet hashSet;
        X509Certificate x509Certificate;
        int i;
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
        int algorithmIdentifier = -1;
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
                int i2 = size + 1;
                ArrayList[] arrayListArr = new ArrayList[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    arrayListArr[i3] = new ArrayList();
                }
                HashSet hashSet3 = new HashSet();
                hashSet3.add("2.5.29.32.0");
                PKIXPolicyNode pKIXPolicyNode = new PKIXPolicyNode(new ArrayList(), 0, hashSet3, null, new HashSet(), "2.5.29.32.0", false);
                arrayListArr[0].add(pKIXPolicyNode);
                PKIXNameConstraintValidator pKIXNameConstraintValidator = new PKIXNameConstraintValidator();
                HashSet hashSet4 = new HashSet();
                int i4 = pKIXExtendedParametersBuild.isExplicitPolicyRequired() ? 0 : i2;
                int i5 = pKIXExtendedParametersBuild.isAnyPolicyInhibited() ? 0 : i2;
                if (pKIXExtendedParametersBuild.isPolicyMappingInhibited()) {
                    i2 = 0;
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
                        algorithmIdentifier = CertPathValidatorUtilities.getAlgorithmIdentifier(cAPublicKey);
                        algorithmIdentifier.getAlgorithm();
                        algorithmIdentifier.getParameters();
                        if (pKIXExtendedParametersBuild.getTargetConstraints() != null && !pKIXExtendedParametersBuild.getTargetConstraints().match((Certificate) certificates.get(0))) {
                            throw new ExtCertPathValidatorException("Target certificate in certification path does not match targetConstraints.", null, certPath, 0);
                        }
                        List certPathCheckers = pKIXExtendedParametersBuild.getCertPathCheckers();
                        Iterator it = certPathCheckers.iterator();
                        while (it.hasNext()) {
                            ((PKIXCertPathChecker) it.next()).init(false);
                            i2 = i2;
                        }
                        int i6 = i2;
                        ProvCrlRevocationChecker provCrlRevocationChecker = pKIXExtendedParametersBuild.isRevocationEnabled() ? new ProvCrlRevocationChecker(this.helper) : null;
                        X509Certificate x509Certificate2 = null;
                        int i7 = i4;
                        int i8 = i6;
                        int i9 = size;
                        int size2 = certificates.size() - 1;
                        int i10 = i5;
                        PKIXPolicyNode pKIXPolicyNode2 = pKIXPolicyNode;
                        while (size2 >= 0) {
                            int i11 = size - size2;
                            int iPrepareNextCertM = i9;
                            X509Certificate x509Certificate3 = (X509Certificate) certificates.get(size2);
                            int i12 = i10;
                            boolean z = size2 == certificates.size() + (-1);
                            try {
                                checkCertificate(x509Certificate3);
                                List<? extends Certificate> list = certificates;
                                int i13 = i7;
                                PKIXExtendedParameters pKIXExtendedParameters = pKIXExtendedParametersBuild;
                                PKIXExtendedParameters pKIXExtendedParameters2 = pKIXExtendedParametersBuild;
                                Date date = validityDate;
                                List list2 = certPathCheckers;
                                int i14 = i8;
                                int i15 = size2;
                                PKIXNameConstraintValidator pKIXNameConstraintValidator2 = pKIXNameConstraintValidator;
                                boolean z2 = z;
                                ArrayList[] arrayListArr2 = arrayListArr;
                                TrustAnchor trustAnchor = trustAnchorFindTrustAnchor;
                                RFC3280CertPathUtilities.processCertA(certPath, pKIXExtendedParameters, validityDate, provCrlRevocationChecker, size2, cAPublicKey, z2, ca, trustedCert);
                                RFC3280CertPathUtilities.processCertBC(certPath, i15, pKIXNameConstraintValidator2, this.isForCRLCheck);
                                PKIXPolicyNode pKIXPolicyNodeProcessCertE = RFC3280CertPathUtilities.processCertE(certPath, i15, RFC3280CertPathUtilities.processCertD(certPath, i15, hashSet4, pKIXPolicyNode2, arrayListArr2, i12, this.isForCRLCheck));
                                RFC3280CertPathUtilities.processCertF(certPath, i15, pKIXPolicyNodeProcessCertE, i13);
                                if (i11 != size) {
                                    if (x509Certificate3 != null && x509Certificate3.getVersion() == 1) {
                                        if (i11 == 1) {
                                            x509Certificate = x509Certificate3;
                                            if (x509Certificate.equals(trustAnchor.getTrustedCert())) {
                                            }
                                        }
                                        throw new CertPathValidatorException("Version 1 certificates can't be used as CA ones.", null, certPath, i15);
                                    }
                                    x509Certificate = x509Certificate3;
                                    RFC3280CertPathUtilities.prepareNextCertA(certPath, i15);
                                    arrayListArr2 = arrayListArr2;
                                    PKIXPolicyNode pKIXPolicyNodePrepareCertB = RFC3280CertPathUtilities.prepareCertB(certPath, i15, arrayListArr2, pKIXPolicyNodeProcessCertE, i14);
                                    RFC3280CertPathUtilities.prepareNextCertG(certPath, i15, pKIXNameConstraintValidator2);
                                    int iPrepareNextCertH1 = RFC3280CertPathUtilities.prepareNextCertH1(certPath, i15, i13);
                                    int iPrepareNextCertH2 = RFC3280CertPathUtilities.prepareNextCertH2(certPath, i15, i14);
                                    int iPrepareNextCertH3 = RFC3280CertPathUtilities.prepareNextCertH3(certPath, i15, i12);
                                    int iPrepareNextCertI1 = RFC3280CertPathUtilities.prepareNextCertI1(certPath, i15, iPrepareNextCertH1);
                                    int iPrepareNextCertI2 = RFC3280CertPathUtilities.prepareNextCertI2(certPath, i15, iPrepareNextCertH2);
                                    int iPrepareNextCertJ = RFC3280CertPathUtilities.prepareNextCertJ(certPath, i15, iPrepareNextCertH3);
                                    RFC3280CertPathUtilities.prepareNextCertK(certPath, i15);
                                    iPrepareNextCertM = RFC3280CertPathUtilities.prepareNextCertM(certPath, i15, RFC3280CertPathUtilities.prepareNextCertL(certPath, i15, iPrepareNextCertM));
                                    RFC3280CertPathUtilities.prepareNextCertN(certPath, i15);
                                    Set<String> criticalExtensionOIDs = x509Certificate.getCriticalExtensionOIDs();
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
                                    list2 = list2;
                                    RFC3280CertPathUtilities.prepareNextCertO(certPath, i15, hashSet2, list2);
                                    X500Name subjectPrincipal = PrincipalUtils.getSubjectPrincipal(x509Certificate);
                                    try {
                                        PublicKey nextWorkingKey = CertPathValidatorUtilities.getNextWorkingKey(certPath.getCertificates(), i15, this.helper);
                                        AlgorithmIdentifier algorithmIdentifier2 = CertPathValidatorUtilities.getAlgorithmIdentifier(nextWorkingKey);
                                        algorithmIdentifier2.getAlgorithm();
                                        algorithmIdentifier2.getParameters();
                                        pKIXPolicyNode2 = pKIXPolicyNodePrepareCertB;
                                        trustedCert = x509Certificate;
                                        i10 = iPrepareNextCertJ;
                                        ca = subjectPrincipal;
                                        cAPublicKey = nextWorkingKey;
                                        i = iPrepareNextCertI2;
                                        i7 = iPrepareNextCertI1;
                                    } catch (CertPathValidatorException e) {
                                        throw new CertPathValidatorException("Next working key could not be retrieved.", e, certPath, i15);
                                    }
                                    size2 = i15 - 1;
                                    i9 = iPrepareNextCertM;
                                    certificates = list;
                                    validityDate = date;
                                    trustAnchorFindTrustAnchor = trustAnchor;
                                    pKIXNameConstraintValidator = pKIXNameConstraintValidator2;
                                    pKIXExtendedParametersBuild = pKIXExtendedParameters2;
                                    int i16 = i;
                                    x509Certificate2 = x509Certificate;
                                    certPathCheckers = list2;
                                    arrayListArr = arrayListArr2;
                                    i8 = i16;
                                } else {
                                    x509Certificate = x509Certificate3;
                                }
                                pKIXPolicyNode2 = pKIXPolicyNodeProcessCertE;
                                i = i14;
                                i10 = i12;
                                i7 = i13;
                                size2 = i15 - 1;
                                i9 = iPrepareNextCertM;
                                certificates = list;
                                validityDate = date;
                                trustAnchorFindTrustAnchor = trustAnchor;
                                pKIXNameConstraintValidator = pKIXNameConstraintValidator2;
                                pKIXExtendedParametersBuild = pKIXExtendedParameters2;
                                int i17 = i;
                                x509Certificate2 = x509Certificate;
                                certPathCheckers = list2;
                                arrayListArr = arrayListArr2;
                                i8 = i17;
                            } catch (AnnotatedException e2) {
                                throw new CertPathValidatorException(e2.getMessage(), e2.getUnderlyingException(), certPath, size2);
                            }
                        }
                        PKIXExtendedParameters pKIXExtendedParameters3 = pKIXExtendedParametersBuild;
                        int i18 = size2;
                        ArrayList[] arrayListArr3 = arrayListArr;
                        TrustAnchor trustAnchor2 = trustAnchorFindTrustAnchor;
                        List list3 = certPathCheckers;
                        int i19 = i18 + 1;
                        int iWrapupCertB = RFC3280CertPathUtilities.wrapupCertB(certPath, i19, RFC3280CertPathUtilities.wrapupCertA(i7, x509Certificate2));
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
                        RFC3280CertPathUtilities.wrapupCertF(certPath, i19, list3, hashSet);
                        X509Certificate x509Certificate4 = x509Certificate2;
                        PKIXPolicyNode pKIXPolicyNodeWrapupCertG = RFC3280CertPathUtilities.wrapupCertG(certPath, pKIXExtendedParameters3, initialPolicies, i19, arrayListArr3, pKIXPolicyNode2, hashSet4);
                        if (iWrapupCertB > 0 || pKIXPolicyNodeWrapupCertG != null) {
                            return new PKIXCertPathValidatorResult(trustAnchor2, pKIXPolicyNodeWrapupCertG, x509Certificate4.getPublicKey());
                        }
                        throw new CertPathValidatorException("Path processing failed on policy.", null, certPath, i18);
                    } catch (CertPathValidatorException e3) {
                        throw new ExtCertPathValidatorException("Algorithm identifier of public key of trust anchor could not be read.", e3, certPath, -1);
                    }
                } catch (RuntimeException e4) {
                    throw new ExtCertPathValidatorException("Subject of trust anchor could not be (re)encoded.", e4, certPath, algorithmIdentifier);
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
