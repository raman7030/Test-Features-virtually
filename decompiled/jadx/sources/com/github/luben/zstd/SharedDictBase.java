package com.github.luben.zstd;

/* JADX INFO: loaded from: classes.dex */
public abstract class SharedDictBase extends AutoCloseBase {
    public void finalize() {
        close();
    }
}
