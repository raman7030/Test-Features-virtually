package p067l;

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
public class C11479 extends AbstractC18873 implements InterfaceC10156 {

    /* JADX INFO: renamed from: ֨ */
    public boolean f32032;

    /* JADX INFO: renamed from: ֫ */
    public final C12820 f32033;

    /* JADX INFO: renamed from: ۖ */
    public AbstractC4518 f32034;

    /* JADX INFO: renamed from: ۘ */
    public BitSet f32035;

    /* JADX INFO: renamed from: ۚ */
    public int f32036;

    /* JADX INFO: renamed from: ۜ */
    public int f32037;

    /* JADX INFO: renamed from: ۠ */
    public int f32038;

    /* JADX INFO: renamed from: ۧ */
    public final Runnable f32041;

    /* JADX INFO: renamed from: ܳ */
    public final C12565 f32042;

    /* JADX INFO: renamed from: ܶ */
    public C22208[] f32043;

    /* JADX INFO: renamed from: ܺ */
    public int[] f32044;

    /* JADX INFO: renamed from: ܽ */
    public int f32045;

    /* JADX INFO: renamed from: ܿ */
    public boolean f32046;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f32047;

    /* JADX INFO: renamed from: ᩴ */
    public boolean f32048;

    /* JADX INFO: renamed from: ᩵ */
    public AbstractC4518 f32049;

    /* JADX INFO: renamed from: ᩷ */
    public C8796 f32050;

    /* JADX INFO: renamed from: ᩸ */
    public final Rect f32051;

    /* JADX INFO: renamed from: ᩻ */
    public C16171 f32052;

    /* JADX INFO: renamed from: ֡ */
    public boolean f32031 = false;

    /* JADX INFO: renamed from: ۢ */
    public int f32040 = -1;

    /* JADX INFO: renamed from: ۡ */
    public int f32039 = Integer.MIN_VALUE;

    public C11479(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f32038 = -1;
        this.f32048 = false;
        C16171 c16171 = new C16171();
        this.f32052 = c16171;
        this.f32045 = 2;
        this.f32051 = new Rect();
        this.f32033 = new C12820(this);
        this.f32032 = true;
        this.f32041 = new RunnableC4102(this);
        C19544 c19544M42945 = AbstractC18873.m42945(context, attributeSet, i, i2);
        int i3 = c19544M42945.f59495;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        assertNotInLayoutOrScroll(null);
        if (i3 != this.f32037) {
            this.f32037 = i3;
            AbstractC4518 abstractC4518 = this.f32034;
            this.f32034 = this.f32049;
            this.f32049 = abstractC4518;
            requestLayout();
        }
        int i4 = c19544M42945.f59497;
        assertNotInLayoutOrScroll(null);
        if (i4 != this.f32038) {
            c16171.m36814();
            requestLayout();
            this.f32038 = i4;
            this.f32035 = new BitSet(this.f32038);
            this.f32043 = new C22208[this.f32038];
            for (int i5 = 0; i5 < this.f32038; i5++) {
                this.f32043[i5] = new C22208(this, i5);
            }
            requestLayout();
        }
        boolean z = c19544M42945.f59496;
        assertNotInLayoutOrScroll(null);
        C8796 c8796 = this.f32050;
        if (c8796 != null && c8796.f23877 != z) {
            c8796.f23877 = z;
        }
        this.f32048 = z;
        requestLayout();
        C12565 c12565 = new C12565();
        c12565.f35299 = true;
        c12565.f35292 = 0;
        c12565.f35295 = 0;
        this.f32042 = c12565;
        this.f32034 = AbstractC4518.m9553(this, this.f32037);
        this.f32049 = AbstractC4518.m9553(this, 1 - this.f32037);
    }

    @Override // p067l.AbstractC18873
    public final boolean isAutoMeasureEnabled() {
        return this.f32045 != 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m26537() {
        int iM26538;
        if (getChildCount() != 0 && this.f32045 != 0 && isAttachedToWindow()) {
            if (this.f32031) {
                iM26538 = m26540();
                m26538();
            } else {
                iM26538 = m26538();
                m26540();
            }
            if (iM26538 == 0 && m26541() != null) {
                this.f32052.m36814();
                requestSimpleAnimationsInNextLayout();
                requestLayout();
                return true;
            }
        }
        return false;
    }

    @Override // p067l.AbstractC18873
    public final void onScrollStateChanged(int i) {
        if (i == 0) {
            m26537();
        }
    }

    @Override // p067l.AbstractC18873
    public final void onDetachedFromWindow(C14849 c14849, C4792 c4792) {
        super.onDetachedFromWindow(c14849, c4792);
        removeCallbacks(this.f32041);
        for (int i = 0; i < this.f32038; i++) {
            this.f32043[i].m50034();
        }
        c14849.requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x002c A[SYNTHETIC] */
    /* JADX INFO: renamed from: ᩳ */
    public final View m26541() {
        boolean z;
        boolean z2;
        int childCount = getChildCount();
        int i = childCount - 1;
        BitSet bitSet = new BitSet(this.f32038);
        bitSet.set(0, this.f32038, true);
        byte b = (this.f32037 == 1 && isLayoutRTL()) ? (byte) 1 : (byte) -1;
        if (this.f32031) {
            childCount = -1;
        } else {
            i = 0;
        }
        int i2 = i < childCount ? 1 : -1;
        while (i != childCount) {
            View childAt = getChildAt(i);
            C18183 c18183 = (C18183) childAt.getLayoutParams();
            if (bitSet.get(c18183.f54278.f70242)) {
                C22208 c22208 = c18183.f54278;
                if (this.f32031) {
                    int i3 = c22208.f70237;
                    if (i3 == Integer.MIN_VALUE) {
                        c22208.m50031();
                        i3 = c22208.f70237;
                    }
                    if (i3 < this.f32034.mo9558()) {
                        ((C18183) ((View) C20013.m45383(c22208.f70241, 1)).getLayoutParams()).getClass();
                        return childAt;
                    }
                } else {
                    int i4 = c22208.f70238;
                    ArrayList arrayList = c22208.f70241;
                    if (i4 == Integer.MIN_VALUE) {
                        View view = (View) arrayList.get(0);
                        C18183 c18184 = (C18183) view.getLayoutParams();
                        c22208.f70238 = c22208.f70239.f32034.mo9567(view);
                        c18184.getClass();
                        i4 = c22208.f70238;
                    }
                    if (i4 > this.f32034.mo9560()) {
                        ((C18183) ((View) arrayList.get(0)).getLayoutParams()).getClass();
                        return childAt;
                    }
                }
                bitSet.clear(c18183.f54278.f70242);
            }
            i += i2;
            if (i != childCount) {
                View childAt2 = getChildAt(i);
                if (this.f32031) {
                    int iMo9555 = this.f32034.mo9555(childAt);
                    int iMo9556 = this.f32034.mo9555(childAt2);
                    if (iMo9555 >= iMo9556) {
                        if (iMo9555 == iMo9556) {
                            if (c18183.f54278.f70242 - ((C18183) childAt2.getLayoutParams()).f54278.f70242 < 0) {
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
                int iMo9567 = this.f32034.mo9567(childAt);
                int iMo9568 = this.f32034.mo9567(childAt2);
                if (iMo9567 <= iMo9568) {
                    if (iMo9567 == iMo9568) {
                        if (c18183.f54278.f70242 - ((C18183) childAt2.getLayoutParams()).f54278.f70242 < 0) {
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

    @Override // p067l.AbstractC18873
    public final void assertNotInLayoutOrScroll(String str) {
        if (this.f32050 == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    /* JADX INFO: renamed from: ܿ */
    private void m26532() {
        if (this.f32037 == 1 || !isLayoutRTL()) {
            this.f32031 = this.f32048;
        } else {
            this.f32031 = !this.f32048;
        }
    }

    public final boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    @Override // p067l.AbstractC18873
    public final void setMeasuredDimension(Rect rect, int i, int i2) {
        int iM42942;
        int iM42943;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.f32037 == 1) {
            iM42943 = AbstractC18873.m42942(i2, rect.height() + paddingBottom, getMinimumHeight());
            iM42942 = AbstractC18873.m42942(i, (this.f32036 * this.f32038) + paddingRight, getMinimumWidth());
        } else {
            iM42942 = AbstractC18873.m42942(i, rect.width() + paddingRight, getMinimumWidth());
            iM42943 = AbstractC18873.m42942(i2, (this.f32036 * this.f32038) + paddingBottom, getMinimumHeight());
        }
        setMeasuredDimension(iM42942, iM42943);
    }

    @Override // p067l.AbstractC18873
    public final void onLayoutChildren(C4792 c4792, C22897 c22897) {
        m26530(c4792, c22897, true);
    }

    @Override // p067l.AbstractC18873
    public final void onAdapterChanged(AbstractC21283 abstractC21283, AbstractC21283 abstractC21284) {
        this.f32052.m36814();
        for (int i = 0; i < this.f32038; i++) {
            this.f32043[i].m50034();
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
    /* JADX INFO: renamed from: ܽ */
    private void m26530(C4792 c4792, C22897 c22897, boolean z) {
        boolean z2;
        C8796 c8796;
        int childCount;
        int i;
        int position;
        int position2;
        int childCount2;
        int i2;
        boolean z3;
        C8796 c8797 = this.f32050;
        C12820 c12820 = this.f32033;
        if (!(c8797 == null && this.f32040 == -1) && c22897.m51124() == 0) {
            removeAndRecycleAllViews(c4792);
            c12820.m29368();
            return;
        }
        boolean z4 = c12820.f36060;
        C11479 c11479 = c12820.f36064;
        boolean z5 = (z4 && this.f32040 == -1 && this.f32050 == null) ? false : true;
        C16171 c16171 = this.f32052;
        if (z5) {
            c12820.m29368();
            C8796 c8798 = this.f32050;
            if (c8798 != null) {
                int i3 = c8798.f23879;
                if (i3 > 0) {
                    if (i3 == this.f32038) {
                        for (int i4 = 0; i4 < this.f32038; i4++) {
                            this.f32043[i4].m50034();
                            C8796 c8799 = this.f32050;
                            int iMo9558 = c8799.f23880[i4];
                            if (iMo9558 != Integer.MIN_VALUE) {
                                iMo9558 += c8799.f23885 ? this.f32034.mo9558() : this.f32034.mo9560();
                            }
                            C22208 c22208 = this.f32043[i4];
                            c22208.f70238 = iMo9558;
                            c22208.f70237 = iMo9558;
                        }
                    } else {
                        c8798.f23880 = null;
                        c8798.f23879 = 0;
                        c8798.f23882 = 0;
                        c8798.f23883 = null;
                        c8798.f23884 = null;
                        c8798.f23886 = c8798.f23881;
                    }
                }
                C8796 c87910 = this.f32050;
                this.f32046 = c87910.f23878;
                boolean z6 = c87910.f23877;
                assertNotInLayoutOrScroll(null);
                C8796 c87911 = this.f32050;
                if (c87911 != null && c87911.f23877 != z6) {
                    c87911.f23877 = z6;
                }
                this.f32048 = z6;
                requestLayout();
                m26532();
                C8796 c87912 = this.f32050;
                int i5 = c87912.f23886;
                if (i5 != -1) {
                    this.f32040 = i5;
                    c12820.f36059 = c87912.f23885;
                } else {
                    c12820.f36059 = this.f32031;
                }
                if (c87912.f23882 > 1) {
                    c16171.f47614 = c87912.f23883;
                    c16171.f47615 = c87912.f23884;
                }
            } else {
                m26532();
                c12820.f36059 = this.f32031;
            }
            if (c22897.f72063 || (i2 = this.f32040) == -1) {
                if (this.f32047) {
                    int iM51124 = c22897.m51124();
                    childCount2 = getChildCount() - 1;
                    while (true) {
                        if (childCount2 < 0) {
                            position2 = 0;
                            break;
                        }
                        position2 = getPosition(getChildAt(childCount2));
                        if (position2 < 0 && position2 < iM51124) {
                            break;
                        } else {
                            childCount2--;
                        }
                    }
                } else {
                    int iM51125 = c22897.m51124();
                    childCount = getChildCount();
                    i = 0;
                    while (true) {
                        if (i >= childCount) {
                            position2 = 0;
                            break;
                        }
                        position = getPosition(getChildAt(i));
                        if (position < 0 && position < iM51125) {
                            position2 = position;
                            break;
                        }
                        i++;
                    }
                }
                c12820.f36063 = position2;
                c12820.f36061 = Integer.MIN_VALUE;
            } else if (i2 < 0 || i2 >= c22897.m51124()) {
                this.f32040 = -1;
                this.f32039 = Integer.MIN_VALUE;
                if (this.f32047) {
                    int iM51126 = c22897.m51124();
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
                    int iM51127 = c22897.m51124();
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
                c12820.f36063 = position2;
                c12820.f36061 = Integer.MIN_VALUE;
            } else {
                C8796 c87913 = this.f32050;
                if (c87913 == null || c87913.f23886 == -1 || c87913.f23879 < 1) {
                    View viewFindViewByPosition = findViewByPosition(this.f32040);
                    if (viewFindViewByPosition != null) {
                        c12820.f36063 = this.f32031 ? m26540() : m26538();
                        if (this.f32039 != Integer.MIN_VALUE) {
                            if (c12820.f36059) {
                                c12820.f36061 = (this.f32034.mo9558() - this.f32039) - this.f32034.mo9555(viewFindViewByPosition);
                            } else {
                                c12820.f36061 = (this.f32034.mo9560() + this.f32039) - this.f32034.mo9567(viewFindViewByPosition);
                            }
                        } else if (this.f32034.mo9559(viewFindViewByPosition) > this.f32034.mo9569()) {
                            c12820.f36061 = c12820.f36059 ? this.f32034.mo9558() : this.f32034.mo9560();
                        } else {
                            int iMo9567 = this.f32034.mo9567(viewFindViewByPosition) - this.f32034.mo9560();
                            if (iMo9567 < 0) {
                                c12820.f36061 = -iMo9567;
                            } else {
                                int iMo9559 = this.f32034.mo9558() - this.f32034.mo9555(viewFindViewByPosition);
                                if (iMo9559 < 0) {
                                    c12820.f36061 = iMo9559;
                                } else {
                                    c12820.f36061 = Integer.MIN_VALUE;
                                }
                            }
                        }
                    } else {
                        int i6 = this.f32040;
                        c12820.f36063 = i6;
                        int i7 = this.f32039;
                        if (i7 == Integer.MIN_VALUE) {
                            if (getChildCount() != 0) {
                                if ((i6 < m26538()) != this.f32031) {
                                    z3 = false;
                                } else {
                                    z3 = true;
                                }
                            } else if (this.f32031) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            c12820.f36059 = z3;
                            c12820.f36061 = z3 ? c11479.f32034.mo9558() : c11479.f32034.mo9560();
                        } else if (c12820.f36059) {
                            c12820.f36061 = c11479.f32034.mo9558() - i7;
                        } else {
                            c12820.f36061 = c11479.f32034.mo9560() + i7;
                        }
                        c12820.f36058 = true;
                    }
                } else {
                    c12820.f36061 = Integer.MIN_VALUE;
                    c12820.f36063 = this.f32040;
                }
            }
            c12820.f36060 = true;
        }
        if (this.f32050 == null && this.f32040 == -1 && (c12820.f36059 != this.f32047 || isLayoutRTL() != this.f32046)) {
            c16171.m36814();
            c12820.f36058 = true;
        }
        if (getChildCount() > 0 && ((c8796 = this.f32050) == null || c8796.f23879 < 1)) {
            if (c12820.f36058) {
                for (int i8 = 0; i8 < this.f32038; i8++) {
                    this.f32043[i8].m50034();
                    int i9 = c12820.f36061;
                    if (i9 != Integer.MIN_VALUE) {
                        C22208 c22209 = this.f32043[i8];
                        c22209.f70238 = i9;
                        c22209.f70237 = i9;
                    }
                }
            } else if (z5 || c12820.f36062 == null) {
                for (int i10 = 0; i10 < this.f32038; i10++) {
                    C22208 c222010 = this.f32043[i10];
                    boolean z7 = this.f32031;
                    int i11 = c12820.f36061;
                    C11479 c114710 = c222010.f70239;
                    int iM50029 = z7 ? c222010.m50029(Integer.MIN_VALUE) : c222010.m50032(Integer.MIN_VALUE);
                    c222010.m50034();
                    if (iM50029 != Integer.MIN_VALUE && ((!z7 || iM50029 >= c114710.f32034.mo9558()) && (z7 || iM50029 <= c114710.f32034.mo9560()))) {
                        if (i11 != Integer.MIN_VALUE) {
                            iM50029 += i11;
                        }
                        c222010.f70237 = iM50029;
                        c222010.f70238 = iM50029;
                    }
                }
                C22208[] c22208Arr = this.f32043;
                int length = c22208Arr.length;
                int[] iArr = c12820.f36062;
                if (iArr == null || iArr.length < length) {
                    c12820.f36062 = new int[c11479.f32043.length];
                }
                for (int i12 = 0; i12 < length; i12++) {
                    c12820.f36062[i12] = c22208Arr[i12].m50032(Integer.MIN_VALUE);
                }
            } else {
                for (int i13 = 0; i13 < this.f32038; i13++) {
                    C22208 c222011 = this.f32043[i13];
                    c222011.m50034();
                    int i14 = c12820.f36062[i13];
                    c222011.f70238 = i14;
                    c222011.f70237 = i14;
                }
            }
        }
        detachAndScrapAttachedViews(c4792);
        C12565 c12565 = this.f32042;
        c12565.f35299 = false;
        int iMo9569 = this.f32049.mo9569();
        this.f32036 = iMo9569 / this.f32038;
        View.MeasureSpec.makeMeasureSpec(iMo9569, this.f32049.mo9566());
        m26526(c12820.f36063, c22897);
        if (c12820.f36059) {
            m26534(-1);
            m26518(c4792, c12565, c22897);
            m26534(1);
            c12565.f35293 = c12820.f36063 + c12565.f35296;
            m26518(c4792, c12565, c22897);
        } else {
            m26534(1);
            m26518(c4792, c12565, c22897);
            m26534(-1);
            c12565.f35293 = c12820.f36063 + c12565.f35296;
            m26518(c4792, c12565, c22897);
        }
        if (this.f32049.mo9566() != 1073741824) {
            int childCount3 = getChildCount();
            float fMax = 0.0f;
            for (int i15 = 0; i15 < childCount3; i15++) {
                View childAt = getChildAt(i15);
                float fMo9559 = this.f32049.mo9559(childAt);
                if (fMo9559 >= fMax) {
                    ((C18183) childAt.getLayoutParams()).getClass();
                    fMax = Math.max(fMax, fMo9559);
                }
            }
            int i16 = this.f32036;
            int iRound = Math.round(fMax * this.f32038);
            if (this.f32049.mo9566() == Integer.MIN_VALUE) {
                iRound = Math.min(iRound, this.f32049.mo9569());
            }
            this.f32036 = iRound / this.f32038;
            View.MeasureSpec.makeMeasureSpec(iRound, this.f32049.mo9566());
            if (this.f32036 != i16) {
                for (int i17 = 0; i17 < childCount3; i17++) {
                    View childAt2 = getChildAt(i17);
                    C18183 c18183 = (C18183) childAt2.getLayoutParams();
                    c18183.getClass();
                    if (isLayoutRTL() && this.f32037 == 1) {
                        int i18 = -((this.f32038 - 1) - c18183.f54278.f70242);
                        childAt2.offsetLeftAndRight((this.f32036 * i18) - (i18 * i16));
                    } else {
                        int i19 = c18183.f54278.f70242;
                        int i20 = this.f32036 * i19;
                        int i21 = i19 * i16;
                        if (this.f32037 == 1) {
                            childAt2.offsetLeftAndRight(i20 - i21);
                        } else {
                            childAt2.offsetTopAndBottom(i20 - i21);
                        }
                    }
                }
            }
        }
        if (getChildCount() > 0) {
            if (this.f32031) {
                m26523(c4792, c22897, true);
                m26528(c4792, c22897, false);
            } else {
                m26528(c4792, c22897, true);
                m26523(c4792, c22897, false);
            }
        }
        if (z && !c22897.f72063 && this.f32045 != 0 && getChildCount() > 0 && m26541() != null) {
            removeCallbacks(this.f32041);
            z2 = m26537();
        }
        if (c22897.f72063) {
            c12820.m29368();
        }
        this.f32047 = c12820.f36059;
        this.f32046 = isLayoutRTL();
        if (z2) {
            c12820.m29368();
            m26530(c4792, c22897, false);
        }
    }

    @Override // p067l.AbstractC18873
    public final void onLayoutCompleted(C22897 c22897) {
        super.onLayoutCompleted(c22897);
        this.f32040 = -1;
        this.f32039 = Integer.MIN_VALUE;
        this.f32050 = null;
        this.f32033.m29368();
    }

    @Override // p067l.AbstractC18873
    public final boolean supportsPredictiveItemAnimations() {
        return this.f32050 == null;
    }

    @Override // p067l.AbstractC18873
    public final int computeHorizontalScrollOffset(C22897 c22897) {
        return m26519(c22897);
    }

    /* JADX INFO: renamed from: ֫ */
    private int m26519(C22897 c22897) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z = !this.f32032;
        return C8144.m18912(c22897, this.f32034, m26539(z), m26535(z), this, this.f32032, this.f32031);
    }

    @Override // p067l.AbstractC18873
    public final int computeVerticalScrollOffset(C22897 c22897) {
        return m26519(c22897);
    }

    @Override // p067l.AbstractC18873
    public final int computeHorizontalScrollExtent(C22897 c22897) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z = !this.f32032;
        return C8144.m18911(c22897, this.f32034, m26539(z), m26535(z), this, this.f32032);
    }

    @Override // p067l.AbstractC18873
    public final int computeVerticalScrollExtent(C22897 c22897) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z = !this.f32032;
        return C8144.m18911(c22897, this.f32034, m26539(z), m26535(z), this, this.f32032);
    }

    @Override // p067l.AbstractC18873
    public final int computeHorizontalScrollRange(C22897 c22897) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z = !this.f32032;
        return C8144.m18913(c22897, this.f32034, m26539(z), m26535(z), this, this.f32032);
    }

    @Override // p067l.AbstractC18873
    public final int computeVerticalScrollRange(C22897 c22897) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z = !this.f32032;
        return C8144.m18913(c22897, this.f32034, m26539(z), m26535(z), this, this.f32032);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m26520(View view, int i, int i2) {
        Rect rect = this.f32051;
        calculateItemDecorationsForChild(view, rect);
        C18183 c18183 = (C18183) view.getLayoutParams();
        int iM26533 = m26533(i, ((ViewGroup.MarginLayoutParams) c18183).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) c18183).rightMargin + rect.right);
        int iM26534 = m26533(i2, ((ViewGroup.MarginLayoutParams) c18183).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) c18183).bottomMargin + rect.bottom);
        if (shouldMeasureChild(view, iM26533, iM26534, c18183)) {
            view.measure(iM26533, iM26534);
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public static int m26533(int i, int i2, int i3) {
        int mode;
        return (!(i2 == 0 && i3 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // p067l.AbstractC18873
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof C8796) {
            C8796 c8796 = (C8796) parcelable;
            this.f32050 = c8796;
            if (this.f32040 != -1) {
                c8796.f23886 = -1;
                c8796.f23881 = -1;
                c8796.f23880 = null;
                c8796.f23879 = 0;
                c8796.f23882 = 0;
                c8796.f23883 = null;
                c8796.f23884 = null;
            }
            requestLayout();
        }
    }

    @Override // p067l.AbstractC18873
    public final Parcelable onSaveInstanceState() {
        int iM50032;
        int iMo9560;
        int[] iArr;
        C8796 c8796 = this.f32050;
        if (c8796 == null) {
            C8796 c8797 = new C8796();
            c8797.f23877 = this.f32048;
            c8797.f23885 = this.f32047;
            c8797.f23878 = this.f32046;
            C16171 c16171 = this.f32052;
            if (c16171 != null && (iArr = c16171.f47614) != null) {
                c8797.f23883 = iArr;
                c8797.f23882 = iArr.length;
                c8797.f23884 = c16171.f47615;
            } else {
                c8797.f23882 = 0;
            }
            if (getChildCount() > 0) {
                c8797.f23886 = this.f32047 ? m26540() : m26538();
                View viewM26535 = this.f32031 ? m26535(true) : m26539(true);
                c8797.f23881 = viewM26535 != null ? getPosition(viewM26535) : -1;
                int i = this.f32038;
                c8797.f23879 = i;
                c8797.f23880 = new int[i];
                for (int i2 = 0; i2 < this.f32038; i2++) {
                    if (this.f32047) {
                        iM50032 = this.f32043[i2].m50029(Integer.MIN_VALUE);
                        if (iM50032 != Integer.MIN_VALUE) {
                            iMo9560 = this.f32034.mo9558();
                            iM50032 -= iMo9560;
                        }
                    } else {
                        iM50032 = this.f32043[i2].m50032(Integer.MIN_VALUE);
                        if (iM50032 != Integer.MIN_VALUE) {
                            iMo9560 = this.f32034.mo9560();
                            iM50032 -= iMo9560;
                        }
                    }
                    c8797.f23880[i2] = iM50032;
                }
                return c8797;
            }
            c8797.f23886 = -1;
            c8797.f23881 = -1;
            c8797.f23879 = 0;
            return c8797;
        }
        C8796 c8798 = new C8796();
        c8798.f23879 = c8796.f23879;
        c8798.f23886 = c8796.f23886;
        c8798.f23881 = c8796.f23881;
        c8798.f23880 = c8796.f23880;
        c8798.f23882 = c8796.f23882;
        c8798.f23883 = c8796.f23883;
        c8798.f23877 = c8796.f23877;
        c8798.f23885 = c8796.f23885;
        c8798.f23878 = c8796.f23878;
        c8798.f23884 = c8796.f23884;
        return c8798;
    }

    @Override // p067l.AbstractC18873
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            View viewM26539 = m26539(false);
            View viewM26535 = m26535(false);
            if (viewM26539 == null || viewM26535 == null) {
                return;
            }
            int position = getPosition(viewM26539);
            int position2 = getPosition(viewM26535);
            if (position < position2) {
                accessibilityEvent.setFromIndex(position);
                accessibilityEvent.setToIndex(position2);
            } else {
                accessibilityEvent.setFromIndex(position2);
                accessibilityEvent.setToIndex(position);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final View m26539(boolean z) {
        int iMo9560 = this.f32034.mo9560();
        int iMo9558 = this.f32034.mo9558();
        int childCount = getChildCount();
        View view = null;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int iMo9567 = this.f32034.mo9567(childAt);
            if (this.f32034.mo9555(childAt) > iMo9560 && iMo9567 < iMo9558) {
                if (iMo9567 >= iMo9560 || !z) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    /* JADX INFO: renamed from: ֫ */
    public final View m26535(boolean z) {
        int iMo9560 = this.f32034.mo9560();
        int iMo9558 = this.f32034.mo9558();
        View view = null;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            int iMo9567 = this.f32034.mo9567(childAt);
            int iMo9555 = this.f32034.mo9555(childAt);
            if (iMo9555 > iMo9560 && iMo9567 < iMo9558) {
                if (iMo9555 <= iMo9558 || !z) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m26523(C4792 c4792, C22897 c22897, boolean z) {
        int iMo9558;
        int iM26517 = m26517(Integer.MIN_VALUE);
        if (iM26517 != Integer.MIN_VALUE && (iMo9558 = this.f32034.mo9558() - iM26517) > 0) {
            int i = iMo9558 - (-scrollBy(-iMo9558, c4792, c22897));
            if (!z || i <= 0) {
                return;
            }
            this.f32034.mo9556(i);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m26528(C4792 c4792, C22897 c22897, boolean z) {
        int iMo9560;
        int iM26525 = m26525(Integer.MAX_VALUE);
        if (iM26525 != Integer.MAX_VALUE && (iMo9560 = iM26525 - this.f32034.mo9560()) > 0) {
            int iScrollBy = iMo9560 - scrollBy(iMo9560, c4792, c22897);
            if (!z || iScrollBy <= 0) {
                return;
            }
            this.f32034.mo9556(-iScrollBy);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    /* JADX WARN: Code duplicated, block: B:18:0x0048  */
    /* JADX INFO: renamed from: ۧ */
    private void m26526(int i, C22897 c22897) {
        int iMo9569;
        int i2;
        int iMo95610;
        int i3;
        C12565 c12565 = this.f32042;
        boolean z = false;
        c12565.f35291 = 0;
        c12565.f35293 = i;
        if (isSmoothScrolling() && (i3 = c22897.f72054) != -1) {
            if (this.f32031 == (i3 < i)) {
                iMo9569 = this.f32034.mo9569();
            } else {
                iMo95610 = this.f32034.mo9569();
                i2 = 0;
            }
            if (getClipToPadding()) {
                c12565.f35292 = this.f32034.mo9560() - iMo95610;
                c12565.f35295 = this.f32034.mo9558() + i2;
            } else {
                c12565.f35295 = this.f32034.mo9554() + i2;
                c12565.f35292 = -iMo95610;
            }
            c12565.f35298 = false;
            c12565.f35299 = true;
            if (this.f32034.mo9566() == 0 && this.f32034.mo9554() == 0) {
                z = true;
            }
            c12565.f35297 = z;
        }
        iMo9569 = 0;
        i2 = iMo9569;
        iMo95610 = 0;
        if (getClipToPadding()) {
            c12565.f35292 = this.f32034.mo9560() - iMo95610;
            c12565.f35295 = this.f32034.mo9558() + i2;
        } else {
            c12565.f35295 = this.f32034.mo9554() + i2;
            c12565.f35292 = -iMo95610;
        }
        c12565.f35298 = false;
        c12565.f35299 = true;
        if (this.f32034.mo9566() == 0) {
            z = true;
        }
        c12565.f35297 = z;
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m26534(int i) {
        C12565 c12565 = this.f32042;
        c12565.f35294 = i;
        c12565.f35296 = this.f32031 != (i == -1) ? -1 : 1;
    }

    @Override // p067l.AbstractC18873
    public final void offsetChildrenHorizontal(int i) {
        super.offsetChildrenHorizontal(i);
        for (int i2 = 0; i2 < this.f32038; i2++) {
            C22208 c22208 = this.f32043[i2];
            int i3 = c22208.f70238;
            if (i3 != Integer.MIN_VALUE) {
                c22208.f70238 = i3 + i;
            }
            int i4 = c22208.f70237;
            if (i4 != Integer.MIN_VALUE) {
                c22208.f70237 = i4 + i;
            }
        }
    }

    @Override // p067l.AbstractC18873
    public final void offsetChildrenVertical(int i) {
        super.offsetChildrenVertical(i);
        for (int i2 = 0; i2 < this.f32038; i2++) {
            C22208 c22208 = this.f32043[i2];
            int i3 = c22208.f70238;
            if (i3 != Integer.MIN_VALUE) {
                c22208.f70238 = i3 + i;
            }
            int i4 = c22208.f70237;
            if (i4 != Integer.MIN_VALUE) {
                c22208.f70237 = i4 + i;
            }
        }
    }

    @Override // p067l.AbstractC18873
    public final void onItemsRemoved(C14849 c14849, int i, int i2) {
        m26529(i, i2, 2);
    }

    @Override // p067l.AbstractC18873
    public final void onItemsAdded(C14849 c14849, int i, int i2) {
        m26529(i, i2, 1);
    }

    @Override // p067l.AbstractC18873
    public final void onItemsChanged(C14849 c14849) {
        this.f32052.m36814();
        requestLayout();
    }

    @Override // p067l.AbstractC18873
    public final void onItemsMoved(C14849 c14849, int i, int i2, int i3) {
        m26529(i, i2, 8);
    }

    @Override // p067l.AbstractC18873
    public final void onItemsUpdated(C14849 c14849, int i, int i2, Object obj) {
        m26529(i, i2, 4);
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
    /* JADX INFO: renamed from: ܽ */
    private void m26529(int i, int i2, int i3) {
        int i4;
        int i5;
        C16171 c16171;
        int[] iArr;
        int iM26540;
        ArrayList arrayList;
        int i6;
        C18854 c18854;
        int size;
        int i7;
        int size2;
        int iM26541 = this.f32031 ? m26540() : m26538();
        if (i3 == 8) {
            if (i < i2) {
                i4 = i2 + 1;
            } else {
                i4 = i + 1;
                i5 = i2;
            }
            c16171 = this.f32052;
            iArr = c16171.f47614;
            if (iArr != null && i5 < iArr.length) {
                arrayList = c16171.f47615;
                if (arrayList != null) {
                    if (arrayList == null) {
                        size2 = arrayList.size();
                        do {
                            size2--;
                            if (size2 >= 0) {
                                c18854 = null;
                                break;
                            }
                            c18854 = (C18854) c16171.f47615.get(size2);
                        } while (c18854.f56320 != i5);
                    } else {
                        c18854 = null;
                        break;
                    }
                    if (c18854 != null) {
                        c16171.f47615.remove(c18854);
                    }
                    size = c16171.f47615.size();
                    i7 = 0;
                    while (true) {
                        if (i7 < size) {
                            i7 = -1;
                            break;
                        } else if (((C18854) c16171.f47615.get(i7)).f56320 >= i5) {
                            break;
                        } else {
                            i7++;
                        }
                    }
                    if (i7 != -1) {
                        C18854 c18855 = (C18854) c16171.f47615.get(i7);
                        c16171.f47615.remove(i7);
                        i6 = c18855.f56320;
                    } else {
                        i6 = -1;
                    }
                } else {
                    i6 = -1;
                }
                if (i6 == -1) {
                    int[] iArr2 = c16171.f47614;
                    Arrays.fill(iArr2, i5, iArr2.length, -1);
                    int length = c16171.f47614.length;
                } else {
                    Arrays.fill(c16171.f47614, i5, Math.min(i6 + 1, c16171.f47614.length), -1);
                }
            }
            if (i3 != 1) {
                c16171.m36816(i, i2);
            } else if (i3 != 2) {
                c16171.m36817(i, i2);
            } else if (i3 == 8) {
                c16171.m36817(i, 1);
                c16171.m36816(i2, 1);
            }
            if (i4 <= iM26541) {
                return;
            }
            if (this.f32031) {
                iM26540 = m26538();
            } else {
                iM26540 = m26540();
            }
            if (i5 <= iM26540) {
                requestLayout();
            }
        }
        i4 = i + i2;
        i5 = i;
        c16171 = this.f32052;
        iArr = c16171.f47614;
        if (iArr != null) {
            arrayList = c16171.f47615;
            if (arrayList != null) {
                if (arrayList == null) {
                    size2 = arrayList.size();
                    do {
                        size2--;
                        if (size2 >= 0) {
                            c18854 = null;
                            break;
                        }
                        c18854 = (C18854) c16171.f47615.get(size2);
                    } while (c18854.f56320 != i5);
                } else {
                    c18854 = null;
                    break;
                }
                if (c18854 != null) {
                    c16171.f47615.remove(c18854);
                }
                size = c16171.f47615.size();
                i7 = 0;
                while (true) {
                    if (i7 < size) {
                        i7 = -1;
                        break;
                    } else {
                        if (((C18854) c16171.f47615.get(i7)).f56320 >= i5) {
                            break;
                            break;
                        }
                        i7++;
                    }
                }
                if (i7 != -1) {
                    C18854 c18856 = (C18854) c16171.f47615.get(i7);
                    c16171.f47615.remove(i7);
                    i6 = c18856.f56320;
                } else {
                    i6 = -1;
                }
            } else {
                i6 = -1;
            }
            if (i6 == -1) {
                int[] iArr3 = c16171.f47614;
                Arrays.fill(iArr3, i5, iArr3.length, -1);
                int length2 = c16171.f47614.length;
            } else {
                Arrays.fill(c16171.f47614, i5, Math.min(i6 + 1, c16171.f47614.length), -1);
            }
        }
        if (i3 != 1) {
            c16171.m36816(i, i2);
        } else if (i3 != 2) {
            c16171.m36817(i, i2);
        } else if (i3 == 8) {
            c16171.m36817(i, 1);
            c16171.m36816(i2, 1);
        }
        if (i4 <= iM26541) {
            return;
        }
        if (this.f32031) {
            iM26540 = m26538();
        } else {
            iM26540 = m26540();
        }
        if (i5 <= iM26540) {
            requestLayout();
        }
    }

    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX INFO: renamed from: ֫ */
    private int m26518(C4792 c4792, C12565 c12565, C22897 c22897) {
        int i;
        int iMo9560;
        int iM26517;
        C22208 c22208;
        ?? r1;
        int iMo9559;
        int iMo95510;
        int iMo9561;
        int iMo95511;
        int i2;
        int i3;
        C4792 c4793 = c4792;
        int i4 = 1;
        this.f32035.set(0, this.f32038, true);
        C12565 c12566 = this.f32042;
        if (c12566.f35297) {
            i = c12565.f35294 == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else if (c12565.f35294 == 1) {
            i = c12565.f35295 + c12565.f35291;
        } else {
            i = c12565.f35292 - c12565.f35291;
        }
        int i5 = c12565.f35294;
        for (int i6 = 0; i6 < this.f32038; i6++) {
            if (!this.f32043[i6].f70241.isEmpty()) {
                m26524(this.f32043[i6], i5, i);
            }
        }
        if (this.f32031) {
            iMo9560 = this.f32034.mo9558();
        } else {
            iMo9560 = this.f32034.mo9560();
        }
        boolean z = false;
        C11479 c11479 = this;
        while (true) {
            int i7 = c12565.f35293;
            int i8 = -1;
            if (i7 < 0 || i7 >= c22897.m51124() || (!c12566.f35297 && c11479.f32035.isEmpty())) {
                break;
            }
            View viewM10106 = c4793.m10106(c12565.f35293);
            c12565.f35293 += c12565.f35296;
            C18183 c18183 = (C18183) viewM10106.getLayoutParams();
            int layoutPosition = c18183.f47660.getLayoutPosition();
            C16171 c16171 = c11479.f32052;
            int[] iArr = c16171.f47614;
            int i9 = (iArr == null || layoutPosition >= iArr.length) ? -1 : iArr[layoutPosition];
            if (i9 != -1) {
                c22208 = c11479.f32043[i9];
            } else {
                if (c11479.m26531(c12565.f35294)) {
                    i3 = c11479.f32038 - i4;
                    i2 = -1;
                } else {
                    i8 = c11479.f32038;
                    i2 = 1;
                    i3 = 0;
                }
                C22208 c22209 = null;
                if (c12565.f35294 == i4) {
                    int iMo9562 = c11479.f32034.mo9560();
                    int i10 = Integer.MAX_VALUE;
                    while (i3 != i8) {
                        C22208 c222010 = c11479.f32043[i3];
                        int iM50029 = c222010.m50029(iMo9562);
                        if (iM50029 < i10) {
                            c22209 = c222010;
                            i10 = iM50029;
                        }
                        i3 += i2;
                    }
                } else {
                    int iMo9558 = c11479.f32034.mo9558();
                    int i11 = Integer.MIN_VALUE;
                    while (i3 != i8) {
                        C22208 c222011 = c11479.f32043[i3];
                        int iM50032 = c222011.m50032(iMo9558);
                        if (iM50032 > i11) {
                            c22209 = c222011;
                            i11 = iM50032;
                        }
                        i3 += i2;
                    }
                }
                c22208 = c22209;
                c16171.m36815(layoutPosition);
                c16171.f47614[layoutPosition] = c22208.f70242;
            }
            c18183.f54278 = c22208;
            if (c12565.f35294 == 1) {
                c11479.addView(viewM10106);
                r1 = 0;
            } else {
                r1 = 0;
                c11479.addView(viewM10106, 0);
            }
            if (c11479.f32037 == 1) {
                c11479.m26520(viewM10106, AbstractC18873.m42943(c11479.f32036, c11479.getWidthMode(), r1, ((ViewGroup.MarginLayoutParams) c18183).width, r1), AbstractC18873.m42943(c11479.getHeight(), c11479.getHeightMode(), c11479.getPaddingBottom() + c11479.getPaddingTop(), ((ViewGroup.MarginLayoutParams) c18183).height, true));
            } else {
                c11479.m26520(viewM10106, AbstractC18873.m42943(c11479.getWidth(), c11479.getWidthMode(), c11479.getPaddingRight() + c11479.getPaddingLeft(), ((ViewGroup.MarginLayoutParams) c18183).width, true), AbstractC18873.m42943(c11479.f32036, c11479.getHeightMode(), 0, ((ViewGroup.MarginLayoutParams) c18183).height, false));
            }
            if (c12565.f35294 == 1) {
                iMo95510 = c22208.m50029(iMo9560);
                iMo9559 = c11479.f32034.mo9559(viewM10106) + iMo95510;
            } else {
                int iM50033 = c22208.m50032(iMo9560);
                iMo9559 = iM50033;
                iMo95510 = iM50033 - c11479.f32034.mo9559(viewM10106);
            }
            if (c12565.f35294 == 1) {
                C22208 c222012 = c18183.f54278;
                c222012.getClass();
                C18183 c18184 = (C18183) viewM10106.getLayoutParams();
                c18184.f54278 = c222012;
                ArrayList arrayList = c222012.f70241;
                arrayList.add(viewM10106);
                c222012.f70237 = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    c222012.f70238 = Integer.MIN_VALUE;
                }
                if (c18184.f47660.isRemoved() || c18184.f47660.isUpdated()) {
                    c222012.f70240 = c222012.f70239.f32034.mo9559(viewM10106) + c222012.f70240;
                }
            } else {
                C22208 c222013 = c18183.f54278;
                c222013.getClass();
                C18183 c18185 = (C18183) viewM10106.getLayoutParams();
                c18185.f54278 = c222013;
                ArrayList arrayList2 = c222013.f70241;
                arrayList2.add(0, viewM10106);
                c222013.f70238 = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    c222013.f70237 = Integer.MIN_VALUE;
                }
                if (c18185.f47660.isRemoved() || c18185.f47660.isUpdated()) {
                    c222013.f70240 = c222013.f70239.f32034.mo9559(viewM10106) + c222013.f70240;
                }
            }
            if (c11479.isLayoutRTL() && c11479.f32037 == 1) {
                iMo95511 = c11479.f32049.mo9558() - (((c11479.f32038 - 1) - c22208.f70242) * c11479.f32036);
                iMo9561 = iMo95511 - c11479.f32049.mo9559(viewM10106);
            } else {
                iMo9561 = c11479.f32049.mo9560() + (c22208.f70242 * c11479.f32036);
                iMo95511 = c11479.f32049.mo9559(viewM10106) + iMo9561;
            }
            int i12 = iMo95511;
            int i13 = iMo9561;
            if (c11479.f32037 == 1) {
                c11479.layoutDecoratedWithMargins(viewM10106, i13, iMo95510, i12, iMo9559);
                c11479 = this;
            } else {
                c11479.layoutDecoratedWithMargins(viewM10106, iMo95510, i13, iMo9559, i12);
            }
            c11479.m26524(c22208, c12566.f35294, i);
            c4793 = c4792;
            c11479.m26522(c4793, c12566);
            if (c12566.f35298 && viewM10106.hasFocusable()) {
                c11479.f32035.set(c22208.f70242, false);
            }
            z = true;
            i4 = 1;
        }
        if (!z) {
            c11479.m26522(c4793, c12566);
        }
        if (c12566.f35294 == -1) {
            iM26517 = c11479.f32034.mo9560() - c11479.m26525(c11479.f32034.mo9560());
        } else {
            iM26517 = c11479.m26517(c11479.f32034.mo9558()) - c11479.f32034.mo9558();
        }
        if (iM26517 > 0) {
            return Math.min(c12565.f35291, iM26517);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m26522(C4792 c4792, C12565 c12565) {
        int iMin;
        int iMin2;
        if (!c12565.f35299 || c12565.f35297) {
            return;
        }
        if (c12565.f35291 == 0) {
            if (c12565.f35294 == -1) {
                m26521(c4792, c12565.f35295);
                return;
            } else {
                m26527(c4792, c12565.f35292);
                return;
            }
        }
        int i = 1;
        if (c12565.f35294 == -1) {
            int i2 = c12565.f35292;
            int iM50032 = this.f32043[0].m50032(i2);
            while (i < this.f32038) {
                int iM50033 = this.f32043[i].m50032(i2);
                if (iM50033 > iM50032) {
                    iM50032 = iM50033;
                }
                i++;
            }
            int i3 = i2 - iM50032;
            if (i3 < 0) {
                iMin2 = c12565.f35295;
            } else {
                iMin2 = c12565.f35295 - Math.min(i3, c12565.f35291);
            }
            m26521(c4792, iMin2);
            return;
        }
        int i4 = c12565.f35295;
        int iM50029 = this.f32043[0].m50029(i4);
        while (i < this.f32038) {
            int iM500210 = this.f32043[i].m50029(i4);
            if (iM500210 < iM50029) {
                iM50029 = iM500210;
            }
            i++;
        }
        int i5 = iM50029 - c12565.f35295;
        if (i5 < 0) {
            iMin = c12565.f35292;
        } else {
            iMin = Math.min(i5, c12565.f35291) + c12565.f35292;
        }
        m26527(c4792, iMin);
    }

    /* JADX INFO: renamed from: ۧ */
    private int m26525(int i) {
        int iM50032 = this.f32043[0].m50032(i);
        for (int i2 = 1; i2 < this.f32038; i2++) {
            int iM50033 = this.f32043[i2].m50032(i);
            if (iM50033 < iM50032) {
                iM50032 = iM50033;
            }
        }
        return iM50032;
    }

    /* JADX INFO: renamed from: ֫ */
    private int m26517(int i) {
        int iM50029 = this.f32043[0].m50029(i);
        for (int i2 = 1; i2 < this.f32038; i2++) {
            int iM500210 = this.f32043[i2].m50029(i);
            if (iM500210 > iM50029) {
                iM50029 = iM500210;
            }
        }
        return iM50029;
    }

    /* JADX INFO: renamed from: ۧ */
    private void m26527(C4792 c4792, int i) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (this.f32034.mo9555(childAt) > i || this.f32034.mo9565(childAt) > i) {
                return;
            }
            C18183 c18183 = (C18183) childAt.getLayoutParams();
            c18183.getClass();
            if (c18183.f54278.f70241.size() == 1) {
                return;
            }
            C22208 c22208 = c18183.f54278;
            ArrayList arrayList = c22208.f70241;
            View view = (View) arrayList.remove(0);
            C18183 c18184 = (C18183) view.getLayoutParams();
            c18184.f54278 = null;
            if (arrayList.size() == 0) {
                c22208.f70237 = Integer.MIN_VALUE;
            }
            if (c18184.f47660.isRemoved() || c18184.f47660.isUpdated()) {
                c22208.f70240 -= c22208.f70239.f32034.mo9559(view);
            }
            c22208.f70238 = Integer.MIN_VALUE;
            removeAndRecycleView(childAt, c4792);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m26521(C4792 c4792, int i) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (this.f32034.mo9567(childAt) < i || this.f32034.mo9561(childAt) < i) {
                return;
            }
            C18183 c18183 = (C18183) childAt.getLayoutParams();
            c18183.getClass();
            if (c18183.f54278.f70241.size() == 1) {
                return;
            }
            C22208 c22208 = c18183.f54278;
            ArrayList arrayList = c22208.f70241;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            C18183 c18184 = (C18183) view.getLayoutParams();
            c18184.f54278 = null;
            if (c18184.f47660.isRemoved() || c18184.f47660.isUpdated()) {
                c22208.f70240 -= c22208.f70239.f32034.mo9559(view);
            }
            if (size == 1) {
                c22208.f70238 = Integer.MIN_VALUE;
            }
            c22208.f70237 = Integer.MIN_VALUE;
            removeAndRecycleView(childAt, c4792);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    private boolean m26531(int i) {
        if (this.f32037 == 0) {
            return (i == -1) != this.f32031;
        }
        return ((i == -1) == this.f32031) == isLayoutRTL();
    }

    @Override // p067l.AbstractC18873
    public final boolean canScrollVertically() {
        return this.f32037 == 1;
    }

    @Override // p067l.AbstractC18873
    public final boolean canScrollHorizontally() {
        return this.f32037 == 0;
    }

    @Override // p067l.AbstractC18873
    public final int scrollHorizontallyBy(int i, C4792 c4792, C22897 c22897) {
        return scrollBy(i, c4792, c22897);
    }

    @Override // p067l.AbstractC18873
    public final int scrollVerticallyBy(int i, C4792 c4792, C22897 c22897) {
        return scrollBy(i, c4792, c22897);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001a  */
    @Override // p067l.InterfaceC10156
    public final PointF computeScrollVectorForPosition(int i) {
        int i2 = -1;
        if (getChildCount() == 0) {
            if (this.f32031) {
                i2 = 1;
            }
        } else {
            if ((i < m26538()) == this.f32031) {
                i2 = 1;
            }
        }
        PointF pointF = new PointF();
        if (i2 == 0) {
            return null;
        }
        if (this.f32037 == 0) {
            pointF.x = i2;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = i2;
        return pointF;
    }

    @Override // p067l.AbstractC18873
    public final void smoothScrollToPosition(C14849 c14849, C22897 c22897, int i) {
        C21953 c21953 = new C21953(c14849.getContext());
        c21953.setTargetPosition(i);
        startSmoothScroll(c21953);
    }

    @Override // p067l.AbstractC18873
    public final void scrollToPosition(int i) {
        C8796 c8796 = this.f32050;
        if (c8796 != null && c8796.f23886 != i) {
            c8796.f23880 = null;
            c8796.f23879 = 0;
            c8796.f23886 = -1;
            c8796.f23881 = -1;
        }
        this.f32040 = i;
        this.f32039 = Integer.MIN_VALUE;
        requestLayout();
    }

    @Override // p067l.AbstractC18873
    public final void collectAdjacentPrefetchPositions(int i, int i2, C22897 c22897, InterfaceC18202 interfaceC18202) {
        C12565 c12565;
        int iM50029;
        int iM50032;
        if (this.f32037 != 0) {
            i = i2;
        }
        if (getChildCount() == 0 || i == 0) {
            return;
        }
        m26536(i, c22897);
        int[] iArr = this.f32044;
        if (iArr == null || iArr.length < this.f32038) {
            this.f32044 = new int[this.f32038];
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = this.f32038;
            c12565 = this.f32042;
            if (i3 >= i5) {
                break;
            }
            if (c12565.f35296 == -1) {
                iM50029 = c12565.f35292;
                iM50032 = this.f32043[i3].m50032(iM50029);
            } else {
                iM50029 = this.f32043[i3].m50029(c12565.f35295);
                iM50032 = c12565.f35295;
            }
            int i6 = iM50029 - iM50032;
            if (i6 >= 0) {
                this.f32044[i4] = i6;
                i4++;
            }
            i3++;
        }
        Arrays.sort(this.f32044, 0, i4);
        for (int i7 = 0; i7 < i4; i7++) {
            int i8 = c12565.f35293;
            if (i8 < 0 || i8 >= c22897.m51124()) {
                return;
            }
            ((C20652) interfaceC18202).m46667(c12565.f35293, this.f32044[i7]);
            c12565.f35293 += c12565.f35296;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26536(int i, C22897 c22897) {
        int iM26538;
        int i2;
        if (i > 0) {
            iM26538 = m26540();
            i2 = 1;
        } else {
            iM26538 = m26538();
            i2 = -1;
        }
        C12565 c12565 = this.f32042;
        c12565.f35299 = true;
        m26526(iM26538, c22897);
        m26534(i2);
        c12565.f35293 = iM26538 + c12565.f35296;
        c12565.f35291 = Math.abs(i);
    }

    public final int scrollBy(int i, C4792 c4792, C22897 c22897) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        m26536(i, c22897);
        C12565 c12565 = this.f32042;
        int iM26518 = m26518(c4792, c12565, c22897);
        if (c12565.f35291 >= iM26518) {
            i = i < 0 ? -iM26518 : iM26518;
        }
        this.f32034.mo9556(-i);
        this.f32047 = this.f32031;
        c12565.f35291 = 0;
        m26522(c4792, c12565);
        return i;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m26540() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return 0;
        }
        return getPosition(getChildAt(childCount - 1));
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m26538() {
        if (getChildCount() == 0) {
            return 0;
        }
        return getPosition(getChildAt(0));
    }

    @Override // p067l.AbstractC18873
    public final C16190 generateDefaultLayoutParams() {
        return this.f32037 == 0 ? new C18183(-2, -1) : new C18183(-1, -2);
    }

    @Override // p067l.AbstractC18873
    public final C16190 generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new C18183(context, attributeSet);
    }

    @Override // p067l.AbstractC18873
    public final C16190 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C18183((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C18183(layoutParams);
    }

    @Override // p067l.AbstractC18873
    public final boolean checkLayoutParams(C16190 c16190) {
        return c16190 instanceof C18183;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x005a  */
    /* JADX WARN: Code duplicated, block: B:46:0x005c  */
    @Override // p067l.AbstractC18873
    public final View onFocusSearchFailed(View view, int i, C4792 c4792, C22897 c22897) {
        View viewFindContainingItemView;
        int i2;
        int iM26538;
        int iM50036;
        int iM50037;
        int iM50038;
        if (getChildCount() == 0 || (viewFindContainingItemView = findContainingItemView(view)) == null) {
            return null;
        }
        m26532();
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i == 33) {
                        if (this.f32037 == 1) {
                            i2 = -1;
                        }
                    } else if (i == 66 ? this.f32037 == 0 : !(i != 130 || this.f32037 != 1)) {
                        i2 = 1;
                    }
                    i2 = Integer.MIN_VALUE;
                } else if (this.f32037 == 0) {
                    i2 = -1;
                } else {
                    i2 = Integer.MIN_VALUE;
                }
            } else if (this.f32037 != 1 && isLayoutRTL()) {
                i2 = -1;
            } else {
                i2 = 1;
            }
        } else if (this.f32037 != 1 && isLayoutRTL()) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        C18183 c18183 = (C18183) viewFindContainingItemView.getLayoutParams();
        c18183.getClass();
        C22208 c22208 = c18183.f54278;
        if (i2 == 1) {
            iM26538 = m26540();
        } else {
            iM26538 = m26538();
        }
        m26526(iM26538, c22897);
        m26534(i2);
        C12565 c12565 = this.f32042;
        c12565.f35293 = c12565.f35296 + iM26538;
        c12565.f35291 = (int) (this.f32034.mo9569() * 0.33333334f);
        c12565.f35298 = true;
        c12565.f35299 = false;
        m26518(c4792, c12565, c22897);
        this.f32047 = this.f32031;
        View viewM50033 = c22208.m50033(iM26538, i2);
        if (viewM50033 != null && viewM50033 != viewFindContainingItemView) {
            return viewM50033;
        }
        if (m26531(i2)) {
            for (int i3 = this.f32038 - 1; i3 >= 0; i3--) {
                View viewM50034 = this.f32043[i3].m50033(iM26538, i2);
                if (viewM50034 != null && viewM50034 != viewFindContainingItemView) {
                    return viewM50034;
                }
            }
        } else {
            for (int i4 = 0; i4 < this.f32038; i4++) {
                View viewM50035 = this.f32043[i4].m50033(iM26538, i2);
                if (viewM50035 != null && viewM50035 != viewFindContainingItemView) {
                    return viewM50035;
                }
            }
        }
        boolean z = (this.f32048 ^ true) == (i2 == -1);
        if (z) {
            iM50036 = c22208.m50035();
        } else {
            iM50036 = c22208.m50036();
        }
        View viewFindViewByPosition = findViewByPosition(iM50036);
        if (viewFindViewByPosition != null && viewFindViewByPosition != viewFindContainingItemView) {
            return viewFindViewByPosition;
        }
        if (m26531(i2)) {
            for (int i5 = this.f32038 - 1; i5 >= 0; i5--) {
                if (i5 != c22208.f70242) {
                    if (z) {
                        iM50038 = this.f32043[i5].m50035();
                    } else {
                        iM50038 = this.f32043[i5].m50036();
                    }
                    View viewFindViewByPosition2 = findViewByPosition(iM50038);
                    if (viewFindViewByPosition2 != null && viewFindViewByPosition2 != viewFindContainingItemView) {
                        return viewFindViewByPosition2;
                    }
                }
            }
        } else {
            for (int i6 = 0; i6 < this.f32038; i6++) {
                if (z) {
                    iM50037 = this.f32043[i6].m50035();
                } else {
                    iM50037 = this.f32043[i6].m50036();
                }
                View viewFindViewByPosition3 = findViewByPosition(iM50037);
                if (viewFindViewByPosition3 != null && viewFindViewByPosition3 != viewFindContainingItemView) {
                    return viewFindViewByPosition3;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m26524(C22208 c22208, int i, int i2) {
        int i3 = c22208.f70240;
        int i4 = c22208.f70242;
        if (i == -1) {
            int i5 = c22208.f70238;
            if (i5 == Integer.MIN_VALUE) {
                View view = (View) c22208.f70241.get(0);
                C18183 c18183 = (C18183) view.getLayoutParams();
                c22208.f70238 = c22208.f70239.f32034.mo9567(view);
                c18183.getClass();
                i5 = c22208.f70238;
            }
            if (i5 + i3 <= i2) {
                this.f32035.set(i4, false);
                return;
            }
            return;
        }
        int i6 = c22208.f70237;
        if (i6 == Integer.MIN_VALUE) {
            c22208.m50031();
            i6 = c22208.f70237;
        }
        if (i6 - i3 >= i2) {
            this.f32035.set(i4, false);
        }
    }
}
