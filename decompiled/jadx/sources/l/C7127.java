package l;

import com.tencent.mm.opensdk.modelmsg.WXNativeGamePageObject;
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
public final class C7127 implements Closeable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final String f21862;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f21863;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC3163 f21864;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f21865 = new AtomicInteger();

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String f21866;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long f21867;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C11361 f21868;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f21869;

    public C7127(AbstractC3163 abstractC3163, String str, String str2, String str3, long j) {
        this.f21864 = abstractC3163;
        this.f21869 = str;
        this.f21866 = str2;
        this.f21862 = C9523.m24404(str2);
        this.f21863 = str3;
        this.f21867 = j;
        abstractC3163.getClass();
        if (abstractC3163 instanceof C12771) {
            this.f21868 = new C11361(this);
        } else {
            this.f21868 = null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19145(OutputStream outputStream, long j) throws IOException {
        if (this.f21868 == null) {
            InputStream inputStreamMo9681 = this.f21864.mo9681(j, this.f21866);
            try {
                C22194.m49847(inputStreamMo9681, outputStream, 12288);
                inputStreamMo9681.close();
                return;
            } catch (Throwable th) {
                if (inputStreamMo9681 != null) {
                    try {
                        inputStreamMo9681.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        final C22649 c22649 = new C22649(this, C17636.m41221(), j, outputStream, new AtomicReference());
        ArrayList arrayList = new ArrayList(2);
        for (final int i = 0; i < 2; i++) {
            arrayList.add(C1802.f6208.submit(new Runnable() { // from class: l.ܰ֡᩻
                @Override // java.lang.Runnable
                public final void run() {
                    c22649.accept(i);
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

    /* JADX WARN: Bottom block not found for handler: all -> 0x0066 */
    /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:?, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m19144(C7127 c7127, C17636[] c17636Arr, long j, OutputStream outputStream, AtomicReference atomicReference, int i) {
        C17636 c17636 = c17636Arr[i];
        long j2 = WXNativeGamePageObject.LENGTH_LIMIT;
        byte[] bArr = new byte[WXNativeGamePageObject.LENGTH_LIMIT];
        long j3 = (((long) i) * j2) + j;
        do {
            C11361 c11361 = c7127.f21868;
            int iM28116 = c11361.m28116(j3, bArr, 0, WXNativeGamePageObject.LENGTH_LIMIT);
            int i2 = -1;
            if (iM28116 != -1) {
                int i3 = WXNativeGamePageObject.LENGTH_LIMIT - iM28116;
                while (i3 > 0) {
                    C11361 c11362 = c11361;
                    int iM28117 = c11361.m28116(j3 + ((long) iM28116), bArr, iM28116, i3);
                    if (iM28117 == -1) {
                        break;
                    }
                    iM28116 += iM28117;
                    i3 -= iM28117;
                    c11361 = c11362;
                }
                i2 = iM28116;
            }
            j3 += ((long) 2) * j2;
            if (i2 > 0) {
                try {
                    c17636.m41222();
                    outputStream.write(bArr, 0, i2);
                    c17636.m41223();
                } catch (Throwable th) {
                    c17636.m41223();
                    throw th;
                }
            }
            if (i2 != 102400) {
                return;
            }
        } while (atomicReference.get() == null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C11361 c11361 = this.f21868;
        if (c11361 != null) {
            c11361.close();
        }
    }
}
