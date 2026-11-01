package p067l;

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
public final class C10676 {

    /* JADX INFO: renamed from: ֨ */
    public static final C2582 f29542 = new C2582(1);

    /* JADX INFO: renamed from: ۠ */
    public static final int f29543 = C13076.m29939(2.5f);

    /* JADX INFO: renamed from: ܶ */
    public static boolean f29544 = true;

    /* JADX INFO: renamed from: ֡ */
    public int f29545;

    /* JADX INFO: renamed from: ֫ */
    public boolean f29546;

    /* JADX INFO: renamed from: ۖ */
    public C14146 f29547;

    /* JADX INFO: renamed from: ۘ */
    public int f29548;

    /* JADX INFO: renamed from: ۚ */
    public int f29549;

    /* JADX INFO: renamed from: ۜ */
    public final Bitmap f29550;

    /* JADX INFO: renamed from: ۡ */
    public final C1058 f29551;

    /* JADX INFO: renamed from: ۢ */
    public Paint f29552;

    /* JADX INFO: renamed from: ܳ */
    public int f29554;

    /* JADX INFO: renamed from: ܺ */
    public int f29555;

    /* JADX INFO: renamed from: ܿ */
    public int f29557;

    /* JADX INFO: renamed from: ᩳ */
    public int f29558;

    /* JADX INFO: renamed from: ᩴ */
    public int f29559;

    /* JADX INFO: renamed from: ᩵ */
    public int f29560;

    /* JADX INFO: renamed from: ᩷ */
    public final Canvas f29561;

    /* JADX INFO: renamed from: ᩻ */
    public C1732 f29562;

    /* JADX INFO: renamed from: ۧ */
    public boolean f29553 = true;

    /* JADX INFO: renamed from: ܽ */
    public HandlerC3235 f29556 = new HandlerC3235(this, new C4404(this));

    /* JADX INFO: renamed from: ֫ */
    public static void m24580(C10676 c10676, final C10676 c10677) {
        Window window;
        final int i = c10676.f29558;
        final int i2 = c10676.f29557;
        C14146 c14146 = c10677.f29547;
        if (!c14146.isAttachedToWindow() || c10677.f29546) {
            return;
        }
        final View rootView = c14146.getRootView();
        if (Build.VERSION.SDK_INT < 28) {
            c10677.m24578(rootView, i, i2);
            return;
        }
        if (f29544) {
            try {
                Field declaredField = rootView.getClass().getDeclaredField("mWindow");
                declaredField.setAccessible(true);
                window = (Window) declaredField.get(rootView);
            } catch (Exception unused) {
                f29544 = false;
                window = null;
            }
        } else {
            window = null;
        }
        if (window == null) {
            c10677.m24578(rootView, i, i2);
            return;
        }
        int width = rootView.getWidth();
        int height = rootView.getHeight();
        Bitmap bitmapCreateBitmap = (Bitmap) f29542.m3892();
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
                C10676.m24579(this.f31591, bitmap, i, i2, rootView, i3);
            }
        }, C7050.m16221());
    }

    public C10676(C14146 c14146) {
        Paint paint = new Paint(1);
        this.f29552 = paint;
        this.f29547 = c14146;
        Context context = c14146.getContext();
        this.f29559 = C22553.m50541(context.getTheme(), R.attr.windowBackground);
        paint.setColor(-65536);
        C1058 c1058 = new C1058(context, null, bin.p000mt.plus.R.attr.MT_Protector);
        this.f29551 = c1058;
        int iM29939 = C13076.m29939(90.0f);
        this.f29548 = iM29939;
        int iM299310 = C13076.m29939(35.0f);
        this.f29554 = iM299310;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) (iM29939 * 1.5f), (int) (iM299310 * 1.5f), Bitmap.Config.ARGB_8888);
        this.f29550 = bitmapCreateBitmap;
        this.f29561 = new Canvas(bitmapCreateBitmap);
        this.f29549 = C13076.m29939(110.0f);
        c1058.setBackgroundDrawable(context.getResources().getDrawable(C23223.m51761(bin.p000mt.plus.R.drawable.MT_Protector, bin.p000mt.plus.R.drawable.MT_Protector)));
        c1058.setWidth(-2);
        c1058.setHeight(-2);
        Rect rect = new Rect();
        c1058.getBackground().getPadding(rect);
        int i = rect.left;
        int i2 = iM29939 * 3;
        this.f29545 = (i2 / 4) + i;
        this.f29555 = (i2 / 2) + i + rect.right;
        c1058.setFocusable(false);
        c1058.setTouchable(true);
        c1058.setOutsideTouchable(true);
        c1058.setClippingEnabled(false);
        C1732 c1732 = new C1732(c14146.getContext());
        this.f29562 = c1732;
        c1732.setImageResource(bin.p000mt.plus.R.mipmap.MT_Protector);
        c1058.setContentView(c1732);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24582(float f) {
        this.f29553 = ((float) this.f29554) / f > 1.1f;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24581() {
        C1058 c1058 = this.f29551;
        this.f29546 = true;
        this.f29556.removeMessages(0);
        try {
            if (c1058.isShowing()) {
                c1058.dismiss();
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24583(int i, int i2, int i3) {
        if (this.f29553) {
            if (this.f29546) {
                this.f29546 = false;
            }
            this.f29560 = i3;
            this.f29558 = i;
            this.f29557 = i2;
            HandlerC3235 handlerC3235 = this.f29556;
            if (handlerC3235.hasMessages(0)) {
                return;
            }
            C14146 c14146 = this.f29547;
            if (c14146.f40279) {
                if (c14146.f40191 <= f29543) {
                    handlerC3235.sendEmptyMessageDelayed(0, 10L);
                    return;
                } else {
                    handlerC3235.sendEmptyMessageDelayed(0, 50L);
                    return;
                }
            }
            handlerC3235.sendEmptyMessage(0);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m24579(C10676 c10676, Bitmap bitmap, int i, int i2, View view, int i3) {
        boolean z = c10676.f29546;
        C2582 c2582 = f29542;
        if (z) {
            if (c2582.m3890(bitmap)) {
                return;
            }
            bitmap.recycle();
        } else {
            if (i3 == 0) {
                c10676.m24577(bitmap, i, i2);
            } else {
                c10676.m24578(view, i, i2);
            }
            if (c2582.m3890(bitmap)) {
                return;
            }
            bitmap.recycle();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m24578(View view, int i, int i2) {
        view.setDrawingCacheEnabled(true);
        view.buildDrawingCache();
        Bitmap drawingCache = view.getDrawingCache();
        if (drawingCache == null) {
            view.setDrawingCacheEnabled(false);
        } else {
            m24577(drawingCache, i, i2);
            view.setDrawingCacheEnabled(false);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m24577(Bitmap bitmap, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        C1058 c1058 = this.f29551;
        C14146 c14146 = this.f29547;
        View rootView = c14146.getRootView();
        int i7 = this.f29548;
        int i8 = i - (i7 / 2);
        int i9 = this.f29554;
        int height = i2 - (i9 / 2);
        if (rootView != c14146) {
            int[] iArr = new int[2];
            c14146.getLocationInWindow(iArr);
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
        Bitmap bitmap2 = this.f29550;
        bitmap2.eraseColor(0);
        RectF rectF = new RectF(0.0f, 0.0f, bitmap2.getWidth(), bitmap2.getHeight());
        Paint paint = this.f29552;
        paint.setXfermode(null);
        Canvas canvas = this.f29561;
        canvas.drawRoundRect(rectF, 6.0f, 6.0f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.save();
        canvas.scale(1.5f, 1.5f);
        if (i5 != 0) {
            int color = paint.getColor();
            paint.setColor(this.f29559);
            canvas.drawRect(0.0f, 0.0f, i7, i9, paint);
            paint.setColor(color);
            canvas.drawBitmap(bitmapCreateBitmap, i5 < 0 ? -i5 : 0.0f, 0.0f, paint);
        } else {
            canvas.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, paint);
        }
        canvas.restore();
        bitmapCreateBitmap.recycle();
        int width3 = i3 - this.f29545;
        int i14 = i4 - this.f29549;
        if (width3 < 0) {
            width3 = (width3 * 3) / 4;
        } else {
            int width4 = rootView.getWidth();
            int i15 = this.f29555;
            if (width3 > width4 - i15) {
                width3 += ((rootView.getWidth() - i15) - width3) / 4;
            }
        }
        this.f29562.setImageBitmap(bitmap2);
        try {
            if (c1058.isShowing()) {
                c1058.update(width3, i14 + this.f29560, c1058.getWidth(), c1058.getHeight());
            } else {
                c1058.showAtLocation(rootView, 8388659, width3, i14 + this.f29560);
            }
        } catch (Exception unused) {
        }
    }
}
