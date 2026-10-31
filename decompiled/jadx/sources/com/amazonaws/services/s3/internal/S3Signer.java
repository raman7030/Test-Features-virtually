package com.amazonaws.services.s3.internal;

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

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final Log f502 = LogFactory.m302(S3Signer.class);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Set f503;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f504;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f505;

    public S3Signer() {
        this.f504 = null;
        this.f505 = null;
        this.f503 = null;
    }

    public S3Signer(String str, String str2) {
        if (str2 == null) {
            throw new IllegalArgumentException("Parameter resourcePath is empty");
        }
        this.f504 = str;
        this.f505 = str2;
        this.f503 = null;
    }

    @Override // com.amazonaws.auth.Signer
    public final void sign(Request request, AWSCredentials aWSCredentials) {
        String str = this.f505;
        if (str == null) {
            throw new UnsupportedOperationException("Cannot sign a request using a dummy S3Signer instance with no resource path");
        }
        String strMo207 = aWSCredentials.mo207();
        Log log = f502;
        if (strMo207 == null) {
            log.mo294("Canonical string will not be signed, as no AWS Secret Key was provided");
            return;
        }
        AWSCredentials aWSCredentialsSanitizeCredentials = sanitizeCredentials(aWSCredentials);
        if (aWSCredentialsSanitizeCredentials instanceof AWSSessionCredentials) {
            addSessionCredentials(request, (AWSSessionCredentials) aWSCredentialsSanitizeCredentials);
        }
        DefaultRequest defaultRequest = (DefaultRequest) request;
        String strM774 = HttpUtils.m774(defaultRequest.m188().getPath(), str, true);
        Date signatureDate = getSignatureDate(getTimeOffset(defaultRequest));
        int i = ServiceUtils.f512;
        defaultRequest.m182("Date", DateUtils.m767("EEE, dd MMM yyyy HH:mm:ss z", signatureDate));
        String strM473 = RestUtils.m473(this.f504, strM774, defaultRequest, this.f503);
        log.mo294("Calculated string to sign:\n\"" + strM473 + "\"");
        defaultRequest.m182("Authorization", "AWS " + aWSCredentialsSanitizeCredentials.mo206() + ":" + super.signAndBase64Encode(strM473, aWSCredentialsSanitizeCredentials.mo207(), SigningAlgorithm.HmacSHA1));
    }

    @Override // com.amazonaws.auth.AbstractAWSSigner
    public final void addSessionCredentials(Request request, AWSSessionCredentials aWSSessionCredentials) {
        ((DefaultRequest) request).m182("x-amz-security-token", aWSSessionCredentials.mo209());
    }
}
