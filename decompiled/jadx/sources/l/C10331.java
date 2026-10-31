package l;

import android.view.View;
import android.view.ViewGroup;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۤܰۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1O9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10331 extends AbstractC9606 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f31108;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f31109;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f31110;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C12447 f31111;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AbstractC16496 f31112;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C6495 f31113;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C2386 f31114;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f31115;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f31116;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f31117;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f31118;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C13132 f31119;

    public C10331(C2386 c2386) {
        this.f31114 = c2386;
        C13132 c13132 = c2386.f7607;
        this.f31119 = c13132;
        this.f31113 = (C6495) c13132.getLayoutManager();
        this.f31111 = new C12447();
        m26118();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m26118() {
        this.f31108 = 0;
        this.f31118 = 0;
        C12447 c12447 = this.f31111;
        c12447.f37447 = -1;
        c12447.f37445 = 0.0f;
        c12447.f37446 = 0;
        this.f31116 = -1;
        this.f31110 = -1;
        this.f31117 = false;
        this.f31109 = false;
        this.f31115 = false;
    }

    @Override // l.AbstractC9606
    public final void onScrollStateChanged(C13132 c13132, int i) {
        AbstractC16496 abstractC16496;
        AbstractC16496 abstractC16497;
        int i2 = this.f31108;
        if (!(i2 == 1 && this.f31118 == 1) && i == 1) {
            this.f31108 = 1;
            int i3 = this.f31110;
            if (i3 != -1) {
                this.f31116 = i3;
                this.f31110 = -1;
            } else if (this.f31116 == -1) {
                this.f31116 = this.f31113.findFirstVisibleItemPosition();
            }
            m26116(1);
            return;
        }
        if ((i2 == 1 || i2 == 4) && i == 2) {
            if (this.f31109) {
                m26116(2);
                this.f31117 = true;
                return;
            }
            return;
        }
        C12447 c12447 = this.f31111;
        if ((i2 == 1 || i2 == 4) && i == 0) {
            m26117();
            if (!this.f31109) {
                int i4 = c12447.f37447;
                if (i4 != -1 && (abstractC16497 = this.f31112) != null) {
                    abstractC16497.onPageScrolled(i4, 0.0f, 0);
                }
            } else if (c12447.f37446 == 0) {
                int i5 = this.f31116;
                int i6 = c12447.f37447;
                if (i5 != i6 && (abstractC16496 = this.f31112) != null) {
                    abstractC16496.onPageSelected(i6);
                }
            }
            m26116(0);
            m26118();
        }
        if (this.f31108 == 2 && i == 0 && this.f31115) {
            m26117();
            if (c12447.f37446 == 0) {
                int i7 = this.f31110;
                int i8 = c12447.f37447;
                if (i7 != i8) {
                    if (i8 == -1) {
                        i8 = 0;
                    }
                    AbstractC16496 abstractC16498 = this.f31112;
                    if (abstractC16498 != null) {
                        abstractC16498.onPageSelected(i8);
                    }
                }
                m26116(0);
                m26118();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0028  */
    /* JADX WARN: Code duplicated, block: B:17:0x002c  */
    /* JADX WARN: Code duplicated, block: B:31:0x004a A[PHI: r7 r8
      0x004a: PHI (r7v11 int) = (r7v3 int), (r7v15 int) binds: [B:30:0x0048, B:22:0x003a] A[DONT_GENERATE, DONT_INLINE]
      0x004a: PHI (r8v4 l.ܽ۟ۧ) = (r8v1 l.ܽ۟ۧ), (r8v6 l.ܽ۟ۧ) binds: [B:30:0x0048, B:22:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC9606
    public final void onScrolled(C13132 c13132, int i, int i2) {
        int i3;
        AbstractC16496 abstractC16496;
        this.f31109 = true;
        m26117();
        boolean z = this.f31117;
        C12447 c12447 = this.f31111;
        if (z) {
            this.f31117 = false;
            if (i2 <= 0) {
                if (i2 == 0) {
                    if ((i < 0) == (this.f31114.f7606.getLayoutDirection() == 1)) {
                        if (c12447.f37446 != 0) {
                            i3 = c12447.f37447 + 1;
                        }
                    }
                }
                i3 = c12447.f37447;
            } else if (c12447.f37446 != 0) {
                i3 = c12447.f37447 + 1;
            } else {
                i3 = c12447.f37447;
            }
            this.f31110 = i3;
            if (this.f31116 != i3 && (abstractC16496 = this.f31112) != null) {
                abstractC16496.onPageSelected(i3);
            }
        } else if (this.f31108 == 0) {
            i3 = c12447.f37447;
            if (i3 == -1) {
                i3 = 0;
            }
            abstractC16496 = this.f31112;
            if (abstractC16496 != null) {
                abstractC16496.onPageSelected(i3);
            }
        }
        int i4 = c12447.f37447;
        if (i4 == -1) {
            i4 = 0;
        }
        float f = c12447.f37445;
        int i5 = c12447.f37446;
        AbstractC16496 abstractC16497 = this.f31112;
        if (abstractC16497 != null) {
            abstractC16497.onPageScrolled(i4, f, i5);
        }
        int i6 = c12447.f37447;
        int i7 = this.f31110;
        if ((i6 == i7 || i7 == -1) && c12447.f37446 == 0 && this.f31118 != 1) {
            m26116(0);
            m26118();
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m26117() {
        View viewFindViewByPosition;
        int top;
        C6495 c6495 = this.f31113;
        int iFindFirstVisibleItemPosition = c6495.findFirstVisibleItemPosition();
        C12447 c12447 = this.f31111;
        c12447.f37447 = iFindFirstVisibleItemPosition;
        if (iFindFirstVisibleItemPosition == -1 || (viewFindViewByPosition = c6495.findViewByPosition(iFindFirstVisibleItemPosition)) == null) {
            c12447.f37447 = -1;
            c12447.f37445 = 0.0f;
            c12447.f37446 = 0;
            return;
        }
        int leftDecorationWidth = c6495.getLeftDecorationWidth(viewFindViewByPosition);
        int rightDecorationWidth = c6495.getRightDecorationWidth(viewFindViewByPosition);
        int topDecorationHeight = c6495.getTopDecorationHeight(viewFindViewByPosition);
        int bottomDecorationHeight = c6495.getBottomDecorationHeight(viewFindViewByPosition);
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
        int orientation = c6495.getOrientation();
        C13132 c13132 = this.f31119;
        if (orientation == 0) {
            top = (viewFindViewByPosition.getLeft() - leftDecorationWidth) - c13132.getPaddingLeft();
            if (this.f31114.f7606.getLayoutDirection() == 1) {
                top = -top;
            }
            height = width;
        } else {
            top = (viewFindViewByPosition.getTop() - topDecorationHeight) - c13132.getPaddingTop();
        }
        int i = -top;
        c12447.f37446 = i;
        if (i >= 0) {
            c12447.f37445 = height != 0 ? i / height : 0.0f;
        } else {
            if (new C20209(c6495).m46442()) {
                throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
            }
            Locale locale = Locale.US;
            throw new IllegalStateException(C19370.m44628(c12447.f37446, "Page can only be offset by a positive amount, not by "));
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m26124() {
        this.f31115 = true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26120(int i, boolean z) {
        AbstractC16496 abstractC16496;
        this.f31108 = z ? 2 : 3;
        boolean z2 = this.f31110 != i;
        this.f31110 = i;
        m26116(2);
        if (!z2 || (abstractC16496 = this.f31112) == null) {
            return;
        }
        abstractC16496.onPageSelected(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26121(AbstractC16496 abstractC16496) {
        this.f31112 = abstractC16496;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m26122() {
        return this.f31118;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m26123() {
        return this.f31118 == 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final double m26119() {
        m26117();
        C12447 c12447 = this.f31111;
        return ((double) c12447.f37447) + ((double) c12447.f37445);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m26116(int i) {
        if ((this.f31108 == 3 && this.f31118 == 0) || this.f31118 == i) {
            return;
        }
        this.f31118 = i;
        AbstractC16496 abstractC16496 = this.f31112;
        if (abstractC16496 != null) {
            abstractC16496.onPageScrollStateChanged(i);
        }
    }
}
