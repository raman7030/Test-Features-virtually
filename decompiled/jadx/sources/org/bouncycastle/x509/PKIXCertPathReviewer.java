package org.bouncycastle.x509;

import com.alipay.sdk.m.n.a;
import com.alipay.sdk.m.n.b;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.cert.CertPath;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.PKIXParameters;
import java.security.cert.PolicyNode;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLEntry;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1Enumerated;
import org.bouncycastle.asn1.ASN1IA5String;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.x509.AccessDescription;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.AuthorityInformationAccess;
import org.bouncycastle.asn1.x509.AuthorityKeyIdentifier;
import org.bouncycastle.asn1.x509.BasicConstraints;
import org.bouncycastle.asn1.x509.CRLDistPoint;
import org.bouncycastle.asn1.x509.DistributionPoint;
import org.bouncycastle.asn1.x509.DistributionPointName;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.GeneralSubtree;
import org.bouncycastle.asn1.x509.IssuingDistributionPoint;
import org.bouncycastle.asn1.x509.NameConstraints;
import org.bouncycastle.asn1.x509.PolicyInformation;
import org.bouncycastle.asn1.x509.qualified.ETSIQCObjectIdentifiers;
import org.bouncycastle.asn1.x509.qualified.MonetaryValue;
import org.bouncycastle.asn1.x509.qualified.QCStatement;
import org.bouncycastle.asn1.x509.qualified.RFC3739QCObjectIdentifiers;
import org.bouncycastle.i18n.ErrorBundle;
import org.bouncycastle.i18n.LocaleString;
import org.bouncycastle.i18n.filter.TrustedInput;
import org.bouncycastle.i18n.filter.UntrustedInput;
import org.bouncycastle.i18n.filter.UntrustedUrlInput;
import org.bouncycastle.jce.provider.AnnotatedException;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.provider.PKIXNameConstraintValidator;
import org.bouncycastle.jce.provider.PKIXNameConstraintValidatorException;
import org.bouncycastle.jce.provider.PKIXPolicyNode;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class PKIXCertPathReviewer extends CertPathValidatorUtilities {
    public static final int NAME_CHECK_MAX = 1024;
    public static final String RESOURCE_NAME = "org.bouncycastle.x509.CertPathReviewerMessages";
    public CertPath certPath;
    public List certs;
    public Date currentDate;
    public List[] errors;
    public boolean initialized;
    public int n;
    public List[] notifications;
    public PKIXParameters pkixParams;
    public PolicyNode policyTree;
    public PublicKey subjectPublicKey;
    public TrustAnchor trustAnchor;
    public Date validDate;
    public static final String QC_STATEMENT = Extension.qCStatements.getId();
    public static final String CRL_DIST_POINTS = Extension.cRLDistributionPoints.getId();
    public static final String AUTH_INFO_ACCESS = Extension.authorityInfoAccess.getId();

    public PKIXCertPathReviewer() {
    }

    public PKIXCertPathReviewer(CertPath certPath, PKIXParameters pKIXParameters) throws CertPathReviewerException {
        init(certPath, pKIXParameters);
    }

    private String IPtoString(byte[] bArr) {
        try {
            return InetAddress.getByAddress(bArr).getHostAddress();
        } catch (Exception unused) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i != bArr.length; i++) {
                sb.append(Integer.toHexString(bArr[i] & 255));
                sb.append(' ');
            }
            return sb.toString();
        }
    }

    private void checkCriticalExtensions() {
        List<PKIXCertPathChecker> certPathCheckers = this.pkixParams.getCertPathCheckers();
        Iterator<PKIXCertPathChecker> it = certPathCheckers.iterator();
        while (it.hasNext()) {
            try {
                try {
                    it.next().init(false);
                } catch (CertPathValidatorException e) {
                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.certPathCheckerError", new Object[]{e.getMessage(), e, e.getClass().getName()}), e);
                }
            } catch (CertPathReviewerException e2) {
                addError(e2.getErrorMessage(), e2.getIndex());
                return;
            }
        }
        for (int size = this.certs.size() - 1; size >= 0; size--) {
            X509Certificate x509Certificate = (X509Certificate) this.certs.get(size);
            Set<String> criticalExtensionOIDs = x509Certificate.getCriticalExtensionOIDs();
            if (criticalExtensionOIDs != null && !criticalExtensionOIDs.isEmpty()) {
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.KEY_USAGE);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.CERTIFICATE_POLICIES);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.POLICY_MAPPINGS);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.INHIBIT_ANY_POLICY);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.ISSUING_DISTRIBUTION_POINT);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.DELTA_CRL_INDICATOR);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.POLICY_CONSTRAINTS);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.BASIC_CONSTRAINTS);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.SUBJECT_ALTERNATIVE_NAME);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.NAME_CONSTRAINTS);
                if (size == 0) {
                    criticalExtensionOIDs.remove(Extension.extendedKeyUsage.getId());
                }
                String str = QC_STATEMENT;
                if (criticalExtensionOIDs.contains(str) && processQcStatements(x509Certificate, size)) {
                    criticalExtensionOIDs.remove(str);
                }
                Iterator<PKIXCertPathChecker> it2 = certPathCheckers.iterator();
                while (it2.hasNext()) {
                    try {
                        it2.next().check(x509Certificate, criticalExtensionOIDs);
                    } catch (CertPathValidatorException e3) {
                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.criticalExtensionError", new Object[]{e3.getMessage(), e3, e3.getClass().getName()}), e3.getCause(), this.certPath, size);
                    }
                }
                if (!criticalExtensionOIDs.isEmpty()) {
                    Iterator<String> it3 = criticalExtensionOIDs.iterator();
                    while (it3.hasNext()) {
                        addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.unknownCriticalExt", new Object[]{new ASN1ObjectIdentifier(it3.next())}), size);
                    }
                }
            }
        }
    }

    private void checkNameConstraints() {
        PKIXNameConstraintValidator pKIXNameConstraintValidator = new PKIXNameConstraintValidator();
        try {
            for (int size = this.certs.size() - 1; size > 0; size--) {
                X509Certificate x509Certificate = (X509Certificate) this.certs.get(size);
                if (!CertPathValidatorUtilities.isSelfIssued(x509Certificate)) {
                    X500Principal subjectPrincipal = CertPathValidatorUtilities.getSubjectPrincipal(x509Certificate);
                    try {
                        ASN1Sequence aSN1Sequence = (ASN1Sequence) new ASN1InputStream(new ByteArrayInputStream(subjectPrincipal.getEncoded())).readObject();
                        try {
                            pKIXNameConstraintValidator.checkPermittedDN(aSN1Sequence);
                            try {
                                pKIXNameConstraintValidator.checkExcludedDN(aSN1Sequence);
                                try {
                                    ASN1Sequence aSN1Sequence2 = (ASN1Sequence) CertPathValidatorUtilities.getExtensionValue(x509Certificate, CertPathValidatorUtilities.SUBJECT_ALTERNATIVE_NAME);
                                    if (aSN1Sequence2 != null) {
                                        if (aSN1Sequence2.size() > 1024) {
                                            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.subjAltNameExtError"), this.certPath, size);
                                        }
                                        for (int i = 0; i < aSN1Sequence2.size(); i++) {
                                            GeneralName generalName = GeneralName.getInstance(aSN1Sequence2.getObjectAt(i));
                                            try {
                                                pKIXNameConstraintValidator.checkPermitted(generalName);
                                                pKIXNameConstraintValidator.checkExcluded(generalName);
                                            } catch (PKIXNameConstraintValidatorException e) {
                                                throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.notPermittedEmail", new Object[]{new UntrustedInput(generalName)}), e, this.certPath, size);
                                            }
                                        }
                                    }
                                } catch (AnnotatedException e2) {
                                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.subjAltNameExtError"), e2, this.certPath, size);
                                }
                            } catch (PKIXNameConstraintValidatorException e3) {
                                throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.excludedDN", new Object[]{new UntrustedInput(subjectPrincipal.getName())}), e3, this.certPath, size);
                            }
                        } catch (PKIXNameConstraintValidatorException e4) {
                            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.notPermittedDN", new Object[]{new UntrustedInput(subjectPrincipal.getName())}), e4, this.certPath, size);
                        }
                    } catch (IOException e5) {
                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.ncSubjectNameError", new Object[]{new UntrustedInput(subjectPrincipal)}), e5, this.certPath, size);
                    }
                }
                try {
                    ASN1Sequence aSN1Sequence3 = (ASN1Sequence) CertPathValidatorUtilities.getExtensionValue(x509Certificate, CertPathValidatorUtilities.NAME_CONSTRAINTS);
                    if (aSN1Sequence3 != null) {
                        NameConstraints nameConstraints = NameConstraints.getInstance(aSN1Sequence3);
                        GeneralSubtree[] permittedSubtrees = nameConstraints.getPermittedSubtrees();
                        if (permittedSubtrees != null) {
                            pKIXNameConstraintValidator.intersectPermittedSubtree(permittedSubtrees);
                        }
                        GeneralSubtree[] excludedSubtrees = nameConstraints.getExcludedSubtrees();
                        if (excludedSubtrees != null) {
                            for (int i2 = 0; i2 != excludedSubtrees.length; i2++) {
                                pKIXNameConstraintValidator.addExcludedSubtree(excludedSubtrees[i2]);
                            }
                        }
                    }
                } catch (AnnotatedException e6) {
                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.ncExtError"), e6, this.certPath, size);
                }
            }
        } catch (CertPathReviewerException e7) {
            addError(e7.getErrorMessage(), e7.getIndex());
        }
    }

    private void checkPathLength() {
        BasicConstraints basicConstraints;
        ASN1Integer pathLenConstraintInteger;
        int iMin = this.n;
        int i = 0;
        for (int size = this.certs.size() - 1; size > 0; size--) {
            X509Certificate x509Certificate = (X509Certificate) this.certs.get(size);
            if (!CertPathValidatorUtilities.isSelfIssued(x509Certificate)) {
                if (iMin <= 0) {
                    addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.pathLengthExtended"));
                }
                iMin--;
                i++;
            }
            try {
                basicConstraints = BasicConstraints.getInstance(CertPathValidatorUtilities.getExtensionValue(x509Certificate, CertPathValidatorUtilities.BASIC_CONSTRAINTS));
            } catch (AnnotatedException unused) {
                addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.processLengthConstError"), size);
                basicConstraints = null;
            }
            if (basicConstraints != null && basicConstraints.isCA() && (pathLenConstraintInteger = basicConstraints.getPathLenConstraintInteger()) != null) {
                iMin = Math.min(iMin, pathLenConstraintInteger.intPositiveValueExact());
            }
        }
        addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.totalPathLength", new Object[]{Integers.valueOf(i)}));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0220 A[Catch: CertPathReviewerException -> 0x05e6, TryCatch #6 {CertPathReviewerException -> 0x05e6, blocks: (B:17:0x006c, B:21:0x007c, B:23:0x0089, B:27:0x0099, B:28:0x00a4, B:30:0x00aa, B:32:0x00cb, B:33:0x00d3, B:35:0x00d9, B:37:0x00de, B:38:0x00ea, B:42:0x00f6, B:45:0x00fd, B:46:0x0106, B:48:0x010c, B:50:0x0116, B:53:0x011d, B:55:0x0121, B:94:0x0205, B:96:0x020b, B:97:0x020e, B:99:0x0214, B:101:0x0220, B:104:0x0228, B:105:0x022b, B:106:0x022e, B:108:0x0234, B:109:0x023d, B:111:0x0243, B:119:0x0266, B:120:0x0272, B:121:0x0273, B:123:0x0277, B:125:0x027f, B:126:0x0283, B:128:0x0289, B:131:0x02ab, B:133:0x02b5, B:134:0x02ba, B:135:0x02c6, B:136:0x02c7, B:137:0x02d3, B:139:0x02d6, B:140:0x02e3, B:142:0x02e9, B:144:0x030f, B:146:0x0327, B:145:0x031e, B:147:0x032e, B:148:0x0334, B:150:0x033a, B:152:0x0342, B:163:0x036c, B:156:0x034a, B:157:0x0356, B:159:0x0358, B:160:0x0367, B:167:0x0379, B:178:0x0396, B:180:0x03a0, B:181:0x03a4, B:183:0x03aa, B:188:0x03ba, B:191:0x03c7, B:194:0x03d4, B:196:0x03de, B:208:0x041e, B:200:0x03ea, B:201:0x03f8, B:202:0x03f9, B:203:0x0407, B:205:0x0409, B:206:0x0417, B:60:0x0130, B:61:0x0134, B:63:0x013a, B:65:0x0150, B:67:0x015a, B:68:0x015f, B:70:0x0165, B:71:0x0173, B:73:0x0179, B:75:0x0185, B:79:0x0193, B:80:0x0199, B:82:0x019f, B:87:0x01b9, B:76:0x0189, B:78:0x018d, B:90:0x01ed, B:92:0x01f8, B:93:0x0204, B:210:0x042d, B:211:0x043a, B:212:0x043b, B:216:0x044c, B:218:0x0456, B:219:0x045a, B:221:0x0460, B:224:0x046d, B:229:0x047e, B:306:0x05cb, B:307:0x05d7, B:232:0x0489, B:233:0x0495, B:234:0x0496, B:236:0x049c, B:238:0x04a4, B:240:0x04aa, B:242:0x04b4, B:243:0x04b7, B:245:0x04bd, B:247:0x04cd, B:248:0x04d1, B:250:0x04d7, B:251:0x04df, B:252:0x04e2, B:253:0x04e5, B:254:0x04e9, B:256:0x04ef, B:257:0x04fd, B:259:0x0505, B:260:0x0508, B:262:0x050e, B:264:0x051a, B:265:0x051e, B:266:0x0521, B:267:0x0524, B:268:0x0530, B:270:0x0535, B:272:0x053f, B:273:0x0542, B:275:0x0548, B:277:0x0558, B:278:0x055c, B:280:0x0562, B:282:0x0572, B:283:0x0576, B:284:0x0579, B:285:0x057c, B:286:0x0582, B:288:0x0588, B:290:0x059a, B:293:0x05a4, B:294:0x05a6, B:296:0x05aa, B:297:0x05ad, B:299:0x05b3, B:301:0x05bf, B:302:0x05c3, B:309:0x05d9, B:310:0x05e5), top: B:326:0x006c, inners: #0, #1, #2, #3, #4, #5, #7, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x0234 A[Catch: CertPathReviewerException -> 0x05e6, TryCatch #6 {CertPathReviewerException -> 0x05e6, blocks: (B:17:0x006c, B:21:0x007c, B:23:0x0089, B:27:0x0099, B:28:0x00a4, B:30:0x00aa, B:32:0x00cb, B:33:0x00d3, B:35:0x00d9, B:37:0x00de, B:38:0x00ea, B:42:0x00f6, B:45:0x00fd, B:46:0x0106, B:48:0x010c, B:50:0x0116, B:53:0x011d, B:55:0x0121, B:94:0x0205, B:96:0x020b, B:97:0x020e, B:99:0x0214, B:101:0x0220, B:104:0x0228, B:105:0x022b, B:106:0x022e, B:108:0x0234, B:109:0x023d, B:111:0x0243, B:119:0x0266, B:120:0x0272, B:121:0x0273, B:123:0x0277, B:125:0x027f, B:126:0x0283, B:128:0x0289, B:131:0x02ab, B:133:0x02b5, B:134:0x02ba, B:135:0x02c6, B:136:0x02c7, B:137:0x02d3, B:139:0x02d6, B:140:0x02e3, B:142:0x02e9, B:144:0x030f, B:146:0x0327, B:145:0x031e, B:147:0x032e, B:148:0x0334, B:150:0x033a, B:152:0x0342, B:163:0x036c, B:156:0x034a, B:157:0x0356, B:159:0x0358, B:160:0x0367, B:167:0x0379, B:178:0x0396, B:180:0x03a0, B:181:0x03a4, B:183:0x03aa, B:188:0x03ba, B:191:0x03c7, B:194:0x03d4, B:196:0x03de, B:208:0x041e, B:200:0x03ea, B:201:0x03f8, B:202:0x03f9, B:203:0x0407, B:205:0x0409, B:206:0x0417, B:60:0x0130, B:61:0x0134, B:63:0x013a, B:65:0x0150, B:67:0x015a, B:68:0x015f, B:70:0x0165, B:71:0x0173, B:73:0x0179, B:75:0x0185, B:79:0x0193, B:80:0x0199, B:82:0x019f, B:87:0x01b9, B:76:0x0189, B:78:0x018d, B:90:0x01ed, B:92:0x01f8, B:93:0x0204, B:210:0x042d, B:211:0x043a, B:212:0x043b, B:216:0x044c, B:218:0x0456, B:219:0x045a, B:221:0x0460, B:224:0x046d, B:229:0x047e, B:306:0x05cb, B:307:0x05d7, B:232:0x0489, B:233:0x0495, B:234:0x0496, B:236:0x049c, B:238:0x04a4, B:240:0x04aa, B:242:0x04b4, B:243:0x04b7, B:245:0x04bd, B:247:0x04cd, B:248:0x04d1, B:250:0x04d7, B:251:0x04df, B:252:0x04e2, B:253:0x04e5, B:254:0x04e9, B:256:0x04ef, B:257:0x04fd, B:259:0x0505, B:260:0x0508, B:262:0x050e, B:264:0x051a, B:265:0x051e, B:266:0x0521, B:267:0x0524, B:268:0x0530, B:270:0x0535, B:272:0x053f, B:273:0x0542, B:275:0x0548, B:277:0x0558, B:278:0x055c, B:280:0x0562, B:282:0x0572, B:283:0x0576, B:284:0x0579, B:285:0x057c, B:286:0x0582, B:288:0x0588, B:290:0x059a, B:293:0x05a4, B:294:0x05a6, B:296:0x05aa, B:297:0x05ad, B:299:0x05b3, B:301:0x05bf, B:302:0x05c3, B:309:0x05d9, B:310:0x05e5), top: B:326:0x006c, inners: #0, #1, #2, #3, #4, #5, #7, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:111:0x0243 A[Catch: CertPathReviewerException -> 0x05e6, LOOP:6: B:109:0x023d->B:111:0x0243, LOOP_END, TryCatch #6 {CertPathReviewerException -> 0x05e6, blocks: (B:17:0x006c, B:21:0x007c, B:23:0x0089, B:27:0x0099, B:28:0x00a4, B:30:0x00aa, B:32:0x00cb, B:33:0x00d3, B:35:0x00d9, B:37:0x00de, B:38:0x00ea, B:42:0x00f6, B:45:0x00fd, B:46:0x0106, B:48:0x010c, B:50:0x0116, B:53:0x011d, B:55:0x0121, B:94:0x0205, B:96:0x020b, B:97:0x020e, B:99:0x0214, B:101:0x0220, B:104:0x0228, B:105:0x022b, B:106:0x022e, B:108:0x0234, B:109:0x023d, B:111:0x0243, B:119:0x0266, B:120:0x0272, B:121:0x0273, B:123:0x0277, B:125:0x027f, B:126:0x0283, B:128:0x0289, B:131:0x02ab, B:133:0x02b5, B:134:0x02ba, B:135:0x02c6, B:136:0x02c7, B:137:0x02d3, B:139:0x02d6, B:140:0x02e3, B:142:0x02e9, B:144:0x030f, B:146:0x0327, B:145:0x031e, B:147:0x032e, B:148:0x0334, B:150:0x033a, B:152:0x0342, B:163:0x036c, B:156:0x034a, B:157:0x0356, B:159:0x0358, B:160:0x0367, B:167:0x0379, B:178:0x0396, B:180:0x03a0, B:181:0x03a4, B:183:0x03aa, B:188:0x03ba, B:191:0x03c7, B:194:0x03d4, B:196:0x03de, B:208:0x041e, B:200:0x03ea, B:201:0x03f8, B:202:0x03f9, B:203:0x0407, B:205:0x0409, B:206:0x0417, B:60:0x0130, B:61:0x0134, B:63:0x013a, B:65:0x0150, B:67:0x015a, B:68:0x015f, B:70:0x0165, B:71:0x0173, B:73:0x0179, B:75:0x0185, B:79:0x0193, B:80:0x0199, B:82:0x019f, B:87:0x01b9, B:76:0x0189, B:78:0x018d, B:90:0x01ed, B:92:0x01f8, B:93:0x0204, B:210:0x042d, B:211:0x043a, B:212:0x043b, B:216:0x044c, B:218:0x0456, B:219:0x045a, B:221:0x0460, B:224:0x046d, B:229:0x047e, B:306:0x05cb, B:307:0x05d7, B:232:0x0489, B:233:0x0495, B:234:0x0496, B:236:0x049c, B:238:0x04a4, B:240:0x04aa, B:242:0x04b4, B:243:0x04b7, B:245:0x04bd, B:247:0x04cd, B:248:0x04d1, B:250:0x04d7, B:251:0x04df, B:252:0x04e2, B:253:0x04e5, B:254:0x04e9, B:256:0x04ef, B:257:0x04fd, B:259:0x0505, B:260:0x0508, B:262:0x050e, B:264:0x051a, B:265:0x051e, B:266:0x0521, B:267:0x0524, B:268:0x0530, B:270:0x0535, B:272:0x053f, B:273:0x0542, B:275:0x0548, B:277:0x0558, B:278:0x055c, B:280:0x0562, B:282:0x0572, B:283:0x0576, B:284:0x0579, B:285:0x057c, B:286:0x0582, B:288:0x0588, B:290:0x059a, B:293:0x05a4, B:294:0x05a6, B:296:0x05aa, B:297:0x05ad, B:299:0x05b3, B:301:0x05bf, B:302:0x05c3, B:309:0x05d9, B:310:0x05e5), top: B:326:0x006c, inners: #0, #1, #2, #3, #4, #5, #7, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:351:0x0227 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:352:0x0228 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:353:0x0228 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:96:0x020b A[Catch: CertPathReviewerException -> 0x05e6, TryCatch #6 {CertPathReviewerException -> 0x05e6, blocks: (B:17:0x006c, B:21:0x007c, B:23:0x0089, B:27:0x0099, B:28:0x00a4, B:30:0x00aa, B:32:0x00cb, B:33:0x00d3, B:35:0x00d9, B:37:0x00de, B:38:0x00ea, B:42:0x00f6, B:45:0x00fd, B:46:0x0106, B:48:0x010c, B:50:0x0116, B:53:0x011d, B:55:0x0121, B:94:0x0205, B:96:0x020b, B:97:0x020e, B:99:0x0214, B:101:0x0220, B:104:0x0228, B:105:0x022b, B:106:0x022e, B:108:0x0234, B:109:0x023d, B:111:0x0243, B:119:0x0266, B:120:0x0272, B:121:0x0273, B:123:0x0277, B:125:0x027f, B:126:0x0283, B:128:0x0289, B:131:0x02ab, B:133:0x02b5, B:134:0x02ba, B:135:0x02c6, B:136:0x02c7, B:137:0x02d3, B:139:0x02d6, B:140:0x02e3, B:142:0x02e9, B:144:0x030f, B:146:0x0327, B:145:0x031e, B:147:0x032e, B:148:0x0334, B:150:0x033a, B:152:0x0342, B:163:0x036c, B:156:0x034a, B:157:0x0356, B:159:0x0358, B:160:0x0367, B:167:0x0379, B:178:0x0396, B:180:0x03a0, B:181:0x03a4, B:183:0x03aa, B:188:0x03ba, B:191:0x03c7, B:194:0x03d4, B:196:0x03de, B:208:0x041e, B:200:0x03ea, B:201:0x03f8, B:202:0x03f9, B:203:0x0407, B:205:0x0409, B:206:0x0417, B:60:0x0130, B:61:0x0134, B:63:0x013a, B:65:0x0150, B:67:0x015a, B:68:0x015f, B:70:0x0165, B:71:0x0173, B:73:0x0179, B:75:0x0185, B:79:0x0193, B:80:0x0199, B:82:0x019f, B:87:0x01b9, B:76:0x0189, B:78:0x018d, B:90:0x01ed, B:92:0x01f8, B:93:0x0204, B:210:0x042d, B:211:0x043a, B:212:0x043b, B:216:0x044c, B:218:0x0456, B:219:0x045a, B:221:0x0460, B:224:0x046d, B:229:0x047e, B:306:0x05cb, B:307:0x05d7, B:232:0x0489, B:233:0x0495, B:234:0x0496, B:236:0x049c, B:238:0x04a4, B:240:0x04aa, B:242:0x04b4, B:243:0x04b7, B:245:0x04bd, B:247:0x04cd, B:248:0x04d1, B:250:0x04d7, B:251:0x04df, B:252:0x04e2, B:253:0x04e5, B:254:0x04e9, B:256:0x04ef, B:257:0x04fd, B:259:0x0505, B:260:0x0508, B:262:0x050e, B:264:0x051a, B:265:0x051e, B:266:0x0521, B:267:0x0524, B:268:0x0530, B:270:0x0535, B:272:0x053f, B:273:0x0542, B:275:0x0548, B:277:0x0558, B:278:0x055c, B:280:0x0562, B:282:0x0572, B:283:0x0576, B:284:0x0579, B:285:0x057c, B:286:0x0582, B:288:0x0588, B:290:0x059a, B:293:0x05a4, B:294:0x05a6, B:296:0x05aa, B:297:0x05ad, B:299:0x05b3, B:301:0x05bf, B:302:0x05c3, B:309:0x05d9, B:310:0x05e5), top: B:326:0x006c, inners: #0, #1, #2, #3, #4, #5, #7, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x0214 A[Catch: CertPathReviewerException -> 0x05e6, TryCatch #6 {CertPathReviewerException -> 0x05e6, blocks: (B:17:0x006c, B:21:0x007c, B:23:0x0089, B:27:0x0099, B:28:0x00a4, B:30:0x00aa, B:32:0x00cb, B:33:0x00d3, B:35:0x00d9, B:37:0x00de, B:38:0x00ea, B:42:0x00f6, B:45:0x00fd, B:46:0x0106, B:48:0x010c, B:50:0x0116, B:53:0x011d, B:55:0x0121, B:94:0x0205, B:96:0x020b, B:97:0x020e, B:99:0x0214, B:101:0x0220, B:104:0x0228, B:105:0x022b, B:106:0x022e, B:108:0x0234, B:109:0x023d, B:111:0x0243, B:119:0x0266, B:120:0x0272, B:121:0x0273, B:123:0x0277, B:125:0x027f, B:126:0x0283, B:128:0x0289, B:131:0x02ab, B:133:0x02b5, B:134:0x02ba, B:135:0x02c6, B:136:0x02c7, B:137:0x02d3, B:139:0x02d6, B:140:0x02e3, B:142:0x02e9, B:144:0x030f, B:146:0x0327, B:145:0x031e, B:147:0x032e, B:148:0x0334, B:150:0x033a, B:152:0x0342, B:163:0x036c, B:156:0x034a, B:157:0x0356, B:159:0x0358, B:160:0x0367, B:167:0x0379, B:178:0x0396, B:180:0x03a0, B:181:0x03a4, B:183:0x03aa, B:188:0x03ba, B:191:0x03c7, B:194:0x03d4, B:196:0x03de, B:208:0x041e, B:200:0x03ea, B:201:0x03f8, B:202:0x03f9, B:203:0x0407, B:205:0x0409, B:206:0x0417, B:60:0x0130, B:61:0x0134, B:63:0x013a, B:65:0x0150, B:67:0x015a, B:68:0x015f, B:70:0x0165, B:71:0x0173, B:73:0x0179, B:75:0x0185, B:79:0x0193, B:80:0x0199, B:82:0x019f, B:87:0x01b9, B:76:0x0189, B:78:0x018d, B:90:0x01ed, B:92:0x01f8, B:93:0x0204, B:210:0x042d, B:211:0x043a, B:212:0x043b, B:216:0x044c, B:218:0x0456, B:219:0x045a, B:221:0x0460, B:224:0x046d, B:229:0x047e, B:306:0x05cb, B:307:0x05d7, B:232:0x0489, B:233:0x0495, B:234:0x0496, B:236:0x049c, B:238:0x04a4, B:240:0x04aa, B:242:0x04b4, B:243:0x04b7, B:245:0x04bd, B:247:0x04cd, B:248:0x04d1, B:250:0x04d7, B:251:0x04df, B:252:0x04e2, B:253:0x04e5, B:254:0x04e9, B:256:0x04ef, B:257:0x04fd, B:259:0x0505, B:260:0x0508, B:262:0x050e, B:264:0x051a, B:265:0x051e, B:266:0x0521, B:267:0x0524, B:268:0x0530, B:270:0x0535, B:272:0x053f, B:273:0x0542, B:275:0x0548, B:277:0x0558, B:278:0x055c, B:280:0x0562, B:282:0x0572, B:283:0x0576, B:284:0x0579, B:285:0x057c, B:286:0x0582, B:288:0x0588, B:290:0x059a, B:293:0x05a4, B:294:0x05a6, B:296:0x05aa, B:297:0x05ad, B:299:0x05b3, B:301:0x05bf, B:302:0x05c3, B:309:0x05d9, B:310:0x05e5), top: B:326:0x006c, inners: #0, #1, #2, #3, #4, #5, #7, #8, #9 }] */
    private void checkPolicy() {
        PKIXPolicyNode pKIXPolicyNodeRemovePolicyNode;
        String str;
        int i;
        int i2;
        HashSet hashSet;
        String str2;
        int i3;
        int iIntValueExact;
        int iIntValueExact2;
        String str3;
        String id;
        int i4;
        Set<String> criticalExtensionOIDs;
        boolean zContains;
        ArrayList arrayList;
        int i5;
        ArrayList arrayList2;
        int i6;
        PKIXPolicyNode pKIXPolicyNode;
        PKIXPolicyNode pKIXPolicyNodeRemovePolicyNode2;
        String str4 = "CertPathReviewer.policyExtError";
        Set<String> initialPolicies = this.pkixParams.getInitialPolicies();
        int i7 = this.n + 1;
        ArrayList[] arrayListArr = new ArrayList[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            arrayListArr[i8] = new ArrayList();
        }
        HashSet hashSet2 = new HashSet();
        hashSet2.add("2.5.29.32.0");
        PKIXPolicyNode pKIXPolicyNode2 = new PKIXPolicyNode(new ArrayList(), 0, hashSet2, null, new HashSet(), "2.5.29.32.0", false);
        arrayListArr[0].add(pKIXPolicyNode2);
        int i9 = this.pkixParams.isExplicitPolicyRequired() ? 0 : this.n + 1;
        int i10 = this.pkixParams.isAnyPolicyInhibited() ? 0 : this.n + 1;
        int i11 = this.pkixParams.isPolicyMappingInhibited() ? 0 : this.n + 1;
        try {
            int size = this.certs.size() - 1;
            X509Certificate x509Certificate = null;
            HashSet hashSet3 = null;
            while (size >= 0) {
                int i12 = this.n - size;
                X509Certificate x509Certificate2 = (X509Certificate) this.certs.get(size);
                int i13 = i7;
                try {
                    ASN1Sequence aSN1Sequence = (ASN1Sequence) CertPathValidatorUtilities.getExtensionValue(x509Certificate2, CertPathValidatorUtilities.CERTIFICATE_POLICIES);
                    if (aSN1Sequence == null || pKIXPolicyNode2 == null) {
                        str = str4;
                        i = i10;
                        i2 = i11;
                        pKIXPolicyNode2 = pKIXPolicyNode2;
                    } else {
                        Enumeration objects = aSN1Sequence.getObjects();
                        HashSet hashSet4 = new HashSet();
                        while (objects.hasMoreElements()) {
                            PolicyInformation policyInformation = PolicyInformation.getInstance(objects.nextElement());
                            PKIXPolicyNode pKIXPolicyNode3 = pKIXPolicyNode2;
                            ASN1ObjectIdentifier policyIdentifier = policyInformation.getPolicyIdentifier();
                            String str5 = str4;
                            hashSet4.add(policyIdentifier.getId());
                            if (!"2.5.29.32.0".equals(policyIdentifier.getId())) {
                                try {
                                    Set qualifierSet = CertPathValidatorUtilities.getQualifierSet(policyInformation.getPolicyQualifiers());
                                    if (!CertPathValidatorUtilities.processCertD1i(i12, arrayListArr, policyIdentifier, qualifierSet)) {
                                        CertPathValidatorUtilities.processCertD1ii(i12, arrayListArr, policyIdentifier, qualifierSet);
                                    }
                                } catch (CertPathValidatorException e) {
                                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.policyQualifierError"), e, this.certPath, size);
                                }
                            }
                            pKIXPolicyNode2 = pKIXPolicyNode3;
                            str4 = str5;
                        }
                        str = str4;
                        PKIXPolicyNode pKIXPolicyNode4 = pKIXPolicyNode2;
                        if (hashSet3 != null && !hashSet3.contains("2.5.29.32.0")) {
                            HashSet hashSet5 = new HashSet();
                            for (Object obj : hashSet3) {
                                if (hashSet4.contains(obj)) {
                                    hashSet5.add(obj);
                                }
                            }
                            hashSet4 = hashSet5;
                        }
                        if (i10 > 0 || (i12 < this.n && CertPathValidatorUtilities.isSelfIssued(x509Certificate2))) {
                            Enumeration objects2 = aSN1Sequence.getObjects();
                            while (true) {
                                if (!objects2.hasMoreElements()) {
                                    break;
                                }
                                PolicyInformation policyInformation2 = PolicyInformation.getInstance(objects2.nextElement());
                                if ("2.5.29.32.0".equals(policyInformation2.getPolicyIdentifier().getId())) {
                                    try {
                                        Set qualifierSet2 = CertPathValidatorUtilities.getQualifierSet(policyInformation2.getPolicyQualifiers());
                                        ArrayList arrayList3 = arrayListArr[i12 - 1];
                                        for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                                            PKIXPolicyNode pKIXPolicyNode5 = (PKIXPolicyNode) arrayList3.get(i14);
                                            for (Object obj2 : pKIXPolicyNode5.getExpectedPolicies()) {
                                                ArrayList arrayList4 = arrayList3;
                                                int i15 = i10;
                                                if (obj2 instanceof String) {
                                                    id = (String) obj2;
                                                } else {
                                                    if (obj2 instanceof ASN1ObjectIdentifier) {
                                                        id = ((ASN1ObjectIdentifier) obj2).getId();
                                                    }
                                                    arrayList3 = arrayList4;
                                                    i10 = i15;
                                                    i11 = i11;
                                                }
                                                Iterator children = pKIXPolicyNode5.getChildren();
                                                boolean z = false;
                                                while (children.hasNext()) {
                                                    Iterator it = children;
                                                    if (id.equals(((PKIXPolicyNode) children.next()).getValidPolicy())) {
                                                        z = true;
                                                    }
                                                    children = it;
                                                }
                                                if (!z) {
                                                    HashSet hashSet6 = new HashSet();
                                                    hashSet6.add(id);
                                                    PKIXPolicyNode pKIXPolicyNode6 = new PKIXPolicyNode(new ArrayList(), i12, hashSet6, pKIXPolicyNode5, qualifierSet2, id, false);
                                                    pKIXPolicyNode5.addChild(pKIXPolicyNode6);
                                                    arrayListArr[i12].add(pKIXPolicyNode6);
                                                }
                                                arrayList3 = arrayList4;
                                                i10 = i15;
                                                i11 = i11;
                                            }
                                        }
                                        break;
                                    } catch (CertPathValidatorException e2) {
                                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.policyQualifierError"), e2, this.certPath, size);
                                    }
                                }
                            }
                            i = i10;
                            i2 = i11;
                            pKIXPolicyNode2 = pKIXPolicyNode4;
                            for (i4 = i12 - 1; i4 >= 0; i4--) {
                                arrayList2 = arrayListArr[i4];
                                for (i6 = 0; i6 < arrayList2.size(); i6++) {
                                    pKIXPolicyNode = (PKIXPolicyNode) arrayList2.get(i6);
                                    if (!pKIXPolicyNode.hasChildren()) {
                                        pKIXPolicyNodeRemovePolicyNode2 = CertPathValidatorUtilities.removePolicyNode(pKIXPolicyNode2, arrayListArr, pKIXPolicyNode);
                                        pKIXPolicyNode2 = pKIXPolicyNodeRemovePolicyNode2;
                                        if (pKIXPolicyNodeRemovePolicyNode2 == null) {
                                            break;
                                        }
                                    }
                                }
                            }
                            criticalExtensionOIDs = x509Certificate2.getCriticalExtensionOIDs();
                            if (criticalExtensionOIDs != null) {
                                zContains = criticalExtensionOIDs.contains(CertPathValidatorUtilities.CERTIFICATE_POLICIES);
                                arrayList = arrayListArr[i12];
                                for (i5 = 0; i5 < arrayList.size(); i5++) {
                                    ((PKIXPolicyNode) arrayList.get(i5)).setCritical(zContains);
                                }
                            }
                            hashSet3 = hashSet4;
                        } else {
                            break;
                            i = i10;
                            i2 = i11;
                            pKIXPolicyNode2 = pKIXPolicyNode4;
                            while (i4 >= 0) {
                                arrayList2 = arrayListArr[i4];
                                while (i6 < arrayList2.size()) {
                                    pKIXPolicyNode = (PKIXPolicyNode) arrayList2.get(i6);
                                    if (!pKIXPolicyNode.hasChildren()) {
                                        pKIXPolicyNodeRemovePolicyNode2 = CertPathValidatorUtilities.removePolicyNode(pKIXPolicyNode2, arrayListArr, pKIXPolicyNode);
                                        pKIXPolicyNode2 = pKIXPolicyNodeRemovePolicyNode2;
                                        if (pKIXPolicyNodeRemovePolicyNode2 == null) {
                                            break;
                                            break;
                                        }
                                    }
                                }
                            }
                            criticalExtensionOIDs = x509Certificate2.getCriticalExtensionOIDs();
                            if (criticalExtensionOIDs != null) {
                                zContains = criticalExtensionOIDs.contains(CertPathValidatorUtilities.CERTIFICATE_POLICIES);
                                arrayList = arrayListArr[i12];
                                while (i5 < arrayList.size()) {
                                    ((PKIXPolicyNode) arrayList.get(i5)).setCritical(zContains);
                                }
                            }
                            hashSet3 = hashSet4;
                        }
                    }
                    if (aSN1Sequence == null) {
                        pKIXPolicyNode2 = null;
                    }
                    if (i9 <= 0 && pKIXPolicyNode2 == null) {
                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.noValidPolicyTree"));
                    }
                    if (i12 != this.n) {
                        try {
                            ASN1Primitive extensionValue = CertPathValidatorUtilities.getExtensionValue(x509Certificate2, CertPathValidatorUtilities.POLICY_MAPPINGS);
                            if (extensionValue != null) {
                                ASN1Sequence aSN1Sequence2 = (ASN1Sequence) extensionValue;
                                int i16 = 0;
                                while (i16 < aSN1Sequence2.size()) {
                                    ASN1Sequence aSN1Sequence3 = (ASN1Sequence) aSN1Sequence2.getObjectAt(i16);
                                    ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) aSN1Sequence3.getObjectAt(0);
                                    ASN1Sequence aSN1Sequence4 = aSN1Sequence2;
                                    ASN1ObjectIdentifier aSN1ObjectIdentifier2 = (ASN1ObjectIdentifier) aSN1Sequence3.getObjectAt(1);
                                    if ("2.5.29.32.0".equals(aSN1ObjectIdentifier.getId())) {
                                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.invalidPolicyMapping"), this.certPath, size);
                                    }
                                    if ("2.5.29.32.0".equals(aSN1ObjectIdentifier2.getId())) {
                                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.invalidPolicyMapping"), this.certPath, size);
                                    }
                                    i16++;
                                    aSN1Sequence2 = aSN1Sequence4;
                                }
                            }
                            if (extensionValue != null) {
                                ASN1Sequence aSN1Sequence5 = (ASN1Sequence) extensionValue;
                                HashMap map = new HashMap();
                                HashSet<String> hashSet7 = new HashSet();
                                int i17 = 0;
                                while (i17 < aSN1Sequence5.size()) {
                                    ASN1Sequence aSN1Sequence6 = (ASN1Sequence) aSN1Sequence5.getObjectAt(i17);
                                    ASN1Sequence aSN1Sequence7 = aSN1Sequence5;
                                    String id2 = ((ASN1ObjectIdentifier) aSN1Sequence6.getObjectAt(0)).getId();
                                    HashSet hashSet8 = hashSet3;
                                    String id3 = ((ASN1ObjectIdentifier) aSN1Sequence6.getObjectAt(1)).getId();
                                    if (map.containsKey(id2)) {
                                        ((Set) map.get(id2)).add(id3);
                                    } else {
                                        HashSet hashSet9 = new HashSet();
                                        hashSet9.add(id3);
                                        map.put(id2, hashSet9);
                                        hashSet7.add(id2);
                                    }
                                    i17++;
                                    aSN1Sequence5 = aSN1Sequence7;
                                    hashSet3 = hashSet8;
                                }
                                hashSet = hashSet3;
                                for (String str6 : hashSet7) {
                                    if (i2 > 0) {
                                        try {
                                            try {
                                                CertPathValidatorUtilities.prepareNextCertB1(i12, arrayListArr, str6, map, x509Certificate2);
                                                str3 = str;
                                            } catch (AnnotatedException e3) {
                                                throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, str), e3, this.certPath, size);
                                            }
                                        } catch (CertPathValidatorException e4) {
                                            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.policyQualifierError"), e4, this.certPath, size);
                                        }
                                    } else {
                                        str3 = str;
                                        if (i2 <= 0) {
                                            pKIXPolicyNode2 = CertPathValidatorUtilities.prepareNextCertB2(i12, arrayListArr, str6, pKIXPolicyNode2);
                                        }
                                    }
                                    str = str3;
                                }
                            } else {
                                hashSet = hashSet3;
                            }
                            str2 = str;
                            if (CertPathValidatorUtilities.isSelfIssued(x509Certificate2)) {
                                i3 = i;
                                i11 = i2;
                            } else {
                                if (i9 != 0) {
                                    i9--;
                                }
                                i11 = i2 != 0 ? i2 - 1 : i2;
                                i3 = i != 0 ? i - 1 : i;
                            }
                            try {
                                ASN1Sequence aSN1Sequence8 = (ASN1Sequence) CertPathValidatorUtilities.getExtensionValue(x509Certificate2, CertPathValidatorUtilities.POLICY_CONSTRAINTS);
                                if (aSN1Sequence8 != null) {
                                    Enumeration objects3 = aSN1Sequence8.getObjects();
                                    while (objects3.hasMoreElements()) {
                                        ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) objects3.nextElement();
                                        int tagNo = aSN1TaggedObject.getTagNo();
                                        if (tagNo == 0) {
                                            int iIntValueExact3 = ASN1Integer.getInstance(aSN1TaggedObject, false).intValueExact();
                                            if (iIntValueExact3 < i9) {
                                                i9 = iIntValueExact3;
                                            }
                                        } else if (tagNo == 1 && (iIntValueExact2 = ASN1Integer.getInstance(aSN1TaggedObject, false).intValueExact()) < i11) {
                                            i11 = iIntValueExact2;
                                        }
                                    }
                                }
                                try {
                                    ASN1Integer aSN1Integer = (ASN1Integer) CertPathValidatorUtilities.getExtensionValue(x509Certificate2, CertPathValidatorUtilities.INHIBIT_ANY_POLICY);
                                    i = (aSN1Integer == null || (iIntValueExact = aSN1Integer.intValueExact()) >= i3) ? i3 : iIntValueExact;
                                } catch (AnnotatedException unused) {
                                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.policyInhibitExtError"), this.certPath, size);
                                }
                            } catch (AnnotatedException unused2) {
                                throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.policyConstExtError"), this.certPath, size);
                            }
                        } catch (AnnotatedException e5) {
                            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.policyMapExtError"), e5, this.certPath, size);
                        }
                    } else {
                        hashSet = hashSet3;
                        str2 = str;
                        i11 = i2;
                    }
                    size--;
                    str4 = str2;
                    x509Certificate = x509Certificate2;
                    hashSet3 = hashSet;
                    i7 = i13;
                    initialPolicies = initialPolicies;
                    i10 = i;
                } catch (AnnotatedException e6) {
                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, str4), e6, this.certPath, size);
                }
            }
            Set<String> set = initialPolicies;
            int i18 = i7;
            PKIXPolicyNode pKIXPolicyNode7 = pKIXPolicyNode2;
            if (!CertPathValidatorUtilities.isSelfIssued(x509Certificate) && i9 > 0) {
                i9--;
            }
            try {
                ASN1Sequence aSN1Sequence9 = (ASN1Sequence) CertPathValidatorUtilities.getExtensionValue(x509Certificate, CertPathValidatorUtilities.POLICY_CONSTRAINTS);
                if (aSN1Sequence9 != null) {
                    Enumeration objects4 = aSN1Sequence9.getObjects();
                    while (objects4.hasMoreElements()) {
                        ASN1TaggedObject aSN1TaggedObject2 = (ASN1TaggedObject) objects4.nextElement();
                        if (aSN1TaggedObject2.getTagNo() == 0 && ASN1Integer.getInstance(aSN1TaggedObject2, false).intValueExact() == 0) {
                            i9 = 0;
                        }
                    }
                }
                if (pKIXPolicyNode7 == null) {
                    if (this.pkixParams.isExplicitPolicyRequired()) {
                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.explicitPolicy"), this.certPath, size);
                    }
                    pKIXPolicyNodeRemovePolicyNode = null;
                } else if (!CertPathValidatorUtilities.isAnyPolicy(set)) {
                    HashSet<PKIXPolicyNode> hashSet10 = new HashSet();
                    for (int i19 = 0; i19 < i18; i19++) {
                        ArrayList arrayList5 = arrayListArr[i19];
                        for (int i20 = 0; i20 < arrayList5.size(); i20++) {
                            PKIXPolicyNode pKIXPolicyNode8 = (PKIXPolicyNode) arrayList5.get(i20);
                            if ("2.5.29.32.0".equals(pKIXPolicyNode8.getValidPolicy())) {
                                Iterator children2 = pKIXPolicyNode8.getChildren();
                                while (children2.hasNext()) {
                                    PKIXPolicyNode pKIXPolicyNode9 = (PKIXPolicyNode) children2.next();
                                    if (!"2.5.29.32.0".equals(pKIXPolicyNode9.getValidPolicy())) {
                                        hashSet10.add(pKIXPolicyNode9);
                                    }
                                }
                            }
                        }
                    }
                    pKIXPolicyNodeRemovePolicyNode = pKIXPolicyNode7;
                    for (PKIXPolicyNode pKIXPolicyNode10 : hashSet10) {
                        Set<String> set2 = set;
                        if (!set2.contains(pKIXPolicyNode10.getValidPolicy())) {
                            pKIXPolicyNodeRemovePolicyNode = CertPathValidatorUtilities.removePolicyNode(pKIXPolicyNodeRemovePolicyNode, arrayListArr, pKIXPolicyNode10);
                        }
                        set = set2;
                    }
                    if (pKIXPolicyNodeRemovePolicyNode != null) {
                        int i21 = this.n;
                        while (true) {
                            i21--;
                            if (i21 < 0) {
                                break;
                            }
                            ArrayList arrayList6 = arrayListArr[i21];
                            for (int i22 = 0; i22 < arrayList6.size(); i22++) {
                                PKIXPolicyNode pKIXPolicyNode11 = (PKIXPolicyNode) arrayList6.get(i22);
                                if (!pKIXPolicyNode11.hasChildren()) {
                                    pKIXPolicyNodeRemovePolicyNode = CertPathValidatorUtilities.removePolicyNode(pKIXPolicyNodeRemovePolicyNode, arrayListArr, pKIXPolicyNode11);
                                }
                            }
                        }
                    }
                } else if (!this.pkixParams.isExplicitPolicyRequired()) {
                    pKIXPolicyNodeRemovePolicyNode = pKIXPolicyNode7;
                } else {
                    if (hashSet3.isEmpty()) {
                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.explicitPolicy"), this.certPath, size);
                    }
                    HashSet hashSet11 = new HashSet();
                    for (int i23 = 0; i23 < i18; i23++) {
                        ArrayList arrayList7 = arrayListArr[i23];
                        for (int i24 = 0; i24 < arrayList7.size(); i24++) {
                            PKIXPolicyNode pKIXPolicyNode12 = (PKIXPolicyNode) arrayList7.get(i24);
                            if ("2.5.29.32.0".equals(pKIXPolicyNode12.getValidPolicy())) {
                                Iterator children3 = pKIXPolicyNode12.getChildren();
                                while (children3.hasNext()) {
                                    hashSet11.add(children3.next());
                                }
                            }
                        }
                    }
                    Iterator it2 = hashSet11.iterator();
                    while (it2.hasNext()) {
                        hashSet3.contains(((PKIXPolicyNode) it2.next()).getValidPolicy());
                    }
                    pKIXPolicyNodeRemovePolicyNode = pKIXPolicyNode7;
                    for (int i25 = this.n - 1; i25 >= 0; i25--) {
                        ArrayList arrayList8 = arrayListArr[i25];
                        for (int i26 = 0; i26 < arrayList8.size(); i26++) {
                            PKIXPolicyNode pKIXPolicyNode13 = (PKIXPolicyNode) arrayList8.get(i26);
                            if (!pKIXPolicyNode13.hasChildren()) {
                                pKIXPolicyNodeRemovePolicyNode = CertPathValidatorUtilities.removePolicyNode(pKIXPolicyNodeRemovePolicyNode, arrayListArr, pKIXPolicyNode13);
                            }
                        }
                    }
                }
                if (i9 <= 0 && pKIXPolicyNodeRemovePolicyNode == null) {
                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.invalidPolicy"));
                }
            } catch (AnnotatedException unused3) {
                throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.policyConstExtError"), this.certPath, size);
            }
        } catch (CertPathReviewerException e7) {
            addError(e7.getErrorMessage(), e7.getIndex());
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x02d2 A[LOOP:1: B:101:0x02cc->B:103:0x02d2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:107:0x02f5 A[LOOP:2: B:105:0x02ef->B:107:0x02f5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:117:0x0341  */
    /* JADX WARN: Code duplicated, block: B:125:0x0378  */
    /* JADX WARN: Code duplicated, block: B:133:0x039b A[Catch: AnnotatedException -> 0x03b5, TryCatch #17 {AnnotatedException -> 0x03b5, blocks: (B:131:0x038f, B:133:0x039b, B:135:0x03a1, B:136:0x03aa), top: B:179:0x038f }] */
    /* JADX WARN: Code duplicated, block: B:135:0x03a1 A[Catch: AnnotatedException -> 0x03b5, TryCatch #17 {AnnotatedException -> 0x03b5, blocks: (B:131:0x038f, B:133:0x039b, B:135:0x03a1, B:136:0x03aa), top: B:179:0x038f }] */
    /* JADX WARN: Code duplicated, block: B:136:0x03aa A[Catch: AnnotatedException -> 0x03b5, TRY_LEAVE, TryCatch #17 {AnnotatedException -> 0x03b5, blocks: (B:131:0x038f, B:133:0x039b, B:135:0x03a1, B:136:0x03aa), top: B:179:0x038f }] */
    /* JADX WARN: Code duplicated, block: B:146:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:164:0x0188 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x0290 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:0x01b7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:34:0x00fe A[Catch: IllegalArgumentException -> 0x010d, TRY_ENTER, TryCatch #15 {IllegalArgumentException -> 0x010d, blocks: (B:34:0x00fe, B:35:0x0103), top: B:177:0x00fc }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0103 A[Catch: IllegalArgumentException -> 0x010d, TRY_LEAVE, TryCatch #15 {IllegalArgumentException -> 0x010d, blocks: (B:34:0x00fe, B:35:0x0103), top: B:177:0x00fc }] */
    /* JADX WARN: Code duplicated, block: B:46:0x013f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0142  */
    /* JADX WARN: Code duplicated, block: B:50:0x0148  */
    /* JADX WARN: Code duplicated, block: B:51:0x014d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0167  */
    /* JADX WARN: Code duplicated, block: B:58:0x0176  */
    /* JADX WARN: Code duplicated, block: B:65:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:73:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:79:0x0220  */
    /* JADX WARN: Code duplicated, block: B:90:0x0298 A[Catch: AnnotatedException -> 0x029d, TRY_LEAVE, TryCatch #12 {AnnotatedException -> 0x029d, blocks: (B:88:0x0290, B:90:0x0298), top: B:172:0x0290 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:96:0x02b0 A[Catch: AnnotatedException -> 0x02b5, TRY_LEAVE, TryCatch #18 {AnnotatedException -> 0x02b5, blocks: (B:94:0x02a8, B:96:0x02b0), top: B:181:0x02a8 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x02bf  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v5 */
    private void checkSignatures() {
        TrustAnchor trustAnchor;
        TrustAnchor trustAnchor2;
        X500Principal x500Principal;
        X509Certificate trustedCert;
        PublicKey cAPublicKey;
        X509Certificate x509Certificate;
        PublicKey nextWorkingKey;
        X500Principal subjectX500Principal;
        int size;
        int i;
        X509Certificate x509Certificate2;
        ErrorBundle errorBundle;
        boolean z;
        ?? r11;
        ErrorBundle errorBundle2;
        CRLDistPoint cRLDistPoint;
        AuthorityInformationAccess authorityInformationAccess;
        Iterator it;
        Iterator it2;
        X509Certificate x509Certificate3;
        int i2;
        PublicKey publicKey;
        int i3;
        int i4;
        int i5;
        int i6;
        ASN1Primitive extensionValue;
        ASN1Primitive extensionValue2;
        X509Certificate x509Certificate4;
        boolean[] keyUsage;
        BasicConstraints basicConstraints;
        ErrorBundle errorBundle3;
        byte[] extensionValue3;
        AuthorityKeyIdentifier authorityKeyIdentifier;
        GeneralNames authorityCertIssuer;
        GeneralName generalName;
        BigInteger authorityCertSerialNumber;
        X509Certificate trustedCert2;
        boolean[] keyUsage2;
        char c = 2;
        char c2 = 1;
        addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.certPathValidDate", new Object[]{new TrustedInput(this.validDate), new TrustedInput(this.currentDate)}));
        try {
            List list = this.certs;
            X509Certificate x509Certificate5 = (X509Certificate) list.get(list.size() - 1);
            Collection trustAnchors = getTrustAnchors(x509Certificate5, this.pkixParams.getTrustAnchors());
            if (trustAnchors.size() > 1) {
                addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.conflictingTrustAnchors", new Object[]{Integers.valueOf(trustAnchors.size()), new UntrustedInput(x509Certificate5.getIssuerX500Principal())}));
            } else {
                if (!trustAnchors.isEmpty()) {
                    trustAnchor = (TrustAnchor) trustAnchors.iterator().next();
                    try {
                        try {
                            try {
                                CertPathValidatorUtilities.verifyX509Certificate(x509Certificate5, trustAnchor.getTrustedCert() != null ? trustAnchor.getTrustedCert().getPublicKey() : trustAnchor.getCAPublicKey(), this.pkixParams.getSigProvider());
                            } catch (SignatureException unused) {
                                addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.trustButInvalidCert"));
                            } catch (Exception unused2) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.unknown", new Object[]{new UntrustedInput(th.getMessage()), new UntrustedInput(th)}));
                        }
                    } catch (CertPathReviewerException e) {
                        e = e;
                        addError(e.getErrorMessage());
                    }
                    trustAnchor2 = trustAnchor;
                    if (trustAnchor2 != null) {
                        trustedCert2 = trustAnchor2.getTrustedCert();
                        try {
                            if (trustedCert2 != null) {
                                x500Principal = CertPathValidatorUtilities.getSubjectPrincipal(trustedCert2);
                            } else {
                                x500Principal = new X500Principal(trustAnchor2.getCAName());
                            }
                        } catch (IllegalArgumentException unused3) {
                            addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.trustDNInvalid", new Object[]{new UntrustedInput(trustAnchor2.getCAName())}));
                            x500Principal = null;
                        }
                        if (trustedCert2 != null && (keyUsage2 = trustedCert2.getKeyUsage()) != null && (keyUsage2.length <= 5 || !keyUsage2[5])) {
                            addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.trustKeyUsage"));
                        }
                    } else {
                        x500Principal = null;
                    }
                    if (trustAnchor2 != null) {
                        trustedCert = trustAnchor2.getTrustedCert();
                        if (trustedCert != null) {
                            cAPublicKey = trustedCert.getPublicKey();
                        } else {
                            cAPublicKey = trustAnchor2.getCAPublicKey();
                        }
                        try {
                            AlgorithmIdentifier algorithmIdentifier = CertPathValidatorUtilities.getAlgorithmIdentifier(cAPublicKey);
                            algorithmIdentifier.getAlgorithm();
                            algorithmIdentifier.getParameters();
                        } catch (CertPathValidatorException unused4) {
                            addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.trustPubKeyError"));
                        }
                    } else {
                        trustedCert = null;
                        cAPublicKey = null;
                    }
                    x509Certificate = trustedCert;
                    nextWorkingKey = cAPublicKey;
                    subjectX500Principal = x500Principal;
                    size = this.certs.size() - 1;
                    while (size >= 0) {
                        i = this.n - size;
                        x509Certificate2 = (X509Certificate) this.certs.get(size);
                        if (nextWorkingKey != null) {
                            try {
                                CertPathValidatorUtilities.verifyX509Certificate(x509Certificate2, nextWorkingKey, this.pkixParams.getSigProvider());
                                z = false;
                            } catch (GeneralSecurityException e2) {
                                String message = e2.getMessage();
                                String name = e2.getClass().getName();
                                Object[] objArr = new Object[3];
                                objArr[0] = message;
                                objArr[c2] = e2;
                                objArr[c] = name;
                                errorBundle = new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.signatureNotVerified", objArr);
                                z = false;
                                addError(errorBundle, size);
                            }
                            r11 = z;
                        } else if (CertPathValidatorUtilities.isSelfIssued(x509Certificate2)) {
                            try {
                                CertPathValidatorUtilities.verifyX509Certificate(x509Certificate2, x509Certificate2.getPublicKey(), this.pkixParams.getSigProvider());
                                addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.rootKeyIsValidButNotATrustAnchor"), size);
                                z = false;
                            } catch (GeneralSecurityException e3) {
                                String message2 = e3.getMessage();
                                String name2 = e3.getClass().getName();
                                Object[] objArr2 = new Object[3];
                                objArr2[0] = message2;
                                objArr2[c2] = e3;
                                objArr2[c] = name2;
                                errorBundle = new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.signatureNotVerified", objArr2);
                                z = false;
                                addError(errorBundle, size);
                            }
                            r11 = z;
                        } else {
                            errorBundle3 = new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.NoIssuerPublicKey");
                            extensionValue3 = x509Certificate2.getExtensionValue(Extension.authorityKeyIdentifier.getId());
                            if (extensionValue3 != null && (authorityCertIssuer = (authorityKeyIdentifier = AuthorityKeyIdentifier.getInstance(ASN1OctetString.getInstance(extensionValue3).getOctets())).getAuthorityCertIssuer()) != null) {
                                generalName = authorityCertIssuer.getNames()[0];
                                authorityCertSerialNumber = authorityKeyIdentifier.getAuthorityCertSerialNumber();
                                if (authorityCertSerialNumber != null) {
                                    errorBundle3.setExtraArguments(new Object[]{new LocaleString(RESOURCE_NAME, "missingIssuer"), " \"", generalName, "\" ", new LocaleString(RESOURCE_NAME, "missingSerial"), " ", authorityCertSerialNumber});
                                }
                            }
                            addError(errorBundle3, size);
                            r11 = 0;
                        }
                        try {
                            x509Certificate2.checkValidity(this.validDate);
                        } catch (CertificateExpiredException unused5) {
                            Object[] objArr3 = new Object[1];
                            objArr3[r11] = new TrustedInput(x509Certificate2.getNotAfter());
                            errorBundle2 = new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.certificateExpired", objArr3);
                            addError(errorBundle2, size);
                        } catch (CertificateNotYetValidException unused6) {
                            Object[] objArr4 = new Object[1];
                            objArr4[r11] = new TrustedInput(x509Certificate2.getNotBefore());
                            errorBundle2 = new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.certificateNotYetValid", objArr4);
                            addError(errorBundle2, size);
                        }
                        if (this.pkixParams.isRevocationEnabled()) {
                            try {
                                extensionValue2 = CertPathValidatorUtilities.getExtensionValue(x509Certificate2, CRL_DIST_POINTS);
                                if (extensionValue2 != null) {
                                    cRLDistPoint = CRLDistPoint.getInstance(extensionValue2);
                                } else {
                                    cRLDistPoint = null;
                                }
                            } catch (AnnotatedException unused7) {
                                addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlDistPtExtError"), size);
                            }
                            try {
                                extensionValue = CertPathValidatorUtilities.getExtensionValue(x509Certificate2, AUTH_INFO_ACCESS);
                                if (extensionValue != null) {
                                    authorityInformationAccess = AuthorityInformationAccess.getInstance(extensionValue);
                                } else {
                                    authorityInformationAccess = null;
                                }
                            } catch (AnnotatedException unused8) {
                                addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlAuthInfoAccError"), size);
                            }
                            Vector cRLDistUrls = getCRLDistUrls(cRLDistPoint);
                            Vector oCSPUrls = getOCSPUrls(authorityInformationAccess);
                            it = cRLDistUrls.iterator();
                            while (it.hasNext()) {
                                Object[] objArr5 = new Object[1];
                                objArr5[r11] = new UntrustedUrlInput(it.next());
                                addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlDistPoint", objArr5), size);
                            }
                            it2 = oCSPUrls.iterator();
                            while (it2.hasNext()) {
                                Object[] objArr6 = new Object[1];
                                objArr6[r11] = new UntrustedUrlInput(it2.next());
                                addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.ocspLocation", objArr6), size);
                            }
                            try {
                                i4 = 5;
                                PublicKey publicKey2 = nextWorkingKey;
                                x509Certificate3 = x509Certificate2;
                                publicKey = nextWorkingKey;
                                i3 = i;
                                i2 = size;
                                try {
                                    checkRevocation(this.pkixParams, x509Certificate2, this.validDate, x509Certificate, publicKey2, cRLDistUrls, oCSPUrls, size);
                                    i5 = i2;
                                } catch (CertPathReviewerException e4) {
                                    e = e4;
                                    i5 = i2;
                                    addError(e.getErrorMessage(), i5);
                                    i6 = i4;
                                }
                            } catch (CertPathReviewerException e5) {
                                e = e5;
                                x509Certificate3 = x509Certificate2;
                                i2 = size;
                                publicKey = nextWorkingKey;
                                i3 = i;
                                i4 = 5;
                            }
                        } else {
                            x509Certificate3 = x509Certificate2;
                            i5 = size;
                            publicKey = nextWorkingKey;
                            i3 = i;
                        }
                        i6 = 5;
                        if (subjectX500Principal != null && !x509Certificate3.getIssuerX500Principal().equals(subjectX500Principal)) {
                            String name3 = subjectX500Principal.getName();
                            String name4 = x509Certificate3.getIssuerX500Principal().getName();
                            Object[] objArr7 = new Object[2];
                            objArr7[r11] = name3;
                            objArr7[1] = name4;
                            addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.certWrongIssuer", objArr7), i5);
                        }
                        if (i3 != this.n) {
                            x509Certificate4 = x509Certificate3;
                            if (x509Certificate4 != null && x509Certificate4.getVersion() == 1) {
                                addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.noCACert"), i5);
                            }
                            try {
                                basicConstraints = BasicConstraints.getInstance(CertPathValidatorUtilities.getExtensionValue(x509Certificate4, CertPathValidatorUtilities.BASIC_CONSTRAINTS));
                                if (basicConstraints != null) {
                                    addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.noBasicConstraints"), i5);
                                } else if (!basicConstraints.isCA()) {
                                    addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.noCACert"), i5);
                                }
                            } catch (AnnotatedException unused9) {
                                addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.errorProcesingBC"), i5);
                            }
                            keyUsage = x509Certificate4.getKeyUsage();
                            if (keyUsage != null && (keyUsage.length <= i6 || !keyUsage[i6])) {
                                addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.noCertSign"), i5);
                            }
                        } else {
                            x509Certificate4 = x509Certificate3;
                        }
                        subjectX500Principal = x509Certificate4.getSubjectX500Principal();
                        try {
                            nextWorkingKey = CertPathValidatorUtilities.getNextWorkingKey(this.certs, i5);
                            try {
                                AlgorithmIdentifier algorithmIdentifier2 = CertPathValidatorUtilities.getAlgorithmIdentifier(nextWorkingKey);
                                algorithmIdentifier2.getAlgorithm();
                                algorithmIdentifier2.getParameters();
                            } catch (CertPathValidatorException unused10) {
                                addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.pubKeyError"), i5);
                            }
                        } catch (CertPathValidatorException unused11) {
                            nextWorkingKey = publicKey;
                        }
                        size = i5 - 1;
                        c = 2;
                        x509Certificate = x509Certificate4;
                        c2 = 1;
                    }
                    this.trustAnchor = trustAnchor2;
                    this.subjectPublicKey = nextWorkingKey;
                }
                addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.noTrustAnchorFound", new Object[]{new UntrustedInput(x509Certificate5.getIssuerX500Principal()), Integers.valueOf(this.pkixParams.getTrustAnchors().size())}));
            }
            trustAnchor2 = null;
        } catch (CertPathReviewerException e6) {
            e = e6;
            trustAnchor = null;
        } catch (Throwable th2) {
            th = th2;
            trustAnchor = null;
        }
        if (trustAnchor2 != null) {
            trustedCert2 = trustAnchor2.getTrustedCert();
            if (trustedCert2 != null) {
                x500Principal = CertPathValidatorUtilities.getSubjectPrincipal(trustedCert2);
            } else {
                x500Principal = new X500Principal(trustAnchor2.getCAName());
            }
            if (trustedCert2 != null) {
                addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.trustKeyUsage"));
            }
        } else {
            x500Principal = null;
        }
        if (trustAnchor2 != null) {
            trustedCert = trustAnchor2.getTrustedCert();
            if (trustedCert != null) {
                cAPublicKey = trustedCert.getPublicKey();
            } else {
                cAPublicKey = trustAnchor2.getCAPublicKey();
            }
            AlgorithmIdentifier algorithmIdentifier3 = CertPathValidatorUtilities.getAlgorithmIdentifier(cAPublicKey);
            algorithmIdentifier3.getAlgorithm();
            algorithmIdentifier3.getParameters();
        } else {
            trustedCert = null;
            cAPublicKey = null;
        }
        x509Certificate = trustedCert;
        nextWorkingKey = cAPublicKey;
        subjectX500Principal = x500Principal;
        size = this.certs.size() - 1;
        while (size >= 0) {
            i = this.n - size;
            x509Certificate2 = (X509Certificate) this.certs.get(size);
            if (nextWorkingKey != null) {
                CertPathValidatorUtilities.verifyX509Certificate(x509Certificate2, nextWorkingKey, this.pkixParams.getSigProvider());
                z = false;
                r11 = z;
            } else if (CertPathValidatorUtilities.isSelfIssued(x509Certificate2)) {
                CertPathValidatorUtilities.verifyX509Certificate(x509Certificate2, x509Certificate2.getPublicKey(), this.pkixParams.getSigProvider());
                addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.rootKeyIsValidButNotATrustAnchor"), size);
                z = false;
                r11 = z;
            } else {
                errorBundle3 = new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.NoIssuerPublicKey");
                extensionValue3 = x509Certificate2.getExtensionValue(Extension.authorityKeyIdentifier.getId());
                if (extensionValue3 != null) {
                    generalName = authorityCertIssuer.getNames()[0];
                    authorityCertSerialNumber = authorityKeyIdentifier.getAuthorityCertSerialNumber();
                    if (authorityCertSerialNumber != null) {
                        errorBundle3.setExtraArguments(new Object[]{new LocaleString(RESOURCE_NAME, "missingIssuer"), " \"", generalName, "\" ", new LocaleString(RESOURCE_NAME, "missingSerial"), " ", authorityCertSerialNumber});
                    }
                }
                addError(errorBundle3, size);
                r11 = 0;
            }
            x509Certificate2.checkValidity(this.validDate);
            if (this.pkixParams.isRevocationEnabled()) {
                extensionValue2 = CertPathValidatorUtilities.getExtensionValue(x509Certificate2, CRL_DIST_POINTS);
                if (extensionValue2 != null) {
                    cRLDistPoint = CRLDistPoint.getInstance(extensionValue2);
                } else {
                    cRLDistPoint = null;
                }
                extensionValue = CertPathValidatorUtilities.getExtensionValue(x509Certificate2, AUTH_INFO_ACCESS);
                if (extensionValue != null) {
                    authorityInformationAccess = AuthorityInformationAccess.getInstance(extensionValue);
                } else {
                    authorityInformationAccess = null;
                }
                Vector cRLDistUrls2 = getCRLDistUrls(cRLDistPoint);
                Vector oCSPUrls2 = getOCSPUrls(authorityInformationAccess);
                it = cRLDistUrls2.iterator();
                while (it.hasNext()) {
                    Object[] objArr8 = new Object[1];
                    objArr8[r11] = new UntrustedUrlInput(it.next());
                    addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlDistPoint", objArr8), size);
                }
                it2 = oCSPUrls2.iterator();
                while (it2.hasNext()) {
                    Object[] objArr9 = new Object[1];
                    objArr9[r11] = new UntrustedUrlInput(it2.next());
                    addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.ocspLocation", objArr9), size);
                }
                i4 = 5;
                PublicKey publicKey3 = nextWorkingKey;
                x509Certificate3 = x509Certificate2;
                publicKey = nextWorkingKey;
                i3 = i;
                i2 = size;
                checkRevocation(this.pkixParams, x509Certificate2, this.validDate, x509Certificate, publicKey3, cRLDistUrls2, oCSPUrls2, size);
                i5 = i2;
            } else {
                x509Certificate3 = x509Certificate2;
                i5 = size;
                publicKey = nextWorkingKey;
                i3 = i;
            }
            i6 = 5;
            if (subjectX500Principal != null) {
                String name5 = subjectX500Principal.getName();
                String name6 = x509Certificate3.getIssuerX500Principal().getName();
                Object[] objArr10 = new Object[2];
                objArr10[r11] = name5;
                objArr10[1] = name6;
                addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.certWrongIssuer", objArr10), i5);
            }
            if (i3 != this.n) {
                x509Certificate4 = x509Certificate3;
                if (x509Certificate4 != null) {
                    addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.noCACert"), i5);
                }
                basicConstraints = BasicConstraints.getInstance(CertPathValidatorUtilities.getExtensionValue(x509Certificate4, CertPathValidatorUtilities.BASIC_CONSTRAINTS));
                if (basicConstraints != null) {
                    addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.noBasicConstraints"), i5);
                } else if (!basicConstraints.isCA()) {
                    addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.noCACert"), i5);
                }
                keyUsage = x509Certificate4.getKeyUsage();
                if (keyUsage != null) {
                    addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.noCertSign"), i5);
                }
            } else {
                x509Certificate4 = x509Certificate3;
            }
            subjectX500Principal = x509Certificate4.getSubjectX500Principal();
            nextWorkingKey = CertPathValidatorUtilities.getNextWorkingKey(this.certs, i5);
            AlgorithmIdentifier algorithmIdentifier4 = CertPathValidatorUtilities.getAlgorithmIdentifier(nextWorkingKey);
            algorithmIdentifier4.getAlgorithm();
            algorithmIdentifier4.getParameters();
            size = i5 - 1;
            c = 2;
            x509Certificate = x509Certificate4;
            c2 = 1;
        }
        this.trustAnchor = trustAnchor2;
        this.subjectPublicKey = nextWorkingKey;
    }

    private X509CRL getCRL(String str) throws CertPathReviewerException {
        try {
            URL url = new URL(str);
            if (!url.getProtocol().equals(a.s) && !url.getProtocol().equals(b.a)) {
                return null;
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode() == 200) {
                return (X509CRL) CertificateFactory.getInstance("X.509", BouncyCastleProvider.PROVIDER_NAME).generateCRL(httpURLConnection.getInputStream());
            }
            throw new Exception(httpURLConnection.getResponseMessage());
        } catch (Exception e) {
            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.loadCrlDistPointError", new Object[]{new UntrustedInput(str), e.getMessage(), e, e.getClass().getName()}));
        }
    }

    private boolean processQcStatements(X509Certificate x509Certificate, int i) {
        boolean z;
        ErrorBundle errorBundle;
        try {
            ASN1Sequence aSN1Sequence = (ASN1Sequence) CertPathValidatorUtilities.getExtensionValue(x509Certificate, QC_STATEMENT);
            boolean z2 = false;
            for (int i2 = 0; i2 < aSN1Sequence.size(); i2++) {
                QCStatement qCStatement = QCStatement.getInstance(aSN1Sequence.getObjectAt(i2));
                if (ETSIQCObjectIdentifiers.id_etsi_qcs_QcCompliance.equals((ASN1Primitive) qCStatement.getStatementId())) {
                    errorBundle = new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.QcEuCompliance");
                } else {
                    if (!RFC3739QCObjectIdentifiers.id_qcs_pkixQCSyntax_v1.equals((ASN1Primitive) qCStatement.getStatementId())) {
                        if (ETSIQCObjectIdentifiers.id_etsi_qcs_QcSSCD.equals((ASN1Primitive) qCStatement.getStatementId())) {
                            errorBundle = new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.QcSSCD");
                        } else if (ETSIQCObjectIdentifiers.id_etsi_qcs_LimiteValue.equals((ASN1Primitive) qCStatement.getStatementId())) {
                            MonetaryValue monetaryValue = MonetaryValue.getInstance(qCStatement.getStatementInfo());
                            monetaryValue.getCurrency();
                            z = false;
                            try {
                                double dDoubleValue = monetaryValue.getAmount().doubleValue() * Math.pow(10.0d, monetaryValue.getExponent().doubleValue());
                                addNotification(monetaryValue.getCurrency().isAlphabetic() ? new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.QcLimitValueAlpha", new Object[]{monetaryValue.getCurrency().getAlphabetic(), new TrustedInput(new Double(dDoubleValue)), monetaryValue}) : new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.QcLimitValueNum", new Object[]{Integers.valueOf(monetaryValue.getCurrency().getNumeric()), new TrustedInput(new Double(dDoubleValue)), monetaryValue}), i);
                            } catch (AnnotatedException unused) {
                                addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.QcStatementExtError"), i);
                                return z;
                            }
                        } else {
                            addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.QcUnknownStatement", new Object[]{qCStatement.getStatementId(), new UntrustedInput(qCStatement)}), i);
                            z2 = true;
                        }
                    }
                }
                addNotification(errorBundle, i);
            }
            return !z2;
        } catch (AnnotatedException unused2) {
            z = false;
        }
    }

    public void addError(ErrorBundle errorBundle) {
        this.errors[0].add(errorBundle);
    }

    public void addError(ErrorBundle errorBundle, int i) {
        if (i < -1 || i >= this.n) {
            throw new IndexOutOfBoundsException();
        }
        this.errors[i + 1].add(errorBundle);
    }

    public void addNotification(ErrorBundle errorBundle) {
        this.notifications[0].add(errorBundle);
    }

    public void addNotification(ErrorBundle errorBundle, int i) {
        if (i < -1 || i >= this.n) {
            throw new IndexOutOfBoundsException();
        }
        this.notifications[i + 1].add(errorBundle);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0244  */
    /* JADX WARN: Code duplicated, block: B:108:0x025a  */
    /* JADX WARN: Code duplicated, block: B:112:0x0271  */
    /* JADX WARN: Code duplicated, block: B:114:0x0274  */
    /* JADX WARN: Code duplicated, block: B:117:0x0288  */
    /* JADX WARN: Code duplicated, block: B:118:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:120:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:123:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:129:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:136:0x0338  */
    /* JADX WARN: Code duplicated, block: B:156:0x038e  */
    /* JADX WARN: Code duplicated, block: B:160:0x03a4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:168:0x03c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:177:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:189:0x041e  */
    /* JADX WARN: Code duplicated, block: B:192:0x042d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:193:0x042e  */
    /* JADX WARN: Code duplicated, block: B:200:0x0235 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x024a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:238:0x014a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:241:0x0135 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:242:0x0129 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:0x0206 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:248:0x0357 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:42:0x0115  */
    /* JADX WARN: Code duplicated, block: B:49:0x013b  */
    /* JADX WARN: Code duplicated, block: B:54:0x0156  */
    /* JADX WARN: Code duplicated, block: B:57:0x0162 A[Catch: CertPathReviewerException -> 0x01e0, TRY_LEAVE, TryCatch #8 {CertPathReviewerException -> 0x01e0, blocks: (B:55:0x0158, B:57:0x0162), top: B:214:0x0158 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0196 A[Catch: CertPathReviewerException -> 0x01de, TryCatch #2 {CertPathReviewerException -> 0x01de, blocks: (B:61:0x0175, B:64:0x0196, B:66:0x01bd, B:69:0x01c4), top: B:202:0x0175 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x01bd A[Catch: CertPathReviewerException -> 0x01de, TryCatch #2 {CertPathReviewerException -> 0x01de, blocks: (B:61:0x0175, B:64:0x0196, B:66:0x01bd, B:69:0x01c4), top: B:202:0x0175 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:88:0x020f  */
    /* JADX WARN: Code duplicated, block: B:90:0x0215  */
    /* JADX WARN: Code duplicated, block: B:91:0x0217  */
    public void checkCRLs(PKIXParameters pKIXParameters, X509Certificate x509Certificate, Date date, X509Certificate x509Certificate2, PublicKey publicKey, Vector vector, int i) throws CertPathReviewerException {
        char c;
        char c2;
        char c3;
        X509CRL x509crl;
        X509CRL x509crl2;
        boolean z;
        X509CRL crl;
        X509CRLEntry revokedCertificate;
        Date nextUpdate;
        ASN1Primitive extensionValue;
        ASN1Primitive extensionValue2;
        IssuingDistributionPoint issuingDistributionPoint;
        Iterator it;
        ASN1Enumerated aSN1Enumerated;
        String str;
        LocaleString localeString;
        boolean[] keyUsage;
        X500Principal issuerX500Principal;
        Iterator it2;
        boolean z2;
        Iterator it3;
        boolean z3;
        String str2;
        X500Principal issuerX500Principal2;
        Date nextUpdate2;
        Object[] objArr;
        Date nextUpdate3;
        Object[] objArr2;
        char c4;
        String str3 = "CertPathReviewer.crlIssuerException";
        X509CRLStoreSelector x509CRLStoreSelector = new X509CRLStoreSelector();
        try {
            x509CRLStoreSelector.addIssuerName(CertPathValidatorUtilities.getEncodedIssuerPrincipal(x509Certificate).getEncoded());
            x509CRLStoreSelector.setCertificateChecking(x509Certificate);
            try {
                Set setFindCRLs = PKIXCRLUtil.findCRLs(x509CRLStoreSelector, pKIXParameters);
                Iterator it4 = setFindCRLs.iterator();
                if (setFindCRLs.isEmpty()) {
                    Iterator it5 = PKIXCRLUtil.findCRLs(new X509CRLStoreSelector(), pKIXParameters).iterator();
                    try {
                        ArrayList arrayList = new ArrayList();
                        while (it5.hasNext()) {
                            try {
                                c3 = 1;
                                try {
                                    arrayList.add(((X509CRL) it5.next()).getIssuerX500Principal());
                                } catch (AnnotatedException e) {
                                    e = e;
                                    c4 = c3;
                                    c2 = 2;
                                    c3 = c4;
                                    c = 0;
                                    String message = e.getCause().getMessage();
                                    Throwable cause = e.getCause();
                                    String name = e.getCause().getClass().getName();
                                    Object[] objArr3 = new Object[3];
                                    objArr3[c] = message;
                                    objArr3[c3] = cause;
                                    objArr3[c2] = name;
                                    addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlExtractionError", objArr3), i);
                                    it4 = new ArrayList().iterator();
                                    x509crl = null;
                                    while (true) {
                                        if (it4.hasNext()) {
                                            x509crl2 = x509crl;
                                            z = false;
                                            break;
                                        }
                                        X509CRL x509crl3 = (X509CRL) it4.next();
                                        Date thisUpdate = x509crl3.getThisUpdate();
                                        nextUpdate3 = x509crl3.getNextUpdate();
                                        TrustedInput trustedInput = new TrustedInput(thisUpdate);
                                        TrustedInput trustedInput2 = new TrustedInput(nextUpdate3);
                                        x509crl2 = x509crl3;
                                        objArr2 = new Object[2];
                                        objArr2[c] = trustedInput;
                                        objArr2[c3] = trustedInput2;
                                        if (nextUpdate3 != null) {
                                        }
                                        addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.localValidCRL", objArr2), i);
                                        z = true;
                                        break;
                                        addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.localInvalidCRL", objArr2), i);
                                        x509crl = x509crl2;
                                    }
                                    if (!z) {
                                        issuerX500Principal = x509Certificate.getIssuerX500Principal();
                                        it2 = vector.iterator();
                                        z2 = z;
                                        while (true) {
                                            if (it2.hasNext()) {
                                                str3 = str3;
                                                crl = x509crl2;
                                                z = z2;
                                                break;
                                            }
                                            try {
                                                str2 = (String) it2.next();
                                                crl = getCRL(str2);
                                                if (crl != null) {
                                                    it3 = it2;
                                                    try {
                                                        issuerX500Principal2 = crl.getIssuerX500Principal();
                                                        if (!issuerX500Principal.equals(issuerX500Principal2)) {
                                                            str3 = str3;
                                                            z3 = z2;
                                                            Date thisUpdate2 = crl.getThisUpdate();
                                                            nextUpdate2 = crl.getNextUpdate();
                                                            TrustedInput trustedInput3 = new TrustedInput(thisUpdate2);
                                                            TrustedInput trustedInput4 = new TrustedInput(nextUpdate2);
                                                            UntrustedUrlInput untrustedUrlInput = new UntrustedUrlInput(str2);
                                                            objArr = new Object[3];
                                                            objArr[c] = trustedInput3;
                                                            objArr[c3] = trustedInput4;
                                                            objArr[2] = untrustedUrlInput;
                                                            if (nextUpdate2 != null) {
                                                                addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.onlineInvalidCRL", objArr), i);
                                                            }
                                                            try {
                                                                addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.onlineValidCRL", objArr), i);
                                                                z = true;
                                                                break;
                                                            } catch (CertPathReviewerException e2) {
                                                                e = e2;
                                                                z2 = true;
                                                                addNotification(e.getErrorMessage(), i);
                                                                it2 = it3;
                                                                str3 = str3;
                                                            }
                                                        } else {
                                                            z3 = z2;
                                                            try {
                                                                UntrustedInput untrustedInput = new UntrustedInput(issuerX500Principal2.getName());
                                                                str3 = str3;
                                                                try {
                                                                    UntrustedInput untrustedInput2 = new UntrustedInput(issuerX500Principal.getName());
                                                                    UntrustedUrlInput untrustedUrlInput2 = new UntrustedUrlInput(str2);
                                                                    Object[] objArr4 = new Object[3];
                                                                    objArr4[c] = untrustedInput;
                                                                    objArr4[c3] = untrustedInput2;
                                                                    objArr4[2] = untrustedUrlInput2;
                                                                    addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.onlineCRLWrongCA", objArr4), i);
                                                                } catch (CertPathReviewerException e3) {
                                                                    e = e3;
                                                                    z2 = z3;
                                                                    addNotification(e.getErrorMessage(), i);
                                                                }
                                                            } catch (CertPathReviewerException e4) {
                                                                e = e4;
                                                                str3 = str3;
                                                            }
                                                        }
                                                    } catch (CertPathReviewerException e5) {
                                                        e = e5;
                                                        z3 = z2;
                                                        z2 = z3;
                                                        addNotification(e.getErrorMessage(), i);
                                                        it2 = it3;
                                                        str3 = str3;
                                                    }
                                                } else {
                                                    str3 = str3;
                                                    it3 = it2;
                                                    z3 = z2;
                                                }
                                                z2 = z3;
                                            } catch (CertPathReviewerException e6) {
                                                e = e6;
                                                it3 = it2;
                                            }
                                            it2 = it3;
                                            str3 = str3;
                                        }
                                    } else {
                                        str3 = "CertPathReviewer.crlIssuerException";
                                        crl = x509crl2;
                                    }
                                    if (crl != null) {
                                        if (x509Certificate2 == null) {
                                        }
                                        if (publicKey != null) {
                                            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlNoIssuerPublicKey"));
                                        }
                                        try {
                                            crl.verify(publicKey, BouncyCastleProvider.PROVIDER_NAME);
                                            revokedCertificate = crl.getRevokedCertificate(x509Certificate.getSerialNumber());
                                            if (revokedCertificate != null) {
                                                if (revokedCertificate.hasExtensions()) {
                                                    try {
                                                        aSN1Enumerated = ASN1Enumerated.getInstance(CertPathValidatorUtilities.getExtensionValue(revokedCertificate, Extension.reasonCode.getId()));
                                                        if (aSN1Enumerated != null) {
                                                            str = CertPathValidatorUtilities.crlReasons[aSN1Enumerated.intValueExact()];
                                                        } else {
                                                            str = null;
                                                        }
                                                    } catch (AnnotatedException e7) {
                                                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlReasonExtError"), e7);
                                                    }
                                                } else {
                                                    str = null;
                                                }
                                                if (str == null) {
                                                    str = CertPathValidatorUtilities.crlReasons[7];
                                                }
                                                localeString = new LocaleString(RESOURCE_NAME, str);
                                                if (date.before(revokedCertificate.getRevocationDate())) {
                                                    Object[] objArr5 = new Object[2];
                                                    objArr5[c] = new TrustedInput(revokedCertificate.getRevocationDate());
                                                    objArr5[c3] = localeString;
                                                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.certRevoked", objArr5));
                                                }
                                                TrustedInput trustedInput5 = new TrustedInput(revokedCertificate.getRevocationDate());
                                                Object[] objArr6 = new Object[2];
                                                objArr6[c] = trustedInput5;
                                                objArr6[c3] = localeString;
                                                addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.revokedAfterValidation", objArr6), i);
                                            } else {
                                                addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.notRevoked"), i);
                                            }
                                            nextUpdate = crl.getNextUpdate();
                                            if (nextUpdate != null) {
                                                TrustedInput trustedInput6 = new TrustedInput(nextUpdate);
                                                Object[] objArr7 = new Object[1];
                                                objArr7[c] = trustedInput6;
                                                addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlUpdateAvailable", objArr7), i);
                                            }
                                            try {
                                                extensionValue = CertPathValidatorUtilities.getExtensionValue(crl, CertPathValidatorUtilities.ISSUING_DISTRIBUTION_POINT);
                                                try {
                                                    extensionValue2 = CertPathValidatorUtilities.getExtensionValue(crl, CertPathValidatorUtilities.DELTA_CRL_INDICATOR);
                                                    if (extensionValue2 != null) {
                                                        X509CRLStoreSelector x509CRLStoreSelector2 = new X509CRLStoreSelector();
                                                        try {
                                                            x509CRLStoreSelector2.addIssuerName(CertPathValidatorUtilities.getIssuerPrincipal(crl).getEncoded());
                                                            x509CRLStoreSelector2.setMinCRLNumber(((ASN1Integer) extensionValue2).getPositiveValue());
                                                            try {
                                                                x509CRLStoreSelector2.setMaxCRLNumber(((ASN1Integer) CertPathValidatorUtilities.getExtensionValue(crl, CertPathValidatorUtilities.CRL_NUMBER)).getPositiveValue().subtract(BigInteger.valueOf(1L)));
                                                                try {
                                                                    it = PKIXCRLUtil.findCRLs(x509CRLStoreSelector2, pKIXParameters).iterator();
                                                                    do {
                                                                        if (it.hasNext()) {
                                                                            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.noBaseCRL"));
                                                                        }
                                                                        try {
                                                                        } catch (AnnotatedException e8) {
                                                                            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.distrPtExtError"), e8);
                                                                        }
                                                                    } while (!Objects.areEqual(extensionValue, CertPathValidatorUtilities.getExtensionValue((X509CRL) it.next(), CertPathValidatorUtilities.ISSUING_DISTRIBUTION_POINT)));
                                                                } catch (AnnotatedException e9) {
                                                                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlExtractionError"), e9);
                                                                }
                                                            } catch (AnnotatedException e10) {
                                                                throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlNbrExtError"), e10);
                                                            }
                                                        } catch (IOException e11) {
                                                            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, str3), e11);
                                                        }
                                                    }
                                                    if (extensionValue != null) {
                                                        issuingDistributionPoint = IssuingDistributionPoint.getInstance(extensionValue);
                                                        try {
                                                            BasicConstraints basicConstraints = BasicConstraints.getInstance(CertPathValidatorUtilities.getExtensionValue(x509Certificate, CertPathValidatorUtilities.BASIC_CONSTRAINTS));
                                                            if (!issuingDistributionPoint.onlyContainsUserCerts()) {
                                                            }
                                                            if (!issuingDistributionPoint.onlyContainsCACerts()) {
                                                            }
                                                            if (issuingDistributionPoint.onlyContainsAttributeCerts()) {
                                                                throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlOnlyAttrCert"));
                                                            }
                                                        } catch (AnnotatedException e12) {
                                                            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlBCExtError"), e12);
                                                        }
                                                    }
                                                } catch (AnnotatedException unused) {
                                                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.deltaCrlExtError"));
                                                }
                                            } catch (AnnotatedException unused2) {
                                                throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.distrPtExtError"));
                                            }
                                        } catch (Exception e13) {
                                            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlVerifyFailed"), e13);
                                        }
                                    }
                                    if (z) {
                                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.noValidCrlFound"));
                                    }
                                }
                            } catch (AnnotatedException e14) {
                                e = e14;
                                c4 = 1;
                                c2 = 2;
                                c3 = c4;
                                c = 0;
                                String message2 = e.getCause().getMessage();
                                Throwable cause2 = e.getCause();
                                String name2 = e.getCause().getClass().getName();
                                Object[] objArr8 = new Object[3];
                                objArr8[c] = message2;
                                objArr8[c3] = cause2;
                                objArr8[c2] = name2;
                                addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlExtractionError", objArr8), i);
                                it4 = new ArrayList().iterator();
                                x509crl = null;
                                while (true) {
                                    if (it4.hasNext()) {
                                        x509crl2 = x509crl;
                                        z = false;
                                        break;
                                    }
                                    X509CRL x509crl4 = (X509CRL) it4.next();
                                    Date thisUpdate3 = x509crl4.getThisUpdate();
                                    nextUpdate3 = x509crl4.getNextUpdate();
                                    TrustedInput trustedInput7 = new TrustedInput(thisUpdate3);
                                    TrustedInput trustedInput8 = new TrustedInput(nextUpdate3);
                                    x509crl2 = x509crl4;
                                    objArr2 = new Object[2];
                                    objArr2[c] = trustedInput7;
                                    objArr2[c3] = trustedInput8;
                                    if (nextUpdate3 != null) {
                                    }
                                    addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.localValidCRL", objArr2), i);
                                    z = true;
                                    break;
                                    addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.localInvalidCRL", objArr2), i);
                                    x509crl = x509crl2;
                                }
                                if (!z) {
                                    issuerX500Principal = x509Certificate.getIssuerX500Principal();
                                    it2 = vector.iterator();
                                    z2 = z;
                                    while (true) {
                                        if (it2.hasNext()) {
                                            str3 = str3;
                                            crl = x509crl2;
                                            z = z2;
                                            break;
                                        }
                                        str2 = (String) it2.next();
                                        crl = getCRL(str2);
                                        if (crl != null) {
                                            it3 = it2;
                                            issuerX500Principal2 = crl.getIssuerX500Principal();
                                            if (!issuerX500Principal.equals(issuerX500Principal2)) {
                                                str3 = str3;
                                                z3 = z2;
                                                Date thisUpdate4 = crl.getThisUpdate();
                                                nextUpdate2 = crl.getNextUpdate();
                                                TrustedInput trustedInput9 = new TrustedInput(thisUpdate4);
                                                TrustedInput trustedInput10 = new TrustedInput(nextUpdate2);
                                                UntrustedUrlInput untrustedUrlInput3 = new UntrustedUrlInput(str2);
                                                objArr = new Object[3];
                                                objArr[c] = trustedInput9;
                                                objArr[c3] = trustedInput10;
                                                objArr[2] = untrustedUrlInput3;
                                                if (nextUpdate2 != null) {
                                                    addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.onlineInvalidCRL", objArr), i);
                                                }
                                                addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.onlineValidCRL", objArr), i);
                                                z = true;
                                                break;
                                            }
                                            z3 = z2;
                                            UntrustedInput untrustedInput3 = new UntrustedInput(issuerX500Principal2.getName());
                                            str3 = str3;
                                            UntrustedInput untrustedInput4 = new UntrustedInput(issuerX500Principal.getName());
                                            UntrustedUrlInput untrustedUrlInput4 = new UntrustedUrlInput(str2);
                                            Object[] objArr9 = new Object[3];
                                            objArr9[c] = untrustedInput3;
                                            objArr9[c3] = untrustedInput4;
                                            objArr9[2] = untrustedUrlInput4;
                                            addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.onlineCRLWrongCA", objArr9), i);
                                        } else {
                                            str3 = str3;
                                            it3 = it2;
                                            z3 = z2;
                                        }
                                        z2 = z3;
                                        it2 = it3;
                                        str3 = str3;
                                    }
                                } else {
                                    str3 = "CertPathReviewer.crlIssuerException";
                                    crl = x509crl2;
                                }
                                if (crl != null) {
                                    if (x509Certificate2 == null) {
                                    }
                                    if (publicKey != null) {
                                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlNoIssuerPublicKey"));
                                    }
                                    crl.verify(publicKey, BouncyCastleProvider.PROVIDER_NAME);
                                    revokedCertificate = crl.getRevokedCertificate(x509Certificate.getSerialNumber());
                                    if (revokedCertificate != null) {
                                        if (revokedCertificate.hasExtensions()) {
                                            aSN1Enumerated = ASN1Enumerated.getInstance(CertPathValidatorUtilities.getExtensionValue(revokedCertificate, Extension.reasonCode.getId()));
                                            if (aSN1Enumerated != null) {
                                                str = CertPathValidatorUtilities.crlReasons[aSN1Enumerated.intValueExact()];
                                            } else {
                                                str = null;
                                            }
                                        } else {
                                            str = null;
                                        }
                                        if (str == null) {
                                            str = CertPathValidatorUtilities.crlReasons[7];
                                        }
                                        localeString = new LocaleString(RESOURCE_NAME, str);
                                        if (date.before(revokedCertificate.getRevocationDate())) {
                                            Object[] objArr10 = new Object[2];
                                            objArr10[c] = new TrustedInput(revokedCertificate.getRevocationDate());
                                            objArr10[c3] = localeString;
                                            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.certRevoked", objArr10));
                                        }
                                        TrustedInput trustedInput11 = new TrustedInput(revokedCertificate.getRevocationDate());
                                        Object[] objArr11 = new Object[2];
                                        objArr11[c] = trustedInput11;
                                        objArr11[c3] = localeString;
                                        addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.revokedAfterValidation", objArr11), i);
                                    } else {
                                        addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.notRevoked"), i);
                                    }
                                    nextUpdate = crl.getNextUpdate();
                                    if (nextUpdate != null) {
                                        TrustedInput trustedInput12 = new TrustedInput(nextUpdate);
                                        Object[] objArr12 = new Object[1];
                                        objArr12[c] = trustedInput12;
                                        addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlUpdateAvailable", objArr12), i);
                                    }
                                    extensionValue = CertPathValidatorUtilities.getExtensionValue(crl, CertPathValidatorUtilities.ISSUING_DISTRIBUTION_POINT);
                                    extensionValue2 = CertPathValidatorUtilities.getExtensionValue(crl, CertPathValidatorUtilities.DELTA_CRL_INDICATOR);
                                    if (extensionValue2 != null) {
                                        X509CRLStoreSelector x509CRLStoreSelector3 = new X509CRLStoreSelector();
                                        x509CRLStoreSelector3.addIssuerName(CertPathValidatorUtilities.getIssuerPrincipal(crl).getEncoded());
                                        x509CRLStoreSelector3.setMinCRLNumber(((ASN1Integer) extensionValue2).getPositiveValue());
                                        x509CRLStoreSelector3.setMaxCRLNumber(((ASN1Integer) CertPathValidatorUtilities.getExtensionValue(crl, CertPathValidatorUtilities.CRL_NUMBER)).getPositiveValue().subtract(BigInteger.valueOf(1L)));
                                        it = PKIXCRLUtil.findCRLs(x509CRLStoreSelector3, pKIXParameters).iterator();
                                        do {
                                            if (it.hasNext()) {
                                                throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.noBaseCRL"));
                                            }
                                        } while (!Objects.areEqual(extensionValue, CertPathValidatorUtilities.getExtensionValue((X509CRL) it.next(), CertPathValidatorUtilities.ISSUING_DISTRIBUTION_POINT)));
                                    }
                                    if (extensionValue != null) {
                                        issuingDistributionPoint = IssuingDistributionPoint.getInstance(extensionValue);
                                        BasicConstraints basicConstraints2 = BasicConstraints.getInstance(CertPathValidatorUtilities.getExtensionValue(x509Certificate, CertPathValidatorUtilities.BASIC_CONSTRAINTS));
                                        if (!issuingDistributionPoint.onlyContainsUserCerts()) {
                                        }
                                        if (!issuingDistributionPoint.onlyContainsCACerts()) {
                                        }
                                        if (issuingDistributionPoint.onlyContainsAttributeCerts()) {
                                            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlOnlyAttrCert"));
                                        }
                                    }
                                }
                                if (z) {
                                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.noValidCrlFound"));
                                }
                            }
                        }
                        c3 = 1;
                        int size = arrayList.size();
                        c2 = 2;
                        try {
                            UntrustedInput untrustedInput5 = new UntrustedInput(x509CRLStoreSelector.getIssuerNames());
                            UntrustedInput untrustedInput6 = new UntrustedInput(arrayList);
                            Integer numValueOf = Integers.valueOf(size);
                            Object[] objArr13 = new Object[3];
                            try {
                                objArr13[0] = untrustedInput5;
                                objArr13[1] = untrustedInput6;
                                objArr13[2] = numValueOf;
                                addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.noCrlInCertstore", objArr13), i);
                                it4 = it4;
                                c = 0;
                            } catch (AnnotatedException e15) {
                                e = e15;
                                c = 0;
                                String message3 = e.getCause().getMessage();
                                Throwable cause3 = e.getCause();
                                String name3 = e.getCause().getClass().getName();
                                Object[] objArr14 = new Object[3];
                                objArr14[c] = message3;
                                objArr14[c3] = cause3;
                                objArr14[c2] = name3;
                                addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlExtractionError", objArr14), i);
                                it4 = new ArrayList().iterator();
                            }
                        } catch (AnnotatedException e16) {
                            e = e16;
                        }
                    } catch (AnnotatedException e17) {
                        e = e17;
                        c = 0;
                        c2 = 2;
                        c3 = 1;
                        String message4 = e.getCause().getMessage();
                        Throwable cause4 = e.getCause();
                        String name4 = e.getCause().getClass().getName();
                        Object[] objArr15 = new Object[3];
                        objArr15[c] = message4;
                        objArr15[c3] = cause4;
                        objArr15[c2] = name4;
                        addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlExtractionError", objArr15), i);
                        it4 = new ArrayList().iterator();
                        x509crl = null;
                        while (true) {
                            if (it4.hasNext()) {
                                x509crl2 = x509crl;
                                z = false;
                                break;
                            }
                            X509CRL x509crl5 = (X509CRL) it4.next();
                            Date thisUpdate5 = x509crl5.getThisUpdate();
                            nextUpdate3 = x509crl5.getNextUpdate();
                            TrustedInput trustedInput13 = new TrustedInput(thisUpdate5);
                            TrustedInput trustedInput14 = new TrustedInput(nextUpdate3);
                            x509crl2 = x509crl5;
                            objArr2 = new Object[2];
                            objArr2[c] = trustedInput13;
                            objArr2[c3] = trustedInput14;
                            if (nextUpdate3 != null) {
                            }
                            addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.localValidCRL", objArr2), i);
                            z = true;
                            break;
                            addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.localInvalidCRL", objArr2), i);
                            x509crl = x509crl2;
                        }
                        if (!z) {
                            issuerX500Principal = x509Certificate.getIssuerX500Principal();
                            it2 = vector.iterator();
                            z2 = z;
                            while (true) {
                                if (it2.hasNext()) {
                                    str3 = str3;
                                    crl = x509crl2;
                                    z = z2;
                                    break;
                                }
                                str2 = (String) it2.next();
                                crl = getCRL(str2);
                                if (crl != null) {
                                    it3 = it2;
                                    issuerX500Principal2 = crl.getIssuerX500Principal();
                                    if (!issuerX500Principal.equals(issuerX500Principal2)) {
                                        str3 = str3;
                                        z3 = z2;
                                        Date thisUpdate6 = crl.getThisUpdate();
                                        nextUpdate2 = crl.getNextUpdate();
                                        TrustedInput trustedInput15 = new TrustedInput(thisUpdate6);
                                        TrustedInput trustedInput16 = new TrustedInput(nextUpdate2);
                                        UntrustedUrlInput untrustedUrlInput5 = new UntrustedUrlInput(str2);
                                        objArr = new Object[3];
                                        objArr[c] = trustedInput15;
                                        objArr[c3] = trustedInput16;
                                        objArr[2] = untrustedUrlInput5;
                                        if (nextUpdate2 != null) {
                                            addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.onlineInvalidCRL", objArr), i);
                                        }
                                        addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.onlineValidCRL", objArr), i);
                                        z = true;
                                        break;
                                    }
                                    z3 = z2;
                                    UntrustedInput untrustedInput7 = new UntrustedInput(issuerX500Principal2.getName());
                                    str3 = str3;
                                    UntrustedInput untrustedInput8 = new UntrustedInput(issuerX500Principal.getName());
                                    UntrustedUrlInput untrustedUrlInput6 = new UntrustedUrlInput(str2);
                                    Object[] objArr16 = new Object[3];
                                    objArr16[c] = untrustedInput7;
                                    objArr16[c3] = untrustedInput8;
                                    objArr16[2] = untrustedUrlInput6;
                                    addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.onlineCRLWrongCA", objArr16), i);
                                } else {
                                    str3 = str3;
                                    it3 = it2;
                                    z3 = z2;
                                }
                                z2 = z3;
                                it2 = it3;
                                str3 = str3;
                            }
                        } else {
                            str3 = "CertPathReviewer.crlIssuerException";
                            crl = x509crl2;
                        }
                        if (crl != null) {
                            if (x509Certificate2 == null) {
                            }
                            if (publicKey != null) {
                                throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlNoIssuerPublicKey"));
                            }
                            crl.verify(publicKey, BouncyCastleProvider.PROVIDER_NAME);
                            revokedCertificate = crl.getRevokedCertificate(x509Certificate.getSerialNumber());
                            if (revokedCertificate != null) {
                                if (revokedCertificate.hasExtensions()) {
                                    aSN1Enumerated = ASN1Enumerated.getInstance(CertPathValidatorUtilities.getExtensionValue(revokedCertificate, Extension.reasonCode.getId()));
                                    if (aSN1Enumerated != null) {
                                        str = CertPathValidatorUtilities.crlReasons[aSN1Enumerated.intValueExact()];
                                    } else {
                                        str = null;
                                    }
                                } else {
                                    str = null;
                                }
                                if (str == null) {
                                    str = CertPathValidatorUtilities.crlReasons[7];
                                }
                                localeString = new LocaleString(RESOURCE_NAME, str);
                                if (date.before(revokedCertificate.getRevocationDate())) {
                                    Object[] objArr17 = new Object[2];
                                    objArr17[c] = new TrustedInput(revokedCertificate.getRevocationDate());
                                    objArr17[c3] = localeString;
                                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.certRevoked", objArr17));
                                }
                                TrustedInput trustedInput17 = new TrustedInput(revokedCertificate.getRevocationDate());
                                Object[] objArr18 = new Object[2];
                                objArr18[c] = trustedInput17;
                                objArr18[c3] = localeString;
                                addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.revokedAfterValidation", objArr18), i);
                            } else {
                                addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.notRevoked"), i);
                            }
                            nextUpdate = crl.getNextUpdate();
                            if (nextUpdate != null) {
                                TrustedInput trustedInput18 = new TrustedInput(nextUpdate);
                                Object[] objArr19 = new Object[1];
                                objArr19[c] = trustedInput18;
                                addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlUpdateAvailable", objArr19), i);
                            }
                            extensionValue = CertPathValidatorUtilities.getExtensionValue(crl, CertPathValidatorUtilities.ISSUING_DISTRIBUTION_POINT);
                            extensionValue2 = CertPathValidatorUtilities.getExtensionValue(crl, CertPathValidatorUtilities.DELTA_CRL_INDICATOR);
                            if (extensionValue2 != null) {
                                X509CRLStoreSelector x509CRLStoreSelector4 = new X509CRLStoreSelector();
                                x509CRLStoreSelector4.addIssuerName(CertPathValidatorUtilities.getIssuerPrincipal(crl).getEncoded());
                                x509CRLStoreSelector4.setMinCRLNumber(((ASN1Integer) extensionValue2).getPositiveValue());
                                x509CRLStoreSelector4.setMaxCRLNumber(((ASN1Integer) CertPathValidatorUtilities.getExtensionValue(crl, CertPathValidatorUtilities.CRL_NUMBER)).getPositiveValue().subtract(BigInteger.valueOf(1L)));
                                it = PKIXCRLUtil.findCRLs(x509CRLStoreSelector4, pKIXParameters).iterator();
                                do {
                                    if (it.hasNext()) {
                                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.noBaseCRL"));
                                    }
                                } while (!Objects.areEqual(extensionValue, CertPathValidatorUtilities.getExtensionValue((X509CRL) it.next(), CertPathValidatorUtilities.ISSUING_DISTRIBUTION_POINT)));
                            }
                            if (extensionValue != null) {
                                issuingDistributionPoint = IssuingDistributionPoint.getInstance(extensionValue);
                                BasicConstraints basicConstraints3 = BasicConstraints.getInstance(CertPathValidatorUtilities.getExtensionValue(x509Certificate, CertPathValidatorUtilities.BASIC_CONSTRAINTS));
                                if (!issuingDistributionPoint.onlyContainsUserCerts()) {
                                }
                                if (!issuingDistributionPoint.onlyContainsCACerts()) {
                                }
                                if (issuingDistributionPoint.onlyContainsAttributeCerts()) {
                                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlOnlyAttrCert"));
                                }
                            }
                        }
                        if (z) {
                            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.noValidCrlFound"));
                        }
                    }
                } else {
                    c = 0;
                    c3 = 1;
                }
                while (true) {
                    if (it4.hasNext()) {
                        x509crl2 = x509crl;
                        z = false;
                        break;
                    }
                    X509CRL x509crl6 = (X509CRL) it4.next();
                    Date thisUpdate7 = x509crl6.getThisUpdate();
                    nextUpdate3 = x509crl6.getNextUpdate();
                    TrustedInput trustedInput19 = new TrustedInput(thisUpdate7);
                    TrustedInput trustedInput110 = new TrustedInput(nextUpdate3);
                    x509crl2 = x509crl6;
                    objArr2 = new Object[2];
                    objArr2[c] = trustedInput19;
                    objArr2[c3] = trustedInput110;
                    if (nextUpdate3 != null || date.before(nextUpdate3)) {
                        addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.localValidCRL", objArr2), i);
                        z = true;
                        break;
                    } else {
                        addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.localInvalidCRL", objArr2), i);
                        x509crl = x509crl2;
                    }
                }
            } catch (AnnotatedException e18) {
                e = e18;
            }
            x509crl = null;
            if (!z) {
                issuerX500Principal = x509Certificate.getIssuerX500Principal();
                it2 = vector.iterator();
                z2 = z;
                while (true) {
                    if (it2.hasNext()) {
                        str3 = str3;
                        crl = x509crl2;
                        z = z2;
                        break;
                    }
                    str2 = (String) it2.next();
                    crl = getCRL(str2);
                    if (crl != null) {
                        it3 = it2;
                        issuerX500Principal2 = crl.getIssuerX500Principal();
                        if (!issuerX500Principal.equals(issuerX500Principal2)) {
                            str3 = str3;
                            z3 = z2;
                            Date thisUpdate8 = crl.getThisUpdate();
                            nextUpdate2 = crl.getNextUpdate();
                            TrustedInput trustedInput111 = new TrustedInput(thisUpdate8);
                            TrustedInput trustedInput112 = new TrustedInput(nextUpdate2);
                            UntrustedUrlInput untrustedUrlInput7 = new UntrustedUrlInput(str2);
                            objArr = new Object[3];
                            objArr[c] = trustedInput111;
                            objArr[c3] = trustedInput112;
                            objArr[2] = untrustedUrlInput7;
                            if (nextUpdate2 != null && !date.before(nextUpdate2)) {
                                addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.onlineInvalidCRL", objArr), i);
                            }
                            addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.onlineValidCRL", objArr), i);
                            z = true;
                            break;
                        }
                        z3 = z2;
                        UntrustedInput untrustedInput9 = new UntrustedInput(issuerX500Principal2.getName());
                        str3 = str3;
                        UntrustedInput untrustedInput10 = new UntrustedInput(issuerX500Principal.getName());
                        UntrustedUrlInput untrustedUrlInput8 = new UntrustedUrlInput(str2);
                        Object[] objArr110 = new Object[3];
                        objArr110[c] = untrustedInput9;
                        objArr110[c3] = untrustedInput10;
                        objArr110[2] = untrustedUrlInput8;
                        addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.onlineCRLWrongCA", objArr110), i);
                    } else {
                        str3 = str3;
                        it3 = it2;
                        z3 = z2;
                    }
                    z2 = z3;
                    it2 = it3;
                    str3 = str3;
                }
            } else {
                str3 = "CertPathReviewer.crlIssuerException";
                crl = x509crl2;
            }
            if (crl != null) {
                if (x509Certificate2 == null && (keyUsage = x509Certificate2.getKeyUsage()) != null && (keyUsage.length <= 6 || !keyUsage[6])) {
                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.noCrlSigningPermited"));
                }
                if (publicKey != null) {
                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlNoIssuerPublicKey"));
                }
                crl.verify(publicKey, BouncyCastleProvider.PROVIDER_NAME);
                revokedCertificate = crl.getRevokedCertificate(x509Certificate.getSerialNumber());
                if (revokedCertificate != null) {
                    if (revokedCertificate.hasExtensions()) {
                        aSN1Enumerated = ASN1Enumerated.getInstance(CertPathValidatorUtilities.getExtensionValue(revokedCertificate, Extension.reasonCode.getId()));
                        if (aSN1Enumerated != null) {
                            str = CertPathValidatorUtilities.crlReasons[aSN1Enumerated.intValueExact()];
                        } else {
                            str = null;
                        }
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        str = CertPathValidatorUtilities.crlReasons[7];
                    }
                    localeString = new LocaleString(RESOURCE_NAME, str);
                    if (date.before(revokedCertificate.getRevocationDate())) {
                        Object[] objArr111 = new Object[2];
                        objArr111[c] = new TrustedInput(revokedCertificate.getRevocationDate());
                        objArr111[c3] = localeString;
                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.certRevoked", objArr111));
                    }
                    TrustedInput trustedInput113 = new TrustedInput(revokedCertificate.getRevocationDate());
                    Object[] objArr112 = new Object[2];
                    objArr112[c] = trustedInput113;
                    objArr112[c3] = localeString;
                    addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.revokedAfterValidation", objArr112), i);
                } else {
                    addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.notRevoked"), i);
                }
                nextUpdate = crl.getNextUpdate();
                if (nextUpdate != null && !date.before(nextUpdate)) {
                    TrustedInput trustedInput114 = new TrustedInput(nextUpdate);
                    Object[] objArr113 = new Object[1];
                    objArr113[c] = trustedInput114;
                    addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlUpdateAvailable", objArr113), i);
                }
                extensionValue = CertPathValidatorUtilities.getExtensionValue(crl, CertPathValidatorUtilities.ISSUING_DISTRIBUTION_POINT);
                extensionValue2 = CertPathValidatorUtilities.getExtensionValue(crl, CertPathValidatorUtilities.DELTA_CRL_INDICATOR);
                if (extensionValue2 != null) {
                    X509CRLStoreSelector x509CRLStoreSelector5 = new X509CRLStoreSelector();
                    x509CRLStoreSelector5.addIssuerName(CertPathValidatorUtilities.getIssuerPrincipal(crl).getEncoded());
                    x509CRLStoreSelector5.setMinCRLNumber(((ASN1Integer) extensionValue2).getPositiveValue());
                    x509CRLStoreSelector5.setMaxCRLNumber(((ASN1Integer) CertPathValidatorUtilities.getExtensionValue(crl, CertPathValidatorUtilities.CRL_NUMBER)).getPositiveValue().subtract(BigInteger.valueOf(1L)));
                    it = PKIXCRLUtil.findCRLs(x509CRLStoreSelector5, pKIXParameters).iterator();
                    do {
                        if (it.hasNext()) {
                            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.noBaseCRL"));
                        }
                    } while (!Objects.areEqual(extensionValue, CertPathValidatorUtilities.getExtensionValue((X509CRL) it.next(), CertPathValidatorUtilities.ISSUING_DISTRIBUTION_POINT)));
                }
                if (extensionValue != null) {
                    issuingDistributionPoint = IssuingDistributionPoint.getInstance(extensionValue);
                    BasicConstraints basicConstraints4 = BasicConstraints.getInstance(CertPathValidatorUtilities.getExtensionValue(x509Certificate, CertPathValidatorUtilities.BASIC_CONSTRAINTS));
                    if (!issuingDistributionPoint.onlyContainsUserCerts() && basicConstraints4 != null && basicConstraints4.isCA()) {
                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlOnlyUserCert"));
                    }
                    if (!issuingDistributionPoint.onlyContainsCACerts() && (basicConstraints4 == null || !basicConstraints4.isCA())) {
                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlOnlyCaCert"));
                    }
                    if (issuingDistributionPoint.onlyContainsAttributeCerts()) {
                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlOnlyAttrCert"));
                    }
                }
            }
            if (z) {
                throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.noValidCrlFound"));
            }
        } catch (IOException e19) {
            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlIssuerException"), e19);
        }
    }

    public void checkRevocation(PKIXParameters pKIXParameters, X509Certificate x509Certificate, Date date, X509Certificate x509Certificate2, PublicKey publicKey, Vector vector, Vector vector2, int i) throws CertPathReviewerException {
        checkCRLs(pKIXParameters, x509Certificate, date, x509Certificate2, publicKey, vector, i);
    }

    public void doChecks() {
        if (!this.initialized) {
            throw new IllegalStateException("Object not initialized. Call init() first.");
        }
        if (this.notifications != null) {
            return;
        }
        int i = this.n;
        this.notifications = new List[i + 1];
        this.errors = new List[i + 1];
        int i2 = 0;
        while (true) {
            List[] listArr = this.notifications;
            if (i2 >= listArr.length) {
                checkSignatures();
                checkNameConstraints();
                checkPathLength();
                checkPolicy();
                checkCriticalExtensions();
                return;
            }
            listArr[i2] = new ArrayList();
            this.errors[i2] = new ArrayList();
            i2++;
        }
    }

    public Vector getCRLDistUrls(CRLDistPoint cRLDistPoint) {
        Vector vector = new Vector();
        if (cRLDistPoint != null) {
            for (DistributionPoint distributionPoint : cRLDistPoint.getDistributionPoints()) {
                DistributionPointName distributionPoint2 = distributionPoint.getDistributionPoint();
                if (distributionPoint2.getType() == 0) {
                    GeneralName[] names = GeneralNames.getInstance(distributionPoint2.getName()).getNames();
                    for (int i = 0; i < names.length; i++) {
                        if (names[i].getTagNo() == 6) {
                            vector.add(((ASN1IA5String) names[i].getName()).getString());
                        }
                    }
                }
            }
        }
        return vector;
    }

    public CertPath getCertPath() {
        return this.certPath;
    }

    public int getCertPathSize() {
        return this.n;
    }

    public List getErrors(int i) {
        doChecks();
        return this.errors[i + 1];
    }

    public List[] getErrors() {
        doChecks();
        return this.errors;
    }

    public List getNotifications(int i) {
        doChecks();
        return this.notifications[i + 1];
    }

    public List[] getNotifications() {
        doChecks();
        return this.notifications;
    }

    public Vector getOCSPUrls(AuthorityInformationAccess authorityInformationAccess) {
        Vector vector = new Vector();
        if (authorityInformationAccess != null) {
            AccessDescription[] accessDescriptions = authorityInformationAccess.getAccessDescriptions();
            for (int i = 0; i < accessDescriptions.length; i++) {
                if (accessDescriptions[i].getAccessMethod().equals((ASN1Primitive) AccessDescription.id_ad_ocsp)) {
                    GeneralName accessLocation = accessDescriptions[i].getAccessLocation();
                    if (accessLocation.getTagNo() == 6) {
                        vector.add(((ASN1IA5String) accessLocation.getName()).getString());
                    }
                }
            }
        }
        return vector;
    }

    public PolicyNode getPolicyTree() {
        doChecks();
        return this.policyTree;
    }

    public PublicKey getSubjectPublicKey() {
        doChecks();
        return this.subjectPublicKey;
    }

    public TrustAnchor getTrustAnchor() {
        doChecks();
        return this.trustAnchor;
    }

    public Collection getTrustAnchors(X509Certificate x509Certificate, Set set) throws CertPathReviewerException {
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        X509CertSelector x509CertSelector = new X509CertSelector();
        try {
            x509CertSelector.setSubject(CertPathValidatorUtilities.getEncodedIssuerPrincipal(x509Certificate).getEncoded());
            byte[] extensionValue = x509Certificate.getExtensionValue(Extension.authorityKeyIdentifier.getId());
            if (extensionValue != null) {
                AuthorityKeyIdentifier authorityKeyIdentifier = AuthorityKeyIdentifier.getInstance(ASN1OctetString.getInstance(extensionValue).getOctets());
                if (authorityKeyIdentifier.getAuthorityCertSerialNumber() != null) {
                    x509CertSelector.setSerialNumber(authorityKeyIdentifier.getAuthorityCertSerialNumber());
                } else {
                    ASN1OctetString keyIdentifierObject = authorityKeyIdentifier.getKeyIdentifierObject();
                    if (keyIdentifierObject != null) {
                        x509CertSelector.setSubjectKeyIdentifier(keyIdentifierObject.getEncoded(ASN1Encoding.DER));
                    }
                }
            }
            while (it.hasNext()) {
                TrustAnchor trustAnchor = (TrustAnchor) it.next();
                if (trustAnchor.getTrustedCert() != null) {
                    if (x509CertSelector.match(trustAnchor.getTrustedCert())) {
                        arrayList.add(trustAnchor);
                    }
                } else if (trustAnchor.getCAName() != null && trustAnchor.getCAPublicKey() != null && CertPathValidatorUtilities.getEncodedIssuerPrincipal(x509Certificate).equals(new X500Principal(trustAnchor.getCAName()))) {
                    arrayList.add(trustAnchor);
                }
            }
            return arrayList;
        } catch (IOException unused) {
            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.trustAnchorIssuerError"));
        }
    }

    public void init(CertPath certPath, PKIXParameters pKIXParameters) throws CertPathReviewerException {
        if (this.initialized) {
            throw new IllegalStateException("object is already initialized!");
        }
        this.initialized = true;
        if (certPath == null) {
            throw new NullPointerException("certPath was null");
        }
        List<? extends Certificate> certificates = certPath.getCertificates();
        if (certificates.size() != 1) {
            HashSet hashSet = new HashSet();
            Iterator<TrustAnchor> it = pKIXParameters.getTrustAnchors().iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().getTrustedCert());
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i != certificates.size(); i++) {
                if (!hashSet.contains(certificates.get(i))) {
                    arrayList.add(certificates.get(i));
                }
            }
            try {
                this.certPath = CertificateFactory.getInstance("X.509", BouncyCastleProvider.PROVIDER_NAME).generateCertPath(arrayList);
                this.certs = arrayList;
            } catch (GeneralSecurityException unused) {
                throw new IllegalStateException("unable to rebuild certpath");
            }
        } else {
            this.certPath = certPath;
            this.certs = certPath.getCertificates();
        }
        this.n = this.certs.size();
        if (this.certs.isEmpty()) {
            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.emptyCertPath"));
        }
        this.pkixParams = (PKIXParameters) pKIXParameters.clone();
        Date date = new Date();
        this.currentDate = date;
        this.validDate = CertPathValidatorUtilities.getValidityDate(this.pkixParams, date);
        this.notifications = null;
        this.errors = null;
        this.trustAnchor = null;
        this.subjectPublicKey = null;
        this.policyTree = null;
    }

    public boolean isValidCertPath() {
        doChecks();
        int i = 0;
        while (true) {
            List[] listArr = this.errors;
            if (i >= listArr.length) {
                return true;
            }
            if (!listArr[i].isEmpty()) {
                return false;
            }
            i++;
        }
    }
}
