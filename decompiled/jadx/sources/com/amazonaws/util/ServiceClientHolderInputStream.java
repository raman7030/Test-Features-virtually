package com.amazonaws.util;

import com.amazonaws.internal.SdkFilterInputStream;
import com.amazonaws.services.p061s3.model.S3ObjectInputStream;

/* JADX INFO: loaded from: classes.dex */
public class ServiceClientHolderInputStream extends SdkFilterInputStream {
    public ServiceClientHolderInputStream(S3ObjectInputStream s3ObjectInputStream) {
        super(s3ObjectInputStream);
    }
}
