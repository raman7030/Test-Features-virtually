package l;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import bin.mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.᩺᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: R9NW */
/* JADX INFO: loaded from: classes.dex */
public final class C23292 extends C18082 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f74787 = 0;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final PathInterpolator f74785 = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final C9497 f74788 = new C9497();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final DecelerateInterpolator f74786 = new DecelerateInterpolator();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Interpolator m51609(int i, C21610 c21610, C21610 c21611) {
        if ((i & 8) != 0) {
            if (c21610.m48815(8).f33108 > c21611.m48815(8).f33108) {
                return f74785;
            }
            return f74788;
        }
        return f74786;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static WindowInsets m51608(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.MT_Protector) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m51612(View view, C17376 c17376, WindowInsets windowInsets, boolean z) {
        AbstractC13414 abstractC13414M51610 = m51610(view);
        if (abstractC13414M51610 != null) {
            abstractC13414M51610.mDispachedInsets = windowInsets;
            if (!z) {
                abstractC13414M51610.onPrepare(c17376);
                z = abstractC13414M51610.getDispatchMode() == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m51612(viewGroup.getChildAt(i), c17376, windowInsets, z);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m51613(View view, C17376 c17376, C3537 c3537) {
        AbstractC13414 abstractC13414M51610 = m51610(view);
        if (abstractC13414M51610 != null) {
            abstractC13414M51610.onStart(c17376, c3537);
            if (abstractC13414M51610.getDispatchMode() == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m51613(viewGroup.getChildAt(i), c17376, c3537);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m51614(View view, C21610 c21610, List list) {
        AbstractC13414 abstractC13414M51610 = m51610(view);
        if (abstractC13414M51610 != null) {
            c21610 = abstractC13414M51610.onProgress(c21610, list);
            if (abstractC13414M51610.getDispatchMode() == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m51614(viewGroup.getChildAt(i), c21610, list);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m51611(View view, C17376 c17376) {
        AbstractC13414 abstractC13414M51610 = m51610(view);
        if (abstractC13414M51610 != null) {
            abstractC13414M51610.onEnd(c17376);
            if (abstractC13414M51610.getDispatchMode() == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m51611(viewGroup.getChildAt(i), c17376);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC13414 m51610(View view) {
        Object tag = view.getTag(R.id.MT_Protector);
        if (tag instanceof ViewOnApplyWindowInsetsListenerC12004) {
            return ((ViewOnApplyWindowInsetsListenerC12004) tag).f35947;
        }
        return null;
    }
}
