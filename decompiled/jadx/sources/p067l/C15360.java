package p067l;

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
import bin.p000mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Stack;

/* JADX INFO: renamed from: l.ܰ۟ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 59KW */
/* JADX INFO: loaded from: classes3.dex */
public class C15360 extends View {

    /* JADX INFO: renamed from: ֡֫ */
    public int f43831;

    /* JADX INFO: renamed from: ֨֫ */
    public int f43832;

    /* JADX INFO: renamed from: ֫֫ */
    public float f43833;

    /* JADX INFO: renamed from: ۖ֫ */
    public boolean f43834;

    /* JADX INFO: renamed from: ۗ */
    public int f43835;

    /* JADX INFO: renamed from: ۗ֫ */
    public Stack f43836;

    /* JADX INFO: renamed from: ۘ֫ */
    public float f43837;

    /* JADX INFO: renamed from: ۙ */
    public C21397 f43838;

    /* JADX INFO: renamed from: ۙ֫ */
    public int f43839;

    /* JADX INFO: renamed from: ۚ֫ */
    public Stack f43840;

    /* JADX INFO: renamed from: ۛ */
    public int f43841;

    /* JADX INFO: renamed from: ۜ֫ */
    public InterfaceC12009 f43842;

    /* JADX INFO: renamed from: ۟ */
    public float f43843;

    /* JADX INFO: renamed from: ۠֫ */
    public float f43844;

    /* JADX INFO: renamed from: ۡ֫ */
    public float f43845;

    /* JADX INFO: renamed from: ۢ֫ */
    public float f43846;

    /* JADX INFO: renamed from: ۤ */
    public int f43847;

    /* JADX INFO: renamed from: ۤ֫ */
    public boolean f43848;

    /* JADX INFO: renamed from: ۧ֫ */
    public int f43849;

    /* JADX INFO: renamed from: ۨ */
    public int f43850;

    /* JADX INFO: renamed from: ۫ */
    public C14690 f43851;

    /* JADX INFO: renamed from: ۫֫ */
    public ArrayList f43852;

    /* JADX INFO: renamed from: ۬ */
    public C14690 f43853;

    /* JADX INFO: renamed from: ۬֫ */
    public ArrayList f43854;

    /* JADX INFO: renamed from: ܰ */
    public C14690 f43855;

    /* JADX INFO: renamed from: ܳ֫ */
    public int f43856;

    /* JADX INFO: renamed from: ܶ֫ */
    public boolean f43857;

    /* JADX INFO: renamed from: ܺ֫ */
    public boolean f43858;

    /* JADX INFO: renamed from: ܽ֫ */
    public C0888 f43859;

    /* JADX INFO: renamed from: ܿ֫ */
    public int f43860;

    /* JADX INFO: renamed from: ᩳ֫ */
    public int f43861;

    /* JADX INFO: renamed from: ᩴ֫ */
    public float f43862;

    /* JADX INFO: renamed from: ᩵֫ */
    public C3831 f43863;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f43864;

    /* JADX INFO: renamed from: ᩶֫ */
    public int f43865;

    /* JADX INFO: renamed from: ᩷֫ */
    public int f43866;

    /* JADX INFO: renamed from: ᩸ */
    public C14690 f43867;

    /* JADX INFO: renamed from: ᩸֫ */
    public boolean f43868;

    /* JADX INFO: renamed from: ᩹ */
    public BitmapDrawable f43869;

    /* JADX INFO: renamed from: ᩹֫ */
    public C17226 f43870;

    /* JADX INFO: renamed from: ᩺ */
    public C14690 f43871;

    /* JADX INFO: renamed from: ᩻֫ */
    public boolean f43872;

    public C15360(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43866 = 0;
        this.f43835 = 0;
        this.f43832 = 0;
        this.f43844 = 5.0f;
        this.f43838 = new C21397();
        this.f43863 = new C3831();
        this.f43854 = new ArrayList();
        this.f43852 = new ArrayList();
        this.f43849 = 0;
        this.f43872 = true;
        this.f43836 = new Stack();
        this.f43840 = new Stack();
        m34955(context);
    }

    public C15360(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f43866 = 0;
        this.f43835 = 0;
        this.f43832 = 0;
        this.f43844 = 5.0f;
        this.f43838 = new C21397();
        this.f43863 = new C3831();
        this.f43854 = new ArrayList();
        this.f43852 = new ArrayList();
        this.f43849 = 0;
        this.f43872 = true;
        this.f43836 = new Stack();
        this.f43840 = new Stack();
        m34955(context);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m34955(Context context) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f43839 = viewConfiguration.getScaledTouchSlop();
        int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
        int i = scaledDoubleTapSlop * scaledDoubleTapSlop;
        int i2 = (int) ((context.getResources().getDisplayMetrics().density * 8.0f) + 0.5f);
        this.f43865 = i2;
        this.f43861 = i2;
        if (isInEditMode()) {
            Drawable drawable = context.getResources().getDrawable(R.drawable.MT_Protector);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            drawable.setBounds(0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
            drawable.draw(new Canvas(bitmapCreateBitmap));
            m34956(bitmapCreateBitmap);
            this.f43845 = 4.0f;
            this.f43846 = 4.0f;
            this.f43844 = 4.0f;
        }
        Paint.Style style = Paint.Style.FILL;
        C3831 c3831 = this.f43863;
        c3831.setStyle(style);
        c3831.setAntiAlias(false);
        c3831.setFilterBitmap(false);
        C0888 c0888 = new C0888(context, new GestureDetectorOnGestureListenerC13350(this, i));
        this.f43859 = c0888;
        c0888.m5648();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34982(C11193 c11193) {
        m34956(c11193.m25834());
        ArrayList arrayList = this.f43854;
        arrayList.clear();
        ArrayList arrayList2 = this.f43852;
        arrayList2.clear();
        this.f43853 = null;
        this.f43851 = null;
        C14020 c14020M25836 = c11193.m25836();
        if (c14020M25836 != null) {
            Rect rect = c14020M25836.f39536;
            ArrayList<C6644> arrayList3 = c14020M25836.f39538;
            ArrayList<C6644> arrayList4 = c14020M25836.f39537;
            for (C6644 c6644 : arrayList4) {
                arrayList.add(new C14690(c6644.f17145, c6644.f17144, false));
            }
            for (C6644 c6645 : arrayList3) {
                arrayList2.add(new C14690(c6645.f17145, c6645.f17144, true));
            }
            if (!rect.equals(C14020.m31815(arrayList4, arrayList3, this.f43856, this.f43860))) {
                this.f43853 = new C14690(rect.left, this.f43856 - rect.right, false);
                this.f43851 = new C14690(rect.top, this.f43860 - rect.bottom, true);
            }
        }
        C18568 c18568M25835 = c11193.m25835();
        if (c18568M25835 != null) {
            this.f43871 = new C14690(c18568M25835.f55416, this.f43856 - c18568M25835.f55417, false);
            this.f43855 = new C14690(c18568M25835.f55418, this.f43860 - c18568M25835.f55415, true);
        } else {
            this.f43871 = new C14690(0, this.f43856, false);
            this.f43855 = new C14690(0, this.f43860, true);
        }
        invalidate();
    }

    /* JADX INFO: renamed from: ֫ */
    private void m34956(Bitmap bitmap) {
        if (bitmap != null) {
            this.f43856 = bitmap.getWidth();
            this.f43860 = bitmap.getHeight();
            BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), bitmap);
            this.f43869 = bitmapDrawable;
            Paint paint = bitmapDrawable.getPaint();
            paint.setAntiAlias(false);
            paint.setFilterBitmap(false);
            if (getWidth() == 0) {
                this.f43857 = true;
            } else {
                this.f43844 = m34976();
            }
            m34965();
        } else {
            this.f43860 = 100;
            this.f43856 = 100;
            this.f43869 = null;
        }
        invalidate();
    }

    /* JADX INFO: renamed from: ۚ */
    private void m34965() {
        if (this.f43869 == null) {
            return;
        }
        float fMax = Math.max(getWidth() / (this.f43856 + 2.0f), getHeight() / (this.f43860 + 2.0f));
        this.f43846 = fMax;
        if (fMax < 16.0f) {
            this.f43846 = 16.0f;
        }
        float fMin = Math.min(getWidth(), getHeight()) / 5;
        float fMin2 = Math.min(fMin / (this.f43856 + 2.0f), fMin / (this.f43860 + 2.0f));
        this.f43845 = fMin2;
        if (fMin2 > 0.3f) {
            this.f43845 = 0.3f;
        }
        float f = this.f43844;
        float f2 = this.f43846;
        if (f > f2) {
            this.f43844 = f2;
            return;
        }
        float f3 = this.f43845;
        if (f < f3) {
            this.f43844 = f3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩵ */
    public float m34976() {
        float fMin = Math.min((getWidth() - (this.f43861 * 6)) / (this.f43856 + 2.0f), (getHeight() - (this.f43861 * 6)) / (this.f43860 + 2.0f));
        if (fMin > 16.0f) {
            return 16.0f;
        }
        return fMin;
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f43857) {
            this.f43857 = false;
            this.f43844 = m34976();
        }
        m34965();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int iM11484;
        C14690 c14690;
        C14690 c14691;
        C14690 c14692;
        C14690 c14693;
        int i;
        float f;
        float x;
        if (this.f43869 != null) {
            C14690 c14694 = this.f43867;
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.f43831 = 0;
                this.f43848 = false;
                this.f43834 = false;
                if (c14694 != null) {
                    C5303 c5303 = new C5303(this.f43844, this.f43865);
                    if (c14694.f41912) {
                        iM11484 = c5303.m11484(c14694, (motionEvent.getY() + getScrollY()) - ((getHeight() - ((int) ((this.f43860 * this.f43844) + 0.5f))) / 2.0f));
                    } else {
                        iM11484 = c5303.m11484(c14694, (motionEvent.getX() + getScrollX()) - ((getWidth() - ((int) ((this.f43856 * this.f43844) + 0.5f))) / 2.0f));
                    }
                    if (iM11484 != 0) {
                        this.f43843 = motionEvent.getX();
                        this.f43833 = motionEvent.getY();
                        this.f43834 = true;
                        this.f43864 = true;
                        this.f43858 = iM11484 == -1;
                        this.f43868 = false;
                    }
                }
            } else if (actionMasked != 2) {
                if (actionMasked == 5) {
                    this.f43834 = false;
                    this.f43831++;
                    if (!this.f43848) {
                        this.f43837 = m34953(motionEvent);
                        this.f43862 = this.f43844;
                        this.f43848 = true;
                        this.f43868 = false;
                        this.f43843 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                        this.f43833 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                        return true;
                    }
                } else if (actionMasked == 6) {
                    this.f43831--;
                    return true;
                }
            } else {
                if (this.f43831 == 1 && this.f43848) {
                    float fM34953 = m34953(motionEvent);
                    if (!this.f43868) {
                        if (Math.abs(fM34953 - this.f43837) > this.f43839) {
                            this.f43868 = true;
                            this.f43859.m5650(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                        }
                    }
                    int width = getWidth() / 2;
                    int height = getHeight() / 2;
                    float f2 = width;
                    float scrollX = ((this.f43843 + getScrollX()) - f2) / this.f43844;
                    float f3 = height;
                    float scrollY = ((this.f43833 + getScrollY()) - f3) / this.f43844;
                    float f4 = (this.f43862 * fM34953) / this.f43837;
                    this.f43844 = f4;
                    float f5 = this.f43846;
                    if (f4 > f5) {
                        this.f43844 = f5;
                    } else {
                        float f6 = this.f43845;
                        if (f4 < f6) {
                            this.f43844 = f6;
                        }
                    }
                    float f7 = this.f43844;
                    scrollTo((int) (((scrollX * f7) - this.f43843) + f2), (int) (((scrollY * f7) - this.f43833) + f3));
                    invalidate();
                    return true;
                }
                if (c14694 != null) {
                    boolean z = c14694.f41912;
                    if (this.f43834) {
                        if (!this.f43868) {
                            int x2 = ((int) this.f43843) - ((int) motionEvent.getX());
                            int y = ((int) this.f43833) - ((int) motionEvent.getY());
                            int i2 = (y * y) + (x2 * x2);
                            int i3 = this.f43839;
                            if (i2 > i3 * i3) {
                                m34952();
                                this.f43868 = true;
                                this.f43859.m5650(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                                if (this.f43858) {
                                    this.f43847 = c14694.f17145;
                                    this.f43850 = 0;
                                    this.f43841 = this.f43849 == 0 ? c14694.f17144 : c14694.f17144 - 1;
                                } else {
                                    this.f43847 = c14694.f17144;
                                    this.f43850 = this.f43849 == 0 ? c14694.f17145 : c14694.f17145 + 1;
                                    this.f43841 = z ? this.f43860 : this.f43856;
                                }
                            }
                        } else {
                            if (z) {
                                f = this.f43833;
                                x = motionEvent.getY();
                            } else {
                                f = this.f43843;
                                x = motionEvent.getX();
                            }
                            int i4 = this.f43847 - ((int) ((f - x) / this.f43844));
                            int i5 = this.f43841;
                            if (i4 > i5 || i4 < (i5 = this.f43850)) {
                                i4 = i5;
                            }
                            if (this.f43858) {
                                c14694.f17145 = i4;
                            } else {
                                c14694.f17144 = i4;
                            }
                            if (c14694.f17145 == c14694.f17144) {
                                if (this.f43864) {
                                    this.f43864 = false;
                                    performHapticFeedback(0);
                                }
                            } else if (!this.f43864) {
                                this.f43864 = true;
                            }
                            InterfaceC12009 interfaceC12009 = this.f43842;
                            if (interfaceC12009 != null) {
                                interfaceC12009.mo8480(c14694);
                            }
                            invalidate();
                        }
                    }
                }
            }
            if ((!this.f43848 && !this.f43834) || !this.f43868) {
                this.f43859.m5650(motionEvent);
            }
            int actionMasked2 = motionEvent.getActionMasked();
            if (actionMasked2 == 1 || actionMasked2 == 3) {
                if (this.f43834 && c14694 != null) {
                    boolean z2 = c14694.f41912;
                    if (this.f43868) {
                        int i6 = this.f43849;
                        if (i6 == 0) {
                            int i7 = c14694.f17145;
                            int i8 = c14694.f17144;
                            ArrayList arrayList = this.f43854;
                            ArrayList arrayList2 = this.f43852;
                            if (i7 == i8) {
                                if (z2) {
                                    arrayList2.remove(c14694);
                                } else {
                                    arrayList.remove(c14694);
                                }
                                invalidate();
                                m34957((C6644) null);
                            } else {
                                if (z2) {
                                    arrayList = arrayList2;
                                }
                                Iterator it = arrayList.iterator();
                                boolean z3 = false;
                                while (it.hasNext()) {
                                    C14690 c14695 = (C14690) it.next();
                                    if (c14695 != c14694) {
                                        int i9 = c14694.f17145;
                                        int i10 = c14695.f17145;
                                        if (i9 <= i10 && i10 <= (i = c14694.f17144)) {
                                            c14694.f17144 = Math.max(i, c14695.f17144);
                                            it.remove();
                                        } else {
                                            int i11 = c14695.f17144;
                                            if (i9 <= i11 && i11 <= c14694.f17144) {
                                                c14694.f17145 = i10;
                                                it.remove();
                                            }
                                        }
                                        z3 = true;
                                    }
                                }
                                if (z3) {
                                    invalidate();
                                    m34957(c14694);
                                }
                            }
                        } else if (i6 == 1) {
                            C14690 c14696 = this.f43853;
                            if (c14694 == c14696 && (c14693 = this.f43871) != null) {
                                int i12 = c14693.f17145;
                                int i13 = c14696.f17145;
                                if (i12 > i13) {
                                    c14693.f17145 = i13;
                                }
                                int i14 = c14693.f17144;
                                int i15 = c14696.f17144;
                                if (i14 < i15) {
                                    c14693.f17144 = i15;
                                }
                                invalidate();
                            } else {
                                C14690 c14697 = this.f43851;
                                if (c14694 == c14697 && (c14692 = this.f43855) != null) {
                                    int i16 = c14692.f17145;
                                    int i17 = c14697.f17145;
                                    if (i16 > i17) {
                                        c14692.f17145 = i17;
                                    }
                                    int i18 = c14692.f17144;
                                    int i19 = c14697.f17144;
                                    if (i18 < i19) {
                                        c14692.f17144 = i19;
                                    }
                                    invalidate();
                                }
                            }
                        } else if (i6 == 2) {
                            C14690 c14698 = this.f43871;
                            if (c14694 == c14698 && (c14691 = this.f43853) != null) {
                                int i20 = c14698.f17145;
                                int i21 = c14691.f17144;
                                if (i20 >= i21) {
                                    c14691.f17145 = i20;
                                    c14691.f17144 = i20 + 1;
                                } else {
                                    int i22 = c14698.f17144;
                                    int i23 = c14691.f17145;
                                    if (i22 <= i23) {
                                        c14691.f17144 = i22;
                                        c14691.f17145 = i22 - 1;
                                    } else {
                                        if (i20 > i23) {
                                            c14691.f17145 = i20;
                                        }
                                        if (i22 < i21) {
                                            c14691.f17144 = i22;
                                        }
                                    }
                                }
                                invalidate();
                            } else {
                                C14690 c14699 = this.f43855;
                                if (c14694 == c14699 && (c14690 = this.f43851) != null) {
                                    int i24 = c14699.f17145;
                                    int i25 = c14690.f17144;
                                    if (i24 >= i25) {
                                        c14690.f17145 = i24;
                                        c14690.f17144 = i24 + 1;
                                    } else {
                                        int i26 = c14699.f17144;
                                        int i27 = c14690.f17145;
                                        if (i26 <= i27) {
                                            c14690.f17144 = i26;
                                            c14690.f17145 = i26 - 1;
                                        } else {
                                            if (i24 > i27) {
                                                c14690.f17145 = i24;
                                            }
                                            if (i26 < i25) {
                                                c14690.f17144 = i26;
                                            }
                                        }
                                    }
                                    invalidate();
                                }
                            }
                        }
                        m34975();
                    }
                }
                this.f43831 = 0;
                this.f43848 = false;
                this.f43834 = false;
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
        C3831 c3831;
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
        C3831 c3832;
        int i11;
        C3831 c3833;
        int i12;
        int width = getWidth();
        int height = getHeight();
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int i13 = scrollX + width;
        int i14 = scrollY + height;
        float f = this.f43844;
        int i15 = (int) ((this.f43856 * f) + 0.5f);
        int i16 = (int) ((this.f43860 * f) + 0.5f);
        int iMax = Math.max((int) (0.5f + f), 1);
        int i17 = (width / 2) - (i15 / 2);
        int i18 = (height / 2) - (i16 / 2);
        int i19 = i17 + i15;
        int i20 = i18 + i16;
        C21397 c21397 = this.f43838;
        canvas.drawColor(c21397.f67483);
        int i21 = this.f43861;
        int i22 = ((i15 + iMax) + iMax) / i21;
        int i23 = ((i16 + iMax) + iMax) / i21;
        int[] iArr = c21397.f67484;
        C21397 c21398 = c21397;
        int i24 = 0;
        while (true) {
            c3831 = this.f43863;
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
                        c3833 = c3831;
                        i12 = i27;
                    } else {
                        c3831.setColor(iArr[(i24 + i29) % 2]);
                        c3833 = c3831;
                        i11 = i33;
                        i12 = i27;
                        canvas.drawRect(i26, i31, iMin, iMin2, c3833);
                    }
                    i29++;
                    i20 = i11;
                    c3831 = c3833;
                    iMin = iMin;
                    i27 = i12;
                    i23 = i30;
                    iArr = iArr;
                    i21 = i21;
                    i28 = i28;
                    c21398 = c21398;
                    i13 = i32;
                    i26 = i26;
                }
            }
            i24++;
            i19 = i28;
            i20 = i20;
            c21398 = c21398;
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
        C21397 c21399 = c21398;
        C3831 c3834 = c3831;
        int i37 = i19;
        BitmapDrawable bitmapDrawable = this.f43869;
        if (bitmapDrawable != null) {
            i = i36;
            bitmapDrawable.setBounds(i, i18, i37, i34);
            bitmapDrawable.draw(canvas);
        } else {
            i = i36;
        }
        int i38 = c21399.f67488;
        int i39 = c21399.f67487;
        int i40 = c21399.f67485;
        int i41 = this.f43849;
        boolean z = i41 == 0;
        boolean z2 = i41 == 1;
        boolean z3 = i41 == 2;
        boolean z4 = this.f43872;
        C14690 c14690 = this.f43867;
        for (C6644 c6644 : this.f43854) {
            boolean z5 = z4;
            float f2 = i;
            int i42 = i40;
            float f3 = (c6644.f17145 * f) + f2;
            float f4 = (c6644.f17144 * f) + f2;
            C3831 c3835 = c3834;
            c3835.setColor(-16777216);
            C21397 c213910 = c21399;
            float f5 = i18;
            int i43 = scrollX;
            C14690 c14691 = c14690;
            int i44 = i37;
            int i45 = i39;
            int i46 = i;
            int i47 = i38;
            canvas.drawRect(f3, i18 - iMax, f4, f5, c3835);
            if (z && z5) {
                c3835.setColor(i47);
                c3832 = c3835;
                canvas.drawRect(f3, f5, f4, i34, c3835);
                c3832.setColor(c14691 == c6644 ? i42 : i45);
                float f6 = scrollY;
                float f7 = i14;
                canvas.drawRect(f3, f6, f3 + 1.0f, f7, c3832);
                canvas.drawRect(f4 - 1.0f, f6, f4, f7, c3832);
            } else {
                c3832 = c3835;
            }
            i38 = i47;
            i37 = i44;
            z4 = z5;
            i40 = i42;
            i39 = i45;
            i = i46;
            c14690 = c14691;
            scrollX = i43;
            c3834 = c3832;
            c21399 = c213910;
        }
        boolean z6 = z4;
        int i48 = i40;
        int i49 = i39;
        int i50 = i;
        int i51 = scrollX;
        C14690 c14692 = c14690;
        int i52 = i38;
        int i53 = i37;
        C3831 c3836 = c3834;
        C21397 c213911 = c21399;
        Iterator it = this.f43852.iterator();
        while (it.hasNext()) {
            C6644 c6645 = (C6644) it.next();
            float f8 = i18;
            float f9 = (c6645.f17145 * f) + f8;
            float f10 = (c6645.f17144 * f) + f8;
            c3836.setColor(-16777216);
            float f11 = i50 - iMax;
            int i54 = i50;
            float f12 = i54;
            Iterator it2 = it;
            int i55 = i14;
            canvas.drawRect(f11, f9, f12, f10, c3836);
            if (z && z6) {
                c3836.setColor(i52);
                int i56 = i53;
                i10 = i56;
                canvas.drawRect(f12, f9, i56, f10, c3836);
                c3836.setColor(c14692 == c6645 ? i48 : i49);
                i9 = i51;
                float f13 = i9;
                int i57 = i35;
                float f14 = i57;
                i8 = i57;
                canvas.drawRect(f13, f9, f14, f9 + 1.0f, c3836);
                canvas.drawRect(f13, f10 - 1.0f, f14, f10, c3836);
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
                C14690 c14693 = this.f43853;
                if (c14693 != null) {
                    float f15 = i59;
                    float f16 = (c14693.f17145 * f) + f15;
                    float f17 = f15 + (c14693.f17144 * f);
                    float f18 = i18;
                    C14690 c14694 = this.f43851;
                    float f19 = (c14694.f17145 * f) + f18;
                    float f20 = (c14694.f17144 * f) + f18;
                    c3836.setColor(-16777216);
                    i2 = i64;
                    canvas.drawRect(f16, i34, f17, i34 + iMax, c3836);
                    canvas.drawRect(i62, f19, i62 + iMax, f20, c3836);
                    if (z2 && z6) {
                        c3836.setColor(i52);
                        canvas.drawRect(f16, f19, f17, f20, c3836);
                        c3836.setColor(c14692 == this.f43853 ? i48 : i49);
                        int i65 = i63;
                        float f21 = i65;
                        float f22 = f16 + 1.0f;
                        int i66 = i60;
                        float f23 = i66;
                        i3 = i52;
                        i60 = i66;
                        i4 = i65;
                        canvas.drawRect(f16, f21, f22, f23, c3836);
                        canvas.drawRect(f17 - 1.0f, f21, f17, f23, c3836);
                        c3836.setColor(c14692 == this.f43851 ? i48 : i49);
                        float f24 = i61;
                        int i67 = i58;
                        float f25 = i67;
                        i5 = i67;
                        canvas.drawRect(f24, f19, f25, f19 + 1.0f, c3836);
                        canvas.drawRect(f24, f20 - 1.0f, f25, f20, c3836);
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
                C14690 c14695 = this.f43871;
                if (c14695 != null) {
                    float f26 = i59;
                    float f27 = (c14695.f17145 * f) + f26;
                    float f28 = (c14695.f17144 * f) + f26;
                    float f29 = i18;
                    C14690 c14696 = this.f43855;
                    float f30 = (c14696.f17145 * f) + f29;
                    float f31 = (c14696.f17144 * f) + f29;
                    c3836.setColor(-65536);
                    float f32 = i34;
                    float f33 = i34 + iMax;
                    canvas.drawRect(f26, f32, f27, f33, c3836);
                    float f34 = i62;
                    canvas.drawRect(f28, f32, f34, f33, c3836);
                    float f35 = i62 + iMax;
                    canvas.drawRect(f34, f29, f35, f30, c3836);
                    canvas.drawRect(f34, f31, f35, f32, c3836);
                    if (z3 && z6) {
                        c3836.setColor(c213911.f67486);
                        canvas.drawRect(f26, f29, f34, f30, c3836);
                        canvas.drawRect(f26, f31, f34, f32, c3836);
                        canvas.drawRect(f26, f30, f27, f31, c3836);
                        canvas.drawRect(f28, f30, f34, f31, c3836);
                        c3836.setColor(c14692 == this.f43871 ? i48 : i49);
                        float f36 = i4;
                        int i68 = i60;
                        float f37 = i68;
                        i6 = i68;
                        canvas.drawRect(f27, f36, f27 + 1.0f, f37, c3836);
                        canvas.drawRect(f28 - 1.0f, f36, f28, f37, c3836);
                        c3836.setColor(c14692 == this.f43855 ? i48 : i49);
                        float f38 = i61;
                        float f39 = i5;
                        float f40 = f30 + 1.0f;
                        i7 = i5;
                        canvas.drawRect(f38, f30, f39, f40, c3836);
                        canvas.drawRect(f38, f31 - 1.0f, f39, f31, c3836);
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

    /* JADX INFO: renamed from: ֫ */
    public static float m34953(MotionEvent motionEvent) {
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((y * y) + (x * x));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34984(InterfaceC12009 interfaceC12009) {
        this.f43842 = interfaceC12009;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m34957(C6644 c6644) {
        InterfaceC12009 interfaceC12009 = this.f43842;
        if (interfaceC12009 != null) {
            interfaceC12009.mo8483(c6644);
        }
    }

    /* JADX INFO: renamed from: ۖ */
    private void m34963() {
        InterfaceC12009 interfaceC12009 = this.f43842;
        if (interfaceC12009 != null) {
            interfaceC12009.mo8482(!this.f43836.isEmpty(), !this.f43840.isEmpty());
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m34997() {
        return this.f43849;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34980(int i) {
        this.f43849 = i;
        this.f43872 = true;
        this.f43867 = null;
        m34957((C6644) null);
        invalidate();
    }

    /* JADX INFO: renamed from: ᩷ */
    public final boolean m34999() {
        return this.f43872;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m34995(boolean z) {
        this.f43872 = z;
        invalidate();
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m34996() {
        return !this.f43836.isEmpty();
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m34992() {
        return !this.f43840.isEmpty();
    }

    /* JADX INFO: renamed from: ܺ */
    public final void m34994() {
        Stack stack = this.f43836;
        if (stack.isEmpty()) {
            return;
        }
        C17226 c17226 = (C17226) stack.pop();
        m34958(c17226.f51270);
        this.f43840.push(c17226);
        m34963();
    }

    /* JADX INFO: renamed from: ۢ */
    public final void m34989() {
        Stack stack = this.f43840;
        if (stack.isEmpty()) {
            return;
        }
        C17226 c17226 = (C17226) stack.pop();
        m34958(c17226.f51269);
        this.f43836.push(c17226);
        m34963();
    }

    /* JADX INFO: renamed from: ۘ */
    private C10522 m34964() {
        C10522 c10522 = new C10522();
        c10522.f29125 = this.f43849;
        c10522.f29119 = this.f43835;
        ArrayList arrayList = this.f43854;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c10522.f29118.add(((C14690) it.next()).clone());
        }
        ArrayList arrayList2 = this.f43852;
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            c10522.f29124.add(((C14690) it2.next()).clone());
        }
        C14690 c14690 = this.f43853;
        c10522.f29121 = c14690 == null ? null : c14690.clone();
        C14690 c14691 = this.f43851;
        c10522.f29123 = c14691 == null ? null : c14691.clone();
        C14690 c14692 = this.f43871;
        c10522.f29122 = c14692 == null ? null : c14692.clone();
        C14690 c14693 = this.f43855;
        c10522.f29120 = c14693 != null ? c14693.clone() : null;
        C14690 c14694 = this.f43867;
        if (c14694 != null) {
            int i = this.f43849;
            if (i == 0) {
                int iIndexOf = arrayList.indexOf(c14694);
                if (iIndexOf == -1 && (iIndexOf = arrayList2.indexOf(this.f43867)) != -1) {
                    iIndexOf += arrayList.size();
                }
                c10522.f29117 = iIndexOf;
            } else {
                if (i == 1) {
                    if (c14694 == this.f43853) {
                        c10522.f29117 = 0;
                        return c10522;
                    }
                    if (c14694 == this.f43851) {
                        c10522.f29117 = 1;
                        return c10522;
                    }
                    c10522.f29117 = -1;
                    return c10522;
                }
                if (i == 2) {
                    if (c14694 == this.f43871) {
                        c10522.f29117 = 0;
                        return c10522;
                    }
                    if (c14694 == this.f43855) {
                        c10522.f29117 = 1;
                        return c10522;
                    }
                    c10522.f29117 = -1;
                    return c10522;
                }
            }
        }
        return c10522;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m34958(C10522 c10522) {
        ArrayList arrayList = this.f43854;
        arrayList.clear();
        ArrayList arrayList2 = this.f43852;
        arrayList2.clear();
        Iterator it = c10522.f29118.iterator();
        while (it.hasNext()) {
            arrayList.add(((C14690) it.next()).clone());
        }
        Iterator it2 = c10522.f29124.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((C14690) it2.next()).clone());
        }
        C14690 c14690 = c10522.f29121;
        this.f43853 = c14690 == null ? null : c14690.clone();
        C14690 c14691 = c10522.f29123;
        this.f43851 = c14691 == null ? null : c14691.clone();
        C14690 c14692 = c10522.f29122;
        this.f43871 = c14692 == null ? null : c14692.clone();
        C14690 c14693 = c10522.f29120;
        C14690 c14690Clone = c14693 == null ? null : c14693.clone();
        this.f43855 = c14690Clone;
        int i = c10522.f29117;
        if (i == -1) {
            this.f43867 = null;
        } else {
            int i2 = c10522.f29125;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        if (i == 0) {
                            this.f43867 = this.f43871;
                        } else if (i == 1) {
                            this.f43867 = c14690Clone;
                        } else {
                            this.f43867 = null;
                        }
                    }
                } else if (i == 0) {
                    this.f43867 = this.f43853;
                } else if (i == 1) {
                    this.f43867 = this.f43851;
                } else {
                    this.f43867 = null;
                }
            } else if (i < arrayList.size()) {
                this.f43867 = (C14690) arrayList.get(i);
            } else {
                int size = i - arrayList.size();
                if (size < arrayList2.size()) {
                    this.f43867 = (C14690) arrayList2.get(size);
                } else {
                    this.f43867 = null;
                }
            }
        }
        int i3 = c10522.f29125;
        if (i3 != this.f43849) {
            this.f43849 = i3;
            InterfaceC12009 interfaceC12009 = this.f43842;
            if (interfaceC12009 != null) {
                interfaceC12009.mo8479(i3);
            }
        }
        int i4 = c10522.f29119;
        if (i4 != this.f43835) {
            this.f43835 = i4;
            InterfaceC12009 interfaceC120010 = this.f43842;
            if (interfaceC120010 != null) {
                interfaceC120010.mo8481(m34987());
            }
        }
        m34957(this.f43867);
        this.f43872 = true;
        invalidate();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34983(C11996 c11996) {
        c11996.writeInt(1901228945);
        c11996.writeInt(this.f43866);
        c11996.writeInt(this.f43832);
        m34964().m24256(c11996);
        Stack<C17226> stack = this.f43836;
        c11996.mo15113(stack.size());
        for (C17226 c17226 : stack) {
            c17226.f51270.m24256(c11996);
            c17226.f51269.m24256(c11996);
        }
        Stack<C17226> stack2 = this.f43840;
        c11996.mo15113(stack2.size());
        for (C17226 c17227 : stack2) {
            c17227.f51270.m24256(c11996);
            c17227.f51269.m24256(c11996);
        }
        c11996.writeInt(1901228945);
        c11996.writeInt(getScrollX());
        c11996.writeInt(getScrollY());
        c11996.m27439(this.f43844);
        c11996.m27445(this.f43872);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34985(C14677 c14677) {
        try {
            C23395.m52060((InterfaceC21384) c14677, 1901228945);
            this.f43866 = c14677.readInt();
            this.f43832 = c14677.readInt();
            C10522 c10522 = new C10522();
            c10522.m24257(c14677);
            m34958(c10522);
            int iM33581 = c14677.m33581();
            Stack stack = this.f43836;
            stack.clear();
            for (int i = 0; i < iM33581; i++) {
                C17226 c17226 = new C17226();
                C10522 c10523 = new C10522();
                c10523.m24257(c14677);
                c17226.f51270 = c10523;
                C10522 c10524 = new C10522();
                c10524.m24257(c14677);
                c17226.f51269 = c10524;
                stack.add(c17226);
            }
            int iM33582 = c14677.m33581();
            Stack stack2 = this.f43840;
            stack2.clear();
            for (int i2 = 0; i2 < iM33582; i2++) {
                C17226 c17227 = new C17226();
                C10522 c10525 = new C10522();
                c10525.m24257(c14677);
                c17227.f51270 = c10525;
                C10522 c10526 = new C10522();
                c10526.m24257(c14677);
                c17227.f51269 = c10526;
                stack2.add(c17227);
            }
            m34963();
            try {
                C23395.m52060((InterfaceC21384) c14677, 1901228945);
                scrollTo(c14677.readInt(), c14677.readInt());
                this.f43844 = c14677.m33582();
                this.f43857 = false;
                this.f43872 = c14677.m33585();
                invalidate();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX INFO: renamed from: ֡ */
    private void m34952() {
        C17226 c17226 = new C17226();
        this.f43870 = c17226;
        c17226.f51270 = m34964();
    }

    /* JADX INFO: renamed from: ᩴ */
    private void m34975() {
        int i = this.f43866 + 1;
        this.f43866 = i;
        this.f43835 = i;
        InterfaceC12009 interfaceC12009 = this.f43842;
        if (interfaceC12009 != null) {
            interfaceC12009.mo8481(m34987());
        }
        C17226 c17226 = this.f43870;
        if (c17226 != null) {
            c17226.f51269 = m34964();
            this.f43836.push(this.f43870);
            this.f43840.clear();
            this.f43870 = null;
            m34963();
        }
    }

    /* JADX INFO: renamed from: ۜ */
    public final boolean m34987() {
        return this.f43832 != this.f43835;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m34991(boolean z) {
        int i;
        if (z) {
            int i2 = this.f43866 + 1;
            this.f43866 = i2;
            i = -i2;
        } else {
            i = this.f43835;
        }
        this.f43832 = i;
        InterfaceC12009 interfaceC12009 = this.f43842;
        if (interfaceC12009 != null) {
            interfaceC12009.mo8481(m34987());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34981(String str) {
        C17897 c17897M43817 = C19239.m43817(this.f43856, this.f43860, str);
        C14690 c14690 = this.f43853;
        C14690 c14691 = this.f43851;
        C14690 c14692 = this.f43871;
        C14690 c14693 = this.f43855;
        int i = this.f43856;
        int i2 = this.f43860;
        ArrayList arrayList = this.f43854;
        ArrayList arrayList2 = this.f43852;
        if (new C17897(arrayList, arrayList2, c14690, c14691, c14692, c14693, i, i2).m40698(c17897M43817)) {
            return;
        }
        m34952();
        arrayList.clear();
        for (C6644 c6644 : c17897M43817.f53475) {
            arrayList.add(new C14690(c6644.f17145, c6644.f17144, false));
        }
        arrayList2.clear();
        for (C6644 c6645 : c17897M43817.f53473) {
            arrayList2.add(new C14690(c6645.f17145, c6645.f17144, true));
        }
        C6644 c6646 = c17897M43817.f53471;
        if (c6646 == null) {
            this.f43851 = null;
            this.f43853 = null;
        } else {
            this.f43853 = new C14690(c6646.f17145, c6646.f17144, false);
            C6644 c6647 = c17897M43817.f53472;
            this.f43851 = new C14690(c6647.f17145, c6647.f17144, true);
        }
        C6644 c6648 = c17897M43817.f53474;
        this.f43871 = new C14690(c6648.f17145, c6648.f17144, false);
        C6644 c6649 = c17897M43817.f53476;
        this.f43855 = new C14690(c6649.f17145, c6649.f17144, true);
        this.f43867 = null;
        this.f43872 = true;
        m34975();
        m34957((C6644) null);
        invalidate();
    }

    /* JADX INFO: renamed from: ܳ */
    public final String m34993() {
        return C19239.m43813(new C17897(this.f43854, this.f43852, this.f43853, this.f43851, this.f43871, this.f43855, this.f43856, this.f43860), this.f43856, this.f43860);
    }

    /* JADX INFO: renamed from: ᩻ */
    public final boolean m35000() {
        return this.f43853 != null;
    }

    /* JADX INFO: renamed from: ۡ */
    public final void m34988() {
        m34952();
        this.f43851 = null;
        this.f43853 = null;
        m34975();
        invalidate();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34979() {
        if (m35000()) {
            return;
        }
        m34952();
        C14690 c14690 = this.f43871;
        this.f43853 = c14690 != null ? c14690.clone() : new C14690(0, this.f43856, false);
        C14690 c14691 = this.f43855;
        this.f43851 = c14691 != null ? c14691.clone() : new C14690(0, this.f43860, true);
        m34975();
        invalidate();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m34990(C11193 c11193) {
        C14020 c14020 = new C14020();
        ArrayList<C14690> arrayList = this.f43854;
        for (C14690 c14690 : arrayList) {
            c14020.f39537.add(new C6644(c14690.f17145, c14690.f17144));
        }
        ArrayList<C14690> arrayList2 = this.f43852;
        for (C14690 c14691 : arrayList2) {
            c14020.f39538.add(new C6644(c14691.f17145, c14691.f17144));
        }
        C14690 c14692 = this.f43853;
        if (c14692 != null) {
            Rect rect = c14020.f39536;
            rect.left = c14692.f17145;
            rect.right = this.f43856 - c14692.f17144;
            C14690 c14693 = this.f43851;
            rect.top = c14693.f17145;
            rect.bottom = this.f43860 - c14693.f17144;
        } else {
            c14020.f39536.set(C14020.m31815(arrayList, arrayList2, this.f43856, this.f43860));
        }
        c11193.m25829(c14020);
        if (this.f43871 != null) {
            C18568 c18568 = new C18568();
            C14690 c14694 = this.f43871;
            c18568.f55416 = c14694.f17145;
            c18568.f55417 = this.f43856 - c14694.f17144;
            C14690 c14695 = this.f43855;
            c18568.f55418 = c14695.f17145;
            c18568.f55415 = this.f43860 - c14695.f17144;
            c11193.m25830(c18568);
            return;
        }
        c11193.m25830((C18568) null);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34986(boolean z) {
        ArrayList arrayList = z ? this.f43852 : this.f43854;
        C14690 c14690 = new C14690(z);
        int i = z ? this.f43860 : this.f43856;
        int i2 = 0;
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == 1) {
                C14690 c14691 = (C14690) arrayList.get(0);
                int i3 = c14691.f17145;
                int i4 = c14691.f17144;
                if (i3 >= i - i4) {
                    i = i3 - 1;
                } else {
                    i2 = i4 + 1;
                }
            } else {
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    C14690 c14692 = (C14690) arrayList.get(i5);
                    if (i5 == 0) {
                        arrayList2.add(new C24078(0, c14692.f17145 - 1));
                    } else if (i5 == size - 1) {
                        arrayList2.add(new C24078(c14692.f17144 + 1, i));
                    } else {
                        arrayList2.add(new C24078(((C14690) arrayList.get(i5 - 1)).f17144 + 1, c14692.f17145 - 1));
                    }
                }
                Collections.sort(arrayList2);
                C24078 c24078 = (C24078) arrayList2.get(0);
                i2 = c24078.f76458;
                i = c24078.f76457;
            }
        }
        int i6 = i - i2;
        if (i6 <= 0) {
            C22682.m50793(R.string.MT_Protector);
            return;
        }
        int i7 = (int) (getContext().getResources().getDisplayMetrics().density * 16.0f);
        if (i6 > i7) {
            int i8 = (i6 - i7) / 2;
            i -= i8;
            i2 += i8;
        }
        c14690.f17145 = i2;
        c14690.f17144 = i;
        m34952();
        arrayList.add(c14690);
        Collections.sort(arrayList);
        m34975();
        invalidate();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m34998() {
        Stack stack = this.f43836;
        boolean zIsEmpty = stack.isEmpty();
        Stack stack2 = this.f43840;
        if (zIsEmpty && stack2.isEmpty()) {
            return;
        }
        stack.clear();
        stack2.clear();
        m34963();
    }
}
