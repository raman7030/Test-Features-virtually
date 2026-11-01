package p067l;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩷᩹ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: C8F7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C22484 {
    /* JADX INFO: renamed from: ۧ */
    public static void m50434(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            view.setTag(R.id.MT_Protector, new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin));
            return;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m50433(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            Object tag = view.getTag(R.id.MT_Protector);
            C12826.requireNonNull(tag);
            Rect rect = (Rect) tag;
            marginLayoutParams.leftMargin = rect.left;
            marginLayoutParams.topMargin = rect.top;
            marginLayoutParams.rightMargin = rect.right;
            marginLayoutParams.bottomMargin = rect.bottom;
            view.setLayoutParams(marginLayoutParams);
            return;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m50432(int i, int i2, int i3, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (i != -1) {
                marginLayoutParams.leftMargin = i;
            }
            if (i2 != -1) {
                marginLayoutParams.topMargin = i2;
            }
            if (i3 != -1) {
                marginLayoutParams.rightMargin = i3;
            }
            view.setLayoutParams(marginLayoutParams);
            return;
        }
        throw new IllegalArgumentException();
    }
}
