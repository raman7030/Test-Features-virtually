package org.bouncycastle.jcajce;

import java.security.cert.CertPathParameters;
import java.security.cert.CertSelector;
import java.security.cert.PKIXParameters;
import java.security.cert.TrustAnchor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.bouncycastle.asn1.x509.GeneralName;
import p067l.C21562;

/* JADX INFO: loaded from: classes.dex */
public class PKIXExtendedParameters implements CertPathParameters {
    public static final int CHAIN_VALIDITY_MODEL = 1;
    public static final int PKIX_VALIDITY_MODEL = 0;
    public final PKIXParameters baseParameters;
    public final Date date;
    public final List extraCRLStores;
    public final List extraCertStores;
    public final Map namedCRLStoreMap;
    public final Map namedCertificateStoreMap;
    public final boolean revocationEnabled;
    public final PKIXCertStoreSelector targetConstraints;
    public final Set trustAnchors;
    public final boolean useDeltas;
    public final Date validityDate;
    public final int validityModel;

    public class Builder {
        public final PKIXParameters baseParameters;
        public final Date date;
        public List extraCRLStores;
        public List extraCertStores;
        public Map namedCRLStoreMap;
        public Map namedCertificateStoreMap;
        public boolean revocationEnabled;
        public PKIXCertStoreSelector targetConstraints;
        public Set trustAnchors;
        public boolean useDeltas;
        public final Date validityDate;
        public int validityModel;

        public Builder(PKIXParameters pKIXParameters) {
            this.extraCertStores = new ArrayList();
            this.namedCertificateStoreMap = new HashMap();
            this.extraCRLStores = new ArrayList();
            this.namedCRLStoreMap = new HashMap();
            this.validityModel = 0;
            this.useDeltas = false;
            this.baseParameters = (PKIXParameters) pKIXParameters.clone();
            CertSelector targetCertConstraints = pKIXParameters.getTargetCertConstraints();
            if (targetCertConstraints != null) {
                this.targetConstraints = new PKIXCertStoreSelector.Builder(targetCertConstraints).build();
            }
            Date date = pKIXParameters.getDate();
            this.validityDate = date;
            this.date = date == null ? new Date() : date;
            this.revocationEnabled = pKIXParameters.isRevocationEnabled();
            this.trustAnchors = pKIXParameters.getTrustAnchors();
        }

        public Builder(PKIXExtendedParameters pKIXExtendedParameters) {
            this.extraCertStores = new ArrayList();
            this.namedCertificateStoreMap = new HashMap();
            this.extraCRLStores = new ArrayList();
            this.namedCRLStoreMap = new HashMap();
            this.validityModel = 0;
            this.useDeltas = false;
            this.baseParameters = pKIXExtendedParameters.baseParameters;
            this.validityDate = pKIXExtendedParameters.validityDate;
            this.date = pKIXExtendedParameters.date;
            this.targetConstraints = pKIXExtendedParameters.targetConstraints;
            this.extraCertStores = new ArrayList(pKIXExtendedParameters.extraCertStores);
            this.namedCertificateStoreMap = new HashMap(pKIXExtendedParameters.namedCertificateStoreMap);
            this.extraCRLStores = new ArrayList(pKIXExtendedParameters.extraCRLStores);
            this.namedCRLStoreMap = new HashMap(pKIXExtendedParameters.namedCRLStoreMap);
            this.useDeltas = pKIXExtendedParameters.useDeltas;
            this.validityModel = pKIXExtendedParameters.validityModel;
            this.revocationEnabled = pKIXExtendedParameters.isRevocationEnabled();
            this.trustAnchors = pKIXExtendedParameters.getTrustAnchors();
        }

        public Builder addCRLStore(PKIXCRLStore pKIXCRLStore) {
            this.extraCRLStores.add(pKIXCRLStore);
            return this;
        }

        public Builder addCertificateStore(PKIXCertStore pKIXCertStore) {
            this.extraCertStores.add(pKIXCertStore);
            return this;
        }

        public Builder addNamedCRLStore(GeneralName generalName, PKIXCRLStore pKIXCRLStore) {
            this.namedCRLStoreMap.put(generalName, pKIXCRLStore);
            return this;
        }

        public Builder addNamedCertificateStore(GeneralName generalName, PKIXCertStore pKIXCertStore) {
            this.namedCertificateStoreMap.put(generalName, pKIXCertStore);
            return this;
        }

        public PKIXExtendedParameters build() {
            return new PKIXExtendedParameters(this);
        }

        public void setRevocationEnabled(boolean z) {
            this.revocationEnabled = z;
        }

        public Builder setTargetConstraints(PKIXCertStoreSelector pKIXCertStoreSelector) {
            this.targetConstraints = pKIXCertStoreSelector;
            return this;
        }

        public Builder setTrustAnchor(TrustAnchor trustAnchor) {
            this.trustAnchors = Collections.singleton(trustAnchor);
            return this;
        }

        public Builder setTrustAnchors(Set set) {
            this.trustAnchors = set;
            return this;
        }

        public Builder setUseDeltasEnabled(boolean z) {
            this.useDeltas = z;
            return this;
        }

        public Builder setValidityModel(int i) {
            this.validityModel = i;
            return this;
        }
    }

    public PKIXExtendedParameters(Builder builder) {
        this.baseParameters = builder.baseParameters;
        this.validityDate = builder.validityDate;
        this.date = builder.date;
        this.extraCertStores = C21562.unmodifiableList(builder.extraCertStores);
        this.namedCertificateStoreMap = C21562.unmodifiableMap(new HashMap(builder.namedCertificateStoreMap));
        this.extraCRLStores = C21562.unmodifiableList(builder.extraCRLStores);
        this.namedCRLStoreMap = C21562.unmodifiableMap(new HashMap(builder.namedCRLStoreMap));
        this.targetConstraints = builder.targetConstraints;
        this.revocationEnabled = builder.revocationEnabled;
        this.useDeltas = builder.useDeltas;
        this.validityModel = builder.validityModel;
        this.trustAnchors = C21562.unmodifiableSet(builder.trustAnchors);
    }

    @Override // java.security.cert.CertPathParameters
    public Object clone() {
        return this;
    }

    public List getCRLStores() {
        return this.extraCRLStores;
    }

    public List getCertPathCheckers() {
        return this.baseParameters.getCertPathCheckers();
    }

    public List getCertStores() {
        return this.baseParameters.getCertStores();
    }

    public List getCertificateStores() {
        return this.extraCertStores;
    }

    public Date getDate() {
        return new Date(this.date.getTime());
    }

    public Set getInitialPolicies() {
        return this.baseParameters.getInitialPolicies();
    }

    public Map getNamedCRLStoreMap() {
        return this.namedCRLStoreMap;
    }

    public Map getNamedCertificateStoreMap() {
        return this.namedCertificateStoreMap;
    }

    public boolean getPolicyQualifiersRejected() {
        return this.baseParameters.getPolicyQualifiersRejected();
    }

    public String getSigProvider() {
        return this.baseParameters.getSigProvider();
    }

    public PKIXCertStoreSelector getTargetConstraints() {
        return this.targetConstraints;
    }

    public Set getTrustAnchors() {
        return this.trustAnchors;
    }

    public Date getValidityDate() {
        if (this.validityDate == null) {
            return null;
        }
        return new Date(this.validityDate.getTime());
    }

    public int getValidityModel() {
        return this.validityModel;
    }

    public boolean isAnyPolicyInhibited() {
        return this.baseParameters.isAnyPolicyInhibited();
    }

    public boolean isExplicitPolicyRequired() {
        return this.baseParameters.isExplicitPolicyRequired();
    }

    public boolean isPolicyMappingInhibited() {
        return this.baseParameters.isPolicyMappingInhibited();
    }

    public boolean isRevocationEnabled() {
        return this.revocationEnabled;
    }

    public boolean isUseDeltasEnabled() {
        return this.useDeltas;
    }
}
