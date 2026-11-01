package p067l;

import com.tencent.p062mm.opensdk.modelmsg.WXNativeGamePageObject;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.GZIPOutputStream;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.۬ۨ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: V1EH */
/* JADX INFO: loaded from: classes3.dex */
public final class C14819 {

    /* JADX INFO: renamed from: ۜ */
    public final AtomicInteger f42275;

    /* JADX INFO: renamed from: ܽ */
    public final boolean f42278;

    /* JADX INFO: renamed from: ᩻ */
    public final BufferedOutputStream f42281;

    /* JADX INFO: renamed from: ֫ */
    public final C11996 f42274 = new C11996();

    /* JADX INFO: renamed from: ܳ */
    public final C2864 f42277 = new C2864();

    /* JADX INFO: renamed from: ᩳ */
    public final C2864 f42280 = new C2864();

    /* JADX INFO: renamed from: ܿ */
    public final C2864 f42279 = new C2864();

    /* JADX INFO: renamed from: ۧ */
    public final byte[] f42276 = new byte[4];

    public C14819(boolean z, BufferedOutputStream bufferedOutputStream, AtomicInteger atomicInteger) {
        this.f42278 = z;
        this.f42281 = bufferedOutputStream;
        this.f42275 = atomicInteger;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33854(C6773 c6773) throws IOException {
        this.f42274.m27460();
        this.f42277.m4599();
        C11996 c11996 = this.f42274;
        C20635 c20635 = c6773.f17545;
        if (c20635 != null) {
            c20635.m46638(c11996);
        } else {
            InputStream inputStreamMo29987 = c6773.f17538.mo29987();
            try {
                byte[] bArr = new byte[WXNativeGamePageObject.LENGTH_LIMIT];
                while (true) {
                    int i = inputStreamMo29987.read(bArr);
                    if (i == -1) {
                        break;
                    } else {
                        c11996.write(bArr, 0, i);
                    }
                }
                inputStreamMo29987.close();
            } catch (Throwable th) {
                if (inputStreamMo29987 != null) {
                    try {
                        inputStreamMo29987.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        c6773.m15455(this.f42277);
        if (this.f42278) {
            this.f42280.m4599();
            C2864 c2864 = this.f42280;
            byte[] bArrM27458 = this.f42274.m27458();
            int size = this.f42274.size();
            int i2 = C6054.f15203;
            try {
                C11879 c11879 = new C11879(c2864);
                try {
                    c11879.write(bArrM27458, 0, size);
                    c11879.close();
                    this.f42279.m4599();
                    C2864 c2865 = this.f42279;
                    C2864 c2866 = this.f42277;
                    byte[] bArr2 = c2866.f4949;
                    int i3 = c2866.f4950;
                    try {
                        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(c2865);
                        try {
                            gZIPOutputStream.write(bArr2, 0, i3);
                            gZIPOutputStream.close();
                        } catch (Throwable th3) {
                            try {
                                gZIPOutputStream.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                } catch (Throwable th5) {
                    try {
                        c11879.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                    throw th5;
                }
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
        synchronized (this.f42281) {
            if (this.f42278) {
                C17548.m39930(0, this.f42280.f4950, this.f42276);
                this.f42281.write(this.f42276);
                BufferedOutputStream bufferedOutputStream = this.f42281;
                C2864 c2867 = this.f42280;
                bufferedOutputStream.write(c2867.f4949, 0, c2867.f4950);
                c6773.f17540 = this.f42275.getAndAdd(this.f42280.f4950 + 4);
                C17548.m39930(0, this.f42279.f4950, this.f42276);
                this.f42281.write(this.f42276);
                BufferedOutputStream bufferedOutputStream2 = this.f42281;
                C2864 c2868 = this.f42279;
                bufferedOutputStream2.write(c2868.f4949, 0, c2868.f4950);
                c6773.f17539 = this.f42275.getAndAdd(this.f42279.f4950 + 4);
            } else {
                C17548.m39930(0, this.f42274.size(), this.f42276);
                this.f42281.write(this.f42276);
                this.f42281.write(this.f42274.m27458(), 0, this.f42274.size());
                c6773.f17540 = this.f42275.getAndAdd(this.f42274.size() + 4);
                C2864 c2869 = this.f42277;
                byte[] bArr3 = c2869.f4949;
                int i4 = c2869.f4950;
                for (int i5 = 0; i5 < i4; i5++) {
                    if (bArr3[i5] == 0) {
                        bArr3[i5] = UTF8.S_CS3;
                    }
                }
                this.f42281.write(bArr3, 0, i4);
                this.f42281.write(0);
                c6773.f17539 = this.f42275.getAndAdd(i4 + 1);
            }
        }
        if (this.f42274.m27458().length > 20480) {
            this.f42274.m27460();
            this.f42274.m27463();
        }
        C2864 c28610 = this.f42277;
        if (c28610.f4949.length > 20480) {
            c28610.m4599();
            this.f42277.m4600();
        }
        C2864 c28611 = this.f42280;
        if (c28611.f4949.length > 20480) {
            c28611.m4599();
            this.f42280.m4600();
        }
        C2864 c28612 = this.f42279;
        if (c28612.f4949.length > 20480) {
            c28612.m4599();
            this.f42279.m4600();
        }
        c6773.f17541 = null;
        C20635 c20636 = c6773.f17545;
        if (c20636 != null) {
            c20636.m46643();
            c6773.f17545 = null;
        }
    }
}
