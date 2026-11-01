package p067l;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import bin.p000mt.plus.R;
import com.umeng.analytics.pro.C0708d;
import java.util.ArrayList;
import java.util.Iterator;
import moe.shizuku.server.IShizukuService;
import net.engio.mbassy.listener.MessageHandler;

/* JADX INFO: renamed from: l.ܳ᩷ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: HAWX */
/* JADX INFO: loaded from: classes4.dex */
public final class C16407 extends FrameLayout {

    /* JADX INFO: renamed from: ۧ֫ */
    public static final /* synthetic */ int f48208 = 0;

    /* JADX INFO: renamed from: ֫֫ */
    public final VelocityTracker f48209;

    /* JADX INFO: renamed from: ۗ */
    public boolean f48210;

    /* JADX INFO: renamed from: ۙ */
    public float f48211;

    /* JADX INFO: renamed from: ۛ */
    public float f48212;

    /* JADX INFO: renamed from: ۟ */
    public float f48213;

    /* JADX INFO: renamed from: ۤ */
    public boolean f48214;

    /* JADX INFO: renamed from: ۨ */
    public final ArrayList f48215;

    /* JADX INFO: renamed from: ۫ */
    public C17020 f48216;

    /* JADX INFO: renamed from: ۬ */
    public boolean f48217;

    /* JADX INFO: renamed from: ܰ */
    public float f48218;

    /* JADX INFO: renamed from: ᩶ */
    public Integer f48219;

    /* JADX INFO: renamed from: ᩸ */
    public final RunnableC23549 f48220;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f48221;

    /* JADX INFO: renamed from: ᩺ */
    public final int f48222;

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        C13045.m29867(view, "child");
        C13045.m29867(layoutParams, "params");
        if (view.getId() == R.id.MT_Protector) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 80;
            view.setVisibility(this.f48212 == 0.0f ? 4 : 0);
        } else if (view.getId() == R.id.MT_Protector) {
            view.setVisibility(this.f48212 == 0.0f ? 4 : 0);
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C13045.m29867(motionEvent, "ev");
        if (!this.f48214) {
            this.f48217 = false;
            return super.onInterceptTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f48218 = motionEvent.getX();
            this.f48213 = motionEvent.getY();
            this.f48210 = true;
            this.f48217 = false;
        } else if (action == 2 && this.f48210) {
            float fAbs = Math.abs(motionEvent.getX() - this.f48218);
            float y = motionEvent.getY() - this.f48213;
            if (y > this.f48222 && y > fAbs) {
                if (!C19090.m43367(this, motionEvent.getX(), motionEvent.getY())) {
                    this.f48217 = true;
                    return true;
                }
                this.f48210 = false;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C13045.m29867(motionEvent, "ev");
        if (!this.f48217) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        VelocityTracker velocityTracker = this.f48209;
        if (action != 1) {
            if (action == 2) {
                View viewM37258 = m37258();
                if (viewM37258 == null) {
                    return super.onTouchEvent(motionEvent);
                }
                ViewGroup.LayoutParams layoutParams = viewM37258.getLayoutParams();
                C13045.m29862((Object) layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                float measuredHeight = viewM37258.getMeasuredHeight() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                m37267(1 - (Math.min(Math.max((motionEvent.getY() - this.f48213) * 1.5f, 0.0f), measuredHeight) / measuredHeight));
                velocityTracker.addMovement(motionEvent);
                return true;
            }
            if (action != 3) {
                return true;
            }
        }
        this.f48217 = false;
        velocityTracker.computeCurrentVelocity(1000);
        float yVelocity = velocityTracker.getYVelocity();
        if (yVelocity <= -1000.0f) {
            m37265();
            return true;
        }
        if (yVelocity >= 1000.0f) {
            m37269();
            return true;
        }
        if (this.f48212 > 0.4f) {
            m37265();
            return true;
        }
        m37269();
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m37262(C9032 c9032) {
        C13045.m29867(c9032, MessageHandler.Properties.Listener);
        this.f48215.remove(c9032);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m37264(InterfaceC25125 interfaceC25125) {
        C13045.m29867(interfaceC25125, MessageHandler.Properties.Listener);
        this.f48215.add(interfaceC25125);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        C13045.m29867(parcelable, "state");
        Bundle bundle = (Bundle) parcelable;
        m37267(bundle.getFloat("slideOffset"));
        super.onRestoreInstanceState(bundle.getParcelable("original"));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C16407(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C13045.m29867(context, C0708d.f2602R);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16407(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C13045.m29867(context, C0708d.f2602R);
        this.f48215 = new ArrayList();
        this.f48220 = new RunnableC23549(4, this);
        this.f48211 = 0.5f;
        this.f48222 = ViewConfiguration.get(context).getScaledTouchSlop();
        setOnClickListener(new ViewOnClickListenerC20302(this, 4));
        m37267(0.0f);
        this.f48214 = false;
        this.f48209 = VelocityTracker.obtain();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m37257(C16407 c16407) {
        if (c16407.f48219 != null || c16407.f48221) {
            c16407.f48219 = null;
            c16407.f48221 = false;
            c16407.requestLayout();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m37263(C17020 c17020) {
        this.f48216 = c17020;
    }

    /* JADX INFO: renamed from: ܿ */
    public final InterfaceC17797 m37270() {
        return this.f48216;
    }

    /* JADX INFO: renamed from: ܳ */
    public final float m37268() {
        return this.f48212;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m37267(float f) {
        int i;
        View childAt;
        this.f48212 = f;
        int i2 = 0;
        if (f == 1.0f) {
            this.f48214 = true;
        } else if (f == 0.0f) {
            this.f48214 = false;
        }
        Iterator it = this.f48215.iterator();
        while (it.hasNext()) {
            ((InterfaceC25125) it.next()).mo20903(f);
        }
        if (f == 0.0f) {
            if (isClickable()) {
                setClickable(false);
            }
            setBackgroundColor(0);
            i = 4;
        } else {
            if (!isClickable()) {
                setClickable(true);
            }
            setBackgroundColor(Color.argb((int) (f * IShizukuService.Stub.TRANSACTION_attachUserService), 0, 0, 0));
            i = 0;
        }
        View viewM37258 = m37258();
        if (viewM37258 != null) {
            if (viewM37258.getVisibility() != i) {
                viewM37258.setVisibility(i);
                C17020 c17020 = this.f48216;
                if (c17020 != null) {
                    c17020.invoke(Boolean.valueOf(i == 0));
                }
            }
            ViewGroup.LayoutParams layoutParams = viewM37258.getLayoutParams();
            C13045.m29862((Object) layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            viewM37258.setTranslationY((1 - this.f48212) * (viewM37258.getMeasuredHeight() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin));
        }
        int childCount = getChildCount();
        while (true) {
            if (i2 >= childCount) {
                childAt = null;
                break;
            }
            childAt = getChildAt(i2);
            if (childAt.getId() == R.id.MT_Protector) {
                break;
            } else {
                i2++;
            }
        }
        if (childAt == null || childAt.getVisibility() == i) {
            return;
        }
        childAt.setVisibility(i);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final float m37271() {
        return this.f48211;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m37260(float f) {
        this.f48211 = f;
        requestLayout();
    }

    /* JADX INFO: renamed from: ᩻ */
    public final boolean m37272() {
        return this.f48212 == 0.0f;
    }

    /* JADX INFO: renamed from: ᩷ */
    private final View m37258() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() == R.id.MT_Protector) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        View viewM37258 = m37258();
        if (viewM37258 == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = viewM37258.getLayoutParams();
        C13045.m29862((Object) layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int measuredHeight = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - marginLayoutParams.topMargin) - marginLayoutParams.bottomMargin;
        if (measuredHeight <= 0) {
            measuredHeight = 0;
        }
        int iMin = (int) (measuredHeight * this.f48211);
        Integer num = this.f48219;
        if (num != null) {
            int iIntValue = num.intValue();
            if (this.f48221 && measuredHeight >= iIntValue && Math.abs(iMin - iIntValue) <= 1) {
                removeCallbacks(this.f48220);
                this.f48219 = null;
                this.f48221 = false;
            } else {
                iMin = Math.min(iIntValue, measuredHeight);
            }
        }
        viewM37258.measure(View.MeasureSpec.makeMeasureSpec(viewM37258.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(iMin, 1073741824));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m37261(int i) {
        int iMax = Math.max(0, i);
        Integer num = this.f48219;
        if (num == null || num.intValue() != iMax || this.f48221) {
            removeCallbacks(this.f48220);
            this.f48219 = Integer.valueOf(iMax);
            this.f48221 = false;
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m37266() {
        if (this.f48219 != null) {
            RunnableC23549 runnableC23549 = this.f48220;
            removeCallbacks(runnableC23549);
            postDelayed(runnableC23549, 400L);
        }
        if (this.f48219 == null || this.f48221) {
            return;
        }
        this.f48221 = true;
        requestLayout();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m37259() {
        if (this.f48219 != null || this.f48221) {
            removeCallbacks(this.f48220);
            this.f48219 = null;
            this.f48221 = false;
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f48220);
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View viewM37258 = m37258();
        if (viewM37258 != null) {
            ViewGroup.LayoutParams layoutParams = viewM37258.getLayoutParams();
            C13045.m29862((Object) layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            viewM37258.setTranslationY((1 - this.f48212) * (viewM37258.getMeasuredHeight() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin));
        }
    }

    /* JADX INFO: renamed from: ۜ */
    public final void m37265() {
        float f = this.f48212;
        if (f == 1.0f) {
            return;
        }
        C13151 c13151 = new C13151();
        c13151.mo30118(f, 1.0f);
        c13151.m30115(new DecelerateInterpolator());
        c13151.mo30121((long) ((1.0f - this.f48212) * 250));
        c13151.m30116(new InterfaceC7786() { // from class: l.ܽ᩷ۡ
            @Override // p067l.InterfaceC7786
            /* JADX INFO: renamed from: ֫ */
            public final void mo18029(C13151 c13152) {
                int i = C16407.f48208;
                Object objM30123 = c13152.m30123();
                C13045.m29862(objM30123, "null cannot be cast to non-null type kotlin.Float");
                this.f55027.m37267(((Float) objM30123).floatValue());
            }
        });
        c13151.m30122();
        this.f48214 = true;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m37269() {
        float f = this.f48212;
        if (f == 0.0f) {
            return;
        }
        float[] fArr = {f, 0.0f};
        C13151 c13151 = new C13151();
        c13151.mo30118(fArr);
        c13151.mo30121((long) (200 * this.f48212));
        c13151.m30116(new InterfaceC7786() { // from class: l.ᩳ᩷ۡ
            @Override // p067l.InterfaceC7786
            /* JADX INFO: renamed from: ֫ */
            public final void mo18029(C13151 c13152) {
                int i = C16407.f48208;
                Object objM30123 = c13152.m30123();
                C13045.m29862(objM30123, "null cannot be cast to non-null type kotlin.Float");
                this.f60121.m37267(((Float) objM30123).floatValue());
            }
        });
        c13151.m30122();
        this.f48214 = false;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putFloat("slideOffset", this.f48212);
        bundle.putParcelable("original", super.onSaveInstanceState());
        return bundle;
    }
}
