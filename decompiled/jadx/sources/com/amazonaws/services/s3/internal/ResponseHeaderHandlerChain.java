package com.amazonaws.services.s3.internal;

import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.transform.Unmarshaller;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ResponseHeaderHandlerChain extends S3XmlResponseHandler {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final List f496;

    public ResponseHeaderHandlerChain(Unmarshaller unmarshaller, HeaderHandler... headerHandlerArr) {
        super(unmarshaller);
        this.f496 = Arrays.asList(headerHandlerArr);
    }

    @Override // com.amazonaws.services.s3.internal.S3XmlResponseHandler, com.amazonaws.http.HttpResponseHandler
    /* JADX INFO: renamed from: ֫ */
    public final AmazonWebServiceResponse mo276(HttpResponse httpResponse) {
        AmazonWebServiceResponse amazonWebServiceResponseMo276 = super.mo276(httpResponse);
        Object objM166 = amazonWebServiceResponseMo276.m166();
        if (objM166 != null) {
            Iterator it = this.f496.iterator();
            while (it.hasNext()) {
                ((HeaderHandler) it.next()).mo463(objM166, httpResponse);
            }
        }
        return amazonWebServiceResponseMo276;
    }
}
