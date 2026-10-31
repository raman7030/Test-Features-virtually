package l;

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
public final class C4724 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f14974;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13190 f14976;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f14977;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int f14978;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f14979;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final int f14981;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f14982;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f14983;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f14984;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public MediaFormat f14985;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f14986;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final MediaCodec f14988;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f14989;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f14990;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f14991;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public boolean f14992;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f14993;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C8353 f14994;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C17777 f14995;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final MediaCodec.BufferInfo f14975 = new MediaCodec.BufferInfo();

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f14980 = -9223372036854775807L;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f14987 = -9223372036854775807L;

    public C4724(C13190 c13190, C17777 c17777, MediaCodec mediaCodec, String str, MediaFormat mediaFormat, C8353 c8353, int i, int i2, boolean z, boolean z2) {
        this.f14976 = c13190;
        this.f14995 = c17777;
        this.f14988 = mediaCodec;
        this.f14990 = str;
        this.f14985 = mediaFormat;
        this.f14994 = c8353;
        this.f14981 = i;
        this.f14979 = i2;
        this.f14984 = z;
        this.f14978 = z2 ? 1000 : 250;
        this.f14989 = true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C4724 m13824(C12053 c12053, C13190 c13190, int i, int i2, boolean z, boolean z2, String str, InterfaceC19899 interfaceC19899) throws IOException {
        String name;
        int i3;
        interfaceC19899.mo21195();
        C17777 c17777 = new C17777(new C16895(), new C6135(c12053, interfaceC19899));
        MediaCodec mediaCodec = null;
        boolean z3 = false;
        try {
            c17777.m41649(C23068.f74197);
            interfaceC19899.mo21195();
            int i4 = 0;
            while (true) {
                if (i4 >= c17777.m41654()) {
                    i4 = -1;
                    break;
                }
                String string = c17777.m41647(i4).getString("mime");
                if (string != null && C9786.m24801(string)) {
                    break;
                }
                i4++;
            }
            if (i4 < 0) {
                throw new IOException("Missing MPEG-TS video track");
            }
            MediaFormat mediaFormatM41647 = c17777.m41647(i4);
            C8353 c8353M31336 = C12899.m31336(mediaFormatM41647);
            String str2 = c8353M31336.f25614;
            if (str2 == null || !C9786.m24801(str2)) {
                throw new IOException("Unsupported MPEG-TS video format");
            }
            m13827(mediaFormatM41647);
            c17777.m41651(i4);
            mediaFormatM41647.setInteger("color-format", 2135033992);
            int i5 = c8353M31336.f25633;
            mediaFormatM41647.setInteger("max-input-size", (int) Math.min(X931RNG.BLOCK128_RESEED_MAX, Math.max(2097152L, (i5 <= 0 || (i3 = c8353M31336.f25609) <= 0) ? 0L : (((long) i5) * ((long) i3)) / 2)));
            MediaCodec mediaCodecM13822 = m13822(c8353M31336, mediaFormatM41647, z2, str, interfaceC19899);
            try {
                if (Build.VERSION.SDK_INT >= 29) {
                    name = mediaCodecM13822.getCanonicalName();
                } else {
                    name = mediaCodecM13822.getName();
                }
                return new C4724(c13190, c17777, mediaCodecM13822, name, mediaFormatM41647, c8353M31336, i, i2, z, m13830(mediaCodecM13822, str2));
            } catch (IOException | RuntimeException e) {
                e = e;
                z3 = true;
                mediaCodec = mediaCodecM13822;
                C23068.m51228(mediaCodec, z3);
                c17777.m41653();
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m13830(MediaCodec mediaCodec, String str) {
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
            for (C17195 c17195 : C22134.m49731(str, false, false)) {
                if (c17195.f52721.equals(name)) {
                    return c17195.f52719;
                }
            }
        } catch (C5201 unused) {
        }
        String lowerCase = name.toLowerCase(Locale.ROOT);
        return lowerCase.startsWith("omx.google.") || lowerCase.startsWith("c2.android.") || lowerCase.startsWith("c2.google.");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static MediaCodec m13822(C8353 c8353, MediaFormat mediaFormat, boolean z, String str, InterfaceC19899 interfaceC19899) throws IOException {
        Throwable e;
        MediaCodec mediaCodecCreateByCodecName;
        String str2 = c8353.f25614;
        if (str2 == null) {
            throw new IOException("Missing MPEG-TS video MIME type");
        }
        MediaCodec mediaCodec = null;
        if (!z) {
            interfaceC19899.mo21195();
            try {
                MediaCodec mediaCodecCreateDecoderByType = MediaCodec.createDecoderByType(str2);
                try {
                    m13832(mediaCodecCreateDecoderByType, str2);
                    mediaCodecCreateDecoderByType.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 0);
                    mediaCodecCreateDecoderByType.start();
                    return mediaCodecCreateDecoderByType;
                } catch (IOException | RuntimeException e2) {
                    e = e2;
                    mediaCodec = mediaCodecCreateDecoderByType;
                    C23068.m51228(mediaCodec, false);
                    throw new C22363("Failed to initialize MPEG-TS preview decoder", e);
                }
            } catch (IOException e3) {
                e = e3;
            } catch (RuntimeException e4) {
                e = e4;
            }
        } else {
            try {
                Throwable th = null;
                for (C17195 c17195 : C22134.m49731(str2, false, false)) {
                    boolean z2 = c17195.f52719;
                    String str3 = c17195.f52721;
                    if (z2 && !str3.equals(str)) {
                        try {
                            interfaceC19899.mo21195();
                            if (c17195.m40454(c8353)) {
                                mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str3);
                                try {
                                    m13832(mediaCodecCreateByCodecName, str2);
                                    mediaCodecCreateByCodecName.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 0);
                                    mediaCodecCreateByCodecName.start();
                                    return mediaCodecCreateByCodecName;
                                } catch (InterruptedIOException e5) {
                                    e = e5;
                                    mediaCodec = mediaCodecCreateByCodecName;
                                } catch (IOException e6) {
                                    e = e6;
                                    C23068.m51228(mediaCodecCreateByCodecName, false);
                                    th = e;
                                } catch (RuntimeException e7) {
                                    e = e7;
                                    C23068.m51228(mediaCodecCreateByCodecName, false);
                                    th = e;
                                } catch (C5201 e8) {
                                    e = e8;
                                    C23068.m51228(mediaCodecCreateByCodecName, false);
                                    th = e;
                                }
                            }
                        } catch (InterruptedIOException e9) {
                            e = e9;
                        } catch (IOException e10) {
                            e = e10;
                            e = e;
                            mediaCodecCreateByCodecName = null;
                            C23068.m51228(mediaCodecCreateByCodecName, false);
                            th = e;
                        } catch (RuntimeException e11) {
                            e = e11;
                            e = e;
                            mediaCodecCreateByCodecName = null;
                            C23068.m51228(mediaCodecCreateByCodecName, false);
                            th = e;
                        } catch (C5201 e12) {
                            e = e12;
                            e = e;
                            mediaCodecCreateByCodecName = null;
                            C23068.m51228(mediaCodecCreateByCodecName, false);
                            th = e;
                        }
                        C23068.m51228(mediaCodec, false);
                        throw e;
                    }
                }
                if (th != null) {
                    throw new C22363("Failed to initialize software MPEG-TS preview decoder", th);
                }
                throw new IOException("Missing software MPEG-TS preview decoder");
            } catch (C5201 e13) {
                throw new IOException("Failed to query software video decoders", e13);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m13832(MediaCodec mediaCodec, String str) throws IOException {
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m13827(MediaFormat mediaFormat) throws IOException {
        if (Build.VERSION.SDK_INT < 24 || !mediaFormat.containsKey("color-transfer")) {
            return;
        }
        int integer = mediaFormat.getInteger("color-transfer");
        if (integer == 6 || integer == 7) {
            throw new IOException("HDR MPEG-TS preview is unsupported");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m13831(C4724 c4724, int i, int i2) {
        return c4724.f14981 == i && c4724.f14979 == i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m13828(C4724 c4724, long j, InterfaceC19899 interfaceC19899) throws IOException {
        boolean z;
        C12485 c12485 = new C12485(c4724.f14981, c4724.f14979, j);
        while (c4724.f14976.m32015(c12485) == null && !c4724.f14992) {
            interfaceC19899.mo21195();
            boolean zM13829 = c4724.m13829(j, 0L, interfaceC19899);
            if (!c4724.f14983) {
                C17777 c17777 = c4724.f14995;
                MediaCodec mediaCodec = c4724.f14988;
                int iDequeueInputBuffer = mediaCodec.dequeueInputBuffer(2000L);
                if (iDequeueInputBuffer < 0) {
                    z = false;
                } else {
                    interfaceC19899.mo21195();
                    long jM41652 = c17777.m41652();
                    if (jM41652 < 0) {
                        c4724.m13825(iDequeueInputBuffer, false);
                    } else if (c4724.f14982 >= 1200) {
                        c4724.m13825(iDequeueInputBuffer, true);
                    } else {
                        if (c4724.f14980 == -9223372036854775807L) {
                            c4724.f14980 = jM41652;
                        }
                        long jMax = Math.max(0L, jM41652 - c4724.f14980);
                        if (jMax > 10000000) {
                            c4724.m13825(iDequeueInputBuffer, true);
                        } else {
                            ByteBuffer inputBuffer = mediaCodec.getInputBuffer(iDequeueInputBuffer);
                            if (inputBuffer == null) {
                                throw new IOException("Missing MPEG-TS decoder input buffer");
                            }
                            inputBuffer.clear();
                            try {
                                int iM41646 = c17777.m41646(inputBuffer);
                                if (iM41646 < 0) {
                                    c4724.m13825(iDequeueInputBuffer, false);
                                } else {
                                    c4724.f14988.queueInputBuffer(iDequeueInputBuffer, 0, iM41646, jMax, (c17777.m41650() & 1) != 0 ? 1 : 0);
                                    c4724.f14977 = jMax;
                                    c4724.f14982++;
                                    c17777.m41648();
                                }
                            } catch (RuntimeException e) {
                                throw new IOException("MPEG-TS access unit exceeds codec input buffer", e);
                            }
                        }
                    }
                    z = true;
                }
                zM13829 |= z;
            }
            if (c4724.m13829(j, 2000L, interfaceC19899) | zM13829) {
                c4724.f14986 = 0;
            } else {
                int i = c4724.f14986 + 1;
                c4724.f14986 = i;
                if (i >= c4724.f14978) {
                    throw new C3313("MPEG-TS preview decoder timed out: input=" + c4724.f14982 + ", inputEnded=" + c4724.f14983 + ", output=" + c4724.f14974 + ", lastOutputUs=" + c4724.f14987 + ", nextBucket=" + c4724.f14991);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m13825(int i, boolean z) {
        this.f14988.queueInputBuffer(i, 0, 0, this.f14977, 4);
        this.f14993 = z;
        this.f14983 = true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m13829(long j, long j2, InterfaceC19899 interfaceC19899) throws C20247 {
        MediaCodec mediaCodec = this.f14988;
        MediaCodec.BufferInfo bufferInfo = this.f14975;
        int iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, j2);
        if (iDequeueOutputBuffer == -1) {
            return false;
        }
        if (iDequeueOutputBuffer == -2) {
            try {
                this.f14985 = mediaCodec.getOutputFormat();
                return true;
            } catch (RuntimeException e) {
                throw new C20247("Failed to read MPEG-TS decoder output format", e);
            }
        }
        if (iDequeueOutputBuffer < 0) {
            return true;
        }
        try {
            interfaceC19899.mo21195();
            if ((bufferInfo.flags & 2) == 0 && bufferInfo.size > 0) {
                long jMin = Math.min(j, Math.max(0L, bufferInfo.presentationTimeUs) / 1000000);
                if (this.f14991 <= jMin) {
                    try {
                        Image outputImage = mediaCodec.getOutputImage(iDequeueOutputBuffer);
                        if (outputImage == null) {
                            throw new C20247("Decoder did not expose an output image");
                        }
                        m13826(outputImage, jMin);
                    } catch (RuntimeException e2) {
                        throw new C20247("Failed to obtain MPEG-TS decoder output image", e2);
                    }
                }
                this.f14974++;
                this.f14987 = bufferInfo.presentationTimeUs;
            }
            if ((bufferInfo.flags & 4) != 0) {
                this.f14992 = true;
            }
            mediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, false);
            return true;
        } catch (Throwable th) {
            mediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, false);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m13826(Image image, long j) throws C20247 {
        try {
            Bitmap bitmapM51225 = C23068.m51225(image, this.f14981, this.f14979, this.f14994, this.f14984, this.f14985);
            while (true) {
                long j2 = this.f14991;
                if (j2 > j) {
                    return;
                }
                C12485 c12485 = new C12485(this.f14981, this.f14979, j2);
                C13190 c13190 = this.f14976;
                if (c13190.m32015(c12485) == null) {
                    c13190.m32017(c12485, bitmapM51225);
                }
                this.f14991++;
            }
        } catch (IOException | RuntimeException e) {
            throw new C20247("Unsupported MPEG-TS decoder output image", e);
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static void m13834(C4724 c4724) {
        C23068.m51228(c4724.f14988, c4724.f14989);
        c4724.f14989 = false;
        c4724.f14995.m41653();
    }
}
