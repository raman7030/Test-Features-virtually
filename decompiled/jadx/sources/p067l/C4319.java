package p067l;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.֫᩶ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1TZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C4319 extends Thread {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C19071 f9639;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ FileDescriptor f9640;

    public C4319(C19071 c19071, FileDescriptor fileDescriptor) {
        this.f9639 = c19071;
        this.f9640 = fileDescriptor;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        byte[] bArr = new byte[4096];
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(this.f9640);
            while (true) {
                try {
                    int iM30886 = this.f9639.f56895.m30886(bArr, true);
                    if (iM30886 != -1) {
                        fileOutputStream.write(bArr, 0, iM30886);
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
