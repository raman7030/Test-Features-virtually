package p067l;

import android.view.View;
import android.view.ViewGroup;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۤܰۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1O9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12187 extends AbstractC11498 {

    /* JADX INFO: renamed from: ֫ */
    public int f34071;

    /* JADX INFO: renamed from: ۜ */
    public boolean f34072;

    /* JADX INFO: renamed from: ۡ */
    public int f34073;

    /* JADX INFO: renamed from: ۢ */
    public C14198 f34074;

    /* JADX INFO: renamed from: ۧ */
    public AbstractC18046 f34075;

    /* JADX INFO: renamed from: ܳ */
    public final C8541 f34076;

    /* JADX INFO: renamed from: ܺ */
    public final C4636 f34077;

    /* JADX INFO: renamed from: ܽ */
    public boolean f34078;

    /* JADX INFO: renamed from: ܿ */
    public int f34079;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f34080;

    /* JADX INFO: renamed from: ᩷ */
    public int f34081;

    /* JADX INFO: renamed from: ᩻ */
    public final C14849 f34082;

    public C12187(C4636 c4636) {
        this.f34077 = c4636;
        C14849 c14849 = c4636.f10398;
        this.f34082 = c14849;
        this.f34076 = (C8541) c14849.getLayoutManager();
        this.f34074 = new C14198();
        m28143();
    }

    /* JADX INFO: renamed from: ܿ */
    private void m28143() {
        this.f34071 = 0;
        this.f34081 = 0;
        C14198 c14198 = this.f34074;
        c14198.f40464 = -1;
        c14198.f40462 = 0.0f;
        c14198.f40463 = 0;
        this.f34079 = -1;
        this.f34073 = -1;
        this.f34080 = false;
        this.f34072 = false;
        this.f34078 = false;
    }

    @Override // p067l.AbstractC11498
    public final void onScrollStateChanged(C14849 c14849, int i) {
        AbstractC18046 abstractC18046;
        AbstractC18046 abstractC18047;
        int i2 = this.f34071;
        if (!(i2 == 1 && this.f34081 == 1) && i == 1) {
            this.f34071 = 1;
            int i3 = this.f34073;
            if (i3 != -1) {
                this.f34079 = i3;
                this.f34073 = -1;
            } else if (this.f34079 == -1) {
                this.f34079 = this.f34076.findFirstVisibleItemPosition();
            }
            m28141(1);
            return;
        }
        if ((i2 == 1 || i2 == 4) && i == 2) {
            if (this.f34072) {
                m28141(2);
                this.f34080 = true;
                return;
            }
            return;
        }
        C14198 c14198 = this.f34074;
        if ((i2 == 1 || i2 == 4) && i == 0) {
            m28142();
            if (!this.f34072) {
                int i4 = c14198.f40464;
                if (i4 != -1 && (abstractC18047 = this.f34075) != null) {
                    abstractC18047.onPageScrolled(i4, 0.0f, 0);
                }
            } else if (c14198.f40463 == 0) {
                int i5 = this.f34079;
                int i6 = c14198.f40464;
                if (i5 != i6 && (abstractC18046 = this.f34075) != null) {
                    abstractC18046.onPageSelected(i6);
                }
            }
            m28141(0);
            m28143();
        }
        if (this.f34071 == 2 && i == 0 && this.f34078) {
            m28142();
            if (c14198.f40463 == 0) {
                int i7 = this.f34073;
                int i8 = c14198.f40464;
                if (i7 != i8) {
                    if (i8 == -1) {
                        i8 = 0;
                    }
                    AbstractC18046 abstractC18048 = this.f34075;
                    if (abstractC18048 != null) {
                        abstractC18048.onPageSelected(i8);
                    }
                }
                m28141(0);
                m28143();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0028  */
    /* JADX WARN: Code duplicated, block: B:17:0x002c  */
    /* JADX WARN: Code duplicated, block: B:31:0x004a A[PHI: r7 r8
      0x004a: PHI (r7v11 int) = (r7v3 int), (r7v15 int) binds: [B:30:0x0048, B:22:0x003a] A[DONT_GENERATE, DONT_INLINE]
      0x004a: PHI (r8v4 l.ܽ۟ۧ) = (r8v1 l.ܽ۟ۧ), (r8v6 l.ܽ۟ۧ) binds: [B:30:0x0048, B:22:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p067l.AbstractC11498
    public final void onScrolled(C14849 c14849, int i, int i2) {
        int i3;
        AbstractC18046 abstractC18046;
        this.f34072 = true;
        m28142();
        boolean z = this.f34080;
        C14198 c14198 = this.f34074;
        if (z) {
            this.f34080 = false;
            if (i2 <= 0) {
                if (i2 == 0) {
                    if ((i < 0) == (this.f34077.f10397.getLayoutDirection() == 1)) {
                        if (c14198.f40463 != 0) {
                            i3 = c14198.f40464 + 1;
                        }
                    }
                }
                i3 = c14198.f40464;
            } else if (c14198.f40463 != 0) {
                i3 = c14198.f40464 + 1;
            } else {
                i3 = c14198.f40464;
            }
            this.f34073 = i3;
            if (this.f34079 != i3 && (abstractC18046 = this.f34075) != null) {
                abstractC18046.onPageSelected(i3);
            }
        } else if (this.f34071 == 0) {
            i3 = c14198.f40464;
            if (i3 == -1) {
                i3 = 0;
            }
            abstractC18046 = this.f34075;
            if (abstractC18046 != null) {
                abstractC18046.onPageSelected(i3);
            }
        }
        int i4 = c14198.f40464;
        if (i4 == -1) {
            i4 = 0;
        }
        float f = c14198.f40462;
        int i5 = c14198.f40463;
        AbstractC18046 abstractC18047 = this.f34075;
        if (abstractC18047 != null) {
            abstractC18047.onPageScrolled(i4, f, i5);
        }
        int i6 = c14198.f40464;
        int i7 = this.f34073;
        if ((i6 == i7 || i7 == -1) && c14198.f40463 == 0 && this.f34081 != 1) {
            m28141(0);
            m28143();
        }
    }

    /* JADX INFO: renamed from: ܳ */
    private void m28142() {
        View viewFindViewByPosition;
        int top;
        C8541 c8541 = this.f34076;
        int iFindFirstVisibleItemPosition = c8541.findFirstVisibleItemPosition();
        C14198 c14198 = this.f34074;
        c14198.f40464 = iFindFirstVisibleItemPosition;
        if (iFindFirstVisibleItemPosition == -1 || (viewFindViewByPosition = c8541.findViewByPosition(iFindFirstVisibleItemPosition)) == null) {
            c14198.f40464 = -1;
            c14198.f40462 = 0.0f;
            c14198.f40463 = 0;
            return;
        }
        int leftDecorationWidth = c8541.getLeftDecorationWidth(viewFindViewByPosition);
        int rightDecorationWidth = c8541.getRightDecorationWidth(viewFindViewByPosition);
        int topDecorationHeight = c8541.getTopDecorationHeight(viewFindViewByPosition);
        int bottomDecorationHeight = c8541.getBottomDecorationHeight(viewFindViewByPosition);
        ViewGroup.LayoutParams layoutParams = viewFindViewByPosition.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            leftDecorationWidth += marginLayoutParams.leftMargin;
            rightDecorationWidth += marginLayoutParams.rightMargin;
            topDecorationHeight += marginLayoutParams.topMargin;
            bottomDecorationHeight += marginLayoutParams.bottomMargin;
        }
        int height = viewFindViewByPosition.getHeight() + topDecorationHeight + bottomDecorationHeight;
        int width = viewFindViewByPosition.getWidth() + leftDecorationWidth + rightDecorationWidth;
        int orientation = c8541.getOrientation();
        C14849 c14849 = this.f34082;
        if (orientation == 0) {
            top = (viewFindViewByPosition.getLeft() - leftDecorationWidth) - c14849.getPaddingLeft();
            if (this.f34077.f10397.getLayoutDirection() == 1) {
                top = -top;
            }
            height = width;
        } else {
            top = (viewFindViewByPosition.getTop() - topDecorationHeight) - c14849.getPaddingTop();
        }
        int i = -top;
        c14198.f40463 = i;
        if (i >= 0) {
            c14198.f40462 = height != 0 ? i / height : 0.0f;
        } else {
            if (new C21575(c8541).m48761()) {
                throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
            }
            Locale locale = Locale.US;
            throw new IllegalStateException(C20778.m46922(c14198.f40463, "Page can only be offset by a positive amount, not by "));
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m28149() {
        this.f34078 = true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28145(int i, boolean z) {
        AbstractC18046 abstractC18046;
        this.f34071 = z ? 2 : 3;
        boolean z2 = this.f34073 != i;
        this.f34073 = i;
        m28141(2);
        if (!z2 || (abstractC18046 = this.f34075) == null) {
            return;
        }
        abstractC18046.onPageSelected(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28146(AbstractC18046 abstractC18046) {
        this.f34075 = abstractC18046;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m28147() {
        return this.f34081;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m28148() {
        return this.f34081 == 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final double m28144() {
        m28142();
        C14198 c14198 = this.f34074;
        return ((double) c14198.f40464) + ((double) c14198.f40462);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m28141(int i) {
        if ((this.f34071 == 3 && this.f34081 == 0) || this.f34081 == i) {
            return;
        }
        this.f34081 = i;
        AbstractC18046 abstractC18046 = this.f34075;
        if (abstractC18046 != null) {
            abstractC18046.onPageScrollStateChanged(i);
        }
    }
}
