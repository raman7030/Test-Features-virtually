package org.bouncycastle.jcajce;

import java.security.PublicKey;
import java.security.cert.CertPath;
import java.security.cert.X509Certificate;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public class PKIXCertRevocationCheckerParameters {
    public final CertPath certPath;
    public final int index;
    public final PKIXExtendedParameters paramsPKIX;
    public final X509Certificate signingCert;
    public final Date validDate;
    public final PublicKey workingPublicKey;

    public PKIXCertRevocationCheckerParameters(PKIXExtendedParameters pKIXExtendedParameters, Date date, CertPath certPath, int i, X509Certificate x509Certificate, PublicKey publicKey) {
        this.paramsPKIX = pKIXExtendedParameters;
        this.validDate = date;
        this.certPath = certPath;
        this.index = i;
        this.signingCert = x509Certificate;
        this.workingPublicKey = publicKey;
    }

    public CertPath getCertPath() {
        return this.certPath;
    }

    public int getIndex() {
        return this.index;
    }

    public PKIXExtendedParameters getParamsPKIX() {
        return this.paramsPKIX;
    }

    public X509Certificate getSigningCert() {
        return this.signingCert;
    }

    public Date getValidDate() {
        return new Date(this.validDate.getTime());
    }

    public PublicKey getWorkingPublicKey() {
        return this.workingPublicKey;
    }
}
