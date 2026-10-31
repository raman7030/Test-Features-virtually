package com.rosan.dhizuku.api;

import com.rosan.dhizuku.aidl.IDhizukuClient;

/* JADX INFO: loaded from: classes.dex */
public class DhizukuClient extends IDhizukuClient.Stub {
    public static final int VERSION_CODE = 1;

    @Override // com.rosan.dhizuku.aidl.IDhizukuClient
    public int getVersionCode() {
        return 1;
    }
}
