package com.amazonaws.handlers;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Response;

/* JADX INFO: loaded from: classes.dex */
public final class RequestHandler2Adaptor extends RequestHandler2 {

    /* JADX INFO: renamed from: ֫ */
    public final RequestHandler f1337;

    public RequestHandler2Adaptor(RequestHandler requestHandler) {
        if (requestHandler == null) {
            throw new IllegalArgumentException();
        }
        this.f1337 = requestHandler;
    }

    @Override // com.amazonaws.handlers.RequestHandler2
    /* JADX INFO: renamed from: ֫ */
    public final void mo1407(DefaultRequest defaultRequest) {
        this.f1337.m1404();
    }

    @Override // com.amazonaws.handlers.RequestHandler2
    /* JADX INFO: renamed from: ֫ */
    public final void mo1409(DefaultRequest defaultRequest, Response response) {
        this.f1337.m1405();
    }

    @Override // com.amazonaws.handlers.RequestHandler2
    /* JADX INFO: renamed from: ֫ */
    public final void mo1408(DefaultRequest defaultRequest, AmazonClientException amazonClientException) {
        this.f1337.m1406();
    }

    public final int hashCode() {
        return this.f1337.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof RequestHandler2Adaptor) {
            return this.f1337.equals(((RequestHandler2Adaptor) obj).f1337);
        }
        return false;
    }
}
