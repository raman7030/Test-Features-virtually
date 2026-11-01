package com.amazonaws;

import com.amazonaws.event.ProgressListener;
import com.amazonaws.services.p061s3.model.PutObjectRequest;

/* JADX INFO: loaded from: classes.dex */
public abstract class AmazonWebServiceRequest implements Cloneable {

    /* JADX INFO: renamed from: ᩸ */
    public ProgressListener f1246;

    /* JADX INFO: renamed from: ᩹ */
    public final RequestClientOptions f1247 = new RequestClientOptions();

    /* JADX INFO: renamed from: ܽ */
    public final RequestClientOptions m1328() {
        return this.f1247;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo1326(ProgressListener progressListener) {
        this.f1246 = progressListener;
    }

    /* JADX INFO: renamed from: ֫ */
    public ProgressListener mo1325() {
        return this.f1246;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m1327(PutObjectRequest putObjectRequest) {
        putObjectRequest.f1246 = this.f1246;
    }

    @Override // 
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public AmazonWebServiceRequest mo55493clone() {
        try {
            AmazonWebServiceRequest amazonWebServiceRequest = (AmazonWebServiceRequest) super.clone();
            amazonWebServiceRequest.getClass();
            return amazonWebServiceRequest;
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() even though we're Cloneable!", e);
        }
    }
}
