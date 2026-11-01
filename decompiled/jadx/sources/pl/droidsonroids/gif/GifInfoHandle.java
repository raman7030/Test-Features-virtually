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
import p067l.C14744;
import p067l.EnumC19439;

/* JADX INFO: loaded from: classes2.dex */
public final class GifInfoHandle {

    /* JADX INFO: renamed from: ۧ */
    public static final /* synthetic */ int f81816 = 0;

    /* JADX INFO: renamed from: ֫ */
    public volatile long f81817;

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

    /* JADX INFO: renamed from: ֡ */
    public final synchronized void m55463() {
        free(this.f81817);
        this.f81817 = 0L;
    }

    /* JADX INFO: renamed from: ᩴ */
    public final synchronized boolean m55486() {
        return this.f81817 == 0;
    }

    static {
        C14744.m33690();
    }

    public GifInfoHandle() {
    }

    public GifInfoHandle(byte[] bArr) {
        this.f81817 = openByteArray(bArr);
    }

    public GifInfoHandle(String str) {
        this.f81817 = openFile(str);
    }

    public GifInfoHandle(InputStream inputStream) {
        this.f81817 = openStream(inputStream);
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
                        throw new GifIOException(EnumC19439.OPEN_FAILED.f59212, e.getMessage());
                    }
                }
            }
            this.f81817 = openNativeFileDescriptor(iCreateTempNativeFileDescriptor, startOffset);
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

    /* JADX INFO: renamed from: ֫ */
    public final synchronized long m55467(Bitmap bitmap) {
        return renderFrame(this.f81817, bitmap);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m55471(Surface surface, long[] jArr) {
        bindSurface(this.f81817, surface, jArr);
    }

    /* JADX INFO: renamed from: ֨ */
    public final synchronized long m55464() {
        return restoreRemainder(this.f81817);
    }

    /* JADX INFO: renamed from: ۚ */
    public final synchronized boolean m55475() {
        return reset(this.f81817);
    }

    /* JADX INFO: renamed from: ۠ */
    public final synchronized void m55477() {
        saveRemainder(this.f81817);
    }

    /* JADX INFO: renamed from: ᩻ */
    public final synchronized int m55489() {
        return getLoopCount(this.f81817);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m55469(int i) {
        if (i < 0 || i > 65535) {
            throw new IllegalArgumentException("Loop count of range <0, 65535>");
        }
        synchronized (this) {
            setLoopCount(this.f81817, (char) i);
        }
    }

    /* JADX INFO: renamed from: ᩷ */
    public final synchronized int m55488() {
        return getNativeErrorCode(this.f81817);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m55468(float f) {
        if (f <= 0.0f || Float.isNaN(f)) {
            throw new IllegalArgumentException("Speed factor is not positive");
        }
        if (f < 4.656613E-10f) {
            f = 4.656613E-10f;
        }
        synchronized (this) {
            setSpeedFactor(this.f81817, f);
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final synchronized int m55484() {
        return getDuration(this.f81817);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final synchronized int m55485() {
        return getCurrentPosition(this.f81817);
    }

    /* JADX INFO: renamed from: ۧ */
    public final synchronized int m55480() {
        return getCurrentFrameIndex(this.f81817);
    }

    /* JADX INFO: renamed from: ܽ */
    public final synchronized int m55483() {
        return getCurrentLoop(this.f81817);
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m55470(int i, Bitmap bitmap) {
        seekToTime(this.f81817, i, bitmap);
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized long m55466() {
        return getAllocationByteCount(this.f81817);
    }

    /* JADX INFO: renamed from: ۜ */
    public final synchronized long m55476() {
        return getMetadataByteCount(this.f81817);
    }

    public final void finalize() throws Throwable {
        try {
            m55463();
        } finally {
            super.finalize();
        }
    }

    /* JADX INFO: renamed from: ᩵ */
    public final synchronized void m55487() {
        postUnbindSurface(this.f81817);
    }

    /* JADX INFO: renamed from: ۖ */
    public final synchronized boolean m55473() {
        return isAnimationCompleted(this.f81817);
    }

    /* JADX INFO: renamed from: ۡ */
    public final synchronized long[] m55478() {
        return getSavedState(this.f81817);
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized int m55465(long[] jArr, Bitmap bitmap) {
        return restoreSavedState(this.f81817, jArr, bitmap);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m55472(boolean z, char c) {
        setOptions(this.f81817, c, z);
    }

    /* JADX INFO: renamed from: ܺ */
    public final synchronized int m55482() {
        return getWidth(this.f81817);
    }

    /* JADX INFO: renamed from: ܳ */
    public final synchronized int m55481() {
        return getHeight(this.f81817);
    }

    /* JADX INFO: renamed from: ۢ */
    public final synchronized int m55479() {
        return getNumberOfFrames(this.f81817);
    }

    /* JADX INFO: renamed from: ۘ */
    public final synchronized boolean m55474() {
        return isOpaque(this.f81817);
    }
}
