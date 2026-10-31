package l;

import android.graphics.Rect;
import android.view.View;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۢ᩹ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8FY */
/* JADX INFO: loaded from: classes3.dex */
public final class C9876 implements InterfaceC21929 {
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m24969(View view) {
        view.setTag(R.id.MT_Protector, new Rect(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom()));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m24966(View view) {
        Object tag = view.getTag(R.id.MT_Protector);
        C11003.requireNonNull(tag);
        Rect rect = (Rect) tag;
        view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.InterfaceC21929
    /* JADX INFO: renamed from: ֫ */
    public Object mo18064(float f, Float f2, Float f3) {
        int iIntValue = ((Integer) f2).intValue();
        return Integer.valueOf((int) ((f * (((Integer) f3).intValue() - iIntValue)) + iIntValue));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m24967(View view, int i, int i2, int i3, int i4) {
        if (i == -1) {
            i = view.getPaddingLeft();
        }
        if (i2 == -1) {
            i2 = view.getPaddingTop();
        }
        if (i3 == -1) {
            i3 = view.getPaddingRight();
        }
        if (i4 == -1) {
            i4 = view.getPaddingBottom();
        }
        view.setPadding(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m24965(int i, int i2, int i3) {
        if (i2 < 0) {
            throw new ArrayIndexOutOfBoundsException(C18307.m42645(i2, "Start index (", ") is negative"));
        }
        if (i2 > i3) {
            throw new IllegalArgumentException(C19373.m44634("Start index (", i2, ") is greater than end index (", MotionUtils.EASING_TYPE_FORMAT_END, i3));
        }
        if (i3 > i) {
            throw new ArrayIndexOutOfBoundsException(C19373.m44634("End index (", i3, ") is greater than array length (", MotionUtils.EASING_TYPE_FORMAT_END, i));
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m24968(int i, int i2, int i3) {
        if (i2 < 0) {
            throw new ArrayIndexOutOfBoundsException(C18307.m42645(i2, "Offset (", ") is negative"));
        }
        if (i3 < 0) {
            throw new IllegalArgumentException(C18307.m42645(i3, "Length (", ") is negative"));
        }
        if (i3 <= i - i2) {
            return;
        }
        throw new ArrayIndexOutOfBoundsException("Last index (" + (((long) i2) + ((long) i3)) + ") is greater than array length (" + i + MotionUtils.EASING_TYPE_FORMAT_END);
    }
}
