package com.amazonaws.services.p061s3.internal;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.http.HttpResponseHandler;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.services.p061s3.model.AmazonS3Exception;
import com.amazonaws.util.IOUtils;
import com.amazonaws.util.XpathUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import org.w3c.dom.Document;

/* JADX INFO: loaded from: classes.dex */
public class S3ErrorResponseHandler implements HttpResponseHandler {

    /* JADX INFO: renamed from: ֫ */
    public static final Log f1658 = LogFactory.m1468(S3ErrorResponseHandler.class);

    @Override // com.amazonaws.http.HttpResponseHandler
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo1443() {
        return false;
    }

    @Override // com.amazonaws.http.HttpResponseHandler
    /* JADX INFO: renamed from: ֫ */
    public final Object mo1442(HttpResponse httpResponse) {
        Log log = f1658;
        InputStream inputStreamM1432 = httpResponse.m1432();
        if (inputStreamM1432 == null) {
            return m1640(httpResponse.m1435(), httpResponse);
        }
        try {
            String strM1946 = IOUtils.m1946(inputStreamM1432);
            try {
                Document documentM1966 = XpathUtils.m1966(strM1946);
                String strM1965 = XpathUtils.m1965("Error/Message", documentM1966);
                String strM1966 = XpathUtils.m1965("Error/Code", documentM1966);
                String strM1967 = XpathUtils.m1965("Error/RequestId", documentM1966);
                String strM1968 = XpathUtils.m1965("Error/HostId", documentM1966);
                AmazonS3Exception amazonS3Exception = new AmazonS3Exception(strM1965);
                amazonS3Exception.m1310(httpResponse.m1436());
                AmazonServiceException.ErrorType errorType = AmazonServiceException.ErrorType.Client;
                amazonS3Exception.m1311(strM1966);
                amazonS3Exception.m1315(strM1967);
                amazonS3Exception.m1691(strM1968);
                return amazonS3Exception;
            } catch (Exception e) {
                if (log.mo1459()) {
                    log.mo1458("Failed in parsing the response as XML: " + strM1946, e);
                }
                return m1640(strM1946, httpResponse);
            }
        } catch (IOException e2) {
            if (log.mo1459()) {
                log.mo1458("Failed in reading the error response", e2);
            }
            return m1640(httpResponse.m1435(), httpResponse);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static AmazonS3Exception m1640(String str, HttpResponse httpResponse) {
        AmazonS3Exception amazonS3Exception = new AmazonS3Exception(str);
        int iM1436 = httpResponse.m1436();
        amazonS3Exception.m1311(iM1436 + " " + httpResponse.m1435());
        amazonS3Exception.m1310(iM1436);
        AmazonServiceException.ErrorType errorType = AmazonServiceException.ErrorType.Client;
        Map mapM1433 = httpResponse.m1433();
        amazonS3Exception.m1315((String) mapM1433.get("x-amz-request-id"));
        amazonS3Exception.m1691((String) mapM1433.get("x-amz-id-2"));
        HashMap map = new HashMap();
        map.put("x-amz-bucket-region", mapM1433.get("x-amz-bucket-region"));
        amazonS3Exception.m1689(map);
        return amazonS3Exception;
    }
}
