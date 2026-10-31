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
import com.amazonaws.services.s3.internal.S3ExecutionContext;
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ClientConfiguration f180;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final UrlHttpClient f181;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final HttpRequestFactory f182 = new HttpRequestFactory();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final Log f179 = LogFactory.m303("com.amazonaws.request");

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final Log f178 = LogFactory.m302(AmazonHttpClient.class);

    public AmazonHttpClient(ClientConfiguration clientConfiguration, UrlHttpClient urlHttpClient) {
        this.f180 = clientConfiguration;
        this.f181 = urlHttpClient;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Response m252(DefaultRequest defaultRequest, HttpResponseHandler httpResponseHandler, HttpResponseHandler httpResponseHandler2, S3ExecutionContext s3ExecutionContext) {
        List<RequestHandler2> listM257 = s3ExecutionContext.m257();
        if (listM257 == null) {
            listM257 = Collections.EMPTY_LIST;
        } else {
            for (RequestHandler2 requestHandler2 : listM257) {
                if (requestHandler2 instanceof CredentialsRequestHandler) {
                    ((CredentialsRequestHandler) requestHandler2).m234(s3ExecutionContext.m256());
                }
                requestHandler2.mo241(defaultRequest);
            }
        }
        AWSRequestMetrics aWSRequestMetricsM254 = s3ExecutionContext.m254();
        try {
            Response responseM253 = m253(defaultRequest, httpResponseHandler, httpResponseHandler2, s3ExecutionContext);
            aWSRequestMetricsM254.m731().mo790();
            Iterator it = listM257.iterator();
            while (it.hasNext()) {
                ((RequestHandler2) it.next()).mo243(defaultRequest, responseM253);
            }
            return responseM253;
        } catch (AmazonClientException e) {
            Iterator it2 = listM257.iterator();
            while (it2.hasNext()) {
                ((RequestHandler2) it2.next()).mo242(defaultRequest, e);
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
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final com.amazonaws.Response m253(com.amazonaws.DefaultRequest r29, com.amazonaws.http.HttpResponseHandler r30, com.amazonaws.http.HttpResponseHandler r31, com.amazonaws.services.s3.internal.S3ExecutionContext r32) {
        /*
            Method dump skipped, instruction units count: 1269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.http.AmazonHttpClient.m253(com.amazonaws.DefaultRequest, com.amazonaws.http.HttpResponseHandler, com.amazonaws.http.HttpResponseHandler, com.amazonaws.services.s3.internal.S3ExecutionContext):com.amazonaws.Response");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m249(DefaultRequest defaultRequest, Exception exc) {
        if (defaultRequest.m177() == null) {
            return;
        }
        if (!defaultRequest.m177().markSupported()) {
            throw new AmazonClientException("Encountered an exception and stream is not resettable", exc);
        }
        try {
            defaultRequest.m177().reset();
        } catch (IOException unused) {
            throw new AmazonClientException("Encountered an exception and couldn't reset the stream to retry", exc);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m248(String str, String str2) {
        if (str.contains(str2)) {
            return str;
        }
        return str.trim() + " " + str2.trim();
    }

    public final void finalize() throws Throwable {
        this.f181.getClass();
        super.finalize();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m250(AmazonWebServiceRequest amazonWebServiceRequest, InputStream inputStream, AmazonClientException amazonClientException, int i, RetryPolicy retryPolicy) {
        int i2 = i - 1;
        this.f180.getClass();
        if (i2 < retryPolicy.m430()) {
            if (inputStream != null && !inputStream.markSupported()) {
                Log log = f178;
                if (log.mo293()) {
                    log.mo294("Content not repeatable");
                }
            } else {
                return retryPolicy.m431().mo428(amazonClientException, i2);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m251(HttpResponse httpResponse) {
        int iM270 = httpResponse.m270();
        String str = (String) httpResponse.m267().get("Location");
        return (iM270 != 307 || str == null || str.isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m247(HttpResponseHandler httpResponseHandler, HttpResponse httpResponse, S3ExecutionContext s3ExecutionContext) throws IOException {
        try {
            AWSRequestMetrics aWSRequestMetricsM254 = s3ExecutionContext.m254();
            AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ResponseProcessingTime;
            aWSRequestMetricsM254.mo736(field);
            try {
                AmazonWebServiceResponse amazonWebServiceResponse = (AmazonWebServiceResponse) httpResponseHandler.mo276(httpResponse);
                aWSRequestMetricsM254.mo732(field);
                if (amazonWebServiceResponse == null) {
                    throw new RuntimeException("Unable to unmarshall response metadata. Response Code: " + httpResponse.m270() + ", Response Text: " + httpResponse.m269());
                }
                Log log = f179;
                if (log.mo293()) {
                    log.mo294("Received successful response: " + httpResponse.m270() + ", AWS Request ID: " + amazonWebServiceResponse.m163());
                }
                aWSRequestMetricsM254.mo734(AWSRequestMetrics.Field.AWSRequestID, amazonWebServiceResponse.m163());
                return amazonWebServiceResponse.m166();
            } catch (Throwable th) {
                aWSRequestMetricsM254.mo732(AWSRequestMetrics.Field.ResponseProcessingTime);
                throw th;
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new AmazonClientException("Unable to unmarshall response (" + e2.getMessage() + "). Response Code: " + httpResponse.m270() + ", Response Text: " + httpResponse.m269(), e2);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AmazonServiceException m246(DefaultRequest defaultRequest, HttpResponseHandler httpResponseHandler, HttpResponse httpResponse) throws IOException {
        AmazonServiceException amazonServiceException;
        int iM270 = httpResponse.m270();
        try {
            amazonServiceException = (AmazonServiceException) httpResponseHandler.mo276(httpResponse);
            f179.mo294("Received error response: " + amazonServiceException.toString());
        } catch (Exception e) {
            if (iM270 == 413) {
                amazonServiceException = new AmazonServiceException("Request entity too large");
                amazonServiceException.m150(defaultRequest.m186());
                amazonServiceException.m143(413);
                AmazonServiceException.ErrorType errorType = AmazonServiceException.ErrorType.Client;
                amazonServiceException.m144("Request entity too large");
            } else if (iM270 == 503 && "Service Unavailable".equalsIgnoreCase(httpResponse.m269())) {
                amazonServiceException = new AmazonServiceException("Service unavailable");
                amazonServiceException.m150(defaultRequest.m186());
                amazonServiceException.m143(503);
                AmazonServiceException.ErrorType errorType2 = AmazonServiceException.ErrorType.Client;
                amazonServiceException.m144("Service unavailable");
            } else {
                if (e instanceof IOException) {
                    throw ((IOException) e);
                }
                throw new AmazonClientException("Unable to unmarshall error response (" + e.getMessage() + "). Response Code: " + iM270 + ", Response Text: " + httpResponse.m269() + ", Response Headers: " + httpResponse.m267(), e);
            }
        }
        amazonServiceException.m143(iM270);
        amazonServiceException.m150(defaultRequest.m186());
        amazonServiceException.fillInStackTrace();
        return amazonServiceException;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m244(AmazonWebServiceRequest amazonWebServiceRequest, AmazonClientException amazonClientException, int i, RetryPolicy retryPolicy) {
        int i2 = i - 2;
        long jMo427 = retryPolicy.m429().mo427(i2);
        Log log = f178;
        if (log.mo293()) {
            log.mo294("Retriable error detected, will retry in " + jMo427 + "ms, attempt number: " + i2);
        }
        try {
            Thread.sleep(jMo427);
            return jMo427;
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m245(HttpResponse httpResponse, AmazonServiceException amazonServiceException) {
        Date dateM769;
        String message;
        int iIndexOf;
        Date date = new Date();
        ?? r4 = (String) httpResponse.m267().get("Date");
        ?? r1 = 0;
        try {
            if (r4 != 0) {
                try {
                    if (!r4.isEmpty()) {
                        dateM769 = DateUtils.m769("EEE, dd MMM yyyy HH:mm:ss z", (String) r4);
                    } else {
                        message = amazonServiceException.getMessage();
                        int iIndexOf2 = message.indexOf(MotionUtils.EASING_TYPE_FORMAT_START);
                        if (message.contains(" + 15")) {
                            iIndexOf = message.indexOf(" + 15");
                        } else {
                            iIndexOf = message.indexOf(" - 15");
                        }
                        dateM769 = DateUtils.m769(AWS4Signer.TIME_PATTERN, message.substring(iIndexOf2 + 1, iIndexOf));
                    }
                } catch (RuntimeException e) {
                    e = e;
                    f178.mo298("Unable to parse clock skew offset from response: " + r1, e);
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
                dateM769 = DateUtils.m769(AWS4Signer.TIME_PATTERN, message.substring(iIndexOf3 + 1, iIndexOf));
            }
            long time = date.getTime() - dateM769.getTime();
            r4 = 1000;
            return time / 1000;
        } catch (RuntimeException e2) {
            e = e2;
            r1 = r4;
        }
    }
}
