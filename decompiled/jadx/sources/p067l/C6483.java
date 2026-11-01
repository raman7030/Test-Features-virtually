package p067l;

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
public final class C6483 {
    /* JADX INFO: renamed from: ᩳ */
    public static void m14861(TextView textView, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i);
        } else {
            textView.setTextAppearance(textView.getContext(), i);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static ActionMode.Callback m14851(ActionMode.Callback callback, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        return (i < 26 || i > 27 || (callback instanceof ActionModeCallbackC21236) || callback == null) ? callback : new ActionModeCallbackC21236(callback, textView);
    }

    /* JADX INFO: renamed from: ֫ */
    public static ActionMode.Callback m14850(ActionMode.Callback callback) {
        return (!(callback instanceof ActionModeCallbackC21236) || Build.VERSION.SDK_INT < 26) ? callback : ((ActionModeCallbackC21236) callback).m47968();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m14853(TextView textView, int i) {
        int i2;
        C1524.m35168(i);
        if (Build.VERSION.SDK_INT >= 28) {
            C22577.m50611(textView, i);
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

    /* JADX INFO: renamed from: ۧ */
    public static void m14859(TextView textView, int i) {
        int i2;
        C1524.m35168(i);
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

    /* JADX INFO: renamed from: ܽ */
    public static void m14860(TextView textView, int i) {
        C1524.m35168(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing(i - fontMetricsInt, 1.0f);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m14854(TextView textView, int i, float f) {
        if (Build.VERSION.SDK_INT >= 34) {
            C23247.m51792(textView, i, f);
        } else {
            m14860(textView, Math.round(TypedValue.applyDimension(i, f, textView.getResources().getDisplayMetrics())));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C0894 m14852(C1567 c1567) {
        TextDirectionHeuristic textDirectionHeuristic;
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new C0894(C22577.m50609(c1567));
        }
        C1104 c1104 = new C1104(new TextPaint(c1567.getPaint()));
        if (i >= 23) {
            c1104.m17110(C9835.m23013(c1567));
            c1104.m17112(C9835.m23020(c1567));
        }
        if (c1567.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i >= 28 && (c1567.getInputType() & 15) == 3) {
            byte directionality = Character.getDirectionality(C22577.m50612(C16540.m37520(c1567.getTextLocale()))[0].codePointAt(0));
            if (directionality == 1 || directionality == 2) {
                textDirectionHeuristic = TextDirectionHeuristics.RTL;
            } else {
                textDirectionHeuristic = TextDirectionHeuristics.LTR;
            }
        } else {
            boolean z = c1567.getLayoutDirection() == 1;
            switch (c1567.getTextDirection()) {
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
        c1104.m17111(textDirectionHeuristic);
        return c1104.m17109();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m14857(C1567 c1567, C0894 c0894) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristicM5878 = c0894.m5878();
        TextDirectionHeuristic textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i = 1;
        if (textDirectionHeuristicM5878 != textDirectionHeuristic2 && textDirectionHeuristicM5878 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristicM5878 == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristicM5878 == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristicM5878 == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristicM5878 == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristicM5878 == textDirectionHeuristic) {
                i = 6;
            } else if (textDirectionHeuristicM5878 == textDirectionHeuristic2) {
                i = 7;
            }
        }
        c1567.setTextDirection(i);
        if (Build.VERSION.SDK_INT < 23) {
            float textScaleX = c0894.m5879().getTextScaleX();
            c1567.getPaint().set(c0894.m5879());
            if (textScaleX == c1567.getTextScaleX()) {
                c1567.setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            c1567.setTextScaleX(textScaleX);
            return;
        }
        c1567.getPaint().set(c0894.m5879());
        C9835.m23014(c1567, c0894.m5875());
        C9835.m23018(c1567, c0894.m5877());
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m14858(C1567 c1567, C1244 c1244) {
        if (Build.VERSION.SDK_INT >= 29) {
            c1244.getClass();
            c1567.setText(C22577.m50610((PrecomputedText) null));
            return;
        }
        C0894 c0894M14852 = m14852(c1567);
        c1244.getClass();
        if (!c0894M14852.m5876(null)) {
            throw new IllegalArgumentException("Given text can not be applied to TextView.");
        }
        c1567.setText(c1244);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public static void m14855(TextView textView, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 24) {
            C9835.m23015(textView, colorStateList);
        } else if (textView instanceof InterfaceC13859) {
            ((InterfaceC13859) textView).setSupportCompoundDrawablesTintList(colorStateList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public static void m14856(TextView textView, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 24) {
            C9835.m23016(textView, mode);
        } else if (textView instanceof InterfaceC13859) {
            ((InterfaceC13859) textView).setSupportCompoundDrawablesTintMode(mode);
        }
    }
}
