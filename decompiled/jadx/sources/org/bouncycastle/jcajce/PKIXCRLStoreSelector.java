package org.bouncycastle.jcajce;

import java.math.BigInteger;
import java.security.cert.CRL;
import java.security.cert.CRLSelector;
import java.security.cert.CertStore;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLSelector;
import java.security.cert.X509Certificate;
import java.util.Collection;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Selector;

/* JADX INFO: loaded from: classes.dex */
public class PKIXCRLStoreSelector implements Selector {
    public final CRLSelector baseSelector;
    public final boolean completeCRLEnabled;
    public final boolean deltaCRLIndicator;
    public final byte[] issuingDistributionPoint;
    public final boolean issuingDistributionPointEnabled;
    public final BigInteger maxBaseCRLNumber;

    public class Builder {
        public final CRLSelector baseSelector;
        public boolean deltaCRLIndicator = false;
        public boolean completeCRLEnabled = false;
        public BigInteger maxBaseCRLNumber = null;
        public byte[] issuingDistributionPoint = null;
        public boolean issuingDistributionPointEnabled = false;

        public Builder(CRLSelector cRLSelector) {
            this.baseSelector = (CRLSelector) cRLSelector.clone();
        }

        public PKIXCRLStoreSelector build() {
            return new PKIXCRLStoreSelector(this);
        }

        public Builder setCompleteCRLEnabled(boolean z) {
            this.completeCRLEnabled = z;
            return this;
        }

        public Builder setDeltaCRLIndicatorEnabled(boolean z) {
            this.deltaCRLIndicator = z;
            return this;
        }

        public void setIssuingDistributionPoint(byte[] bArr) {
            this.issuingDistributionPoint = Arrays.clone(bArr);
        }

        public void setIssuingDistributionPointEnabled(boolean z) {
            this.issuingDistributionPointEnabled = z;
        }

        public void setMaxBaseCRLNumber(BigInteger bigInteger) {
            this.maxBaseCRLNumber = bigInteger;
        }
    }

    public class SelectorClone extends X509CRLSelector {
        public final PKIXCRLStoreSelector selector;

        public SelectorClone(PKIXCRLStoreSelector pKIXCRLStoreSelector) {
            this.selector = pKIXCRLStoreSelector;
            if (pKIXCRLStoreSelector.baseSelector instanceof X509CRLSelector) {
                X509CRLSelector x509CRLSelector = (X509CRLSelector) pKIXCRLStoreSelector.baseSelector;
                setCertificateChecking(x509CRLSelector.getCertificateChecking());
                setDateAndTime(x509CRLSelector.getDateAndTime());
                setIssuers(x509CRLSelector.getIssuers());
                setMinCRLNumber(x509CRLSelector.getMinCRL());
                setMaxCRLNumber(x509CRLSelector.getMaxCRL());
            }
        }

        @Override // java.security.cert.X509CRLSelector, java.security.cert.CRLSelector
        public boolean match(CRL crl) {
            PKIXCRLStoreSelector pKIXCRLStoreSelector = this.selector;
            if (pKIXCRLStoreSelector == null) {
                return crl != null;
            }
            return pKIXCRLStoreSelector.match(crl);
        }
    }

    public PKIXCRLStoreSelector(Builder builder) {
        this.baseSelector = builder.baseSelector;
        this.deltaCRLIndicator = builder.deltaCRLIndicator;
        this.completeCRLEnabled = builder.completeCRLEnabled;
        this.maxBaseCRLNumber = builder.maxBaseCRLNumber;
        this.issuingDistributionPoint = builder.issuingDistributionPoint;
        this.issuingDistributionPointEnabled = builder.issuingDistributionPointEnabled;
    }

    public static Collection getCRLs(PKIXCRLStoreSelector pKIXCRLStoreSelector, CertStore certStore) {
        return certStore.getCRLs(new SelectorClone(pKIXCRLStoreSelector));
    }

    @Override // org.bouncycastle.util.Selector
    public Object clone() {
        return this;
    }

    public X509Certificate getCertificateChecking() {
        CRLSelector cRLSelector = this.baseSelector;
        if (cRLSelector instanceof X509CRLSelector) {
            return ((X509CRLSelector) cRLSelector).getCertificateChecking();
        }
        return null;
    }

    public byte[] getIssuingDistributionPoint() {
        return Arrays.clone(this.issuingDistributionPoint);
    }

    public BigInteger getMaxBaseCRLNumber() {
        return this.maxBaseCRLNumber;
    }

    public boolean isCompleteCRLEnabled() {
        return this.completeCRLEnabled;
    }

    public boolean isDeltaCRLIndicatorEnabled() {
        return this.deltaCRLIndicator;
    }

    public boolean isIssuingDistributionPointEnabled() {
        return this.issuingDistributionPointEnabled;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x005e, code lost:
    
        if (org.bouncycastle.util.Arrays.areEqual(r0, r2) == false) goto L34;
     */
    @Override // org.bouncycastle.util.Selector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean match(CRL crl) {
        if (crl instanceof X509CRL) {
            X509CRL x509crl = (X509CRL) crl;
            try {
                byte[] extensionValue = x509crl.getExtensionValue(Extension.deltaCRLIndicator.getId());
                ASN1Integer aSN1Integer = extensionValue != null ? ASN1Integer.getInstance(ASN1OctetString.getInstance(extensionValue).getOctets()) : null;
                if (aSN1Integer == null) {
                    if (isDeltaCRLIndicatorEnabled()) {
                        return false;
                    }
                } else {
                    if (isCompleteCRLEnabled()) {
                        return false;
                    }
                    if (this.maxBaseCRLNumber != null && aSN1Integer.getPositiveValue().compareTo(this.maxBaseCRLNumber) == 1) {
                        return false;
                    }
                }
                if (this.issuingDistributionPointEnabled) {
                    byte[] extensionValue2 = x509crl.getExtensionValue(Extension.issuingDistributionPoint.getId());
                    byte[] bArr = this.issuingDistributionPoint;
                    if (bArr == null) {
                        if (extensionValue2 != null) {
                            return false;
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return this.baseSelector.match(crl);
        return false;
    }
}
