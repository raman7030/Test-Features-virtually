package l;

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
import bin.mt.plus.R;
import com.umeng.analytics.pro.d;
import java.util.ArrayList;
import java.util.Iterator;
import moe.shizuku.server.IShizukuService;
import net.engio.mbassy.listener.MessageHandler;

/* JADX INFO: renamed from: l.ܳ᩷ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: HAWX */
/* JADX INFO: loaded from: classes4.dex */
public final class C14771 extends FrameLayout {

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f45094 = 0;

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final VelocityTracker f45095;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f45096;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float f45097;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public float f45098;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public float f45099;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f45100;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ArrayList f45101;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C15416 f45102;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f45103;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public float f45104;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Integer f45105;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final RunnableC22286 f45106;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f45107;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int f45108;

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        C11233.m27805(view, "child");
        C11233.m27805(layoutParams, "params");
        if (view.getId() == R.id.MT_Protector) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 80;
            view.setVisibility(this.f45098 == 0.0f ? 4 : 0);
        } else if (view.getId() == R.id.MT_Protector) {
            view.setVisibility(this.f45098 == 0.0f ? 4 : 0);
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C11233.m27805(motionEvent, "ev");
        if (!this.f45100) {
            this.f45103 = false;
            return super.onInterceptTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f45104 = motionEvent.getX();
            this.f45099 = motionEvent.getY();
            this.f45096 = true;
            this.f45103 = false;
        } else if (action == 2 && this.f45096) {
            float fAbs = Math.abs(motionEvent.getX() - this.f45104);
            float y = motionEvent.getY() - this.f45099;
            if (y > this.f45108 && y > fAbs) {
                if (!C17594.m41121(this, motionEvent.getX(), motionEvent.getY())) {
                    this.f45103 = true;
                    return true;
                }
                this.f45096 = false;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C11233.m27805(motionEvent, "ev");
        if (!this.f45103) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        VelocityTracker velocityTracker = this.f45095;
        if (action != 1) {
            if (action == 2) {
                View viewM35111 = m35111();
                if (viewM35111 == null) {
                    return super.onTouchEvent(motionEvent);
                }
                ViewGroup.LayoutParams layoutParams = viewM35111.getLayoutParams();
                C11233.m27800((Object) layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                float measuredHeight = viewM35111.getMeasuredHeight() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                m35120(1 - (Math.min(Math.max((motionEvent.getY() - this.f45099) * 1.5f, 0.0f), measuredHeight) / measuredHeight));
                velocityTracker.addMovement(motionEvent);
                return true;
            }
            if (action != 3) {
                return true;
            }
        }
        this.f45103 = false;
        velocityTracker.computeCurrentVelocity(1000);
        float yVelocity = velocityTracker.getYVelocity();
        if (yVelocity <= -1000.0f) {
            m35118();
            return true;
        }
        if (yVelocity >= 1000.0f) {
            m35122();
            return true;
        }
        if (this.f45098 > 0.4f) {
            m35118();
            return true;
        }
        m35122();
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35115(C7011 c7011) {
        C11233.m27805(c7011, MessageHandler.Properties.Listener);
        this.f45101.remove(c7011);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35117(InterfaceC23944 interfaceC23944) {
        C11233.m27805(interfaceC23944, MessageHandler.Properties.Listener);
        this.f45101.add(interfaceC23944);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        C11233.m27805(parcelable, "state");
        Bundle bundle = (Bundle) parcelable;
        m35120(bundle.getFloat("slideOffset"));
        super.onRestoreInstanceState(bundle.getParcelable("original"));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C14771(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C11233.m27805(context, d.R);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14771(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C11233.m27805(context, d.R);
        this.f45101 = new ArrayList();
        this.f45106 = new RunnableC22286(4, this);
        this.f45097 = 0.5f;
        this.f45108 = ViewConfiguration.get(context).getScaledTouchSlop();
        setOnClickListener(new ViewOnClickListenerC18869(this, 4));
        m35120(0.0f);
        this.f45100 = false;
        this.f45095 = VelocityTracker.obtain();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m35110(C14771 c14771) {
        if (c14771.f45105 != null || c14771.f45107) {
            c14771.f45105 = null;
            c14771.f45107 = false;
            c14771.requestLayout();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35116(C15416 c15416) {
        this.f45102 = c15416;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC16233 m35123() {
        return this.f45102;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final float m35121() {
        return this.f45098;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m35120(float f) {
        int i;
        View childAt;
        this.f45098 = f;
        int i2 = 0;
        if (f == 1.0f) {
            this.f45100 = true;
        } else if (f == 0.0f) {
            this.f45100 = false;
        }
        Iterator it = this.f45101.iterator();
        while (it.hasNext()) {
            ((InterfaceC23944) it.next()).mo18946(f);
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
        View viewM35111 = m35111();
        if (viewM35111 != null) {
            if (viewM35111.getVisibility() != i) {
                viewM35111.setVisibility(i);
                C15416 c15416 = this.f45102;
                if (c15416 != null) {
                    c15416.invoke(Boolean.valueOf(i == 0));
                }
            }
            ViewGroup.LayoutParams layoutParams = viewM35111.getLayoutParams();
            C11233.m27800((Object) layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            viewM35111.setTranslationY((1 - this.f45098) * (viewM35111.getMeasuredHeight() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin));
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

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final float m35124() {
        return this.f45097;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35113(float f) {
        this.f45097 = f;
        requestLayout();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m35125() {
        return this.f45098 == 0.0f;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private final View m35111() {
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
        View viewM35111 = m35111();
        if (viewM35111 == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = viewM35111.getLayoutParams();
        C11233.m27800((Object) layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int measuredHeight = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - marginLayoutParams.topMargin) - marginLayoutParams.bottomMargin;
        if (measuredHeight <= 0) {
            measuredHeight = 0;
        }
        int iMin = (int) (measuredHeight * this.f45097);
        Integer num = this.f45105;
        if (num != null) {
            int iIntValue = num.intValue();
            if (this.f45107 && measuredHeight >= iIntValue && Math.abs(iMin - iIntValue) <= 1) {
                removeCallbacks(this.f45106);
                this.f45105 = null;
                this.f45107 = false;
            } else {
                iMin = Math.min(iIntValue, measuredHeight);
            }
        }
        viewM35111.measure(View.MeasureSpec.makeMeasureSpec(viewM35111.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(iMin, 1073741824));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35114(int i) {
        int iMax = Math.max(0, i);
        Integer num = this.f45105;
        if (num == null || num.intValue() != iMax || this.f45107) {
            removeCallbacks(this.f45106);
            this.f45105 = Integer.valueOf(iMax);
            this.f45107 = false;
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m35119() {
        if (this.f45105 != null) {
            RunnableC22286 runnableC22286 = this.f45106;
            removeCallbacks(runnableC22286);
            postDelayed(runnableC22286, 400L);
        }
        if (this.f45105 == null || this.f45107) {
            return;
        }
        this.f45107 = true;
        requestLayout();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35112() {
        if (this.f45105 != null || this.f45107) {
            removeCallbacks(this.f45106);
            this.f45105 = null;
            this.f45107 = false;
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f45106);
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View viewM35111 = m35111();
        if (viewM35111 != null) {
            ViewGroup.LayoutParams layoutParams = viewM35111.getLayoutParams();
            C11233.m27800((Object) layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            viewM35111.setTranslationY((1 - this.f45098) * (viewM35111.getMeasuredHeight() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin));
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m35118() {
        float f = this.f45098;
        if (f == 1.0f) {
            return;
        }
        C11346 c11346 = new C11346();
        c11346.mo28073(f, 1.0f);
        c11346.m28070(new DecelerateInterpolator());
        c11346.mo28076((long) ((1.0f - this.f45098) * 250));
        c11346.m28071(new InterfaceC5701() { // from class: l.ܽ᩷ۡ
            @Override // l.InterfaceC5701
            /* JADX INFO: renamed from: ֫ */
            public final void mo16110(C11346 c11347) {
                int i = C14771.f45094;
                Object objM28078 = c11347.m28078();
                C11233.m27800(objM28078, "null cannot be cast to non-null type kotlin.Float");
                this.f51846.m35120(((Float) objM28078).floatValue());
            }
        });
        c11346.m28077();
        this.f45100 = true;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m35122() {
        float f = this.f45098;
        if (f == 0.0f) {
            return;
        }
        float[] fArr = {f, 0.0f};
        C11346 c11346 = new C11346();
        c11346.mo28073(fArr);
        c11346.mo28076((long) (200 * this.f45098));
        c11346.m28071(new InterfaceC5701() { // from class: l.ᩳ᩷ۡ
            @Override // l.InterfaceC5701
            /* JADX INFO: renamed from: ֫ */
            public final void mo16110(C11346 c11347) {
                int i = C14771.f45094;
                Object objM28078 = c11347.m28078();
                C11233.m27800(objM28078, "null cannot be cast to non-null type kotlin.Float");
                this.f56903.m35120(((Float) objM28078).floatValue());
            }
        });
        c11346.m28077();
        this.f45100 = false;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putFloat("slideOffset", this.f45098);
        bundle.putParcelable("original", super.onSaveInstanceState());
        return bundle;
    }
}
