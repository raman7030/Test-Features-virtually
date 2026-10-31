package com.amazonaws.services.s3.internal;

import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.transform.Unmarshaller;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class S3XmlResponseHandler extends AbstractS3ResponseHandler {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final Log f506 = LogFactory.m303("com.amazonaws.request");

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Map f507;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Unmarshaller f508;

    public S3XmlResponseHandler(Unmarshaller unmarshaller) {
        this.f508 = unmarshaller;
    }

    @Override // com.amazonaws.http.HttpResponseHandler
    /* JADX INFO: renamed from: ֫ */
    public AmazonWebServiceResponse mo276(HttpResponse httpResponse) {
        AmazonWebServiceResponse amazonWebServiceResponseM457 = AbstractS3ResponseHandler.m457(httpResponse);
        this.f507 = httpResponse.m267();
        Unmarshaller unmarshaller = this.f508;
        if (unmarshaller != null) {
            Log log = f506;
            log.mo299("Beginning to parse service response XML");
            Object objMo706 = unmarshaller.mo706(httpResponse.m266());
            log.mo299("Done parsing service response XML");
            amazonWebServiceResponseM457.m165(objMo706);
        }
        return amazonWebServiceResponseM457;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Map m479() {
        return this.f507;
    }
}
