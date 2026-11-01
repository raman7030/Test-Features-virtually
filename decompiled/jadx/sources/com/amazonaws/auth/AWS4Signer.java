package com.amazonaws.auth;

import com.alipay.sdk.p010m.p037n.C0172c;
import com.alipay.sdk.p010m.p058y.C0249l;
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
import org.simpleframework.xml.core.AnnotationHandler;
import p067l.C10965;
import p067l.C21466;
import p067l.C24420;
import p067l.C5633;
import p067l.C9179;

/* JADX INFO: loaded from: classes.dex */
public class AWS4Signer extends AbstractAWSSigner implements ServiceAwareSigner, RegionAwareSigner {
    public static final String ALGORITHM = "AWS4-HMAC-SHA256";
    public static final String DATE_PATTERN = "yyyyMMdd";
    public static final long MAX_EXPIRATION_TIME_IN_SECONDS = 604800;
    public static final long MILLISEC = 1000;
    public static final String TERMINATOR = "aws4_request";
    public static final String TIME_PATTERN = "yyyyMMdd'T'HHmmss'Z'";
    public static final Log log = LogFactory.m1468(AWS4Signer.class);
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
        defaultRequest.m1348("X-Amz-Date", timeStamp);
        if (defaultRequest.m1357().get("x-amz-content-sha256") != null && AnnotationHandler.REQUIRED.equals(defaultRequest.m1357().get("x-amz-content-sha256"))) {
            defaultRequest.m1348("x-amz-content-sha256", strCalculateContentHash);
        }
        String str = aWSCredentialsSanitizeCredentials.mo1372() + "/" + scope;
        HeaderSigningResult headerSigningResultComputeSignature = computeSignature(defaultRequest, dateStamp, timeStamp, ALGORITHM, strCalculateContentHash, aWSCredentialsSanitizeCredentials);
        String strM48631 = C21466.m48631("Credential=", str);
        String str2 = "SignedHeaders=" + getSignedHeadersString(defaultRequest);
        String str3 = "Signature=" + BinaryUtils.m1915(headerSigningResultComputeSignature.m1371());
        StringBuilder sbM12525 = C5633.m12525("AWS4-HMAC-SHA256 ", strM48631, ", ", str2, ", ");
        sbM12525.append(str3);
        defaultRequest.m1348("Authorization", sbM12525.toString());
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
        ((DefaultRequest) request).m1348("x-amz-security-token", aWSSessionCredentials.mo1375());
    }

    public String extractRegionName(URI uri) {
        String str = this.regionName;
        return str != null ? str : AwsHostNameUtils.m1904(uri.getHost(), this.serviceName);
    }

    public String extractServiceName(URI uri) {
        String str = this.serviceName;
        return str != null ? str : AwsHostNameUtils.m1905(uri);
    }

    public void overrideDate(Date date) {
        this.overriddenDate = date;
    }

    public String getCanonicalizedHeaderString(Request request) {
        ArrayList<String> arrayList = new ArrayList();
        DefaultRequest defaultRequest = (DefaultRequest) request;
        arrayList.addAll(defaultRequest.m1357().keySet());
        Collections.sort(arrayList, String.CASE_INSENSITIVE_ORDER);
        StringBuilder sb = new StringBuilder();
        for (String str : arrayList) {
            if (needsSign(str)) {
                String strReplaceAll = StringUtils.m1954(str).replaceAll("\\s+", " ");
                String str2 = (String) defaultRequest.m1357().get(str);
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
        arrayList.addAll(((DefaultRequest) request).m1357().keySet());
        Collections.sort(arrayList, String.CASE_INSENSITIVE_ORDER);
        StringBuilder sb = new StringBuilder();
        for (String str : arrayList) {
            if (needsSign(str)) {
                if (sb.length() > 0) {
                    sb.append(C0249l.f1196b);
                }
                sb.append(StringUtils.m1954(str));
            }
        }
        return sb.toString();
    }

    public String getCanonicalRequest(Request request, String str) {
        request.getClass();
        DefaultRequest defaultRequest = (DefaultRequest) request;
        String strM1939 = HttpUtils.m1939(defaultRequest.m1354().getPath(), defaultRequest.m1361(), false);
        StringBuilder sb = new StringBuilder();
        sb.append(defaultRequest.m1359().toString());
        sb.append("\n");
        sb.append(getCanonicalizedResourcePath(strM1939, this.doubleUrlEncode));
        sb.append("\n");
        sb.append(getCanonicalizedQueryString(request));
        sb.append("\n");
        sb.append(getCanonicalizedHeaderString(request));
        sb.append("\n");
        String strM53894 = C24420.m53894(sb, getSignedHeadersString(request), "\n", str);
        log.mo1460("AWS4 Canonical Request: '\"" + strM53894 + "\"");
        return strM53894;
    }

    public String getStringToSign(String str, String str2, String str3, String str4) {
        String str5 = str + "\n" + str2 + "\n" + str3 + "\n" + BinaryUtils.m1915(hash(str4));
        log.mo1460("AWS4 String to Sign: '\"" + str5 + "\"");
        return str5;
    }

    public final HeaderSigningResult computeSignature(Request request, String str, String str2, String str3, String str4, AWSCredentials aWSCredentials) {
        DefaultRequest defaultRequest = (DefaultRequest) request;
        String strExtractRegionName = extractRegionName(defaultRequest.m1354());
        String strExtractServiceName = extractServiceName(defaultRequest.m1354());
        String str5 = str + "/" + strExtractRegionName + "/" + strExtractServiceName + "/aws4_request";
        String stringToSign = getStringToSign(str3, str2, str5, getCanonicalRequest(defaultRequest, str4));
        String str6 = "AWS4" + aWSCredentials.mo1373();
        Charset charset = StringUtils.f2004;
        byte[] bytes = str6.getBytes(charset);
        SigningAlgorithm signingAlgorithm = SigningAlgorithm.HmacSHA256;
        byte[] bArrSign = sign(TERMINATOR, sign(strExtractServiceName, sign(strExtractRegionName, sign(str, bytes, signingAlgorithm), signingAlgorithm), signingAlgorithm), signingAlgorithm);
        return new HeaderSigningResult(str2, str5, bArrSign, sign(stringToSign.getBytes(charset), bArrSign, signingAlgorithm));
    }

    public final String getTimeStamp(long j) {
        return DateUtils.m1932(TIME_PATTERN, new Date(j));
    }

    public final String getDateStamp(long j) {
        return DateUtils.m1932(DATE_PATTERN, new Date(j));
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
        String host = defaultRequest.m1354().getHost();
        if (HttpUtils.m1941(defaultRequest.m1354())) {
            StringBuilder sbM21133 = C9179.m21133(host, ":");
            sbM21133.append(defaultRequest.m1354().getPort());
            host = sbM21133.toString();
        }
        defaultRequest.m1348("Host", host);
    }

    public String getScope(Request request, String str) {
        DefaultRequest defaultRequest = (DefaultRequest) request;
        return str + "/" + extractRegionName(defaultRequest.m1354()) + "/" + extractServiceName(defaultRequest.m1354()) + "/aws4_request";
    }

    public String calculateContentHash(Request request) {
        InputStream binaryRequestPayloadStream = getBinaryRequestPayloadStream(request);
        binaryRequestPayloadStream.mark(-1);
        String strM1915 = BinaryUtils.m1915(hash(binaryRequestPayloadStream));
        try {
            binaryRequestPayloadStream.reset();
            return strM1915;
        } catch (IOException e) {
            throw new AmazonClientException("Unable to reset stream after calculating AWS4 signature", e);
        }
    }

    public class HeaderSigningResult {

        /* JADX INFO: renamed from: ֫ */
        public final String f1280;

        /* JADX INFO: renamed from: ۧ */
        public final byte[] f1281;

        /* JADX INFO: renamed from: ܽ */
        public final String f1282;

        /* JADX INFO: renamed from: ᩳ */
        public final byte[] f1283;

        public HeaderSigningResult(String str, String str2, byte[] bArr, byte[] bArr2) {
            this.f1280 = str;
            this.f1282 = str2;
            this.f1281 = bArr;
            this.f1283 = bArr2;
        }

        /* JADX INFO: renamed from: ֫ */
        public final String m1368() {
            return this.f1280;
        }

        /* JADX INFO: renamed from: ܽ */
        public final String m1370() {
            return this.f1282;
        }

        /* JADX INFO: renamed from: ۧ */
        public final byte[] m1369() {
            byte[] bArr = this.f1281;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }

        /* JADX INFO: renamed from: ᩳ */
        public final byte[] m1371() {
            byte[] bArr = this.f1283;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
    }

    public void presignRequest(Request request, AWSCredentials aWSCredentials, Date date) {
        long time = date != null ? (date.getTime() - System.currentTimeMillis()) / 1000 : 604800L;
        if (time > MAX_EXPIRATION_TIME_IN_SECONDS) {
            throw new AmazonClientException(C10965.m25286(new StringBuilder("Requests that are pre-signed by SigV4 algorithm are valid for at most 7 days. The expiration date set on the current request ["), getTimeStamp(date.getTime()), "] has exceeded this limit."));
        }
        addHostHeader(request);
        AWSCredentials aWSCredentialsSanitizeCredentials = sanitizeCredentials(aWSCredentials);
        if (aWSCredentialsSanitizeCredentials instanceof AWSSessionCredentials) {
            ((DefaultRequest) request).m1355("X-Amz-Security-Token", ((AWSSessionCredentials) aWSCredentialsSanitizeCredentials).mo1375());
        }
        long dateFromRequest = getDateFromRequest(request);
        String dateStamp = getDateStamp(dateFromRequest);
        String str = aWSCredentialsSanitizeCredentials.mo1372() + "/" + getScope(request, dateStamp);
        String timeStamp = getTimeStamp(dateFromRequest);
        DefaultRequest defaultRequest = (DefaultRequest) request;
        defaultRequest.m1355("X-Amz-Algorithm", ALGORITHM);
        defaultRequest.m1355("X-Amz-Date", timeStamp);
        defaultRequest.m1355("X-Amz-SignedHeaders", getSignedHeadersString(defaultRequest));
        defaultRequest.m1355("X-Amz-Expires", Long.toString(time));
        defaultRequest.m1355("X-Amz-Credential", str);
        defaultRequest.m1355("X-Amz-Signature", BinaryUtils.m1915(computeSignature(defaultRequest, dateStamp, timeStamp, ALGORITHM, calculateContentHashPresign(defaultRequest), aWSCredentialsSanitizeCredentials).m1371()));
    }

    public String calculateContentHashPresign(Request request) {
        return calculateContentHash(request);
    }

    public boolean needsSign(String str) {
        return "date".equalsIgnoreCase(str) || "Content-MD5".equalsIgnoreCase(str) || C0172c.f710f.equalsIgnoreCase(str) || str.startsWith("x-amz") || str.startsWith("X-Amz");
    }
}
