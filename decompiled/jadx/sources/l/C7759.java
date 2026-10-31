package l;

import java.io.FileDescriptor;
import java.io.FileInputStream;

/* JADX INFO: renamed from: l.۟᩹ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1TZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C7759 extends Thread {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17574 f23992;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ FileDescriptor f23993;

    public C7759(C17574 c17574, FileDescriptor fileDescriptor) {
        this.f23992 = c17574;
        this.f23993 = fileDescriptor;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        C17574 c17574 = this.f23992;
        try {
            FileInputStream fileInputStream = new FileInputStream(this.f23993);
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int i = fileInputStream.read(bArr);
                    if (i == -1 || !c17574.f53719.m28840(i, bArr)) {
                        break;
                        break;
                    }
                    c17574.f53708.sendEmptyMessage(1);
                }
                fileInputStream.close();
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Exception unused) {
        } catch (Throwable th3) {
            c17574.f53718.countDown();
            throw th3;
        }
        c17574.f53718.countDown();
    }
}
