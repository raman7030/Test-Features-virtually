package com.amazonaws.services.p061s3.internal;

import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.util.StringUtils;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class S3StringResponseHandler extends AbstractS3ResponseHandler {
    @Override // com.amazonaws.http.HttpResponseHandler
    /* JADX INFO: renamed from: ֫ */
    public final Object mo1442(HttpResponse httpResponse) throws IOException {
        AmazonWebServiceResponse amazonWebServiceResponseM1623 = AbstractS3ResponseHandler.m1623(httpResponse);
        byte[] bArr = new byte[1024];
        StringBuilder sb = new StringBuilder();
        InputStream inputStreamM1432 = httpResponse.m1432();
        while (true) {
            int i = inputStreamM1432.read(bArr);
            if (i > 0) {
                sb.append(new String(bArr, 0, i, StringUtils.f2004));
            } else {
                amazonWebServiceResponseM1623.m1331(sb.toString());
                return amazonWebServiceResponseM1623;
            }
        }
    }
}
