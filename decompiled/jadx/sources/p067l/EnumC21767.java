package p067l;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.᩶᩷֫, reason: contains not printable characters */
/* JADX INFO: compiled from: VB94 */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC21767 {
    REMOVED,
    VISIBLE,
    GONE,
    INVISIBLE;

    /* JADX INFO: renamed from: ۧ */
    public static EnumC21767 m49055(View view) {
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return INVISIBLE;
        }
        return m49054(view.getVisibility());
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC21767 m49054(int i) {
        if (i == 0) {
            return VISIBLE;
        }
        if (i == 4) {
            return INVISIBLE;
        }
        if (i == 8) {
            return GONE;
        }
        throw new IllegalArgumentException(C20778.m46922(i, "Unknown visibility "));
    }

    /* JADX INFO: renamed from: ֫ */
    public void m49056(View view) {
        int i = C10367.f28697[ordinal()];
        if (i == 1) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                if (AbstractC7291.m16763(2)) {
                    view.toString();
                    viewGroup.toString();
                }
                viewGroup.removeView(view);
                return;
            }
            return;
        }
        if (i == 2) {
            if (AbstractC7291.m16763(2)) {
                C12826.toString(view);
            }
            view.setVisibility(0);
        } else if (i == 3) {
            if (AbstractC7291.m16763(2)) {
                C12826.toString(view);
            }
            view.setVisibility(8);
        } else {
            if (i != 4) {
                return;
            }
            if (AbstractC7291.m16763(2)) {
                C12826.toString(view);
            }
            view.setVisibility(4);
        }
    }
}
