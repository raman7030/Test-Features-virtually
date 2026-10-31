package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.io.InterruptedIOException;

/* JADX INFO: renamed from: l.ܰܶ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: D739 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13891 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC21654 f41409;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final byte[] f41410 = new byte[WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT];

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f41411;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public volatile boolean f41412;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C13186 f41413;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f41414;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C3104 f41415;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f41416;

    public C13891(C13186 c13186, C3104 c3104) {
        this.f41413 = c13186;
        this.f41409 = c13186.m32012();
        this.f41415 = c3104;
        this.f41411 = c13186.m32013().mo12554(c3104);
        this.f41416 = c3104.f9718;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m33302() {
        this.f41412 = true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33301() throws Exception {
        long jMo1620;
        if (this.f41412) {
            throw new InterruptedIOException();
        }
        InterfaceC21654 interfaceC21654 = this.f41409;
        String str = this.f41411;
        C3104 c3104 = this.f41415;
        interfaceC21654.mo38144(str, c3104.f9718, c3104.f9713);
        long j = c3104.f9713;
        if (j != -1) {
            this.f41414 = c3104.f9718 + j;
        } else {
            long jM32306 = C13325.m32306(this.f41409.mo38139(this.f41411));
            if (jM32306 == -1) {
                jM32306 = -1;
            }
            this.f41414 = jM32306;
        }
        while (true) {
            long j2 = this.f41414;
            if (j2 != -1 && this.f41416 >= j2) {
                return;
            }
            if (this.f41412) {
                throw new InterruptedIOException();
            }
            long j3 = this.f41414;
            long jMo38152 = this.f41409.mo38152(this.f41411, this.f41416, j3 == -1 ? Long.MAX_VALUE : j3 - this.f41416);
            if (jMo38152 > 0) {
                this.f41416 += jMo38152;
            } else {
                long j4 = -jMo38152;
                if (j4 == C13132.FOREVER_NS) {
                    j4 = -1;
                }
                long j5 = this.f41416;
                C13186 c13186 = this.f41413;
                boolean z = true;
                boolean z2 = j5 + j4 == this.f41414 || j4 == -1;
                if (j4 != -1) {
                    C4515 c4515M9467 = c3104.m9467();
                    c4515M9467.m13286(j5);
                    c4515M9467.m13280(j4);
                    try {
                        jMo1620 = c13186.mo1620(c4515M9467.m13278());
                    } catch (Exception unused) {
                        C8751.m22643(c13186);
                        z = false;
                        jMo1620 = -1;
                    }
                } else {
                    z = false;
                    jMo1620 = -1;
                }
                if (!z) {
                    if (this.f41412) {
                        throw new InterruptedIOException();
                    }
                    C4515 c4515M9468 = c3104.m9467();
                    c4515M9468.m13286(j5);
                    c4515M9468.m13280(-1L);
                    try {
                        jMo1620 = c13186.mo1620(c4515M9468.m13278());
                    } catch (Exception e) {
                        C8751.m22643(c13186);
                        throw e;
                    }
                }
                if (z2 && jMo1620 != -1) {
                    long j6 = jMo1620 + j5;
                    try {
                        if (this.f41414 != j6) {
                            this.f41414 = j6;
                        }
                    } catch (Exception e2) {
                        C8751.m22643(c13186);
                        throw e2;
                    }
                }
                int i = 0;
                int i2 = 0;
                while (i != -1) {
                    if (this.f41412) {
                        throw new InterruptedIOException();
                    }
                    byte[] bArr = this.f41410;
                    i = c13186.read(bArr, 0, bArr.length);
                    if (i != -1) {
                        i2 += i;
                    }
                }
                if (z2) {
                    long j7 = ((long) i2) + j5;
                    if (this.f41414 != j7) {
                        this.f41414 = j7;
                    }
                }
                c13186.close();
                this.f41416 = j5 + ((long) i2);
            }
        }
    }
}
