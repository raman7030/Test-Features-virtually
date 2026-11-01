package p067l;

import android.content.pm.PackageInstaller;
import com.tencent.p062mm.opensdk.modelmsg.WXNativeGamePageObject;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ۜ֨ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAQJ */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC8486 implements Runnable {

    /* JADX INFO: renamed from: ᩶ */
    public final PackageInstaller.Session f22787;

    /* JADX INFO: renamed from: ᩸ */
    public final C15861 f22788;

    /* JADX INFO: renamed from: ᩹ */
    public final C5738 f22789;

    public RunnableC8486(C15861 c15861, C5738 c5738, PackageInstaller.Session session) {
        this.f22788 = c15861;
        this.f22789 = c5738;
        this.f22787 = session;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5738 c5738 = this.f22789;
        C15861 c15861 = this.f22788;
        boolean z = c15861.f45941;
        AtomicReference atomicReference = c15861.f45940;
        if (z || atomicReference.get() != null) {
            return;
        }
        C20689 c20689 = c15861.f45942;
        try {
            InputStream inputStreamM44448 = c15861.f45943.m36902().m44448(c5738);
            try {
                OutputStream outputStreamOpenWrite = this.f22787.openWrite(c5738.m12791(), 0L, c5738.getSize());
                try {
                    byte[] bArr = new byte[WXNativeGamePageObject.LENGTH_LIMIT];
                    do {
                        int i = inputStreamM44448.read(bArr);
                        if (i == -1) {
                            this.f22787.fsync(outputStreamOpenWrite);
                            if (outputStreamOpenWrite != null) {
                                outputStreamOpenWrite.close();
                            }
                            inputStreamM44448.close();
                            try {
                                c15861.f45944.put(this);
                                return;
                            } catch (InterruptedException unused) {
                                return;
                            }
                        }
                        c20689.m46754(i);
                        outputStreamOpenWrite.write(bArr, 0, i);
                        if (c15861.f45941) {
                            break;
                        }
                        try {
                            inputStreamM44448.close();
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                        }
                        throw th;
                    } while (atomicReference.get() == null);
                    outputStreamOpenWrite.close();
                    inputStreamM44448.close();
                } catch (Throwable th2) {
                    if (outputStreamOpenWrite != null) {
                        try {
                            outputStreamOpenWrite.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                inputStreamM44448.close();
                throw th4;
            }
        } catch (Exception e) {
            while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
            }
        }
    }
}
