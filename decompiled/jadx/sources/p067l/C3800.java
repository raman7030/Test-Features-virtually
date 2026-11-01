package p067l;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.CompoundButton;

/* JADX INFO: renamed from: l.֫֫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: R52T */
/* JADX INFO: loaded from: classes2.dex */
public final class C3800 {
    /* JADX INFO: renamed from: ֫ */
    public static void m7415(CompoundButton compoundButton, ColorStateList colorStateList) {
        compoundButton.setButtonTintList(colorStateList);
    }

    /* JADX INFO: renamed from: ֫ */
    public static ColorStateList m7414(CompoundButton compoundButton) {
        return compoundButton.getButtonTintList();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m7416(CompoundButton compoundButton, PorterDuff.Mode mode) {
        compoundButton.setButtonTintMode(mode);
    }

    /* JADX INFO: renamed from: ۧ */
    public static PorterDuff.Mode m7417(CompoundButton compoundButton) {
        return compoundButton.getButtonTintMode();
    }
}
