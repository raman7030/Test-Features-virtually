package com.amazonaws.auth;

import com.alipay.sdk.p010m.p055w.C0233a;
import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.SDKGlobalConfiguration;
import com.amazonaws.internal.SdkDigestInputStream;
import com.amazonaws.util.Base64;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.HttpUtils;
import com.amazonaws.util.StringUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URI;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;
import p067l.C20778;
import p067l.C9179;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractAWSSigner implements Signer {
    public static final int BUFFER_SIZE_MULTIPLIER = 5;
    public static final int DEFAULT_BUFFER_SIZE = 1024;
    public static final int TIME_MILLISEC = 1000;
    public static final ThreadLocal SHA256_MESSAGE_DIGEST = new ThreadLocal() { // from class: com.amazonaws.auth.AbstractAWSSigner.1
        @Override // java.lang.ThreadLocal
        public final Object initialValue() {
            try {
                return MessageDigest.getInstance(XMSSKeyParameters.SHA_256);
            } catch (NoSuchAlgorithmException e) {
                throw new AmazonClientException("Unable to get SHA256 Function" + e.getMessage(), e);
            }
        }
    };
    public static final String EMPTY_STRING_SHA256_HEX = BinaryUtils.m1915(m1377(""));

    public abstract void addSessionCredentials(Request request, AWSSessionCredentials aWSSessionCredentials);

    public String signAndBase64Encode(String str, String str2, SigningAlgorithm signingAlgorithm) {
        return signAndBase64Encode(str.getBytes(StringUtils.f2004), str2, signingAlgorithm);
    }

    public String signAndBase64Encode(byte[] bArr, String str, SigningAlgorithm signingAlgorithm) {
        try {
            return Base64.m1909(sign(bArr, str.getBytes(StringUtils.f2004), signingAlgorithm));
        } catch (Exception e) {
            throw new AmazonClientException(C20778.m46923(e, new StringBuilder("Unable to calculate a request signature: ")), e);
        }
    }

    public byte[] sign(String str, byte[] bArr, SigningAlgorithm signingAlgorithm) {
        try {
            return sign(str.getBytes(StringUtils.f2004), bArr, signingAlgorithm);
        } catch (Exception e) {
            throw new AmazonClientException(C20778.m46923(e, new StringBuilder("Unable to calculate a request signature: ")), e);
        }
    }

    public byte[] sign(byte[] bArr, byte[] bArr2, SigningAlgorithm signingAlgorithm) {
        try {
            Mac mac = Mac.getInstance(signingAlgorithm.toString());
            mac.init(new SecretKeySpec(bArr2, signingAlgorithm.toString()));
            return mac.doFinal(bArr);
        } catch (Exception e) {
            throw new AmazonClientException(C20778.m46923(e, new StringBuilder("Unable to calculate a request signature: ")), e);
        }
    }

    public byte[] hash(String str) {
        return m1377(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m1377(String str) {
        try {
            MessageDigest messageDigestM1376 = m1376();
            messageDigestM1376.update(str.getBytes(StringUtils.f2004));
            return messageDigestM1376.digest();
        } catch (Exception e) {
            throw new AmazonClientException(C20778.m46923(e, new StringBuilder("Unable to compute hash while signing request: ")), e);
        }
    }

    public byte[] hash(InputStream inputStream) {
        try {
            SdkDigestInputStream sdkDigestInputStream = new SdkDigestInputStream(inputStream, m1376());
            while (sdkDigestInputStream.read(new byte[1024]) > -1) {
            }
            return sdkDigestInputStream.getMessageDigest().digest();
        } catch (Exception e) {
            throw new AmazonClientException(C20778.m46923(e, new StringBuilder("Unable to compute hash while signing request: ")), e);
        }
    }

    public byte[] hash(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(XMSSKeyParameters.SHA_256);
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (Exception e) {
            throw new AmazonClientException(C20778.m46923(e, new StringBuilder("Unable to compute hash while signing request: ")), e);
        }
    }

    public String getCanonicalizedQueryString(Map map) {
        TreeMap treeMap = new TreeMap();
        for (Map.Entry entry : map.entrySet()) {
            treeMap.put(HttpUtils.m1940((String) entry.getKey(), false), HttpUtils.m1940((String) entry.getValue(), false));
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = treeMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            sb.append((String) entry2.getKey());
            sb.append("=");
            sb.append((String) entry2.getValue());
            if (it.hasNext()) {
                sb.append(C0233a.f1084p);
            }
        }
        return sb.toString();
    }

    public String getCanonicalizedQueryString(Request request) {
        return HttpUtils.m1942(request) ? "" : getCanonicalizedQueryString(((DefaultRequest) request).m1356());
    }

    public byte[] getBinaryRequestPayload(Request request) {
        if (HttpUtils.m1942(request)) {
            String strM1938 = HttpUtils.m1938(request);
            return strM1938 == null ? new byte[0] : strM1938.getBytes(StringUtils.f2004);
        }
        return getBinaryRequestPayloadWithoutQueryParams(request);
    }

    public String getRequestPayload(Request request) {
        return newString(getBinaryRequestPayload(request));
    }

    public String getRequestPayloadWithoutQueryParams(Request request) {
        return newString(getBinaryRequestPayloadWithoutQueryParams(request));
    }

    public byte[] getBinaryRequestPayloadWithoutQueryParams(Request request) {
        InputStream binaryRequestPayloadStreamWithoutQueryParams = getBinaryRequestPayloadStreamWithoutQueryParams(request);
        try {
            binaryRequestPayloadStreamWithoutQueryParams.mark(-1);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[5120];
            while (true) {
                int i = binaryRequestPayloadStreamWithoutQueryParams.read(bArr);
                if (i == -1) {
                    byteArrayOutputStream.close();
                    binaryRequestPayloadStreamWithoutQueryParams.reset();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
        } catch (Exception e) {
            throw new AmazonClientException(C20778.m46923(e, new StringBuilder("Unable to read request payload to sign request: ")), e);
        }
    }

    public InputStream getBinaryRequestPayloadStream(Request request) {
        if (HttpUtils.m1942(request)) {
            String strM1938 = HttpUtils.m1938(request);
            if (strM1938 == null) {
                return new ByteArrayInputStream(new byte[0]);
            }
            return new ByteArrayInputStream(strM1938.getBytes(StringUtils.f2004));
        }
        return getBinaryRequestPayloadStreamWithoutQueryParams(request);
    }

    public InputStream getBinaryRequestPayloadStreamWithoutQueryParams(Request request) {
        try {
            DefaultRequest defaultRequest = (DefaultRequest) request;
            InputStream inputStreamM1343 = defaultRequest.m1343();
            if (inputStreamM1343 == null) {
                return new ByteArrayInputStream(new byte[0]);
            }
            if (inputStreamM1343.markSupported()) {
                return defaultRequest.m1343();
            }
            throw new AmazonClientException("Unable to read request payload to sign request.");
        } catch (Exception e) {
            throw new AmazonClientException(C20778.m46923(e, new StringBuilder("Unable to read request payload to sign request: ")), e);
        }
    }

    public String getCanonicalizedResourcePath(String str) {
        return getCanonicalizedResourcePath(str, true);
    }

    public String getCanonicalizedResourcePath(String str, boolean z) {
        if (str == null || str.length() == 0) {
            return "/";
        }
        if (z) {
            str = HttpUtils.m1940(str, true);
        }
        return str.startsWith("/") ? str : "/".concat(str);
    }

    public String getCanonicalizedEndpoint(URI uri) {
        String strM1954 = StringUtils.m1954(uri.getHost());
        if (!HttpUtils.m1941(uri)) {
            return strM1954;
        }
        StringBuilder sbM21133 = C9179.m21133(strM1954, ":");
        sbM21133.append(uri.getPort());
        return sbM21133.toString();
    }

    public AWSCredentials sanitizeCredentials(AWSCredentials aWSCredentials) {
        String strMo1372;
        String strMo1373;
        String strMo1375;
        synchronized (aWSCredentials) {
            strMo1372 = aWSCredentials.mo1372();
            strMo1373 = aWSCredentials.mo1373();
            strMo1375 = aWSCredentials instanceof AWSSessionCredentials ? ((AWSSessionCredentials) aWSCredentials).mo1375() : null;
        }
        if (strMo1373 != null) {
            strMo1373 = strMo1373.trim();
        }
        if (strMo1372 != null) {
            strMo1372 = strMo1372.trim();
        }
        if (strMo1375 != null) {
            strMo1375 = strMo1375.trim();
        }
        if (aWSCredentials instanceof AWSSessionCredentials) {
            return new BasicSessionCredentials(strMo1372, strMo1373, strMo1375);
        }
        return new BasicAWSCredentials(strMo1372, strMo1373);
    }

    public String newString(byte[] bArr) {
        return new String(bArr, StringUtils.f2004);
    }

    public Date getSignatureDate(long j) {
        Date date = new Date();
        return j != 0 ? new Date(date.getTime() - (j * 1000)) : date;
    }

    public long getTimeOffset(Request request) {
        ((DefaultRequest) request).getClass();
        if (SDKGlobalConfiguration.m1365() != 0) {
            return SDKGlobalConfiguration.m1365();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ֫ */
    public static MessageDigest m1376() {
        MessageDigest messageDigest = (MessageDigest) SHA256_MESSAGE_DIGEST.get();
        messageDigest.reset();
        return messageDigest;
    }
}
