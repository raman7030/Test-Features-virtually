package com.amazonaws.services.p061s3.model;

import com.amazonaws.services.p061s3.internal.ObjectExpirationResult;
import com.amazonaws.services.p061s3.internal.S3RequesterChargedResult;
import com.amazonaws.services.p061s3.internal.S3VersionResult;
import com.amazonaws.services.p061s3.internal.SSEResultBase;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public class PutObjectResult extends SSEResultBase implements ObjectExpirationResult, S3RequesterChargedResult, S3VersionResult {
    @Override // com.amazonaws.services.p061s3.internal.S3VersionResult
    /* JADX INFO: renamed from: ֫ */
    public final void mo1644(String str) {
    }

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
