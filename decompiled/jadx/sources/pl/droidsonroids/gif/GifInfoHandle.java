package pl.droidsonroids.gif;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.os.Build;
import android.system.Os;
import android.view.Surface;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import l.C13022;
import l.EnumC17962;

/* JADX INFO: loaded from: classes2.dex */
public final class GifInfoHandle {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f77903 = 0;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public volatile long f77904;

    public static native void bindSurface(long j, Surface surface, long[] jArr);

    public static native int createTempNativeFileDescriptor();

    public static native int extractNativeFileDescriptor(FileDescriptor fileDescriptor, boolean z);

    public static native void free(long j);

    public static native long getAllocationByteCount(long j);

    public static native String getComment(long j);

    public static native int getCurrentFrameIndex(long j);

    public static native int getCurrentLoop(long j);

    public static native int getCurrentPosition(long j);

    public static native int getDuration(long j);

    public static native int getFrameDuration(long j, int i);

    public static native int getHeight(long j);

    public static native int getLoopCount(long j);

    public static native long getMetadataByteCount(long j);

    public static native int getNativeErrorCode(long j);

    public static native int getNumberOfFrames(long j);

    public static native long[] getSavedState(long j);

    public static native long getSourceLength(long j);

    public static native int getWidth(long j);

    public static native void glTexImage2D(long j, int i, int i2);

    public static native void glTexSubImage2D(long j, int i, int i2);

    public static native void initTexImageDescriptor(long j);

    public static native boolean isAnimationCompleted(long j);

    public static native boolean isOpaque(long j);

    public static native long openByteArray(byte[] bArr);

    public static native long openDirectByteBuffer(ByteBuffer byteBuffer);

    public static native long openFile(String str);

    public static native long openNativeFileDescriptor(int i, long j);

    public static native long openStream(InputStream inputStream);

    public static native void postUnbindSurface(long j);

    public static native long renderFrame(long j, Bitmap bitmap);

    public static native boolean reset(long j);

    public static native long restoreRemainder(long j);

    public static native int restoreSavedState(long j, long[] jArr, Bitmap bitmap);

    public static native void saveRemainder(long j);

    public static native void seekToFrame(long j, int i, Bitmap bitmap);

    public static native void seekToFrameGL(long j, int i);

    public static native void seekToTime(long j, int i, Bitmap bitmap);

    public static native void setLoopCount(long j, char c);

    public static native void setOptions(long j, char c, boolean z);

    public static native void setSpeedFactor(long j, float f);

    public static native void startDecoderThread(long j);

    public static native void stopDecoderThread(long j);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final synchronized void m52899() {
        free(this.f77904);
        this.f77904 = 0L;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m52922() {
        return this.f77904 == 0;
    }

    static {
        C13022.m31605();
    }

    public GifInfoHandle() {
    }

    public GifInfoHandle(byte[] bArr) {
        this.f77904 = openByteArray(bArr);
    }

    public GifInfoHandle(String str) {
        this.f77904 = openFile(str);
    }

    public GifInfoHandle(InputStream inputStream) {
        this.f77904 = openStream(inputStream);
    }

    public GifInfoHandle(AssetFileDescriptor assetFileDescriptor) {
        int iCreateTempNativeFileDescriptor;
        try {
            FileDescriptor fileDescriptor = assetFileDescriptor.getFileDescriptor();
            long startOffset = assetFileDescriptor.getStartOffset();
            if (Build.VERSION.SDK_INT <= 27) {
                iCreateTempNativeFileDescriptor = extractNativeFileDescriptor(fileDescriptor, false);
            } else {
                try {
                    iCreateTempNativeFileDescriptor = createTempNativeFileDescriptor();
                    Os.dup2(fileDescriptor, iCreateTempNativeFileDescriptor);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Exception e) {
                        throw new GifIOException(EnumC17962.OPEN_FAILED.f56015, e.getMessage());
                    }
                }
            }
            this.f77904 = openNativeFileDescriptor(iCreateTempNativeFileDescriptor, startOffset);
            try {
                assetFileDescriptor.close();
            } catch (IOException unused) {
            }
        } catch (Throwable th2) {
            try {
                assetFileDescriptor.close();
            } catch (IOException unused2) {
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized long m52903(Bitmap bitmap) {
        return renderFrame(this.f77904, bitmap);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52907(Surface surface, long[] jArr) {
        bindSurface(this.f77904, surface, jArr);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final synchronized long m52900() {
        return restoreRemainder(this.f77904);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m52911() {
        return reset(this.f77904);
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final synchronized void m52913() {
        saveRemainder(this.f77904);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final synchronized int m52925() {
        return getLoopCount(this.f77904);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52905(int i) {
        if (i < 0 || i > 65535) {
            throw new IllegalArgumentException("Loop count of range <0, 65535>");
        }
        synchronized (this) {
            setLoopCount(this.f77904, (char) i);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized int m52924() {
        return getNativeErrorCode(this.f77904);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52904(float f) {
        if (f <= 0.0f || Float.isNaN(f)) {
            throw new IllegalArgumentException("Speed factor is not positive");
        }
        if (f < 4.656613E-10f) {
            f = 4.656613E-10f;
        }
        synchronized (this) {
            setSpeedFactor(this.f77904, f);
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final synchronized int m52920() {
        return getDuration(this.f77904);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final synchronized int m52921() {
        return getCurrentPosition(this.f77904);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized int m52916() {
        return getCurrentFrameIndex(this.f77904);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final synchronized int m52919() {
        return getCurrentLoop(this.f77904);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m52906(int i, Bitmap bitmap) {
        seekToTime(this.f77904, i, bitmap);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized long m52902() {
        return getAllocationByteCount(this.f77904);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final synchronized long m52912() {
        return getMetadataByteCount(this.f77904);
    }

    public final void finalize() throws Throwable {
        try {
            m52899();
        } finally {
            super.finalize();
        }
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final synchronized void m52923() {
        postUnbindSurface(this.f77904);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m52909() {
        return isAnimationCompleted(this.f77904);
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final synchronized long[] m52914() {
        return getSavedState(this.f77904);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized int m52901(long[] jArr, Bitmap bitmap) {
        return restoreSavedState(this.f77904, jArr, bitmap);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52908(boolean z, char c) {
        setOptions(this.f77904, c, z);
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final synchronized int m52918() {
        return getWidth(this.f77904);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final synchronized int m52917() {
        return getHeight(this.f77904);
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final synchronized int m52915() {
        return getNumberOfFrames(this.f77904);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m52910() {
        return isOpaque(this.f77904);
    }
}
