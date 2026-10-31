package l;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;

/* JADX INFO: renamed from: l.ۢ۫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8539 */
/* JADX INFO: loaded from: classes3.dex */
public class C9586 extends AbstractC17366 implements InterfaceC8194 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f29085;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C10997 f29086;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public AbstractC2262 f29087;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public BitSet f29088;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f29089;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f29090;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f29091;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Runnable f29094;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C10729 f29095;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C20875[] f29096;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int[] f29097;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f29098;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f29099;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f29100;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f29101;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public AbstractC2262 f29102;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C6763 f29103;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Rect f29104;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C14523 f29105;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f29084 = false;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f29093 = -1;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f29092 = Integer.MIN_VALUE;

    public C9586(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f29091 = -1;
        this.f29101 = false;
        C14523 c14523 = new C14523();
        this.f29105 = c14523;
        this.f29098 = 2;
        this.f29104 = new Rect();
        this.f29086 = new C10997(this);
        this.f29085 = true;
        this.f29094 = new RunnableC1824(this);
        C18072 c18072M40694 = AbstractC17366.m40694(context, attributeSet, i, i2);
        int i3 = c18072M40694.f56290;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        assertNotInLayoutOrScroll(null);
        if (i3 != this.f29090) {
            this.f29090 = i3;
            AbstractC2262 abstractC2262 = this.f29087;
            this.f29087 = this.f29102;
            this.f29102 = abstractC2262;
            requestLayout();
        }
        int i4 = c18072M40694.f56292;
        assertNotInLayoutOrScroll(null);
        if (i4 != this.f29091) {
            c14523.m34671();
            requestLayout();
            this.f29091 = i4;
            this.f29088 = new BitSet(this.f29091);
            this.f29096 = new C20875[this.f29091];
            for (int i5 = 0; i5 < this.f29091; i5++) {
                this.f29096[i5] = new C20875(this, i5);
            }
            requestLayout();
        }
        boolean z = c18072M40694.f56291;
        assertNotInLayoutOrScroll(null);
        C6763 c6763 = this.f29103;
        if (c6763 != null && c6763.f21002 != z) {
            c6763.f21002 = z;
        }
        this.f29101 = z;
        requestLayout();
        C10729 c10729 = new C10729();
        c10729.f32325 = true;
        c10729.f32318 = 0;
        c10729.f32321 = 0;
        this.f29095 = c10729;
        this.f29087 = AbstractC2262.m7471(this, this.f29090);
        this.f29102 = AbstractC2262.m7471(this, 1 - this.f29090);
    }

    @Override // l.AbstractC17366
    public final boolean isAutoMeasureEnabled() {
        return this.f29098 != 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m24525() {
        int iM24526;
        if (getChildCount() != 0 && this.f29098 != 0 && isAttachedToWindow()) {
            if (this.f29084) {
                iM24526 = m24528();
                m24526();
            } else {
                iM24526 = m24526();
                m24528();
            }
            if (iM24526 == 0 && m24529() != null) {
                this.f29105.m34671();
                requestSimpleAnimationsInNextLayout();
                requestLayout();
                return true;
            }
        }
        return false;
    }

    @Override // l.AbstractC17366
    public final void onScrollStateChanged(int i) {
        if (i == 0) {
            m24525();
        }
    }

    @Override // l.AbstractC17366
    public final void onDetachedFromWindow(C13132 c13132, C2550 c2550) {
        super.onDetachedFromWindow(c13132, c2550);
        removeCallbacks(this.f29094);
        for (int i = 0; i < this.f29091; i++) {
            this.f29096[i].m47704();
        }
        c13132.requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x002c A[SYNTHETIC] */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final View m24529() {
        boolean z;
        boolean z2;
        int childCount = getChildCount();
        int i = childCount - 1;
        BitSet bitSet = new BitSet(this.f29091);
        bitSet.set(0, this.f29091, true);
        byte b = (this.f29090 == 1 && isLayoutRTL()) ? (byte) 1 : (byte) -1;
        if (this.f29084) {
            childCount = -1;
        } else {
            i = 0;
        }
        int i2 = i < childCount ? 1 : -1;
        while (i != childCount) {
            View childAt = getChildAt(i);
            C16640 c16640 = (C16640) childAt.getLayoutParams();
            if (bitSet.get(c16640.f51098.f67556)) {
                C20875 c20875 = c16640.f51098;
                if (this.f29084) {
                    int i3 = c20875.f67551;
                    if (i3 == Integer.MIN_VALUE) {
                        c20875.m47701();
                        i3 = c20875.f67551;
                    }
                    if (i3 < this.f29087.mo7476()) {
                        ((C16640) ((View) C18566.m43105(c20875.f67555, 1)).getLayoutParams()).getClass();
                        return childAt;
                    }
                } else {
                    int i4 = c20875.f67552;
                    ArrayList arrayList = c20875.f67555;
                    if (i4 == Integer.MIN_VALUE) {
                        View view = (View) arrayList.get(0);
                        C16640 c16641 = (C16640) view.getLayoutParams();
                        c20875.f67552 = c20875.f67553.f29087.mo7485(view);
                        c16641.getClass();
                        i4 = c20875.f67552;
                    }
                    if (i4 > this.f29087.mo7478()) {
                        ((C16640) ((View) arrayList.get(0)).getLayoutParams()).getClass();
                        return childAt;
                    }
                }
                bitSet.clear(c16640.f51098.f67556);
            }
            i += i2;
            if (i != childCount) {
                View childAt2 = getChildAt(i);
                if (this.f29084) {
                    int iMo7473 = this.f29087.mo7473(childAt);
                    int iMo7474 = this.f29087.mo7473(childAt2);
                    if (iMo7473 >= iMo7474) {
                        if (iMo7473 == iMo7474) {
                            if (c16640.f51098.f67556 - ((C16640) childAt2.getLayoutParams()).f51098.f67556 < 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (b < 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z != z2) {
                            }
                        } else {
                            continue;
                        }
                    }
                    return childAt;
                }
                int iMo7485 = this.f29087.mo7485(childAt);
                int iMo7486 = this.f29087.mo7485(childAt2);
                if (iMo7485 <= iMo7486) {
                    if (iMo7485 == iMo7486) {
                        if (c16640.f51098.f67556 - ((C16640) childAt2.getLayoutParams()).f51098.f67556 < 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (b < 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z != z2) {
                        }
                    } else {
                        continue;
                    }
                }
                return childAt;
            }
        }
        return null;
    }

    @Override // l.AbstractC17366
    public final void assertNotInLayoutOrScroll(String str) {
        if (this.f29103 == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m24520() {
        if (this.f29090 == 1 || !isLayoutRTL()) {
            this.f29084 = this.f29101;
        } else {
            this.f29084 = !this.f29101;
        }
    }

    public final boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    @Override // l.AbstractC17366
    public final void setMeasuredDimension(Rect rect, int i, int i2) {
        int iM40691;
        int iM40692;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.f29090 == 1) {
            iM40692 = AbstractC17366.m40691(i2, rect.height() + paddingBottom, getMinimumHeight());
            iM40691 = AbstractC17366.m40691(i, (this.f29089 * this.f29091) + paddingRight, getMinimumWidth());
        } else {
            iM40691 = AbstractC17366.m40691(i, rect.width() + paddingRight, getMinimumWidth());
            iM40692 = AbstractC17366.m40691(i2, (this.f29089 * this.f29091) + paddingBottom, getMinimumHeight());
        }
        setMeasuredDimension(iM40691, iM40692);
    }

    @Override // l.AbstractC17366
    public final void onLayoutChildren(C2550 c2550, C21600 c21600) {
        m24518(c2550, c21600, true);
    }

    @Override // l.AbstractC17366
    public final void onAdapterChanged(AbstractC19902 abstractC19902, AbstractC19902 abstractC19903) {
        this.f29105.m34671();
        for (int i = 0; i < this.f29091; i++) {
            this.f29096[i].m47704();
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:109:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:123:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:125:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:130:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:132:0x0206  */
    /* JADX WARN: Code duplicated, block: B:251:0x0416  */
    /* JADX WARN: Code duplicated, block: B:262:0x0217 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:266:0x0217 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m24518(C2550 c2550, C21600 c21600, boolean z) {
        boolean z2;
        C6763 c6763;
        int childCount;
        int i;
        int position;
        int position2;
        int childCount2;
        int i2;
        boolean z3;
        C6763 c6764 = this.f29103;
        C10997 c10997 = this.f29086;
        if (!(c6764 == null && this.f29093 == -1) && c21600.m48777() == 0) {
            removeAndRecycleAllViews(c2550);
            c10997.m27306();
            return;
        }
        boolean z4 = c10997.f33066;
        C9586 c9586 = c10997.f33070;
        boolean z5 = (z4 && this.f29093 == -1 && this.f29103 == null) ? false : true;
        C14523 c14523 = this.f29105;
        if (z5) {
            c10997.m27306();
            C6763 c6765 = this.f29103;
            if (c6765 != null) {
                int i3 = c6765.f21004;
                if (i3 > 0) {
                    if (i3 == this.f29091) {
                        for (int i4 = 0; i4 < this.f29091; i4++) {
                            this.f29096[i4].m47704();
                            C6763 c6766 = this.f29103;
                            int iMo7476 = c6766.f21005[i4];
                            if (iMo7476 != Integer.MIN_VALUE) {
                                iMo7476 += c6766.f21010 ? this.f29087.mo7476() : this.f29087.mo7478();
                            }
                            C20875 c20875 = this.f29096[i4];
                            c20875.f67552 = iMo7476;
                            c20875.f67551 = iMo7476;
                        }
                    } else {
                        c6765.f21005 = null;
                        c6765.f21004 = 0;
                        c6765.f21007 = 0;
                        c6765.f21008 = null;
                        c6765.f21009 = null;
                        c6765.f21011 = c6765.f21006;
                    }
                }
                C6763 c6767 = this.f29103;
                this.f29099 = c6767.f21003;
                boolean z6 = c6767.f21002;
                assertNotInLayoutOrScroll(null);
                C6763 c6768 = this.f29103;
                if (c6768 != null && c6768.f21002 != z6) {
                    c6768.f21002 = z6;
                }
                this.f29101 = z6;
                requestLayout();
                m24520();
                C6763 c6769 = this.f29103;
                int i5 = c6769.f21011;
                if (i5 != -1) {
                    this.f29093 = i5;
                    c10997.f33065 = c6769.f21010;
                } else {
                    c10997.f33065 = this.f29084;
                }
                if (c6769.f21007 > 1) {
                    c14523.f44508 = c6769.f21008;
                    c14523.f44509 = c6769.f21009;
                }
            } else {
                m24520();
                c10997.f33065 = this.f29084;
            }
            if (c21600.f69359 || (i2 = this.f29093) == -1) {
                if (this.f29100) {
                    int iM48777 = c21600.m48777();
                    childCount2 = getChildCount() - 1;
                    while (true) {
                        if (childCount2 < 0) {
                            position2 = 0;
                            break;
                        }
                        position2 = getPosition(getChildAt(childCount2));
                        if (position2 < 0 && position2 < iM48777) {
                            break;
                        } else {
                            childCount2--;
                        }
                    }
                } else {
                    int iM48778 = c21600.m48777();
                    childCount = getChildCount();
                    i = 0;
                    while (true) {
                        if (i >= childCount) {
                            position2 = 0;
                            break;
                        }
                        position = getPosition(getChildAt(i));
                        if (position < 0 && position < iM48778) {
                            position2 = position;
                            break;
                        }
                        i++;
                    }
                }
                c10997.f33069 = position2;
                c10997.f33067 = Integer.MIN_VALUE;
            } else if (i2 < 0 || i2 >= c21600.m48777()) {
                this.f29093 = -1;
                this.f29092 = Integer.MIN_VALUE;
                if (this.f29100) {
                    int iM48779 = c21600.m48777();
                    childCount2 = getChildCount() - 1;
                    while (true) {
                        if (childCount2 < 0) {
                            position2 = 0;
                            break;
                        } else {
                            position2 = getPosition(getChildAt(childCount2));
                            if (position2 < 0) {
                            }
                            childCount2--;
                        }
                    }
                } else {
                    int iM487710 = c21600.m48777();
                    childCount = getChildCount();
                    i = 0;
                    while (true) {
                        if (i >= childCount) {
                            position2 = 0;
                            break;
                        } else {
                            position = getPosition(getChildAt(i));
                            if (position < 0) {
                            }
                            i++;
                        }
                    }
                }
                c10997.f33069 = position2;
                c10997.f33067 = Integer.MIN_VALUE;
            } else {
                C6763 c67610 = this.f29103;
                if (c67610 == null || c67610.f21011 == -1 || c67610.f21004 < 1) {
                    View viewFindViewByPosition = findViewByPosition(this.f29093);
                    if (viewFindViewByPosition != null) {
                        c10997.f33069 = this.f29084 ? m24528() : m24526();
                        if (this.f29092 != Integer.MIN_VALUE) {
                            if (c10997.f33065) {
                                c10997.f33067 = (this.f29087.mo7476() - this.f29092) - this.f29087.mo7473(viewFindViewByPosition);
                            } else {
                                c10997.f33067 = (this.f29087.mo7478() + this.f29092) - this.f29087.mo7485(viewFindViewByPosition);
                            }
                        } else if (this.f29087.mo7477(viewFindViewByPosition) > this.f29087.mo7487()) {
                            c10997.f33067 = c10997.f33065 ? this.f29087.mo7476() : this.f29087.mo7478();
                        } else {
                            int iMo7485 = this.f29087.mo7485(viewFindViewByPosition) - this.f29087.mo7478();
                            if (iMo7485 < 0) {
                                c10997.f33067 = -iMo7485;
                            } else {
                                int iMo7477 = this.f29087.mo7476() - this.f29087.mo7473(viewFindViewByPosition);
                                if (iMo7477 < 0) {
                                    c10997.f33067 = iMo7477;
                                } else {
                                    c10997.f33067 = Integer.MIN_VALUE;
                                }
                            }
                        }
                    } else {
                        int i6 = this.f29093;
                        c10997.f33069 = i6;
                        int i7 = this.f29092;
                        if (i7 == Integer.MIN_VALUE) {
                            if (getChildCount() != 0) {
                                if ((i6 < m24526()) != this.f29084) {
                                    z3 = false;
                                } else {
                                    z3 = true;
                                }
                            } else if (this.f29084) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            c10997.f33065 = z3;
                            c10997.f33067 = z3 ? c9586.f29087.mo7476() : c9586.f29087.mo7478();
                        } else if (c10997.f33065) {
                            c10997.f33067 = c9586.f29087.mo7476() - i7;
                        } else {
                            c10997.f33067 = c9586.f29087.mo7478() + i7;
                        }
                        c10997.f33064 = true;
                    }
                } else {
                    c10997.f33067 = Integer.MIN_VALUE;
                    c10997.f33069 = this.f29093;
                }
            }
            c10997.f33066 = true;
        }
        if (this.f29103 == null && this.f29093 == -1 && (c10997.f33065 != this.f29100 || isLayoutRTL() != this.f29099)) {
            c14523.m34671();
            c10997.f33064 = true;
        }
        if (getChildCount() > 0 && ((c6763 = this.f29103) == null || c6763.f21004 < 1)) {
            if (c10997.f33064) {
                for (int i8 = 0; i8 < this.f29091; i8++) {
                    this.f29096[i8].m47704();
                    int i9 = c10997.f33067;
                    if (i9 != Integer.MIN_VALUE) {
                        C20875 c20876 = this.f29096[i8];
                        c20876.f67552 = i9;
                        c20876.f67551 = i9;
                    }
                }
            } else if (z5 || c10997.f33068 == null) {
                for (int i10 = 0; i10 < this.f29091; i10++) {
                    C20875 c20877 = this.f29096[i10];
                    boolean z7 = this.f29084;
                    int i11 = c10997.f33067;
                    C9586 c9587 = c20877.f67553;
                    int iM47699 = z7 ? c20877.m47699(Integer.MIN_VALUE) : c20877.m47702(Integer.MIN_VALUE);
                    c20877.m47704();
                    if (iM47699 != Integer.MIN_VALUE && ((!z7 || iM47699 >= c9587.f29087.mo7476()) && (z7 || iM47699 <= c9587.f29087.mo7478()))) {
                        if (i11 != Integer.MIN_VALUE) {
                            iM47699 += i11;
                        }
                        c20877.f67551 = iM47699;
                        c20877.f67552 = iM47699;
                    }
                }
                C20875[] c20875Arr = this.f29096;
                int length = c20875Arr.length;
                int[] iArr = c10997.f33068;
                if (iArr == null || iArr.length < length) {
                    c10997.f33068 = new int[c9586.f29096.length];
                }
                for (int i12 = 0; i12 < length; i12++) {
                    c10997.f33068[i12] = c20875Arr[i12].m47702(Integer.MIN_VALUE);
                }
            } else {
                for (int i13 = 0; i13 < this.f29091; i13++) {
                    C20875 c20878 = this.f29096[i13];
                    c20878.m47704();
                    int i14 = c10997.f33068[i13];
                    c20878.f67552 = i14;
                    c20878.f67551 = i14;
                }
            }
        }
        detachAndScrapAttachedViews(c2550);
        C10729 c10729 = this.f29095;
        c10729.f32325 = false;
        int iMo7487 = this.f29102.mo7487();
        this.f29089 = iMo7487 / this.f29091;
        View.MeasureSpec.makeMeasureSpec(iMo7487, this.f29102.mo7484());
        m24514(c10997.f33069, c21600);
        if (c10997.f33065) {
            m24522(-1);
            m24506(c2550, c10729, c21600);
            m24522(1);
            c10729.f32319 = c10997.f33069 + c10729.f32322;
            m24506(c2550, c10729, c21600);
        } else {
            m24522(1);
            m24506(c2550, c10729, c21600);
            m24522(-1);
            c10729.f32319 = c10997.f33069 + c10729.f32322;
            m24506(c2550, c10729, c21600);
        }
        if (this.f29102.mo7484() != 1073741824) {
            int childCount3 = getChildCount();
            float fMax = 0.0f;
            for (int i15 = 0; i15 < childCount3; i15++) {
                View childAt = getChildAt(i15);
                float fMo7477 = this.f29102.mo7477(childAt);
                if (fMo7477 >= fMax) {
                    ((C16640) childAt.getLayoutParams()).getClass();
                    fMax = Math.max(fMax, fMo7477);
                }
            }
            int i16 = this.f29089;
            int iRound = Math.round(fMax * this.f29091);
            if (this.f29102.mo7484() == Integer.MIN_VALUE) {
                iRound = Math.min(iRound, this.f29102.mo7487());
            }
            this.f29089 = iRound / this.f29091;
            View.MeasureSpec.makeMeasureSpec(iRound, this.f29102.mo7484());
            if (this.f29089 != i16) {
                for (int i17 = 0; i17 < childCount3; i17++) {
                    View childAt2 = getChildAt(i17);
                    C16640 c16640 = (C16640) childAt2.getLayoutParams();
                    c16640.getClass();
                    if (isLayoutRTL() && this.f29090 == 1) {
                        int i18 = -((this.f29091 - 1) - c16640.f51098.f67556);
                        childAt2.offsetLeftAndRight((this.f29089 * i18) - (i18 * i16));
                    } else {
                        int i19 = c16640.f51098.f67556;
                        int i20 = this.f29089 * i19;
                        int i21 = i19 * i16;
                        if (this.f29090 == 1) {
                            childAt2.offsetLeftAndRight(i20 - i21);
                        } else {
                            childAt2.offsetTopAndBottom(i20 - i21);
                        }
                    }
                }
            }
        }
        if (getChildCount() > 0) {
            if (this.f29084) {
                m24511(c2550, c21600, true);
                m24516(c2550, c21600, false);
            } else {
                m24516(c2550, c21600, true);
                m24511(c2550, c21600, false);
            }
        }
        if (z && !c21600.f69359 && this.f29098 != 0 && getChildCount() > 0 && m24529() != null) {
            removeCallbacks(this.f29094);
            z2 = m24525();
        }
        if (c21600.f69359) {
            c10997.m27306();
        }
        this.f29100 = c10997.f33065;
        this.f29099 = isLayoutRTL();
        if (z2) {
            c10997.m27306();
            m24518(c2550, c21600, false);
        }
    }

    @Override // l.AbstractC17366
    public final void onLayoutCompleted(C21600 c21600) {
        super.onLayoutCompleted(c21600);
        this.f29093 = -1;
        this.f29092 = Integer.MIN_VALUE;
        this.f29103 = null;
        this.f29086.m27306();
    }

    @Override // l.AbstractC17366
    public final boolean supportsPredictiveItemAnimations() {
        return this.f29103 == null;
    }

    @Override // l.AbstractC17366
    public final int computeHorizontalScrollOffset(C21600 c21600) {
        return m24507(c21600);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m24507(C21600 c21600) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z = !this.f29085;
        return C6077.m16983(c21600, this.f29087, m24527(z), m24523(z), this, this.f29085, this.f29084);
    }

    @Override // l.AbstractC17366
    public final int computeVerticalScrollOffset(C21600 c21600) {
        return m24507(c21600);
    }

    @Override // l.AbstractC17366
    public final int computeHorizontalScrollExtent(C21600 c21600) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z = !this.f29085;
        return C6077.m16982(c21600, this.f29087, m24527(z), m24523(z), this, this.f29085);
    }

    @Override // l.AbstractC17366
    public final int computeVerticalScrollExtent(C21600 c21600) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z = !this.f29085;
        return C6077.m16982(c21600, this.f29087, m24527(z), m24523(z), this, this.f29085);
    }

    @Override // l.AbstractC17366
    public final int computeHorizontalScrollRange(C21600 c21600) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z = !this.f29085;
        return C6077.m16984(c21600, this.f29087, m24527(z), m24523(z), this, this.f29085);
    }

    @Override // l.AbstractC17366
    public final int computeVerticalScrollRange(C21600 c21600) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z = !this.f29085;
        return C6077.m16984(c21600, this.f29087, m24527(z), m24523(z), this, this.f29085);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m24508(View view, int i, int i2) {
        Rect rect = this.f29104;
        calculateItemDecorationsForChild(view, rect);
        C16640 c16640 = (C16640) view.getLayoutParams();
        int iM24521 = m24521(i, ((ViewGroup.MarginLayoutParams) c16640).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) c16640).rightMargin + rect.right);
        int iM24522 = m24521(i2, ((ViewGroup.MarginLayoutParams) c16640).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) c16640).bottomMargin + rect.bottom);
        if (shouldMeasureChild(view, iM24521, iM24522, c16640)) {
            view.measure(iM24521, iM24522);
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static int m24521(int i, int i2, int i3) {
        int mode;
        return (!(i2 == 0 && i3 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // l.AbstractC17366
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof C6763) {
            C6763 c6763 = (C6763) parcelable;
            this.f29103 = c6763;
            if (this.f29093 != -1) {
                c6763.f21011 = -1;
                c6763.f21006 = -1;
                c6763.f21005 = null;
                c6763.f21004 = 0;
                c6763.f21007 = 0;
                c6763.f21008 = null;
                c6763.f21009 = null;
            }
            requestLayout();
        }
    }

    @Override // l.AbstractC17366
    public final Parcelable onSaveInstanceState() {
        int iM47702;
        int iMo7478;
        int[] iArr;
        C6763 c6763 = this.f29103;
        if (c6763 == null) {
            C6763 c6764 = new C6763();
            c6764.f21002 = this.f29101;
            c6764.f21010 = this.f29100;
            c6764.f21003 = this.f29099;
            C14523 c14523 = this.f29105;
            if (c14523 != null && (iArr = c14523.f44508) != null) {
                c6764.f21008 = iArr;
                c6764.f21007 = iArr.length;
                c6764.f21009 = c14523.f44509;
            } else {
                c6764.f21007 = 0;
            }
            if (getChildCount() > 0) {
                c6764.f21011 = this.f29100 ? m24528() : m24526();
                View viewM24523 = this.f29084 ? m24523(true) : m24527(true);
                c6764.f21006 = viewM24523 != null ? getPosition(viewM24523) : -1;
                int i = this.f29091;
                c6764.f21004 = i;
                c6764.f21005 = new int[i];
                for (int i2 = 0; i2 < this.f29091; i2++) {
                    if (this.f29100) {
                        iM47702 = this.f29096[i2].m47699(Integer.MIN_VALUE);
                        if (iM47702 != Integer.MIN_VALUE) {
                            iMo7478 = this.f29087.mo7476();
                            iM47702 -= iMo7478;
                        }
                    } else {
                        iM47702 = this.f29096[i2].m47702(Integer.MIN_VALUE);
                        if (iM47702 != Integer.MIN_VALUE) {
                            iMo7478 = this.f29087.mo7478();
                            iM47702 -= iMo7478;
                        }
                    }
                    c6764.f21005[i2] = iM47702;
                }
                return c6764;
            }
            c6764.f21011 = -1;
            c6764.f21006 = -1;
            c6764.f21004 = 0;
            return c6764;
        }
        C6763 c6765 = new C6763();
        c6765.f21004 = c6763.f21004;
        c6765.f21011 = c6763.f21011;
        c6765.f21006 = c6763.f21006;
        c6765.f21005 = c6763.f21005;
        c6765.f21007 = c6763.f21007;
        c6765.f21008 = c6763.f21008;
        c6765.f21002 = c6763.f21002;
        c6765.f21010 = c6763.f21010;
        c6765.f21003 = c6763.f21003;
        c6765.f21009 = c6763.f21009;
        return c6765;
    }

    @Override // l.AbstractC17366
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            View viewM24527 = m24527(false);
            View viewM24523 = m24523(false);
            if (viewM24527 == null || viewM24523 == null) {
                return;
            }
            int position = getPosition(viewM24527);
            int position2 = getPosition(viewM24523);
            if (position < position2) {
                accessibilityEvent.setFromIndex(position);
                accessibilityEvent.setToIndex(position2);
            } else {
                accessibilityEvent.setFromIndex(position2);
                accessibilityEvent.setToIndex(position);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final View m24527(boolean z) {
        int iMo7478 = this.f29087.mo7478();
        int iMo7476 = this.f29087.mo7476();
        int childCount = getChildCount();
        View view = null;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int iMo7485 = this.f29087.mo7485(childAt);
            if (this.f29087.mo7473(childAt) > iMo7478 && iMo7485 < iMo7476) {
                if (iMo7485 >= iMo7478 || !z) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final View m24523(boolean z) {
        int iMo7478 = this.f29087.mo7478();
        int iMo7476 = this.f29087.mo7476();
        View view = null;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            int iMo7485 = this.f29087.mo7485(childAt);
            int iMo7473 = this.f29087.mo7473(childAt);
            if (iMo7473 > iMo7478 && iMo7485 < iMo7476) {
                if (iMo7473 <= iMo7476 || !z) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m24511(C2550 c2550, C21600 c21600, boolean z) {
        int iMo7476;
        int iM24505 = m24505(Integer.MIN_VALUE);
        if (iM24505 != Integer.MIN_VALUE && (iMo7476 = this.f29087.mo7476() - iM24505) > 0) {
            int i = iMo7476 - (-scrollBy(-iMo7476, c2550, c21600));
            if (!z || i <= 0) {
                return;
            }
            this.f29087.mo7474(i);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m24516(C2550 c2550, C21600 c21600, boolean z) {
        int iMo7478;
        int iM24513 = m24513(Integer.MAX_VALUE);
        if (iM24513 != Integer.MAX_VALUE && (iMo7478 = iM24513 - this.f29087.mo7478()) > 0) {
            int iScrollBy = iMo7478 - scrollBy(iMo7478, c2550, c21600);
            if (!z || iScrollBy <= 0) {
                return;
            }
            this.f29087.mo7474(-iScrollBy);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    /* JADX WARN: Code duplicated, block: B:18:0x0048  */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m24514(int i, C21600 c21600) {
        int iMo7487;
        int i2;
        int iMo7488;
        int i3;
        C10729 c10729 = this.f29095;
        boolean z = false;
        c10729.f32317 = 0;
        c10729.f32319 = i;
        if (isSmoothScrolling() && (i3 = c21600.f69350) != -1) {
            if (this.f29084 == (i3 < i)) {
                iMo7487 = this.f29087.mo7487();
            } else {
                iMo7488 = this.f29087.mo7487();
                i2 = 0;
            }
            if (getClipToPadding()) {
                c10729.f32318 = this.f29087.mo7478() - iMo7488;
                c10729.f32321 = this.f29087.mo7476() + i2;
            } else {
                c10729.f32321 = this.f29087.mo7472() + i2;
                c10729.f32318 = -iMo7488;
            }
            c10729.f32324 = false;
            c10729.f32325 = true;
            if (this.f29087.mo7484() == 0 && this.f29087.mo7472() == 0) {
                z = true;
            }
            c10729.f32323 = z;
        }
        iMo7487 = 0;
        i2 = iMo7487;
        iMo7488 = 0;
        if (getClipToPadding()) {
            c10729.f32318 = this.f29087.mo7478() - iMo7488;
            c10729.f32321 = this.f29087.mo7476() + i2;
        } else {
            c10729.f32321 = this.f29087.mo7472() + i2;
            c10729.f32318 = -iMo7488;
        }
        c10729.f32324 = false;
        c10729.f32325 = true;
        if (this.f29087.mo7484() == 0) {
            z = true;
        }
        c10729.f32323 = z;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m24522(int i) {
        C10729 c10729 = this.f29095;
        c10729.f32320 = i;
        c10729.f32322 = this.f29084 != (i == -1) ? -1 : 1;
    }

    @Override // l.AbstractC17366
    public final void offsetChildrenHorizontal(int i) {
        super.offsetChildrenHorizontal(i);
        for (int i2 = 0; i2 < this.f29091; i2++) {
            C20875 c20875 = this.f29096[i2];
            int i3 = c20875.f67552;
            if (i3 != Integer.MIN_VALUE) {
                c20875.f67552 = i3 + i;
            }
            int i4 = c20875.f67551;
            if (i4 != Integer.MIN_VALUE) {
                c20875.f67551 = i4 + i;
            }
        }
    }

    @Override // l.AbstractC17366
    public final void offsetChildrenVertical(int i) {
        super.offsetChildrenVertical(i);
        for (int i2 = 0; i2 < this.f29091; i2++) {
            C20875 c20875 = this.f29096[i2];
            int i3 = c20875.f67552;
            if (i3 != Integer.MIN_VALUE) {
                c20875.f67552 = i3 + i;
            }
            int i4 = c20875.f67551;
            if (i4 != Integer.MIN_VALUE) {
                c20875.f67551 = i4 + i;
            }
        }
    }

    @Override // l.AbstractC17366
    public final void onItemsRemoved(C13132 c13132, int i, int i2) {
        m24517(i, i2, 2);
    }

    @Override // l.AbstractC17366
    public final void onItemsAdded(C13132 c13132, int i, int i2) {
        m24517(i, i2, 1);
    }

    @Override // l.AbstractC17366
    public final void onItemsChanged(C13132 c13132) {
        this.f29105.m34671();
        requestLayout();
    }

    @Override // l.AbstractC17366
    public final void onItemsMoved(C13132 c13132, int i, int i2, int i3) {
        m24517(i, i2, 8);
    }

    @Override // l.AbstractC17366
    public final void onItemsUpdated(C13132 c13132, int i, int i2, Object obj) {
        m24517(i, i2, 4);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0030 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0033  */
    /* JADX WARN: Code duplicated, block: B:27:0x003b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0048 A[EDGE_INSN: B:30:0x0048->B:31:0x0049 BREAK  A[LOOP:0: B:25:0x0037->B:66:?]] */
    /* JADX WARN: Code duplicated, block: B:32:0x004b  */
    /* JADX WARN: Code duplicated, block: B:35:0x0059  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066 A[LOOP:1: B:34:0x0057->B:38:0x0066, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x007c  */
    /* JADX WARN: Code duplicated, block: B:44:0x007f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0089  */
    /* JADX WARN: Code duplicated, block: B:48:0x009a  */
    /* JADX WARN: Code duplicated, block: B:50:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:64:0x0048 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x006a A[EDGE_INSN: B:68:0x006a->B:40:0x006a BREAK  A[LOOP:1: B:34:0x0057->B:38:0x0066], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m24517(int i, int i2, int i3) {
        int i4;
        int i5;
        C14523 c14523;
        int[] iArr;
        int iM24528;
        ArrayList arrayList;
        int i6;
        C17346 c17346;
        int size;
        int i7;
        int size2;
        int iM24529 = this.f29084 ? m24528() : m24526();
        if (i3 == 8) {
            if (i < i2) {
                i4 = i2 + 1;
            } else {
                i4 = i + 1;
                i5 = i2;
            }
            c14523 = this.f29105;
            iArr = c14523.f44508;
            if (iArr != null && i5 < iArr.length) {
                arrayList = c14523.f44509;
                if (arrayList != null) {
                    if (arrayList == null) {
                        size2 = arrayList.size();
                        do {
                            size2--;
                            if (size2 >= 0) {
                                c17346 = null;
                                break;
                            }
                            c17346 = (C17346) c14523.f44509.get(size2);
                        } while (c17346.f53136 != i5);
                    } else {
                        c17346 = null;
                        break;
                    }
                    if (c17346 != null) {
                        c14523.f44509.remove(c17346);
                    }
                    size = c14523.f44509.size();
                    i7 = 0;
                    while (true) {
                        if (i7 < size) {
                            i7 = -1;
                            break;
                        } else if (((C17346) c14523.f44509.get(i7)).f53136 >= i5) {
                            break;
                        } else {
                            i7++;
                        }
                    }
                    if (i7 != -1) {
                        C17346 c17347 = (C17346) c14523.f44509.get(i7);
                        c14523.f44509.remove(i7);
                        i6 = c17347.f53136;
                    } else {
                        i6 = -1;
                    }
                } else {
                    i6 = -1;
                }
                if (i6 == -1) {
                    int[] iArr2 = c14523.f44508;
                    Arrays.fill(iArr2, i5, iArr2.length, -1);
                    int length = c14523.f44508.length;
                } else {
                    Arrays.fill(c14523.f44508, i5, Math.min(i6 + 1, c14523.f44508.length), -1);
                }
            }
            if (i3 != 1) {
                c14523.m34673(i, i2);
            } else if (i3 != 2) {
                c14523.m34674(i, i2);
            } else if (i3 == 8) {
                c14523.m34674(i, 1);
                c14523.m34673(i2, 1);
            }
            if (i4 <= iM24529) {
                return;
            }
            if (this.f29084) {
                iM24528 = m24526();
            } else {
                iM24528 = m24528();
            }
            if (i5 <= iM24528) {
                requestLayout();
            }
        }
        i4 = i + i2;
        i5 = i;
        c14523 = this.f29105;
        iArr = c14523.f44508;
        if (iArr != null) {
            arrayList = c14523.f44509;
            if (arrayList != null) {
                if (arrayList == null) {
                    size2 = arrayList.size();
                    do {
                        size2--;
                        if (size2 >= 0) {
                            c17346 = null;
                            break;
                        }
                        c17346 = (C17346) c14523.f44509.get(size2);
                    } while (c17346.f53136 != i5);
                } else {
                    c17346 = null;
                    break;
                }
                if (c17346 != null) {
                    c14523.f44509.remove(c17346);
                }
                size = c14523.f44509.size();
                i7 = 0;
                while (true) {
                    if (i7 < size) {
                        i7 = -1;
                        break;
                    } else {
                        if (((C17346) c14523.f44509.get(i7)).f53136 >= i5) {
                            break;
                            break;
                        }
                        i7++;
                    }
                }
                if (i7 != -1) {
                    C17346 c17348 = (C17346) c14523.f44509.get(i7);
                    c14523.f44509.remove(i7);
                    i6 = c17348.f53136;
                } else {
                    i6 = -1;
                }
            } else {
                i6 = -1;
            }
            if (i6 == -1) {
                int[] iArr3 = c14523.f44508;
                Arrays.fill(iArr3, i5, iArr3.length, -1);
                int length2 = c14523.f44508.length;
            } else {
                Arrays.fill(c14523.f44508, i5, Math.min(i6 + 1, c14523.f44508.length), -1);
            }
        }
        if (i3 != 1) {
            c14523.m34673(i, i2);
        } else if (i3 != 2) {
            c14523.m34674(i, i2);
        } else if (i3 == 8) {
            c14523.m34674(i, 1);
            c14523.m34673(i2, 1);
        }
        if (i4 <= iM24529) {
            return;
        }
        if (this.f29084) {
            iM24528 = m24526();
        } else {
            iM24528 = m24528();
        }
        if (i5 <= iM24528) {
            requestLayout();
        }
    }

    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m24506(C2550 c2550, C10729 c10729, C21600 c21600) {
        int i;
        int iMo7478;
        int iM24505;
        C20875 c20875;
        ?? r1;
        int iMo7477;
        int iMo7479;
        int iMo74710;
        int iMo74711;
        int i2;
        int i3;
        C2550 c2551 = c2550;
        int i4 = 1;
        this.f29088.set(0, this.f29091, true);
        C10729 c107210 = this.f29095;
        if (c107210.f32323) {
            i = c10729.f32320 == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else if (c10729.f32320 == 1) {
            i = c10729.f32321 + c10729.f32317;
        } else {
            i = c10729.f32318 - c10729.f32317;
        }
        int i5 = c10729.f32320;
        for (int i6 = 0; i6 < this.f29091; i6++) {
            if (!this.f29096[i6].f67555.isEmpty()) {
                m24512(this.f29096[i6], i5, i);
            }
        }
        if (this.f29084) {
            iMo7478 = this.f29087.mo7476();
        } else {
            iMo7478 = this.f29087.mo7478();
        }
        boolean z = false;
        C9586 c9586 = this;
        while (true) {
            int i7 = c10729.f32319;
            int i8 = -1;
            if (i7 < 0 || i7 >= c21600.m48777() || (!c107210.f32323 && c9586.f29088.isEmpty())) {
                break;
            }
            View viewM8075 = c2551.m8075(c10729.f32319);
            c10729.f32319 += c10729.f32322;
            C16640 c16640 = (C16640) viewM8075.getLayoutParams();
            int layoutPosition = c16640.f44554.getLayoutPosition();
            C14523 c14523 = c9586.f29105;
            int[] iArr = c14523.f44508;
            int i9 = (iArr == null || layoutPosition >= iArr.length) ? -1 : iArr[layoutPosition];
            if (i9 != -1) {
                c20875 = c9586.f29096[i9];
            } else {
                if (c9586.m24519(c10729.f32320)) {
                    i3 = c9586.f29091 - i4;
                    i2 = -1;
                } else {
                    i8 = c9586.f29091;
                    i2 = 1;
                    i3 = 0;
                }
                C20875 c20876 = null;
                if (c10729.f32320 == i4) {
                    int iMo74712 = c9586.f29087.mo7478();
                    int i10 = Integer.MAX_VALUE;
                    while (i3 != i8) {
                        C20875 c20877 = c9586.f29096[i3];
                        int iM47699 = c20877.m47699(iMo74712);
                        if (iM47699 < i10) {
                            c20876 = c20877;
                            i10 = iM47699;
                        }
                        i3 += i2;
                    }
                } else {
                    int iMo7476 = c9586.f29087.mo7476();
                    int i11 = Integer.MIN_VALUE;
                    while (i3 != i8) {
                        C20875 c20878 = c9586.f29096[i3];
                        int iM47702 = c20878.m47702(iMo7476);
                        if (iM47702 > i11) {
                            c20876 = c20878;
                            i11 = iM47702;
                        }
                        i3 += i2;
                    }
                }
                c20875 = c20876;
                c14523.m34672(layoutPosition);
                c14523.f44508[layoutPosition] = c20875.f67556;
            }
            c16640.f51098 = c20875;
            if (c10729.f32320 == 1) {
                c9586.addView(viewM8075);
                r1 = 0;
            } else {
                r1 = 0;
                c9586.addView(viewM8075, 0);
            }
            if (c9586.f29090 == 1) {
                c9586.m24508(viewM8075, AbstractC17366.m40692(c9586.f29089, c9586.getWidthMode(), r1, ((ViewGroup.MarginLayoutParams) c16640).width, r1), AbstractC17366.m40692(c9586.getHeight(), c9586.getHeightMode(), c9586.getPaddingBottom() + c9586.getPaddingTop(), ((ViewGroup.MarginLayoutParams) c16640).height, true));
            } else {
                c9586.m24508(viewM8075, AbstractC17366.m40692(c9586.getWidth(), c9586.getWidthMode(), c9586.getPaddingRight() + c9586.getPaddingLeft(), ((ViewGroup.MarginLayoutParams) c16640).width, true), AbstractC17366.m40692(c9586.f29089, c9586.getHeightMode(), 0, ((ViewGroup.MarginLayoutParams) c16640).height, false));
            }
            if (c10729.f32320 == 1) {
                iMo7479 = c20875.m47699(iMo7478);
                iMo7477 = c9586.f29087.mo7477(viewM8075) + iMo7479;
            } else {
                int iM47703 = c20875.m47702(iMo7478);
                iMo7477 = iM47703;
                iMo7479 = iM47703 - c9586.f29087.mo7477(viewM8075);
            }
            if (c10729.f32320 == 1) {
                C20875 c20879 = c16640.f51098;
                c20879.getClass();
                C16640 c16641 = (C16640) viewM8075.getLayoutParams();
                c16641.f51098 = c20879;
                ArrayList arrayList = c20879.f67555;
                arrayList.add(viewM8075);
                c20879.f67551 = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    c20879.f67552 = Integer.MIN_VALUE;
                }
                if (c16641.f44554.isRemoved() || c16641.f44554.isUpdated()) {
                    c20879.f67554 = c20879.f67553.f29087.mo7477(viewM8075) + c20879.f67554;
                }
            } else {
                C20875 c208710 = c16640.f51098;
                c208710.getClass();
                C16640 c16642 = (C16640) viewM8075.getLayoutParams();
                c16642.f51098 = c208710;
                ArrayList arrayList2 = c208710.f67555;
                arrayList2.add(0, viewM8075);
                c208710.f67552 = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    c208710.f67551 = Integer.MIN_VALUE;
                }
                if (c16642.f44554.isRemoved() || c16642.f44554.isUpdated()) {
                    c208710.f67554 = c208710.f67553.f29087.mo7477(viewM8075) + c208710.f67554;
                }
            }
            if (c9586.isLayoutRTL() && c9586.f29090 == 1) {
                iMo74711 = c9586.f29102.mo7476() - (((c9586.f29091 - 1) - c20875.f67556) * c9586.f29089);
                iMo74710 = iMo74711 - c9586.f29102.mo7477(viewM8075);
            } else {
                iMo74710 = c9586.f29102.mo7478() + (c20875.f67556 * c9586.f29089);
                iMo74711 = c9586.f29102.mo7477(viewM8075) + iMo74710;
            }
            int i12 = iMo74711;
            int i13 = iMo74710;
            if (c9586.f29090 == 1) {
                c9586.layoutDecoratedWithMargins(viewM8075, i13, iMo7479, i12, iMo7477);
                c9586 = this;
            } else {
                c9586.layoutDecoratedWithMargins(viewM8075, iMo7479, i13, iMo7477, i12);
            }
            c9586.m24512(c20875, c107210.f32320, i);
            c2551 = c2550;
            c9586.m24510(c2551, c107210);
            if (c107210.f32324 && viewM8075.hasFocusable()) {
                c9586.f29088.set(c20875.f67556, false);
            }
            z = true;
            i4 = 1;
        }
        if (!z) {
            c9586.m24510(c2551, c107210);
        }
        if (c107210.f32320 == -1) {
            iM24505 = c9586.f29087.mo7478() - c9586.m24513(c9586.f29087.mo7478());
        } else {
            iM24505 = c9586.m24505(c9586.f29087.mo7476()) - c9586.f29087.mo7476();
        }
        if (iM24505 > 0) {
            return Math.min(c10729.f32317, iM24505);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m24510(C2550 c2550, C10729 c10729) {
        int iMin;
        int iMin2;
        if (!c10729.f32325 || c10729.f32323) {
            return;
        }
        if (c10729.f32317 == 0) {
            if (c10729.f32320 == -1) {
                m24509(c2550, c10729.f32321);
                return;
            } else {
                m24515(c2550, c10729.f32318);
                return;
            }
        }
        int i = 1;
        if (c10729.f32320 == -1) {
            int i2 = c10729.f32318;
            int iM47702 = this.f29096[0].m47702(i2);
            while (i < this.f29091) {
                int iM47703 = this.f29096[i].m47702(i2);
                if (iM47703 > iM47702) {
                    iM47702 = iM47703;
                }
                i++;
            }
            int i3 = i2 - iM47702;
            if (i3 < 0) {
                iMin2 = c10729.f32321;
            } else {
                iMin2 = c10729.f32321 - Math.min(i3, c10729.f32317);
            }
            m24509(c2550, iMin2);
            return;
        }
        int i4 = c10729.f32321;
        int iM47699 = this.f29096[0].m47699(i4);
        while (i < this.f29091) {
            int iM476910 = this.f29096[i].m47699(i4);
            if (iM476910 < iM47699) {
                iM47699 = iM476910;
            }
            i++;
        }
        int i5 = iM47699 - c10729.f32321;
        if (i5 < 0) {
            iMin = c10729.f32318;
        } else {
            iMin = Math.min(i5, c10729.f32317) + c10729.f32318;
        }
        m24515(c2550, iMin);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private int m24513(int i) {
        int iM47702 = this.f29096[0].m47702(i);
        for (int i2 = 1; i2 < this.f29091; i2++) {
            int iM47703 = this.f29096[i2].m47702(i);
            if (iM47703 < iM47702) {
                iM47702 = iM47703;
            }
        }
        return iM47702;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m24505(int i) {
        int iM47699 = this.f29096[0].m47699(i);
        for (int i2 = 1; i2 < this.f29091; i2++) {
            int iM476910 = this.f29096[i2].m47699(i);
            if (iM476910 > iM47699) {
                iM47699 = iM476910;
            }
        }
        return iM47699;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m24515(C2550 c2550, int i) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (this.f29087.mo7473(childAt) > i || this.f29087.mo7483(childAt) > i) {
                return;
            }
            C16640 c16640 = (C16640) childAt.getLayoutParams();
            c16640.getClass();
            if (c16640.f51098.f67555.size() == 1) {
                return;
            }
            C20875 c20875 = c16640.f51098;
            ArrayList arrayList = c20875.f67555;
            View view = (View) arrayList.remove(0);
            C16640 c16641 = (C16640) view.getLayoutParams();
            c16641.f51098 = null;
            if (arrayList.size() == 0) {
                c20875.f67551 = Integer.MIN_VALUE;
            }
            if (c16641.f44554.isRemoved() || c16641.f44554.isUpdated()) {
                c20875.f67554 -= c20875.f67553.f29087.mo7477(view);
            }
            c20875.f67552 = Integer.MIN_VALUE;
            removeAndRecycleView(childAt, c2550);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m24509(C2550 c2550, int i) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (this.f29087.mo7485(childAt) < i || this.f29087.mo7479(childAt) < i) {
                return;
            }
            C16640 c16640 = (C16640) childAt.getLayoutParams();
            c16640.getClass();
            if (c16640.f51098.f67555.size() == 1) {
                return;
            }
            C20875 c20875 = c16640.f51098;
            ArrayList arrayList = c20875.f67555;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            C16640 c16641 = (C16640) view.getLayoutParams();
            c16641.f51098 = null;
            if (c16641.f44554.isRemoved() || c16641.f44554.isUpdated()) {
                c20875.f67554 -= c20875.f67553.f29087.mo7477(view);
            }
            if (size == 1) {
                c20875.f67552 = Integer.MIN_VALUE;
            }
            c20875.f67551 = Integer.MIN_VALUE;
            removeAndRecycleView(childAt, c2550);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private boolean m24519(int i) {
        if (this.f29090 == 0) {
            return (i == -1) != this.f29084;
        }
        return ((i == -1) == this.f29084) == isLayoutRTL();
    }

    @Override // l.AbstractC17366
    public final boolean canScrollVertically() {
        return this.f29090 == 1;
    }

    @Override // l.AbstractC17366
    public final boolean canScrollHorizontally() {
        return this.f29090 == 0;
    }

    @Override // l.AbstractC17366
    public final int scrollHorizontallyBy(int i, C2550 c2550, C21600 c21600) {
        return scrollBy(i, c2550, c21600);
    }

    @Override // l.AbstractC17366
    public final int scrollVerticallyBy(int i, C2550 c2550, C21600 c21600) {
        return scrollBy(i, c2550, c21600);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001a  */
    @Override // l.InterfaceC8194
    public final PointF computeScrollVectorForPosition(int i) {
        int i2 = -1;
        if (getChildCount() == 0) {
            if (this.f29084) {
                i2 = 1;
            }
        } else {
            if ((i < m24526()) == this.f29084) {
                i2 = 1;
            }
        }
        PointF pointF = new PointF();
        if (i2 == 0) {
            return null;
        }
        if (this.f29090 == 0) {
            pointF.x = i2;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = i2;
        return pointF;
    }

    @Override // l.AbstractC17366
    public final void smoothScrollToPosition(C13132 c13132, C21600 c21600, int i) {
        C20607 c20607 = new C20607(c13132.getContext());
        c20607.setTargetPosition(i);
        startSmoothScroll(c20607);
    }

    @Override // l.AbstractC17366
    public final void scrollToPosition(int i) {
        C6763 c6763 = this.f29103;
        if (c6763 != null && c6763.f21011 != i) {
            c6763.f21005 = null;
            c6763.f21004 = 0;
            c6763.f21011 = -1;
            c6763.f21006 = -1;
        }
        this.f29093 = i;
        this.f29092 = Integer.MIN_VALUE;
        requestLayout();
    }

    @Override // l.AbstractC17366
    public final void collectAdjacentPrefetchPositions(int i, int i2, C21600 c21600, InterfaceC16660 interfaceC16660) {
        C10729 c10729;
        int iM47699;
        int iM47702;
        if (this.f29090 != 0) {
            i = i2;
        }
        if (getChildCount() == 0 || i == 0) {
            return;
        }
        m24524(i, c21600);
        int[] iArr = this.f29097;
        if (iArr == null || iArr.length < this.f29091) {
            this.f29097 = new int[this.f29091];
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = this.f29091;
            c10729 = this.f29095;
            if (i3 >= i5) {
                break;
            }
            if (c10729.f32322 == -1) {
                iM47699 = c10729.f32318;
                iM47702 = this.f29096[i3].m47702(iM47699);
            } else {
                iM47699 = this.f29096[i3].m47699(c10729.f32321);
                iM47702 = c10729.f32321;
            }
            int i6 = iM47699 - iM47702;
            if (i6 >= 0) {
                this.f29097[i4] = i6;
                i4++;
            }
            i3++;
        }
        Arrays.sort(this.f29097, 0, i4);
        for (int i7 = 0; i7 < i4; i7++) {
            int i8 = c10729.f32319;
            if (i8 < 0 || i8 >= c21600.m48777()) {
                return;
            }
            ((C19238) interfaceC16660).m44373(c10729.f32319, this.f29097[i7]);
            c10729.f32319 += c10729.f32322;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24524(int i, C21600 c21600) {
        int iM24526;
        int i2;
        if (i > 0) {
            iM24526 = m24528();
            i2 = 1;
        } else {
            iM24526 = m24526();
            i2 = -1;
        }
        C10729 c10729 = this.f29095;
        c10729.f32325 = true;
        m24514(iM24526, c21600);
        m24522(i2);
        c10729.f32319 = iM24526 + c10729.f32322;
        c10729.f32317 = Math.abs(i);
    }

    public final int scrollBy(int i, C2550 c2550, C21600 c21600) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        m24524(i, c21600);
        C10729 c10729 = this.f29095;
        int iM24506 = m24506(c2550, c10729, c21600);
        if (c10729.f32317 >= iM24506) {
            i = i < 0 ? -iM24506 : iM24506;
        }
        this.f29087.mo7474(-i);
        this.f29100 = this.f29084;
        c10729.f32317 = 0;
        m24510(c2550, c10729);
        return i;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m24528() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return 0;
        }
        return getPosition(getChildAt(childCount - 1));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m24526() {
        if (getChildCount() == 0) {
            return 0;
        }
        return getPosition(getChildAt(0));
    }

    @Override // l.AbstractC17366
    public final C14543 generateDefaultLayoutParams() {
        return this.f29090 == 0 ? new C16640(-2, -1) : new C16640(-1, -2);
    }

    @Override // l.AbstractC17366
    public final C14543 generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new C16640(context, attributeSet);
    }

    @Override // l.AbstractC17366
    public final C14543 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C16640((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C16640(layoutParams);
    }

    @Override // l.AbstractC17366
    public final boolean checkLayoutParams(C14543 c14543) {
        return c14543 instanceof C16640;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x005a  */
    /* JADX WARN: Code duplicated, block: B:46:0x005c  */
    @Override // l.AbstractC17366
    public final View onFocusSearchFailed(View view, int i, C2550 c2550, C21600 c21600) {
        View viewFindContainingItemView;
        int i2;
        int iM24526;
        int iM47706;
        int iM47707;
        int iM47708;
        if (getChildCount() == 0 || (viewFindContainingItemView = findContainingItemView(view)) == null) {
            return null;
        }
        m24520();
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i == 33) {
                        if (this.f29090 == 1) {
                            i2 = -1;
                        }
                    } else if (i == 66 ? this.f29090 == 0 : !(i != 130 || this.f29090 != 1)) {
                        i2 = 1;
                    }
                    i2 = Integer.MIN_VALUE;
                } else if (this.f29090 == 0) {
                    i2 = -1;
                } else {
                    i2 = Integer.MIN_VALUE;
                }
            } else if (this.f29090 != 1 && isLayoutRTL()) {
                i2 = -1;
            } else {
                i2 = 1;
            }
        } else if (this.f29090 != 1 && isLayoutRTL()) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        C16640 c16640 = (C16640) viewFindContainingItemView.getLayoutParams();
        c16640.getClass();
        C20875 c20875 = c16640.f51098;
        if (i2 == 1) {
            iM24526 = m24528();
        } else {
            iM24526 = m24526();
        }
        m24514(iM24526, c21600);
        m24522(i2);
        C10729 c10729 = this.f29095;
        c10729.f32319 = c10729.f32322 + iM24526;
        c10729.f32317 = (int) (this.f29087.mo7487() * 0.33333334f);
        c10729.f32324 = true;
        c10729.f32325 = false;
        m24506(c2550, c10729, c21600);
        this.f29100 = this.f29084;
        View viewM47703 = c20875.m47703(iM24526, i2);
        if (viewM47703 != null && viewM47703 != viewFindContainingItemView) {
            return viewM47703;
        }
        if (m24519(i2)) {
            for (int i3 = this.f29091 - 1; i3 >= 0; i3--) {
                View viewM47704 = this.f29096[i3].m47703(iM24526, i2);
                if (viewM47704 != null && viewM47704 != viewFindContainingItemView) {
                    return viewM47704;
                }
            }
        } else {
            for (int i4 = 0; i4 < this.f29091; i4++) {
                View viewM47705 = this.f29096[i4].m47703(iM24526, i2);
                if (viewM47705 != null && viewM47705 != viewFindContainingItemView) {
                    return viewM47705;
                }
            }
        }
        boolean z = (this.f29101 ^ true) == (i2 == -1);
        if (z) {
            iM47706 = c20875.m47705();
        } else {
            iM47706 = c20875.m47706();
        }
        View viewFindViewByPosition = findViewByPosition(iM47706);
        if (viewFindViewByPosition != null && viewFindViewByPosition != viewFindContainingItemView) {
            return viewFindViewByPosition;
        }
        if (m24519(i2)) {
            for (int i5 = this.f29091 - 1; i5 >= 0; i5--) {
                if (i5 != c20875.f67556) {
                    if (z) {
                        iM47708 = this.f29096[i5].m47705();
                    } else {
                        iM47708 = this.f29096[i5].m47706();
                    }
                    View viewFindViewByPosition2 = findViewByPosition(iM47708);
                    if (viewFindViewByPosition2 != null && viewFindViewByPosition2 != viewFindContainingItemView) {
                        return viewFindViewByPosition2;
                    }
                }
            }
        } else {
            for (int i6 = 0; i6 < this.f29091; i6++) {
                if (z) {
                    iM47707 = this.f29096[i6].m47705();
                } else {
                    iM47707 = this.f29096[i6].m47706();
                }
                View viewFindViewByPosition3 = findViewByPosition(iM47707);
                if (viewFindViewByPosition3 != null && viewFindViewByPosition3 != viewFindContainingItemView) {
                    return viewFindViewByPosition3;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m24512(C20875 c20875, int i, int i2) {
        int i3 = c20875.f67554;
        int i4 = c20875.f67556;
        if (i == -1) {
            int i5 = c20875.f67552;
            if (i5 == Integer.MIN_VALUE) {
                View view = (View) c20875.f67555.get(0);
                C16640 c16640 = (C16640) view.getLayoutParams();
                c20875.f67552 = c20875.f67553.f29087.mo7485(view);
                c16640.getClass();
                i5 = c20875.f67552;
            }
            if (i5 + i3 <= i2) {
                this.f29088.set(i4, false);
                return;
            }
            return;
        }
        int i6 = c20875.f67551;
        if (i6 == Integer.MIN_VALUE) {
            c20875.m47701();
            i6 = c20875.f67551;
        }
        if (i6 - i3 >= i2) {
            this.f29088.set(i4, false);
        }
    }
}
