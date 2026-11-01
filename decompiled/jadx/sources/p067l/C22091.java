package p067l;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import bin.p000mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩷۠ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: S8GQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C22091 {

    /* JADX INFO: renamed from: ֡ */
    public boolean f69490;

    /* JADX INFO: renamed from: ֨ */
    public final ValueAnimator f69491;

    /* JADX INFO: renamed from: ۖ */
    public final AnimatorSet f69493;

    /* JADX INFO: renamed from: ۙ */
    public final AnimatorSet f69496;

    /* JADX INFO: renamed from: ۜ */
    public final AnimatorSet f69498;

    /* JADX INFO: renamed from: ۠ */
    public final ValueAnimator f69499;

    /* JADX INFO: renamed from: ۡ */
    public final AnimatorSet f69500;

    /* JADX INFO: renamed from: ۧ */
    public final ViewGroup f69503;

    /* JADX INFO: renamed from: ۫ */
    public final ViewGroup f69504;

    /* JADX INFO: renamed from: ۬ */
    public final View f69505;

    /* JADX INFO: renamed from: ܳ */
    public final ViewGroup f69506;

    /* JADX INFO: renamed from: ܶ */
    public final View f69507;

    /* JADX INFO: renamed from: ܽ */
    public final ViewGroup f69509;

    /* JADX INFO: renamed from: ܿ */
    public final View f69510;

    /* JADX INFO: renamed from: ᩳ */
    public final ViewGroup f69511;

    /* JADX INFO: renamed from: ᩴ */
    public boolean f69512;

    /* JADX INFO: renamed from: ᩵ */
    public final ViewGroup f69513;

    /* JADX INFO: renamed from: ᩸ */
    public final C9823 f69516;

    /* JADX INFO: renamed from: ᩹ */
    public final AnimatorSet f69517;

    /* JADX INFO: renamed from: ᩻ */
    public final ViewGroup f69518;

    /* JADX INFO: renamed from: ᩶ */
    public final RunnableC16528 f69514 = new Runnable() { // from class: l.ܶ֨ۧ
        @Override // java.lang.Runnable
        public final void run() {
            this.f48569.m49742();
        }
    };

    /* JADX INFO: renamed from: ᩷ */
    public final RunnableC14517 f69515 = new Runnable() { // from class: l.۬֨ۧ
        @Override // java.lang.Runnable
        public final void run() {
            C22091.m49718(this.f41435);
        }
    };

    /* JADX INFO: renamed from: ۘ */
    public final RunnableC13847 f69495 = new Runnable() { // from class: l.۫֨ۧ
        @Override // java.lang.Runnable
        public final void run() {
            C22091.m49733(this.f39126);
        }
    };

    /* JADX INFO: renamed from: ܺ */
    public final RunnableC11836 f69508 = new Runnable() { // from class: l.ۤ֨ۧ
        @Override // java.lang.Runnable
        public final void run() {
            C22091.m49743(this.f33033);
        }
    };

    /* JADX INFO: renamed from: ۢ */
    public final RunnableC7812 f69501 = new Runnable() { // from class: l.ۛ֨ۧ
        @Override // java.lang.Runnable
        public final void run() {
            C22091.m49729(this.f20497);
        }
    };

    /* JADX INFO: renamed from: ۚ */
    public final ViewOnLayoutChangeListenerC13177 f69497 = new View.OnLayoutChangeListener() { // from class: l.ۨ֨ۧ
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            C22091.m49722(this.f37030, view, i, i3, i5, i7);
        }
    };

    /* JADX INFO: renamed from: ֫ */
    public boolean f69492 = true;

    /* JADX INFO: renamed from: ۤ */
    public int f69502 = 0;

    /* JADX INFO: renamed from: ۗ */
    public final ArrayList f69494 = new ArrayList();

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ܶ֨ۧ] */
    /* JADX WARN: Type inference failed for: r0v1, types: [l.۬֨ۧ] */
    /* JADX WARN: Type inference failed for: r0v2, types: [l.۫֨ۧ] */
    /* JADX WARN: Type inference failed for: r0v3, types: [l.ۤ֨ۧ] */
    /* JADX WARN: Type inference failed for: r0v4, types: [l.ۛ֨ۧ] */
    /* JADX WARN: Type inference failed for: r0v5, types: [l.ۨ֨ۧ] */
    public C22091(C9823 c9823) {
        this.f69516 = c9823;
        this.f69510 = c9823.findViewById(R.id.MT_Protector);
        this.f69511 = (ViewGroup) c9823.findViewById(R.id.MT_Protector);
        this.f69513 = (ViewGroup) c9823.findViewById(R.id.MT_Protector);
        ViewGroup viewGroup = (ViewGroup) c9823.findViewById(R.id.MT_Protector);
        this.f69509 = viewGroup;
        this.f69504 = (ViewGroup) c9823.findViewById(R.id.MT_Protector);
        View viewFindViewById = c9823.findViewById(R.id.MT_Protector);
        this.f69505 = viewFindViewById;
        this.f69503 = (ViewGroup) c9823.findViewById(R.id.MT_Protector);
        this.f69506 = (ViewGroup) c9823.findViewById(R.id.MT_Protector);
        this.f69518 = (ViewGroup) c9823.findViewById(R.id.MT_Protector);
        View viewFindViewById2 = c9823.findViewById(R.id.MT_Protector);
        this.f69507 = viewFindViewById2;
        View viewFindViewById3 = c9823.findViewById(R.id.MT_Protector);
        if (viewFindViewById2 != null && viewFindViewById3 != null) {
            viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: l.᩺֨ۧ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C22091.m49721(this.f75901, view);
                }
            });
            viewFindViewById3.setOnClickListener(new View.OnClickListener() { // from class: l.᩺֨ۧ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C22091.m49721(this.f75901, view);
                }
            });
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ܰ֨ۧ
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C22091.m49720(this.f43347, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new C9153(this));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.᩸֨ۧ
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C22091.m49738(this.f71159, valueAnimator);
            }
        });
        valueAnimatorOfFloat2.addListener(new C3985(this));
        Resources resources = c9823.getResources();
        float dimension = resources.getDimension(R.dimen.MT_Protector) - resources.getDimension(R.dimen.MT_Protector);
        float dimension2 = resources.getDimension(R.dimen.MT_Protector);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f69500 = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new C12703(this, c9823));
        animatorSet.play(valueAnimatorOfFloat).with(m49714(0.0f, dimension, viewFindViewById)).with(m49714(0.0f, dimension, viewGroup));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f69493 = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new C18066(this, c9823));
        animatorSet2.play(m49714(dimension, dimension2, viewFindViewById)).with(m49714(dimension, dimension2, viewGroup));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.f69498 = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new C19408(this, c9823));
        animatorSet3.play(valueAnimatorOfFloat).with(m49714(0.0f, dimension2, viewFindViewById)).with(m49714(0.0f, dimension2, viewGroup));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f69496 = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new C18737(this));
        animatorSet4.play(valueAnimatorOfFloat2).with(m49714(dimension, 0.0f, viewFindViewById)).with(m49714(dimension, 0.0f, viewGroup));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.f69517 = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new C16054(this));
        animatorSet5.play(valueAnimatorOfFloat2).with(m49714(dimension2, 0.0f, viewFindViewById)).with(m49714(dimension2, 0.0f, viewGroup));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f69499 = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.setDuration(250L);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ۙ֨ۧ
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f16721.m49715(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        valueAnimatorOfFloat3.addListener(new C24772(this));
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f69491 = valueAnimatorOfFloat4;
        valueAnimatorOfFloat4.setDuration(250L);
        valueAnimatorOfFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ۗ֨ۧ
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f12053.m49715(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        valueAnimatorOfFloat4.addListener(new C8679(this));
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m49720(C22091 c22091, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = c22091.f69510;
        if (view != null) {
            view.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup = c22091.f69511;
        if (viewGroup != null) {
            viewGroup.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup2 = c22091.f69513;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(fFloatValue);
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public static /* synthetic */ void m49738(C22091 c22091, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = c22091.f69510;
        if (view != null) {
            view.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup = c22091.f69511;
        if (viewGroup != null) {
            viewGroup.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup2 = c22091.f69513;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(fFloatValue);
        }
    }

    /* JADX INFO: renamed from: ۜ */
    public final void m49749() {
        C9823 c9823 = this.f69516;
        if (!c9823.m22990()) {
            c9823.setVisibility(0);
            c9823.m22985();
            c9823.m22993();
        }
        m49742();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m49744() {
        int i = this.f69502;
        if (i == 3 || i == 2) {
            return;
        }
        m49751();
        if (this.f69492) {
            if (this.f69502 != 1) {
                this.f69498.start();
                return;
            } else {
                this.f69493.start();
                return;
            }
        }
        m49716(2);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m49750() {
        int i = this.f69502;
        if (i == 3 || i == 2) {
            return;
        }
        m49751();
        m49716(2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m49747(boolean z) {
        this.f69492 = z;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m49755() {
        if (this.f69502 == 3) {
            return;
        }
        m49751();
        int iM22978 = this.f69516.m22978();
        if (iM22978 > 0) {
            if (!this.f69492) {
                m49717(iM22978, this.f69501);
            } else if (this.f69502 == 1) {
                m49717(2000L, this.f69495);
            } else {
                m49717(iM22978, this.f69508);
            }
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m49751() {
        RunnableC7812 runnableC7812 = this.f69501;
        C9823 c9823 = this.f69516;
        c9823.removeCallbacks(runnableC7812);
        c9823.removeCallbacks(this.f69515);
        c9823.removeCallbacks(this.f69508);
        c9823.removeCallbacks(this.f69495);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m49754() {
        this.f69516.addOnLayoutChangeListener(this.f69497);
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m49753() {
        this.f69516.removeOnLayoutChangeListener(this.f69497);
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m49752() {
        return this.f69502 == 0 && this.f69516.m22990();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m49746(View view, boolean z) {
        if (view == null) {
            return;
        }
        ArrayList arrayList = this.f69494;
        if (!z) {
            view.setVisibility(8);
            arrayList.remove(view);
            return;
        }
        if (this.f69512 && m49735(view)) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        arrayList.add(view);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m49748(View view) {
        return view != null && this.f69494.contains(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m49716(int i) {
        int i2 = this.f69502;
        this.f69502 = i;
        C9823 c9823 = this.f69516;
        if (i == 2) {
            c9823.setVisibility(8);
        } else if (i2 == 2) {
            c9823.setVisibility(0);
        }
        if (i2 != i) {
            c9823.m22988();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m49745(int i, int i2, int i3, int i4) {
        View view = this.f69510;
        if (view != null) {
            view.layout(0, 0, i3 - i, i4 - i2);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m49721(C22091 c22091, View view) {
        c22091.m49755();
        if (view.getId() == R.id.MT_Protector) {
            c22091.f69499.start();
        } else if (view.getId() == R.id.MT_Protector) {
            c22091.f69491.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷ */
    public void m49742() {
        if (!this.f69492) {
            m49716(0);
            m49755();
            return;
        }
        int i = this.f69502;
        if (i == 1) {
            this.f69496.start();
        } else if (i == 2) {
            this.f69517.start();
        } else if (i == 3) {
            this.f69490 = true;
        } else if (i == 4) {
            return;
        }
        m49755();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m49718(C22091 c22091) {
        c22091.f69498.start();
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m49733(C22091 c22091) {
        c22091.f69493.start();
    }

    /* JADX INFO: renamed from: ᩻ */
    public static void m49743(C22091 c22091) {
        c22091.f69500.start();
        c22091.m49717(2000L, c22091.f69495);
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m49729(C22091 c22091) {
        c22091.m49716(2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static ObjectAnimator m49714(float f, float f2, View view) {
        return ObjectAnimator.ofFloat(view, "translationY", f, f2);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m49717(long j, Runnable runnable) {
        if (j >= 0) {
            this.f69516.postDelayed(runnable, j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m49715(float f) {
        ViewGroup viewGroup = this.f69518;
        if (viewGroup != null) {
            viewGroup.setTranslationX((int) ((1.0f - f) * viewGroup.getWidth()));
        }
        ViewGroup viewGroup2 = this.f69504;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f);
        }
        ViewGroup viewGroup3 = this.f69503;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(1.0f - f);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m49722(final C22091 c22091, View view, int i, int i2, int i3, int i4) {
        int paddingRight;
        int height;
        int paddingBottom;
        int i5;
        C9823 c9823 = c22091.f69516;
        int width = (c9823.getWidth() - c9823.getPaddingLeft()) - c9823.getPaddingRight();
        int height2 = (c9823.getHeight() - c9823.getPaddingBottom()) - c9823.getPaddingTop();
        ViewGroup viewGroup = c22091.f69511;
        int iM49728 = m49728(viewGroup);
        if (viewGroup != null) {
            paddingRight = viewGroup.getPaddingRight() + viewGroup.getPaddingLeft();
        } else {
            paddingRight = 0;
        }
        int i6 = iM49728 - paddingRight;
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
        int iMax = Math.max(i6, m49728(c22091.f69504) + m49728(c22091.f69507));
        ViewGroup viewGroup2 = c22091.f69509;
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
        if (c22091.f69512 != z) {
            c22091.f69512 = z;
            view.post(new Runnable() { // from class: l.᩹֨ۧ
                @Override // java.lang.Runnable
                public final void run() {
                    C22091.m49736(this.f73028);
                }
            });
        }
        boolean z2 = i2 - i != i4 - i3;
        if (c22091.f69512 || !z2) {
            return;
        }
        view.post(new Runnable() { // from class: l.᩶֨ۧ
            @Override // java.lang.Runnable
            public final void run() {
                C22091.m49737(this.f66735);
            }
        });
    }

    /* JADX INFO: renamed from: ܿ */
    public static void m49736(C22091 c22091) {
        View view = c22091.f69505;
        ViewGroup viewGroup = c22091.f69513;
        if (viewGroup != null) {
            viewGroup.setVisibility(c22091.f69512 ? 0 : 4);
        }
        if (view != null) {
            int dimensionPixelSize = c22091.f69516.getResources().getDimensionPixelSize(R.dimen.MT_Protector);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            if (marginLayoutParams != null) {
                if (c22091.f69512) {
                    dimensionPixelSize = 0;
                }
                marginLayoutParams.bottomMargin = dimensionPixelSize;
                view.setLayoutParams(marginLayoutParams);
            }
            if (view instanceof C9271) {
                C9271 c9271 = (C9271) view;
                if (c22091.f69512) {
                    c9271.m21462(true);
                } else {
                    int i = c22091.f69502;
                    if (i == 1) {
                        c9271.m21462(false);
                    } else if (i != 3) {
                        c9271.m21466();
                    }
                }
            }
        }
        for (View view2 : c22091.f69494) {
            view2.setVisibility((c22091.f69512 && m49735(view2)) ? 4 : 0);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static boolean m49735(View view) {
        int id = view.getId();
        return id == R.id.MT_Protector || id == R.id.MT_Protector || id == R.id.MT_Protector || id == R.id.MT_Protector || id == R.id.MT_Protector || id == R.id.MT_Protector || id == R.id.MT_Protector;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static void m49737(C22091 c22091) {
        int i;
        ValueAnimator valueAnimator = c22091.f69491;
        View view = c22091.f69507;
        C9823 c9823 = c22091.f69516;
        ViewGroup viewGroup = c22091.f69506;
        ViewGroup viewGroup2 = c22091.f69503;
        if (viewGroup2 == null || viewGroup == null) {
            return;
        }
        int width = (c9823.getWidth() - c9823.getPaddingLeft()) - c9823.getPaddingRight();
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
        int iM49728 = m49728(c22091.f69504);
        int childCount2 = viewGroup2.getChildCount() - 1;
        for (int i2 = 0; i2 < childCount2; i2++) {
            iM49728 += m49728(viewGroup2.getChildAt(i2));
        }
        if (iM49728 > width) {
            if (view != null) {
                view.setVisibility(0);
                iM49728 += m49728(view);
            }
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < childCount2; i3++) {
                View childAt2 = viewGroup2.getChildAt(i3);
                iM49728 -= m49728(childAt2);
                arrayList.add(childAt2);
                if (iM49728 <= width) {
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
        ViewGroup viewGroup3 = c22091.f69518;
        if (viewGroup3 == null || viewGroup3.getVisibility() != 0 || valueAnimator.isStarted()) {
            return;
        }
        c22091.f69499.cancel();
        valueAnimator.start();
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m49728(View view) {
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
