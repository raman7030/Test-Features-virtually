package l;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩷᩹ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: C8F7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21165 {
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m48104(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            view.setTag(R.id.MT_Protector, new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin));
            return;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48103(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            Object tag = view.getTag(R.id.MT_Protector);
            C11003.requireNonNull(tag);
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48102(int i, int i2, int i3, View view) {
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
