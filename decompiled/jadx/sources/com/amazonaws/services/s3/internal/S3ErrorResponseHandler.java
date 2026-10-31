package com.amazonaws.services.s3.internal;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.http.HttpResponseHandler;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.services.s3.model.AmazonS3Exception;
import com.amazonaws.util.IOUtils;
import com.amazonaws.util.XpathUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import org.w3c.dom.Document;

/* JADX INFO: loaded from: classes.dex */
public class S3ErrorResponseHandler implements HttpResponseHandler {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Log f498 = LogFactory.m302(S3ErrorResponseHandler.class);

    @Override // com.amazonaws.http.HttpResponseHandler
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo277() {
        return false;
    }

    @Override // com.amazonaws.http.HttpResponseHandler
    /* JADX INFO: renamed from: ֫ */
    public final Object mo276(HttpResponse httpResponse) {
        Log log = f498;
        InputStream inputStreamM266 = httpResponse.m266();
        if (inputStreamM266 == null) {
            return m474(httpResponse.m269(), httpResponse);
        }
        try {
            String strM781 = IOUtils.m781(inputStreamM266);
            try {
                Document documentM801 = XpathUtils.m801(strM781);
                String strM800 = XpathUtils.m800("Error/Message", documentM801);
                String strM801 = XpathUtils.m800("Error/Code", documentM801);
                String strM802 = XpathUtils.m800("Error/RequestId", documentM801);
                String strM803 = XpathUtils.m800("Error/HostId", documentM801);
                AmazonS3Exception amazonS3Exception = new AmazonS3Exception(strM800);
                amazonS3Exception.m143(httpResponse.m270());
                AmazonServiceException.ErrorType errorType = AmazonServiceException.ErrorType.Client;
                amazonS3Exception.m144(strM801);
                amazonS3Exception.m148(strM802);
                amazonS3Exception.m525(strM803);
                return amazonS3Exception;
            } catch (Exception e) {
                if (log.mo293()) {
                    log.mo292("Failed in parsing the response as XML: " + strM781, e);
                }
                return m474(strM781, httpResponse);
            }
        } catch (IOException e2) {
            if (log.mo293()) {
                log.mo292("Failed in reading the error response", e2);
            }
            return m474(httpResponse.m269(), httpResponse);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AmazonS3Exception m474(String str, HttpResponse httpResponse) {
        AmazonS3Exception amazonS3Exception = new AmazonS3Exception(str);
        int iM270 = httpResponse.m270();
        amazonS3Exception.m144(iM270 + " " + httpResponse.m269());
        amazonS3Exception.m143(iM270);
        AmazonServiceException.ErrorType errorType = AmazonServiceException.ErrorType.Client;
        Map mapM267 = httpResponse.m267();
        amazonS3Exception.m148((String) mapM267.get("x-amz-request-id"));
        amazonS3Exception.m525((String) mapM267.get("x-amz-id-2"));
        HashMap map = new HashMap();
        map.put("x-amz-bucket-region", mapM267.get("x-amz-bucket-region"));
        amazonS3Exception.m523(map);
        return amazonS3Exception;
    }
}
