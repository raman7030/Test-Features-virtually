package p067l;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩷ۛۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: P5CY */
/* JADX INFO: loaded from: classes5.dex */
public class C22032 extends AbstractC4399 {
    @Override // p067l.AbstractC18164
    public final boolean isSeekingSupported() {
        return true;
    }

    public C22032(int i) {
        setMode(i);
    }

    public C22032(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C16665.f49043);
        setMode(C0989.m11086(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "fadingMode", 0, getMode()));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // p067l.AbstractC4399, p067l.AbstractC18164
    public final void captureStartValues(C20848 c20848) {
        super.captureStartValues(c20848);
        Float fValueOf = (Float) c20848.f65506.getTag(R.id.MT_Protector);
        if (fValueOf == null) {
            if (c20848.f65506.getVisibility() == 0) {
                fValueOf = Float.valueOf(C22859.m51058(c20848.f65506));
            } else {
                fValueOf = Float.valueOf(0.0f);
            }
        }
        c20848.f65505.put("android:fade:transitionAlpha", fValueOf);
    }

    /* JADX INFO: renamed from: ֫ */
    private ObjectAnimator m49631(float f, float f2, View view) {
        if (f == f2) {
            return null;
        }
        C22859.m51060(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) C22859.f71975, f2);
        C8620 c8620 = new C8620(view);
        objectAnimatorOfFloat.addListener(c8620);
        getRootTransition().addListener(c8620);
        return objectAnimatorOfFloat;
    }

    @Override // p067l.AbstractC4399
    public final Animator onAppear(ViewGroup viewGroup, View view, C20848 c20848, C20848 c20849) {
        C22859.m51065();
        return m49631(m49630(c20848, 0.0f), 1.0f, view);
    }

    @Override // p067l.AbstractC4399
    public final Animator onDisappear(ViewGroup viewGroup, View view, C20848 c20848, C20848 c20849) {
        C22859.m51065();
        ObjectAnimator objectAnimatorM49631 = m49631(m49630(c20848, 1.0f), 0.0f, view);
        if (objectAnimatorM49631 == null) {
            C22859.m51060(view, m49630(c20849, 1.0f));
        }
        return objectAnimatorM49631;
    }

    /* JADX INFO: renamed from: ֫ */
    public static float m49630(C20848 c20848, float f) {
        Float f2;
        return (c20848 == null || (f2 = (Float) c20848.f65505.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }
}
