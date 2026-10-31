package l;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.֫ۗۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: B66A */
/* JADX INFO: loaded from: classes2.dex */
public final class C1556 extends AbstractC7201 implements InterfaceC23716 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C13132 f5475;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float f5481;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C0923 f5483;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f5484;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C5831 f5485;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public float f5486;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public VelocityTracker f5488;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public Rect f5489;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public float f5490;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public float f5491;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public float f5492;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public AbstractC10065 f5493;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f5494;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public ArrayList f5495;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ArrayList f5498;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public float f5499;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public float f5500;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f5501;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public float f5502;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final ArrayList f5496 = new ArrayList();

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final float[] f5479 = new float[2];

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public AbstractC3255 f5476 = null;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f5487 = -1;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f5477 = 0;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public ArrayList f5497 = new ArrayList();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Runnable f5482 = new RunnableC22059(this);

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public View f5480 = null;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20895 f5478 = new C19943(this);

    @Override // l.InterfaceC23716
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo5325(View view) {
    }

    public C1556(AbstractC10065 abstractC10065) {
        this.f5493 = abstractC10065;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m5314(View view, float f, float f2, float f3, float f4) {
        return f >= f3 && f <= f3 + ((float) view.getWidth()) && f2 >= f4 && f2 <= f4 + ((float) view.getHeight());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5322(C13132 c13132) {
        C13132 c13133 = this.f5475;
        if (c13133 == c13132) {
            return;
        }
        InterfaceC20895 interfaceC20895 = this.f5478;
        if (c13133 != null) {
            c13133.removeItemDecoration(this);
            this.f5475.removeOnItemTouchListener(interfaceC20895);
            this.f5475.removeOnChildAttachStateChangeListener(this);
            ArrayList arrayList = this.f5497;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                C22764 c22764 = (C22764) arrayList.get(0);
                c22764.f73499.cancel();
                this.f5493.mo25263(this.f5475, c22764.f73498);
            }
            arrayList.clear();
            this.f5480 = null;
            VelocityTracker velocityTracker = this.f5488;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f5488 = null;
            }
            C5831 c5831 = this.f5485;
            if (c5831 != null) {
                c5831.m16339();
                this.f5485 = null;
            }
            if (this.f5483 != null) {
                this.f5483 = null;
            }
        }
        this.f5475 = c13132;
        if (c13132 != null) {
            Resources resources = c13132.getResources();
            this.f5481 = resources.getDimension(R.dimen.MT_Protector);
            this.f5492 = resources.getDimension(R.dimen.MT_Protector);
            this.f5501 = ViewConfiguration.get(this.f5475.getContext()).getScaledTouchSlop();
            this.f5475.addItemDecoration(this);
            this.f5475.addOnItemTouchListener(interfaceC20895);
            this.f5475.addOnChildAttachStateChangeListener(this);
            this.f5485 = new C5831(this);
            this.f5483 = new C0923(this.f5475.getContext(), this.f5485);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m5313(float[] fArr) {
        if ((this.f5484 & 12) != 0) {
            fArr[0] = (this.f5491 + this.f5490) - this.f5476.itemView.getLeft();
        } else {
            fArr[0] = this.f5476.itemView.getTranslationX();
        }
        if ((this.f5484 & 3) != 0) {
            fArr[1] = (this.f5500 + this.f5502) - this.f5476.itemView.getTop();
        } else {
            fArr[1] = this.f5476.itemView.getTranslationY();
        }
    }

    @Override // l.AbstractC7201
    public final void onDrawOver(Canvas canvas, C13132 c13132, C21600 c21600) {
        boolean z = false;
        if (this.f5476 != null) {
            float[] fArr = this.f5479;
            m5313(fArr);
            float f = fArr[0];
            float f2 = fArr[1];
        }
        AbstractC3255 abstractC3255 = this.f5476;
        this.f5493.getClass();
        ArrayList arrayList = this.f5497;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C22764 c22764 = (C22764) arrayList.get(i);
            int iSave = canvas.save();
            View view = c22764.f73498.itemView;
            canvas.restoreToCount(iSave);
        }
        if (abstractC3255 != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i2 = size - 1; i2 >= 0; i2--) {
            C22764 c22765 = (C22764) arrayList.get(i2);
            boolean z2 = c22765.f73500;
            if (z2 && !c22765.f73505) {
                arrayList.remove(i2);
            } else if (!z2) {
                z = true;
            }
        }
        if (z) {
            c13132.invalidate();
        }
    }

    @Override // l.AbstractC7201
    public final void onDraw(Canvas canvas, C13132 c13132, C21600 c21600) {
        float f;
        float f2;
        if (this.f5476 != null) {
            float[] fArr = this.f5479;
            m5313(fArr);
            float f3 = fArr[0];
            f2 = fArr[1];
            f = f3;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        AbstractC3255 abstractC3255 = this.f5476;
        int i = this.f5477;
        AbstractC10065 abstractC10065 = this.f5493;
        abstractC10065.getClass();
        ArrayList arrayList = this.f5497;
        int i2 = 0;
        for (int size = arrayList.size(); i2 < size; size = size) {
            C22764 c22764 = (C22764) arrayList.get(i2);
            c22764.m50838();
            int iSave = canvas.save();
            abstractC10065.mo25262(canvas, c13132, c22764.f73498, c22764.f73502, c22764.f73496, c22764.f73495, false);
            canvas.restoreToCount(iSave);
            i2++;
        }
        if (abstractC3255 != null) {
            int iSave2 = canvas.save();
            abstractC10065.mo25262(canvas, c13132, abstractC3255, f, f2, i, true);
            canvas.restoreToCount(iSave2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x009b A[PHI: r6
      0x009b: PHI (r6v13 int) = (r6v12 int), (r6v14 int) binds: [B:36:0x0099, B:30:0x0080] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x00b3  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5320(AbstractC3255 abstractC3255, int i) {
        AbstractC10065 abstractC10065;
        boolean z;
        boolean z2;
        int i2;
        char c;
        float fSignum;
        float fSignum2;
        char c2;
        long jM50790;
        int iM5316;
        int iM25258;
        if (abstractC3255 == this.f5476 && i == this.f5477) {
            return;
        }
        this.f5494 = Long.MIN_VALUE;
        int i3 = this.f5477;
        m5321(abstractC3255, true);
        this.f5477 = i;
        if (i == 2) {
            if (abstractC3255 == null) {
                throw new IllegalArgumentException("Must pass a ViewHolder when dragging");
            }
            this.f5480 = abstractC3255.itemView;
        }
        int i4 = (1 << ((i * 8) + 8)) - 1;
        AbstractC3255 abstractC3256 = this.f5476;
        AbstractC10065 abstractC10066 = this.f5493;
        if (abstractC3256 != null) {
            if (abstractC3256.itemView.getParent() != null) {
                if (i3 == 2 || this.f5477 == 2) {
                    i2 = 0;
                } else {
                    int iMo3224 = abstractC10066.mo3224(abstractC3256);
                    C13132 c13132 = this.f5475;
                    int i5 = C17648.f53953;
                    int iM25257 = (AbstractC10065.m25257(iMo3224, c13132.getLayoutDirection()) & 65280) >> 8;
                    if (iM25257 == 0) {
                        i2 = 0;
                    } else {
                        int i6 = (iMo3224 & 65280) >> 8;
                        if (Math.abs(this.f5490) > Math.abs(this.f5502)) {
                            iM5316 = m5315(abstractC3256, iM25257);
                            if (iM5316 <= 0) {
                                iM25258 = m5316(abstractC3256, iM25257);
                                if (iM25258 <= 0) {
                                    i2 = 0;
                                }
                            } else if ((i6 & iM5316) == 0) {
                                iM25258 = AbstractC10065.m25258(iM5316, this.f5475.getLayoutDirection());
                            } else {
                                i2 = iM5316;
                            }
                            i2 = iM25258;
                        } else {
                            iM5316 = m5316(abstractC3256, iM25257);
                            if (iM5316 > 0) {
                                i2 = iM5316;
                            } else {
                                int iM5315 = m5315(abstractC3256, iM25257);
                                if (iM5315 <= 0) {
                                    i2 = 0;
                                } else if ((i6 & iM5315) == 0) {
                                    iM25258 = AbstractC10065.m25258(iM5315, this.f5475.getLayoutDirection());
                                    i2 = iM25258;
                                } else {
                                    i2 = iM5315;
                                }
                            }
                        }
                    }
                }
                VelocityTracker velocityTracker = this.f5488;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f5488 = null;
                }
                if (i2 == 1 || i2 == 2) {
                    c = 0;
                    fSignum = Math.signum(this.f5502) * this.f5475.getHeight();
                    fSignum2 = 0.0f;
                } else {
                    if (i2 == 4 || i2 == 8 || i2 == 16 || i2 == 32) {
                        c = 0;
                        fSignum2 = Math.signum(this.f5490) * this.f5475.getWidth();
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
                float[] fArr = this.f5479;
                m5313(fArr);
                char c3 = c2;
                C4420 c4420 = new C4420(this, abstractC3256, i3, fArr[c], fArr[1], fSignum2, fSignum, i2, abstractC3256);
                C13132 c13133 = this.f5475;
                abstractC10066.getClass();
                AbstractC22723 itemAnimator = c13133.getItemAnimator();
                if (itemAnimator == null) {
                    jM50790 = c3 == '\b' ? 200L : 250L;
                } else {
                    jM50790 = c3 == '\b' ? itemAnimator.m50790() : itemAnimator.m50787();
                }
                ValueAnimator valueAnimator = c4420.f73499;
                valueAnimator.setDuration(jM50790);
                this.f5497.add(c4420);
                abstractC3256.setIsRecyclable(false);
                valueAnimator.start();
                abstractC10065 = abstractC10066;
                z2 = true;
                z = false;
            } else {
                z = false;
                m5328(abstractC3256.itemView);
                abstractC10065 = abstractC10066;
                abstractC10065.mo25263(this.f5475, abstractC3256);
                z2 = false;
            }
            this.f5476 = null;
        } else {
            abstractC10065 = abstractC10066;
            z = false;
            z2 = false;
        }
        if (abstractC3255 != null) {
            C13132 c13134 = this.f5475;
            int iMo3225 = abstractC10065.mo3224(abstractC3255);
            int i7 = C17648.f53953;
            this.f5484 = (AbstractC10065.m25257(iMo3225, c13134.getLayoutDirection()) & i4) >> (this.f5477 * 8);
            this.f5491 = abstractC3255.itemView.getLeft();
            this.f5500 = abstractC3255.itemView.getTop();
            this.f5476 = abstractC3255;
            if (i == 2) {
                abstractC3255.itemView.performHapticFeedback(z ? 1 : 0);
            }
        }
        ViewParent parent = this.f5475.getParent();
        if (parent != null) {
            if (this.f5476 != null) {
                z = true;
            }
            parent.requestDisallowInterceptTouchEvent(z);
        }
        if (!z2) {
            this.f5475.getLayoutManager().requestSimpleAnimationsInNextLayout();
        }
        abstractC10065.getClass();
        this.f5475.invalidate();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x007a  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c2  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m5323() {
        int iM25261;
        int iM25262;
        if (this.f5476 == null) {
            this.f5494 = Long.MIN_VALUE;
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.f5494;
        long j2 = j == Long.MIN_VALUE ? 0L : jCurrentTimeMillis - j;
        AbstractC17366 layoutManager = this.f5475.getLayoutManager();
        if (this.f5489 == null) {
            this.f5489 = new Rect();
        }
        layoutManager.calculateItemDecorationsForChild(this.f5476.itemView, this.f5489);
        if (layoutManager.canScrollHorizontally()) {
            int i = (int) (this.f5491 + this.f5490);
            int paddingLeft = (i - this.f5489.left) - this.f5475.getPaddingLeft();
            float f = this.f5490;
            if ((f >= 0.0f || paddingLeft >= 0) && (f <= 0.0f || (paddingLeft = ((this.f5476.itemView.getWidth() + i) + this.f5489.right) - (this.f5475.getWidth() - this.f5475.getPaddingRight())) <= 0)) {
                iM25261 = 0;
            } else {
                iM25261 = paddingLeft;
            }
        } else {
            iM25261 = 0;
        }
        if (layoutManager.canScrollVertically()) {
            int i2 = (int) (this.f5500 + this.f5502);
            int paddingTop = (i2 - this.f5489.top) - this.f5475.getPaddingTop();
            float f2 = this.f5502;
            if ((f2 >= 0.0f || paddingTop >= 0) && (f2 <= 0.0f || (paddingTop = ((this.f5476.itemView.getHeight() + i2) + this.f5489.bottom) - (this.f5475.getHeight() - this.f5475.getPaddingBottom())) <= 0)) {
                iM25262 = 0;
            } else {
                iM25262 = paddingTop;
            }
        } else {
            iM25262 = 0;
        }
        if (iM25261 != 0) {
            C13132 c13132 = this.f5475;
            int width = this.f5476.itemView.getWidth();
            this.f5475.getWidth();
            iM25261 = this.f5493.m25261(c13132, width, iM25261, j2);
        }
        int i3 = iM25261;
        if (iM25262 != 0) {
            C13132 c13133 = this.f5475;
            int height = this.f5476.itemView.getHeight();
            this.f5475.getHeight();
            iM25262 = this.f5493.m25261(c13133, height, iM25262, j2);
        }
        if (i3 != 0 || iM25262 != 0) {
            if (this.f5494 == Long.MIN_VALUE) {
                this.f5494 = jCurrentTimeMillis;
            }
            this.f5475.scrollBy(i3, iM25262);
            return true;
        }
        this.f5494 = Long.MIN_VALUE;
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00b4  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5319(AbstractC3255 abstractC3255) {
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
        if (!this.f5475.isLayoutRequested() && this.f5477 == 2) {
            AbstractC10065 abstractC10065 = this.f5493;
            abstractC10065.getClass();
            int i2 = (int) (this.f5491 + this.f5490);
            int i3 = (int) (this.f5500 + this.f5502);
            if (Math.abs(i3 - abstractC3255.itemView.getTop()) >= abstractC3255.itemView.getHeight() * 0.5f || Math.abs(i2 - abstractC3255.itemView.getLeft()) >= abstractC3255.itemView.getWidth() * 0.5f) {
                ArrayList arrayList2 = this.f5498;
                if (arrayList2 == null) {
                    this.f5498 = new ArrayList();
                    this.f5495 = new ArrayList();
                } else {
                    arrayList2.clear();
                    this.f5495.clear();
                }
                int iRound = Math.round(this.f5491 + this.f5490);
                int iRound2 = Math.round(this.f5500 + this.f5502);
                int width = abstractC3255.itemView.getWidth() + iRound;
                int height = abstractC3255.itemView.getHeight() + iRound2;
                int i4 = (iRound + width) / 2;
                int i5 = (iRound2 + height) / 2;
                AbstractC17366 layoutManager = this.f5475.getLayoutManager();
                int childCount = layoutManager.getChildCount();
                int i6 = 0;
                while (i6 < childCount) {
                    View childAt = layoutManager.getChildAt(i6);
                    if (childAt != abstractC3255.itemView && childAt.getBottom() >= iRound2 && childAt.getTop() <= height && childAt.getRight() >= iRound && childAt.getLeft() <= width) {
                        AbstractC3255 childViewHolder = this.f5475.getChildViewHolder(childAt);
                        if (abstractC10065.mo22801(childViewHolder)) {
                            int iAbs5 = Math.abs(i4 - ((childAt.getRight() + childAt.getLeft()) / 2));
                            int iAbs6 = Math.abs(i5 - ((childAt.getBottom() + childAt.getTop()) / 2));
                            int i7 = (iAbs6 * iAbs6) + (iAbs5 * iAbs5);
                            int size = this.f5498.size();
                            int i8 = 0;
                            int i9 = 0;
                            while (i8 < size) {
                                int i10 = size;
                                if (i7 <= ((Integer) this.f5495.get(i8)).intValue()) {
                                    break;
                                }
                                i9++;
                                i8++;
                                size = i10;
                            }
                            this.f5498.add(i9, childViewHolder);
                            this.f5495.add(i9, Integer.valueOf(i7));
                        }
                    }
                    i6++;
                    layoutManager = layoutManager;
                    iRound2 = iRound2;
                    iRound = iRound;
                }
                ArrayList arrayList3 = this.f5498;
                if (arrayList3.size() == 0) {
                    return;
                }
                int width2 = abstractC3255.itemView.getWidth() + i2;
                int height2 = abstractC3255.itemView.getHeight() + i3;
                int left2 = i2 - abstractC3255.itemView.getLeft();
                int top2 = i3 - abstractC3255.itemView.getTop();
                int size2 = arrayList3.size();
                AbstractC3255 abstractC3256 = null;
                int i11 = -1;
                int i12 = 0;
                while (i12 < size2) {
                    AbstractC3255 abstractC3257 = (AbstractC3255) arrayList3.get(i12);
                    if (left2 <= 0 || (right = abstractC3257.itemView.getRight() - width2) >= 0) {
                        arrayList = arrayList3;
                        i = width2;
                    } else {
                        arrayList = arrayList3;
                        i = width2;
                        if (abstractC3257.itemView.getRight() > abstractC3255.itemView.getRight() && (iAbs4 = Math.abs(right)) > i11) {
                            i11 = iAbs4;
                            abstractC3256 = abstractC3257;
                        }
                    }
                    if (left2 < 0 && (left = abstractC3257.itemView.getLeft() - i2) > 0 && abstractC3257.itemView.getLeft() < abstractC3255.itemView.getLeft() && (iAbs3 = Math.abs(left)) > i11) {
                        i11 = iAbs3;
                        abstractC3256 = abstractC3257;
                    }
                    if (top2 < 0 && (top = abstractC3257.itemView.getTop() - i3) > 0 && abstractC3257.itemView.getTop() < abstractC3255.itemView.getTop() && (iAbs2 = Math.abs(top)) > i11) {
                        i11 = iAbs2;
                        abstractC3256 = abstractC3257;
                    }
                    if (top2 > 0 && (bottom = abstractC3257.itemView.getBottom() - height2) < 0 && abstractC3257.itemView.getBottom() > abstractC3255.itemView.getBottom() && (iAbs = Math.abs(bottom)) > i11) {
                        i11 = iAbs;
                        abstractC3256 = abstractC3257;
                    }
                    i12++;
                    arrayList3 = arrayList;
                    width2 = i;
                }
                if (abstractC3256 == null) {
                    this.f5498.clear();
                    this.f5495.clear();
                    return;
                }
                int absoluteAdapterPosition = abstractC3256.getAbsoluteAdapterPosition();
                int absoluteAdapterPosition2 = abstractC3255.getAbsoluteAdapterPosition();
                if (abstractC10065.mo3223(this.f5475, abstractC3255, abstractC3256)) {
                    this.f5493.mo25264(this.f5475, abstractC3255, absoluteAdapterPosition2, abstractC3256, absoluteAdapterPosition, i2, i3);
                }
            }
        }
    }

    @Override // l.InterfaceC23716
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo5318(View view) {
        m5328(view);
        AbstractC3255 childViewHolder = this.f5475.getChildViewHolder(view);
        if (childViewHolder == null) {
            return;
        }
        AbstractC3255 abstractC3255 = this.f5476;
        if (abstractC3255 != null && childViewHolder == abstractC3255) {
            m5320((AbstractC3255) null, 0);
            return;
        }
        m5321(childViewHolder, false);
        if (this.f5496.remove(childViewHolder.itemView)) {
            this.f5493.mo25263(this.f5475, childViewHolder);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5321(AbstractC3255 abstractC3255, boolean z) {
        C22764 c22764;
        ArrayList arrayList = this.f5497;
        int size = arrayList.size();
        do {
            size--;
            if (size < 0) {
                return;
            } else {
                c22764 = (C22764) arrayList.get(size);
            }
        } while (c22764.f73498 != abstractC3255);
        c22764.f73504 |= z;
        if (!c22764.f73500) {
            c22764.f73499.cancel();
        }
        arrayList.remove(size);
    }

    @Override // l.AbstractC7201
    public final void getItemOffsets(Rect rect, View view, C13132 c13132, C21600 c21600) {
        rect.setEmpty();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5317(int i, int i2, MotionEvent motionEvent) {
        View viewM5327;
        if (this.f5476 == null && i == 2 && this.f5477 != 2) {
            AbstractC10065 abstractC10065 = this.f5493;
            if (abstractC10065.mo3225() && this.f5475.getScrollState() != 1) {
                AbstractC17366 layoutManager = this.f5475.getLayoutManager();
                int i3 = this.f5487;
                AbstractC3255 childViewHolder = null;
                if (i3 != -1) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(i3);
                    float x = motionEvent.getX(iFindPointerIndex) - this.f5499;
                    float y = motionEvent.getY(iFindPointerIndex) - this.f5486;
                    float fAbs = Math.abs(x);
                    float fAbs2 = Math.abs(y);
                    float f = this.f5501;
                    if ((fAbs >= f || fAbs2 >= f) && ((fAbs <= fAbs2 || !layoutManager.canScrollHorizontally()) && ((fAbs2 <= fAbs || !layoutManager.canScrollVertically()) && (viewM5327 = m5327(motionEvent)) != null))) {
                        childViewHolder = this.f5475.getChildViewHolder(viewM5327);
                    }
                }
                if (childViewHolder == null) {
                    return;
                }
                C13132 c13132 = this.f5475;
                int iMo3224 = abstractC10065.mo3224(childViewHolder);
                int i4 = C17648.f53953;
                int iM25257 = (AbstractC10065.m25257(iMo3224, c13132.getLayoutDirection()) & 65280) >> 8;
                if (iM25257 == 0) {
                    return;
                }
                float x2 = motionEvent.getX(i2);
                float y2 = motionEvent.getY(i2);
                float f2 = x2 - this.f5499;
                float f3 = y2 - this.f5486;
                float fAbs3 = Math.abs(f2);
                float fAbs4 = Math.abs(f3);
                float f4 = this.f5501;
                if (fAbs3 >= f4 || fAbs4 >= f4) {
                    if (fAbs3 > fAbs4) {
                        if (f2 < 0.0f && (iM25257 & 4) == 0) {
                            return;
                        }
                        if (f2 > 0.0f && (iM25257 & 8) == 0) {
                            return;
                        }
                    } else {
                        if (f3 < 0.0f && (iM25257 & 1) == 0) {
                            return;
                        }
                        if (f3 > 0.0f && (iM25257 & 2) == 0) {
                            return;
                        }
                    }
                    this.f5502 = 0.0f;
                    this.f5490 = 0.0f;
                    this.f5487 = motionEvent.getPointerId(0);
                    m5320(childViewHolder, 1);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final View m5327(MotionEvent motionEvent) {
        C22764 c22764;
        View view;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        AbstractC3255 abstractC3255 = this.f5476;
        if (abstractC3255 != null) {
            View view2 = abstractC3255.itemView;
            if (m5314(view2, x, y, this.f5491 + this.f5490, this.f5500 + this.f5502)) {
                return view2;
            }
        }
        ArrayList arrayList = this.f5497;
        int size = arrayList.size();
        do {
            size--;
            if (size >= 0) {
                c22764 = (C22764) arrayList.get(size);
                view = c22764.f73498.itemView;
            } else {
                return this.f5475.findChildViewUnder(x, y);
            }
        } while (!m5314(view, x, y, c22764.f73502, c22764.f73496));
        return view;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m5326(AbstractC3255 abstractC3255) {
        C13132 c13132 = this.f5475;
        int iMo3224 = this.f5493.mo3224(abstractC3255);
        int i = C17648.f53953;
        if ((AbstractC10065.m25257(iMo3224, c13132.getLayoutDirection()) & 16711680) == 0 || abstractC3255.itemView.getParent() != this.f5475) {
            return;
        }
        VelocityTracker velocityTracker = this.f5488;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f5488 = VelocityTracker.obtain();
        this.f5502 = 0.0f;
        this.f5490 = 0.0f;
        m5320(abstractC3255, 2);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m5324(int i, int i2, MotionEvent motionEvent) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f = x - this.f5499;
        this.f5490 = f;
        this.f5502 = y - this.f5486;
        if ((i & 4) == 0) {
            this.f5490 = Math.max(0.0f, f);
        }
        if ((i & 8) == 0) {
            this.f5490 = Math.min(0.0f, this.f5490);
        }
        if ((i & 1) == 0) {
            this.f5502 = Math.max(0.0f, this.f5502);
        }
        if ((i & 2) == 0) {
            this.f5502 = Math.min(0.0f, this.f5502);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private int m5315(AbstractC3255 abstractC3255, int i) {
        if ((i & 12) == 0) {
            return 0;
        }
        int i2 = this.f5490 > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.f5488;
        AbstractC10065 abstractC10065 = this.f5493;
        if (velocityTracker != null && this.f5487 > -1) {
            float f = this.f5492;
            abstractC10065.getClass();
            velocityTracker.computeCurrentVelocity(1000, f);
            float xVelocity = this.f5488.getXVelocity(this.f5487);
            float yVelocity = this.f5488.getYVelocity(this.f5487);
            int i3 = xVelocity > 0.0f ? 8 : 4;
            float fAbs = Math.abs(xVelocity);
            if ((i3 & i) != 0 && i2 == i3 && fAbs >= this.f5481 && fAbs > Math.abs(yVelocity)) {
                return i3;
            }
        }
        float fMo25260 = abstractC10065.mo25260() * this.f5475.getWidth();
        if ((i & i2) == 0 || Math.abs(this.f5490) <= fMo25260) {
            return 0;
        }
        return i2;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private int m5316(AbstractC3255 abstractC3255, int i) {
        if ((i & 3) == 0) {
            return 0;
        }
        int i2 = this.f5502 > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.f5488;
        AbstractC10065 abstractC10065 = this.f5493;
        if (velocityTracker != null && this.f5487 > -1) {
            float f = this.f5492;
            abstractC10065.getClass();
            velocityTracker.computeCurrentVelocity(1000, f);
            float xVelocity = this.f5488.getXVelocity(this.f5487);
            float yVelocity = this.f5488.getYVelocity(this.f5487);
            int i3 = yVelocity > 0.0f ? 2 : 1;
            float fAbs = Math.abs(yVelocity);
            if ((i3 & i) != 0 && i3 == i2 && fAbs >= this.f5481 && fAbs > Math.abs(xVelocity)) {
                return i3;
            }
        }
        float fMo25260 = abstractC10065.mo25260() * this.f5475.getHeight();
        if ((i & i2) == 0 || Math.abs(this.f5502) <= fMo25260) {
            return 0;
        }
        return i2;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m5328(View view) {
        if (view == this.f5480) {
            this.f5480 = null;
        }
    }
}
