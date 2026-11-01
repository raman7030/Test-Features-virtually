package p067l;

import android.graphics.Bitmap;
import android.media.Image;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.view.Surface;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.nio.ByteBuffer;
import java.util.Locale;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.ۙܶۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: A75O */
/* JADX INFO: loaded from: classes2.dex */
public final class C6858 {

    /* JADX INFO: renamed from: ֡ */
    public int f17805;

    /* JADX INFO: renamed from: ֫ */
    public final C14904 f17807;

    /* JADX INFO: renamed from: ۖ */
    public long f17808;

    /* JADX INFO: renamed from: ۘ */
    public final int f17809;

    /* JADX INFO: renamed from: ۚ */
    public final int f17810;

    /* JADX INFO: renamed from: ۠ */
    public final int f17812;

    /* JADX INFO: renamed from: ۡ */
    public int f17813;

    /* JADX INFO: renamed from: ۢ */
    public boolean f17814;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f17815;

    /* JADX INFO: renamed from: ܳ */
    public MediaFormat f17816;

    /* JADX INFO: renamed from: ܶ */
    public int f17817;

    /* JADX INFO: renamed from: ܽ */
    public final MediaCodec f17819;

    /* JADX INFO: renamed from: ܿ */
    public boolean f17820;

    /* JADX INFO: renamed from: ᩳ */
    public final String f17821;

    /* JADX INFO: renamed from: ᩴ */
    public long f17822;

    /* JADX INFO: renamed from: ᩵ */
    public boolean f17823;

    /* JADX INFO: renamed from: ᩷ */
    public boolean f17824;

    /* JADX INFO: renamed from: ᩸ */
    public final C10307 f17825;

    /* JADX INFO: renamed from: ᩻ */
    public final C19263 f17826;

    /* JADX INFO: renamed from: ֨ */
    public final MediaCodec.BufferInfo f17806 = new MediaCodec.BufferInfo();

    /* JADX INFO: renamed from: ۜ */
    public long f17811 = -9223372036854775807L;

    /* JADX INFO: renamed from: ܺ */
    public long f17818 = -9223372036854775807L;

    public C6858(C14904 c14904, C19263 c19263, MediaCodec mediaCodec, String str, MediaFormat mediaFormat, C10307 c10307, int i, int i2, boolean z, boolean z2) {
        this.f17807 = c14904;
        this.f17826 = c19263;
        this.f17819 = mediaCodec;
        this.f17821 = str;
        this.f17816 = mediaFormat;
        this.f17825 = c10307;
        this.f17812 = i;
        this.f17810 = i2;
        this.f17815 = z;
        this.f17809 = z2 ? 1000 : 250;
        this.f17820 = true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C6858 m15704(C13823 c13823, C14904 c14904, int i, int i2, boolean z, boolean z2, String str, InterfaceC21280 interfaceC21280) throws IOException {
        String name;
        int i3;
        interfaceC21280.mo23161();
        C19263 c19263 = new C19263(new C18426(), new C8199(c13823, interfaceC21280));
        MediaCodec mediaCodec = null;
        boolean z3 = false;
        try {
            c19263.m43895(C24292.f76942);
            interfaceC21280.mo23161();
            int i4 = 0;
            while (true) {
                if (i4 >= c19263.m43900()) {
                    i4 = -1;
                    break;
                }
                String string = c19263.m43893(i4).getString("mime");
                if (string != null && C11669.m26816(string)) {
                    break;
                }
                i4++;
            }
            if (i4 < 0) {
                throw new IOException("Missing MPEG-TS video track");
            }
            MediaFormat mediaFormatM43893 = c19263.m43893(i4);
            C10307 c10307M33422 = C14627.m33422(mediaFormatM43893);
            String str2 = c10307M33422.f28528;
            if (str2 == null || !C11669.m26816(str2)) {
                throw new IOException("Unsupported MPEG-TS video format");
            }
            m15707(mediaFormatM43893);
            c19263.m43897(i4);
            mediaFormatM43893.setInteger("color-format", 2135033992);
            int i5 = c10307M33422.f28547;
            mediaFormatM43893.setInteger("max-input-size", (int) Math.min(X931RNG.BLOCK128_RESEED_MAX, Math.max(2097152L, (i5 <= 0 || (i3 = c10307M33422.f28523) <= 0) ? 0L : (((long) i5) * ((long) i3)) / 2)));
            MediaCodec mediaCodecM15702 = m15702(c10307M33422, mediaFormatM43893, z2, str, interfaceC21280);
            try {
                if (Build.VERSION.SDK_INT >= 29) {
                    name = mediaCodecM15702.getCanonicalName();
                } else {
                    name = mediaCodecM15702.getName();
                }
                return new C6858(c14904, c19263, mediaCodecM15702, name, mediaFormatM43893, c10307M33422, i, i2, z, m15710(mediaCodecM15702, str2));
            } catch (IOException | RuntimeException e) {
                e = e;
                z3 = true;
                mediaCodec = mediaCodecM15702;
                C24292.m53621(mediaCodec, z3);
                c19263.m43899();
                if (e instanceof IOException) {
                    throw ((IOException) e);
                }
                throw new IOException("Failed to initialize MPEG-TS preview decoder", e);
            }
        } catch (IOException e2) {
            e = e2;
        } catch (RuntimeException e3) {
            e = e3;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m15710(MediaCodec mediaCodec, String str) {
        String name;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            return mediaCodec.getCodecInfo().isSoftwareOnly();
        }
        if (i >= 29) {
            name = mediaCodec.getCanonicalName();
        } else {
            name = mediaCodec.getName();
        }
        try {
            for (C18710 c18710 : C23404.m52069(str, false, false)) {
                if (c18710.f55902.equals(name)) {
                    return c18710.f55900;
                }
            }
        } catch (C7311 unused) {
        }
        String lowerCase = name.toLowerCase(Locale.ROOT);
        return lowerCase.startsWith("omx.google.") || lowerCase.startsWith("c2.android.") || lowerCase.startsWith("c2.google.");
    }

    /* JADX INFO: renamed from: ֫ */
    public static MediaCodec m15702(C10307 c10307, MediaFormat mediaFormat, boolean z, String str, InterfaceC21280 interfaceC21280) throws IOException {
        Throwable e;
        MediaCodec mediaCodecCreateByCodecName;
        String str2 = c10307.f28528;
        if (str2 == null) {
            throw new IOException("Missing MPEG-TS video MIME type");
        }
        MediaCodec mediaCodec = null;
        if (!z) {
            interfaceC21280.mo23161();
            try {
                MediaCodec mediaCodecCreateDecoderByType = MediaCodec.createDecoderByType(str2);
                try {
                    m15712(mediaCodecCreateDecoderByType, str2);
                    mediaCodecCreateDecoderByType.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 0);
                    mediaCodecCreateDecoderByType.start();
                    return mediaCodecCreateDecoderByType;
                } catch (IOException | RuntimeException e2) {
                    e = e2;
                    mediaCodec = mediaCodecCreateDecoderByType;
                    C24292.m53621(mediaCodec, false);
                    throw new C23622("Failed to initialize MPEG-TS preview decoder", e);
                }
            } catch (IOException e3) {
                e = e3;
            } catch (RuntimeException e4) {
                e = e4;
            }
        } else {
            try {
                Throwable th = null;
                for (C18710 c18710 : C23404.m52069(str2, false, false)) {
                    boolean z2 = c18710.f55900;
                    String str3 = c18710.f55902;
                    if (z2 && !str3.equals(str)) {
                        try {
                            interfaceC21280.mo23161();
                            if (c18710.m42700(c10307)) {
                                mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str3);
                                try {
                                    m15712(mediaCodecCreateByCodecName, str2);
                                    mediaCodecCreateByCodecName.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 0);
                                    mediaCodecCreateByCodecName.start();
                                    return mediaCodecCreateByCodecName;
                                } catch (InterruptedIOException e5) {
                                    e = e5;
                                    mediaCodec = mediaCodecCreateByCodecName;
                                } catch (IOException e6) {
                                    e = e6;
                                    C24292.m53621(mediaCodecCreateByCodecName, false);
                                    th = e;
                                } catch (RuntimeException e7) {
                                    e = e7;
                                    C24292.m53621(mediaCodecCreateByCodecName, false);
                                    th = e;
                                } catch (C7311 e8) {
                                    e = e8;
                                    C24292.m53621(mediaCodecCreateByCodecName, false);
                                    th = e;
                                }
                            }
                        } catch (InterruptedIOException e9) {
                            e = e9;
                        } catch (IOException e10) {
                            e = e10;
                            e = e;
                            mediaCodecCreateByCodecName = null;
                            C24292.m53621(mediaCodecCreateByCodecName, false);
                            th = e;
                        } catch (RuntimeException e11) {
                            e = e11;
                            e = e;
                            mediaCodecCreateByCodecName = null;
                            C24292.m53621(mediaCodecCreateByCodecName, false);
                            th = e;
                        } catch (C7311 e12) {
                            e = e12;
                            e = e;
                            mediaCodecCreateByCodecName = null;
                            C24292.m53621(mediaCodecCreateByCodecName, false);
                            th = e;
                        }
                        C24292.m53621(mediaCodec, false);
                        throw e;
                    }
                }
                if (th != null) {
                    throw new C23622("Failed to initialize software MPEG-TS preview decoder", th);
                }
                throw new IOException("Missing software MPEG-TS preview decoder");
            } catch (C7311 e13) {
                throw new IOException("Failed to query software video decoders", e13);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m15712(MediaCodec mediaCodec, String str) throws IOException {
        if (Build.VERSION.SDK_INT != 21) {
            return;
        }
        for (int i : mediaCodec.getCodecInfo().getCapabilitiesForType(str).colorFormats) {
            if (i == 2135033992) {
                return;
            }
        }
        throw new IOException("Decoder does not expose flexible YUV output");
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m15707(MediaFormat mediaFormat) throws IOException {
        if (Build.VERSION.SDK_INT < 24 || !mediaFormat.containsKey("color-transfer")) {
            return;
        }
        int integer = mediaFormat.getInteger("color-transfer");
        if (integer == 6 || integer == 7) {
            throw new IOException("HDR MPEG-TS preview is unsupported");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m15711(C6858 c6858, int i, int i2) {
        return c6858.f17812 == i && c6858.f17810 == i2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m15708(C6858 c6858, long j, InterfaceC21280 interfaceC21280) throws IOException {
        boolean z;
        C14234 c14234 = new C14234(c6858.f17812, c6858.f17810, j);
        while (c6858.f17807.m34113(c14234) == null && !c6858.f17823) {
            interfaceC21280.mo23161();
            boolean zM15709 = c6858.m15709(j, 0L, interfaceC21280);
            if (!c6858.f17814) {
                C19263 c19263 = c6858.f17826;
                MediaCodec mediaCodec = c6858.f17819;
                int iDequeueInputBuffer = mediaCodec.dequeueInputBuffer(2000L);
                if (iDequeueInputBuffer < 0) {
                    z = false;
                } else {
                    interfaceC21280.mo23161();
                    long jM43898 = c19263.m43898();
                    if (jM43898 < 0) {
                        c6858.m15705(iDequeueInputBuffer, false);
                    } else if (c6858.f17813 >= 1200) {
                        c6858.m15705(iDequeueInputBuffer, true);
                    } else {
                        if (c6858.f17811 == -9223372036854775807L) {
                            c6858.f17811 = jM43898;
                        }
                        long jMax = Math.max(0L, jM43898 - c6858.f17811);
                        if (jMax > 10000000) {
                            c6858.m15705(iDequeueInputBuffer, true);
                        } else {
                            ByteBuffer inputBuffer = mediaCodec.getInputBuffer(iDequeueInputBuffer);
                            if (inputBuffer == null) {
                                throw new IOException("Missing MPEG-TS decoder input buffer");
                            }
                            inputBuffer.clear();
                            try {
                                int iM43892 = c19263.m43892(inputBuffer);
                                if (iM43892 < 0) {
                                    c6858.m15705(iDequeueInputBuffer, false);
                                } else {
                                    c6858.f17819.queueInputBuffer(iDequeueInputBuffer, 0, iM43892, jMax, (c19263.m43896() & 1) != 0 ? 1 : 0);
                                    c6858.f17808 = jMax;
                                    c6858.f17813++;
                                    c19263.m43894();
                                }
                            } catch (RuntimeException e) {
                                throw new IOException("MPEG-TS access unit exceeds codec input buffer", e);
                            }
                        }
                    }
                    z = true;
                }
                zM15709 |= z;
            }
            if (c6858.m15709(j, 2000L, interfaceC21280) | zM15709) {
                c6858.f17817 = 0;
            } else {
                int i = c6858.f17817 + 1;
                c6858.f17817 = i;
                if (i >= c6858.f17809) {
                    throw new C5517("MPEG-TS preview decoder timed out: input=" + c6858.f17813 + ", inputEnded=" + c6858.f17814 + ", output=" + c6858.f17805 + ", lastOutputUs=" + c6858.f17818 + ", nextBucket=" + c6858.f17822);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m15705(int i, boolean z) {
        this.f17819.queueInputBuffer(i, 0, 0, this.f17808, 4);
        this.f17824 = z;
        this.f17814 = true;
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m15709(long j, long j2, InterfaceC21280 interfaceC21280) throws C21611 {
        MediaCodec mediaCodec = this.f17819;
        MediaCodec.BufferInfo bufferInfo = this.f17806;
        int iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, j2);
        if (iDequeueOutputBuffer == -1) {
            return false;
        }
        if (iDequeueOutputBuffer == -2) {
            try {
                this.f17816 = mediaCodec.getOutputFormat();
                return true;
            } catch (RuntimeException e) {
                throw new C21611("Failed to read MPEG-TS decoder output format", e);
            }
        }
        if (iDequeueOutputBuffer < 0) {
            return true;
        }
        try {
            interfaceC21280.mo23161();
            if ((bufferInfo.flags & 2) == 0 && bufferInfo.size > 0) {
                long jMin = Math.min(j, Math.max(0L, bufferInfo.presentationTimeUs) / 1000000);
                if (this.f17822 <= jMin) {
                    try {
                        Image outputImage = mediaCodec.getOutputImage(iDequeueOutputBuffer);
                        if (outputImage == null) {
                            throw new C21611("Decoder did not expose an output image");
                        }
                        m15706(outputImage, jMin);
                    } catch (RuntimeException e2) {
                        throw new C21611("Failed to obtain MPEG-TS decoder output image", e2);
                    }
                }
                this.f17805++;
                this.f17818 = bufferInfo.presentationTimeUs;
            }
            if ((bufferInfo.flags & 4) != 0) {
                this.f17823 = true;
            }
            mediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, false);
            return true;
        } catch (Throwable th) {
            mediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, false);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m15706(Image image, long j) throws C21611 {
        try {
            Bitmap bitmapM53618 = C24292.m53618(image, this.f17812, this.f17810, this.f17825, this.f17815, this.f17816);
            while (true) {
                long j2 = this.f17822;
                if (j2 > j) {
                    return;
                }
                C14234 c14234 = new C14234(this.f17812, this.f17810, j2);
                C14904 c14904 = this.f17807;
                if (c14904.m34113(c14234) == null) {
                    c14904.m34115(c14234, bitmapM53618);
                }
                this.f17822++;
            }
        } catch (IOException | RuntimeException e) {
            throw new C21611("Unsupported MPEG-TS decoder output image", e);
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public static void m15714(C6858 c6858) {
        C24292.m53621(c6858.f17819, c6858.f17820);
        c6858.f17820 = false;
        c6858.f17826.m43899();
    }
}
