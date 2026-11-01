package p067l;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import bin.p000mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.᩺᩺ */
/* JADX INFO: compiled from: R9NW */
/* JADX INFO: loaded from: classes.dex */
public final class C1997 extends C1739 {

    /* JADX INFO: renamed from: ܿ */
    public static final /* synthetic */ int f77532 = 0;

    /* JADX INFO: renamed from: ۜ */
    public static final PathInterpolator f77530 = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: ᩻ */
    public static final C11394 f77533 = new C11394();

    /* JADX INFO: renamed from: ܳ */
    public static final DecelerateInterpolator f77531 = new DecelerateInterpolator();

    /* JADX INFO: renamed from: ֫ */
    public static Interpolator m54005(int i, C1914 c1914, C1914 c1915) {
        if ((i & 8) != 0) {
            if (c1914.m51163(8).f36102 > c1915.m51163(8).f36102) {
                return f77530;
            }
            return f77533;
        }
        return f77531;
    }

    /* JADX INFO: renamed from: ֫ */
    public static WindowInsets m54004(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.MT_Protector) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m54008(View view, C1704 c1704, WindowInsets windowInsets, boolean z) {
        AbstractC1507 abstractC1507M54006 = m54006(view);
        if (abstractC1507M54006 != null) {
            abstractC1507M54006.mDispachedInsets = windowInsets;
            if (!z) {
                abstractC1507M54006.onPrepare(c1704);
                z = abstractC1507M54006.getDispatchMode() == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m54008(viewGroup.getChildAt(i), c1704, windowInsets, z);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m54009(View view, C1704 c1704, C1017 c1017) {
        AbstractC1507 abstractC1507M54006 = m54006(view);
        if (abstractC1507M54006 != null) {
            abstractC1507M54006.onStart(c1704, c1017);
            if (abstractC1507M54006.getDispatchMode() == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m54009(viewGroup.getChildAt(i), c1704, c1017);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m54010(View view, C1914 c1914, List list) {
        AbstractC1507 abstractC1507M54006 = m54006(view);
        if (abstractC1507M54006 != null) {
            c1914 = abstractC1507M54006.onProgress(c1914, list);
            if (abstractC1507M54006.getDispatchMode() == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m54010(viewGroup.getChildAt(i), c1914, list);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m54007(View view, C1704 c1704) {
        AbstractC1507 abstractC1507M54006 = m54006(view);
        if (abstractC1507M54006 != null) {
            abstractC1507M54006.onEnd(c1704);
            if (abstractC1507M54006.getDispatchMode() == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m54007(viewGroup.getChildAt(i), c1704);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC1507 m54006(View view) {
        Object tag = view.getTag(R.id.MT_Protector);
        if (tag instanceof ViewOnApplyWindowInsetsListenerC1437) {
            return ((ViewOnApplyWindowInsetsListenerC1437) tag).f38957;
        }
        return null;
    }
}
