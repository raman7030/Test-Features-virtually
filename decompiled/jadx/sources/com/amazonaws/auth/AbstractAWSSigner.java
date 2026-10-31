package com.amazonaws.auth;

import com.alipay.sdk.m.w.a;
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
import l.C19370;
import l.C7166;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

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
    public static final String EMPTY_STRING_SHA256_HEX = BinaryUtils.m750(m211(""));

    public abstract void addSessionCredentials(Request request, AWSSessionCredentials aWSSessionCredentials);

    public String signAndBase64Encode(String str, String str2, SigningAlgorithm signingAlgorithm) {
        return signAndBase64Encode(str.getBytes(StringUtils.f844), str2, signingAlgorithm);
    }

    public String signAndBase64Encode(byte[] bArr, String str, SigningAlgorithm signingAlgorithm) {
        try {
            return Base64.m744(sign(bArr, str.getBytes(StringUtils.f844), signingAlgorithm));
        } catch (Exception e) {
            throw new AmazonClientException(C19370.m44629(e, new StringBuilder("Unable to calculate a request signature: ")), e);
        }
    }

    public byte[] sign(String str, byte[] bArr, SigningAlgorithm signingAlgorithm) {
        try {
            return sign(str.getBytes(StringUtils.f844), bArr, signingAlgorithm);
        } catch (Exception e) {
            throw new AmazonClientException(C19370.m44629(e, new StringBuilder("Unable to calculate a request signature: ")), e);
        }
    }

    public byte[] sign(byte[] bArr, byte[] bArr2, SigningAlgorithm signingAlgorithm) {
        try {
            Mac mac = Mac.getInstance(signingAlgorithm.toString());
            mac.init(new SecretKeySpec(bArr2, signingAlgorithm.toString()));
            return mac.doFinal(bArr);
        } catch (Exception e) {
            throw new AmazonClientException(C19370.m44629(e, new StringBuilder("Unable to calculate a request signature: ")), e);
        }
    }

    public byte[] hash(String str) {
        return m211(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m211(String str) {
        try {
            MessageDigest messageDigestM210 = m210();
            messageDigestM210.update(str.getBytes(StringUtils.f844));
            return messageDigestM210.digest();
        } catch (Exception e) {
            throw new AmazonClientException(C19370.m44629(e, new StringBuilder("Unable to compute hash while signing request: ")), e);
        }
    }

    public byte[] hash(InputStream inputStream) {
        try {
            SdkDigestInputStream sdkDigestInputStream = new SdkDigestInputStream(inputStream, m210());
            while (sdkDigestInputStream.read(new byte[1024]) > -1) {
            }
            return sdkDigestInputStream.getMessageDigest().digest();
        } catch (Exception e) {
            throw new AmazonClientException(C19370.m44629(e, new StringBuilder("Unable to compute hash while signing request: ")), e);
        }
    }

    public byte[] hash(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(XMSSKeyParameters.SHA_256);
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (Exception e) {
            throw new AmazonClientException(C19370.m44629(e, new StringBuilder("Unable to compute hash while signing request: ")), e);
        }
    }

    public String getCanonicalizedQueryString(Map map) {
        TreeMap treeMap = new TreeMap();
        for (Map.Entry entry : map.entrySet()) {
            treeMap.put(HttpUtils.m775((String) entry.getKey(), false), HttpUtils.m775((String) entry.getValue(), false));
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = treeMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            sb.append((String) entry2.getKey());
            sb.append("=");
            sb.append((String) entry2.getValue());
            if (it.hasNext()) {
                sb.append(a.p);
            }
        }
        return sb.toString();
    }

    public String getCanonicalizedQueryString(Request request) {
        return HttpUtils.m777(request) ? "" : getCanonicalizedQueryString(((DefaultRequest) request).m190());
    }

    public byte[] getBinaryRequestPayload(Request request) {
        if (HttpUtils.m777(request)) {
            String strM773 = HttpUtils.m773(request);
            return strM773 == null ? new byte[0] : strM773.getBytes(StringUtils.f844);
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
            throw new AmazonClientException(C19370.m44629(e, new StringBuilder("Unable to read request payload to sign request: ")), e);
        }
    }

    public InputStream getBinaryRequestPayloadStream(Request request) {
        if (HttpUtils.m777(request)) {
            String strM773 = HttpUtils.m773(request);
            if (strM773 == null) {
                return new ByteArrayInputStream(new byte[0]);
            }
            return new ByteArrayInputStream(strM773.getBytes(StringUtils.f844));
        }
        return getBinaryRequestPayloadStreamWithoutQueryParams(request);
    }

    public InputStream getBinaryRequestPayloadStreamWithoutQueryParams(Request request) {
        try {
            DefaultRequest defaultRequest = (DefaultRequest) request;
            InputStream inputStreamM177 = defaultRequest.m177();
            if (inputStreamM177 == null) {
                return new ByteArrayInputStream(new byte[0]);
            }
            if (inputStreamM177.markSupported()) {
                return defaultRequest.m177();
            }
            throw new AmazonClientException("Unable to read request payload to sign request.");
        } catch (Exception e) {
            throw new AmazonClientException(C19370.m44629(e, new StringBuilder("Unable to read request payload to sign request: ")), e);
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
            str = HttpUtils.m775(str, true);
        }
        return str.startsWith("/") ? str : "/".concat(str);
    }

    public String getCanonicalizedEndpoint(URI uri) {
        String strM789 = StringUtils.m789(uri.getHost());
        if (!HttpUtils.m776(uri)) {
            return strM789;
        }
        StringBuilder sbM19190 = C7166.m19190(strM789, ":");
        sbM19190.append(uri.getPort());
        return sbM19190.toString();
    }

    public AWSCredentials sanitizeCredentials(AWSCredentials aWSCredentials) {
        String strMo206;
        String strMo207;
        String strMo209;
        synchronized (aWSCredentials) {
            strMo206 = aWSCredentials.mo206();
            strMo207 = aWSCredentials.mo207();
            strMo209 = aWSCredentials instanceof AWSSessionCredentials ? ((AWSSessionCredentials) aWSCredentials).mo209() : null;
        }
        if (strMo207 != null) {
            strMo207 = strMo207.trim();
        }
        if (strMo206 != null) {
            strMo206 = strMo206.trim();
        }
        if (strMo209 != null) {
            strMo209 = strMo209.trim();
        }
        if (aWSCredentials instanceof AWSSessionCredentials) {
            return new BasicSessionCredentials(strMo206, strMo207, strMo209);
        }
        return new BasicAWSCredentials(strMo206, strMo207);
    }

    public String newString(byte[] bArr) {
        return new String(bArr, StringUtils.f844);
    }

    public Date getSignatureDate(long j) {
        Date date = new Date();
        return j != 0 ? new Date(date.getTime() - (j * 1000)) : date;
    }

    public long getTimeOffset(Request request) {
        ((DefaultRequest) request).getClass();
        if (SDKGlobalConfiguration.m199() != 0) {
            return SDKGlobalConfiguration.m199();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static MessageDigest m210() {
        MessageDigest messageDigest = (MessageDigest) SHA256_MESSAGE_DIGEST.get();
        messageDigest.reset();
        return messageDigest;
    }
}
