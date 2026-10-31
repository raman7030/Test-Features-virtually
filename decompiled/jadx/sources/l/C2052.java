package l;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.֫᩶ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1TZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C2052 extends Thread {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17574 f6856;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ FileDescriptor f6857;

    public C2052(C17574 c17574, FileDescriptor fileDescriptor) {
        this.f6856 = c17574;
        this.f6857 = fileDescriptor;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        byte[] bArr = new byte[4096];
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(this.f6857);
            while (true) {
                try {
                    int iM28838 = this.f6856.f53705.m28838(bArr, true);
                    if (iM28838 != -1) {
                        fileOutputStream.write(bArr, 0, iM28838);
                    } else {
                        fileOutputStream.close();
                        return;
                    }
                } catch (Throwable th) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        } catch (IOException unused) {
        }
    }
}
