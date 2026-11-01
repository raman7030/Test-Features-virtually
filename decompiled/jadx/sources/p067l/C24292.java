package p067l;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.media.Image;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Build;
import com.alipay.sdk.p010m.p041p.C0184a;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.IOException;
import java.io.InterruptedIOException;

/* JADX INFO: renamed from: l.᩺ܶۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: A75O */
/* JADX INFO: loaded from: classes.dex */
public final class C24292 implements InterfaceC14573 {

    /* JADX INFO: renamed from: ۢ */
    public static final Uri f76942 = Uri.parse("mt-ts-preview:///media.ts");

    /* JADX INFO: renamed from: ᩷ */
    public static final /* synthetic */ int f76943 = 0;

    /* JADX INFO: renamed from: ֫ */
    public final C14904 f76944 = new C14904();

    /* JADX INFO: renamed from: ۜ */
    public C10307 f76945;

    /* JADX INFO: renamed from: ۧ */
    public C6858 f76946;

    /* JADX INFO: renamed from: ܳ */
    public boolean f76947;

    /* JADX INFO: renamed from: ܽ */
    public final long f76948;

    /* JADX INFO: renamed from: ܿ */
    public final C13823 f76949;

    /* JADX INFO: renamed from: ᩳ */
    public String f76950;

    /* JADX INFO: renamed from: ᩻ */
    public boolean f76951;

    @Override // p067l.InterfaceC14573
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo11122() {
        return true;
    }

    public C24292(C13823 c13823, long j) {
        this.f76949 = c13823;
        this.f76948 = j * 1000;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C24292 m53620(C13823 c13823, long j) throws IOException {
        if (!c13823.m31500() || j <= 0 || j > 10000) {
            throw new IOException("Unsupported MPEG-TS preview source");
        }
        return new C24292(c13823, j);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0084 A[Catch: all -> 0x005e, TryCatch #8 {all -> 0x005e, blocks: (B:5:0x001f, B:7:0x002c, B:35:0x006a, B:41:0x007b, B:39:0x0074, B:44:0x0084, B:45:0x0087, B:47:0x008b, B:48:0x008d, B:49:0x008e, B:50:0x0095, B:52:0x0097), top: B:59:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:47:0x008b A[Catch: all -> 0x005e, TryCatch #8 {all -> 0x005e, blocks: (B:5:0x001f, B:7:0x002c, B:35:0x006a, B:41:0x007b, B:39:0x0074, B:44:0x0084, B:45:0x0087, B:47:0x008b, B:48:0x008d, B:49:0x008e, B:50:0x0095, B:52:0x0097), top: B:59:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:49:0x008e A[Catch: all -> 0x005e, TryCatch #8 {all -> 0x005e, blocks: (B:5:0x001f, B:7:0x002c, B:35:0x006a, B:41:0x007b, B:39:0x0074, B:44:0x0084, B:45:0x0087, B:47:0x008b, B:48:0x008d, B:49:0x008e, B:50:0x0095, B:52:0x0097), top: B:59:0x001f }] */
    /* JADX INFO: renamed from: ֫ */
    public static Bitmap m53619(C13823 c13823, int i, InterfaceC21280 interfaceC21280) throws Throwable {
        Throwable th;
        if (!c13823.m31500()) {
            throw new IOException("Unsupported MPEG-TS thumbnail source");
        }
        int iMax = Math.max(1, i);
        C14234 c14234 = new C14234(iMax, iMax, 0L);
        C14904 c14904 = new C14904();
        String str = null;
        Exception exc = null;
        boolean z = false;
        C6858 c6858 = null;
        while (true) {
            try {
                try {
                    try {
                        interfaceC21280.mo23161();
                        th = exc;
                        try {
                            C6858 c6858M15704 = C6858.m15704(c13823, c14904, iMax, iMax, true, z, str, interfaceC21280);
                            try {
                                C6858.m15708(c6858M15704, 0L, interfaceC21280);
                                Bitmap bitmapM34113 = c14904.m34113(c14234);
                                if (bitmapM34113 == null) {
                                    throw new IOException("MPEG-TS thumbnail frame was not decoded");
                                }
                                C6858.m15714(c6858M15704);
                                c14904.m34114();
                                return bitmapM34113;
                            } catch (InterruptedIOException e) {
                                throw e;
                            } catch (IOException e2) {
                                e = e2;
                                c6858 = c6858M15704;
                                exc = e;
                                if (z && m53622(exc)) {
                                    str = c6858 == null ? null : c6858.f17821;
                                    if (c6858 != null) {
                                        C6858.m15714(c6858);
                                        c6858 = null;
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
                                c6858 = c6858M15704;
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
                                c6858 = c6858M15704;
                                if (c6858 != null) {
                                    C6858.m15714(c6858);
                                }
                                c14904.m34114();
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

    /* JADX INFO: renamed from: ֫ */
    public static boolean m53622(Exception exc) {
        for (Throwable cause = exc; cause != null; cause = cause.getCause()) {
            if ((cause instanceof C5517) || (cause instanceof C23622) || (cause instanceof C21611) || (cause instanceof MediaCodec.CodecException)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ */
    private Bitmap m53623(long j, int i, int i2, InterfaceC21280 interfaceC21280) throws IOException {
        C6858 c6858M15704 = this.f76946;
        if (c6858M15704 != null && (!C6858.m15711(c6858M15704, i, i2) || c6858M15704.f17822 > j)) {
            m53624();
            c6858M15704 = null;
        }
        if (c6858M15704 == null) {
            c6858M15704 = C6858.m15704(this.f76949, this.f76944, i, i2, false, this.f76951, this.f76950, interfaceC21280);
            this.f76946 = c6858M15704;
            this.f76945 = c6858M15704.f17825;
        }
        C6858.m15708(c6858M15704, j, interfaceC21280);
        C14234 c14234 = new C14234(i, i2, j);
        C14904 c14904 = this.f76944;
        Bitmap bitmapM34113 = c14904.m34113(c14234);
        if (bitmapM34113 != null) {
            return bitmapM34113;
        }
        Bitmap bitmapM34112 = c14904.m34112(i, i2, j);
        if (bitmapM34112 != null) {
            boolean z = c6858M15704.f17823;
            boolean z2 = c6858M15704.f17824;
            if (z && !z2) {
                return bitmapM34112;
            }
        }
        throw new IOException("MPEG-TS preview frame was not decoded");
    }

    @Override // p067l.InterfaceC14573
    /* JADX INFO: renamed from: ᩳ */
    public final C15243 mo11124() {
        C10307 c10307 = this.f76945;
        if (c10307 == null) {
            return null;
        }
        return C4118.m8323(c10307.f28547, c10307.f28523, c10307.f28513, c10307.f28550);
    }

    @Override // p067l.InterfaceC14573
    /* JADX INFO: renamed from: ܽ */
    public final void mo11123() {
        m53624();
    }

    @Override // p067l.InterfaceC14573
    /* JADX INFO: renamed from: ֫ */
    public final void mo11121() {
        if (this.f76947) {
            return;
        }
        this.f76947 = true;
        m53624();
        this.f76944.m34114();
        this.f76945 = null;
    }

    /* JADX INFO: renamed from: ܳ */
    private void m53624() {
        C6858 c6858 = this.f76946;
        this.f76946 = null;
        if (c6858 != null) {
            C6858.m15714(c6858);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0054  */
    /* JADX WARN: Code duplicated, block: B:22:0x0056  */
    /* JADX WARN: Code duplicated, block: B:35:0x007f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0082  */
    @Override // p067l.InterfaceC14573
    /* JADX INFO: renamed from: ֫ */
    public final Bitmap mo11120(long j, int i, int i2, InterfaceC21280 interfaceC21280) throws IOException {
        Exception exc;
        C6858 c6858;
        String str;
        if (!this.f76947 && !Thread.currentThread().isInterrupted()) {
            interfaceC21280.mo23161();
            int iMax = Math.max(1, i);
            int iMax2 = Math.max(1, i2);
            long jMax = Math.max(0L, Math.min(j, this.f76948)) / 1000000;
            Bitmap bitmapM34113 = this.f76944.m34113(new C14234(iMax, iMax2, jMax));
            if (bitmapM34113 != null) {
                return bitmapM34113;
            }
            try {
                return m53623(jMax, iMax, iMax2, interfaceC21280);
            } catch (InterruptedIOException e) {
                m53624();
                throw e;
            } catch (IOException e2) {
                e = e2;
                exc = e;
                if (!this.f76951 && m53622(exc)) {
                    c6858 = this.f76946;
                    if (c6858 == null) {
                        str = null;
                    } else {
                        str = c6858.f17821;
                    }
                    this.f76950 = str;
                    m53624();
                    this.f76951 = true;
                    try {
                        return m53623(jMax, iMax, iMax2, interfaceC21280);
                    } catch (InterruptedIOException e3) {
                        m53624();
                        throw e3;
                    } catch (IOException e4) {
                        e = e4;
                        e.addSuppressed(exc);
                        exc = e;
                        m53624();
                        if (exc instanceof IOException) {
                            throw ((IOException) exc);
                        }
                        throw new IOException("MPEG-TS preview decode failed", exc);
                    } catch (RuntimeException e5) {
                        e = e5;
                        e.addSuppressed(exc);
                        exc = e;
                        m53624();
                        if (exc instanceof IOException) {
                            throw ((IOException) exc);
                        }
                        throw new IOException("MPEG-TS preview decode failed", exc);
                    }
                }
                m53624();
                if (exc instanceof IOException) {
                    throw ((IOException) exc);
                }
                throw new IOException("MPEG-TS preview decode failed", exc);
            } catch (RuntimeException e6) {
                e = e6;
                exc = e;
                if (!this.f76951) {
                    c6858 = this.f76946;
                    if (c6858 == null) {
                        str = null;
                    } else {
                        str = c6858.f17821;
                    }
                    this.f76950 = str;
                    m53624();
                    this.f76951 = true;
                    return m53623(jMax, iMax, iMax2, interfaceC21280);
                }
                m53624();
                if (exc instanceof IOException) {
                    throw ((IOException) exc);
                }
                throw new IOException("MPEG-TS preview decode failed", exc);
            }
        }
        throw new InterruptedIOException("MPEG-TS frame source was closed");
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m53621(MediaCodec mediaCodec, boolean z) {
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
    /* JADX INFO: renamed from: ֫ */
    public static Bitmap m53618(Image image, int i, int i2, C10307 c10307, boolean z, MediaFormat mediaFormat) throws IOException {
        C13564 c13564;
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
        int iM30870;
        int i7;
        int i8;
        int i9;
        int iM53892;
        int i10;
        int i11;
        int i12;
        int iM53893;
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
        C13564 c13565 = new C13564(image.getPlanes()[0]);
        C13564 c13566 = new C13564(image.getPlanes()[1]);
        C13564 c13567 = new C13564(image.getPlanes()[2]);
        int i18 = ((c10307.f28513 % 360) + 360) % 360;
        if (i18 != 90 && i18 != 180 && i18 != 270) {
            i18 = 0;
        }
        boolean z4 = i18 == 90 || i18 == 270;
        int iHeight2 = z4 ? cropRect.height() : cropRect.width();
        int iWidth2 = z4 ? cropRect.width() : cropRect.height();
        float f = c10307.f28550;
        if (f <= 0.0f || Float.isInfinite(f)) {
            f = 1.0f;
        }
        float f2 = z4 ? 1.0f : f;
        if (!z4) {
            f = 1.0f;
        }
        if (!z) {
            rect = new Rect(0, 0, iHeight2, iWidth2);
            c13564 = c13567;
        } else {
            double d = f2;
            double d2 = iWidth2;
            c13564 = c13567;
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
                        C13564 c13568 = c13565;
                        iM30870 = C13564.m30870(c13568, iWidth, iHeight);
                        int i25 = iWidth / 2;
                        int i26 = iHeight / 2;
                        C13564 c13569 = c13566;
                        int iM30871 = C13564.m30870(c13569, i25, i26);
                        Rect rect2 = rect;
                        int iM30872 = C13564.m30870(c13564, i25, i26);
                        int i27 = (i4 * i) + i5;
                        i7 = iM30871 + C0184a.f879g;
                        i8 = iM30872 + C0184a.f879g;
                        if (z2) {
                            if (z3) {
                                i14 = 403;
                            } else {
                                i14 = 359;
                            }
                            int i28 = ((i14 * i8) >> 8) + iM30870;
                            if (z3) {
                                i15 = 48;
                            } else {
                                i15 = 88;
                            }
                            int i29 = iM30870 - ((i15 * i7) >> 8);
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
                            iM53893 = iM30870 + ((i17 * i7) >> 8);
                            iM53892 = i28;
                            i13 = i30;
                        } else {
                            int iMax5 = Math.max(0, iM30870 - 16) * 298;
                            if (z3) {
                                i9 = 459;
                            } else {
                                i9 = 409;
                            }
                            iM53892 = C24420.m53892(i9, i8, iMax5, 128) >> 8;
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
                            iM53893 = C24420.m53892(i12, i7, iMax5, 128) >> 8;
                            i13 = i32;
                        }
                        iArr[i27] = (Math.max(0, Math.min(255, i13)) << 8) | (Math.max(0, Math.min(255, iM53892)) << 16) | (-16777216) | Math.max(0, Math.min(255, iM53893));
                        i5++;
                        z2 = z2;
                        i18 = i6;
                        cropRect = cropRect;
                        rect = rect2;
                        c13565 = c13568;
                        c13566 = c13569;
                    }
                    i4++;
                    i3 = 1;
                    i18 = i18;
                    c13565 = c13565;
                    c13566 = c13566;
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
                    C13564 c135610 = c13565;
                    iM30870 = C13564.m30870(c135610, iWidth, iHeight);
                    int i210 = iWidth / 2;
                    int i211 = iHeight / 2;
                    C13564 c135611 = c13566;
                    int iM30873 = C13564.m30870(c135611, i210, i211);
                    Rect rect3 = rect;
                    int iM30874 = C13564.m30870(c13564, i210, i211);
                    int i212 = (i4 * i) + i5;
                    i7 = iM30873 + C0184a.f879g;
                    i8 = iM30874 + C0184a.f879g;
                    if (z2) {
                        if (z3) {
                            i14 = 403;
                        } else {
                            i14 = 359;
                        }
                        int i213 = ((i14 * i8) >> 8) + iM30870;
                        if (z3) {
                            i15 = 48;
                        } else {
                            i15 = 88;
                        }
                        int i214 = iM30870 - ((i15 * i7) >> 8);
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
                        iM53893 = iM30870 + ((i17 * i7) >> 8);
                        iM53892 = i213;
                        i13 = i33;
                    } else {
                        int iMax6 = Math.max(0, iM30870 - 16) * 298;
                        if (z3) {
                            i9 = 459;
                        } else {
                            i9 = 409;
                        }
                        iM53892 = C24420.m53892(i9, i8, iMax6, 128) >> 8;
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
                        iM53893 = C24420.m53892(i12, i7, iMax6, 128) >> 8;
                        i13 = i35;
                    }
                    iArr[i212] = (Math.max(0, Math.min(255, i13)) << 8) | (Math.max(0, Math.min(255, iM53892)) << 16) | (-16777216) | Math.max(0, Math.min(255, iM53893));
                    i5++;
                    z2 = z2;
                    i18 = i6;
                    cropRect = cropRect;
                    rect = rect3;
                    c13565 = c135610;
                    c13566 = c135611;
                }
                i4++;
                i3 = 1;
                i18 = i18;
                c13565 = c13565;
                c13566 = c13566;
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
                C13564 c135612 = c13565;
                iM30870 = C13564.m30870(c135612, iWidth, iHeight);
                int i215 = iWidth / 2;
                int i216 = iHeight / 2;
                C13564 c135613 = c13566;
                int iM30875 = C13564.m30870(c135613, i215, i216);
                Rect rect4 = rect;
                int iM30876 = C13564.m30870(c13564, i215, i216);
                int i217 = (i4 * i) + i5;
                i7 = iM30875 + C0184a.f879g;
                i8 = iM30876 + C0184a.f879g;
                if (z2) {
                    if (z3) {
                        i14 = 403;
                    } else {
                        i14 = 359;
                    }
                    int i218 = ((i14 * i8) >> 8) + iM30870;
                    if (z3) {
                        i15 = 48;
                    } else {
                        i15 = 88;
                    }
                    int i219 = iM30870 - ((i15 * i7) >> 8);
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
                    iM53893 = iM30870 + ((i17 * i7) >> 8);
                    iM53892 = i218;
                    i13 = i36;
                } else {
                    int iMax7 = Math.max(0, iM30870 - 16) * 298;
                    if (z3) {
                        i9 = 459;
                    } else {
                        i9 = 409;
                    }
                    iM53892 = C24420.m53892(i9, i8, iMax7, 128) >> 8;
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
                    iM53893 = C24420.m53892(i12, i7, iMax7, 128) >> 8;
                    i13 = i38;
                }
                iArr[i217] = (Math.max(0, Math.min(255, i13)) << 8) | (Math.max(0, Math.min(255, iM53892)) << 16) | (-16777216) | Math.max(0, Math.min(255, iM53893));
                i5++;
                z2 = z2;
                i18 = i6;
                cropRect = cropRect;
                rect = rect4;
                c13565 = c135612;
                c13566 = c135613;
            }
            i4++;
            i3 = 1;
            i18 = i18;
            c13565 = c13565;
            c13566 = c13566;
        }
        return Bitmap.createBitmap(iArr, i, i2, Bitmap.Config.ARGB_8888);
    }
}
