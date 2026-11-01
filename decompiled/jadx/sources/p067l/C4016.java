package p067l;

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
public class C4016 extends Drawable implements Animatable, MediaController.MediaPlayerControl {

    /* JADX INFO: renamed from: ܳ֫ */
    public static final /* synthetic */ int f8760 = 0;

    /* JADX INFO: renamed from: ֫֫ */
    public int f8761;

    /* JADX INFO: renamed from: ۗ */
    public final boolean f8762;

    /* JADX INFO: renamed from: ۙ */
    public final HandlerC5357 f8763;

    /* JADX INFO: renamed from: ۛ */
    public long f8764;

    /* JADX INFO: renamed from: ۟ */
    public int f8765;

    /* JADX INFO: renamed from: ۤ */
    public final GifInfoHandle f8766;

    /* JADX INFO: renamed from: ۧ֫ */
    public final Rect f8767;

    /* JADX INFO: renamed from: ۨ */
    public final Paint f8768;

    /* JADX INFO: renamed from: ۫ */
    public final ConcurrentLinkedQueue f8769;

    /* JADX INFO: renamed from: ۬ */
    public volatile boolean f8770;

    /* JADX INFO: renamed from: ܰ */
    public ScheduledFuture f8771;

    /* JADX INFO: renamed from: ܽ֫ */
    public ColorStateList f8772;

    /* JADX INFO: renamed from: ܿ֫ */
    public PorterDuff.Mode f8773;

    /* JADX INFO: renamed from: ᩳ֫ */
    public PorterDuffColorFilter f8774;

    /* JADX INFO: renamed from: ᩶ */
    public final ScheduledThreadPoolExecutor f8775;

    /* JADX INFO: renamed from: ᩸ */
    public final Bitmap f8776;

    /* JADX INFO: renamed from: ᩹ */
    public final Rect f8777;

    /* JADX INFO: renamed from: ᩺ */
    public final C12063 f8778;

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

    public C4016(Resources resources, int i) {
        this(new GifInfoHandle(resources.openRawResourceFd(i)), null, true);
        List list = C10051.f27811;
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
        this.f8765 = (int) (this.f8766.m55481() * f);
        this.f8761 = (int) (this.f8766.m55482() * f);
    }

    public C4016(byte[] bArr) {
        this(new GifInfoHandle(bArr), null, true);
    }

    public C4016(ContentResolver contentResolver, Uri uri) throws IOException {
        GifInfoHandle gifInfoHandle;
        int i = GifInfoHandle.f81816;
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

    public C4016(GifInfoHandle gifInfoHandle, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, boolean z) {
        this.f8770 = true;
        this.f8764 = Long.MIN_VALUE;
        this.f8777 = new Rect();
        this.f8768 = new Paint(6);
        this.f8769 = new ConcurrentLinkedQueue();
        C12063 c12063 = new C12063(this);
        this.f8778 = c12063;
        this.f8762 = z;
        if (scheduledThreadPoolExecutor == null) {
            int i = C11393.f31783;
            scheduledThreadPoolExecutor = C22122.f69993;
        }
        this.f8775 = scheduledThreadPoolExecutor;
        this.f8766 = gifInfoHandle;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(gifInfoHandle.m55482(), gifInfoHandle.m55481(), Bitmap.Config.ARGB_8888);
        this.f8776 = bitmapCreateBitmap;
        bitmapCreateBitmap.setHasAlpha(!gifInfoHandle.m55474());
        this.f8767 = new Rect(0, 0, gifInfoHandle.m55482(), gifInfoHandle.m55481());
        this.f8763 = new HandlerC5357(this);
        c12063.mo18633();
        this.f8761 = gifInfoHandle.m55482();
        this.f8765 = gifInfoHandle.m55481();
    }

    /* JADX INFO: renamed from: ۜ */
    public final void m7997() {
        this.f8770 = false;
        this.f8763.removeMessages(-1);
        this.f8766.m55463();
        this.f8776.recycle();
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        super.invalidateSelf();
        if (this.f8762 && this.f8770) {
            long j = this.f8764;
            if (j != Long.MIN_VALUE) {
                long jMax = Math.max(0L, j - SystemClock.uptimeMillis());
                this.f8764 = Long.MIN_VALUE;
                this.f8775.remove(this.f8778);
                this.f8771 = this.f8775.schedule(this.f8778, jMax, TimeUnit.MILLISECONDS);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f8765;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f8761;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f8768.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f8768.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return (!this.f8766.m55474() || this.f8768.getAlpha() < 255) ? -2 : -1;
    }

    @Override // android.graphics.drawable.Animatable, android.widget.MediaController.MediaPlayerControl
    public final void start() {
        synchronized (this) {
            if (this.f8770) {
                return;
            }
            this.f8770 = true;
            m7996(this.f8766.m55464());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m7996(long j) {
        boolean z = this.f8762;
        HandlerC5357 handlerC5357 = this.f8763;
        if (z) {
            this.f8764 = 0L;
            handlerC5357.sendEmptyMessageAtTime(-1, 0L);
            return;
        }
        ScheduledFuture scheduledFuture = this.f8771;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        handlerC5357.removeMessages(-1);
        this.f8771 = this.f8775.schedule(this.f8778, Math.max(j, 0L), TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: ᩷ */
    public final void m8003() {
        this.f8775.execute(new C15729(this, this));
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        synchronized (this) {
            if (this.f8770) {
                this.f8770 = false;
                ScheduledFuture scheduledFuture = this.f8771;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.f8763.removeMessages(-1);
                this.f8766.m55477();
            }
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f8770;
    }

    public final String toString() {
        Locale locale = Locale.ENGLISH;
        GifInfoHandle gifInfoHandle = this.f8766;
        int iM55482 = gifInfoHandle.m55482();
        int iM55481 = gifInfoHandle.m55481();
        int iM55479 = gifInfoHandle.m55479();
        int iM55488 = gifInfoHandle.m55488();
        StringBuilder sbM49005 = C21720.m49005("GIF: size: ", iM55482, "x", ", frames: ", iM55481);
        sbM49005.append(iM55479);
        sbM49005.append(", error: ");
        sbM49005.append(iM55488);
        return sbM49005.toString();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekBackward() {
        return this.f8766.m55479() > 1;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekForward() {
        return this.f8766.m55479() > 1;
    }

    /* JADX INFO: renamed from: ܳ */
    public final int m7999() {
        return this.f8766.m55479();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final EnumC19439 m8002() {
        return EnumC19439.m44202(this.f8766.m55488());
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void pause() {
        stop();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getDuration() {
        return this.f8766.m55484();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getCurrentPosition() {
        return this.f8766.m55485();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void seekTo(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Position is not positive");
        }
        this.f8775.execute(new C9695(this, this, i));
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean isPlaying() {
        return this.f8770;
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m7995() {
        return this.f8766.m55466() + ((long) this.f8776.getAllocationByteCount());
    }

    /* JADX INFO: renamed from: ܿ */
    public final long m8001() {
        return this.f8766.m55476();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f8777.set(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z;
        PorterDuffColorFilter porterDuffColorFilter = this.f8774;
        Paint paint = this.f8768;
        if (porterDuffColorFilter == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f8774);
            z = true;
        }
        canvas.drawBitmap(this.f8776, this.f8767, this.f8777, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f8768.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z) {
        this.f8768.setFilterBitmap(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        this.f8768.setDither(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f8768.getColorFilter();
    }

    /* JADX INFO: renamed from: ۧ */
    public final Bitmap m7998() {
        Bitmap bitmap = this.f8776;
        Bitmap bitmapCopy = bitmap.copy(bitmap.getConfig(), bitmap.isMutable());
        bitmapCopy.setHasAlpha(bitmap.hasAlpha());
        return bitmapCopy;
    }

    /* JADX INFO: renamed from: ֫ */
    private PorterDuffColorFilter m7994(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f8772 = colorStateList;
        this.f8774 = m7994(colorStateList, this.f8773);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f8773 = mode;
        this.f8774 = m7994(this.f8772, mode);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f8772;
        if (colorStateList == null || (mode = this.f8773) == null) {
            return false;
        }
        this.f8774 = m7994(colorStateList, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f8772;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (!this.f8762) {
            if (z) {
                if (z2) {
                    m8003();
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

    /* JADX INFO: renamed from: ܽ */
    public final int m8000() {
        return this.f8766.m55480();
    }

    /* JADX INFO: renamed from: ᩻ */
    public final boolean m8004() {
        return this.f8766.m55473();
    }
}
