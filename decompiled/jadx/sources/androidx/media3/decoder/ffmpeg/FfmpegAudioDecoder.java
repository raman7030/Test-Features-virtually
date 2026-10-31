package androidx.media3.decoder.ffmpeg;

import androidx.media3.decoder.SimpleDecoderOutputBuffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import l.AbstractC20432;
import l.AbstractC3498;
import l.C11965;
import l.C17714;
import l.C21843;
import l.C22632;
import l.C3603;
import l.C7731;
import l.C8353;
import l.C8437;
import l.InterfaceC22548;

/* JADX INFO: loaded from: classes.dex */
public final class FfmpegAudioDecoder extends AbstractC3498 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f2;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f3;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final byte[] f4;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C7731 f5;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public long f6;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public volatile int f7;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final String f8;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f9;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public volatile int f10;

    private native int ffmpegDecode(long j, ByteBuffer byteBuffer, int i, SimpleDecoderOutputBuffer simpleDecoderOutputBuffer, ByteBuffer byteBuffer2, int i2);

    private native int ffmpegGetChannelCount(long j);

    private native int ffmpegGetSampleRate(long j);

    private native long ffmpegInitialize(String str, byte[] bArr, boolean z, int i, int i2);

    private native void ffmpegRelease(long j);

    private native long ffmpegReset(long j, byte[] bArr);

    @Override // l.AbstractC3498
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8437 mo11(C21843 c21843, AbstractC20432 abstractC20432, boolean z) {
        SimpleDecoderOutputBuffer simpleDecoderOutputBuffer = (SimpleDecoderOutputBuffer) abstractC20432;
        if (z) {
            long jFfmpegReset = ffmpegReset(this.f6, this.f4);
            this.f6 = jFfmpegReset;
            if (jFfmpegReset == 0) {
                return new C11965("Error resetting (see logcat).");
            }
            C7731 c7731 = this.f5;
            if (c7731 != null) {
                c7731.m20708();
            }
        }
        ByteBuffer byteBufferM20707 = c21843.f69995;
        String str = C3603.f11424;
        long jM20706 = c21843.f69997;
        C7731 c7732 = this.f5;
        if (c7732 != null) {
            byteBufferM20707 = c7732.m20707(jM20706, byteBufferM20707);
            jM20706 = this.f5.m20706(c21843.f69997);
        }
        ByteBuffer byteBuffer = byteBufferM20707;
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferM6 = simpleDecoderOutputBuffer.m6(this.f9, jM20706);
        if (this.f5 != null && iLimit == 0) {
            simpleDecoderOutputBuffer.f65928 = true;
            return null;
        }
        int iFfmpegDecode = ffmpegDecode(this.f6, byteBuffer, iLimit, simpleDecoderOutputBuffer, byteBufferM6, this.f9);
        if (iFfmpegDecode == -2) {
            return new C11965("Error decoding (see logcat).");
        }
        if (iFfmpegDecode == -1) {
            simpleDecoderOutputBuffer.f65928 = true;
            return null;
        }
        if (iFfmpegDecode == 0) {
            simpleDecoderOutputBuffer.f65928 = true;
            return null;
        }
        if (!this.f3) {
            this.f7 = ffmpegGetChannelCount(this.f6);
            this.f10 = ffmpegGetSampleRate(this.f6);
            if (this.f10 == 0 && "alac".equals(this.f8)) {
                this.f4.getClass();
                C17714 c17714 = new C17714(this.f4);
                c17714.m41484(this.f4.length - 4);
                this.f10 = c17714.m41492();
            }
            this.f3 = true;
        }
        ByteBuffer byteBuffer2 = simpleDecoderOutputBuffer.f0;
        byteBuffer2.getClass();
        byteBuffer2.position(0);
        byteBuffer2.limit(iFfmpegDecode);
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public FfmpegAudioDecoder(int i, C8353 c8353, boolean z) throws C11965 {
        byte[] bArr;
        byte[] bArrArray;
        super(new C21843[16], new SimpleDecoderOutputBuffer[16]);
        if (!FfmpegLibrary.m22()) {
            throw new C11965("Failed to load decoder native libraries.");
        }
        String str = c8353.f25614;
        str.getClass();
        String strM19 = FfmpegLibrary.m19(c8353);
        strM19.getClass();
        this.f8 = strM19;
        List list = c8353.f25634;
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case -1003765268:
                if (str.equals("audio/vorbis")) {
                    b = 0;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    b = 1;
                }
                break;
            case 1504470054:
                if (str.equals("audio/alac")) {
                    b = 2;
                }
                break;
            case 1504891608:
                if (str.equals("audio/opus")) {
                    b = 3;
                }
                break;
        }
        C7731 c7731 = null;
        switch (b) {
            case 0:
                byte[] bArr2 = (byte[]) list.get(0);
                byte[] bArr3 = (byte[]) list.get(1);
                bArr = new byte[bArr2.length + bArr3.length + 6];
                bArr[0] = (byte) (bArr2.length >> 8);
                bArr[1] = (byte) (bArr2.length & 255);
                System.arraycopy(bArr2, 0, bArr, 2, bArr2.length);
                bArr[bArr2.length + 2] = 0;
                bArr[bArr2.length + 3] = 0;
                bArr[bArr2.length + 4] = (byte) (bArr3.length >> 8);
                bArr[bArr2.length + 5] = (byte) (bArr3.length & 255);
                System.arraycopy(bArr3, 0, bArr, bArr2.length + 6, bArr3.length);
                break;
            case 1:
            case 3:
                bArrArray = (byte[]) list.get(0);
                bArr = bArrArray;
                break;
            case 2:
                byte[] bArr4 = (byte[]) list.get(0);
                int length = bArr4.length + 12;
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
                byteBufferAllocate.putInt(length);
                byteBufferAllocate.putInt(1634492771);
                byteBufferAllocate.putInt(0);
                byteBufferAllocate.put(bArr4, 0, bArr4.length);
                bArrArray = byteBufferAllocate.array();
                bArr = bArrArray;
                break;
            default:
                bArr = null;
                break;
        }
        this.f4 = bArr;
        String str2 = c8353.f25606;
        if ("audio/mpeg".equals(str) && ("video/mp4".equals(str2) || "audio/mp4".equals(str2) || "application/mp4".equals(str2))) {
            c7731 = new C7731(FfmpegLibrary.m18());
        }
        this.f5 = c7731;
        this.f2 = z ? 4 : 2;
        this.f9 = z ? 131070 : 65535;
        long jFfmpegInitialize = ffmpegInitialize(strM19, bArr, z, c8353.f25624, c8353.f25625);
        this.f6 = jFfmpegInitialize;
        if (jFfmpegInitialize == 0) {
            throw new C11965("Initialization failed.");
        }
        m10680(i);
    }

    @Override // l.InterfaceC1381
    public final String getName() {
        return "ffmpeg" + FfmpegLibrary.m20() + "-" + this.f8;
    }

    @Override // l.AbstractC3498
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C21843 mo16() {
        return new C21843(2, FfmpegLibrary.m18());
    }

    @Override // l.AbstractC3498
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC20432 mo15() {
        return new SimpleDecoderOutputBuffer(new InterfaceC22548() { // from class: l.ۤ᩸֫
            @Override // l.InterfaceC22548
            /* JADX INFO: renamed from: ֫ */
            public final void mo6995(AbstractC20432 abstractC20432) {
                this.f31686.m10681((AbstractC20432) ((SimpleDecoderOutputBuffer) abstractC20432));
            }
        });
    }

    @Override // l.AbstractC3498
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8437 mo10(Throwable th) {
        return new C11965("Unexpected decode error", th);
    }

    private ByteBuffer growOutputBuffer(SimpleDecoderOutputBuffer simpleDecoderOutputBuffer, int i) {
        this.f9 = i;
        ByteBuffer byteBuffer = simpleDecoderOutputBuffer.f0;
        byteBuffer.getClass();
        C22632.m50631(i >= byteBuffer.limit());
        ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        int iPosition = byteBuffer.position();
        byteBuffer.position(0);
        byteBufferOrder.put(byteBuffer);
        byteBufferOrder.position(iPosition);
        byteBufferOrder.limit(i);
        simpleDecoderOutputBuffer.f0 = byteBufferOrder;
        return byteBufferOrder;
    }

    @Override // l.AbstractC3498, l.InterfaceC1381
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo12() {
        super.mo12();
        ffmpegRelease(this.f6);
        this.f6 = 0L;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m14() {
        return this.f7;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m13() {
        return this.f10;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m17() {
        return this.f2;
    }
}
