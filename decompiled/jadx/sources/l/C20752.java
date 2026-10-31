package l;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩷۠ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: S8GQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C20752 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f66806;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final ValueAnimator f66807;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AnimatorSet f66809;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AnimatorSet f66812;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final AnimatorSet f66814;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final ValueAnimator f66815;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final AnimatorSet f66816;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ViewGroup f66819;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final ViewGroup f66820;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final View f66821;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ViewGroup f66822;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final View f66823;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ViewGroup f66825;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final View f66826;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ViewGroup f66827;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f66828;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final ViewGroup f66829;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C7844 f66832;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AnimatorSet f66833;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final ViewGroup f66834;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final RunnableC14899 f66830 = new Runnable() { // from class: l.ܶ֨ۧ
        @Override // java.lang.Runnable
        public final void run() {
            this.f45454.m47415();
        }
    };

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final RunnableC12783 f66831 = new Runnable() { // from class: l.۬֨ۧ
        @Override // java.lang.Runnable
        public final void run() {
            C20752.m47391(this.f38395);
        }
    };

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final RunnableC12078 f66811 = new Runnable() { // from class: l.۫֨ۧ
        @Override // java.lang.Runnable
        public final void run() {
            C20752.m47406(this.f36115);
        }
    };

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final RunnableC9962 f66824 = new Runnable() { // from class: l.ۤ֨ۧ
        @Override // java.lang.Runnable
        public final void run() {
            C20752.m47416(this.f30076);
        }
    };

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final RunnableC5728 f66817 = new Runnable() { // from class: l.ۛ֨ۧ
        @Override // java.lang.Runnable
        public final void run() {
            C20752.m47402(this.f17652);
        }
    };

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final ViewOnLayoutChangeListenerC11373 f66813 = new View.OnLayoutChangeListener() { // from class: l.ۨ֨ۧ
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            C20752.m47395(this.f34033, view, i, i3, i5, i7);
        }
    };

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f66808 = true;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f66818 = 0;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final ArrayList f66810 = new ArrayList();

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ܶ֨ۧ] */
    /* JADX WARN: Type inference failed for: r0v1, types: [l.۬֨ۧ] */
    /* JADX WARN: Type inference failed for: r0v2, types: [l.۫֨ۧ] */
    /* JADX WARN: Type inference failed for: r0v3, types: [l.ۤ֨ۧ] */
    /* JADX WARN: Type inference failed for: r0v4, types: [l.ۛ֨ۧ] */
    /* JADX WARN: Type inference failed for: r0v5, types: [l.ۨ֨ۧ] */
    public C20752(C7844 c7844) {
        this.f66832 = c7844;
        this.f66826 = c7844.findViewById(R.id.MT_Protector);
        this.f66827 = (ViewGroup) c7844.findViewById(R.id.MT_Protector);
        this.f66829 = (ViewGroup) c7844.findViewById(R.id.MT_Protector);
        ViewGroup viewGroup = (ViewGroup) c7844.findViewById(R.id.MT_Protector);
        this.f66825 = viewGroup;
        this.f66820 = (ViewGroup) c7844.findViewById(R.id.MT_Protector);
        View viewFindViewById = c7844.findViewById(R.id.MT_Protector);
        this.f66821 = viewFindViewById;
        this.f66819 = (ViewGroup) c7844.findViewById(R.id.MT_Protector);
        this.f66822 = (ViewGroup) c7844.findViewById(R.id.MT_Protector);
        this.f66834 = (ViewGroup) c7844.findViewById(R.id.MT_Protector);
        View viewFindViewById2 = c7844.findViewById(R.id.MT_Protector);
        this.f66823 = viewFindViewById2;
        View viewFindViewById3 = c7844.findViewById(R.id.MT_Protector);
        if (viewFindViewById2 != null && viewFindViewById3 != null) {
            viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: l.᩺֨ۧ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C20752.m47394(this.f73176, view);
                }
            });
            viewFindViewById3.setOnClickListener(new View.OnClickListener() { // from class: l.᩺֨ۧ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C20752.m47394(this.f73176, view);
                }
            });
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ܰ֨ۧ
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C20752.m47393(this.f40277, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new C7139(this));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.᩸֨ۧ
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C20752.m47411(this.f68477, valueAnimator);
            }
        });
        valueAnimatorOfFloat2.addListener(new C1701(this));
        Resources resources = c7844.getResources();
        float dimension = resources.getDimension(R.dimen.MT_Protector) - resources.getDimension(R.dimen.MT_Protector);
        float dimension2 = resources.getDimension(R.dimen.MT_Protector);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f66816 = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new C10874(this, c7844));
        animatorSet.play(valueAnimatorOfFloat).with(m47387(0.0f, dimension, viewFindViewById)).with(m47387(0.0f, dimension, viewGroup));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f66809 = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new C16517(this, c7844));
        animatorSet2.play(m47387(dimension, dimension2, viewFindViewById)).with(m47387(dimension, dimension2, viewGroup));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.f66814 = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new C17929(this, c7844));
        animatorSet3.play(valueAnimatorOfFloat).with(m47387(0.0f, dimension2, viewFindViewById)).with(m47387(0.0f, dimension2, viewGroup));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f66812 = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new C17223(this));
        animatorSet4.play(valueAnimatorOfFloat2).with(m47387(dimension, 0.0f, viewFindViewById)).with(m47387(dimension, 0.0f, viewGroup));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.f66833 = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new C14400(this));
        animatorSet5.play(valueAnimatorOfFloat2).with(m47387(dimension2, 0.0f, viewFindViewById)).with(m47387(dimension2, 0.0f, viewGroup));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f66815 = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.setDuration(250L);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ۙ֨ۧ
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f13906.m47388(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        valueAnimatorOfFloat3.addListener(new C23573(this));
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f66807 = valueAnimatorOfFloat4;
        valueAnimatorOfFloat4.setDuration(250L);
        valueAnimatorOfFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ۗ֨ۧ
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f9255.m47388(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        valueAnimatorOfFloat4.addListener(new C6640(this));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m47393(C20752 c20752, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = c20752.f66826;
        if (view != null) {
            view.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup = c20752.f66827;
        if (viewGroup != null) {
            viewGroup.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup2 = c20752.f66829;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(fFloatValue);
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m47411(C20752 c20752, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = c20752.f66826;
        if (view != null) {
            view.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup = c20752.f66827;
        if (viewGroup != null) {
            viewGroup.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup2 = c20752.f66829;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(fFloatValue);
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m47422() {
        C7844 c7844 = this.f66832;
        if (!c7844.m21025()) {
            c7844.setVisibility(0);
            c7844.m21020();
            c7844.m21028();
        }
        m47415();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47417() {
        int i = this.f66818;
        if (i == 3 || i == 2) {
            return;
        }
        m47424();
        if (this.f66808) {
            if (this.f66818 != 1) {
                this.f66814.start();
                return;
            } else {
                this.f66809.start();
                return;
            }
        }
        m47389(2);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m47423() {
        int i = this.f66818;
        if (i == 3 || i == 2) {
            return;
        }
        m47424();
        m47389(2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47420(boolean z) {
        this.f66808 = z;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m47428() {
        if (this.f66818 == 3) {
            return;
        }
        m47424();
        int iM21013 = this.f66832.m21013();
        if (iM21013 > 0) {
            if (!this.f66808) {
                m47390(iM21013, this.f66817);
            } else if (this.f66818 == 1) {
                m47390(2000L, this.f66811);
            } else {
                m47390(iM21013, this.f66824);
            }
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m47424() {
        RunnableC5728 runnableC5728 = this.f66817;
        C7844 c7844 = this.f66832;
        c7844.removeCallbacks(runnableC5728);
        c7844.removeCallbacks(this.f66831);
        c7844.removeCallbacks(this.f66824);
        c7844.removeCallbacks(this.f66811);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m47427() {
        this.f66832.addOnLayoutChangeListener(this.f66813);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m47426() {
        this.f66832.removeOnLayoutChangeListener(this.f66813);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m47425() {
        return this.f66818 == 0 && this.f66832.m21025();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47419(View view, boolean z) {
        if (view == null) {
            return;
        }
        ArrayList arrayList = this.f66810;
        if (!z) {
            view.setVisibility(8);
            arrayList.remove(view);
            return;
        }
        if (this.f66828 && m47408(view)) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        arrayList.add(view);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m47421(View view) {
        return view != null && this.f66810.contains(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m47389(int i) {
        int i2 = this.f66818;
        this.f66818 = i;
        C7844 c7844 = this.f66832;
        if (i == 2) {
            c7844.setVisibility(8);
        } else if (i2 == 2) {
            c7844.setVisibility(0);
        }
        if (i2 != i) {
            c7844.m21023();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47418(int i, int i2, int i3, int i4) {
        View view = this.f66826;
        if (view != null) {
            view.layout(0, 0, i3 - i, i4 - i2);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m47394(C20752 c20752, View view) {
        c20752.m47428();
        if (view.getId() == R.id.MT_Protector) {
            c20752.f66815.start();
        } else if (view.getId() == R.id.MT_Protector) {
            c20752.f66807.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void m47415() {
        if (!this.f66808) {
            m47389(0);
            m47428();
            return;
        }
        int i = this.f66818;
        if (i == 1) {
            this.f66812.start();
        } else if (i == 2) {
            this.f66833.start();
        } else if (i == 3) {
            this.f66806 = true;
        } else if (i == 4) {
            return;
        }
        m47428();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m47391(C20752 c20752) {
        c20752.f66814.start();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m47406(C20752 c20752) {
        c20752.f66809.start();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static void m47416(C20752 c20752) {
        c20752.f66816.start();
        c20752.m47390(2000L, c20752.f66811);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m47402(C20752 c20752) {
        c20752.m47389(2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ObjectAnimator m47387(float f, float f2, View view) {
        return ObjectAnimator.ofFloat(view, "translationY", f, f2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m47390(long j, Runnable runnable) {
        if (j >= 0) {
            this.f66832.postDelayed(runnable, j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m47388(float f) {
        ViewGroup viewGroup = this.f66834;
        if (viewGroup != null) {
            viewGroup.setTranslationX((int) ((1.0f - f) * viewGroup.getWidth()));
        }
        ViewGroup viewGroup2 = this.f66820;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f);
        }
        ViewGroup viewGroup3 = this.f66819;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(1.0f - f);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m47395(final C20752 c20752, View view, int i, int i2, int i3, int i4) {
        int paddingRight;
        int height;
        int paddingBottom;
        int i5;
        C7844 c7844 = c20752.f66832;
        int width = (c7844.getWidth() - c7844.getPaddingLeft()) - c7844.getPaddingRight();
        int height2 = (c7844.getHeight() - c7844.getPaddingBottom()) - c7844.getPaddingTop();
        ViewGroup viewGroup = c20752.f66827;
        int iM47401 = m47401(viewGroup);
        if (viewGroup != null) {
            paddingRight = viewGroup.getPaddingRight() + viewGroup.getPaddingLeft();
        } else {
            paddingRight = 0;
        }
        int i6 = iM47401 - paddingRight;
        if (viewGroup == null) {
            height = 0;
        } else {
            height = viewGroup.getHeight();
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                height += marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            }
        }
        if (viewGroup != null) {
            paddingBottom = viewGroup.getPaddingBottom() + viewGroup.getPaddingTop();
        } else {
            paddingBottom = 0;
        }
        int i7 = height - paddingBottom;
        int iMax = Math.max(i6, m47401(c20752.f66820) + m47401(c20752.f66823));
        ViewGroup viewGroup2 = c20752.f66825;
        if (viewGroup2 == null) {
            i5 = 0;
        } else {
            int height3 = viewGroup2.getHeight();
            ViewGroup.LayoutParams layoutParams2 = viewGroup2.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                i5 = height3 + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
            } else {
                i5 = height3;
            }
        }
        boolean z = width <= iMax || height2 <= (i5 * 2) + i7;
        if (c20752.f66828 != z) {
            c20752.f66828 = z;
            view.post(new Runnable() { // from class: l.᩹֨ۧ
                @Override // java.lang.Runnable
                public final void run() {
                    C20752.m47409(this.f70317);
                }
            });
        }
        boolean z2 = i2 - i != i4 - i3;
        if (c20752.f66828 || !z2) {
            return;
        }
        view.post(new Runnable() { // from class: l.᩶֨ۧ
            @Override // java.lang.Runnable
            public final void run() {
                C20752.m47410(this.f64098);
            }
        });
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static void m47409(C20752 c20752) {
        View view = c20752.f66821;
        ViewGroup viewGroup = c20752.f66829;
        if (viewGroup != null) {
            viewGroup.setVisibility(c20752.f66828 ? 0 : 4);
        }
        if (view != null) {
            int dimensionPixelSize = c20752.f66832.getResources().getDimensionPixelSize(R.dimen.MT_Protector);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            if (marginLayoutParams != null) {
                if (c20752.f66828) {
                    dimensionPixelSize = 0;
                }
                marginLayoutParams.bottomMargin = dimensionPixelSize;
                view.setLayoutParams(marginLayoutParams);
            }
            if (view instanceof C7263) {
                C7263 c7263 = (C7263) view;
                if (c20752.f66828) {
                    c7263.m19496(true);
                } else {
                    int i = c20752.f66818;
                    if (i == 1) {
                        c7263.m19496(false);
                    } else if (i != 3) {
                        c7263.m19500();
                    }
                }
            }
        }
        for (View view2 : c20752.f66810) {
            view2.setVisibility((c20752.f66828 && m47408(view2)) ? 4 : 0);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m47408(View view) {
        int id = view.getId();
        return id == R.id.MT_Protector || id == R.id.MT_Protector || id == R.id.MT_Protector || id == R.id.MT_Protector || id == R.id.MT_Protector || id == R.id.MT_Protector || id == R.id.MT_Protector;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m47410(C20752 c20752) {
        int i;
        ValueAnimator valueAnimator = c20752.f66807;
        View view = c20752.f66823;
        C7844 c7844 = c20752.f66832;
        ViewGroup viewGroup = c20752.f66822;
        ViewGroup viewGroup2 = c20752.f66819;
        if (viewGroup2 == null || viewGroup == null) {
            return;
        }
        int width = (c7844.getWidth() - c7844.getPaddingLeft()) - c7844.getPaddingRight();
        while (true) {
            if (viewGroup.getChildCount() <= 1) {
                break;
            }
            int childCount = viewGroup.getChildCount() - 2;
            View childAt = viewGroup.getChildAt(childCount);
            viewGroup.removeViewAt(childCount);
            viewGroup2.addView(childAt, 0);
        }
        if (view != null) {
            view.setVisibility(8);
        }
        int iM47401 = m47401(c20752.f66820);
        int childCount2 = viewGroup2.getChildCount() - 1;
        for (int i2 = 0; i2 < childCount2; i2++) {
            iM47401 += m47401(viewGroup2.getChildAt(i2));
        }
        if (iM47401 > width) {
            if (view != null) {
                view.setVisibility(0);
                iM47401 += m47401(view);
            }
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < childCount2; i3++) {
                View childAt2 = viewGroup2.getChildAt(i3);
                iM47401 -= m47401(childAt2);
                arrayList.add(childAt2);
                if (iM47401 <= width) {
                    break;
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            viewGroup2.removeViews(0, arrayList.size());
            for (i = 0; i < arrayList.size(); i++) {
                viewGroup.addView((View) arrayList.get(i), viewGroup.getChildCount() - 1);
            }
            return;
        }
        ViewGroup viewGroup3 = c20752.f66834;
        if (viewGroup3 == null || viewGroup3.getVisibility() != 0 || valueAnimator.isStarted()) {
            return;
        }
        c20752.f66815.cancel();
        valueAnimator.start();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m47401(View view) {
        if (view == null) {
            return 0;
        }
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return width;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + width;
    }
}
