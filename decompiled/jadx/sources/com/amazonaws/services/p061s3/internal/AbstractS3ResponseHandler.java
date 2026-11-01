package com.amazonaws.services.p061s3.internal;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.http.HttpResponseHandler;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.services.p061s3.S3ResponseMetadata;
import com.amazonaws.services.p061s3.model.ObjectMetadata;
import com.amazonaws.util.DateUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractS3ResponseHandler implements HttpResponseHandler {

    /* JADX INFO: renamed from: ֫ */
    public static final HashSet f1632;

    /* JADX INFO: renamed from: ۧ */
    public static final Log f1633 = LogFactory.m1468(S3MetadataResponseHandler.class);

    @Override // com.amazonaws.http.HttpResponseHandler
    /* JADX INFO: renamed from: ֫ */
    public boolean mo1443() {
        return this instanceof S3ObjectResponseHandler;
    }

    static {
        HashSet hashSet = new HashSet();
        f1632 = hashSet;
        hashSet.add("Date");
        hashSet.add("Server");
        hashSet.add("x-amz-request-id");
        hashSet.add("x-amz-id-2");
        hashSet.add("X-Amz-Cf-Id");
        hashSet.add("Connection");
    }

    /* JADX INFO: renamed from: ۧ */
    public static AmazonWebServiceResponse m1623(HttpResponse httpResponse) {
        AmazonWebServiceResponse amazonWebServiceResponse = new AmazonWebServiceResponse();
        String str = (String) httpResponse.m1433().get("x-amz-request-id");
        String str2 = (String) httpResponse.m1433().get("x-amz-id-2");
        String str3 = (String) httpResponse.m1433().get("X-Amz-Cf-Id");
        HashMap map = new HashMap();
        map.put("AWS_REQUEST_ID", str);
        map.put("HOST_ID", str2);
        map.put("CLOUD_FRONT_ID", str3);
        amazonWebServiceResponse.m1330(new S3ResponseMetadata(map));
        return amazonWebServiceResponse;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m1622(HttpResponse httpResponse, ObjectMetadata objectMetadata) {
        for (Map.Entry entry : httpResponse.m1433().entrySet()) {
            String str = (String) entry.getKey();
            if (str.startsWith("x-amz-meta-")) {
                objectMetadata.m1785(str.substring(11), (String) entry.getValue());
            } else {
                boolean zContains = f1632.contains(str);
                Log log = f1633;
                if (zContains) {
                    log.mo1460(str.concat(" is ignored."));
                } else if (str.equalsIgnoreCase("Last-Modified")) {
                    try {
                        String str2 = (String) entry.getValue();
                        int i = ServiceUtils.f1672;
                        objectMetadata.m1783(DateUtils.m1934("EEE, dd MMM yyyy HH:mm:ss z", str2), str);
                    } catch (Exception e) {
                        log.mo1464("Unable to parse last modified date: " + ((String) entry.getValue()), e);
                    }
                } else if (str.equalsIgnoreCase("Content-Length")) {
                    try {
                        objectMetadata.m1783(Long.valueOf(Long.parseLong((String) entry.getValue())), str);
                    } catch (NumberFormatException e2) {
                        log.mo1464("Unable to parse content length: " + ((String) entry.getValue()), e2);
                    }
                } else if (str.equalsIgnoreCase("ETag")) {
                    objectMetadata.m1783((Object) ServiceUtils.m1652((String) entry.getValue()), str);
                } else if (str.equalsIgnoreCase("Expires")) {
                    try {
                        objectMetadata.m1798(DateUtils.m1934("EEE, dd MMM yyyy HH:mm:ss z", (String) entry.getValue()));
                    } catch (Exception e3) {
                        log.mo1464("Unable to parse http expiration date: " + ((String) entry.getValue()), e3);
                    }
                } else if (str.equalsIgnoreCase("x-amz-expiration")) {
                    new ObjectExpirationHeaderHandler();
                    ObjectExpirationHeaderHandler.m1633((ObjectExpirationResult) objectMetadata, httpResponse);
                } else if (str.equalsIgnoreCase("x-amz-restore")) {
                    new ObjectRestoreHeaderHandler();
                    ObjectRestoreHeaderHandler.m1636((ObjectRestoreResult) objectMetadata, httpResponse);
                } else if (str.equalsIgnoreCase("x-amz-request-charged")) {
                    new S3RequesterChargedHeaderHandler();
                    objectMetadata.mo1631(httpResponse.m1433().get("x-amz-request-charged") != null);
                } else if (str.equalsIgnoreCase("x-amz-mp-parts-count")) {
                    try {
                        objectMetadata.m1783(Integer.valueOf(Integer.parseInt((String) entry.getValue())), str);
                    } catch (NumberFormatException e4) {
                        throw new AmazonClientException("Unable to parse part count. Header x-amz-mp-parts-count has corrupted data" + e4.getMessage(), e4);
                    }
                } else {
                    objectMetadata.m1783(entry.getValue(), str);
                }
            }
        }
    }
}
