package com.amazonaws.services.p061s3.internal;

import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.transform.Unmarshaller;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class S3XmlResponseHandler extends AbstractS3ResponseHandler {

    /* JADX INFO: renamed from: ܿ */
    public static final Log f1666 = LogFactory.m1469("com.amazonaws.request");

    /* JADX INFO: renamed from: ܽ */
    public Map f1667;

    /* JADX INFO: renamed from: ᩳ */
    public Unmarshaller f1668;

    public S3XmlResponseHandler(Unmarshaller unmarshaller) {
        this.f1668 = unmarshaller;
    }

    @Override // com.amazonaws.http.HttpResponseHandler
    /* JADX INFO: renamed from: ֫ */
    public AmazonWebServiceResponse mo1442(HttpResponse httpResponse) {
        AmazonWebServiceResponse amazonWebServiceResponseM1623 = AbstractS3ResponseHandler.m1623(httpResponse);
        this.f1667 = httpResponse.m1433();
        Unmarshaller unmarshaller = this.f1668;
        if (unmarshaller != null) {
            Log log = f1666;
            log.mo1465("Beginning to parse service response XML");
            Object objMo1871 = unmarshaller.mo1871(httpResponse.m1432());
            log.mo1465("Done parsing service response XML");
            amazonWebServiceResponseM1623.m1331(objMo1871);
        }
        return amazonWebServiceResponseM1623;
    }

    /* JADX INFO: renamed from: ۧ */
    public final Map m1645() {
        return this.f1667;
    }
}
