package p067l;

import java.io.FileDescriptor;
import java.io.FileInputStream;

/* JADX INFO: renamed from: l.۟᩹ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1TZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C9743 extends Thread {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C19071 f26906;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ FileDescriptor f26907;

    public C9743(C19071 c19071, FileDescriptor fileDescriptor) {
        this.f26906 = c19071;
        this.f26907 = fileDescriptor;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        C19071 c19071 = this.f26906;
        try {
            FileInputStream fileInputStream = new FileInputStream(this.f26907);
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int i = fileInputStream.read(bArr);
                    if (i == -1 || !c19071.f56909.m30888(i, bArr)) {
                        break;
                        break;
                    }
                    c19071.f56898.sendEmptyMessage(1);
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
            c19071.f56908.countDown();
            throw th3;
        }
        c19071.f56908.countDown();
    }
}
