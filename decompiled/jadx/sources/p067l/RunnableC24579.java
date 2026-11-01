package p067l;

import com.tencent.p062mm.opensdk.modelmsg.WXNativeGamePageObject;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.᩻֨ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAQJ */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC24579 implements Runnable {

    /* JADX INFO: renamed from: ۙ */
    public final boolean f77815;

    /* JADX INFO: renamed from: ᩶ */
    public final AbstractC17043 f77816;

    /* JADX INFO: renamed from: ᩸ */
    public final C15861 f77817;

    /* JADX INFO: renamed from: ᩹ */
    public final C5738 f77818;

    public RunnableC24579(C15861 c15861, C5738 c5738, AbstractC17043 abstractC17043, boolean z) {
        this.f77817 = c15861;
        this.f77818 = c5738;
        this.f77816 = abstractC17043;
        this.f77815 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC17043 abstractC17043 = this.f77816;
        C15861 c15861 = this.f77817;
        boolean z = c15861.f45941;
        AtomicReference atomicReference = c15861.f45940;
        if (z || atomicReference.get() != null) {
            return;
        }
        C20689 c20689 = c15861.f45942;
        try {
            abstractC17043.mo37342();
            try {
                InputStream inputStreamM44448 = c15861.f45943.m36902().m44448(this.f77818);
                try {
                    OutputStream outputStreamMo25506 = abstractC17043.mo25506(false);
                    try {
                        byte[] bArr = new byte[WXNativeGamePageObject.LENGTH_LIMIT];
                        do {
                            int i = inputStreamM44448.read(bArr);
                            if (i == -1) {
                                if (this.f77815) {
                                    try {
                                        c15861.f45944.put(this);
                                    } catch (InterruptedException unused) {
                                    }
                                }
                                if (outputStreamMo25506 != null) {
                                    outputStreamMo25506.close();
                                }
                                inputStreamM44448.close();
                                return;
                            }
                            c20689.m46754(i);
                            outputStreamMo25506.write(bArr, 0, i);
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
                        outputStreamMo25506.close();
                        inputStreamM44448.close();
                    } catch (Throwable th2) {
                        if (outputStreamMo25506 != null) {
                            try {
                                outputStreamMo25506.close();
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
        } catch (IOException e2) {
            while (!atomicReference.compareAndSet(null, e2) && atomicReference.get() == null) {
            }
        }
    }
}
