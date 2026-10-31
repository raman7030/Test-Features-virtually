package l;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.TypedValue;
import android.view.ActionMode;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ۙ֫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: L5YG */
/* JADX INFO: loaded from: classes2.dex */
public final class C4330 {
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m12997(TextView textView, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i);
        } else {
            textView.setTextAppearance(textView.getContext(), i);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ActionMode.Callback m12987(ActionMode.Callback callback, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        return (i < 26 || i > 27 || (callback instanceof ActionModeCallbackC19853) || callback == null) ? callback : new ActionModeCallbackC19853(callback, textView);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ActionMode.Callback m12986(ActionMode.Callback callback) {
        return (!(callback instanceof ActionModeCallbackC19853) || Build.VERSION.SDK_INT < 26) ? callback : ((ActionModeCallbackC19853) callback).m45657();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m12989(TextView textView, int i) {
        int i2;
        C13746.m33054(i);
        if (Build.VERSION.SDK_INT >= 28) {
            C21264.m48280(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (textView.getIncludeFontPadding()) {
            i2 = fontMetricsInt.top;
        } else {
            i2 = fontMetricsInt.ascent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m12995(TextView textView, int i) {
        int i2;
        C13746.m33054(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (textView.getIncludeFontPadding()) {
            i2 = fontMetricsInt.bottom;
        } else {
            i2 = fontMetricsInt.descent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m12996(TextView textView, int i) {
        C13746.m33054(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing(i - fontMetricsInt, 1.0f);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m12990(TextView textView, int i, float f) {
        if (Build.VERSION.SDK_INT >= 34) {
            C21969.m49455(textView, i, f);
        } else {
            m12996(textView, Math.round(TypedValue.applyDimension(i, f, textView.getResources().getDisplayMetrics())));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C1047 m12988(C14615 c14615) {
        TextDirectionHeuristic textDirectionHeuristic;
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new C1047(C21264.m48278(c14615));
        }
        C5281 c5281 = new C5281(new TextPaint(c14615.getPaint()));
        if (i >= 23) {
            c5281.m15207(C7857.m21048(c14615));
            c5281.m15209(C7857.m21055(c14615));
        }
        if (c14615.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i >= 28 && (c14615.getInputType() & 15) == 3) {
            byte directionality = Character.getDirectionality(C21264.m48281(C14912.m35368(c14615.getTextLocale()))[0].codePointAt(0));
            if (directionality == 1 || directionality == 2) {
                textDirectionHeuristic = TextDirectionHeuristics.RTL;
            } else {
                textDirectionHeuristic = TextDirectionHeuristics.LTR;
            }
        } else {
            boolean z = c14615.getLayoutDirection() == 1;
            switch (c14615.getTextDirection()) {
                case 2:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case 3:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case 4:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case 5:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case 6:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                    break;
                case 7:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    if (z) {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    } else {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                    }
                    break;
            }
        }
        c5281.m15208(textDirectionHeuristic);
        return c5281.m15206();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m12993(C14615 c14615, C1047 c1047) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristicM3607 = c1047.m3607();
        TextDirectionHeuristic textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i = 1;
        if (textDirectionHeuristicM3607 != textDirectionHeuristic2 && textDirectionHeuristicM3607 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristicM3607 == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristicM3607 == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristicM3607 == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristicM3607 == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristicM3607 == textDirectionHeuristic) {
                i = 6;
            } else if (textDirectionHeuristicM3607 == textDirectionHeuristic2) {
                i = 7;
            }
        }
        c14615.setTextDirection(i);
        if (Build.VERSION.SDK_INT < 23) {
            float textScaleX = c1047.m3608().getTextScaleX();
            c14615.getPaint().set(c1047.m3608());
            if (textScaleX == c14615.getTextScaleX()) {
                c14615.setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            c14615.setTextScaleX(textScaleX);
            return;
        }
        c14615.getPaint().set(c1047.m3608());
        C7857.m21049(c14615, c1047.m3604());
        C7857.m21053(c14615, c1047.m3606());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m12994(C14615 c14615, C8103 c8103) {
        if (Build.VERSION.SDK_INT >= 29) {
            c8103.getClass();
            c14615.setText(C21264.m48279((PrecomputedText) null));
            return;
        }
        C1047 c1047M12988 = m12988(c14615);
        c8103.getClass();
        if (!c1047M12988.m3605(null)) {
            throw new IllegalArgumentException("Given text can not be applied to TextView.");
        }
        c14615.setText(c8103);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m12991(TextView textView, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 24) {
            C7857.m21050(textView, colorStateList);
        } else if (textView instanceof InterfaceC12091) {
            ((InterfaceC12091) textView).setSupportCompoundDrawablesTintList(colorStateList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m12992(TextView textView, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 24) {
            C7857.m21051(textView, mode);
        } else if (textView instanceof InterfaceC12091) {
            ((InterfaceC12091) textView).setSupportCompoundDrawablesTintMode(mode);
        }
    }
}
