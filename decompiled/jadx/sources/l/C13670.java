package l;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Stack;

/* JADX INFO: renamed from: l.ܰ۟ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 59KW */
/* JADX INFO: loaded from: classes3.dex */
public class C13670 extends View {

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public int f40750;

    /* JADX INFO: renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public int f40751;

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public float f40752;

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public boolean f40753;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f40754;

    /* JADX INFO: renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public Stack f40755;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public float f40756;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C20022 f40757;

    /* JADX INFO: renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public int f40758;

    /* JADX INFO: renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public Stack f40759;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f40760;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC10144 f40761;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public float f40762;

    /* JADX INFO: renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public float f40763;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public float f40764;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public float f40765;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f40766;

    /* JADX INFO: renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public boolean f40767;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public int f40768;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f40769;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C12965 f40770;

    /* JADX INFO: renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public ArrayList f40771;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C12965 f40772;

    /* JADX INFO: renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public ArrayList f40773;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C12965 f40774;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public int f40775;

    /* JADX INFO: renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public boolean f40776;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public boolean f40777;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public C0923 f40778;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public int f40779;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public int f40780;

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public float f40781;

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public C1539 f40782;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f40783;

    /* JADX INFO: renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public int f40784;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public int f40785;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C12965 f40786;

    /* JADX INFO: renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public boolean f40787;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public BitmapDrawable f40788;

    /* JADX INFO: renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public C15633 f40789;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C12965 f40790;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public boolean f40791;

    public C13670(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40785 = 0;
        this.f40754 = 0;
        this.f40751 = 0;
        this.f40763 = 5.0f;
        this.f40757 = new C20022();
        this.f40782 = new C1539();
        this.f40773 = new ArrayList();
        this.f40771 = new ArrayList();
        this.f40768 = 0;
        this.f40791 = true;
        this.f40755 = new Stack();
        this.f40759 = new Stack();
        m32840(context);
    }

    public C13670(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f40785 = 0;
        this.f40754 = 0;
        this.f40751 = 0;
        this.f40763 = 5.0f;
        this.f40757 = new C20022();
        this.f40782 = new C1539();
        this.f40773 = new ArrayList();
        this.f40771 = new ArrayList();
        this.f40768 = 0;
        this.f40791 = true;
        this.f40755 = new Stack();
        this.f40759 = new Stack();
        m32840(context);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m32840(Context context) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f40758 = viewConfiguration.getScaledTouchSlop();
        int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
        int i = scaledDoubleTapSlop * scaledDoubleTapSlop;
        int i2 = (int) ((context.getResources().getDisplayMetrics().density * 8.0f) + 0.5f);
        this.f40784 = i2;
        this.f40780 = i2;
        if (isInEditMode()) {
            Drawable drawable = context.getResources().getDrawable(R.drawable.MT_Protector);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            drawable.setBounds(0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
            drawable.draw(new Canvas(bitmapCreateBitmap));
            m32841(bitmapCreateBitmap);
            this.f40764 = 4.0f;
            this.f40765 = 4.0f;
            this.f40763 = 4.0f;
        }
        Paint.Style style = Paint.Style.FILL;
        C1539 c1539 = this.f40782;
        c1539.setStyle(style);
        c1539.setAntiAlias(false);
        c1539.setFilterBitmap(false);
        C0923 c0923 = new C0923(context, new GestureDetectorOnGestureListenerC11555(this, i));
        this.f40778 = c0923;
        c0923.m3329();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32867(C9285 c9285) {
        m32841(c9285.m23825());
        ArrayList arrayList = this.f40773;
        arrayList.clear();
        ArrayList arrayList2 = this.f40771;
        arrayList2.clear();
        this.f40772 = null;
        this.f40770 = null;
        C12260 c12260M23827 = c9285.m23827();
        if (c12260M23827 != null) {
            Rect rect = c12260M23827.f36519;
            ArrayList<C4499> arrayList3 = c12260M23827.f36521;
            ArrayList<C4499> arrayList4 = c12260M23827.f36520;
            for (C4499 c4499 : arrayList4) {
                arrayList.add(new C12965(c4499.f14318, c4499.f14317, false));
            }
            for (C4499 c44910 : arrayList3) {
                arrayList2.add(new C12965(c44910.f14318, c44910.f14317, true));
            }
            if (!rect.equals(C12260.m29753(arrayList4, arrayList3, this.f40775, this.f40779))) {
                this.f40772 = new C12965(rect.left, this.f40775 - rect.right, false);
                this.f40770 = new C12965(rect.top, this.f40779 - rect.bottom, true);
            }
        }
        C17045 c17045M23826 = c9285.m23826();
        if (c17045M23826 != null) {
            this.f40790 = new C12965(c17045M23826.f52234, this.f40775 - c17045M23826.f52235, false);
            this.f40774 = new C12965(c17045M23826.f52236, this.f40779 - c17045M23826.f52233, true);
        } else {
            this.f40790 = new C12965(0, this.f40775, false);
            this.f40774 = new C12965(0, this.f40779, true);
        }
        invalidate();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m32841(Bitmap bitmap) {
        if (bitmap != null) {
            this.f40775 = bitmap.getWidth();
            this.f40779 = bitmap.getHeight();
            BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), bitmap);
            this.f40788 = bitmapDrawable;
            Paint paint = bitmapDrawable.getPaint();
            paint.setAntiAlias(false);
            paint.setFilterBitmap(false);
            if (getWidth() == 0) {
                this.f40776 = true;
            } else {
                this.f40763 = m32861();
            }
            m32850();
        } else {
            this.f40779 = 100;
            this.f40775 = 100;
            this.f40788 = null;
        }
        invalidate();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m32850() {
        if (this.f40788 == null) {
            return;
        }
        float fMax = Math.max(getWidth() / (this.f40775 + 2.0f), getHeight() / (this.f40779 + 2.0f));
        this.f40765 = fMax;
        if (fMax < 16.0f) {
            this.f40765 = 16.0f;
        }
        float fMin = Math.min(getWidth(), getHeight()) / 5;
        float fMin2 = Math.min(fMin / (this.f40775 + 2.0f), fMin / (this.f40779 + 2.0f));
        this.f40764 = fMin2;
        if (fMin2 > 0.3f) {
            this.f40764 = 0.3f;
        }
        float f = this.f40763;
        float f2 = this.f40765;
        if (f > f2) {
            this.f40763 = f2;
            return;
        }
        float f3 = this.f40764;
        if (f < f3) {
            this.f40763 = f3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public float m32861() {
        float fMin = Math.min((getWidth() - (this.f40780 * 6)) / (this.f40775 + 2.0f), (getHeight() - (this.f40780 * 6)) / (this.f40779 + 2.0f));
        if (fMin > 16.0f) {
            return 16.0f;
        }
        return fMin;
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f40776) {
            this.f40776 = false;
            this.f40763 = m32861();
        }
        m32850();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int iM9441;
        C12965 c12965;
        C12965 c12966;
        C12965 c12967;
        C12965 c12968;
        int i;
        float f;
        float x;
        if (this.f40788 != null) {
            C12965 c12969 = this.f40786;
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.f40750 = 0;
                this.f40767 = false;
                this.f40753 = false;
                if (c12969 != null) {
                    C3088 c3088 = new C3088(this.f40763, this.f40784);
                    if (c12969.f38868) {
                        iM9441 = c3088.m9441(c12969, (motionEvent.getY() + getScrollY()) - ((getHeight() - ((int) ((this.f40779 * this.f40763) + 0.5f))) / 2.0f));
                    } else {
                        iM9441 = c3088.m9441(c12969, (motionEvent.getX() + getScrollX()) - ((getWidth() - ((int) ((this.f40775 * this.f40763) + 0.5f))) / 2.0f));
                    }
                    if (iM9441 != 0) {
                        this.f40762 = motionEvent.getX();
                        this.f40752 = motionEvent.getY();
                        this.f40753 = true;
                        this.f40783 = true;
                        this.f40777 = iM9441 == -1;
                        this.f40787 = false;
                    }
                }
            } else if (actionMasked != 2) {
                if (actionMasked == 5) {
                    this.f40753 = false;
                    this.f40750++;
                    if (!this.f40767) {
                        this.f40756 = m32838(motionEvent);
                        this.f40781 = this.f40763;
                        this.f40767 = true;
                        this.f40787 = false;
                        this.f40762 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                        this.f40752 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                        return true;
                    }
                } else if (actionMasked == 6) {
                    this.f40750--;
                    return true;
                }
            } else {
                if (this.f40750 == 1 && this.f40767) {
                    float fM32838 = m32838(motionEvent);
                    if (!this.f40787) {
                        if (Math.abs(fM32838 - this.f40756) > this.f40758) {
                            this.f40787 = true;
                            this.f40778.m3331(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                        }
                    }
                    int width = getWidth() / 2;
                    int height = getHeight() / 2;
                    float f2 = width;
                    float scrollX = ((this.f40762 + getScrollX()) - f2) / this.f40763;
                    float f3 = height;
                    float scrollY = ((this.f40752 + getScrollY()) - f3) / this.f40763;
                    float f4 = (this.f40781 * fM32838) / this.f40756;
                    this.f40763 = f4;
                    float f5 = this.f40765;
                    if (f4 > f5) {
                        this.f40763 = f5;
                    } else {
                        float f6 = this.f40764;
                        if (f4 < f6) {
                            this.f40763 = f6;
                        }
                    }
                    float f7 = this.f40763;
                    scrollTo((int) (((scrollX * f7) - this.f40762) + f2), (int) (((scrollY * f7) - this.f40752) + f3));
                    invalidate();
                    return true;
                }
                if (c12969 != null) {
                    boolean z = c12969.f38868;
                    if (this.f40753) {
                        if (!this.f40787) {
                            int x2 = ((int) this.f40762) - ((int) motionEvent.getX());
                            int y = ((int) this.f40752) - ((int) motionEvent.getY());
                            int i2 = (y * y) + (x2 * x2);
                            int i3 = this.f40758;
                            if (i2 > i3 * i3) {
                                m32837();
                                this.f40787 = true;
                                this.f40778.m3331(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                                if (this.f40777) {
                                    this.f40766 = c12969.f14318;
                                    this.f40769 = 0;
                                    this.f40760 = this.f40768 == 0 ? c12969.f14317 : c12969.f14317 - 1;
                                } else {
                                    this.f40766 = c12969.f14317;
                                    this.f40769 = this.f40768 == 0 ? c12969.f14318 : c12969.f14318 + 1;
                                    this.f40760 = z ? this.f40779 : this.f40775;
                                }
                            }
                        } else {
                            if (z) {
                                f = this.f40752;
                                x = motionEvent.getY();
                            } else {
                                f = this.f40762;
                                x = motionEvent.getX();
                            }
                            int i4 = this.f40766 - ((int) ((f - x) / this.f40763));
                            int i5 = this.f40760;
                            if (i4 > i5 || i4 < (i5 = this.f40769)) {
                                i4 = i5;
                            }
                            if (this.f40777) {
                                c12969.f14318 = i4;
                            } else {
                                c12969.f14317 = i4;
                            }
                            if (c12969.f14318 == c12969.f14317) {
                                if (this.f40783) {
                                    this.f40783 = false;
                                    performHapticFeedback(0);
                                }
                            } else if (!this.f40783) {
                                this.f40783 = true;
                            }
                            InterfaceC10144 interfaceC10144 = this.f40761;
                            if (interfaceC10144 != null) {
                                interfaceC10144.mo6278(c12969);
                            }
                            invalidate();
                        }
                    }
                }
            }
            if ((!this.f40767 && !this.f40753) || !this.f40787) {
                this.f40778.m3331(motionEvent);
            }
            int actionMasked2 = motionEvent.getActionMasked();
            if (actionMasked2 == 1 || actionMasked2 == 3) {
                if (this.f40753 && c12969 != null) {
                    boolean z2 = c12969.f38868;
                    if (this.f40787) {
                        int i6 = this.f40768;
                        if (i6 == 0) {
                            int i7 = c12969.f14318;
                            int i8 = c12969.f14317;
                            ArrayList arrayList = this.f40773;
                            ArrayList arrayList2 = this.f40771;
                            if (i7 == i8) {
                                if (z2) {
                                    arrayList2.remove(c12969);
                                } else {
                                    arrayList.remove(c12969);
                                }
                                invalidate();
                                m32842((C4499) null);
                            } else {
                                if (z2) {
                                    arrayList = arrayList2;
                                }
                                Iterator it = arrayList.iterator();
                                boolean z3 = false;
                                while (it.hasNext()) {
                                    C12965 c129610 = (C12965) it.next();
                                    if (c129610 != c12969) {
                                        int i9 = c12969.f14318;
                                        int i10 = c129610.f14318;
                                        if (i9 <= i10 && i10 <= (i = c12969.f14317)) {
                                            c12969.f14317 = Math.max(i, c129610.f14317);
                                            it.remove();
                                        } else {
                                            int i11 = c129610.f14317;
                                            if (i9 <= i11 && i11 <= c12969.f14317) {
                                                c12969.f14318 = i10;
                                                it.remove();
                                            }
                                        }
                                        z3 = true;
                                    }
                                }
                                if (z3) {
                                    invalidate();
                                    m32842(c12969);
                                }
                            }
                        } else if (i6 == 1) {
                            C12965 c129611 = this.f40772;
                            if (c12969 == c129611 && (c12968 = this.f40790) != null) {
                                int i12 = c12968.f14318;
                                int i13 = c129611.f14318;
                                if (i12 > i13) {
                                    c12968.f14318 = i13;
                                }
                                int i14 = c12968.f14317;
                                int i15 = c129611.f14317;
                                if (i14 < i15) {
                                    c12968.f14317 = i15;
                                }
                                invalidate();
                            } else {
                                C12965 c129612 = this.f40770;
                                if (c12969 == c129612 && (c12967 = this.f40774) != null) {
                                    int i16 = c12967.f14318;
                                    int i17 = c129612.f14318;
                                    if (i16 > i17) {
                                        c12967.f14318 = i17;
                                    }
                                    int i18 = c12967.f14317;
                                    int i19 = c129612.f14317;
                                    if (i18 < i19) {
                                        c12967.f14317 = i19;
                                    }
                                    invalidate();
                                }
                            }
                        } else if (i6 == 2) {
                            C12965 c129613 = this.f40790;
                            if (c12969 == c129613 && (c12966 = this.f40772) != null) {
                                int i20 = c129613.f14318;
                                int i21 = c12966.f14317;
                                if (i20 >= i21) {
                                    c12966.f14318 = i20;
                                    c12966.f14317 = i20 + 1;
                                } else {
                                    int i22 = c129613.f14317;
                                    int i23 = c12966.f14318;
                                    if (i22 <= i23) {
                                        c12966.f14317 = i22;
                                        c12966.f14318 = i22 - 1;
                                    } else {
                                        if (i20 > i23) {
                                            c12966.f14318 = i20;
                                        }
                                        if (i22 < i21) {
                                            c12966.f14317 = i22;
                                        }
                                    }
                                }
                                invalidate();
                            } else {
                                C12965 c129614 = this.f40774;
                                if (c12969 == c129614 && (c12965 = this.f40770) != null) {
                                    int i24 = c129614.f14318;
                                    int i25 = c12965.f14317;
                                    if (i24 >= i25) {
                                        c12965.f14318 = i24;
                                        c12965.f14317 = i24 + 1;
                                    } else {
                                        int i26 = c129614.f14317;
                                        int i27 = c12965.f14318;
                                        if (i26 <= i27) {
                                            c12965.f14317 = i26;
                                            c12965.f14318 = i26 - 1;
                                        } else {
                                            if (i24 > i27) {
                                                c12965.f14318 = i24;
                                            }
                                            if (i26 < i25) {
                                                c12965.f14317 = i26;
                                            }
                                        }
                                    }
                                    invalidate();
                                }
                            }
                        }
                        m32860();
                    }
                }
                this.f40750 = 0;
                this.f40767 = false;
                this.f40753 = false;
                return true;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:95:0x0497 A[PHI: r7 r21 r29 r32 r34
      0x0497: PHI (r7v11 int) = (r7v8 int), (r7v8 int), (r7v8 int), (r7v13 int), (r7v15 int) binds: [B:82:0x03aa, B:84:0x040e, B:85:0x0410, B:79:0x038c, B:78:0x0367] A[DONT_GENERATE, DONT_INLINE]
      0x0497: PHI (r21v4 int) = (r21v2 int), (r21v2 int), (r21v2 int), (r21v7 int), (r21v8 int) binds: [B:82:0x03aa, B:84:0x040e, B:85:0x0410, B:79:0x038c, B:78:0x0367] A[DONT_GENERATE, DONT_INLINE]
      0x0497: PHI (r29v4 int) = (r29v2 int), (r29v2 int), (r29v2 int), (r29v6 int), (r29v6 int) binds: [B:82:0x03aa, B:84:0x040e, B:85:0x0410, B:79:0x038c, B:78:0x0367] A[DONT_GENERATE, DONT_INLINE]
      0x0497: PHI (r32v6 int) = (r32v3 int), (r32v3 int), (r32v3 int), (r32v3 int), (r32v7 int) binds: [B:82:0x03aa, B:84:0x040e, B:85:0x0410, B:79:0x038c, B:78:0x0367] A[DONT_GENERATE, DONT_INLINE]
      0x0497: PHI (r34v1 int) = (r34v0 int), (r34v0 int), (r34v0 int), (r34v2 int), (r34v3 int) binds: [B:82:0x03aa, B:84:0x040e, B:85:0x0410, B:79:0x038c, B:78:0x0367] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C1539 c1539;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        C1539 c15310;
        int i11;
        C1539 c15311;
        int i12;
        int width = getWidth();
        int height = getHeight();
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int i13 = scrollX + width;
        int i14 = scrollY + height;
        float f = this.f40763;
        int i15 = (int) ((this.f40775 * f) + 0.5f);
        int i16 = (int) ((this.f40779 * f) + 0.5f);
        int iMax = Math.max((int) (0.5f + f), 1);
        int i17 = (width / 2) - (i15 / 2);
        int i18 = (height / 2) - (i16 / 2);
        int i19 = i17 + i15;
        int i20 = i18 + i16;
        C20022 c20022 = this.f40757;
        canvas.drawColor(c20022.f64841);
        int i21 = this.f40780;
        int i22 = ((i15 + iMax) + iMax) / i21;
        int i23 = ((i16 + iMax) + iMax) / i21;
        int[] iArr = c20022.f64842;
        C20022 c20023 = c20022;
        int i24 = 0;
        while (true) {
            c1539 = this.f40782;
            if (i24 > i22) {
                break;
            }
            int i25 = i17;
            int i26 = (i24 * i21) + (i17 - iMax);
            int i27 = i22;
            int i28 = i19;
            int iMin = Math.min(i19 + iMax, i26 + i21);
            if (iMin > scrollX && i26 < i13) {
                int i29 = 0;
                while (i29 <= i23) {
                    int i30 = i23;
                    int i31 = (i29 * i21) + (i18 - iMax);
                    int i32 = i13;
                    int i33 = i20;
                    int iMin2 = Math.min(i20 + iMax, i31 + i21);
                    if (iMin2 <= scrollY || i31 >= i14) {
                        i11 = i33;
                        c15311 = c1539;
                        i12 = i27;
                    } else {
                        c1539.setColor(iArr[(i24 + i29) % 2]);
                        c15311 = c1539;
                        i11 = i33;
                        i12 = i27;
                        canvas.drawRect(i26, i31, iMin, iMin2, c15311);
                    }
                    i29++;
                    i20 = i11;
                    c1539 = c15311;
                    iMin = iMin;
                    i27 = i12;
                    i23 = i30;
                    iArr = iArr;
                    i21 = i21;
                    i28 = i28;
                    c20023 = c20023;
                    i13 = i32;
                    i26 = i26;
                }
            }
            i24++;
            i19 = i28;
            i20 = i20;
            c20023 = c20023;
            i17 = i25;
            i13 = i13;
            i22 = i27;
            i23 = i23;
            iArr = iArr;
            i21 = i21;
        }
        int i34 = i20;
        int i35 = i13;
        int i36 = i17;
        C20022 c20024 = c20023;
        C1539 c15312 = c1539;
        int i37 = i19;
        BitmapDrawable bitmapDrawable = this.f40788;
        if (bitmapDrawable != null) {
            i = i36;
            bitmapDrawable.setBounds(i, i18, i37, i34);
            bitmapDrawable.draw(canvas);
        } else {
            i = i36;
        }
        int i38 = c20024.f64846;
        int i39 = c20024.f64845;
        int i40 = c20024.f64843;
        int i41 = this.f40768;
        boolean z = i41 == 0;
        boolean z2 = i41 == 1;
        boolean z3 = i41 == 2;
        boolean z4 = this.f40791;
        C12965 c12965 = this.f40786;
        for (C4499 c4499 : this.f40773) {
            boolean z5 = z4;
            float f2 = i;
            int i42 = i40;
            float f3 = (c4499.f14318 * f) + f2;
            float f4 = (c4499.f14317 * f) + f2;
            C1539 c15313 = c15312;
            c15313.setColor(-16777216);
            C20022 c20025 = c20024;
            float f5 = i18;
            int i43 = scrollX;
            C12965 c12966 = c12965;
            int i44 = i37;
            int i45 = i39;
            int i46 = i;
            int i47 = i38;
            canvas.drawRect(f3, i18 - iMax, f4, f5, c15313);
            if (z && z5) {
                c15313.setColor(i47);
                c15310 = c15313;
                canvas.drawRect(f3, f5, f4, i34, c15313);
                c15310.setColor(c12966 == c4499 ? i42 : i45);
                float f6 = scrollY;
                float f7 = i14;
                canvas.drawRect(f3, f6, f3 + 1.0f, f7, c15310);
                canvas.drawRect(f4 - 1.0f, f6, f4, f7, c15310);
            } else {
                c15310 = c15313;
            }
            i38 = i47;
            i37 = i44;
            z4 = z5;
            i40 = i42;
            i39 = i45;
            i = i46;
            c12965 = c12966;
            scrollX = i43;
            c15312 = c15310;
            c20024 = c20025;
        }
        boolean z6 = z4;
        int i48 = i40;
        int i49 = i39;
        int i50 = i;
        int i51 = scrollX;
        C12965 c12967 = c12965;
        int i52 = i38;
        int i53 = i37;
        C1539 c15314 = c15312;
        C20022 c20026 = c20024;
        Iterator it = this.f40771.iterator();
        while (it.hasNext()) {
            C4499 c44910 = (C4499) it.next();
            float f8 = i18;
            float f9 = (c44910.f14318 * f) + f8;
            float f10 = (c44910.f14317 * f) + f8;
            c15314.setColor(-16777216);
            float f11 = i50 - iMax;
            int i54 = i50;
            float f12 = i54;
            Iterator it2 = it;
            int i55 = i14;
            canvas.drawRect(f11, f9, f12, f10, c15314);
            if (z && z6) {
                c15314.setColor(i52);
                int i56 = i53;
                i10 = i56;
                canvas.drawRect(f12, f9, i56, f10, c15314);
                c15314.setColor(c12967 == c44910 ? i48 : i49);
                i9 = i51;
                float f13 = i9;
                int i57 = i35;
                float f14 = i57;
                i8 = i57;
                canvas.drawRect(f13, f9, f14, f9 + 1.0f, c15314);
                canvas.drawRect(f13, f10 - 1.0f, f14, f10, c15314);
            } else {
                i8 = i35;
                i9 = i51;
                i10 = i53;
            }
            i51 = i9;
            i14 = i55;
            i35 = i8;
            i50 = i54;
            it = it2;
            i53 = i10;
            scrollY = scrollY;
        }
        int i58 = i35;
        int i59 = i50;
        int i60 = i14;
        int i61 = i51;
        int i62 = i53;
        int i63 = scrollY;
        boolean z7 = !z2;
        int i64 = 0;
        while (i64 < 2) {
            if (z7) {
                C12965 c12968 = this.f40772;
                if (c12968 != null) {
                    float f15 = i59;
                    float f16 = (c12968.f14318 * f) + f15;
                    float f17 = f15 + (c12968.f14317 * f);
                    float f18 = i18;
                    C12965 c12969 = this.f40770;
                    float f19 = (c12969.f14318 * f) + f18;
                    float f20 = (c12969.f14317 * f) + f18;
                    c15314.setColor(-16777216);
                    i2 = i64;
                    canvas.drawRect(f16, i34, f17, i34 + iMax, c15314);
                    canvas.drawRect(i62, f19, i62 + iMax, f20, c15314);
                    if (z2 && z6) {
                        c15314.setColor(i52);
                        canvas.drawRect(f16, f19, f17, f20, c15314);
                        c15314.setColor(c12967 == this.f40772 ? i48 : i49);
                        int i65 = i63;
                        float f21 = i65;
                        float f22 = f16 + 1.0f;
                        int i66 = i60;
                        float f23 = i66;
                        i3 = i52;
                        i60 = i66;
                        i4 = i65;
                        canvas.drawRect(f16, f21, f22, f23, c15314);
                        canvas.drawRect(f17 - 1.0f, f21, f17, f23, c15314);
                        c15314.setColor(c12967 == this.f40770 ? i48 : i49);
                        float f24 = i61;
                        int i67 = i58;
                        float f25 = i67;
                        i5 = i67;
                        canvas.drawRect(f24, f19, f25, f19 + 1.0f, c15314);
                        canvas.drawRect(f24, f20 - 1.0f, f25, f20, c15314);
                    } else {
                        i3 = i52;
                        i4 = i63;
                        i5 = i58;
                    }
                    i6 = i60;
                    i7 = i5;
                } else {
                    i2 = i64;
                    i3 = i52;
                    i4 = i63;
                    i6 = i60;
                    i7 = i58;
                }
            } else {
                i2 = i64;
                i3 = i52;
                i4 = i63;
                i5 = i58;
                C12965 c129610 = this.f40790;
                if (c129610 != null) {
                    float f26 = i59;
                    float f27 = (c129610.f14318 * f) + f26;
                    float f28 = (c129610.f14317 * f) + f26;
                    float f29 = i18;
                    C12965 c129611 = this.f40774;
                    float f30 = (c129611.f14318 * f) + f29;
                    float f31 = (c129611.f14317 * f) + f29;
                    c15314.setColor(-65536);
                    float f32 = i34;
                    float f33 = i34 + iMax;
                    canvas.drawRect(f26, f32, f27, f33, c15314);
                    float f34 = i62;
                    canvas.drawRect(f28, f32, f34, f33, c15314);
                    float f35 = i62 + iMax;
                    canvas.drawRect(f34, f29, f35, f30, c15314);
                    canvas.drawRect(f34, f31, f35, f32, c15314);
                    if (z3 && z6) {
                        c15314.setColor(c20026.f64844);
                        canvas.drawRect(f26, f29, f34, f30, c15314);
                        canvas.drawRect(f26, f31, f34, f32, c15314);
                        canvas.drawRect(f26, f30, f27, f31, c15314);
                        canvas.drawRect(f28, f30, f34, f31, c15314);
                        c15314.setColor(c12967 == this.f40790 ? i48 : i49);
                        float f36 = i4;
                        int i68 = i60;
                        float f37 = i68;
                        i6 = i68;
                        canvas.drawRect(f27, f36, f27 + 1.0f, f37, c15314);
                        canvas.drawRect(f28 - 1.0f, f36, f28, f37, c15314);
                        c15314.setColor(c12967 == this.f40774 ? i48 : i49);
                        float f38 = i61;
                        float f39 = i5;
                        float f40 = f30 + 1.0f;
                        i7 = i5;
                        canvas.drawRect(f38, f30, f39, f40, c15314);
                        canvas.drawRect(f38, f31 - 1.0f, f39, f31, c15314);
                    } else {
                        i6 = i60;
                        i7 = i5;
                    }
                } else {
                    i6 = i60;
                    i7 = i5;
                }
            }
            z7 = !z7;
            i64 = i2 + 1;
            i63 = i4;
            i52 = i3;
            i58 = i7;
            i60 = i6;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static float m32838(MotionEvent motionEvent) {
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((y * y) + (x * x));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32869(InterfaceC10144 interfaceC10144) {
        this.f40761 = interfaceC10144;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m32842(C4499 c4499) {
        InterfaceC10144 interfaceC10144 = this.f40761;
        if (interfaceC10144 != null) {
            interfaceC10144.mo6281(c4499);
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m32848() {
        InterfaceC10144 interfaceC10144 = this.f40761;
        if (interfaceC10144 != null) {
            interfaceC10144.mo6280(!this.f40755.isEmpty(), !this.f40759.isEmpty());
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m32882() {
        return this.f40768;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32865(int i) {
        this.f40768 = i;
        this.f40791 = true;
        this.f40786 = null;
        m32842((C4499) null);
        invalidate();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m32884() {
        return this.f40791;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m32880(boolean z) {
        this.f40791 = z;
        invalidate();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m32881() {
        return !this.f40755.isEmpty();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m32877() {
        return !this.f40759.isEmpty();
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m32879() {
        Stack stack = this.f40755;
        if (stack.isEmpty()) {
            return;
        }
        C15633 c15633 = (C15633) stack.pop();
        m32843(c15633.f48130);
        this.f40759.push(c15633);
        m32848();
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m32874() {
        Stack stack = this.f40759;
        if (stack.isEmpty()) {
            return;
        }
        C15633 c15633 = (C15633) stack.pop();
        m32843(c15633.f48129);
        this.f40755.push(c15633);
        m32848();
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private C8579 m32849() {
        C8579 c8579 = new C8579();
        c8579.f26208 = this.f40768;
        c8579.f26202 = this.f40754;
        ArrayList arrayList = this.f40773;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c8579.f26201.add(((C12965) it.next()).clone());
        }
        ArrayList arrayList2 = this.f40771;
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            c8579.f26207.add(((C12965) it2.next()).clone());
        }
        C12965 c12965 = this.f40772;
        c8579.f26204 = c12965 == null ? null : c12965.clone();
        C12965 c12966 = this.f40770;
        c8579.f26206 = c12966 == null ? null : c12966.clone();
        C12965 c12967 = this.f40790;
        c8579.f26205 = c12967 == null ? null : c12967.clone();
        C12965 c12968 = this.f40774;
        c8579.f26203 = c12968 != null ? c12968.clone() : null;
        C12965 c12969 = this.f40786;
        if (c12969 != null) {
            int i = this.f40768;
            if (i == 0) {
                int iIndexOf = arrayList.indexOf(c12969);
                if (iIndexOf == -1 && (iIndexOf = arrayList2.indexOf(this.f40786)) != -1) {
                    iIndexOf += arrayList.size();
                }
                c8579.f26200 = iIndexOf;
            } else {
                if (i == 1) {
                    if (c12969 == this.f40772) {
                        c8579.f26200 = 0;
                        return c8579;
                    }
                    if (c12969 == this.f40770) {
                        c8579.f26200 = 1;
                        return c8579;
                    }
                    c8579.f26200 = -1;
                    return c8579;
                }
                if (i == 2) {
                    if (c12969 == this.f40790) {
                        c8579.f26200 = 0;
                        return c8579;
                    }
                    if (c12969 == this.f40774) {
                        c8579.f26200 = 1;
                        return c8579;
                    }
                    c8579.f26200 = -1;
                    return c8579;
                }
            }
        }
        return c8579;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m32843(C8579 c8579) {
        ArrayList arrayList = this.f40773;
        arrayList.clear();
        ArrayList arrayList2 = this.f40771;
        arrayList2.clear();
        Iterator it = c8579.f26201.iterator();
        while (it.hasNext()) {
            arrayList.add(((C12965) it.next()).clone());
        }
        Iterator it2 = c8579.f26207.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((C12965) it2.next()).clone());
        }
        C12965 c12965 = c8579.f26204;
        this.f40772 = c12965 == null ? null : c12965.clone();
        C12965 c12966 = c8579.f26206;
        this.f40770 = c12966 == null ? null : c12966.clone();
        C12965 c12967 = c8579.f26205;
        this.f40790 = c12967 == null ? null : c12967.clone();
        C12965 c12968 = c8579.f26203;
        C12965 c12965Clone = c12968 == null ? null : c12968.clone();
        this.f40774 = c12965Clone;
        int i = c8579.f26200;
        if (i == -1) {
            this.f40786 = null;
        } else {
            int i2 = c8579.f26208;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        if (i == 0) {
                            this.f40786 = this.f40790;
                        } else if (i == 1) {
                            this.f40786 = c12965Clone;
                        } else {
                            this.f40786 = null;
                        }
                    }
                } else if (i == 0) {
                    this.f40786 = this.f40772;
                } else if (i == 1) {
                    this.f40786 = this.f40770;
                } else {
                    this.f40786 = null;
                }
            } else if (i < arrayList.size()) {
                this.f40786 = (C12965) arrayList.get(i);
            } else {
                int size = i - arrayList.size();
                if (size < arrayList2.size()) {
                    this.f40786 = (C12965) arrayList2.get(size);
                } else {
                    this.f40786 = null;
                }
            }
        }
        int i3 = c8579.f26208;
        if (i3 != this.f40768) {
            this.f40768 = i3;
            InterfaceC10144 interfaceC10144 = this.f40761;
            if (interfaceC10144 != null) {
                interfaceC10144.mo6277(i3);
            }
        }
        int i4 = c8579.f26202;
        if (i4 != this.f40754) {
            this.f40754 = i4;
            InterfaceC10144 interfaceC10145 = this.f40761;
            if (interfaceC10145 != null) {
                interfaceC10145.mo6279(m32872());
            }
        }
        m32842(this.f40786);
        this.f40791 = true;
        invalidate();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32868(C10130 c10130) {
        c10130.writeInt(1901228945);
        c10130.writeInt(this.f40785);
        c10130.writeInt(this.f40751);
        m32849().m22287(c10130);
        Stack<C15633> stack = this.f40755;
        c10130.mo13231(stack.size());
        for (C15633 c15633 : stack) {
            c15633.f48130.m22287(c10130);
            c15633.f48129.m22287(c10130);
        }
        Stack<C15633> stack2 = this.f40759;
        c10130.mo13231(stack2.size());
        for (C15633 c15634 : stack2) {
            c15634.f48130.m22287(c10130);
            c15634.f48129.m22287(c10130);
        }
        c10130.writeInt(1901228945);
        c10130.writeInt(getScrollX());
        c10130.writeInt(getScrollY());
        c10130.m25419(this.f40763);
        c10130.m25425(this.f40791);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32870(C12951 c12951) {
        try {
            C22124.m49722((InterfaceC20008) c12951, 1901228945);
            this.f40785 = c12951.readInt();
            this.f40751 = c12951.readInt();
            C8579 c8579 = new C8579();
            c8579.m22288(c12951);
            m32843(c8579);
            int iM31494 = c12951.m31494();
            Stack stack = this.f40755;
            stack.clear();
            for (int i = 0; i < iM31494; i++) {
                C15633 c15633 = new C15633();
                C8579 c85710 = new C8579();
                c85710.m22288(c12951);
                c15633.f48130 = c85710;
                C8579 c85711 = new C8579();
                c85711.m22288(c12951);
                c15633.f48129 = c85711;
                stack.add(c15633);
            }
            int iM31495 = c12951.m31494();
            Stack stack2 = this.f40759;
            stack2.clear();
            for (int i2 = 0; i2 < iM31495; i2++) {
                C15633 c15634 = new C15633();
                C8579 c85712 = new C8579();
                c85712.m22288(c12951);
                c15634.f48130 = c85712;
                C8579 c85713 = new C8579();
                c85713.m22288(c12951);
                c15634.f48129 = c85713;
                stack2.add(c15634);
            }
            m32848();
            try {
                C22124.m49722((InterfaceC20008) c12951, 1901228945);
                scrollTo(c12951.readInt(), c12951.readInt());
                this.f40763 = c12951.m31495();
                this.f40776 = false;
                this.f40791 = c12951.m31498();
                invalidate();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    private void m32837() {
        C15633 c15633 = new C15633();
        this.f40789 = c15633;
        c15633.f48130 = m32849();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m32860() {
        int i = this.f40785 + 1;
        this.f40785 = i;
        this.f40754 = i;
        InterfaceC10144 interfaceC10144 = this.f40761;
        if (interfaceC10144 != null) {
            interfaceC10144.mo6279(m32872());
        }
        C15633 c15633 = this.f40789;
        if (c15633 != null) {
            c15633.f48129 = m32849();
            this.f40755.push(this.f40789);
            this.f40759.clear();
            this.f40789 = null;
            m32848();
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m32872() {
        return this.f40751 != this.f40754;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m32876(boolean z) {
        int i;
        if (z) {
            int i2 = this.f40785 + 1;
            this.f40785 = i2;
            i = -i2;
        } else {
            i = this.f40754;
        }
        this.f40751 = i;
        InterfaceC10144 interfaceC10144 = this.f40761;
        if (interfaceC10144 != null) {
            interfaceC10144.mo6279(m32872());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32866(String str) {
        C16339 c16339M41572 = C17751.m41572(this.f40775, this.f40779, str);
        C12965 c12965 = this.f40772;
        C12965 c12966 = this.f40770;
        C12965 c12967 = this.f40790;
        C12965 c12968 = this.f40774;
        int i = this.f40775;
        int i2 = this.f40779;
        ArrayList arrayList = this.f40773;
        ArrayList arrayList2 = this.f40771;
        if (new C16339(arrayList, arrayList2, c12965, c12966, c12967, c12968, i, i2).m38482(c16339M41572)) {
            return;
        }
        m32837();
        arrayList.clear();
        for (C4499 c4499 : c16339M41572.f50302) {
            arrayList.add(new C12965(c4499.f14318, c4499.f14317, false));
        }
        arrayList2.clear();
        for (C4499 c44910 : c16339M41572.f50300) {
            arrayList2.add(new C12965(c44910.f14318, c44910.f14317, true));
        }
        C4499 c44911 = c16339M41572.f50298;
        if (c44911 == null) {
            this.f40770 = null;
            this.f40772 = null;
        } else {
            this.f40772 = new C12965(c44911.f14318, c44911.f14317, false);
            C4499 c44912 = c16339M41572.f50299;
            this.f40770 = new C12965(c44912.f14318, c44912.f14317, true);
        }
        C4499 c44913 = c16339M41572.f50301;
        this.f40790 = new C12965(c44913.f14318, c44913.f14317, false);
        C4499 c44914 = c16339M41572.f50303;
        this.f40774 = new C12965(c44914.f14318, c44914.f14317, true);
        this.f40786 = null;
        this.f40791 = true;
        m32860();
        m32842((C4499) null);
        invalidate();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m32878() {
        return C17751.m41568(new C16339(this.f40773, this.f40771, this.f40772, this.f40770, this.f40790, this.f40774, this.f40775, this.f40779), this.f40775, this.f40779);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m32885() {
        return this.f40772 != null;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m32873() {
        m32837();
        this.f40770 = null;
        this.f40772 = null;
        m32860();
        invalidate();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32864() {
        if (m32885()) {
            return;
        }
        m32837();
        C12965 c12965 = this.f40790;
        this.f40772 = c12965 != null ? c12965.clone() : new C12965(0, this.f40775, false);
        C12965 c12966 = this.f40774;
        this.f40770 = c12966 != null ? c12966.clone() : new C12965(0, this.f40779, true);
        m32860();
        invalidate();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m32875(C9285 c9285) {
        C12260 c12260 = new C12260();
        ArrayList<C12965> arrayList = this.f40773;
        for (C12965 c12965 : arrayList) {
            c12260.f36520.add(new C4499(c12965.f14318, c12965.f14317));
        }
        ArrayList<C12965> arrayList2 = this.f40771;
        for (C12965 c12966 : arrayList2) {
            c12260.f36521.add(new C4499(c12966.f14318, c12966.f14317));
        }
        C12965 c12967 = this.f40772;
        if (c12967 != null) {
            Rect rect = c12260.f36519;
            rect.left = c12967.f14318;
            rect.right = this.f40775 - c12967.f14317;
            C12965 c12968 = this.f40770;
            rect.top = c12968.f14318;
            rect.bottom = this.f40779 - c12968.f14317;
        } else {
            c12260.f36519.set(C12260.m29753(arrayList, arrayList2, this.f40775, this.f40779));
        }
        c9285.m23820(c12260);
        if (this.f40790 != null) {
            C17045 c17045 = new C17045();
            C12965 c12969 = this.f40790;
            c17045.f52234 = c12969.f14318;
            c17045.f52235 = this.f40775 - c12969.f14317;
            C12965 c129610 = this.f40774;
            c17045.f52236 = c129610.f14318;
            c17045.f52233 = this.f40779 - c129610.f14317;
            c9285.m23821(c17045);
            return;
        }
        c9285.m23821((C17045) null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32871(boolean z) {
        ArrayList arrayList = z ? this.f40771 : this.f40773;
        C12965 c12965 = new C12965(z);
        int i = z ? this.f40779 : this.f40775;
        int i2 = 0;
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == 1) {
                C12965 c12966 = (C12965) arrayList.get(0);
                int i3 = c12966.f14318;
                int i4 = c12966.f14317;
                if (i3 >= i - i4) {
                    i = i3 - 1;
                } else {
                    i2 = i4 + 1;
                }
            } else {
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    C12965 c12967 = (C12965) arrayList.get(i5);
                    if (i5 == 0) {
                        arrayList2.add(new C22843(0, c12967.f14318 - 1));
                    } else if (i5 == size - 1) {
                        arrayList2.add(new C22843(c12967.f14317 + 1, i));
                    } else {
                        arrayList2.add(new C22843(((C12965) arrayList.get(i5 - 1)).f14317 + 1, c12967.f14318 - 1));
                    }
                }
                Collections.sort(arrayList2);
                C22843 c22843 = (C22843) arrayList2.get(0);
                i2 = c22843.f73726;
                i = c22843.f73725;
            }
        }
        int i6 = i - i2;
        if (i6 <= 0) {
            C21374.m48457(R.string.MT_Protector);
            return;
        }
        int i7 = (int) (getContext().getResources().getDisplayMetrics().density * 16.0f);
        if (i6 > i7) {
            int i8 = (i6 - i7) / 2;
            i -= i8;
            i2 += i8;
        }
        c12965.f14318 = i2;
        c12965.f14317 = i;
        m32837();
        arrayList.add(c12965);
        Collections.sort(arrayList);
        m32860();
        invalidate();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m32883() {
        Stack stack = this.f40755;
        boolean zIsEmpty = stack.isEmpty();
        Stack stack2 = this.f40759;
        if (zIsEmpty && stack2.isEmpty()) {
            return;
        }
        stack.clear();
        stack2.clear();
        m32848();
    }
}
