package l;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.media.Image;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Build;
import com.alipay.sdk.m.p.a;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.IOException;
import java.io.InterruptedIOException;

/* JADX INFO: renamed from: l.᩺ܶۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: A75O */
/* JADX INFO: loaded from: classes.dex */
public final class C23068 implements InterfaceC12842 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final Uri f74197 = Uri.parse("mt-ts-preview:///media.ts");

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f74198 = 0;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13190 f74199 = new C13190();

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C8353 f74200;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C4724 f74201;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f74202;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f74203;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C12053 f74204;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f74205;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f74206;

    @Override // l.InterfaceC12842
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo9070() {
        return true;
    }

    public C23068(C12053 c12053, long j) {
        this.f74204 = c12053;
        this.f74203 = j * 1000;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C23068 m51227(C12053 c12053, long j) throws IOException {
        if (!c12053.m29438() || j <= 0 || j > 10000) {
            throw new IOException("Unsupported MPEG-TS preview source");
        }
        return new C23068(c12053, j);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0084 A[Catch: all -> 0x005e, TryCatch #8 {all -> 0x005e, blocks: (B:5:0x001f, B:7:0x002c, B:35:0x006a, B:41:0x007b, B:39:0x0074, B:44:0x0084, B:45:0x0087, B:47:0x008b, B:48:0x008d, B:49:0x008e, B:50:0x0095, B:52:0x0097), top: B:59:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:47:0x008b A[Catch: all -> 0x005e, TryCatch #8 {all -> 0x005e, blocks: (B:5:0x001f, B:7:0x002c, B:35:0x006a, B:41:0x007b, B:39:0x0074, B:44:0x0084, B:45:0x0087, B:47:0x008b, B:48:0x008d, B:49:0x008e, B:50:0x0095, B:52:0x0097), top: B:59:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:49:0x008e A[Catch: all -> 0x005e, TryCatch #8 {all -> 0x005e, blocks: (B:5:0x001f, B:7:0x002c, B:35:0x006a, B:41:0x007b, B:39:0x0074, B:44:0x0084, B:45:0x0087, B:47:0x008b, B:48:0x008d, B:49:0x008e, B:50:0x0095, B:52:0x0097), top: B:59:0x001f }] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Bitmap m51226(C12053 c12053, int i, InterfaceC19899 interfaceC19899) throws Throwable {
        Throwable th;
        if (!c12053.m29438()) {
            throw new IOException("Unsupported MPEG-TS thumbnail source");
        }
        int iMax = Math.max(1, i);
        C12485 c12485 = new C12485(iMax, iMax, 0L);
        C13190 c13190 = new C13190();
        String str = null;
        Exception exc = null;
        boolean z = false;
        C4724 c4724 = null;
        while (true) {
            try {
                try {
                    try {
                        interfaceC19899.mo21195();
                        th = exc;
                        try {
                            C4724 c4724M13824 = C4724.m13824(c12053, c13190, iMax, iMax, true, z, str, interfaceC19899);
                            try {
                                C4724.m13828(c4724M13824, 0L, interfaceC19899);
                                Bitmap bitmapM32015 = c13190.m32015(c12485);
                                if (bitmapM32015 == null) {
                                    throw new IOException("MPEG-TS thumbnail frame was not decoded");
                                }
                                C4724.m13834(c4724M13824);
                                c13190.m32016();
                                return bitmapM32015;
                            } catch (InterruptedIOException e) {
                                throw e;
                            } catch (IOException e2) {
                                e = e2;
                                c4724 = c4724M13824;
                                exc = e;
                                if (z && m51229(exc)) {
                                    str = c4724 == null ? null : c4724.f14990;
                                    if (c4724 != null) {
                                        C4724.m13834(c4724);
                                        c4724 = null;
                                    }
                                    z = true;
                                } else {
                                    if (th != null) {
                                        exc.addSuppressed(th);
                                    }
                                    if (exc instanceof IOException) {
                                        throw ((IOException) exc);
                                    }
                                    throw new IOException("MPEG-TS thumbnail decode failed", exc);
                                }
                            } catch (RuntimeException e3) {
                                e = e3;
                                c4724 = c4724M13824;
                                exc = e;
                                if (z) {
                                }
                                if (th != null) {
                                    exc.addSuppressed(th);
                                }
                                if (exc instanceof IOException) {
                                    throw ((IOException) exc);
                                }
                                throw new IOException("MPEG-TS thumbnail decode failed", exc);
                            } catch (Throwable th2) {
                                th = th2;
                                c4724 = c4724M13824;
                                if (c4724 != null) {
                                    C4724.m13834(c4724);
                                }
                                c13190.m32016();
                                throw th;
                            }
                        } catch (IOException | RuntimeException e4) {
                            e = e4;
                        }
                    } catch (InterruptedIOException e5) {
                        throw e5;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (IOException | RuntimeException e6) {
                e = e6;
                th = exc;
            }
            z = true;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m51229(Exception exc) {
        for (Throwable cause = exc; cause != null; cause = cause.getCause()) {
            if ((cause instanceof C3313) || (cause instanceof C22363) || (cause instanceof C20247) || (cause instanceof MediaCodec.CodecException)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private Bitmap m51230(long j, int i, int i2, InterfaceC19899 interfaceC19899) throws IOException {
        C4724 c4724M13824 = this.f74201;
        if (c4724M13824 != null && (!C4724.m13831(c4724M13824, i, i2) || c4724M13824.f14991 > j)) {
            m51231();
            c4724M13824 = null;
        }
        if (c4724M13824 == null) {
            c4724M13824 = C4724.m13824(this.f74204, this.f74199, i, i2, false, this.f74206, this.f74205, interfaceC19899);
            this.f74201 = c4724M13824;
            this.f74200 = c4724M13824.f14994;
        }
        C4724.m13828(c4724M13824, j, interfaceC19899);
        C12485 c12485 = new C12485(i, i2, j);
        C13190 c13190 = this.f74199;
        Bitmap bitmapM32015 = c13190.m32015(c12485);
        if (bitmapM32015 != null) {
            return bitmapM32015;
        }
        Bitmap bitmapM32014 = c13190.m32014(i, i2, j);
        if (bitmapM32014 != null) {
            boolean z = c4724M13824.f14992;
            boolean z2 = c4724M13824.f14993;
            if (z && !z2) {
                return bitmapM32014;
            }
        }
        throw new IOException("MPEG-TS preview frame was not decoded");
    }

    @Override // l.InterfaceC12842
    /* JADX INFO: renamed from: ᩳ */
    public final C13547 mo9072() {
        C8353 c8353 = this.f74200;
        if (c8353 == null) {
            return null;
        }
        return C1841.m6125(c8353.f25633, c8353.f25609, c8353.f25599, c8353.f25636);
    }

    @Override // l.InterfaceC12842
    /* JADX INFO: renamed from: ܽ */
    public final void mo9071() {
        m51231();
    }

    @Override // l.InterfaceC12842
    /* JADX INFO: renamed from: ֫ */
    public final void mo9069() {
        if (this.f74202) {
            return;
        }
        this.f74202 = true;
        m51231();
        this.f74199.m32016();
        this.f74200 = null;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m51231() {
        C4724 c4724 = this.f74201;
        this.f74201 = null;
        if (c4724 != null) {
            C4724.m13834(c4724);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0054  */
    /* JADX WARN: Code duplicated, block: B:22:0x0056  */
    /* JADX WARN: Code duplicated, block: B:35:0x007f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0082  */
    @Override // l.InterfaceC12842
    /* JADX INFO: renamed from: ֫ */
    public final Bitmap mo9068(long j, int i, int i2, InterfaceC19899 interfaceC19899) throws IOException {
        Exception exc;
        C4724 c4724;
        String str;
        if (!this.f74202 && !Thread.currentThread().isInterrupted()) {
            interfaceC19899.mo21195();
            int iMax = Math.max(1, i);
            int iMax2 = Math.max(1, i2);
            long jMax = Math.max(0L, Math.min(j, this.f74203)) / 1000000;
            Bitmap bitmapM32015 = this.f74199.m32015(new C12485(iMax, iMax2, jMax));
            if (bitmapM32015 != null) {
                return bitmapM32015;
            }
            try {
                return m51230(jMax, iMax, iMax2, interfaceC19899);
            } catch (InterruptedIOException e) {
                m51231();
                throw e;
            } catch (IOException e2) {
                e = e2;
                exc = e;
                if (!this.f74206 && m51229(exc)) {
                    c4724 = this.f74201;
                    if (c4724 == null) {
                        str = null;
                    } else {
                        str = c4724.f14990;
                    }
                    this.f74205 = str;
                    m51231();
                    this.f74206 = true;
                    try {
                        return m51230(jMax, iMax, iMax2, interfaceC19899);
                    } catch (InterruptedIOException e3) {
                        m51231();
                        throw e3;
                    } catch (IOException e4) {
                        e = e4;
                        e.addSuppressed(exc);
                        exc = e;
                        m51231();
                        if (exc instanceof IOException) {
                            throw ((IOException) exc);
                        }
                        throw new IOException("MPEG-TS preview decode failed", exc);
                    } catch (RuntimeException e5) {
                        e = e5;
                        e.addSuppressed(exc);
                        exc = e;
                        m51231();
                        if (exc instanceof IOException) {
                            throw ((IOException) exc);
                        }
                        throw new IOException("MPEG-TS preview decode failed", exc);
                    }
                }
                m51231();
                if (exc instanceof IOException) {
                    throw ((IOException) exc);
                }
                throw new IOException("MPEG-TS preview decode failed", exc);
            } catch (RuntimeException e6) {
                e = e6;
                exc = e;
                if (!this.f74206) {
                    c4724 = this.f74201;
                    if (c4724 == null) {
                        str = null;
                    } else {
                        str = c4724.f14990;
                    }
                    this.f74205 = str;
                    m51231();
                    this.f74206 = true;
                    return m51230(jMax, iMax, iMax2, interfaceC19899);
                }
                m51231();
                if (exc instanceof IOException) {
                    throw ((IOException) exc);
                }
                throw new IOException("MPEG-TS preview decode failed", exc);
            }
        }
        throw new InterruptedIOException("MPEG-TS frame source was closed");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m51228(MediaCodec mediaCodec, boolean z) {
        if (mediaCodec == null) {
            return;
        }
        if (z) {
            try {
                int i = Build.VERSION.SDK_INT;
                if (i >= 30 && i < 33) {
                    mediaCodec.stop();
                }
            } catch (Throwable unused) {
            }
        }
        try {
            mediaCodec.release();
        } catch (Throwable unused2) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0222  */
    /* JADX WARN: Code duplicated, block: B:101:0x0225  */
    /* JADX WARN: Code duplicated, block: B:104:0x0233  */
    /* JADX WARN: Code duplicated, block: B:105:0x0236  */
    /* JADX WARN: Code duplicated, block: B:108:0x023e  */
    /* JADX WARN: Code duplicated, block: B:109:0x0241  */
    /* JADX WARN: Code duplicated, block: B:112:0x024e  */
    /* JADX WARN: Code duplicated, block: B:113:0x0251  */
    /* JADX WARN: Code duplicated, block: B:60:0x0129  */
    /* JADX WARN: Code duplicated, block: B:65:0x0139  */
    /* JADX WARN: Code duplicated, block: B:68:0x0141  */
    /* JADX WARN: Code duplicated, block: B:70:0x0159  */
    /* JADX WARN: Code duplicated, block: B:72:0x0175  */
    /* JADX WARN: Code duplicated, block: B:74:0x0179  */
    /* JADX WARN: Code duplicated, block: B:76:0x017d  */
    /* JADX WARN: Code duplicated, block: B:77:0x0184  */
    /* JADX WARN: Code duplicated, block: B:78:0x0193  */
    /* JADX WARN: Code duplicated, block: B:79:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:82:0x01d9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x01db  */
    /* JADX WARN: Code duplicated, block: B:84:0x01de  */
    /* JADX WARN: Code duplicated, block: B:87:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:88:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:91:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:92:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:95:0x0202  */
    /* JADX WARN: Code duplicated, block: B:96:0x0205  */
    /* JADX WARN: Code duplicated, block: B:98:0x0215  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Bitmap m51225(Image image, int i, int i2, C8353 c8353, boolean z, MediaFormat mediaFormat) throws IOException {
        C11780 c11780;
        int iRound;
        int iRound2;
        Rect rect;
        MediaFormat mediaFormat2;
        int i3;
        boolean z2;
        boolean z3;
        int[] iArr;
        int i4;
        int iMin;
        int i5;
        int iMin2;
        int i6;
        int iWidth;
        int iHeight;
        int iM28822;
        int i7;
        int i8;
        int i9;
        int iM51496;
        int i10;
        int i11;
        int i12;
        int iM51497;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        if (image.getFormat() != 35 || image.getPlanes().length < 3) {
            throw new IOException("Unsupported MPEG-TS decoder image format");
        }
        Rect cropRect = image.getCropRect();
        if (cropRect.width() <= 0 || cropRect.height() <= 0) {
            throw new IOException("Invalid MPEG-TS decoder crop rectangle");
        }
        C11780 c11781 = new C11780(image.getPlanes()[0]);
        C11780 c11782 = new C11780(image.getPlanes()[1]);
        C11780 c11783 = new C11780(image.getPlanes()[2]);
        int i18 = ((c8353.f25599 % 360) + 360) % 360;
        if (i18 != 90 && i18 != 180 && i18 != 270) {
            i18 = 0;
        }
        boolean z4 = i18 == 90 || i18 == 270;
        int iHeight2 = z4 ? cropRect.height() : cropRect.width();
        int iWidth2 = z4 ? cropRect.width() : cropRect.height();
        float f = c8353.f25636;
        if (f <= 0.0f || Float.isInfinite(f)) {
            f = 1.0f;
        }
        float f2 = z4 ? 1.0f : f;
        if (!z4) {
            f = 1.0f;
        }
        if (!z) {
            rect = new Rect(0, 0, iHeight2, iWidth2);
            c11780 = c11783;
        } else {
            double d = f2;
            double d2 = iWidth2;
            c11780 = c11783;
            double d3 = f;
            double d4 = (((double) iHeight2) * d) / (d2 * d3);
            int i19 = iWidth2;
            float f3 = f2;
            double d5 = ((double) i) / ((double) i2);
            if (d4 > d5) {
                iRound = (int) Math.round(((d2 * d5) * d3) / d);
            } else {
                if (d4 < d5) {
                    iRound2 = (int) Math.round(((double) (iHeight2 * f3)) / (d5 * d3));
                    iRound = iHeight2;
                } else {
                    iRound = iHeight2;
                }
                int iMax = Math.max(1, Math.min(iHeight2, iRound));
                int iMax2 = Math.max(1, Math.min(i19, iRound2));
                int i20 = (iHeight2 - iMax) / 2;
                int i21 = (i19 - iMax2) / 2;
                rect = new Rect(i20, i21, iMax + i20, iMax2 + i21);
            }
            iRound2 = i19;
            int iMax3 = Math.max(1, Math.min(iHeight2, iRound));
            int iMax4 = Math.max(1, Math.min(i19, iRound2));
            int i22 = (iHeight2 - iMax3) / 2;
            int i23 = (i19 - iMax4) / 2;
            rect = new Rect(i22, i23, iMax3 + i22, iMax4 + i23);
        }
        int i24 = Build.VERSION.SDK_INT;
        if (i24 >= 24) {
            mediaFormat2 = mediaFormat;
            if (mediaFormat2.containsKey("color-range")) {
                i3 = 1;
                z2 = mediaFormat2.getInteger("color-range") == 1;
                if (i24 < 24 && mediaFormat2.containsKey("color-standard") && mediaFormat2.getInteger("color-standard") == i3) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                iArr = new int[i * i2];
                i4 = 0;
                while (i4 < i2) {
                    iMin = Math.min(rect.bottom - i3, rect.top + ((int) ((((long) i4) * ((long) rect.height())) / ((long) i2))));
                    i5 = 0;
                    while (i5 < i) {
                        iMin2 = Math.min(rect.right - 1, rect.left + ((int) ((((long) i5) * ((long) rect.width())) / ((long) i))));
                        i6 = i18;
                        if (i6 == 90) {
                            iWidth = cropRect.left + iMin;
                            iHeight = ((cropRect.height() + cropRect.top) - 1) - iMin2;
                        } else if (i6 == 180) {
                            iWidth = ((cropRect.width() + cropRect.left) - 1) - iMin2;
                            iHeight = ((cropRect.height() + cropRect.top) - 1) - iMin;
                        } else if (i6 == 270) {
                            iWidth = ((cropRect.width() + cropRect.left) - 1) - iMin;
                            iHeight = iMin2 + cropRect.top;
                        } else {
                            iWidth = cropRect.left + iMin2;
                            iHeight = cropRect.top + iMin;
                        }
                        C11780 c11784 = c11781;
                        iM28822 = C11780.m28822(c11784, iWidth, iHeight);
                        int i25 = iWidth / 2;
                        int i26 = iHeight / 2;
                        C11780 c11785 = c11782;
                        int iM28823 = C11780.m28822(c11785, i25, i26);
                        Rect rect2 = rect;
                        int iM28824 = C11780.m28822(c11780, i25, i26);
                        int i27 = (i4 * i) + i5;
                        i7 = iM28823 + a.g;
                        i8 = iM28824 + a.g;
                        if (z2) {
                            if (z3) {
                                i14 = 403;
                            } else {
                                i14 = 359;
                            }
                            int i28 = ((i14 * i8) >> 8) + iM28822;
                            if (z3) {
                                i15 = 48;
                            } else {
                                i15 = 88;
                            }
                            int i29 = iM28822 - ((i15 * i7) >> 8);
                            if (z3) {
                                i16 = UMErrorCode.E_UM_BE_NOT_MAINPROCESS;
                            } else {
                                i16 = 183;
                            }
                            int i30 = i29 - ((i16 * i8) >> 8);
                            if (z3) {
                                i17 = 475;
                            } else {
                                i17 = 454;
                            }
                            iM51497 = iM28822 + ((i17 * i7) >> 8);
                            iM51496 = i28;
                            i13 = i30;
                        } else {
                            int iMax5 = Math.max(0, iM28822 - 16) * 298;
                            if (z3) {
                                i9 = 459;
                            } else {
                                i9 = 409;
                            }
                            iM51496 = C23202.m51496(i9, i8, iMax5, 128) >> 8;
                            if (z3) {
                                i10 = 55;
                            } else {
                                i10 = 100;
                            }
                            int i31 = iMax5 - (i10 * i7);
                            if (z3) {
                                i11 = 136;
                            } else {
                                i11 = 208;
                            }
                            int i32 = ((i31 - (i11 * i8)) + 128) >> 8;
                            if (z3) {
                                i12 = 541;
                            } else {
                                i12 = 516;
                            }
                            iM51497 = C23202.m51496(i12, i7, iMax5, 128) >> 8;
                            i13 = i32;
                        }
                        iArr[i27] = (Math.max(0, Math.min(255, i13)) << 8) | (Math.max(0, Math.min(255, iM51496)) << 16) | (-16777216) | Math.max(0, Math.min(255, iM51497));
                        i5++;
                        z2 = z2;
                        i18 = i6;
                        cropRect = cropRect;
                        rect = rect2;
                        c11781 = c11784;
                        c11782 = c11785;
                    }
                    i4++;
                    i3 = 1;
                    i18 = i18;
                    c11781 = c11781;
                    c11782 = c11782;
                }
                return Bitmap.createBitmap(iArr, i, i2, Bitmap.Config.ARGB_8888);
            }
            if (i24 < 24) {
                z3 = false;
            } else {
                z3 = false;
            }
            iArr = new int[i * i2];
            i4 = 0;
            while (i4 < i2) {
                iMin = Math.min(rect.bottom - i3, rect.top + ((int) ((((long) i4) * ((long) rect.height())) / ((long) i2))));
                i5 = 0;
                while (i5 < i) {
                    iMin2 = Math.min(rect.right - 1, rect.left + ((int) ((((long) i5) * ((long) rect.width())) / ((long) i))));
                    i6 = i18;
                    if (i6 == 90) {
                        iWidth = cropRect.left + iMin;
                        iHeight = ((cropRect.height() + cropRect.top) - 1) - iMin2;
                    } else if (i6 == 180) {
                        iWidth = ((cropRect.width() + cropRect.left) - 1) - iMin2;
                        iHeight = ((cropRect.height() + cropRect.top) - 1) - iMin;
                    } else if (i6 == 270) {
                        iWidth = ((cropRect.width() + cropRect.left) - 1) - iMin;
                        iHeight = iMin2 + cropRect.top;
                    } else {
                        iWidth = cropRect.left + iMin2;
                        iHeight = cropRect.top + iMin;
                    }
                    C11780 c11786 = c11781;
                    iM28822 = C11780.m28822(c11786, iWidth, iHeight);
                    int i210 = iWidth / 2;
                    int i211 = iHeight / 2;
                    C11780 c11787 = c11782;
                    int iM28825 = C11780.m28822(c11787, i210, i211);
                    Rect rect3 = rect;
                    int iM28826 = C11780.m28822(c11780, i210, i211);
                    int i212 = (i4 * i) + i5;
                    i7 = iM28825 + a.g;
                    i8 = iM28826 + a.g;
                    if (z2) {
                        if (z3) {
                            i14 = 403;
                        } else {
                            i14 = 359;
                        }
                        int i213 = ((i14 * i8) >> 8) + iM28822;
                        if (z3) {
                            i15 = 48;
                        } else {
                            i15 = 88;
                        }
                        int i214 = iM28822 - ((i15 * i7) >> 8);
                        if (z3) {
                            i16 = UMErrorCode.E_UM_BE_NOT_MAINPROCESS;
                        } else {
                            i16 = 183;
                        }
                        int i33 = i214 - ((i16 * i8) >> 8);
                        if (z3) {
                            i17 = 475;
                        } else {
                            i17 = 454;
                        }
                        iM51497 = iM28822 + ((i17 * i7) >> 8);
                        iM51496 = i213;
                        i13 = i33;
                    } else {
                        int iMax6 = Math.max(0, iM28822 - 16) * 298;
                        if (z3) {
                            i9 = 459;
                        } else {
                            i9 = 409;
                        }
                        iM51496 = C23202.m51496(i9, i8, iMax6, 128) >> 8;
                        if (z3) {
                            i10 = 55;
                        } else {
                            i10 = 100;
                        }
                        int i34 = iMax6 - (i10 * i7);
                        if (z3) {
                            i11 = 136;
                        } else {
                            i11 = 208;
                        }
                        int i35 = ((i34 - (i11 * i8)) + 128) >> 8;
                        if (z3) {
                            i12 = 541;
                        } else {
                            i12 = 516;
                        }
                        iM51497 = C23202.m51496(i12, i7, iMax6, 128) >> 8;
                        i13 = i35;
                    }
                    iArr[i212] = (Math.max(0, Math.min(255, i13)) << 8) | (Math.max(0, Math.min(255, iM51496)) << 16) | (-16777216) | Math.max(0, Math.min(255, iM51497));
                    i5++;
                    z2 = z2;
                    i18 = i6;
                    cropRect = cropRect;
                    rect = rect3;
                    c11781 = c11786;
                    c11782 = c11787;
                }
                i4++;
                i3 = 1;
                i18 = i18;
                c11781 = c11781;
                c11782 = c11782;
            }
            return Bitmap.createBitmap(iArr, i, i2, Bitmap.Config.ARGB_8888);
        }
        mediaFormat2 = mediaFormat;
        i3 = 1;
        if (i24 < 24) {
            z3 = false;
        } else {
            z3 = false;
        }
        iArr = new int[i * i2];
        i4 = 0;
        while (i4 < i2) {
            iMin = Math.min(rect.bottom - i3, rect.top + ((int) ((((long) i4) * ((long) rect.height())) / ((long) i2))));
            i5 = 0;
            while (i5 < i) {
                iMin2 = Math.min(rect.right - 1, rect.left + ((int) ((((long) i5) * ((long) rect.width())) / ((long) i))));
                i6 = i18;
                if (i6 == 90) {
                    iWidth = cropRect.left + iMin;
                    iHeight = ((cropRect.height() + cropRect.top) - 1) - iMin2;
                } else if (i6 == 180) {
                    iWidth = ((cropRect.width() + cropRect.left) - 1) - iMin2;
                    iHeight = ((cropRect.height() + cropRect.top) - 1) - iMin;
                } else if (i6 == 270) {
                    iWidth = ((cropRect.width() + cropRect.left) - 1) - iMin;
                    iHeight = iMin2 + cropRect.top;
                } else {
                    iWidth = cropRect.left + iMin2;
                    iHeight = cropRect.top + iMin;
                }
                C11780 c11788 = c11781;
                iM28822 = C11780.m28822(c11788, iWidth, iHeight);
                int i215 = iWidth / 2;
                int i216 = iHeight / 2;
                C11780 c11789 = c11782;
                int iM28827 = C11780.m28822(c11789, i215, i216);
                Rect rect4 = rect;
                int iM28828 = C11780.m28822(c11780, i215, i216);
                int i217 = (i4 * i) + i5;
                i7 = iM28827 + a.g;
                i8 = iM28828 + a.g;
                if (z2) {
                    if (z3) {
                        i14 = 403;
                    } else {
                        i14 = 359;
                    }
                    int i218 = ((i14 * i8) >> 8) + iM28822;
                    if (z3) {
                        i15 = 48;
                    } else {
                        i15 = 88;
                    }
                    int i219 = iM28822 - ((i15 * i7) >> 8);
                    if (z3) {
                        i16 = UMErrorCode.E_UM_BE_NOT_MAINPROCESS;
                    } else {
                        i16 = 183;
                    }
                    int i36 = i219 - ((i16 * i8) >> 8);
                    if (z3) {
                        i17 = 475;
                    } else {
                        i17 = 454;
                    }
                    iM51497 = iM28822 + ((i17 * i7) >> 8);
                    iM51496 = i218;
                    i13 = i36;
                } else {
                    int iMax7 = Math.max(0, iM28822 - 16) * 298;
                    if (z3) {
                        i9 = 459;
                    } else {
                        i9 = 409;
                    }
                    iM51496 = C23202.m51496(i9, i8, iMax7, 128) >> 8;
                    if (z3) {
                        i10 = 55;
                    } else {
                        i10 = 100;
                    }
                    int i37 = iMax7 - (i10 * i7);
                    if (z3) {
                        i11 = 136;
                    } else {
                        i11 = 208;
                    }
                    int i38 = ((i37 - (i11 * i8)) + 128) >> 8;
                    if (z3) {
                        i12 = 541;
                    } else {
                        i12 = 516;
                    }
                    iM51497 = C23202.m51496(i12, i7, iMax7, 128) >> 8;
                    i13 = i38;
                }
                iArr[i217] = (Math.max(0, Math.min(255, i13)) << 8) | (Math.max(0, Math.min(255, iM51496)) << 16) | (-16777216) | Math.max(0, Math.min(255, iM51497));
                i5++;
                z2 = z2;
                i18 = i6;
                cropRect = cropRect;
                rect = rect4;
                c11781 = c11788;
                c11782 = c11789;
            }
            i4++;
            i3 = 1;
            i18 = i18;
            c11781 = c11781;
            c11782 = c11782;
        }
        return Bitmap.createBitmap(iArr, i, i2, Bitmap.Config.ARGB_8888);
    }
}
