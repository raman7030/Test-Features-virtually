package l;

import android.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.PixelCopy;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: l.ۡ۟ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 35IJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C8741 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final C0225 f26617 = new C0225(1);

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final int f26618 = C11266.m27878(2.5f);

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static boolean f26619 = true;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f26620;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f26621;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C12392 f26622;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f26623;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f26624;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final Bitmap f26625;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C4348 f26626;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public Paint f26627;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f26629;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f26630;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f26632;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f26633;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f26634;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f26635;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Canvas f26636;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C17939 f26637;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f26628 = true;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public HandlerC0912 f26631 = new HandlerC0912(this, new C2141(this));

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m22611(C8741 c8741, final C8741 c8742) {
        Window window;
        final int i = c8741.f26633;
        final int i2 = c8741.f26632;
        C12392 c12392 = c8742.f26622;
        if (!c12392.isAttachedToWindow() || c8742.f26621) {
            return;
        }
        final View rootView = c12392.getRootView();
        if (Build.VERSION.SDK_INT < 28) {
            c8742.m22609(rootView, i, i2);
            return;
        }
        if (f26619) {
            try {
                Field declaredField = rootView.getClass().getDeclaredField("mWindow");
                declaredField.setAccessible(true);
                window = (Window) declaredField.get(rootView);
            } catch (Exception unused) {
                f26619 = false;
                window = null;
            }
        } else {
            window = null;
        }
        if (window == null) {
            c8742.m22609(rootView, i, i2);
            return;
        }
        int width = rootView.getWidth();
        int height = rootView.getHeight();
        Bitmap bitmapCreateBitmap = (Bitmap) f26617.m1479();
        if (bitmapCreateBitmap == null || bitmapCreateBitmap.getWidth() != width || bitmapCreateBitmap.getHeight() != height) {
            if (bitmapCreateBitmap != null) {
                bitmapCreateBitmap.recycle();
            }
            bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        } else {
            bitmapCreateBitmap.eraseColor(0);
        }
        final Bitmap bitmap = bitmapCreateBitmap;
        PixelCopy.request(window, bitmapCreateBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: l.ۢ۟ᩳ
            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public final void onPixelCopyFinished(int i3) {
                C8741.m22610(this.f28645, bitmap, i, i2, rootView, i3);
            }
        }, C4925.m14324());
    }

    public C8741(C12392 c12392) {
        Paint paint = new Paint(1);
        this.f26627 = paint;
        this.f26622 = c12392;
        Context context = c12392.getContext();
        this.f26634 = C21238.m48210(context.getTheme(), R.attr.windowBackground);
        paint.setColor(-65536);
        C4348 c4348 = new C4348(context, null, bin.mt.plus.R.attr.MT_Protector);
        this.f26626 = c4348;
        int iM27878 = C11266.m27878(90.0f);
        this.f26623 = iM27878;
        int iM27879 = C11266.m27878(35.0f);
        this.f26629 = iM27879;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) (iM27878 * 1.5f), (int) (iM27879 * 1.5f), Bitmap.Config.ARGB_8888);
        this.f26625 = bitmapCreateBitmap;
        this.f26636 = new Canvas(bitmapCreateBitmap);
        this.f26624 = C11266.m27878(110.0f);
        c4348.setBackgroundDrawable(context.getResources().getDrawable(C21943.m49424(bin.mt.plus.R.drawable.MT_Protector, bin.mt.plus.R.drawable.MT_Protector)));
        c4348.setWidth(-2);
        c4348.setHeight(-2);
        Rect rect = new Rect();
        c4348.getBackground().getPadding(rect);
        int i = rect.left;
        int i2 = iM27878 * 3;
        this.f26620 = (i2 / 4) + i;
        this.f26630 = (i2 / 2) + i + rect.right;
        c4348.setFocusable(false);
        c4348.setTouchable(true);
        c4348.setOutsideTouchable(true);
        c4348.setClippingEnabled(false);
        C17939 c17939 = new C17939(c12392.getContext());
        this.f26637 = c17939;
        c17939.setImageResource(bin.mt.plus.R.mipmap.MT_Protector);
        c4348.setContentView(c17939);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22613(float f) {
        this.f26628 = ((float) this.f26629) / f > 1.1f;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22612() {
        C4348 c4348 = this.f26626;
        this.f26621 = true;
        this.f26631.removeMessages(0);
        try {
            if (c4348.isShowing()) {
                c4348.dismiss();
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22614(int i, int i2, int i3) {
        if (this.f26628) {
            if (this.f26621) {
                this.f26621 = false;
            }
            this.f26635 = i3;
            this.f26633 = i;
            this.f26632 = i2;
            HandlerC0912 handlerC0912 = this.f26631;
            if (handlerC0912.hasMessages(0)) {
                return;
            }
            C12392 c12392 = this.f26622;
            if (c12392.f37262) {
                if (c12392.f37174 <= f26618) {
                    handlerC0912.sendEmptyMessageDelayed(0, 10L);
                    return;
                } else {
                    handlerC0912.sendEmptyMessageDelayed(0, 50L);
                    return;
                }
            }
            handlerC0912.sendEmptyMessage(0);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m22610(C8741 c8741, Bitmap bitmap, int i, int i2, View view, int i3) {
        boolean z = c8741.f26621;
        C0225 c0225 = f26617;
        if (z) {
            if (c0225.m1477(bitmap)) {
                return;
            }
            bitmap.recycle();
        } else {
            if (i3 == 0) {
                c8741.m22608(bitmap, i, i2);
            } else {
                c8741.m22609(view, i, i2);
            }
            if (c0225.m1477(bitmap)) {
                return;
            }
            bitmap.recycle();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m22609(View view, int i, int i2) {
        view.setDrawingCacheEnabled(true);
        view.buildDrawingCache();
        Bitmap drawingCache = view.getDrawingCache();
        if (drawingCache == null) {
            view.setDrawingCacheEnabled(false);
        } else {
            m22608(drawingCache, i, i2);
            view.setDrawingCacheEnabled(false);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m22608(Bitmap bitmap, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        C4348 c4348 = this.f26626;
        C12392 c12392 = this.f26622;
        View rootView = c12392.getRootView();
        int i7 = this.f26623;
        int i8 = i - (i7 / 2);
        int i9 = this.f26629;
        int height = i2 - (i9 / 2);
        if (rootView != c12392) {
            int[] iArr = new int[2];
            c12392.getLocationInWindow(iArr);
            int i10 = iArr[0];
            i8 += i10;
            int i11 = iArr[1];
            height += i11;
            i3 = i + i10;
            i4 = i2 + i11;
        } else {
            i3 = i;
            i4 = i2;
        }
        if (i8 < 0) {
            i6 = i7 + i8;
            i5 = i8;
            i8 = 0;
        } else {
            int i12 = i8 + i7;
            if (i12 > bitmap.getWidth()) {
                int width = i12 - bitmap.getWidth();
                int i13 = i7 - width;
                int width2 = bitmap.getWidth() - i13;
                i5 = width;
                i8 = width2;
                i6 = i13;
            } else {
                i5 = 0;
                i6 = i7;
            }
        }
        if (height < 0) {
            height = 0;
        } else if (height + i9 > bitmap.getHeight()) {
            height = bitmap.getHeight() - i9;
        }
        if (i6 <= 0 || i9 <= 0) {
            return;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, i8, height, i6, i9);
        Bitmap bitmap2 = this.f26625;
        bitmap2.eraseColor(0);
        RectF rectF = new RectF(0.0f, 0.0f, bitmap2.getWidth(), bitmap2.getHeight());
        Paint paint = this.f26627;
        paint.setXfermode(null);
        Canvas canvas = this.f26636;
        canvas.drawRoundRect(rectF, 6.0f, 6.0f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.save();
        canvas.scale(1.5f, 1.5f);
        if (i5 != 0) {
            int color = paint.getColor();
            paint.setColor(this.f26634);
            canvas.drawRect(0.0f, 0.0f, i7, i9, paint);
            paint.setColor(color);
            canvas.drawBitmap(bitmapCreateBitmap, i5 < 0 ? -i5 : 0.0f, 0.0f, paint);
        } else {
            canvas.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, paint);
        }
        canvas.restore();
        bitmapCreateBitmap.recycle();
        int width3 = i3 - this.f26620;
        int i14 = i4 - this.f26624;
        if (width3 < 0) {
            width3 = (width3 * 3) / 4;
        } else {
            int width4 = rootView.getWidth();
            int i15 = this.f26630;
            if (width3 > width4 - i15) {
                width3 += ((rootView.getWidth() - i15) - width3) / 4;
            }
        }
        this.f26637.setImageBitmap(bitmap2);
        try {
            if (c4348.isShowing()) {
                c4348.update(width3, i14 + this.f26635, c4348.getWidth(), c4348.getHeight());
            } else {
                c4348.showAtLocation(rootView, 8388659, width3, i14 + this.f26635);
            }
        } catch (Exception unused) {
        }
    }
}
