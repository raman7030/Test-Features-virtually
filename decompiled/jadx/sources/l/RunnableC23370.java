package l;

import com.tencent.mm.opensdk.modelmsg.WXNativeGamePageObject;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.᩻֨ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAQJ */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC23370 implements Runnable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f75069;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f75070;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C14197 f75071;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C3545 f75072;

    public RunnableC23370(C14197 c14197, C3545 c3545, AbstractC15440 abstractC15440, boolean z) {
        this.f75071 = c14197;
        this.f75072 = c3545;
        this.f75070 = abstractC15440;
        this.f75069 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC15440 abstractC15440 = this.f75070;
        C14197 c14197 = this.f75071;
        boolean z = c14197.f42854;
        AtomicReference atomicReference = c14197.f42853;
        if (z || atomicReference.get() != null) {
            return;
        }
        C19277 c19277 = c14197.f42855;
        try {
            abstractC15440.mo35195();
            try {
                InputStream inputStreamM42189 = c14197.f42856.m34753().m42189(this.f75072);
                try {
                    OutputStream outputStreamMo23555 = abstractC15440.mo23555(false);
                    try {
                        byte[] bArr = new byte[WXNativeGamePageObject.LENGTH_LIMIT];
                        do {
                            int i = inputStreamM42189.read(bArr);
                            if (i == -1) {
                                if (this.f75069) {
                                    try {
                                        c14197.f42857.put(this);
                                    } catch (InterruptedException unused) {
                                    }
                                }
                                if (outputStreamMo23555 != null) {
                                    outputStreamMo23555.close();
                                }
                                inputStreamM42189.close();
                                return;
                            }
                            c19277.m44460(i);
                            outputStreamMo23555.write(bArr, 0, i);
                            if (c14197.f42854) {
                                break;
                            }
                            try {
                                inputStreamM42189.close();
                            } catch (Throwable th) {
                                th.addSuppressed(th);
                            }
                            throw th;
                        } while (atomicReference.get() == null);
                        outputStreamMo23555.close();
                        inputStreamM42189.close();
                    } catch (Throwable th2) {
                        if (outputStreamMo23555 != null) {
                            try {
                                outputStreamMo23555.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                        }
                        throw th2;
                    }
                } catch (Throwable th4) {
                    inputStreamM42189.close();
                    throw th4;
                }
            } catch (Exception e) {
                while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                }
            }
        } catch (IOException e2) {
            while (!atomicReference.compareAndSet(null, e2) && atomicReference.get() == null) {
            }
        }
    }
}
