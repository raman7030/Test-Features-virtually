package androidx.media3.decoder.ffmpeg;

import androidx.media3.decoder.SimpleDecoderOutputBuffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import p067l.AbstractC21787;
import p067l.AbstractC5693;
import p067l.C10307;
import p067l.C10387;
import p067l.C13740;
import p067l.C19203;
import p067l.C23128;
import p067l.C23877;
import p067l.C5792;
import p067l.C9716;
import p067l.InterfaceC23798;

/* JADX INFO: loaded from: classes.dex */
public final class FfmpegAudioDecoder extends AbstractC5693 {

    /* JADX INFO: renamed from: ֡ */
    public final int f2;

    /* JADX INFO: renamed from: ֨ */
    public boolean f3;

    /* JADX INFO: renamed from: ۚ */
    public final byte[] f4;

    /* JADX INFO: renamed from: ۠ */
    public final C9716 f5;

    /* JADX INFO: renamed from: ܶ */
    public long f6;

    /* JADX INFO: renamed from: ᩴ */
    public volatile int f7;

    /* JADX INFO: renamed from: ᩵ */
    public final String f8;

    /* JADX INFO: renamed from: ᩸ */
    public int f9;

    /* JADX INFO: renamed from: ᩹ */
    public volatile int f10;

    private native int ffmpegDecode(long j, ByteBuffer byteBuffer, int i, SimpleDecoderOutputBuffer simpleDecoderOutputBuffer, ByteBuffer byteBuffer2, int i2);

    private native int ffmpegGetChannelCount(long j);

    private native int ffmpegGetSampleRate(long j);

    private native long ffmpegInitialize(String str, byte[] bArr, boolean z, int i, int i2);

    private native void ffmpegRelease(long j);

    private native long ffmpegReset(long j, byte[] bArr);

    @Override // p067l.AbstractC5693
    /* JADX INFO: renamed from: ֫ */
    public final C10387 mo11(C23128 c23128, AbstractC21787 abstractC21787, boolean z) {
        SimpleDecoderOutputBuffer simpleDecoderOutputBuffer = (SimpleDecoderOutputBuffer) abstractC21787;
        if (z) {
            long jFfmpegReset = ffmpegReset(this.f6, this.f4);
            this.f6 = jFfmpegReset;
            if (jFfmpegReset == 0) {
                return new C13740("Error resetting (see logcat).");
            }
            C9716 c9716 = this.f5;
            if (c9716 != null) {
                c9716.m22688();
            }
        }
        ByteBuffer byteBufferM22687 = c23128.f72704;
        String str = C5792.f14228;
        long jM22686 = c23128.f72706;
        C9716 c9717 = this.f5;
        if (c9717 != null) {
            byteBufferM22687 = c9717.m22687(jM22686, byteBufferM22687);
            jM22686 = this.f5.m22686(c23128.f72706);
        }
        ByteBuffer byteBuffer = byteBufferM22687;
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferM6 = simpleDecoderOutputBuffer.m6(this.f9, jM22686);
        if (this.f5 != null && iLimit == 0) {
            simpleDecoderOutputBuffer.f68603 = true;
            return null;
        }
        int iFfmpegDecode = ffmpegDecode(this.f6, byteBuffer, iLimit, simpleDecoderOutputBuffer, byteBufferM6, this.f9);
        if (iFfmpegDecode == -2) {
            return new C13740("Error decoding (see logcat).");
        }
        if (iFfmpegDecode == -1) {
            simpleDecoderOutputBuffer.f68603 = true;
            return null;
        }
        if (iFfmpegDecode == 0) {
            simpleDecoderOutputBuffer.f68603 = true;
            return null;
        }
        if (!this.f3) {
            this.f7 = ffmpegGetChannelCount(this.f6);
            this.f10 = ffmpegGetSampleRate(this.f6);
            if (this.f10 == 0 && "alac".equals(this.f8)) {
                this.f4.getClass();
                C19203 c19203 = new C19203(this.f4);
                c19203.m43730(this.f4.length - 4);
                this.f10 = c19203.m43738();
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
    public FfmpegAudioDecoder(int i, C10307 c10307, boolean z) throws C13740 {
        byte[] bArr;
        byte[] bArrArray;
        super(new C23128[16], new SimpleDecoderOutputBuffer[16]);
        if (!FfmpegLibrary.m22()) {
            throw new C13740("Failed to load decoder native libraries.");
        }
        String str = c10307.f28528;
        str.getClass();
        String strM19 = FfmpegLibrary.m19(c10307);
        strM19.getClass();
        this.f8 = strM19;
        List list = c10307.f28548;
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
        C9716 c9716 = null;
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
        String str2 = c10307.f28520;
        if ("audio/mpeg".equals(str) && ("video/mp4".equals(str2) || "audio/mp4".equals(str2) || "application/mp4".equals(str2))) {
            c9716 = new C9716(FfmpegLibrary.m18());
        }
        this.f5 = c9716;
        this.f2 = z ? 4 : 2;
        this.f9 = z ? 131070 : 65535;
        long jFfmpegInitialize = ffmpegInitialize(strM19, bArr, z, c10307.f28538, c10307.f28539);
        this.f6 = jFfmpegInitialize;
        if (jFfmpegInitialize == 0) {
            throw new C13740("Initialization failed.");
        }
        m12675(i);
    }

    @Override // p067l.InterfaceC3681
    public final String getName() {
        return "ffmpeg" + FfmpegLibrary.m20() + "-" + this.f8;
    }

    @Override // p067l.AbstractC5693
    /* JADX INFO: renamed from: ᩳ */
    public final C23128 mo16() {
        return new C23128(2, FfmpegLibrary.m18());
    }

    @Override // p067l.AbstractC5693
    /* JADX INFO: renamed from: ܿ */
    public final AbstractC21787 mo15() {
        return new SimpleDecoderOutputBuffer(new InterfaceC23798() { // from class: l.ۤ᩸֫
            @Override // p067l.InterfaceC23798
            /* JADX INFO: renamed from: ֫ */
            public final void mo9106(AbstractC21787 abstractC21787) {
                this.f34650.m12676((AbstractC21787) ((SimpleDecoderOutputBuffer) abstractC21787));
            }
        });
    }

    @Override // p067l.AbstractC5693
    /* JADX INFO: renamed from: ֫ */
    public final C10387 mo10(Throwable th) {
        return new C13740("Unexpected decode error", th);
    }

    private ByteBuffer growOutputBuffer(SimpleDecoderOutputBuffer simpleDecoderOutputBuffer, int i) {
        this.f9 = i;
        ByteBuffer byteBuffer = simpleDecoderOutputBuffer.f0;
        byteBuffer.getClass();
        C23877.m52957(i >= byteBuffer.limit());
        ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        int iPosition = byteBuffer.position();
        byteBuffer.position(0);
        byteBufferOrder.put(byteBuffer);
        byteBufferOrder.position(iPosition);
        byteBufferOrder.limit(i);
        simpleDecoderOutputBuffer.f0 = byteBufferOrder;
        return byteBufferOrder;
    }

    @Override // p067l.AbstractC5693, p067l.InterfaceC3681
    /* JADX INFO: renamed from: ֫ */
    public final void mo12() {
        super.mo12();
        ffmpegRelease(this.f6);
        this.f6 = 0L;
    }

    /* JADX INFO: renamed from: ܳ */
    public final int m14() {
        return this.f7;
    }

    /* JADX INFO: renamed from: ۜ */
    public final int m13() {
        return this.f10;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final int m17() {
        return this.f2;
    }
}
