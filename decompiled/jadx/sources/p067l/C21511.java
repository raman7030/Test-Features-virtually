package p067l;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: l.᩶ۨ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 17MS */
/* JADX INFO: loaded from: classes5.dex */
public final class C21511 extends AbstractC12978 {

    /* JADX INFO: renamed from: ܿ֫ */
    public static final AtomicInteger f67855 = new AtomicInteger();

    /* JADX INFO: renamed from: ֡ */
    public final C18952 f67856;

    /* JADX INFO: renamed from: ֨ */
    public final InterfaceC22753 f67857;

    /* JADX INFO: renamed from: ֫֫ */
    public final C19203 f67858;

    /* JADX INFO: renamed from: ۖ */
    public InterfaceC6758 f67859;

    /* JADX INFO: renamed from: ۗ */
    public final boolean f67860;

    /* JADX INFO: renamed from: ۘ */
    public final InterfaceC23522 f67861;

    /* JADX INFO: renamed from: ۙ */
    public boolean f67862;

    /* JADX INFO: renamed from: ۚ */
    public boolean f67863;

    /* JADX INFO: renamed from: ۛ */
    public final int f67864;

    /* JADX INFO: renamed from: ۟ */
    public AbstractC16192 f67865;

    /* JADX INFO: renamed from: ۠ */
    public final C5318 f67866;

    /* JADX INFO: renamed from: ۡ */
    public final int f67867;

    /* JADX INFO: renamed from: ۤ */
    public C19144 f67868;

    /* JADX INFO: renamed from: ۧ֫ */
    public boolean f67869;

    /* JADX INFO: renamed from: ۨ */
    public final Uri f67870;

    /* JADX INFO: renamed from: ۫ */
    public int f67871;

    /* JADX INFO: renamed from: ۬ */
    public final List f67872;

    /* JADX INFO: renamed from: ܰ */
    public long f67873;

    /* JADX INFO: renamed from: ܶ */
    public final boolean f67874;

    /* JADX INFO: renamed from: ܺ */
    public final C21037 f67875;

    /* JADX INFO: renamed from: ܽ֫ */
    public final C11157 f67876;

    /* JADX INFO: renamed from: ᩳ֫ */
    public final int f67877;

    /* JADX INFO: renamed from: ᩴ */
    public boolean f67878;

    /* JADX INFO: renamed from: ᩵ */
    public final boolean f67879;

    /* JADX INFO: renamed from: ᩶ */
    public volatile boolean f67880;

    /* JADX INFO: renamed from: ᩸ */
    public final boolean f67881;

    /* JADX INFO: renamed from: ᩹ */
    public final boolean f67882;

    /* JADX INFO: renamed from: ᩺ */
    public final InterfaceC6758 f67883;

    /* JADX INFO: renamed from: ֫ */
    public static C21511 m48704(InterfaceC23522 interfaceC23522, InterfaceC22753 interfaceC22753, C10307 c10307, long j, C7074 c7074, C10111 c10111, Uri uri, List list, int i, Object obj, boolean z, C22498 c22498, C21511 c21511, byte[] bArr, byte[] bArr2, boolean z2, boolean z3, C15512 c15512) {
        byte[] bArrM48707;
        InterfaceC22753 c11453;
        C5318 c5318M15161;
        InterfaceC22753 interfaceC22754;
        boolean z4;
        C18952 c18952;
        InterfaceC6758 interfaceC6758;
        C19203 c19203;
        byte[] bArrM48708;
        InterfaceC22753 c11454 = interfaceC22753;
        C23838 c23838 = c10111.f28050;
        C6659 c6659 = new C6659();
        String str = c7074.f34777;
        c6659.m15164(C10486.m24199(str, c23838.f75749));
        c6659.m15169(c23838.f75748);
        c6659.m15163(c23838.f75747);
        boolean z5 = c10111.f28047;
        c6659.m15162(z5 ? 8 : 0);
        C5318 c5318M15162 = c6659.m15161();
        boolean z6 = bArr != null;
        if (z6) {
            String str2 = c23838.f75739;
            str2.getClass();
            bArrM48707 = m48707(str2);
        } else {
            bArrM48707 = null;
        }
        if (bArr != null) {
            bArrM48707.getClass();
            c11453 = new C11453(c11454, bArr, bArrM48707);
        } else {
            c11453 = c11454;
        }
        C23168 c23168 = c23838.f75742;
        if (c23168 != null) {
            boolean z7 = bArr2 != null;
            if (z7) {
                String str3 = c23168.f75739;
                str3.getClass();
                bArrM48708 = m48707(str3);
            } else {
                bArrM48708 = null;
            }
            Uri uriM24199 = C10486.m24199(str, c23168.f75749);
            C6659 c66510 = new C6659();
            c66510.m15164(uriM24199);
            boolean z8 = z7;
            c66510.m15169(c23168.f75748);
            c66510.m15163(c23168.f75747);
            c5318M15161 = c66510.m15161();
            if (bArr2 != null) {
                bArrM48708.getClass();
                c11454 = new C11453(c11454, bArr2, bArrM48708);
            }
            z4 = z8;
            interfaceC22754 = c11454;
        } else {
            c5318M15161 = null;
            interfaceC22754 = null;
            z4 = false;
        }
        long j2 = j + c23838.f75743;
        long j3 = j2 + c23838.f75740;
        int i2 = c7074.f18440 + c23838.f75741;
        if (c21511 != null) {
            C5318 c5318 = c21511.f67866;
            boolean z9 = c5318M15161 == c5318 || (c5318M15161 != null && c5318 != null && c5318M15161.f12514.equals(c5318.f12514) && c5318M15161.f12521 == c5318.f12521);
            boolean z10 = uri.equals(c21511.f67870) && c21511.f67862;
            C18952 c18953 = c21511.f67856;
            C19203 c19204 = c21511.f67858;
            interfaceC6758 = (z9 && z10 && !c21511.f67878 && c21511.f67867 == i2) ? c21511.f67859 : null;
            c18952 = c18953;
            c19203 = c19204;
        } else {
            c18952 = new C18952(null);
            interfaceC6758 = null;
            c19203 = new C19203(10);
        }
        return new C21511(interfaceC23522, c11453, c5318M15162, c10307, z6, interfaceC22754, c5318M15161, z4, uri, list, i, obj, j2, j3, c10111.f28048, c10111.f28049, !z5, i2, c23838.f75744, z, c22498.m50459(i2), c23838.f75746, interfaceC6758, c18952, c19203, z2, z3, c15512);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m48706(C21511 c21511, long j, Uri uri, boolean z, C10111 c10111, long j2) {
        if (c21511 == null) {
            return false;
        }
        if (uri.equals(c21511.f67870) && c21511.f67862) {
            return false;
        }
        return !z || j2 + c10111.f28050.f75743 < j;
    }

    public C21511(InterfaceC23522 interfaceC23522, InterfaceC22753 interfaceC22753, C5318 c5318, C10307 c10307, boolean z, InterfaceC22753 interfaceC22754, C5318 c5319, boolean z2, Uri uri, List list, int i, Object obj, long j, long j2, long j3, int i2, boolean z3, int i3, boolean z4, boolean z5, C11157 c11157, C21037 c21037, InterfaceC6758 interfaceC6758, C18952 c18952, C19203 c19203, boolean z6, boolean z7, C15512 c15512) {
        super(interfaceC22753, c5318, c10307, i, obj, j, j2, j3);
        this.f67860 = z;
        this.f67864 = i2;
        this.f67873 = z3 ? j2 - j : -9223372036854775807L;
        this.f67867 = i3;
        this.f67866 = c5319;
        this.f67857 = interfaceC22754;
        this.f67863 = c5319 != null;
        this.f67874 = z2;
        this.f67870 = uri;
        this.f67882 = z5;
        this.f67876 = c11157;
        this.f67879 = z4;
        this.f67861 = interfaceC23522;
        this.f67872 = list;
        this.f67875 = c21037;
        this.f67883 = interfaceC6758;
        this.f67856 = c18952;
        this.f67858 = c19203;
        this.f67869 = z6;
        this.f67881 = z7;
        this.f67865 = AbstractC16192.m36872of();
        this.f67877 = f67855.getAndIncrement();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48710(C19144 c19144, AbstractC16192 abstractC16192) {
        this.f67868 = c19144;
        this.f67865 = abstractC16192;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m48708(int i) {
        C23877.m52960(!this.f67869);
        if (i >= this.f67865.size()) {
            return 0;
        }
        return ((Integer) this.f67865.get(i)).intValue();
    }

    /* JADX INFO: renamed from: ۜ */
    public final void m48711() {
        this.f67878 = true;
    }

    /* JADX INFO: renamed from: ۡ */
    public final boolean m48712() {
        return this.f67869;
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m48714() {
        this.f67869 = false;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final boolean m48715() {
        return this.f67862;
    }

    @Override // p067l.InterfaceC24947
    /* JADX INFO: renamed from: ۧ */
    public final void mo8653() {
        this.f67880 = true;
    }

    @Override // p067l.InterfaceC24947
    /* JADX INFO: renamed from: ֫ */
    public final void mo8651() {
        InterfaceC6758 interfaceC6758;
        this.f67868.getClass();
        if (this.f67859 == null && (interfaceC6758 = this.f67883) != null) {
            InterfaceC3669 interfaceC3669Mo7081 = ((C10782) interfaceC6758).f29875.mo7081();
            if ((interfaceC3669Mo7081 instanceof C17317) || (interfaceC3669Mo7081 instanceof C14557)) {
                this.f67859 = this.f67883;
                this.f67863 = false;
            }
        }
        C5318 c5318 = this.f67866;
        InterfaceC22753 interfaceC22753 = this.f67857;
        if (this.f67863) {
            interfaceC22753.getClass();
            c5318.getClass();
            m48705(interfaceC22753, c5318, this.f67874, false);
            this.f67871 = 0;
            this.f67863 = false;
        }
        if (this.f67880) {
            return;
        }
        if (!this.f67879) {
            m48705(this.f26376, this.f26378, this.f67860, true);
        }
        this.f67862 = !this.f67880;
    }

    /* JADX INFO: renamed from: ۢ */
    public final boolean m48713() {
        return this.f67873 != -9223372036854775807L;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final long m48716() {
        long j = this.f67873;
        if (j != -9223372036854775807L) {
            return this.f26381 + j;
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48709(long j) {
        this.f67873 = j;
    }

    @RequiresNonNull({"output"})
    /* JADX INFO: renamed from: ֫ */
    private void m48705(InterfaceC22753 interfaceC22753, C5318 c5318, boolean z, boolean z2) {
        C5318 c5318M11509;
        boolean z3;
        if (z) {
            z3 = this.f67871 != 0;
            c5318M11509 = c5318;
        } else {
            long j = this.f67871;
            long j2 = c5318.f12516;
            c5318M11509 = c5318.m11509(j, j2 != -1 ? j2 - j : -1L);
            z3 = false;
        }
        try {
            C17750 c17750M48703 = m48703(interfaceC22753, c5318M11509, z2);
            if (z3) {
                c17750M48703.mo24032(this.f67871, false);
            }
            while (!this.f67880 && ((C10782) this.f67859).m24842(c17750M48703)) {
                try {
                    try {
                    } catch (EOFException e) {
                        if ((this.f26379.f28522 & 16384) != 0) {
                            ((C10782) this.f67859).f29875.mo7077(0L, 0L);
                        } else {
                            throw e;
                        }
                    }
                } catch (Throwable th) {
                    this.f67871 = (int) (c17750M48703.getPosition() - c5318.f12521);
                    throw th;
                }
            }
            this.f67871 = (int) (c17750M48703.getPosition() - c5318.f12521);
            C10685.m24613(interfaceC22753);
        } catch (Throwable th2) {
            C10685.m24613(interfaceC22753);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00bc  */
    @EnsuresNonNull({"extractor"})
    @RequiresNonNull({"output"})
    /* JADX INFO: renamed from: ֫ */
    private C17750 m48703(InterfaceC22753 interfaceC22753, C5318 c5318, boolean z) throws IOException {
        C17750 c17750;
        long jM43733;
        C10782 c10782M10052;
        long jMo4020 = interfaceC22753.mo4020(c5318);
        long jM25735 = this.f26381;
        C11157 c11157 = this.f67876;
        if (z) {
            try {
                c11157.m25733(jM25735, this.f67882);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            } catch (TimeoutException e) {
                throw new IOException(e);
            }
        }
        C17750 c17751 = new C17750(interfaceC22753, c5318.f12521, jMo4020);
        if (this.f67859 == null) {
            C19203 c19203 = this.f67858;
            c17751.mo24036();
            try {
                c19203.m43727(10);
                c17751.mo24038(false, 0, 10, c19203.m43728());
                if (c19203.m43737() == 4801587) {
                    c19203.m43724(3);
                    int iM43713 = c19203.m43713();
                    int i = iM43713 + 10;
                    if (i > c19203.m43718()) {
                        byte[] bArrM43728 = c19203.m43728();
                        c19203.m43727(i);
                        System.arraycopy(bArrM43728, 0, c19203.m43728(), 0, 10);
                    }
                    c17751.mo24038(false, 10, iM43713, c19203.m43728());
                    C25079 c25079M43080 = this.f67856.m43080(iM43713, c19203.m43728());
                    if (c25079M43080 != null) {
                        int iM55048 = c25079M43080.m55048();
                        int i2 = 0;
                        while (true) {
                            if (i2 >= iM55048) {
                                jM43733 = -9223372036854775807L;
                                break;
                            }
                            InterfaceC16361 interfaceC16361M55049 = c25079M43080.m55049(i2);
                            if (interfaceC16361M55049 instanceof C11577) {
                                C11577 c11577 = (C11577) interfaceC16361M55049;
                                if ("com.apple.streaming.transportStreamTimestamp".equals(c11577.f32250)) {
                                    System.arraycopy(c11577.f32251, 0, c19203.m43728(), 0, 8);
                                    c19203.m43730(0);
                                    c19203.m43732(8);
                                    jM43733 = c19203.m43733() & 8589934591L;
                                    break;
                                }
                            }
                            i2++;
                        }
                    } else {
                        jM43733 = -9223372036854775807L;
                        break;
                    }
                } else {
                    jM43733 = -9223372036854775807L;
                    break;
                }
            } catch (EOFException unused2) {
            }
            c17751.mo24036();
            InterfaceC6758 interfaceC6758 = this.f67883;
            if (interfaceC6758 != null) {
                c10782M10052 = ((C10782) interfaceC6758).m24841();
                c17750 = c17751;
            } else {
                c17750 = c17751;
                c10782M10052 = ((C4747) this.f67861).m10052(c5318.f12514, this.f26379, this.f67872, this.f67876, interfaceC22753.mo8131(), c17750);
            }
            this.f67859 = c10782M10052;
            InterfaceC3669 interfaceC3669Mo7081 = c10782M10052.f29875.mo7081();
            if ((interfaceC3669Mo7081 instanceof C24555) || (interfaceC3669Mo7081 instanceof C17849) || (interfaceC3669Mo7081 instanceof C18520) || (interfaceC3669Mo7081 instanceof C18580)) {
                C19144 c19144 = this.f67868;
                if (jM43733 != -9223372036854775807L) {
                    jM25735 = c11157.m25735(jM43733);
                }
                c19144.m43621(jM25735);
            } else {
                this.f67868.m43621(0L);
            }
            this.f67868.m43613();
            ((C10782) this.f67859).f29875.mo7078(this.f67868);
        } else {
            c17750 = c17751;
        }
        this.f67868.m43608(this.f67875);
        return c17750;
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m48707(String str) {
        if (C16726.m37957(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }
}
