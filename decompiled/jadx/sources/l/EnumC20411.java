package l;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.᩶᩷֫, reason: contains not printable characters */
/* JADX INFO: compiled from: VB94 */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC20411 {
    REMOVED,
    VISIBLE,
    GONE,
    INVISIBLE;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static EnumC20411 m46732(View view) {
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return INVISIBLE;
        }
        return m46731(view.getVisibility());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC20411 m46731(int i) {
        if (i == 0) {
            return VISIBLE;
        }
        if (i == 4) {
            return INVISIBLE;
        }
        if (i == 8) {
            return GONE;
        }
        throw new IllegalArgumentException(C19370.m44628(i, "Unknown visibility "));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m46733(View view) {
        int i = C8416.f25783[ordinal()];
        if (i == 1) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                if (AbstractC5180.m14853(2)) {
                    view.toString();
                    viewGroup.toString();
                }
                viewGroup.removeView(view);
                return;
            }
            return;
        }
        if (i == 2) {
            if (AbstractC5180.m14853(2)) {
                C11003.toString(view);
            }
            view.setVisibility(0);
        } else if (i == 3) {
            if (AbstractC5180.m14853(2)) {
                C11003.toString(view);
            }
            view.setVisibility(8);
        } else {
            if (i != 4) {
                return;
            }
            if (AbstractC5180.m14853(2)) {
                C11003.toString(view);
            }
            view.setVisibility(4);
        }
    }
}
