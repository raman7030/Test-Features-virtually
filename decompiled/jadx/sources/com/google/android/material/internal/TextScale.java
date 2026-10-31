package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.HashMap;
import l.AbstractC16620;
import l.C19444;

/* JADX INFO: loaded from: classes.dex */
public class TextScale extends AbstractC16620 {
    public static final String PROPNAME_SCALE = "android:textscale:scale";

    @Override // l.AbstractC16620
    public void captureStartValues(C19444 c19444) {
        captureValues(c19444);
    }

    @Override // l.AbstractC16620
    public void captureEndValues(C19444 c19444) {
        captureValues(c19444);
    }

    private void captureValues(C19444 c19444) {
        View view = c19444.f62890;
        if (view instanceof TextView) {
            c19444.f62889.put(PROPNAME_SCALE, Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // l.AbstractC16620
    public Animator createAnimator(ViewGroup viewGroup, C19444 c19444, C19444 c19445) {
        if (c19444 == null || c19445 == null || !(c19444.f62890 instanceof TextView)) {
            return null;
        }
        View view = c19445.f62890;
        if (!(view instanceof TextView)) {
            return null;
        }
        final TextView textView = (TextView) view;
        HashMap map = c19444.f62889;
        HashMap map2 = c19445.f62889;
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
