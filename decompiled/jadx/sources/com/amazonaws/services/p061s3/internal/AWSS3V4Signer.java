package com.amazonaws.services.p061s3.internal;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.auth.AWS4Signer;
import com.amazonaws.auth.AwsChunkedEncodingInputStream;
import com.amazonaws.services.p061s3.model.PutObjectRequest;
import com.amazonaws.services.p061s3.model.UploadPartRequest;
import com.amazonaws.util.BinaryUtils;
import java.io.IOException;
import java.io.InputStream;
import org.simpleframework.xml.core.AnnotationHandler;

/* JADX INFO: loaded from: classes2.dex */
public class AWSS3V4Signer extends AWS4Signer {
    @Override // com.amazonaws.auth.AWS4Signer
    public final String calculateContentHashPresign(Request request) {
        return "UNSIGNED-PAYLOAD";
    }

    public AWSS3V4Signer() {
        super(false);
    }

    @Override // com.amazonaws.auth.AWS4Signer
    public final String calculateContentHash(Request request) {
        long j;
        DefaultRequest defaultRequest = (DefaultRequest) request;
        defaultRequest.m1348("x-amz-content-sha256", AnnotationHandler.REQUIRED);
        if ((defaultRequest.m1358() instanceof PutObjectRequest) || (defaultRequest.m1358() instanceof UploadPartRequest)) {
            String str = (String) defaultRequest.m1357().get("Content-Length");
            if (str != null) {
                j = Long.parseLong(str);
            } else {
                try {
                    InputStream inputStreamM1343 = defaultRequest.m1343();
                    if (!inputStreamM1343.markSupported()) {
                        throw new AmazonClientException("Failed to get content length");
                    }
                    byte[] bArr = new byte[4096];
                    inputStreamM1343.mark(-1);
                    long j2 = 0;
                    while (true) {
                        int i = inputStreamM1343.read(bArr);
                        if (i == -1) {
                            break;
                        }
                        j2 += (long) i;
                    }
                    inputStreamM1343.reset();
                    j = j2;
                } catch (IOException e) {
                    throw new AmazonClientException("Cannot get the content-lenght of the request content.", e);
                }
            }
            defaultRequest.m1348("x-amz-decoded-content-length", Long.toString(j));
            defaultRequest.m1348("Content-Length", Long.toString(AwsChunkedEncodingInputStream.m1380(j)));
            return "STREAMING-AWS4-HMAC-SHA256-PAYLOAD";
        }
        return super.calculateContentHash(defaultRequest);
    }

    @Override // com.amazonaws.auth.AWS4Signer
    public final void processRequestPayload(Request request, AWS4Signer.HeaderSigningResult headerSigningResult) {
        DefaultRequest defaultRequest = (DefaultRequest) request;
        if ((defaultRequest.m1358() instanceof PutObjectRequest) || (defaultRequest.m1358() instanceof UploadPartRequest)) {
            defaultRequest.m1346(new AwsChunkedEncodingInputStream(defaultRequest.m1343(), headerSigningResult.m1369(), headerSigningResult.m1368(), headerSigningResult.m1370(), BinaryUtils.m1915(headerSigningResult.m1371()), this));
        }
    }
}
