package l;

import android.widget.ImageButton;
import android.widget.TextView;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: l.ܳܺۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: H9SC */
/* JADX INFO: loaded from: classes4.dex */
public final class C14624 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Field f44730;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Field f44731;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Field f44732;

    static {
        try {
            Field declaredField = C9762.class.getDeclaredField("mTitleTextView");
            f44732 = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = C9762.class.getDeclaredField("mSubtitleTextView");
            f44731 = declaredField2;
            declaredField2.setAccessible(true);
            C9762.class.getDeclaredField("mMenuView").setAccessible(true);
            Field declaredField3 = C9762.class.getDeclaredField("mNavButtonView");
            f44730 = declaredField3;
            declaredField3.setAccessible(true);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static TextView m34924(C9762 c9762) {
        try {
            return (TextView) f44732.get(c9762);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static TextView m34923(C9762 c9762) {
        try {
            return (TextView) f44731.get(c9762);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ImageButton m34922(C9762 c9762) {
        try {
            return (ImageButton) f44730.get(c9762);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
