package com.amazonaws.handlers;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Response;

/* JADX INFO: loaded from: classes.dex */
public final class RequestHandler2Adaptor extends RequestHandler2 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final RequestHandler f177;

    public RequestHandler2Adaptor(RequestHandler requestHandler) {
        if (requestHandler == null) {
            throw new IllegalArgumentException();
        }
        this.f177 = requestHandler;
    }

    @Override // com.amazonaws.handlers.RequestHandler2
    /* JADX INFO: renamed from: ֫ */
    public final void mo241(DefaultRequest defaultRequest) {
        this.f177.m238();
    }

    @Override // com.amazonaws.handlers.RequestHandler2
    /* JADX INFO: renamed from: ֫ */
    public final void mo243(DefaultRequest defaultRequest, Response response) {
        this.f177.m239();
    }

    @Override // com.amazonaws.handlers.RequestHandler2
    /* JADX INFO: renamed from: ֫ */
    public final void mo242(DefaultRequest defaultRequest, AmazonClientException amazonClientException) {
        this.f177.m240();
    }

    public final int hashCode() {
        return this.f177.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof RequestHandler2Adaptor) {
            return this.f177.equals(((RequestHandler2Adaptor) obj).f177);
        }
        return false;
    }
}
