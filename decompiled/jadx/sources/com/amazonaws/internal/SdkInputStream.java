package com.amazonaws.internal;

import com.amazonaws.AbortedException;
import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
import p067l.C3123;
import p067l.InterfaceC16534;

/* JADX INFO: loaded from: classes.dex */
public abstract class SdkInputStream extends InputStream implements MetricAware, InterfaceC16534 {
    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    /* JADX INFO: renamed from: ᩳ */
    public abstract InputStream mo1381();

    @Override // com.amazonaws.internal.MetricAware
    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo1445() {
        Closeable closeableMo1381 = mo1381();
        if (closeableMo1381 instanceof MetricAware) {
            return ((MetricAware) closeableMo1381).mo1445();
        }
        return false;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m1448() {
        if (Thread.interrupted()) {
            throw new AbortedException();
        }
    }
}
