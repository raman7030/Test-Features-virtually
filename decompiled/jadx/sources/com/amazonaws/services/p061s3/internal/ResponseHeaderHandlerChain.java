package com.amazonaws.services.p061s3.internal;

import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.transform.Unmarshaller;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ResponseHeaderHandlerChain extends S3XmlResponseHandler {

    /* JADX INFO: renamed from: ܳ */
    public final List f1656;

    public ResponseHeaderHandlerChain(Unmarshaller unmarshaller, HeaderHandler... headerHandlerArr) {
        super(unmarshaller);
        this.f1656 = Arrays.asList(headerHandlerArr);
    }

    @Override // com.amazonaws.services.p061s3.internal.S3XmlResponseHandler, com.amazonaws.http.HttpResponseHandler
    /* JADX INFO: renamed from: ֫ */
    public final AmazonWebServiceResponse mo1442(HttpResponse httpResponse) {
        AmazonWebServiceResponse amazonWebServiceResponseMo1442 = super.mo1442(httpResponse);
        Object objM1332 = amazonWebServiceResponseMo1442.m1332();
        if (objM1332 != null) {
            Iterator it = this.f1656.iterator();
            while (it.hasNext()) {
                ((HeaderHandler) it.next()).mo1629(objM1332, httpResponse);
            }
        }
        return amazonWebServiceResponseMo1442;
    }
}
