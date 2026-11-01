package p067l;

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
import bin.p000mt.plus.R;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۡ֫ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: O98K */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewTreeObserverOnPreDrawListenerC10518 extends C1732 implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: ܳ֫ */
    public static final int f29092 = C13076.m29939(1.5f);

    /* JADX INFO: renamed from: ֫֫ */
    public final Rect f29093;

    /* JADX INFO: renamed from: ۗ */
    public final int f29094;

    /* JADX INFO: renamed from: ۙ */
    public final C14146 f29095;

    /* JADX INFO: renamed from: ۛ */
    public final Rect f29096;

    /* JADX INFO: renamed from: ۟ */
    public ViewTreeObserver f29097;

    /* JADX INFO: renamed from: ۤ */
    public int f29098;

    /* JADX INFO: renamed from: ۧ֫ */
    public final List f29099;

    /* JADX INFO: renamed from: ۨ */
    public final float f29100;

    /* JADX INFO: renamed from: ۫ */
    public int f29101;

    /* JADX INFO: renamed from: ۬ */
    public boolean f29102;

    /* JADX INFO: renamed from: ܰ */
    public final PopupWindow f29103;

    /* JADX INFO: renamed from: ܽ֫ */
    public boolean f29104;

    /* JADX INFO: renamed from: ܿ֫ */
    public float f29105;

    /* JADX INFO: renamed from: ᩳ֫ */
    public float f29106;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f29107;

    /* JADX INFO: renamed from: ᩸ */
    public float f29108;

    /* JADX INFO: renamed from: ᩹ */
    public float f29109;

    /* JADX INFO: renamed from: ᩺ */
    public int[] f29110;

    public ViewTreeObserverOnPreDrawListenerC10518(Context context, C14146 c14146, int i) {
        Drawable drawableMutate;
        super(context);
        this.f29110 = new int[2];
        this.f29096 = new Rect();
        Rect rect = new Rect();
        this.f29093 = rect;
        this.f29099 = Collections.singletonList(rect);
        this.f29094 = i;
        this.f29095 = c14146;
        this.f29100 = ViewConfiguration.get(context).getScaledTouchSlop();
        if (i == 0) {
            drawableMutate = C1059.m14961(context.getResources(), R.drawable.MT_Protector, null).mutate();
            drawableMutate.setAlpha(230);
        } else if (i == 1) {
            drawableMutate = C1059.m14961(context.getResources(), R.drawable.MT_Protector, null).mutate();
            drawableMutate.setAlpha(210);
        } else if (i == 2) {
            drawableMutate = C1059.m14961(context.getResources(), R.drawable.MT_Protector, null).mutate();
            drawableMutate.setAlpha(210);
        } else {
            throw new IllegalArgumentException();
        }
        drawableMutate.setColorFilter(new PorterDuffColorFilter(C23223.f72969, PorterDuff.Mode.SRC_IN));
        setImageDrawable(drawableMutate);
        PopupWindow popupWindow = new PopupWindow(this);
        this.f29103 = popupWindow;
        popupWindow.setAnimationStyle(0);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        popupWindow.setWidth(-2);
        popupWindow.setHeight(-2);
        C3129.m5336(popupWindow, 1999);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m24253() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(C23223.f72969, PorterDuff.Mode.SRC_IN));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int i = this.f29094;
        C14146 c14146 = this.f29095;
        if (actionMasked == 0) {
            this.f29107 = true;
            c14146.m32507();
            C23929 c23929 = c14146.f40262;
            this.f29104 = false;
            this.f29108 = motionEvent.getRawX();
            this.f29109 = motionEvent.getRawY();
            if (i == 0) {
                float width = (getWidth() / 2.0f) + this.f29101;
                float fM26496 = this.f29098 - (c23929.m26496() / 2.0f);
                this.f29106 = width - this.f29108;
                this.f29105 = fM26496 - this.f29109;
                c14146.f40236 = Math.min(c23929.m26496() + (c14146.m32523() / 2.0f) + c14146.getPaddingTop(), fM26496);
                c14146.f40218 = Math.min((c14146.getHeight() - c14146.getPaddingBottom()) - (c23929.m26496() / 2.0f), Math.max((c14146.getHeight() - c14146.getPaddingBottom()) - c14146.m32523(), fM26496));
                c14146.f40191 = 0;
                c14146.m32531(true);
            } else if (i == 1) {
                float width2 = ((getWidth() * 3) / 4.0f) + this.f29101;
                float fM26497 = this.f29098 - (c23929.m26496() / 2.0f);
                this.f29106 = width2 - this.f29108;
                this.f29105 = fM26497 - this.f29109;
                c14146.f40236 = Math.min(c23929.m26496() + (c14146.m32523() / 2.0f) + c14146.getPaddingTop(), fM26497);
                c14146.f40218 = Math.min((c14146.getHeight() - c14146.getPaddingBottom()) - (c23929.m26496() / 2.0f), Math.max((c14146.getHeight() - c14146.getPaddingBottom()) - c14146.m32523(), fM26497));
                c14146.f40191 = 0;
                c14146.m32550(Math.max(c14146.m32508(), c14146.m32512()), true);
            } else if (i == 2) {
                float width3 = (getWidth() / 4.0f) + this.f29101;
                float fM26498 = this.f29098 - (c23929.m26496() / 2.0f);
                this.f29106 = width3 - this.f29108;
                this.f29105 = fM26498 - this.f29109;
                c14146.f40236 = Math.min(c23929.m26496() + (c14146.m32523() / 2.0f) + c14146.getPaddingTop(), fM26498);
                c14146.f40218 = Math.min((c14146.getHeight() - c14146.getPaddingBottom()) - (c23929.m26496() / 2.0f), Math.max((c14146.getHeight() - c14146.getPaddingBottom()) - c14146.m32523(), fM26498));
                c14146.f40191 = 0;
                c14146.m32550(Math.min(c14146.m32508(), c14146.m32512()), true);
            }
            this.f29106 -= c14146.getPaddingLeft();
            this.f29105 -= c14146.getPaddingTop();
            return true;
        }
        if (actionMasked == 1) {
            c14146.m32584();
            if (i == 0) {
                c14146.m32531(false);
                c14146.m32363(-1);
            } else if (i == 1) {
                c14146.m32550(0, false);
                c14146.m32363(Math.min(c14146.m32508(), c14146.m32512()));
            } else if (i == 2) {
                c14146.m32550(0, false);
                c14146.m32363(Math.max(c14146.m32508(), c14146.m32512()));
            }
            c14146.m32601();
            this.f29107 = false;
            return true;
        }
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                c14146.m32584();
                if (i == 0) {
                    c14146.m32531(false);
                } else if (i == 1 || i == 2) {
                    c14146.m32550(0, false);
                }
                this.f29107 = false;
                return true;
            }
            return super.onTouchEvent(motionEvent);
        }
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        if (!this.f29104) {
            int i2 = (int) (rawX - this.f29108);
            int i3 = (int) (rawY - this.f29109);
            float fAbs = Math.abs(i2);
            float f = this.f29100;
            if (fAbs <= f && Math.abs(i3) <= f) {
                return true;
            }
            this.f29104 = true;
        }
        float f2 = this.f29105 + rawY;
        boolean z = c14146.f40191 == 0;
        float f3 = c14146.f40236;
        if (f2 < f3) {
            c14146.f40191 = -C14146.m32248((int) (f3 - f2));
            if (z) {
                c14146.f40241 = SystemClock.uptimeMillis();
            }
            c14146.postInvalidateOnAnimation();
        } else {
            float f4 = c14146.f40218;
            if (f2 > f4) {
                c14146.f40191 = C14146.m32248((int) (f2 - f4));
                if (z) {
                    c14146.f40241 = SystemClock.uptimeMillis();
                }
                c14146.postInvalidateOnAnimation();
            } else {
                c14146.f40191 = 0;
            }
        }
        float fM26499 = c14146.f40262.m26496() / 2.0f;
        float paddingTop = c14146.f40218 - c14146.getPaddingTop();
        float f5 = rawY + this.f29105;
        if (f5 >= fM26499) {
            fM26499 = f5 > paddingTop ? paddingTop : f5;
        }
        if (i == 0) {
            c14146.m32560(rawX + this.f29106, fM26499);
            return true;
        }
        c14146.m32540(rawX + this.f29106, fM26499);
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24252(int i, int i2, boolean z) {
        this.f29101 = i;
        this.f29098 = i2;
        this.f29102 = z;
        C14146 c14146 = this.f29095;
        boolean z2 = z && c14146.isAttachedToWindow();
        ViewTreeObserver viewTreeObserver = this.f29097;
        if (z2 != (viewTreeObserver != null)) {
            if (z2) {
                ViewTreeObserver viewTreeObserver2 = c14146.getViewTreeObserver();
                this.f29097 = viewTreeObserver2;
                viewTreeObserver2.addOnPreDrawListener(this);
            } else {
                if (viewTreeObserver.isAlive()) {
                    this.f29097.removeOnPreDrawListener(this);
                }
                this.f29097 = null;
            }
        }
        m24251();
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        m24251();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0092  */
    /* JADX INFO: renamed from: ܿ */
    private void m24251() {
        int iRound;
        Drawable drawable;
        int i = this.f29101;
        int i2 = this.f29098;
        boolean z = this.f29102;
        int width = 0;
        C14146 c14146 = this.f29095;
        boolean z2 = z && c14146.isAttachedToWindow() && c14146.isShown() && c14146.getWindowVisibility() == 0;
        if (z2 && !c14146.m32516() && !c14146.m32509()) {
            Rect rect = this.f29096;
            if (c14146.getLocalVisibleRect(rect)) {
                int width2 = getWidth();
                if (width2 <= 0 && (drawable = getDrawable()) != null) {
                    width2 = drawable.getIntrinsicWidth();
                }
                if (width2 < 0) {
                    width2 = 0;
                }
                int i3 = this.f29094;
                if (i3 == 1) {
                    iRound = Math.round(width2 * 0.75f);
                } else if (i3 == 2) {
                    iRound = Math.round(width2 * 0.25f);
                } else {
                    iRound = width2 / 2;
                }
                int scrollX = (c14146.getScrollX() + (iRound + i)) - c14146.getPaddingLeft();
                int scrollY = (c14146.getScrollY() + i2) - c14146.getPaddingTop();
                int i4 = rect.left;
                int i5 = f29092;
                if (scrollX < (i4 - i5) - 1 || scrollX >= rect.right + i5 || scrollY < rect.top || scrollY >= rect.bottom + 1) {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
        }
        PopupWindow popupWindow = this.f29103;
        if (!z2) {
            if (popupWindow.isShowing()) {
                popupWindow.dismiss();
                return;
            }
            return;
        }
        int[] iArr = this.f29110;
        c14146.getLocationInWindow(iArr);
        int i6 = i + iArr[0];
        int i7 = i2 + iArr[1];
        if (i6 < 0) {
            setTranslationX(i6);
        } else {
            width = c14146.getRootView().getWidth() - getWidth();
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
            popupWindow.showAtLocation(c14146, 8388659, width, i7);
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m24254() {
        return this.f29107 && this.f29103.isShowing();
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT >= 29) {
            this.f29093.set(0, 0, getWidth(), getHeight());
            setSystemGestureExclusionRects(this.f29099);
        }
    }
}
