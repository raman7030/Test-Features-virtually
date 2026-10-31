package l;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.SystemClock;
import android.util.TypedValue;
import android.widget.MediaController;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.bouncycastle.crypto.params.DHParameters;
import pl.droidsonroids.gif.GifInfoHandle;

/* JADX INFO: renamed from: l.֫ۢ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: P5QW */
/* JADX INFO: loaded from: classes2.dex */
public class C1734 extends Drawable implements Animatable, MediaController.MediaPlayerControl {

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f5983 = 0;

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public int f5984;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean f5985;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HandlerC3145 f5986;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public long f5987;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f5988;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final GifInfoHandle f5989;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final Rect f5990;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Paint f5991;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final ConcurrentLinkedQueue f5992;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public volatile boolean f5993;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ScheduledFuture f5994;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public ColorStateList f5995;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public PorterDuff.Mode f5996;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public PorterDuffColorFilter f5997;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ScheduledThreadPoolExecutor f5998;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Bitmap f5999;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Rect f6000;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C10201 f6001;

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canPause() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getAudioSessionId() {
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getBufferPercentage() {
        return 100;
    }

    public C1734(Resources resources, int i) {
        this(new GifInfoHandle(resources.openRawResourceFd(i)), null, true);
        List list = C8084.f24900;
        TypedValue typedValue = new TypedValue();
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.density;
        if (i2 == 0) {
            i2 = DHParameters.DEFAULT_MINIMUM_LENGTH;
        } else if (i2 == 65535) {
            i2 = 0;
        }
        int i3 = resources.getDisplayMetrics().densityDpi;
        float f = (i2 <= 0 || i3 <= 0) ? 1.0f : i3 / i2;
        this.f5988 = (int) (this.f5989.m52917() * f);
        this.f5984 = (int) (this.f5989.m52918() * f);
    }

    public C1734(byte[] bArr) {
        this(new GifInfoHandle(bArr), null, true);
    }

    public C1734(ContentResolver contentResolver, Uri uri) throws IOException {
        GifInfoHandle gifInfoHandle;
        int i = GifInfoHandle.f77903;
        if ("file".equals(uri.getScheme())) {
            gifInfoHandle = new GifInfoHandle(uri.getPath());
        } else {
            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new IOException("Could not open AssetFileDescriptor for " + uri);
            }
            gifInfoHandle = new GifInfoHandle(assetFileDescriptorOpenAssetFileDescriptor);
        }
        this(gifInfoHandle, null, true);
    }

    public C1734(GifInfoHandle gifInfoHandle, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, boolean z) {
        this.f5993 = true;
        this.f5987 = Long.MIN_VALUE;
        this.f6000 = new Rect();
        this.f5991 = new Paint(6);
        this.f5992 = new ConcurrentLinkedQueue();
        C10201 c10201 = new C10201(this);
        this.f6001 = c10201;
        this.f5985 = z;
        if (scheduledThreadPoolExecutor == null) {
            int i = C9496.f28835;
            scheduledThreadPoolExecutor = C20785.f67310;
        }
        this.f5998 = scheduledThreadPoolExecutor;
        this.f5989 = gifInfoHandle;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(gifInfoHandle.m52918(), gifInfoHandle.m52917(), Bitmap.Config.ARGB_8888);
        this.f5999 = bitmapCreateBitmap;
        bitmapCreateBitmap.setHasAlpha(!gifInfoHandle.m52910());
        this.f5990 = new Rect(0, 0, gifInfoHandle.m52918(), gifInfoHandle.m52917());
        this.f5986 = new HandlerC3145(this);
        c10201.mo16707();
        this.f5984 = gifInfoHandle.m52918();
        this.f5988 = gifInfoHandle.m52917();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m5787() {
        this.f5993 = false;
        this.f5986.removeMessages(-1);
        this.f5989.m52899();
        this.f5999.recycle();
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        super.invalidateSelf();
        if (this.f5985 && this.f5993) {
            long j = this.f5987;
            if (j != Long.MIN_VALUE) {
                long jMax = Math.max(0L, j - SystemClock.uptimeMillis());
                this.f5987 = Long.MIN_VALUE;
                this.f5998.remove(this.f6001);
                this.f5994 = this.f5998.schedule(this.f6001, jMax, TimeUnit.MILLISECONDS);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f5988;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f5984;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f5991.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f5991.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return (!this.f5989.m52910() || this.f5991.getAlpha() < 255) ? -2 : -1;
    }

    @Override // android.graphics.drawable.Animatable, android.widget.MediaController.MediaPlayerControl
    public final void start() {
        synchronized (this) {
            if (this.f5993) {
                return;
            }
            this.f5993 = true;
            m5786(this.f5989.m52900());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5786(long j) {
        boolean z = this.f5985;
        HandlerC3145 handlerC3145 = this.f5986;
        if (z) {
            this.f5987 = 0L;
            handlerC3145.sendEmptyMessageAtTime(-1, 0L);
            return;
        }
        ScheduledFuture scheduledFuture = this.f5994;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        handlerC3145.removeMessages(-1);
        this.f5994 = this.f5998.schedule(this.f6001, Math.max(j, 0L), TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m5793() {
        this.f5998.execute(new C14058(this, this));
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        synchronized (this) {
            if (this.f5993) {
                this.f5993 = false;
                ScheduledFuture scheduledFuture = this.f5994;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.f5986.removeMessages(-1);
                this.f5989.m52913();
            }
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f5993;
    }

    public final String toString() {
        Locale locale = Locale.ENGLISH;
        GifInfoHandle gifInfoHandle = this.f5989;
        int iM52918 = gifInfoHandle.m52918();
        int iM52917 = gifInfoHandle.m52917();
        int iM52915 = gifInfoHandle.m52915();
        int iM52924 = gifInfoHandle.m52924();
        StringBuilder sbM46682 = C20361.m46682("GIF: size: ", iM52918, "x", ", frames: ", iM52917);
        sbM46682.append(iM52915);
        sbM46682.append(", error: ");
        sbM46682.append(iM52924);
        return sbM46682.toString();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekBackward() {
        return this.f5989.m52915() > 1;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekForward() {
        return this.f5989.m52915() > 1;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m5789() {
        return this.f5989.m52915();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final EnumC17962 m5792() {
        return EnumC17962.m41953(this.f5989.m52924());
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void pause() {
        stop();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getDuration() {
        return this.f5989.m52920();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getCurrentPosition() {
        return this.f5989.m52921();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void seekTo(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Position is not positive");
        }
        this.f5998.execute(new C7709(this, this, i));
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean isPlaying() {
        return this.f5993;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m5785() {
        return this.f5989.m52902() + ((long) this.f5999.getAllocationByteCount());
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long m5791() {
        return this.f5989.m52912();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f6000.set(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z;
        PorterDuffColorFilter porterDuffColorFilter = this.f5997;
        Paint paint = this.f5991;
        if (porterDuffColorFilter == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f5997);
            z = true;
        }
        canvas.drawBitmap(this.f5999, this.f5990, this.f6000, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f5991.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z) {
        this.f5991.setFilterBitmap(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        this.f5991.setDither(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f5991.getColorFilter();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Bitmap m5788() {
        Bitmap bitmap = this.f5999;
        Bitmap bitmapCopy = bitmap.copy(bitmap.getConfig(), bitmap.isMutable());
        bitmapCopy.setHasAlpha(bitmap.hasAlpha());
        return bitmapCopy;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private PorterDuffColorFilter m5784(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f5995 = colorStateList;
        this.f5997 = m5784(colorStateList, this.f5996);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f5996 = mode;
        this.f5997 = m5784(this.f5995, mode);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f5995;
        if (colorStateList == null || (mode = this.f5996) == null) {
            return false;
        }
        this.f5997 = m5784(colorStateList, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f5995;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (!this.f5985) {
            if (z) {
                if (z2) {
                    m5793();
                }
                if (visible) {
                    start();
                    return visible;
                }
            } else if (visible) {
                stop();
            }
        }
        return visible;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m5790() {
        return this.f5989.m52916();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m5794() {
        return this.f5989.m52909();
    }
}
