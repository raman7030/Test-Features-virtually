package com.alipay.android.phone.mrpc.core;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class r {
    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
