package com.amazonaws.services.p061s3.internal;

import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSSessionCredentials;
import com.amazonaws.auth.AbstractAWSSigner;
import com.amazonaws.auth.SigningAlgorithm;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.HttpUtils;
import java.util.Date;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class S3Signer extends AbstractAWSSigner {

    /* JADX INFO: renamed from: ᩳ */
    public static final Log f1662 = LogFactory.m1468(S3Signer.class);

    /* JADX INFO: renamed from: ֫ */
    public final Set f1663;

    /* JADX INFO: renamed from: ۧ */
    public final String f1664;

    /* JADX INFO: renamed from: ܽ */
    public final String f1665;

    public S3Signer() {
        this.f1664 = null;
        this.f1665 = null;
        this.f1663 = null;
    }

    public S3Signer(String str, String str2) {
        if (str2 == null) {
            throw new IllegalArgumentException("Parameter resourcePath is empty");
        }
        this.f1664 = str;
        this.f1665 = str2;
        this.f1663 = null;
    }

    @Override // com.amazonaws.auth.Signer
    public final void sign(Request request, AWSCredentials aWSCredentials) {
        String str = this.f1665;
        if (str == null) {
            throw new UnsupportedOperationException("Cannot sign a request using a dummy S3Signer instance with no resource path");
        }
        String strMo1373 = aWSCredentials.mo1373();
        Log log = f1662;
        if (strMo1373 == null) {
            log.mo1460("Canonical string will not be signed, as no AWS Secret Key was provided");
            return;
        }
        AWSCredentials aWSCredentialsSanitizeCredentials = sanitizeCredentials(aWSCredentials);
        if (aWSCredentialsSanitizeCredentials instanceof AWSSessionCredentials) {
            addSessionCredentials(request, (AWSSessionCredentials) aWSCredentialsSanitizeCredentials);
        }
        DefaultRequest defaultRequest = (DefaultRequest) request;
        String strM1939 = HttpUtils.m1939(defaultRequest.m1354().getPath(), str, true);
        Date signatureDate = getSignatureDate(getTimeOffset(defaultRequest));
        int i = ServiceUtils.f1672;
        defaultRequest.m1348("Date", DateUtils.m1932("EEE, dd MMM yyyy HH:mm:ss z", signatureDate));
        String strM1639 = RestUtils.m1639(this.f1664, strM1939, defaultRequest, this.f1663);
        log.mo1460("Calculated string to sign:\n\"" + strM1639 + "\"");
        defaultRequest.m1348("Authorization", "AWS " + aWSCredentialsSanitizeCredentials.mo1372() + ":" + super.signAndBase64Encode(strM1639, aWSCredentialsSanitizeCredentials.mo1373(), SigningAlgorithm.HmacSHA1));
    }

    @Override // com.amazonaws.auth.AbstractAWSSigner
    public final void addSessionCredentials(Request request, AWSSessionCredentials aWSSessionCredentials) {
        ((DefaultRequest) request).m1348("x-amz-security-token", aWSSessionCredentials.mo1375());
    }
}
