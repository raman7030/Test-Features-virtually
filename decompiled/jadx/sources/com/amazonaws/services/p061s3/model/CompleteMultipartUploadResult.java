package com.amazonaws.services.p061s3.model;

import com.amazonaws.services.p061s3.internal.ObjectExpirationResult;
import com.amazonaws.services.p061s3.internal.S3RequesterChargedResult;
import com.amazonaws.services.p061s3.internal.SSEResultBase;
import java.io.Serializable;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public class CompleteMultipartUploadResult extends SSEResultBase implements ObjectExpirationResult, S3RequesterChargedResult, Serializable {
    @Override // com.amazonaws.services.p061s3.internal.ObjectExpirationResult
    /* JADX INFO: renamed from: ֫ */
    public final void mo1634(Date date) {
    }

    @Override // com.amazonaws.services.p061s3.internal.S3RequesterChargedResult
    /* JADX INFO: renamed from: ֫ */
    public final void mo1631(boolean z) {
    }

    @Override // com.amazonaws.services.p061s3.internal.ObjectExpirationResult
    /* JADX INFO: renamed from: ܽ */
    public final void mo1635(String str) {
    }
}
