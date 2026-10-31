package com.amazonaws.services.s3.internal;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.http.HttpResponseHandler;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.services.s3.S3ResponseMetadata;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.util.DateUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractS3ResponseHandler implements HttpResponseHandler {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final HashSet f472;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Log f473 = LogFactory.m302(S3MetadataResponseHandler.class);

    @Override // com.amazonaws.http.HttpResponseHandler
    /* JADX INFO: renamed from: ֫ */
    public boolean mo277() {
        return this instanceof S3ObjectResponseHandler;
    }

    static {
        HashSet hashSet = new HashSet();
        f472 = hashSet;
        hashSet.add("Date");
        hashSet.add("Server");
        hashSet.add("x-amz-request-id");
        hashSet.add("x-amz-id-2");
        hashSet.add("X-Amz-Cf-Id");
        hashSet.add("Connection");
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static AmazonWebServiceResponse m457(HttpResponse httpResponse) {
        AmazonWebServiceResponse amazonWebServiceResponse = new AmazonWebServiceResponse();
        String str = (String) httpResponse.m267().get("x-amz-request-id");
        String str2 = (String) httpResponse.m267().get("x-amz-id-2");
        String str3 = (String) httpResponse.m267().get("X-Amz-Cf-Id");
        HashMap map = new HashMap();
        map.put("AWS_REQUEST_ID", str);
        map.put("HOST_ID", str2);
        map.put("CLOUD_FRONT_ID", str3);
        amazonWebServiceResponse.m164(new S3ResponseMetadata(map));
        return amazonWebServiceResponse;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m456(HttpResponse httpResponse, ObjectMetadata objectMetadata) {
        for (Map.Entry entry : httpResponse.m267().entrySet()) {
            String str = (String) entry.getKey();
            if (str.startsWith("x-amz-meta-")) {
                objectMetadata.m619(str.substring(11), (String) entry.getValue());
            } else {
                boolean zContains = f472.contains(str);
                Log log = f473;
                if (zContains) {
                    log.mo294(str.concat(" is ignored."));
                } else if (str.equalsIgnoreCase("Last-Modified")) {
                    try {
                        String str2 = (String) entry.getValue();
                        int i = ServiceUtils.f512;
                        objectMetadata.m617(DateUtils.m769("EEE, dd MMM yyyy HH:mm:ss z", str2), str);
                    } catch (Exception e) {
                        log.mo298("Unable to parse last modified date: " + ((String) entry.getValue()), e);
                    }
                } else if (str.equalsIgnoreCase("Content-Length")) {
                    try {
                        objectMetadata.m617(Long.valueOf(Long.parseLong((String) entry.getValue())), str);
                    } catch (NumberFormatException e2) {
                        log.mo298("Unable to parse content length: " + ((String) entry.getValue()), e2);
                    }
                } else if (str.equalsIgnoreCase("ETag")) {
                    objectMetadata.m617((Object) ServiceUtils.m486((String) entry.getValue()), str);
                } else if (str.equalsIgnoreCase("Expires")) {
                    try {
                        objectMetadata.m632(DateUtils.m769("EEE, dd MMM yyyy HH:mm:ss z", (String) entry.getValue()));
                    } catch (Exception e3) {
                        log.mo298("Unable to parse http expiration date: " + ((String) entry.getValue()), e3);
                    }
                } else if (str.equalsIgnoreCase("x-amz-expiration")) {
                    new ObjectExpirationHeaderHandler();
                    ObjectExpirationHeaderHandler.m467((ObjectExpirationResult) objectMetadata, httpResponse);
                } else if (str.equalsIgnoreCase("x-amz-restore")) {
                    new ObjectRestoreHeaderHandler();
                    ObjectRestoreHeaderHandler.m470((ObjectRestoreResult) objectMetadata, httpResponse);
                } else if (str.equalsIgnoreCase("x-amz-request-charged")) {
                    new S3RequesterChargedHeaderHandler();
                    objectMetadata.mo465(httpResponse.m267().get("x-amz-request-charged") != null);
                } else if (str.equalsIgnoreCase("x-amz-mp-parts-count")) {
                    try {
                        objectMetadata.m617(Integer.valueOf(Integer.parseInt((String) entry.getValue())), str);
                    } catch (NumberFormatException e4) {
                        throw new AmazonClientException("Unable to parse part count. Header x-amz-mp-parts-count has corrupted data" + e4.getMessage(), e4);
                    }
                } else {
                    objectMetadata.m617(entry.getValue(), str);
                }
            }
        }
    }
}
