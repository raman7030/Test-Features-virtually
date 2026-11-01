package p067l;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.TextView;

/* JADX INFO: renamed from: l.۠֫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: L5YG */
/* JADX INFO: loaded from: classes3.dex */
public final class C9835 {
    /* JADX INFO: renamed from: ֫ */
    public static int m23013(TextView textView) {
        return textView.getBreakStrategy();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m23014(TextView textView, int i) {
        textView.setBreakStrategy(i);
    }

    /* JADX INFO: renamed from: ᩳ */
    public static int m23020(TextView textView) {
        return textView.getHyphenationFrequency();
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m23018(TextView textView, int i) {
        textView.setHyphenationFrequency(i);
    }

    /* JADX INFO: renamed from: ܽ */
    public static PorterDuff.Mode m23019(TextView textView) {
        return textView.getCompoundDrawableTintMode();
    }

    /* JADX INFO: renamed from: ۧ */
    public static ColorStateList m23017(TextView textView) {
        return textView.getCompoundDrawableTintList();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m23015(TextView textView, ColorStateList colorStateList) {
        textView.setCompoundDrawableTintList(colorStateList);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m23016(TextView textView, PorterDuff.Mode mode) {
        textView.setCompoundDrawableTintMode(mode);
    }
}
