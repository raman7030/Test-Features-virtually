package p067l;

import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;
import java.io.InterruptedIOException;

/* JADX INFO: renamed from: l.ܰܶ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: D739 */
/* JADX INFO: loaded from: classes3.dex */
public final class C15570 {

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC22948 f44490;

    /* JADX INFO: renamed from: ۜ */
    public final byte[] f44491 = new byte[WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT];

    /* JADX INFO: renamed from: ۧ */
    public final String f44492;

    /* JADX INFO: renamed from: ܳ */
    public volatile boolean f44493;

    /* JADX INFO: renamed from: ܽ */
    public final C14900 f44494;

    /* JADX INFO: renamed from: ܿ */
    public long f44495;

    /* JADX INFO: renamed from: ᩳ */
    public final C5318 f44496;

    /* JADX INFO: renamed from: ᩻ */
    public long f44497;

    public C15570(C14900 c14900, C5318 c5318) {
        this.f44494 = c14900;
        this.f44490 = c14900.m34110();
        this.f44496 = c5318;
        this.f44492 = c14900.m34111().mo14444(c5318);
        this.f44497 = c5318.f12521;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m35421() {
        this.f44493 = true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35420() throws Exception {
        long jMo4020;
        if (this.f44493) {
            throw new InterruptedIOException();
        }
        InterfaceC22948 interfaceC22948 = this.f44490;
        String str = this.f44492;
        C5318 c5318 = this.f44496;
        interfaceC22948.mo40356(str, c5318.f12521, c5318.f12516);
        long j = c5318.f12516;
        if (j != -1) {
            this.f44495 = c5318.f12521 + j;
        } else {
            long jM34406 = C15033.m34406(this.f44490.mo40351(this.f44492));
            if (jM34406 == -1) {
                jM34406 = -1;
            }
            this.f44495 = jM34406;
        }
        while (true) {
            long j2 = this.f44495;
            if (j2 != -1 && this.f44497 >= j2) {
                return;
            }
            if (this.f44493) {
                throw new InterruptedIOException();
            }
            long j3 = this.f44495;
            long jMo40364 = this.f44490.mo40364(this.f44492, this.f44497, j3 == -1 ? Long.MAX_VALUE : j3 - this.f44497);
            if (jMo40364 > 0) {
                this.f44497 += jMo40364;
            } else {
                long j4 = -jMo40364;
                if (j4 == C14849.FOREVER_NS) {
                    j4 = -1;
                }
                long j5 = this.f44497;
                C14900 c14900 = this.f44494;
                boolean z = true;
                boolean z2 = j5 + j4 == this.f44495 || j4 == -1;
                if (j4 != -1) {
                    C6659 c6659M11510 = c5318.m11510();
                    c6659M11510.m15169(j5);
                    c6659M11510.m15163(j4);
                    try {
                        jMo4020 = c14900.mo4020(c6659M11510.m15161());
                    } catch (Exception unused) {
                        C10685.m24613(c14900);
                        z = false;
                        jMo4020 = -1;
                    }
                } else {
                    z = false;
                    jMo4020 = -1;
                }
                if (!z) {
                    if (this.f44493) {
                        throw new InterruptedIOException();
                    }
                    C6659 c6659M11511 = c5318.m11510();
                    c6659M11511.m15169(j5);
                    c6659M11511.m15163(-1L);
                    try {
                        jMo4020 = c14900.mo4020(c6659M11511.m15161());
                    } catch (Exception e) {
                        C10685.m24613(c14900);
                        throw e;
                    }
                }
                if (z2 && jMo4020 != -1) {
                    long j6 = jMo4020 + j5;
                    try {
                        if (this.f44495 != j6) {
                            this.f44495 = j6;
                        }
                    } catch (Exception e2) {
                        C10685.m24613(c14900);
                        throw e2;
                    }
                }
                int i = 0;
                int i2 = 0;
                while (i != -1) {
                    if (this.f44493) {
                        throw new InterruptedIOException();
                    }
                    byte[] bArr = this.f44491;
                    i = c14900.read(bArr, 0, bArr.length);
                    if (i != -1) {
                        i2 += i;
                    }
                }
                if (z2) {
                    long j7 = ((long) i2) + j5;
                    if (this.f44495 != j7) {
                        this.f44495 = j7;
                    }
                }
                c14900.close();
                this.f44497 = j5 + ((long) i2);
            }
        }
    }
}
