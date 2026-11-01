package p067l;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import bin.p000mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.֫ۗۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: B66A */
/* JADX INFO: loaded from: classes2.dex */
public final class C3847 extends AbstractC9212 implements InterfaceC24908 {

    /* JADX INFO: renamed from: ֡ */
    public C14849 f8256;

    /* JADX INFO: renamed from: ۙ */
    public float f8262;

    /* JADX INFO: renamed from: ۜ */
    public C0888 f8264;

    /* JADX INFO: renamed from: ۠ */
    public int f8265;

    /* JADX INFO: renamed from: ۡ */
    public C7910 f8266;

    /* JADX INFO: renamed from: ۢ */
    public float f8267;

    /* JADX INFO: renamed from: ۫ */
    public VelocityTracker f8269;

    /* JADX INFO: renamed from: ۬ */
    public Rect f8270;

    /* JADX INFO: renamed from: ܳ */
    public float f8271;

    /* JADX INFO: renamed from: ܶ */
    public float f8272;

    /* JADX INFO: renamed from: ܺ */
    public float f8273;

    /* JADX INFO: renamed from: ܽ */
    public AbstractC11934 f8274;

    /* JADX INFO: renamed from: ܿ */
    public long f8275;

    /* JADX INFO: renamed from: ᩳ */
    public ArrayList f8276;

    /* JADX INFO: renamed from: ᩶ */
    public ArrayList f8279;

    /* JADX INFO: renamed from: ᩷ */
    public float f8280;

    /* JADX INFO: renamed from: ᩸ */
    public float f8281;

    /* JADX INFO: renamed from: ᩹ */
    public int f8282;

    /* JADX INFO: renamed from: ᩻ */
    public float f8283;

    /* JADX INFO: renamed from: ᩴ */
    public final ArrayList f8277 = new ArrayList();

    /* JADX INFO: renamed from: ۗ */
    public final float[] f8260 = new float[2];

    /* JADX INFO: renamed from: ֨ */
    public AbstractC5462 f8257 = null;

    /* JADX INFO: renamed from: ۧ */
    public int f8268 = -1;

    /* JADX INFO: renamed from: ֫ */
    public int f8258 = 0;

    /* JADX INFO: renamed from: ᩵ */
    public ArrayList f8278 = new ArrayList();

    /* JADX INFO: renamed from: ۚ */
    public final Runnable f8263 = new RunnableC23333(this);

    /* JADX INFO: renamed from: ۘ */
    public View f8261 = null;

    /* JADX INFO: renamed from: ۖ */
    public final InterfaceC22227 f8259 = new C21322(this);

    @Override // p067l.InterfaceC24908
    /* JADX INFO: renamed from: ۧ */
    public final void mo7554(View view) {
    }

    public C3847(AbstractC11934 abstractC11934) {
        this.f8274 = abstractC11934;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m7543(View view, float f, float f2, float f3, float f4) {
        return f >= f3 && f <= f3 + ((float) view.getWidth()) && f2 >= f4 && f2 <= f4 + ((float) view.getHeight());
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m7551(C14849 c14849) {
        C14849 c148410 = this.f8256;
        if (c148410 == c14849) {
            return;
        }
        InterfaceC22227 interfaceC22227 = this.f8259;
        if (c148410 != null) {
            c148410.removeItemDecoration(this);
            this.f8256.removeOnItemTouchListener(interfaceC22227);
            this.f8256.removeOnChildAttachStateChangeListener(this);
            ArrayList arrayList = this.f8278;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                C24003 c24003 = (C24003) arrayList.get(0);
                c24003.f76225.cancel();
                this.f8274.mo27280(this.f8256, c24003.f76224);
            }
            arrayList.clear();
            this.f8261 = null;
            VelocityTracker velocityTracker = this.f8269;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f8269 = null;
            }
            C7910 c7910 = this.f8266;
            if (c7910 != null) {
                c7910.m18264();
                this.f8266 = null;
            }
            if (this.f8264 != null) {
                this.f8264 = null;
            }
        }
        this.f8256 = c14849;
        if (c14849 != null) {
            Resources resources = c14849.getResources();
            this.f8262 = resources.getDimension(R.dimen.MT_Protector);
            this.f8273 = resources.getDimension(R.dimen.MT_Protector);
            this.f8282 = ViewConfiguration.get(this.f8256.getContext()).getScaledTouchSlop();
            this.f8256.addItemDecoration(this);
            this.f8256.addOnItemTouchListener(interfaceC22227);
            this.f8256.addOnChildAttachStateChangeListener(this);
            this.f8266 = new C7910(this);
            this.f8264 = new C0888(this.f8256.getContext(), this.f8266);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m7542(float[] fArr) {
        if ((this.f8265 & 12) != 0) {
            fArr[0] = (this.f8272 + this.f8271) - this.f8257.itemView.getLeft();
        } else {
            fArr[0] = this.f8257.itemView.getTranslationX();
        }
        if ((this.f8265 & 3) != 0) {
            fArr[1] = (this.f8281 + this.f8283) - this.f8257.itemView.getTop();
        } else {
            fArr[1] = this.f8257.itemView.getTranslationY();
        }
    }

    @Override // p067l.AbstractC9212
    public final void onDrawOver(Canvas canvas, C14849 c14849, C22897 c22897) {
        boolean z = false;
        if (this.f8257 != null) {
            float[] fArr = this.f8260;
            m7542(fArr);
            float f = fArr[0];
            float f2 = fArr[1];
        }
        AbstractC5462 abstractC5462 = this.f8257;
        this.f8274.getClass();
        ArrayList arrayList = this.f8278;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C24003 c24003 = (C24003) arrayList.get(i);
            int iSave = canvas.save();
            View view = c24003.f76224.itemView;
            canvas.restoreToCount(iSave);
        }
        if (abstractC5462 != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i2 = size - 1; i2 >= 0; i2--) {
            C24003 c24004 = (C24003) arrayList.get(i2);
            boolean z2 = c24004.f76226;
            if (z2 && !c24004.f76231) {
                arrayList.remove(i2);
            } else if (!z2) {
                z = true;
            }
        }
        if (z) {
            c14849.invalidate();
        }
    }

    @Override // p067l.AbstractC9212
    public final void onDraw(Canvas canvas, C14849 c14849, C22897 c22897) {
        float f;
        float f2;
        if (this.f8257 != null) {
            float[] fArr = this.f8260;
            m7542(fArr);
            float f3 = fArr[0];
            f2 = fArr[1];
            f = f3;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        AbstractC5462 abstractC5462 = this.f8257;
        int i = this.f8258;
        AbstractC11934 abstractC11934 = this.f8274;
        abstractC11934.getClass();
        ArrayList arrayList = this.f8278;
        int i2 = 0;
        for (int size = arrayList.size(); i2 < size; size = size) {
            C24003 c24003 = (C24003) arrayList.get(i2);
            c24003.m53171();
            int iSave = canvas.save();
            abstractC11934.mo27279(canvas, c14849, c24003.f76224, c24003.f76228, c24003.f76222, c24003.f76221, false);
            canvas.restoreToCount(iSave);
            i2++;
        }
        if (abstractC5462 != null) {
            int iSave2 = canvas.save();
            abstractC11934.mo27279(canvas, c14849, abstractC5462, f, f2, i, true);
            canvas.restoreToCount(iSave2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x009b A[PHI: r6
      0x009b: PHI (r6v13 int) = (r6v12 int), (r6v14 int) binds: [B:36:0x0099, B:30:0x0080] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x00b3  */
    /* JADX INFO: renamed from: ֫ */
    public final void m7549(AbstractC5462 abstractC5462, int i) {
        AbstractC11934 abstractC11934;
        boolean z;
        boolean z2;
        int i2;
        char c;
        float fSignum;
        float fSignum2;
        char c2;
        long jM53116;
        int iM7545;
        int iM27275;
        if (abstractC5462 == this.f8257 && i == this.f8258) {
            return;
        }
        this.f8275 = Long.MIN_VALUE;
        int i3 = this.f8258;
        m7550(abstractC5462, true);
        this.f8258 = i;
        if (i == 2) {
            if (abstractC5462 == null) {
                throw new IllegalArgumentException("Must pass a ViewHolder when dragging");
            }
            this.f8261 = abstractC5462.itemView;
        }
        int i4 = (1 << ((i * 8) + 8)) - 1;
        AbstractC5462 abstractC5463 = this.f8257;
        AbstractC11934 abstractC11935 = this.f8274;
        if (abstractC5463 != null) {
            if (abstractC5463.itemView.getParent() != null) {
                if (i3 == 2 || this.f8258 == 2) {
                    i2 = 0;
                } else {
                    int iMo5538 = abstractC11935.mo5538(abstractC5463);
                    C14849 c14849 = this.f8256;
                    int i5 = C1717.f57146;
                    int iM27274 = (AbstractC11934.m27274(iMo5538, c14849.getLayoutDirection()) & 65280) >> 8;
                    if (iM27274 == 0) {
                        i2 = 0;
                    } else {
                        int i6 = (iMo5538 & 65280) >> 8;
                        if (Math.abs(this.f8271) > Math.abs(this.f8283)) {
                            iM7545 = m7544(abstractC5463, iM27274);
                            if (iM7545 <= 0) {
                                iM27275 = m7545(abstractC5463, iM27274);
                                if (iM27275 <= 0) {
                                    i2 = 0;
                                }
                            } else if ((i6 & iM7545) == 0) {
                                iM27275 = AbstractC11934.m27275(iM7545, this.f8256.getLayoutDirection());
                            } else {
                                i2 = iM7545;
                            }
                            i2 = iM27275;
                        } else {
                            iM7545 = m7545(abstractC5463, iM27274);
                            if (iM7545 > 0) {
                                i2 = iM7545;
                            } else {
                                int iM7544 = m7544(abstractC5463, iM27274);
                                if (iM7544 <= 0) {
                                    i2 = 0;
                                } else if ((i6 & iM7544) == 0) {
                                    iM27275 = AbstractC11934.m27275(iM7544, this.f8256.getLayoutDirection());
                                    i2 = iM27275;
                                } else {
                                    i2 = iM7544;
                                }
                            }
                        }
                    }
                }
                VelocityTracker velocityTracker = this.f8269;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f8269 = null;
                }
                if (i2 == 1 || i2 == 2) {
                    c = 0;
                    fSignum = Math.signum(this.f8283) * this.f8256.getHeight();
                    fSignum2 = 0.0f;
                } else {
                    if (i2 == 4 || i2 == 8 || i2 == 16 || i2 == 32) {
                        c = 0;
                        fSignum2 = Math.signum(this.f8271) * this.f8256.getWidth();
                    } else {
                        c = 0;
                        fSignum2 = 0.0f;
                    }
                    fSignum = 0.0f;
                }
                if (i3 == 2) {
                    c2 = '\b';
                } else {
                    c2 = i2 > 0 ? (char) 2 : (char) 4;
                }
                float[] fArr = this.f8260;
                m7542(fArr);
                char c3 = c2;
                C6569 c6569 = new C6569(this, abstractC5463, i3, fArr[c], fArr[1], fSignum2, fSignum, i2, abstractC5463);
                C14849 c148410 = this.f8256;
                abstractC11935.getClass();
                AbstractC23964 itemAnimator = c148410.getItemAnimator();
                if (itemAnimator == null) {
                    jM53116 = c3 == '\b' ? 200L : 250L;
                } else {
                    jM53116 = c3 == '\b' ? itemAnimator.m53116() : itemAnimator.m53113();
                }
                ValueAnimator valueAnimator = c6569.f76225;
                valueAnimator.setDuration(jM53116);
                this.f8278.add(c6569);
                abstractC5463.setIsRecyclable(false);
                valueAnimator.start();
                abstractC11934 = abstractC11935;
                z2 = true;
                z = false;
            } else {
                z = false;
                m7557(abstractC5463.itemView);
                abstractC11934 = abstractC11935;
                abstractC11934.mo27280(this.f8256, abstractC5463);
                z2 = false;
            }
            this.f8257 = null;
        } else {
            abstractC11934 = abstractC11935;
            z = false;
            z2 = false;
        }
        if (abstractC5462 != null) {
            C14849 c148411 = this.f8256;
            int iMo5539 = abstractC11934.mo5538(abstractC5462);
            int i7 = C1717.f57146;
            this.f8265 = (AbstractC11934.m27274(iMo5539, c148411.getLayoutDirection()) & i4) >> (this.f8258 * 8);
            this.f8272 = abstractC5462.itemView.getLeft();
            this.f8281 = abstractC5462.itemView.getTop();
            this.f8257 = abstractC5462;
            if (i == 2) {
                abstractC5462.itemView.performHapticFeedback(z ? 1 : 0);
            }
        }
        ViewParent parent = this.f8256.getParent();
        if (parent != null) {
            if (this.f8257 != null) {
                z = true;
            }
            parent.requestDisallowInterceptTouchEvent(z);
        }
        if (!z2) {
            this.f8256.getLayoutManager().requestSimpleAnimationsInNextLayout();
        }
        abstractC11934.getClass();
        this.f8256.invalidate();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x007a  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c2  */
    /* JADX INFO: renamed from: ֫ */
    public final boolean m7552() {
        int iM27278;
        int iM27279;
        if (this.f8257 == null) {
            this.f8275 = Long.MIN_VALUE;
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.f8275;
        long j2 = j == Long.MIN_VALUE ? 0L : jCurrentTimeMillis - j;
        AbstractC18873 layoutManager = this.f8256.getLayoutManager();
        if (this.f8270 == null) {
            this.f8270 = new Rect();
        }
        layoutManager.calculateItemDecorationsForChild(this.f8257.itemView, this.f8270);
        if (layoutManager.canScrollHorizontally()) {
            int i = (int) (this.f8272 + this.f8271);
            int paddingLeft = (i - this.f8270.left) - this.f8256.getPaddingLeft();
            float f = this.f8271;
            if ((f >= 0.0f || paddingLeft >= 0) && (f <= 0.0f || (paddingLeft = ((this.f8257.itemView.getWidth() + i) + this.f8270.right) - (this.f8256.getWidth() - this.f8256.getPaddingRight())) <= 0)) {
                iM27278 = 0;
            } else {
                iM27278 = paddingLeft;
            }
        } else {
            iM27278 = 0;
        }
        if (layoutManager.canScrollVertically()) {
            int i2 = (int) (this.f8281 + this.f8283);
            int paddingTop = (i2 - this.f8270.top) - this.f8256.getPaddingTop();
            float f2 = this.f8283;
            if ((f2 >= 0.0f || paddingTop >= 0) && (f2 <= 0.0f || (paddingTop = ((this.f8257.itemView.getHeight() + i2) + this.f8270.bottom) - (this.f8256.getHeight() - this.f8256.getPaddingBottom())) <= 0)) {
                iM27279 = 0;
            } else {
                iM27279 = paddingTop;
            }
        } else {
            iM27279 = 0;
        }
        if (iM27278 != 0) {
            C14849 c14849 = this.f8256;
            int width = this.f8257.itemView.getWidth();
            this.f8256.getWidth();
            iM27278 = this.f8274.m27278(c14849, width, iM27278, j2);
        }
        int i3 = iM27278;
        if (iM27279 != 0) {
            C14849 c148410 = this.f8256;
            int height = this.f8257.itemView.getHeight();
            this.f8256.getHeight();
            iM27279 = this.f8274.m27278(c148410, height, iM27279, j2);
        }
        if (i3 != 0 || iM27279 != 0) {
            if (this.f8275 == Long.MIN_VALUE) {
                this.f8275 = jCurrentTimeMillis;
            }
            this.f8256.scrollBy(i3, iM27279);
            return true;
        }
        this.f8275 = Long.MIN_VALUE;
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00b4  */
    /* JADX INFO: renamed from: ֫ */
    public final void m7548(AbstractC5462 abstractC5462) {
        ArrayList arrayList;
        int i;
        int bottom;
        int iAbs;
        int top;
        int iAbs2;
        int left;
        int iAbs3;
        int right;
        int iAbs4;
        if (!this.f8256.isLayoutRequested() && this.f8258 == 2) {
            AbstractC11934 abstractC11934 = this.f8274;
            abstractC11934.getClass();
            int i2 = (int) (this.f8272 + this.f8271);
            int i3 = (int) (this.f8281 + this.f8283);
            if (Math.abs(i3 - abstractC5462.itemView.getTop()) >= abstractC5462.itemView.getHeight() * 0.5f || Math.abs(i2 - abstractC5462.itemView.getLeft()) >= abstractC5462.itemView.getWidth() * 0.5f) {
                ArrayList arrayList2 = this.f8279;
                if (arrayList2 == null) {
                    this.f8279 = new ArrayList();
                    this.f8276 = new ArrayList();
                } else {
                    arrayList2.clear();
                    this.f8276.clear();
                }
                int iRound = Math.round(this.f8272 + this.f8271);
                int iRound2 = Math.round(this.f8281 + this.f8283);
                int width = abstractC5462.itemView.getWidth() + iRound;
                int height = abstractC5462.itemView.getHeight() + iRound2;
                int i4 = (iRound + width) / 2;
                int i5 = (iRound2 + height) / 2;
                AbstractC18873 layoutManager = this.f8256.getLayoutManager();
                int childCount = layoutManager.getChildCount();
                int i6 = 0;
                while (i6 < childCount) {
                    View childAt = layoutManager.getChildAt(i6);
                    if (childAt != abstractC5462.itemView && childAt.getBottom() >= iRound2 && childAt.getTop() <= height && childAt.getRight() >= iRound && childAt.getLeft() <= width) {
                        AbstractC5462 childViewHolder = this.f8256.getChildViewHolder(childAt);
                        if (abstractC11934.mo24771(childViewHolder)) {
                            int iAbs5 = Math.abs(i4 - ((childAt.getRight() + childAt.getLeft()) / 2));
                            int iAbs6 = Math.abs(i5 - ((childAt.getBottom() + childAt.getTop()) / 2));
                            int i7 = (iAbs6 * iAbs6) + (iAbs5 * iAbs5);
                            int size = this.f8279.size();
                            int i8 = 0;
                            int i9 = 0;
                            while (i8 < size) {
                                int i10 = size;
                                if (i7 <= ((Integer) this.f8276.get(i8)).intValue()) {
                                    break;
                                }
                                i9++;
                                i8++;
                                size = i10;
                            }
                            this.f8279.add(i9, childViewHolder);
                            this.f8276.add(i9, Integer.valueOf(i7));
                        }
                    }
                    i6++;
                    layoutManager = layoutManager;
                    iRound2 = iRound2;
                    iRound = iRound;
                }
                ArrayList arrayList3 = this.f8279;
                if (arrayList3.size() == 0) {
                    return;
                }
                int width2 = abstractC5462.itemView.getWidth() + i2;
                int height2 = abstractC5462.itemView.getHeight() + i3;
                int left2 = i2 - abstractC5462.itemView.getLeft();
                int top2 = i3 - abstractC5462.itemView.getTop();
                int size2 = arrayList3.size();
                AbstractC5462 abstractC5463 = null;
                int i11 = -1;
                int i12 = 0;
                while (i12 < size2) {
                    AbstractC5462 abstractC5464 = (AbstractC5462) arrayList3.get(i12);
                    if (left2 <= 0 || (right = abstractC5464.itemView.getRight() - width2) >= 0) {
                        arrayList = arrayList3;
                        i = width2;
                    } else {
                        arrayList = arrayList3;
                        i = width2;
                        if (abstractC5464.itemView.getRight() > abstractC5462.itemView.getRight() && (iAbs4 = Math.abs(right)) > i11) {
                            i11 = iAbs4;
                            abstractC5463 = abstractC5464;
                        }
                    }
                    if (left2 < 0 && (left = abstractC5464.itemView.getLeft() - i2) > 0 && abstractC5464.itemView.getLeft() < abstractC5462.itemView.getLeft() && (iAbs3 = Math.abs(left)) > i11) {
                        i11 = iAbs3;
                        abstractC5463 = abstractC5464;
                    }
                    if (top2 < 0 && (top = abstractC5464.itemView.getTop() - i3) > 0 && abstractC5464.itemView.getTop() < abstractC5462.itemView.getTop() && (iAbs2 = Math.abs(top)) > i11) {
                        i11 = iAbs2;
                        abstractC5463 = abstractC5464;
                    }
                    if (top2 > 0 && (bottom = abstractC5464.itemView.getBottom() - height2) < 0 && abstractC5464.itemView.getBottom() > abstractC5462.itemView.getBottom() && (iAbs = Math.abs(bottom)) > i11) {
                        i11 = iAbs;
                        abstractC5463 = abstractC5464;
                    }
                    i12++;
                    arrayList3 = arrayList;
                    width2 = i;
                }
                if (abstractC5463 == null) {
                    this.f8279.clear();
                    this.f8276.clear();
                    return;
                }
                int absoluteAdapterPosition = abstractC5463.getAbsoluteAdapterPosition();
                int absoluteAdapterPosition2 = abstractC5462.getAbsoluteAdapterPosition();
                if (abstractC11934.mo5537(this.f8256, abstractC5462, abstractC5463)) {
                    this.f8274.mo27281(this.f8256, abstractC5462, absoluteAdapterPosition2, abstractC5463, absoluteAdapterPosition, i2, i3);
                }
            }
        }
    }

    @Override // p067l.InterfaceC24908
    /* JADX INFO: renamed from: ֫ */
    public final void mo7547(View view) {
        m7557(view);
        AbstractC5462 childViewHolder = this.f8256.getChildViewHolder(view);
        if (childViewHolder == null) {
            return;
        }
        AbstractC5462 abstractC5462 = this.f8257;
        if (abstractC5462 != null && childViewHolder == abstractC5462) {
            m7549((AbstractC5462) null, 0);
            return;
        }
        m7550(childViewHolder, false);
        if (this.f8277.remove(childViewHolder.itemView)) {
            this.f8274.mo27280(this.f8256, childViewHolder);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m7550(AbstractC5462 abstractC5462, boolean z) {
        C24003 c24003;
        ArrayList arrayList = this.f8278;
        int size = arrayList.size();
        do {
            size--;
            if (size < 0) {
                return;
            } else {
                c24003 = (C24003) arrayList.get(size);
            }
        } while (c24003.f76224 != abstractC5462);
        c24003.f76230 |= z;
        if (!c24003.f76226) {
            c24003.f76225.cancel();
        }
        arrayList.remove(size);
    }

    @Override // p067l.AbstractC9212
    public final void getItemOffsets(Rect rect, View view, C14849 c14849, C22897 c22897) {
        rect.setEmpty();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m7546(int i, int i2, MotionEvent motionEvent) {
        View viewM7556;
        if (this.f8257 == null && i == 2 && this.f8258 != 2) {
            AbstractC11934 abstractC11934 = this.f8274;
            if (abstractC11934.mo5539() && this.f8256.getScrollState() != 1) {
                AbstractC18873 layoutManager = this.f8256.getLayoutManager();
                int i3 = this.f8268;
                AbstractC5462 childViewHolder = null;
                if (i3 != -1) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(i3);
                    float x = motionEvent.getX(iFindPointerIndex) - this.f8280;
                    float y = motionEvent.getY(iFindPointerIndex) - this.f8267;
                    float fAbs = Math.abs(x);
                    float fAbs2 = Math.abs(y);
                    float f = this.f8282;
                    if ((fAbs >= f || fAbs2 >= f) && ((fAbs <= fAbs2 || !layoutManager.canScrollHorizontally()) && ((fAbs2 <= fAbs || !layoutManager.canScrollVertically()) && (viewM7556 = m7556(motionEvent)) != null))) {
                        childViewHolder = this.f8256.getChildViewHolder(viewM7556);
                    }
                }
                if (childViewHolder == null) {
                    return;
                }
                C14849 c14849 = this.f8256;
                int iMo5538 = abstractC11934.mo5538(childViewHolder);
                int i4 = C1717.f57146;
                int iM27274 = (AbstractC11934.m27274(iMo5538, c14849.getLayoutDirection()) & 65280) >> 8;
                if (iM27274 == 0) {
                    return;
                }
                float x2 = motionEvent.getX(i2);
                float y2 = motionEvent.getY(i2);
                float f2 = x2 - this.f8280;
                float f3 = y2 - this.f8267;
                float fAbs3 = Math.abs(f2);
                float fAbs4 = Math.abs(f3);
                float f4 = this.f8282;
                if (fAbs3 >= f4 || fAbs4 >= f4) {
                    if (fAbs3 > fAbs4) {
                        if (f2 < 0.0f && (iM27274 & 4) == 0) {
                            return;
                        }
                        if (f2 > 0.0f && (iM27274 & 8) == 0) {
                            return;
                        }
                    } else {
                        if (f3 < 0.0f && (iM27274 & 1) == 0) {
                            return;
                        }
                        if (f3 > 0.0f && (iM27274 & 2) == 0) {
                            return;
                        }
                    }
                    this.f8283 = 0.0f;
                    this.f8271 = 0.0f;
                    this.f8268 = motionEvent.getPointerId(0);
                    m7549(childViewHolder, 1);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final View m7556(MotionEvent motionEvent) {
        C24003 c24003;
        View view;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        AbstractC5462 abstractC5462 = this.f8257;
        if (abstractC5462 != null) {
            View view2 = abstractC5462.itemView;
            if (m7543(view2, x, y, this.f8272 + this.f8271, this.f8281 + this.f8283)) {
                return view2;
            }
        }
        ArrayList arrayList = this.f8278;
        int size = arrayList.size();
        do {
            size--;
            if (size >= 0) {
                c24003 = (C24003) arrayList.get(size);
                view = c24003.f76224.itemView;
            } else {
                return this.f8256.findChildViewUnder(x, y);
            }
        } while (!m7543(view, x, y, c24003.f76228, c24003.f76222));
        return view;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m7555(AbstractC5462 abstractC5462) {
        C14849 c14849 = this.f8256;
        int iMo5538 = this.f8274.mo5538(abstractC5462);
        int i = C1717.f57146;
        if ((AbstractC11934.m27274(iMo5538, c14849.getLayoutDirection()) & 16711680) == 0 || abstractC5462.itemView.getParent() != this.f8256) {
            return;
        }
        VelocityTracker velocityTracker = this.f8269;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f8269 = VelocityTracker.obtain();
        this.f8283 = 0.0f;
        this.f8271 = 0.0f;
        m7549(abstractC5462, 2);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m7553(int i, int i2, MotionEvent motionEvent) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f = x - this.f8280;
        this.f8271 = f;
        this.f8283 = y - this.f8267;
        if ((i & 4) == 0) {
            this.f8271 = Math.max(0.0f, f);
        }
        if ((i & 8) == 0) {
            this.f8271 = Math.min(0.0f, this.f8271);
        }
        if ((i & 1) == 0) {
            this.f8283 = Math.max(0.0f, this.f8283);
        }
        if ((i & 2) == 0) {
            this.f8283 = Math.min(0.0f, this.f8283);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private int m7544(AbstractC5462 abstractC5462, int i) {
        if ((i & 12) == 0) {
            return 0;
        }
        int i2 = this.f8271 > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.f8269;
        AbstractC11934 abstractC11934 = this.f8274;
        if (velocityTracker != null && this.f8268 > -1) {
            float f = this.f8273;
            abstractC11934.getClass();
            velocityTracker.computeCurrentVelocity(1000, f);
            float xVelocity = this.f8269.getXVelocity(this.f8268);
            float yVelocity = this.f8269.getYVelocity(this.f8268);
            int i3 = xVelocity > 0.0f ? 8 : 4;
            float fAbs = Math.abs(xVelocity);
            if ((i3 & i) != 0 && i2 == i3 && fAbs >= this.f8262 && fAbs > Math.abs(yVelocity)) {
                return i3;
            }
        }
        float fMo27277 = abstractC11934.mo27277() * this.f8256.getWidth();
        if ((i & i2) == 0 || Math.abs(this.f8271) <= fMo27277) {
            return 0;
        }
        return i2;
    }

    /* JADX INFO: renamed from: ܽ */
    private int m7545(AbstractC5462 abstractC5462, int i) {
        if ((i & 3) == 0) {
            return 0;
        }
        int i2 = this.f8283 > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.f8269;
        AbstractC11934 abstractC11934 = this.f8274;
        if (velocityTracker != null && this.f8268 > -1) {
            float f = this.f8273;
            abstractC11934.getClass();
            velocityTracker.computeCurrentVelocity(1000, f);
            float xVelocity = this.f8269.getXVelocity(this.f8268);
            float yVelocity = this.f8269.getYVelocity(this.f8268);
            int i3 = yVelocity > 0.0f ? 2 : 1;
            float fAbs = Math.abs(yVelocity);
            if ((i3 & i) != 0 && i3 == i2 && fAbs >= this.f8262 && fAbs > Math.abs(xVelocity)) {
                return i3;
            }
        }
        float fMo27277 = abstractC11934.mo27277() * this.f8256.getHeight();
        if ((i & i2) == 0 || Math.abs(this.f8283) <= fMo27277) {
            return 0;
        }
        return i2;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m7557(View view) {
        if (view == this.f8261) {
            this.f8261 = null;
        }
    }
}
