package l;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.CompoundButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.radiobutton.MaterialRadioButton;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: l.ܽ֫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: R52T */
/* JADX INFO: loaded from: classes4.dex */
public final class C16323 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Field f50269;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean f50270;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m38470(CompoundButton compoundButton, ColorStateList colorStateList) {
        C1507.m5189(compoundButton, colorStateList);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ColorStateList m38467(MaterialRadioButton materialRadioButton) {
        return C1507.m5188(materialRadioButton);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m38471(CompoundButton compoundButton, PorterDuff.Mode mode) {
        C1507.m5190(compoundButton, mode);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static PorterDuff.Mode m38468(MaterialCheckBox materialCheckBox) {
        return C1507.m5191(materialCheckBox);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Drawable m38469(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C10680.m26810(compoundButton);
        }
        if (!f50270) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                f50269 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f50270 = true;
        }
        Field field = f50269;
        if (field != null) {
            try {
                return (Drawable) field.get(compoundButton);
            } catch (IllegalAccessException unused2) {
                f50269 = null;
            }
        }
        return null;
    }
}
