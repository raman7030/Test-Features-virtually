package p067l;

import android.widget.ImageButton;
import android.widget.TextView;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: l.ܳܺۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: H9SC */
/* JADX INFO: loaded from: classes4.dex */
public final class C16267 {

    /* JADX INFO: renamed from: ֫ */
    public static final Field f47837;

    /* JADX INFO: renamed from: ۧ */
    public static final Field f47838;

    /* JADX INFO: renamed from: ܽ */
    public static final Field f47839;

    static {
        try {
            Field declaredField = C1326.class.getDeclaredField("mTitleTextView");
            f47839 = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = C1326.class.getDeclaredField("mSubtitleTextView");
            f47838 = declaredField2;
            declaredField2.setAccessible(true);
            C1326.class.getDeclaredField("mMenuView").setAccessible(true);
            Field declaredField3 = C1326.class.getDeclaredField("mNavButtonView");
            f47837 = declaredField3;
            declaredField3.setAccessible(true);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static TextView m37071(C1326 c1326) {
        try {
            return (TextView) f47839.get(c1326);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static TextView m37070(C1326 c1326) {
        try {
            return (TextView) f47838.get(c1326);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static ImageButton m37069(C1326 c1326) {
        try {
            return (ImageButton) f47837.get(c1326);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
