package p067l;

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
public final class C17881 {

    /* JADX INFO: renamed from: ֫ */
    public static Field f53441;

    /* JADX INFO: renamed from: ۧ */
    public static boolean f53442;

    /* JADX INFO: renamed from: ֫ */
    public static void m40685(CompoundButton compoundButton, ColorStateList colorStateList) {
        C3800.m7415(compoundButton, colorStateList);
    }

    /* JADX INFO: renamed from: ֫ */
    public static ColorStateList m40682(MaterialRadioButton materialRadioButton) {
        return C3800.m7414(materialRadioButton);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m40686(CompoundButton compoundButton, PorterDuff.Mode mode) {
        C3800.m7416(compoundButton, mode);
    }

    /* JADX INFO: renamed from: ֫ */
    public static PorterDuff.Mode m40683(MaterialCheckBox materialCheckBox) {
        return C3800.m7417(materialCheckBox);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Drawable m40684(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C12518.m28849(compoundButton);
        }
        if (!f53442) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                f53441 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f53442 = true;
        }
        Field field = f53441;
        if (field != null) {
            try {
                return (Drawable) field.get(compoundButton);
            } catch (IllegalAccessException unused2) {
                f53441 = null;
            }
        }
        return null;
    }
}
