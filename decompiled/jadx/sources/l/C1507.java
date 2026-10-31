package l;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.CompoundButton;

/* JADX INFO: renamed from: l.֫֫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: R52T */
/* JADX INFO: loaded from: classes2.dex */
public final class C1507 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m5189(CompoundButton compoundButton, ColorStateList colorStateList) {
        compoundButton.setButtonTintList(colorStateList);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ColorStateList m5188(CompoundButton compoundButton) {
        return compoundButton.getButtonTintList();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m5190(CompoundButton compoundButton, PorterDuff.Mode mode) {
        compoundButton.setButtonTintMode(mode);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static PorterDuff.Mode m5191(CompoundButton compoundButton) {
        return compoundButton.getButtonTintMode();
    }
}
