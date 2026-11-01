package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.HashMap;
import p067l.AbstractC18164;
import p067l.C20848;

/* JADX INFO: loaded from: classes.dex */
public class TextScale extends AbstractC18164 {
    public static final String PROPNAME_SCALE = "android:textscale:scale";

    @Override // p067l.AbstractC18164
    public void captureStartValues(C20848 c20848) {
        captureValues(c20848);
    }

    @Override // p067l.AbstractC18164
    public void captureEndValues(C20848 c20848) {
        captureValues(c20848);
    }

    private void captureValues(C20848 c20848) {
        View view = c20848.f65506;
        if (view instanceof TextView) {
            c20848.f65505.put(PROPNAME_SCALE, Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // p067l.AbstractC18164
    public Animator createAnimator(ViewGroup viewGroup, C20848 c20848, C20848 c20849) {
        if (c20848 == null || c20849 == null || !(c20848.f65506 instanceof TextView)) {
            return null;
        }
        View view = c20849.f65506;
        if (!(view instanceof TextView)) {
            return null;
        }
        final TextView textView = (TextView) view;
        HashMap map = c20848.f65505;
        HashMap map2 = c20849.f65505;
        float fFloatValue = map.get(PROPNAME_SCALE) != null ? ((Float) map.get(PROPNAME_SCALE)).floatValue() : 1.0f;
        float fFloatValue2 = map2.get(PROPNAME_SCALE) != null ? ((Float) map2.get(PROPNAME_SCALE)).floatValue() : 1.0f;
        if (fFloatValue == fFloatValue2) {
            return null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, fFloatValue2);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.internal.TextScale.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                textView.setScaleX(fFloatValue3);
                textView.setScaleY(fFloatValue3);
            }
        });
        return valueAnimatorOfFloat;
    }
}
