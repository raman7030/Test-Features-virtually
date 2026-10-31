package l;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import bin.mt.plus.R;
import com.umeng.commonsdk.framework.UMModuleRegister;

/* JADX INFO: renamed from: l.֡᩶ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81UC */
/* JADX INFO: loaded from: classes2.dex */
public final class C0640 extends View {

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public int f2449;

    /* JADX INFO: renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public C17574 f2450;

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public boolean f2451;

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public float f2452;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f2453;

    /* JADX INFO: renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public boolean f2454;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public OverScroller f2455;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC1346 f2456;

    /* JADX INFO: renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public float f2457;

    /* JADX INFO: renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public int f2458;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C9108 f2459;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public boolean f2460;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f2461;

    /* JADX INFO: renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public EdgeEffect f2462;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public BitmapDrawable f2463;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public C16162 f2464;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C17637 f2465;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public BitmapDrawable f2466;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C19692 f2467;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public PointF f2468;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public PointF f2469;

    /* JADX INFO: renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public boolean f2470;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f2471;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public float f2472;

    /* JADX INFO: renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public int f2473;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public PointF f2474;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public PointF f2475;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public float f2476;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public float f2477;

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public int f2478;

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public int f2479;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public EdgeEffect f2480;

    /* JADX INFO: renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public float f2481;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public int f2482;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public float f2483;

    /* JADX INFO: renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public int f2484;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f2485;

    /* JADX INFO: renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public boolean f2486;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f2487;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public PointF f2488;

    @Override // android.view.View
    public final boolean isOpaque() {
        return true;
    }

    public C0640(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean z = false;
        this.f2451 = false;
        this.f2478 = -1;
        this.f2479 = -1;
        this.f2449 = -1;
        this.f2458 = -1;
        this.f2468 = new PointF();
        this.f2488 = new PointF();
        this.f2469 = new PointF();
        this.f2475 = new PointF();
        this.f2474 = new PointF();
        setFocusable(true);
        setFocusableInTouchMode(true);
        setVerticalScrollBarEnabled(true);
        setScrollbarFadingEnabled(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(false);
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.f2483 = displayMetrics.density * 3.0f;
        float f = displayMetrics.scaledDensity;
        this.f2472 = 6.0f * f;
        this.f2476 = f * 30.0f;
        this.f2484 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f2462 = new EdgeEffect(context);
        this.f2480 = new EdgeEffect(context);
        this.f2459 = new C9108(context, new C4169(this));
        this.f2455 = new OverScroller(context);
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            z = true;
        }
        this.f2485 = z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2649(C5580 c5580) {
        this.f2456 = c5580;
    }

    @Override // android.view.View
    public final void setOnKeyListener(View.OnKeyListener onKeyListener) {
        if (onKeyListener instanceof InterfaceC1346) {
            this.f2456 = (InterfaceC1346) onKeyListener;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2650(C17574 c17574) {
        C16162 c16162;
        C17574 c17575 = this.f2450;
        if (c17574 == c17575) {
            return;
        }
        if (c17575 != null) {
            InterfaceC16868 interfaceC16868M41099 = c17575.m41099();
            if (C12354.m29972(interfaceC16868M41099)) {
                ((C18986) interfaceC16868M41099).m43822((C0640) null);
            }
        }
        InterfaceC16868 interfaceC16868M410910 = c17574.m41099();
        if (C12354.m29972(interfaceC16868M410910)) {
            ((C18986) interfaceC16868M410910).m43822(this);
        }
        this.f2473 = 0;
        this.f2487++;
        this.f2467 = null;
        this.f2450 = c17574;
        this.f2465 = null;
        this.f2453 = 0;
        if (c17574.m41094() != 0.0f && ((c16162 = this.f2464) == null || c16162.f49790 != c17574.m41094())) {
            float fM41094 = c17574.m41094();
            C16162 c16163 = this.f2464;
            this.f2464 = new C16162(fM41094, c16163 == null ? C4925.m14319() : c16163.f49784);
        }
        m2655();
        setVerticalScrollBarEnabled(true);
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.restartInput(this);
        }
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        editorInfo.inputType = 0;
        editorInfo.imeOptions = 33554432;
        editorInfo.initialSelEnd = 0;
        editorInfo.initialSelStart = 0;
        return new C19692(this);
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        C17637 c17637 = this.f2465;
        if (c17637 == null) {
            return 1;
        }
        return c17637.m41261().m7001();
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        C17637 c17637 = this.f2465;
        if (c17637 == null) {
            return 1;
        }
        return c17637.f53918;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        C17637 c17637 = this.f2465;
        if (c17637 == null) {
            return 1;
        }
        return (c17637.m41261().m7001() + this.f2473) - this.f2465.f53918;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m2653() {
        boolean z;
        int i;
        C17637 c17637 = this.f2465;
        if (c17637 == null) {
            return;
        }
        boolean z2 = true;
        boolean z3 = this.f2473 != 0;
        if (this.f2451 || z3) {
            int iM7009 = c17637.m41261().m7009();
            int iM41258 = this.f2465.m41258();
            int i2 = this.f2473;
            if ((-i2) + iM41258 > iM7009) {
                if (this.f2451) {
                    m2648((MotionEvent) null);
                }
                z2 = false;
            } else {
                this.f2473 = i2 - iM41258;
                this.f2449 -= iM41258;
                this.f2458 -= iM41258;
            }
            if (z3) {
                awakenScrollBars();
            }
            z = z2;
        } else {
            z = false;
        }
        if (!z && (i = this.f2473) != 0) {
            if (i < -3) {
                awakenScrollBars();
            }
            this.f2473 = 0;
        }
        this.f2465.m41248();
        invalidate();
        C2115 c2115M41261 = this.f2465.m41261();
        int i3 = this.f2473;
        C17637 c17638 = this.f2465;
        String strM7002 = c2115M41261.m7002(0, i3, c17638.f53892, c17638.f53918 + i3);
        if (this.f2485) {
            setContentDescription(strM7002);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2646(float f) {
        float f2 = f * getContext().getResources().getDisplayMetrics().scaledDensity;
        C16162 c16162 = this.f2464;
        if (c16162 == null || c16162.f49790 != f2) {
            this.f2464 = new C16162(f2, c16162 == null ? C4925.m14319() : c16162.f49784);
            m2655();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2647(Typeface typeface) {
        C16162 c16162 = this.f2464;
        if (c16162.f49784 != typeface) {
            this.f2464 = new C16162(c16162.f49790, typeface);
            m2655();
            invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m2622(int i) {
        if (i == 0) {
            return;
        }
        boolean z = i < 0;
        int iAbs = Math.abs(i);
        for (int i2 = 0; i2 < iAbs; i2++) {
            if (this.f2465.m41264()) {
                m2652(z ? 19 : 20, 0);
            } else {
                this.f2473 = Math.min(0, Math.max(-this.f2465.m41261().m7009(), this.f2473 + (z ? -1 : 1)));
                if (!awakenScrollBars()) {
                    invalidate();
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0224  */
    /* JADX WARN: Code duplicated, block: B:112:0x022c  */
    /* JADX WARN: Code duplicated, block: B:27:0x007e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0082  */
    /* JADX WARN: Code duplicated, block: B:30:0x008c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0091  */
    /* JADX WARN: Code duplicated, block: B:35:0x009d  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e6 A[PHI: r1
      0x00e6: PHI (r1v45 float) = (r1v42 float), (r1v43 float) binds: [B:48:0x00e4, B:51:0x00ec] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int i2;
        EdgeEffect edgeEffect;
        boolean zIsFinished;
        EdgeEffect edgeEffect2;
        if (this.f2465 != null) {
            int action = motionEvent.getAction() & 255;
            PointF pointF = this.f2468;
            if (action == 0) {
                pointF.set(motionEvent.getX(), motionEvent.getY());
                this.f2471 = false;
                this.f2460 = false;
                this.f2470 = false;
                this.f2454 = false;
                this.f2486 = false;
            } else if (action == 1) {
                edgeEffect = this.f2462;
                if (edgeEffect != null) {
                    edgeEffect.onRelease();
                    zIsFinished = this.f2462.isFinished();
                } else {
                    zIsFinished = false;
                }
                edgeEffect2 = this.f2480;
                if (edgeEffect2 != null) {
                    edgeEffect2.onRelease();
                    zIsFinished |= this.f2480.isFinished();
                }
                if (zIsFinished) {
                    postInvalidateOnAnimation();
                }
            } else if (action != 2) {
                if (action == 3) {
                    edgeEffect = this.f2462;
                    if (edgeEffect != null) {
                        edgeEffect.onRelease();
                        zIsFinished = this.f2462.isFinished();
                    } else {
                        zIsFinished = false;
                    }
                    edgeEffect2 = this.f2480;
                    if (edgeEffect2 != null) {
                        edgeEffect2.onRelease();
                        zIsFinished |= this.f2480.isFinished();
                    }
                    if (zIsFinished) {
                        postInvalidateOnAnimation();
                    }
                } else if (action == 5) {
                    int i3 = this.f2482 + 1;
                    this.f2482 = i3;
                    if (i3 == 1) {
                        this.f2470 = true;
                        this.f2454 = true;
                        this.f2457 = this.f2464.f49790;
                        this.f2481 = m2634(motionEvent);
                        this.f2459.m23474(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                    }
                } else if (action == 6) {
                    int i4 = this.f2482 - 1;
                    this.f2482 = i4;
                    if (this.f2470 && i4 == 0) {
                        this.f2470 = false;
                    }
                }
            } else if (!this.f2460 && m2620(pointF, new PointF(motionEvent.getX(), motionEvent.getY())) >= this.f2484) {
                this.f2460 = true;
            }
            if (action == 2 && this.f2470 && this.f2482 == 1) {
                float fM2634 = m2634(motionEvent);
                if (!this.f2486) {
                    if (Math.abs(fM2634 - this.f2481) > this.f2484) {
                        this.f2486 = true;
                    }
                }
                float f = (this.f2457 * fM2634) / this.f2481;
                float f2 = this.f2476;
                if (f > f2) {
                    f = f2;
                } else {
                    f2 = this.f2472;
                    if (f < f2) {
                        f = f2;
                    }
                }
                this.f2464 = new C16162(f, this.f2464.f49784);
                invalidate();
                return true;
            }
            if ((action == 1 || action == 3) && this.f2454 && this.f2486) {
                m2655();
                return true;
            }
            if (!this.f2454) {
                if (!this.f2451) {
                    this.f2459.m23474(motionEvent);
                    return true;
                }
                boolean z = this.f2471;
                PointF pointF2 = this.f2469;
                if (z) {
                    if (action != 1) {
                        if (action == 2) {
                            if (this.f2460) {
                                float x = motionEvent.getX();
                                float y = motionEvent.getY();
                                PointF pointF3 = this.f2488;
                                pointF3.set(x, y);
                                pointF3.offset(pointF2.x, pointF2.y);
                                float f3 = pointF3.x;
                                C16162 c16162 = this.f2464;
                                int i5 = (int) (f3 / c16162.f49788);
                                int i6 = ((int) (pointF3.y / c16162.f49787)) + this.f2473;
                                if (this.f2461) {
                                    this.f2478 = i5;
                                    this.f2449 = i6;
                                } else {
                                    this.f2479 = i5;
                                    this.f2458 = i6;
                                }
                                C17637 c17637 = this.f2465;
                                int i7 = c17637.f53892 - 1;
                                int i8 = -c17637.m41261().m7009();
                                int i9 = this.f2465.f53918 - 1;
                                this.f2478 = Math.min(i7, Math.max(0, this.f2478));
                                this.f2479 = Math.min(i7, Math.max(0, this.f2479));
                                this.f2449 = Math.min(i9, Math.max(i8, this.f2449));
                                int iMin = Math.min(i9, Math.max(i8, this.f2458));
                                this.f2458 = iMin;
                                int i10 = this.f2449;
                                if ((i10 == iMin && this.f2478 > this.f2479) || i10 > iMin) {
                                    this.f2461 = !this.f2461;
                                    int i11 = this.f2478;
                                    this.f2478 = this.f2479;
                                    this.f2449 = iMin;
                                    this.f2479 = i11;
                                    this.f2458 = i10;
                                }
                                int i12 = this.f2461 ? this.f2449 : this.f2458;
                                int i13 = this.f2473;
                                if (i12 < i13) {
                                    m2622(i12 - i13);
                                } else {
                                    int i14 = i13 + this.f2465.f53918;
                                    if (i14 <= i12) {
                                        m2622((i12 - i14) + 1);
                                    }
                                }
                                invalidate();
                                return true;
                            }
                        }
                    } else if (!this.f2460 && (i = this.f2449) == (i2 = this.f2458)) {
                        int i15 = this.f2479;
                        int i16 = this.f2478;
                        if (i15 - i16 < 10) {
                            this.f2450.mo8713(this.f2465.m41247(i16, i, i15, i2).trim());
                            m2648((MotionEvent) null);
                            if (C4925.f15523.getBoolean("term_copy_text_tip", true)) {
                                C4925.f15523.edit().putBoolean("term_copy_text_tip", false).apply();
                                return true;
                            }
                        } else if (C4925.f15523.getBoolean("term_copy_text_tip", true)) {
                            C21374.m48457(R.string.MT_Protector);
                        }
                    } else if (C4925.f15523.getBoolean("term_copy_text_tip", true)) {
                        C21374.m48457(R.string.MT_Protector);
                    }
                } else if (action == 0) {
                    float fM2620 = m2620(pointF, this.f2475);
                    float fM2621 = m2620(pointF, this.f2474);
                    if (fM2620 < fM2621 && fM2620 <= this.f2477) {
                        this.f2471 = true;
                        this.f2461 = true;
                        float f4 = this.f2478;
                        C16162 c16163 = this.f2464;
                        pointF2.set((f4 * c16163.f49788) - pointF.x, ((this.f2449 - this.f2473) * c16163.f49787) - pointF.y);
                        this.f2460 = false;
                        return true;
                    }
                    if (fM2621 <= this.f2477) {
                        this.f2471 = true;
                        this.f2461 = false;
                        float f5 = this.f2479;
                        C16162 c16164 = this.f2464;
                        pointF2.set((f5 * c16164.f49788) - pointF.x, ((this.f2458 - this.f2473) * c16164.f49787) - pointF.y);
                        this.f2460 = false;
                        return true;
                    }
                }
                this.f2459.m23474(motionEvent);
                return true;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static float m2634(MotionEvent motionEvent) {
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((y * y) + (x * x));
    }

    @Override // android.view.View
    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (this.f2451) {
                m2648((MotionEvent) null);
                return true;
            }
            this.f2456.getClass();
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f2465 != null) {
            if (this.f2456.mo4693(i, this.f2450)) {
                invalidate();
                return true;
            }
            if (keyEvent.isSystem()) {
                this.f2456.getClass();
                return super.onKeyDown(i, keyEvent);
            }
            if (keyEvent.getAction() == 2 && i == 0) {
                C19692 c19692 = this.f2467;
                if (c19692 != null) {
                    c19692.m45292();
                }
                this.f2450.m8717(keyEvent.getCharacters());
                return true;
            }
            int metaState = keyEvent.getMetaState();
            boolean zIsCtrlPressed = keyEvent.isCtrlPressed();
            boolean z = (metaState & 16) != 0;
            boolean z2 = (metaState & 32) != 0;
            int i2 = zIsCtrlPressed ? 1073741824 : 0;
            if (keyEvent.isAltPressed()) {
                i2 |= Integer.MIN_VALUE;
            }
            if (keyEvent.isShiftPressed()) {
                i2 |= 536870912;
            }
            if (keyEvent.isFunctionPressed() || !m2652(i, i2)) {
                int unicodeChar = keyEvent.getUnicodeChar((~(z2 ? UMModuleRegister.SHARE_EVENT_VALUE_HIGH : 28690)) & keyEvent.getMetaState());
                if (unicodeChar == 0) {
                    return false;
                }
                int i3 = this.f2453;
                if ((unicodeChar & Integer.MIN_VALUE) != 0) {
                    if (i3 != 0) {
                        m2623(i3, zIsCtrlPressed, z);
                    }
                    this.f2453 = unicodeChar & Integer.MAX_VALUE;
                } else {
                    if (i3 != 0) {
                        int deadChar = KeyCharacterMap.getDeadChar(i3, unicodeChar);
                        if (deadChar > 0) {
                            unicodeChar = deadChar;
                        }
                        this.f2453 = 0;
                    }
                    m2623(unicodeChar, zIsCtrlPressed, z);
                }
                if (this.f2453 != i3) {
                    invalidate();
                }
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m2623(int i, boolean z, boolean z2) {
        if (this.f2450 == null) {
            return;
        }
        if (this.f2451) {
            m2648((MotionEvent) null);
        }
        boolean z3 = true;
        boolean z4 = z || this.f2456.mo4696();
        if (!z2 && !this.f2456.mo4694()) {
            z3 = false;
        }
        boolean zMo4695 = this.f2456.mo4695(i, this.f2450);
        C19692 c19692 = this.f2467;
        if (c19692 != null && c19692.f63614 && (zMo4695 || z4 || z3)) {
            this.f2467.f63616 = true;
        }
        if (zMo4695) {
            return;
        }
        int i2 = 94;
        if (z4) {
            if (i >= 97 && i <= 122) {
                i -= 96;
            } else if (i >= 65 && i <= 90) {
                i -= 64;
            } else if (i == 32 || i == 50) {
                i = 0;
            } else if (i == 91 || i == 51) {
                i = 27;
            } else if (i == 92 || i == 52) {
                i = 28;
            } else if (i == 93 || i == 53) {
                i = 29;
            } else if (i == 94 || i == 54) {
                i = 30;
            } else if (i == 95 || i == 55 || i == 47) {
                i = 31;
            } else if (i == 56) {
                i = 127;
            }
        }
        if (i > -1) {
            if (i != 710) {
                if (i != 715) {
                    i2 = i != 732 ? i : 126;
                } else {
                    i2 = 96;
                }
            }
            C19692 c19693 = this.f2467;
            if (c19693 != null && !c19693.f63614) {
                this.f2467.m45292();
            }
            this.f2450.m41091(i2, z3);
            m2640();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m2652(int i, int i2) {
        if (this.f2451) {
            m2648((MotionEvent) null);
        }
        C17637 c17637M41100 = this.f2450.m41100();
        String strM51233 = C23071.m51233(i, i2, c17637M41100.m41254(), c17637M41100.m41263());
        if (strM51233 == null) {
            return false;
        }
        this.f2450.m8717(strM51233);
        C19692 c19692 = this.f2467;
        if (c19692 != null) {
            C19692.m45288(c19692, i, i2);
        }
        m2640();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f2465 == null) {
            return true;
        }
        this.f2456.getClass();
        if (keyEvent.isSystem()) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m2640() {
        if (this.f2473 != 0) {
            this.f2473 = 0;
            this.f2465.m41248();
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        m2655();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m2655() {
        C17637 c17637;
        int width = (int) (getWidth() - this.f2483);
        int height = getHeight();
        if (width == 0 || height == 0 || this.f2450 == null) {
            return;
        }
        float f = width;
        int iMax = Math.max(4, (int) (f / this.f2464.f49788));
        C16162 c16162 = this.f2464;
        if (f - (iMax * c16162.f49788) < this.f2483) {
            iMax--;
        }
        int iMax2 = Math.max(4, (height - c16162.f49789) / c16162.f49787);
        if (this.f2451 && (c17637 = this.f2465) != null && iMax != c17637.f53892) {
            m2648((MotionEvent) null);
        }
        C17637 c17638 = this.f2465;
        if (c17638 != null && iMax == c17638.f53892 && iMax2 == c17638.f53918) {
            return;
        }
        int iM41260 = (!this.f2451 || c17638 == null) ? -1 : c17638.m41260();
        this.f2450.m41090(iMax, this.f2464.f49790, iMax2);
        C17637 c17637M41100 = this.f2450.m41100();
        this.f2465 = c17637M41100;
        this.f2473 = 0;
        if (iM41260 != -1) {
            int iM41261 = c17637M41100.m41260() - iM41260;
            this.f2449 += iM41261;
            this.f2458 += iM41261;
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z;
        if (this.f2465 == null) {
            canvas.drawColor(-16777216);
            return;
        }
        canvas.translate(this.f2483, 0.0f);
        this.f2464.m38096(this.f2465, canvas, this.f2473, this.f2449, this.f2458, this.f2478, this.f2479);
        if (this.f2451) {
            int intrinsicWidth = this.f2466.getIntrinsicWidth();
            int i = intrinsicWidth / 4;
            int iRound = Math.round(this.f2478 * this.f2464.f49788) + i;
            int i2 = (this.f2449 + 1) - this.f2473;
            C16162 c16162 = this.f2464;
            int i3 = (i2 * c16162.f49787) + c16162.f49789;
            BitmapDrawable bitmapDrawable = this.f2466;
            bitmapDrawable.setBounds(iRound - intrinsicWidth, i3, iRound, bitmapDrawable.getIntrinsicHeight() + i3);
            this.f2466.draw(canvas);
            int iRound2 = Math.round((this.f2479 + 1) * this.f2464.f49788) - i;
            int i4 = (this.f2458 + 1) - this.f2473;
            C16162 c16163 = this.f2464;
            int i5 = (i4 * c16163.f49787) + c16163.f49789;
            BitmapDrawable bitmapDrawable2 = this.f2463;
            bitmapDrawable2.setBounds(iRound2, i5, intrinsicWidth + iRound2, bitmapDrawable2.getIntrinsicHeight() + i5);
            this.f2463.draw(canvas);
            Rect bounds = this.f2466.getBounds();
            this.f2475.set((bounds.left + bounds.right) / 2.0f, (bounds.top + bounds.bottom) / 2.0f);
            Rect bounds2 = this.f2463.getBounds();
            this.f2474.set((bounds2.left + bounds2.right) / 2.0f, (bounds2.top + bounds2.bottom) / 2.0f);
        }
        canvas.translate(-this.f2483, 0.0f);
        EdgeEffect edgeEffect = this.f2462;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            this.f2462.setColor(this.f2465.f53920.f52002[260]);
            int iSave = canvas.save();
            canvas.translate(getScrollX(), 0.0f);
            this.f2462.setSize(getWidth(), getHeight());
            EdgeEffect edgeEffect2 = this.f2462;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.f2480;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            this.f2480.setColor(this.f2465.f53920.f52002[260]);
            int iSave2 = canvas.save();
            canvas.rotate(180.0f);
            canvas.translate(-getWidth(), -getHeight());
            this.f2480.setSize(getWidth(), getHeight());
            EdgeEffect edgeEffect4 = this.f2480;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        if (z) {
            postInvalidateOnAnimation();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static float m2620(PointF pointF, PointF pointF2) {
        float f = pointF.x;
        float f2 = pointF2.x;
        float f3 = (f - f2) * (f - f2);
        float f4 = pointF.y;
        float f5 = pointF2.y;
        return (float) Math.sqrt(C20382.m46695(f4, f5, f4 - f5, f3));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2648(MotionEvent motionEvent) {
        boolean z = this.f2451;
        this.f2451 = !z;
        if (!z) {
            if (this.f2466 == null) {
                Resources resources = getContext().getResources();
                this.f2466 = (BitmapDrawable) C4369.m13097(resources, R.drawable.MT_Protector, null).mutate();
                this.f2463 = (BitmapDrawable) C4369.m13097(resources, R.drawable.MT_Protector, null).mutate();
                this.f2466.setAlpha(210);
                this.f2463.setAlpha(210);
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(C21943.f70257, PorterDuff.Mode.SRC_IN);
                this.f2466.setColorFilter(porterDuffColorFilter);
                this.f2463.setColorFilter(porterDuffColorFilter);
                this.f2477 = this.f2466.getIntrinsicHeight() * 1.8f;
            }
            int x = (int) (motionEvent.getX() / this.f2464.f49788);
            int y = ((int) (motionEvent.getY() / this.f2464.f49787)) + this.f2473;
            int i = -this.f2465.m41261().m7009();
            C17637 c17637 = this.f2465;
            int i2 = c17637.f53918 - 1;
            if (y < i || y > i2) {
                return;
            }
            this.f2479 = x;
            this.f2478 = x;
            this.f2458 = y;
            this.f2449 = y;
            C2115 c2115M41261 = c17637.m41261();
            int i3 = this.f2478;
            int i4 = this.f2449;
            if (!" ".equals(c2115M41261.m7002(i3, i4, i3, i4))) {
                while (true) {
                    int i5 = this.f2478;
                    if (i5 <= 0) {
                        break;
                    }
                    int i6 = this.f2449;
                    if (c2115M41261.m7002(i5 - 1, i6, i5 - 1, i6).isEmpty()) {
                        break;
                    } else {
                        this.f2478--;
                    }
                }
                while (true) {
                    int i7 = this.f2479;
                    if (i7 >= this.f2465.f53892 - 1) {
                        break;
                    }
                    int i8 = this.f2449;
                    if (c2115M41261.m7002(i7 + 1, i8, i7 + 1, i8).isEmpty()) {
                        break;
                    } else {
                        this.f2479++;
                    }
                }
            }
            invalidate();
            return;
        }
        this.f2458 = -1;
        this.f2479 = -1;
        this.f2449 = -1;
        this.f2478 = -1;
        invalidate();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m2654() {
        ClipData primaryClip;
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        CharSequence text = (clipboardManager == null || (primaryClip = clipboardManager.getPrimaryClip()) == null) ? null : primaryClip.getItemAt(0).getText();
        if (TextUtils.isEmpty(text)) {
            return;
        }
        if (this.f2451) {
            m2648((MotionEvent) null);
        }
        C19692 c19692 = this.f2467;
        if (c19692 != null) {
            c19692.m45292();
        }
        this.f2465.m41253(text.toString());
        m2640();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m2651() {
        ClipData primaryClip;
        C17574 c17574 = this.f2450;
        if (c17574 == null || !c17574.m41098()) {
            return false;
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        CharSequence text = null;
        if (clipboardManager != null && (primaryClip = clipboardManager.getPrimaryClip()) != null) {
            text = primaryClip.getItemAt(0).getText();
        }
        return !TextUtils.isEmpty(text);
    }
}
