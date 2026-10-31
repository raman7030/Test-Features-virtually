package com.amazonaws;

import com.amazonaws.event.ProgressListener;
import com.amazonaws.services.s3.model.PutObjectRequest;

/* JADX INFO: loaded from: classes.dex */
public abstract class AmazonWebServiceRequest implements Cloneable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ProgressListener f86;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final RequestClientOptions f87 = new RequestClientOptions();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final RequestClientOptions m161() {
        return this.f87;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo159(ProgressListener progressListener) {
        this.f86 = progressListener;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ProgressListener mo158() {
        return this.f86;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m160(PutObjectRequest putObjectRequest) {
        putObjectRequest.f86 = this.f86;
    }

    @Override // 
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public AmazonWebServiceRequest mo162clone() {
        try {
            AmazonWebServiceRequest amazonWebServiceRequest = (AmazonWebServiceRequest) super.clone();
            amazonWebServiceRequest.getClass();
            return amazonWebServiceRequest;
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() even though we're Cloneable!", e);
        }
    }
}
