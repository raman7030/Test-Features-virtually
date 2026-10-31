package com.amazonaws.auth;

import com.alipay.sdk.m.n.c;
import com.alipay.sdk.m.y.l;
import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.util.AwsHostNameUtils;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.HttpUtils;
import com.amazonaws.util.StringUtils;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import l.C20094;
import l.C23202;
import l.C3435;
import l.C7166;
import l.C9045;
import org.simpleframework.xml.core.AnnotationHandler;

/* JADX INFO: loaded from: classes.dex */
public class AWS4Signer extends AbstractAWSSigner implements ServiceAwareSigner, RegionAwareSigner {
    public static final String ALGORITHM = "AWS4-HMAC-SHA256";
    public static final String DATE_PATTERN = "yyyyMMdd";
    public static final long MAX_EXPIRATION_TIME_IN_SECONDS = 604800;
    public static final long MILLISEC = 1000;
    public static final String TERMINATOR = "aws4_request";
    public static final String TIME_PATTERN = "yyyyMMdd'T'HHmmss'Z'";
    public static final Log log = LogFactory.m302(AWS4Signer.class);
    public boolean doubleUrlEncode;
    public Date overriddenDate;
    public String regionName;
    public String serviceName;

    public void processRequestPayload(Request request, HeaderSigningResult headerSigningResult) {
    }

    public AWS4Signer() {
        this(true);
    }

    public AWS4Signer(boolean z) {
        this.doubleUrlEncode = z;
    }

    @Override // com.amazonaws.auth.Signer
    public void sign(Request request, AWSCredentials aWSCredentials) {
        AWSCredentials aWSCredentialsSanitizeCredentials = sanitizeCredentials(aWSCredentials);
        if (aWSCredentialsSanitizeCredentials instanceof AWSSessionCredentials) {
            addSessionCredentials(request, (AWSSessionCredentials) aWSCredentialsSanitizeCredentials);
        }
        addHostHeader(request);
        long dateFromRequest = getDateFromRequest(request);
        String dateStamp = getDateStamp(dateFromRequest);
        String scope = getScope(request, dateStamp);
        String strCalculateContentHash = calculateContentHash(request);
        String timeStamp = getTimeStamp(dateFromRequest);
        DefaultRequest defaultRequest = (DefaultRequest) request;
        defaultRequest.m182("X-Amz-Date", timeStamp);
        if (defaultRequest.m191().get("x-amz-content-sha256") != null && AnnotationHandler.REQUIRED.equals(defaultRequest.m191().get("x-amz-content-sha256"))) {
            defaultRequest.m182("x-amz-content-sha256", strCalculateContentHash);
        }
        String str = aWSCredentialsSanitizeCredentials.mo206() + "/" + scope;
        HeaderSigningResult headerSigningResultComputeSignature = computeSignature(defaultRequest, dateStamp, timeStamp, ALGORITHM, strCalculateContentHash, aWSCredentialsSanitizeCredentials);
        String strM46315 = C20094.m46315("Credential=", str);
        String str2 = "SignedHeaders=" + getSignedHeadersString(defaultRequest);
        String str3 = "Signature=" + BinaryUtils.m750(headerSigningResultComputeSignature.m205());
        StringBuilder sbM10501 = C3435.m10501("AWS4-HMAC-SHA256 ", strM46315, ", ", str2, ", ");
        sbM10501.append(str3);
        defaultRequest.m182("Authorization", sbM10501.toString());
        processRequestPayload(defaultRequest, headerSigningResultComputeSignature);
    }

    @Override // com.amazonaws.auth.ServiceAwareSigner
    public void setServiceName(String str) {
        this.serviceName = str;
    }

    @Override // com.amazonaws.auth.RegionAwareSigner
    public void setRegionName(String str) {
        this.regionName = str;
    }

    @Override // com.amazonaws.auth.AbstractAWSSigner
    public void addSessionCredentials(Request request, AWSSessionCredentials aWSSessionCredentials) {
        ((DefaultRequest) request).m182("x-amz-security-token", aWSSessionCredentials.mo209());
    }

    public String extractRegionName(URI uri) {
        String str = this.regionName;
        return str != null ? str : AwsHostNameUtils.m739(uri.getHost(), this.serviceName);
    }

    public String extractServiceName(URI uri) {
        String str = this.serviceName;
        return str != null ? str : AwsHostNameUtils.m740(uri);
    }

    public void overrideDate(Date date) {
        this.overriddenDate = date;
    }

    public String getCanonicalizedHeaderString(Request request) {
        ArrayList<String> arrayList = new ArrayList();
        DefaultRequest defaultRequest = (DefaultRequest) request;
        arrayList.addAll(defaultRequest.m191().keySet());
        Collections.sort(arrayList, String.CASE_INSENSITIVE_ORDER);
        StringBuilder sb = new StringBuilder();
        for (String str : arrayList) {
            if (needsSign(str)) {
                String strReplaceAll = StringUtils.m789(str).replaceAll("\\s+", " ");
                String str2 = (String) defaultRequest.m191().get(str);
                sb.append(strReplaceAll);
                sb.append(":");
                if (str2 != null) {
                    sb.append(str2.replaceAll("\\s+", " "));
                }
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public String getSignedHeadersString(Request request) {
        ArrayList<String> arrayList = new ArrayList();
        arrayList.addAll(((DefaultRequest) request).m191().keySet());
        Collections.sort(arrayList, String.CASE_INSENSITIVE_ORDER);
        StringBuilder sb = new StringBuilder();
        for (String str : arrayList) {
            if (needsSign(str)) {
                if (sb.length() > 0) {
                    sb.append(l.b);
                }
                sb.append(StringUtils.m789(str));
            }
        }
        return sb.toString();
    }

    public String getCanonicalRequest(Request request, String str) {
        request.getClass();
        DefaultRequest defaultRequest = (DefaultRequest) request;
        String strM774 = HttpUtils.m774(defaultRequest.m188().getPath(), defaultRequest.m195(), false);
        StringBuilder sb = new StringBuilder();
        sb.append(defaultRequest.m193().toString());
        sb.append("\n");
        sb.append(getCanonicalizedResourcePath(strM774, this.doubleUrlEncode));
        sb.append("\n");
        sb.append(getCanonicalizedQueryString(request));
        sb.append("\n");
        sb.append(getCanonicalizedHeaderString(request));
        sb.append("\n");
        String strM51498 = C23202.m51498(sb, getSignedHeadersString(request), "\n", str);
        log.mo294("AWS4 Canonical Request: '\"" + strM51498 + "\"");
        return strM51498;
    }

    public String getStringToSign(String str, String str2, String str3, String str4) {
        String str5 = str + "\n" + str2 + "\n" + str3 + "\n" + BinaryUtils.m750(hash(str4));
        log.mo294("AWS4 String to Sign: '\"" + str5 + "\"");
        return str5;
    }

    public final HeaderSigningResult computeSignature(Request request, String str, String str2, String str3, String str4, AWSCredentials aWSCredentials) {
        DefaultRequest defaultRequest = (DefaultRequest) request;
        String strExtractRegionName = extractRegionName(defaultRequest.m188());
        String strExtractServiceName = extractServiceName(defaultRequest.m188());
        String str5 = str + "/" + strExtractRegionName + "/" + strExtractServiceName + "/aws4_request";
        String stringToSign = getStringToSign(str3, str2, str5, getCanonicalRequest(defaultRequest, str4));
        String str6 = "AWS4" + aWSCredentials.mo207();
        Charset charset = StringUtils.f844;
        byte[] bytes = str6.getBytes(charset);
        SigningAlgorithm signingAlgorithm = SigningAlgorithm.HmacSHA256;
        byte[] bArrSign = sign(TERMINATOR, sign(strExtractServiceName, sign(strExtractRegionName, sign(str, bytes, signingAlgorithm), signingAlgorithm), signingAlgorithm), signingAlgorithm);
        return new HeaderSigningResult(str2, str5, bArrSign, sign(stringToSign.getBytes(charset), bArrSign, signingAlgorithm));
    }

    public final String getTimeStamp(long j) {
        return DateUtils.m767(TIME_PATTERN, new Date(j));
    }

    public final String getDateStamp(long j) {
        return DateUtils.m767(DATE_PATTERN, new Date(j));
    }

    public final long getDateFromRequest(Request request) {
        Date signatureDate = getSignatureDate(getTimeOffset(request));
        Date date = this.overriddenDate;
        if (date != null) {
            signatureDate = date;
        }
        return signatureDate.getTime();
    }

    public void addHostHeader(Request request) {
        DefaultRequest defaultRequest = (DefaultRequest) request;
        String host = defaultRequest.m188().getHost();
        if (HttpUtils.m776(defaultRequest.m188())) {
            StringBuilder sbM19190 = C7166.m19190(host, ":");
            sbM19190.append(defaultRequest.m188().getPort());
            host = sbM19190.toString();
        }
        defaultRequest.m182("Host", host);
    }

    public String getScope(Request request, String str) {
        DefaultRequest defaultRequest = (DefaultRequest) request;
        return str + "/" + extractRegionName(defaultRequest.m188()) + "/" + extractServiceName(defaultRequest.m188()) + "/aws4_request";
    }

    public String calculateContentHash(Request request) {
        InputStream binaryRequestPayloadStream = getBinaryRequestPayloadStream(request);
        binaryRequestPayloadStream.mark(-1);
        String strM750 = BinaryUtils.m750(hash(binaryRequestPayloadStream));
        try {
            binaryRequestPayloadStream.reset();
            return strM750;
        } catch (IOException e) {
            throw new AmazonClientException("Unable to reset stream after calculating AWS4 signature", e);
        }
    }

    public class HeaderSigningResult {

        /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
        public final String f120;

        /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
        public final byte[] f121;

        /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
        public final String f122;

        /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
        public final byte[] f123;

        public HeaderSigningResult(String str, String str2, byte[] bArr, byte[] bArr2) {
            this.f120 = str;
            this.f122 = str2;
            this.f121 = bArr;
            this.f123 = bArr2;
        }

        /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
        public final String m202() {
            return this.f120;
        }

        /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
        public final String m204() {
            return this.f122;
        }

        /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
        public final byte[] m203() {
            byte[] bArr = this.f121;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }

        /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
        public final byte[] m205() {
            byte[] bArr = this.f123;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
    }

    public void presignRequest(Request request, AWSCredentials aWSCredentials, Date date) {
        long time = date != null ? (date.getTime() - System.currentTimeMillis()) / 1000 : 604800L;
        if (time > MAX_EXPIRATION_TIME_IN_SECONDS) {
            throw new AmazonClientException(C9045.m23341(new StringBuilder("Requests that are pre-signed by SigV4 algorithm are valid for at most 7 days. The expiration date set on the current request ["), getTimeStamp(date.getTime()), "] has exceeded this limit."));
        }
        addHostHeader(request);
        AWSCredentials aWSCredentialsSanitizeCredentials = sanitizeCredentials(aWSCredentials);
        if (aWSCredentialsSanitizeCredentials instanceof AWSSessionCredentials) {
            ((DefaultRequest) request).m189("X-Amz-Security-Token", ((AWSSessionCredentials) aWSCredentialsSanitizeCredentials).mo209());
        }
        long dateFromRequest = getDateFromRequest(request);
        String dateStamp = getDateStamp(dateFromRequest);
        String str = aWSCredentialsSanitizeCredentials.mo206() + "/" + getScope(request, dateStamp);
        String timeStamp = getTimeStamp(dateFromRequest);
        DefaultRequest defaultRequest = (DefaultRequest) request;
        defaultRequest.m189("X-Amz-Algorithm", ALGORITHM);
        defaultRequest.m189("X-Amz-Date", timeStamp);
        defaultRequest.m189("X-Amz-SignedHeaders", getSignedHeadersString(defaultRequest));
        defaultRequest.m189("X-Amz-Expires", Long.toString(time));
        defaultRequest.m189("X-Amz-Credential", str);
        defaultRequest.m189("X-Amz-Signature", BinaryUtils.m750(computeSignature(defaultRequest, dateStamp, timeStamp, ALGORITHM, calculateContentHashPresign(defaultRequest), aWSCredentialsSanitizeCredentials).m205()));
    }

    public String calculateContentHashPresign(Request request) {
        return calculateContentHash(request);
    }

    public boolean needsSign(String str) {
        return "date".equalsIgnoreCase(str) || "Content-MD5".equalsIgnoreCase(str) || c.f.equalsIgnoreCase(str) || str.startsWith("x-amz") || str.startsWith("X-Amz");
    }
}
