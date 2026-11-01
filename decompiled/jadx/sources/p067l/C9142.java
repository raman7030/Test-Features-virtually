package p067l;

import com.tencent.p062mm.opensdk.modelmsg.WXNativeGamePageObject;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.۟֡᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: P50D */
/* JADX INFO: loaded from: classes2.dex */
public final class C9142 implements Closeable {

    /* JADX INFO: renamed from: ۗ */
    public final String f24741;

    /* JADX INFO: renamed from: ۙ */
    public final String f24742;

    /* JADX INFO: renamed from: ۤ */
    public final AbstractC5375 f24743;

    /* JADX INFO: renamed from: ۫ */
    public final AtomicInteger f24744 = new AtomicInteger();

    /* JADX INFO: renamed from: ۬ */
    public final String f24745;

    /* JADX INFO: renamed from: ᩶ */
    public final long f24746;

    /* JADX INFO: renamed from: ᩸ */
    public final C13166 f24747;

    /* JADX INFO: renamed from: ᩹ */
    public final String f24748;

    public C9142(AbstractC5375 abstractC5375, String str, String str2, String str3, long j) {
        this.f24743 = abstractC5375;
        this.f24748 = str;
        this.f24745 = str2;
        this.f24741 = C11419.m26414(str2);
        this.f24742 = str3;
        this.f24746 = j;
        abstractC5375.getClass();
        if (abstractC5375 instanceof C14506) {
            this.f24747 = new C13166(this);
        } else {
            this.f24747 = null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m21088(OutputStream outputStream, long j) throws IOException {
        if (this.f24747 == null) {
            InputStream inputStreamMo11725 = this.f24743.mo11725(j, this.f24745);
            try {
                C23461.m52174(inputStreamMo11725, outputStream, 12288);
                inputStreamMo11725.close();
                return;
            } catch (Throwable th) {
                if (inputStreamMo11725 != null) {
                    try {
                        inputStreamMo11725.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        final C23894 c23894 = new C23894(this, C19130.m43467(), j, outputStream, new AtomicReference());
        ArrayList arrayList = new ArrayList(2);
        for (final int i = 0; i < 2; i++) {
            arrayList.add(C4081.f8987.submit(new Runnable() { // from class: l.ܰ֡᩻
                @Override // java.lang.Runnable
                public final void run() {
                    c23894.accept(i);
                }
            }));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((Future) it.next()).get();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m21087(C9142 c9142, C19130[] c19130Arr, long j, OutputStream outputStream, AtomicReference atomicReference, int i) {
        try {
            C19130 c19130 = c19130Arr[i];
            long j2 = WXNativeGamePageObject.LENGTH_LIMIT;
            byte[] bArr = new byte[WXNativeGamePageObject.LENGTH_LIMIT];
            long j3 = (((long) i) * j2) + j;
            do {
                C13166 c13166 = c9142.f24747;
                int iM30160 = c13166.m30160(j3, bArr, 0, WXNativeGamePageObject.LENGTH_LIMIT);
                int i2 = -1;
                if (iM30160 != -1) {
                    int i3 = WXNativeGamePageObject.LENGTH_LIMIT - iM30160;
                    while (i3 > 0) {
                        C13166 c13167 = c13166;
                        int iM30161 = c13166.m30160(j3 + ((long) iM30160), bArr, iM30160, i3);
                        if (iM30161 == -1) {
                            break;
                        }
                        iM30160 += iM30161;
                        i3 -= iM30161;
                        c13166 = c13167;
                    }
                    i2 = iM30160;
                }
                j3 += ((long) 2) * j2;
                if (i2 > 0) {
                    try {
                        c19130.m43468();
                        outputStream.write(bArr, 0, i2);
                        c19130.m43469();
                    } catch (Throwable th) {
                        c19130.m43469();
                        throw th;
                    }
                }
                if (i2 != 102400) {
                    return;
                }
            } while (atomicReference.get() == null);
        } catch (Throwable th2) {
            while (!atomicReference.compareAndSet(null, th2) && atomicReference.get() == null) {
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C13166 c13166 = this.f24747;
        if (c13166 != null) {
            c13166.close();
        }
    }
}
