package p067l;

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
import bin.p000mt.plus.R;
import com.umeng.commonsdk.framework.UMModuleRegister;

/* JADX INFO: renamed from: l.֡᩶ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81UC */
/* JADX INFO: loaded from: classes2.dex */
public final class C2977 extends View {

    /* JADX INFO: renamed from: ֡֫ */
    public int f5221;

    /* JADX INFO: renamed from: ֨֫ */
    public C19071 f5222;

    /* JADX INFO: renamed from: ֫֫ */
    public boolean f5223;

    /* JADX INFO: renamed from: ۖ֫ */
    public float f5224;

    /* JADX INFO: renamed from: ۗ */
    public int f5225;

    /* JADX INFO: renamed from: ۗ֫ */
    public boolean f5226;

    /* JADX INFO: renamed from: ۘ֫ */
    public OverScroller f5227;

    /* JADX INFO: renamed from: ۙ */
    public InterfaceC3648 f5228;

    /* JADX INFO: renamed from: ۙ֫ */
    public float f5229;

    /* JADX INFO: renamed from: ۚ֫ */
    public int f5230;

    /* JADX INFO: renamed from: ۛ */
    public C11025 f5231;

    /* JADX INFO: renamed from: ۜ֫ */
    public boolean f5232;

    /* JADX INFO: renamed from: ۟ */
    public boolean f5233;

    /* JADX INFO: renamed from: ۠֫ */
    public EdgeEffect f5234;

    /* JADX INFO: renamed from: ۡ֫ */
    public BitmapDrawable f5235;

    /* JADX INFO: renamed from: ۢ֫ */
    public C17729 f5236;

    /* JADX INFO: renamed from: ۤ */
    public C19131 f5237;

    /* JADX INFO: renamed from: ۧ֫ */
    public BitmapDrawable f5238;

    /* JADX INFO: renamed from: ۨ */
    public C21084 f5239;

    /* JADX INFO: renamed from: ۫ */
    public PointF f5240;

    /* JADX INFO: renamed from: ۬ */
    public PointF f5241;

    /* JADX INFO: renamed from: ۬֫ */
    public boolean f5242;

    /* JADX INFO: renamed from: ܰ */
    public boolean f5243;

    /* JADX INFO: renamed from: ܳ֫ */
    public float f5244;

    /* JADX INFO: renamed from: ܶ֫ */
    public int f5245;

    /* JADX INFO: renamed from: ܺ֫ */
    public PointF f5246;

    /* JADX INFO: renamed from: ܽ֫ */
    public PointF f5247;

    /* JADX INFO: renamed from: ܿ֫ */
    public float f5248;

    /* JADX INFO: renamed from: ᩳ֫ */
    public float f5249;

    /* JADX INFO: renamed from: ᩴ֫ */
    public int f5250;

    /* JADX INFO: renamed from: ᩵֫ */
    public int f5251;

    /* JADX INFO: renamed from: ᩶ */
    public EdgeEffect f5252;

    /* JADX INFO: renamed from: ᩶֫ */
    public float f5253;

    /* JADX INFO: renamed from: ᩷֫ */
    public int f5254;

    /* JADX INFO: renamed from: ᩸ */
    public float f5255;

    /* JADX INFO: renamed from: ᩸֫ */
    public int f5256;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f5257;

    /* JADX INFO: renamed from: ᩹֫ */
    public boolean f5258;

    /* JADX INFO: renamed from: ᩺ */
    public int f5259;

    /* JADX INFO: renamed from: ᩻֫ */
    public PointF f5260;

    @Override // android.view.View
    public final boolean isOpaque() {
        return true;
    }

    public C2977(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean z = false;
        this.f5223 = false;
        this.f5250 = -1;
        this.f5251 = -1;
        this.f5221 = -1;
        this.f5230 = -1;
        this.f5240 = new PointF();
        this.f5260 = new PointF();
        this.f5241 = new PointF();
        this.f5247 = new PointF();
        this.f5246 = new PointF();
        setFocusable(true);
        setFocusableInTouchMode(true);
        setVerticalScrollBarEnabled(true);
        setScrollbarFadingEnabled(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(false);
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.f5255 = displayMetrics.density * 3.0f;
        float f = displayMetrics.scaledDensity;
        this.f5244 = 6.0f * f;
        this.f5248 = f * 30.0f;
        this.f5256 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f5234 = new EdgeEffect(context);
        this.f5252 = new EdgeEffect(context);
        this.f5231 = new C11025(context, new C6331(this));
        this.f5227 = new OverScroller(context);
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            z = true;
        }
        this.f5257 = z;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4989(C7672 c7672) {
        this.f5228 = c7672;
    }

    @Override // android.view.View
    public final void setOnKeyListener(View.OnKeyListener onKeyListener) {
        if (onKeyListener instanceof InterfaceC3648) {
            this.f5228 = (InterfaceC3648) onKeyListener;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4990(C19071 c19071) {
        C17729 c17729;
        C19071 c19072 = this.f5222;
        if (c19071 == c19072) {
            return;
        }
        if (c19072 != null) {
            InterfaceC18400 interfaceC18400M43345 = c19072.m43345();
            if (C14110.m32033(interfaceC18400M43345)) {
                ((C20413) interfaceC18400M43345).m46090((C2977) null);
            }
        }
        InterfaceC18400 interfaceC18400M43346 = c19071.m43345();
        if (C14110.m32033(interfaceC18400M43346)) {
            ((C20413) interfaceC18400M43346).m46090(this);
        }
        this.f5245 = 0;
        this.f5259++;
        this.f5239 = null;
        this.f5222 = c19071;
        this.f5237 = null;
        this.f5225 = 0;
        if (c19071.m43340() != 0.0f && ((c17729 = this.f5236) == null || c17729.f52956 != c19071.m43340())) {
            float fM43340 = c19071.m43340();
            C17729 c177210 = this.f5236;
            this.f5236 = new C17729(fM43340, c177210 == null ? C7050.m16216() : c177210.f52950);
        }
        m4995();
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
        return new C21084(this);
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        C19131 c19131 = this.f5237;
        if (c19131 == null) {
            return 1;
        }
        return c19131.m43507().m9112();
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        C19131 c19131 = this.f5237;
        if (c19131 == null) {
            return 1;
        }
        return c19131.f57111;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        C19131 c19131 = this.f5237;
        if (c19131 == null) {
            return 1;
        }
        return (c19131.m43507().m9112() + this.f5245) - this.f5237.f57111;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m4993() {
        boolean z;
        int i;
        C19131 c19131 = this.f5237;
        if (c19131 == null) {
            return;
        }
        boolean z2 = true;
        boolean z3 = this.f5245 != 0;
        if (this.f5223 || z3) {
            int iM9120 = c19131.m43507().m9120();
            int iM43504 = this.f5237.m43504();
            int i2 = this.f5245;
            if ((-i2) + iM43504 > iM9120) {
                if (this.f5223) {
                    m4988((MotionEvent) null);
                }
                z2 = false;
            } else {
                this.f5245 = i2 - iM43504;
                this.f5221 -= iM43504;
                this.f5230 -= iM43504;
            }
            if (z3) {
                awakenScrollBars();
            }
            z = z2;
        } else {
            z = false;
        }
        if (!z && (i = this.f5245) != 0) {
            if (i < -3) {
                awakenScrollBars();
            }
            this.f5245 = 0;
        }
        this.f5237.m43494();
        invalidate();
        C4379 c4379M43507 = this.f5237.m43507();
        int i3 = this.f5245;
        C19131 c19132 = this.f5237;
        String strM9113 = c4379M43507.m9113(0, i3, c19132.f57085, c19132.f57111 + i3);
        if (this.f5257) {
            setContentDescription(strM9113);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4986(float f) {
        float f2 = f * getContext().getResources().getDisplayMetrics().scaledDensity;
        C17729 c17729 = this.f5236;
        if (c17729 == null || c17729.f52956 != f2) {
            this.f5236 = new C17729(f2, c17729 == null ? C7050.m16216() : c17729.f52950);
            m4995();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4987(Typeface typeface) {
        C17729 c17729 = this.f5236;
        if (c17729.f52950 != typeface) {
            this.f5236 = new C17729(c17729.f52956, typeface);
            m4995();
            invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m4962(int i) {
        if (i == 0) {
            return;
        }
        boolean z = i < 0;
        int iAbs = Math.abs(i);
        for (int i2 = 0; i2 < iAbs; i2++) {
            if (this.f5237.m43510()) {
                m4992(z ? 19 : 20, 0);
            } else {
                this.f5245 = Math.min(0, Math.max(-this.f5237.m43507().m9120(), this.f5245 + (z ? -1 : 1)));
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
        if (this.f5237 != null) {
            int action = motionEvent.getAction() & 255;
            PointF pointF = this.f5240;
            if (action == 0) {
                pointF.set(motionEvent.getX(), motionEvent.getY());
                this.f5243 = false;
                this.f5232 = false;
                this.f5242 = false;
                this.f5226 = false;
                this.f5258 = false;
            } else if (action == 1) {
                edgeEffect = this.f5234;
                if (edgeEffect != null) {
                    edgeEffect.onRelease();
                    zIsFinished = this.f5234.isFinished();
                } else {
                    zIsFinished = false;
                }
                edgeEffect2 = this.f5252;
                if (edgeEffect2 != null) {
                    edgeEffect2.onRelease();
                    zIsFinished |= this.f5252.isFinished();
                }
                if (zIsFinished) {
                    postInvalidateOnAnimation();
                }
            } else if (action != 2) {
                if (action == 3) {
                    edgeEffect = this.f5234;
                    if (edgeEffect != null) {
                        edgeEffect.onRelease();
                        zIsFinished = this.f5234.isFinished();
                    } else {
                        zIsFinished = false;
                    }
                    edgeEffect2 = this.f5252;
                    if (edgeEffect2 != null) {
                        edgeEffect2.onRelease();
                        zIsFinished |= this.f5252.isFinished();
                    }
                    if (zIsFinished) {
                        postInvalidateOnAnimation();
                    }
                } else if (action == 5) {
                    int i3 = this.f5254 + 1;
                    this.f5254 = i3;
                    if (i3 == 1) {
                        this.f5242 = true;
                        this.f5226 = true;
                        this.f5229 = this.f5236.f52956;
                        this.f5253 = m4974(motionEvent);
                        this.f5231.m25421(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                    }
                } else if (action == 6) {
                    int i4 = this.f5254 - 1;
                    this.f5254 = i4;
                    if (this.f5242 && i4 == 0) {
                        this.f5242 = false;
                    }
                }
            } else if (!this.f5232 && m4960(pointF, new PointF(motionEvent.getX(), motionEvent.getY())) >= this.f5256) {
                this.f5232 = true;
            }
            if (action == 2 && this.f5242 && this.f5254 == 1) {
                float fM4974 = m4974(motionEvent);
                if (!this.f5258) {
                    if (Math.abs(fM4974 - this.f5253) > this.f5256) {
                        this.f5258 = true;
                    }
                }
                float f = (this.f5229 * fM4974) / this.f5253;
                float f2 = this.f5248;
                if (f > f2) {
                    f = f2;
                } else {
                    f2 = this.f5244;
                    if (f < f2) {
                        f = f2;
                    }
                }
                this.f5236 = new C17729(f, this.f5236.f52950);
                invalidate();
                return true;
            }
            if ((action == 1 || action == 3) && this.f5226 && this.f5258) {
                m4995();
                return true;
            }
            if (!this.f5226) {
                if (!this.f5223) {
                    this.f5231.m25421(motionEvent);
                    return true;
                }
                boolean z = this.f5243;
                PointF pointF2 = this.f5241;
                if (z) {
                    if (action != 1) {
                        if (action == 2) {
                            if (this.f5232) {
                                float x = motionEvent.getX();
                                float y = motionEvent.getY();
                                PointF pointF3 = this.f5260;
                                pointF3.set(x, y);
                                pointF3.offset(pointF2.x, pointF2.y);
                                float f3 = pointF3.x;
                                C17729 c17729 = this.f5236;
                                int i5 = (int) (f3 / c17729.f52954);
                                int i6 = ((int) (pointF3.y / c17729.f52953)) + this.f5245;
                                if (this.f5233) {
                                    this.f5250 = i5;
                                    this.f5221 = i6;
                                } else {
                                    this.f5251 = i5;
                                    this.f5230 = i6;
                                }
                                C19131 c19131 = this.f5237;
                                int i7 = c19131.f57085 - 1;
                                int i8 = -c19131.m43507().m9120();
                                int i9 = this.f5237.f57111 - 1;
                                this.f5250 = Math.min(i7, Math.max(0, this.f5250));
                                this.f5251 = Math.min(i7, Math.max(0, this.f5251));
                                this.f5221 = Math.min(i9, Math.max(i8, this.f5221));
                                int iMin = Math.min(i9, Math.max(i8, this.f5230));
                                this.f5230 = iMin;
                                int i10 = this.f5221;
                                if ((i10 == iMin && this.f5250 > this.f5251) || i10 > iMin) {
                                    this.f5233 = !this.f5233;
                                    int i11 = this.f5250;
                                    this.f5250 = this.f5251;
                                    this.f5221 = iMin;
                                    this.f5251 = i11;
                                    this.f5230 = i10;
                                }
                                int i12 = this.f5233 ? this.f5221 : this.f5230;
                                int i13 = this.f5245;
                                if (i12 < i13) {
                                    m4962(i12 - i13);
                                } else {
                                    int i14 = i13 + this.f5237.f57111;
                                    if (i14 <= i12) {
                                        m4962((i12 - i14) + 1);
                                    }
                                }
                                invalidate();
                                return true;
                            }
                        }
                    } else if (!this.f5232 && (i = this.f5221) == (i2 = this.f5230)) {
                        int i15 = this.f5251;
                        int i16 = this.f5250;
                        if (i15 - i16 < 10) {
                            this.f5222.mo10774(this.f5237.m43493(i16, i, i15, i2).trim());
                            m4988((MotionEvent) null);
                            if (C7050.f18355.getBoolean("term_copy_text_tip", true)) {
                                C7050.f18355.edit().putBoolean("term_copy_text_tip", false).apply();
                                return true;
                            }
                        } else if (C7050.f18355.getBoolean("term_copy_text_tip", true)) {
                            C22682.m50793(R.string.MT_Protector);
                        }
                    } else if (C7050.f18355.getBoolean("term_copy_text_tip", true)) {
                        C22682.m50793(R.string.MT_Protector);
                    }
                } else if (action == 0) {
                    float fM4960 = m4960(pointF, this.f5247);
                    float fM4961 = m4960(pointF, this.f5246);
                    if (fM4960 < fM4961 && fM4960 <= this.f5249) {
                        this.f5243 = true;
                        this.f5233 = true;
                        float f4 = this.f5250;
                        C17729 c177210 = this.f5236;
                        pointF2.set((f4 * c177210.f52954) - pointF.x, ((this.f5221 - this.f5245) * c177210.f52953) - pointF.y);
                        this.f5232 = false;
                        return true;
                    }
                    if (fM4961 <= this.f5249) {
                        this.f5243 = true;
                        this.f5233 = false;
                        float f5 = this.f5251;
                        C17729 c177211 = this.f5236;
                        pointF2.set((f5 * c177211.f52954) - pointF.x, ((this.f5230 - this.f5245) * c177211.f52953) - pointF.y);
                        this.f5232 = false;
                        return true;
                    }
                }
                this.f5231.m25421(motionEvent);
                return true;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۧ */
    public static float m4974(MotionEvent motionEvent) {
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((y * y) + (x * x));
    }

    @Override // android.view.View
    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (this.f5223) {
                m4988((MotionEvent) null);
                return true;
            }
            this.f5228.getClass();
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f5237 != null) {
            if (this.f5228.mo6925(i, this.f5222)) {
                invalidate();
                return true;
            }
            if (keyEvent.isSystem()) {
                this.f5228.getClass();
                return super.onKeyDown(i, keyEvent);
            }
            if (keyEvent.getAction() == 2 && i == 0) {
                C21084 c21084 = this.f5239;
                if (c21084 != null) {
                    c21084.m47589();
                }
                this.f5222.m10778(keyEvent.getCharacters());
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
            if (keyEvent.isFunctionPressed() || !m4992(i, i2)) {
                int unicodeChar = keyEvent.getUnicodeChar((~(z2 ? UMModuleRegister.SHARE_EVENT_VALUE_HIGH : 28690)) & keyEvent.getMetaState());
                if (unicodeChar == 0) {
                    return false;
                }
                int i3 = this.f5225;
                if ((unicodeChar & Integer.MIN_VALUE) != 0) {
                    if (i3 != 0) {
                        m4963(i3, zIsCtrlPressed, z);
                    }
                    this.f5225 = unicodeChar & Integer.MAX_VALUE;
                } else {
                    if (i3 != 0) {
                        int deadChar = KeyCharacterMap.getDeadChar(i3, unicodeChar);
                        if (deadChar > 0) {
                            unicodeChar = deadChar;
                        }
                        this.f5225 = 0;
                    }
                    m4963(unicodeChar, zIsCtrlPressed, z);
                }
                if (this.f5225 != i3) {
                    invalidate();
                }
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m4963(int i, boolean z, boolean z2) {
        if (this.f5222 == null) {
            return;
        }
        if (this.f5223) {
            m4988((MotionEvent) null);
        }
        boolean z3 = true;
        boolean z4 = z || this.f5228.mo6928();
        if (!z2 && !this.f5228.mo6926()) {
            z3 = false;
        }
        boolean zMo6927 = this.f5228.mo6927(i, this.f5222);
        C21084 c21084 = this.f5239;
        if (c21084 != null && c21084.f66235 && (zMo6927 || z4 || z3)) {
            this.f5239.f66237 = true;
        }
        if (zMo6927) {
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
            C21084 c21085 = this.f5239;
            if (c21085 != null && !c21085.f66235) {
                this.f5239.m47589();
            }
            this.f5222.m43337(i2, z3);
            m4980();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m4992(int i, int i2) {
        if (this.f5223) {
            m4988((MotionEvent) null);
        }
        C19131 c19131M43346 = this.f5222.m43346();
        String strM53626 = C24295.m53626(i, i2, c19131M43346.m43500(), c19131M43346.m43509());
        if (strM53626 == null) {
            return false;
        }
        this.f5222.m10778(strM53626);
        C21084 c21084 = this.f5239;
        if (c21084 != null) {
            C21084.m47585(c21084, i, i2);
        }
        m4980();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f5237 == null) {
            return true;
        }
        this.f5228.getClass();
        if (keyEvent.isSystem()) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    /* JADX INFO: renamed from: ܿ */
    private void m4980() {
        if (this.f5245 != 0) {
            this.f5245 = 0;
            this.f5237.m43494();
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        m4995();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m4995() {
        C19131 c19131;
        int width = (int) (getWidth() - this.f5255);
        int height = getHeight();
        if (width == 0 || height == 0 || this.f5222 == null) {
            return;
        }
        float f = width;
        int iMax = Math.max(4, (int) (f / this.f5236.f52954));
        C17729 c17729 = this.f5236;
        if (f - (iMax * c17729.f52954) < this.f5255) {
            iMax--;
        }
        int iMax2 = Math.max(4, (height - c17729.f52955) / c17729.f52953);
        if (this.f5223 && (c19131 = this.f5237) != null && iMax != c19131.f57085) {
            m4988((MotionEvent) null);
        }
        C19131 c19132 = this.f5237;
        if (c19132 != null && iMax == c19132.f57085 && iMax2 == c19132.f57111) {
            return;
        }
        int iM43506 = (!this.f5223 || c19132 == null) ? -1 : c19132.m43506();
        this.f5222.m43336(iMax, this.f5236.f52956, iMax2);
        C19131 c19131M43346 = this.f5222.m43346();
        this.f5237 = c19131M43346;
        this.f5245 = 0;
        if (iM43506 != -1) {
            int iM43507 = c19131M43346.m43506() - iM43506;
            this.f5221 += iM43507;
            this.f5230 += iM43507;
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z;
        if (this.f5237 == null) {
            canvas.drawColor(-16777216);
            return;
        }
        canvas.translate(this.f5255, 0.0f);
        this.f5236.m40288(this.f5237, canvas, this.f5245, this.f5221, this.f5230, this.f5250, this.f5251);
        if (this.f5223) {
            int intrinsicWidth = this.f5238.getIntrinsicWidth();
            int i = intrinsicWidth / 4;
            int iRound = Math.round(this.f5250 * this.f5236.f52954) + i;
            int i2 = (this.f5221 + 1) - this.f5245;
            C17729 c17729 = this.f5236;
            int i3 = (i2 * c17729.f52953) + c17729.f52955;
            BitmapDrawable bitmapDrawable = this.f5238;
            bitmapDrawable.setBounds(iRound - intrinsicWidth, i3, iRound, bitmapDrawable.getIntrinsicHeight() + i3);
            this.f5238.draw(canvas);
            int iRound2 = Math.round((this.f5251 + 1) * this.f5236.f52954) - i;
            int i4 = (this.f5230 + 1) - this.f5245;
            C17729 c177210 = this.f5236;
            int i5 = (i4 * c177210.f52953) + c177210.f52955;
            BitmapDrawable bitmapDrawable2 = this.f5235;
            bitmapDrawable2.setBounds(iRound2, i5, intrinsicWidth + iRound2, bitmapDrawable2.getIntrinsicHeight() + i5);
            this.f5235.draw(canvas);
            Rect bounds = this.f5238.getBounds();
            this.f5247.set((bounds.left + bounds.right) / 2.0f, (bounds.top + bounds.bottom) / 2.0f);
            Rect bounds2 = this.f5235.getBounds();
            this.f5246.set((bounds2.left + bounds2.right) / 2.0f, (bounds2.top + bounds2.bottom) / 2.0f);
        }
        canvas.translate(-this.f5255, 0.0f);
        EdgeEffect edgeEffect = this.f5234;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            this.f5234.setColor(this.f5237.f57113.f55183[260]);
            int iSave = canvas.save();
            canvas.translate(getScrollX(), 0.0f);
            this.f5234.setSize(getWidth(), getHeight());
            EdgeEffect edgeEffect2 = this.f5234;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.f5252;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            this.f5252.setColor(this.f5237.f57113.f55183[260]);
            int iSave2 = canvas.save();
            canvas.rotate(180.0f);
            canvas.translate(-getWidth(), -getHeight());
            this.f5252.setSize(getWidth(), getHeight());
            EdgeEffect edgeEffect4 = this.f5252;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        if (z) {
            postInvalidateOnAnimation();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static float m4960(PointF pointF, PointF pointF2) {
        float f = pointF.x;
        float f2 = pointF2.x;
        float f3 = (f - f2) * (f - f2);
        float f4 = pointF.y;
        float f5 = pointF2.y;
        return (float) Math.sqrt(C21740.m49018(f4, f5, f4 - f5, f3));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4988(MotionEvent motionEvent) {
        boolean z = this.f5223;
        this.f5223 = !z;
        if (!z) {
            if (this.f5238 == null) {
                Resources resources = getContext().getResources();
                this.f5238 = (BitmapDrawable) C1059.m14961(resources, R.drawable.MT_Protector, null).mutate();
                this.f5235 = (BitmapDrawable) C1059.m14961(resources, R.drawable.MT_Protector, null).mutate();
                this.f5238.setAlpha(210);
                this.f5235.setAlpha(210);
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(C23223.f72969, PorterDuff.Mode.SRC_IN);
                this.f5238.setColorFilter(porterDuffColorFilter);
                this.f5235.setColorFilter(porterDuffColorFilter);
                this.f5249 = this.f5238.getIntrinsicHeight() * 1.8f;
            }
            int x = (int) (motionEvent.getX() / this.f5236.f52954);
            int y = ((int) (motionEvent.getY() / this.f5236.f52953)) + this.f5245;
            int i = -this.f5237.m43507().m9120();
            C19131 c19131 = this.f5237;
            int i2 = c19131.f57111 - 1;
            if (y < i || y > i2) {
                return;
            }
            this.f5251 = x;
            this.f5250 = x;
            this.f5230 = y;
            this.f5221 = y;
            C4379 c4379M43507 = c19131.m43507();
            int i3 = this.f5250;
            int i4 = this.f5221;
            if (!" ".equals(c4379M43507.m9113(i3, i4, i3, i4))) {
                while (true) {
                    int i5 = this.f5250;
                    if (i5 <= 0) {
                        break;
                    }
                    int i6 = this.f5221;
                    if (c4379M43507.m9113(i5 - 1, i6, i5 - 1, i6).isEmpty()) {
                        break;
                    } else {
                        this.f5250--;
                    }
                }
                while (true) {
                    int i7 = this.f5251;
                    if (i7 >= this.f5237.f57085 - 1) {
                        break;
                    }
                    int i8 = this.f5221;
                    if (c4379M43507.m9113(i7 + 1, i8, i7 + 1, i8).isEmpty()) {
                        break;
                    } else {
                        this.f5251++;
                    }
                }
            }
            invalidate();
            return;
        }
        this.f5230 = -1;
        this.f5251 = -1;
        this.f5221 = -1;
        this.f5250 = -1;
        invalidate();
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m4994() {
        ClipData primaryClip;
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        CharSequence text = (clipboardManager == null || (primaryClip = clipboardManager.getPrimaryClip()) == null) ? null : primaryClip.getItemAt(0).getText();
        if (TextUtils.isEmpty(text)) {
            return;
        }
        if (this.f5223) {
            m4988((MotionEvent) null);
        }
        C21084 c21084 = this.f5239;
        if (c21084 != null) {
            c21084.m47589();
        }
        this.f5237.m43499(text.toString());
        m4980();
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m4991() {
        ClipData primaryClip;
        C19071 c19071 = this.f5222;
        if (c19071 == null || !c19071.m43344()) {
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
