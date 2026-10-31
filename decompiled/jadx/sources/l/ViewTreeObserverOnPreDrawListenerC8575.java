package l;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import bin.mt.plus.R;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۡ֫ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: O98K */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewTreeObserverOnPreDrawListenerC8575 extends C17939 implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public static final int f26176 = C11266.m27878(1.5f);

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final Rect f26177;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f26178;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12392 f26179;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final Rect f26180;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public ViewTreeObserver f26181;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f26182;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final List f26183;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final float f26184;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f26185;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f26186;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final PopupWindow f26187;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public boolean f26188;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public float f26189;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public float f26190;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f26191;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public float f26192;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public float f26193;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int[] f26194;

    public ViewTreeObserverOnPreDrawListenerC8575(Context context, C12392 c12392, int i) {
        Drawable drawableMutate;
        super(context);
        this.f26194 = new int[2];
        this.f26180 = new Rect();
        Rect rect = new Rect();
        this.f26177 = rect;
        this.f26183 = Collections.singletonList(rect);
        this.f26178 = i;
        this.f26179 = c12392;
        this.f26184 = ViewConfiguration.get(context).getScaledTouchSlop();
        if (i == 0) {
            drawableMutate = C4369.m13097(context.getResources(), R.drawable.MT_Protector, null).mutate();
            drawableMutate.setAlpha(230);
        } else if (i == 1) {
            drawableMutate = C4369.m13097(context.getResources(), R.drawable.MT_Protector, null).mutate();
            drawableMutate.setAlpha(210);
        } else if (i == 2) {
            drawableMutate = C4369.m13097(context.getResources(), R.drawable.MT_Protector, null).mutate();
            drawableMutate.setAlpha(210);
        } else {
            throw new IllegalArgumentException();
        }
        drawableMutate.setColorFilter(new PorterDuffColorFilter(C21943.f70257, PorterDuff.Mode.SRC_IN));
        setImageDrawable(drawableMutate);
        PopupWindow popupWindow = new PopupWindow(this);
        this.f26187 = popupWindow;
        popupWindow.setAnimationStyle(0);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        popupWindow.setWidth(-2);
        popupWindow.setHeight(-2);
        C0801.m3023(popupWindow, 1999);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m22284() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(C21943.f70257, PorterDuff.Mode.SRC_IN));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int i = this.f26178;
        C12392 c12392 = this.f26179;
        if (actionMasked == 0) {
            this.f26191 = true;
            c12392.m30443();
            C22686 c22686 = c12392.f37245;
            this.f26188 = false;
            this.f26192 = motionEvent.getRawX();
            this.f26193 = motionEvent.getRawY();
            if (i == 0) {
                float width = (getWidth() / 2.0f) + this.f26185;
                float fM24484 = this.f26182 - (c22686.m24484() / 2.0f);
                this.f26190 = width - this.f26192;
                this.f26189 = fM24484 - this.f26193;
                c12392.f37219 = Math.min(c22686.m24484() + (c12392.m30459() / 2.0f) + c12392.getPaddingTop(), fM24484);
                c12392.f37201 = Math.min((c12392.getHeight() - c12392.getPaddingBottom()) - (c22686.m24484() / 2.0f), Math.max((c12392.getHeight() - c12392.getPaddingBottom()) - c12392.m30459(), fM24484));
                c12392.f37174 = 0;
                c12392.m30467(true);
            } else if (i == 1) {
                float width2 = ((getWidth() * 3) / 4.0f) + this.f26185;
                float fM24485 = this.f26182 - (c22686.m24484() / 2.0f);
                this.f26190 = width2 - this.f26192;
                this.f26189 = fM24485 - this.f26193;
                c12392.f37219 = Math.min(c22686.m24484() + (c12392.m30459() / 2.0f) + c12392.getPaddingTop(), fM24485);
                c12392.f37201 = Math.min((c12392.getHeight() - c12392.getPaddingBottom()) - (c22686.m24484() / 2.0f), Math.max((c12392.getHeight() - c12392.getPaddingBottom()) - c12392.m30459(), fM24485));
                c12392.f37174 = 0;
                c12392.m30486(Math.max(c12392.m30444(), c12392.m30448()), true);
            } else if (i == 2) {
                float width3 = (getWidth() / 4.0f) + this.f26185;
                float fM24486 = this.f26182 - (c22686.m24484() / 2.0f);
                this.f26190 = width3 - this.f26192;
                this.f26189 = fM24486 - this.f26193;
                c12392.f37219 = Math.min(c22686.m24484() + (c12392.m30459() / 2.0f) + c12392.getPaddingTop(), fM24486);
                c12392.f37201 = Math.min((c12392.getHeight() - c12392.getPaddingBottom()) - (c22686.m24484() / 2.0f), Math.max((c12392.getHeight() - c12392.getPaddingBottom()) - c12392.m30459(), fM24486));
                c12392.f37174 = 0;
                c12392.m30486(Math.min(c12392.m30444(), c12392.m30448()), true);
            }
            this.f26190 -= c12392.getPaddingLeft();
            this.f26189 -= c12392.getPaddingTop();
            return true;
        }
        if (actionMasked == 1) {
            c12392.m30520();
            if (i == 0) {
                c12392.m30467(false);
                c12392.m30299(-1);
            } else if (i == 1) {
                c12392.m30486(0, false);
                c12392.m30299(Math.min(c12392.m30444(), c12392.m30448()));
            } else if (i == 2) {
                c12392.m30486(0, false);
                c12392.m30299(Math.max(c12392.m30444(), c12392.m30448()));
            }
            c12392.m30537();
            this.f26191 = false;
            return true;
        }
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                c12392.m30520();
                if (i == 0) {
                    c12392.m30467(false);
                } else if (i == 1 || i == 2) {
                    c12392.m30486(0, false);
                }
                this.f26191 = false;
                return true;
            }
            return super.onTouchEvent(motionEvent);
        }
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        if (!this.f26188) {
            int i2 = (int) (rawX - this.f26192);
            int i3 = (int) (rawY - this.f26193);
            float fAbs = Math.abs(i2);
            float f = this.f26184;
            if (fAbs <= f && Math.abs(i3) <= f) {
                return true;
            }
            this.f26188 = true;
        }
        float f2 = this.f26189 + rawY;
        boolean z = c12392.f37174 == 0;
        float f3 = c12392.f37219;
        if (f2 < f3) {
            c12392.f37174 = -C12392.m30184((int) (f3 - f2));
            if (z) {
                c12392.f37224 = SystemClock.uptimeMillis();
            }
            c12392.postInvalidateOnAnimation();
        } else {
            float f4 = c12392.f37201;
            if (f2 > f4) {
                c12392.f37174 = C12392.m30184((int) (f2 - f4));
                if (z) {
                    c12392.f37224 = SystemClock.uptimeMillis();
                }
                c12392.postInvalidateOnAnimation();
            } else {
                c12392.f37174 = 0;
            }
        }
        float fM24487 = c12392.f37245.m24484() / 2.0f;
        float paddingTop = c12392.f37201 - c12392.getPaddingTop();
        float f5 = rawY + this.f26189;
        if (f5 >= fM24487) {
            fM24487 = f5 > paddingTop ? paddingTop : f5;
        }
        if (i == 0) {
            c12392.m30496(rawX + this.f26190, fM24487);
            return true;
        }
        c12392.m30476(rawX + this.f26190, fM24487);
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22283(int i, int i2, boolean z) {
        this.f26185 = i;
        this.f26182 = i2;
        this.f26186 = z;
        C12392 c12392 = this.f26179;
        boolean z2 = z && c12392.isAttachedToWindow();
        ViewTreeObserver viewTreeObserver = this.f26181;
        if (z2 != (viewTreeObserver != null)) {
            if (z2) {
                ViewTreeObserver viewTreeObserver2 = c12392.getViewTreeObserver();
                this.f26181 = viewTreeObserver2;
                viewTreeObserver2.addOnPreDrawListener(this);
            } else {
                if (viewTreeObserver.isAlive()) {
                    this.f26181.removeOnPreDrawListener(this);
                }
                this.f26181 = null;
            }
        }
        m22282();
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        m22282();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0092  */
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m22282() {
        int iRound;
        Drawable drawable;
        int i = this.f26185;
        int i2 = this.f26182;
        boolean z = this.f26186;
        int width = 0;
        C12392 c12392 = this.f26179;
        boolean z2 = z && c12392.isAttachedToWindow() && c12392.isShown() && c12392.getWindowVisibility() == 0;
        if (z2 && !c12392.m30452() && !c12392.m30445()) {
            Rect rect = this.f26180;
            if (c12392.getLocalVisibleRect(rect)) {
                int width2 = getWidth();
                if (width2 <= 0 && (drawable = getDrawable()) != null) {
                    width2 = drawable.getIntrinsicWidth();
                }
                if (width2 < 0) {
                    width2 = 0;
                }
                int i3 = this.f26178;
                if (i3 == 1) {
                    iRound = Math.round(width2 * 0.75f);
                } else if (i3 == 2) {
                    iRound = Math.round(width2 * 0.25f);
                } else {
                    iRound = width2 / 2;
                }
                int scrollX = (c12392.getScrollX() + (iRound + i)) - c12392.getPaddingLeft();
                int scrollY = (c12392.getScrollY() + i2) - c12392.getPaddingTop();
                int i4 = rect.left;
                int i5 = f26176;
                if (scrollX < (i4 - i5) - 1 || scrollX >= rect.right + i5 || scrollY < rect.top || scrollY >= rect.bottom + 1) {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
        }
        PopupWindow popupWindow = this.f26187;
        if (!z2) {
            if (popupWindow.isShowing()) {
                popupWindow.dismiss();
                return;
            }
            return;
        }
        int[] iArr = this.f26194;
        c12392.getLocationInWindow(iArr);
        int i6 = i + iArr[0];
        int i7 = i2 + iArr[1];
        if (i6 < 0) {
            setTranslationX(i6);
        } else {
            width = c12392.getRootView().getWidth() - getWidth();
            if (i6 > width) {
                setTranslationX(i6 - width);
            } else {
                setTranslationX(0.0f);
                width = i6;
            }
        }
        if (popupWindow.isShowing()) {
            popupWindow.update(width, i7, -1, -1);
        } else {
            popupWindow.showAtLocation(c12392, 8388659, width, i7);
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m22285() {
        return this.f26191 && this.f26187.isShowing();
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT >= 29) {
            this.f26177.set(0, 0, getWidth(), getHeight());
            setSystemGestureExclusionRects(this.f26183);
        }
    }
}
