package com.amazonaws.http;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Response;
import com.amazonaws.auth.AWS4Signer;
import com.amazonaws.handlers.CredentialsRequestHandler;
import com.amazonaws.handlers.RequestHandler2;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.retry.RetryPolicy;
import com.amazonaws.services.p061s3.internal.S3ExecutionContext;
import com.amazonaws.util.AWSRequestMetrics;
import com.amazonaws.util.DateUtils;
import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class AmazonHttpClient {

    /* JADX INFO: renamed from: ֫ */
    public final ClientConfiguration f1340;

    /* JADX INFO: renamed from: ۧ */
    public final UrlHttpClient f1341;

    /* JADX INFO: renamed from: ܽ */
    public final HttpRequestFactory f1342 = new HttpRequestFactory();

    /* JADX INFO: renamed from: ᩳ */
    public static final Log f1339 = LogFactory.m1469("com.amazonaws.request");

    /* JADX INFO: renamed from: ܿ */
    public static final Log f1338 = LogFactory.m1468(AmazonHttpClient.class);

    public AmazonHttpClient(ClientConfiguration clientConfiguration, UrlHttpClient urlHttpClient) {
        this.f1340 = clientConfiguration;
        this.f1341 = urlHttpClient;
    }

    /* JADX INFO: renamed from: ֫ */
    public final Response m1418(DefaultRequest defaultRequest, HttpResponseHandler httpResponseHandler, HttpResponseHandler httpResponseHandler2, S3ExecutionContext s3ExecutionContext) {
        List<RequestHandler2> listM1423 = s3ExecutionContext.m1423();
        if (listM1423 == null) {
            listM1423 = Collections.EMPTY_LIST;
        } else {
            for (RequestHandler2 requestHandler2 : listM1423) {
                if (requestHandler2 instanceof CredentialsRequestHandler) {
                    ((CredentialsRequestHandler) requestHandler2).m1400(s3ExecutionContext.m1422());
                }
                requestHandler2.mo1407(defaultRequest);
            }
        }
        AWSRequestMetrics aWSRequestMetricsM1420 = s3ExecutionContext.m1420();
        try {
            Response responseM1419 = m1419(defaultRequest, httpResponseHandler, httpResponseHandler2, s3ExecutionContext);
            aWSRequestMetricsM1420.m1896().mo1955();
            Iterator it = listM1423.iterator();
            while (it.hasNext()) {
                ((RequestHandler2) it.next()).mo1409(defaultRequest, responseM1419);
            }
            return responseM1419;
        } catch (AmazonClientException e) {
            Iterator it2 = listM1423.iterator();
            while (it2.hasNext()) {
                ((RequestHandler2) it2.next()).mo1408(defaultRequest, e);
            }
            throw e;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 12691. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ۧ */
    public final com.amazonaws.Response m1419(com.amazonaws.DefaultRequest r29, com.amazonaws.http.HttpResponseHandler r30, com.amazonaws.http.HttpResponseHandler r31, com.amazonaws.services.p061s3.internal.S3ExecutionContext r32) {
        /*
            Method dump skipped, instruction units count: 1269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.http.AmazonHttpClient.m1419(com.amazonaws.DefaultRequest, com.amazonaws.http.HttpResponseHandler, com.amazonaws.http.HttpResponseHandler, com.amazonaws.services.s3.internal.S3ExecutionContext):com.amazonaws.Response");
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m1415(DefaultRequest defaultRequest, Exception exc) {
        if (defaultRequest.m1343() == null) {
            return;
        }
        if (!defaultRequest.m1343().markSupported()) {
            throw new AmazonClientException("Encountered an exception and stream is not resettable", exc);
        }
        try {
            defaultRequest.m1343().reset();
        } catch (IOException unused) {
            throw new AmazonClientException("Encountered an exception and couldn't reset the stream to retry", exc);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m1414(String str, String str2) {
        if (str.contains(str2)) {
            return str;
        }
        return str.trim() + " " + str2.trim();
    }

    public final void finalize() throws Throwable {
        this.f1341.getClass();
        super.finalize();
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m1416(AmazonWebServiceRequest amazonWebServiceRequest, InputStream inputStream, AmazonClientException amazonClientException, int i, RetryPolicy retryPolicy) {
        int i2 = i - 1;
        this.f1340.getClass();
        if (i2 < retryPolicy.m1596()) {
            if (inputStream != null && !inputStream.markSupported()) {
                Log log = f1338;
                if (log.mo1459()) {
                    log.mo1460("Content not repeatable");
                }
            } else {
                return retryPolicy.m1597().mo1594(amazonClientException, i2);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m1417(HttpResponse httpResponse) {
        int iM1436 = httpResponse.m1436();
        String str = (String) httpResponse.m1433().get("Location");
        return (iM1436 != 307 || str == null || str.isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static Object m1413(HttpResponseHandler httpResponseHandler, HttpResponse httpResponse, S3ExecutionContext s3ExecutionContext) throws IOException {
        try {
            AWSRequestMetrics aWSRequestMetricsM1420 = s3ExecutionContext.m1420();
            AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ResponseProcessingTime;
            aWSRequestMetricsM1420.mo1901(field);
            try {
                AmazonWebServiceResponse amazonWebServiceResponse = (AmazonWebServiceResponse) httpResponseHandler.mo1442(httpResponse);
                aWSRequestMetricsM1420.mo1897(field);
                if (amazonWebServiceResponse == null) {
                    throw new RuntimeException("Unable to unmarshall response metadata. Response Code: " + httpResponse.m1436() + ", Response Text: " + httpResponse.m1435());
                }
                Log log = f1339;
                if (log.mo1459()) {
                    log.mo1460("Received successful response: " + httpResponse.m1436() + ", AWS Request ID: " + amazonWebServiceResponse.m1329());
                }
                aWSRequestMetricsM1420.mo1899(AWSRequestMetrics.Field.AWSRequestID, amazonWebServiceResponse.m1329());
                return amazonWebServiceResponse.m1332();
            } catch (Throwable th) {
                aWSRequestMetricsM1420.mo1897(AWSRequestMetrics.Field.ResponseProcessingTime);
                throw th;
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new AmazonClientException("Unable to unmarshall response (" + e2.getMessage() + "). Response Code: " + httpResponse.m1436() + ", Response Text: " + httpResponse.m1435(), e2);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static AmazonServiceException m1412(DefaultRequest defaultRequest, HttpResponseHandler httpResponseHandler, HttpResponse httpResponse) throws IOException {
        AmazonServiceException amazonServiceException;
        int iM1436 = httpResponse.m1436();
        try {
            amazonServiceException = (AmazonServiceException) httpResponseHandler.mo1442(httpResponse);
            f1339.mo1460("Received error response: " + amazonServiceException.toString());
        } catch (Exception e) {
            if (iM1436 == 413) {
                amazonServiceException = new AmazonServiceException("Request entity too large");
                amazonServiceException.m1317(defaultRequest.m1352());
                amazonServiceException.m1310(413);
                AmazonServiceException.ErrorType errorType = AmazonServiceException.ErrorType.Client;
                amazonServiceException.m1311("Request entity too large");
            } else if (iM1436 == 503 && "Service Unavailable".equalsIgnoreCase(httpResponse.m1435())) {
                amazonServiceException = new AmazonServiceException("Service unavailable");
                amazonServiceException.m1317(defaultRequest.m1352());
                amazonServiceException.m1310(503);
                AmazonServiceException.ErrorType errorType2 = AmazonServiceException.ErrorType.Client;
                amazonServiceException.m1311("Service unavailable");
            } else {
                if (e instanceof IOException) {
                    throw ((IOException) e);
                }
                throw new AmazonClientException("Unable to unmarshall error response (" + e.getMessage() + "). Response Code: " + iM1436 + ", Response Text: " + httpResponse.m1435() + ", Response Headers: " + httpResponse.m1433(), e);
            }
        }
        amazonServiceException.m1310(iM1436);
        amazonServiceException.m1317(defaultRequest.m1352());
        amazonServiceException.fillInStackTrace();
        return amazonServiceException;
    }

    /* JADX INFO: renamed from: ֫ */
    public static long m1410(AmazonWebServiceRequest amazonWebServiceRequest, AmazonClientException amazonClientException, int i, RetryPolicy retryPolicy) {
        int i2 = i - 2;
        long jMo1593 = retryPolicy.m1595().mo1593(i2);
        Log log = f1338;
        if (log.mo1459()) {
            log.mo1460("Retriable error detected, will retry in " + jMo1593 + "ms, attempt number: " + i2);
        }
        try {
            Thread.sleep(jMo1593);
            return jMo1593;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new AmazonClientException(e.getMessage(), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0024 A[Catch: RuntimeException -> 0x005c, TRY_ENTER, TryCatch #1 {RuntimeException -> 0x005c, blocks: (B:4:0x0014, B:11:0x0024, B:13:0x0036, B:15:0x0041, B:14:0x003b), top: B:26:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:13:0x0036 A[Catch: RuntimeException -> 0x005c, TryCatch #1 {RuntimeException -> 0x005c, blocks: (B:4:0x0014, B:11:0x0024, B:13:0x0036, B:15:0x0041, B:14:0x003b), top: B:26:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:14:0x003b A[Catch: RuntimeException -> 0x005c, TryCatch #1 {RuntimeException -> 0x005c, blocks: (B:4:0x0014, B:11:0x0024, B:13:0x0036, B:15:0x0041, B:14:0x003b), top: B:26:0x0014 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.StringBuilder] */
    /* JADX INFO: renamed from: ֫ */
    public static long m1411(HttpResponse httpResponse, AmazonServiceException amazonServiceException) {
        Date dateM1934;
        String message;
        int iIndexOf;
        Date date = new Date();
        ?? r4 = (String) httpResponse.m1433().get("Date");
        ?? r1 = 0;
        try {
            if (r4 != 0) {
                try {
                    if (!r4.isEmpty()) {
                        dateM1934 = DateUtils.m1934("EEE, dd MMM yyyy HH:mm:ss z", (String) r4);
                    } else {
                        message = amazonServiceException.getMessage();
                        int iIndexOf2 = message.indexOf(MotionUtils.EASING_TYPE_FORMAT_START);
                        if (message.contains(" + 15")) {
                            iIndexOf = message.indexOf(" + 15");
                        } else {
                            iIndexOf = message.indexOf(" - 15");
                        }
                        dateM1934 = DateUtils.m1934(AWS4Signer.TIME_PATTERN, message.substring(iIndexOf2 + 1, iIndexOf));
                    }
                } catch (RuntimeException e) {
                    e = e;
                    f1338.mo1464("Unable to parse clock skew offset from response: " + r1, e);
                    return 0L;
                }
            } else {
                message = amazonServiceException.getMessage();
                int iIndexOf3 = message.indexOf(MotionUtils.EASING_TYPE_FORMAT_START);
                if (message.contains(" + 15")) {
                    iIndexOf = message.indexOf(" + 15");
                } else {
                    iIndexOf = message.indexOf(" - 15");
                }
                dateM1934 = DateUtils.m1934(AWS4Signer.TIME_PATTERN, message.substring(iIndexOf3 + 1, iIndexOf));
            }
            long time = date.getTime() - dateM1934.getTime();
            r4 = 1000;
            return time / 1000;
        } catch (RuntimeException e2) {
            e = e2;
            r1 = r4;
        }
    }
}
