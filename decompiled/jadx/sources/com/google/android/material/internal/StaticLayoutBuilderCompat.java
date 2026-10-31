package com.google.android.material.internal;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes.dex */
public final class StaticLayoutBuilderCompat {
    public static final int DEFAULT_HYPHENATION_FREQUENCY;
    public static final float DEFAULT_LINE_SPACING_ADD = 0.0f;
    public static final float DEFAULT_LINE_SPACING_MULTIPLIER = 1.0f;
    public static final String TEXT_DIRS_CLASS = "android.text.TextDirectionHeuristics";
    public static final String TEXT_DIR_CLASS = "android.text.TextDirectionHeuristic";
    public static final String TEXT_DIR_CLASS_LTR = "LTR";
    public static final String TEXT_DIR_CLASS_RTL = "RTL";
    public static Constructor constructor;
    public static boolean initialized;
    public static Object textDirection;
    public int end;
    public boolean isRtl;
    public final TextPaint paint;
    public CharSequence source;
    public StaticLayoutBuilderConfigurer staticLayoutBuilderConfigurer;
    public final int width;
    public int start = 0;
    public Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
    public int maxLines = Integer.MAX_VALUE;
    public float lineSpacingAdd = 0.0f;
    public float lineSpacingMultiplier = 1.0f;
    public int hyphenationFrequency = DEFAULT_HYPHENATION_FREQUENCY;
    public boolean includePad = true;
    public TextUtils.TruncateAt ellipsize = null;

    static {
        DEFAULT_HYPHENATION_FREQUENCY = Build.VERSION.SDK_INT >= 23 ? 1 : 0;
    }

    public StaticLayoutBuilderCompat(CharSequence charSequence, TextPaint textPaint, int i) {
        this.source = charSequence;
        this.paint = textPaint;
        this.width = i;
        this.end = charSequence.length();
    }

    public static StaticLayoutBuilderCompat obtain(CharSequence charSequence, TextPaint textPaint, int i) {
        return new StaticLayoutBuilderCompat(charSequence, textPaint, i);
    }

    public StaticLayoutBuilderCompat setAlignment(Layout.Alignment alignment) {
        this.alignment = alignment;
        return this;
    }

    public StaticLayoutBuilderCompat setIncludePad(boolean z) {
        this.includePad = z;
        return this;
    }

    public StaticLayoutBuilderCompat setStart(int i) {
        this.start = i;
        return this;
    }

    public StaticLayoutBuilderCompat setEnd(int i) {
        this.end = i;
        return this;
    }

    public StaticLayoutBuilderCompat setMaxLines(int i) {
        this.maxLines = i;
        return this;
    }

    public StaticLayoutBuilderCompat setLineSpacing(float f, float f2) {
        this.lineSpacingAdd = f;
        this.lineSpacingMultiplier = f2;
        return this;
    }

    public StaticLayoutBuilderCompat setHyphenationFrequency(int i) {
        this.hyphenationFrequency = i;
        return this;
    }

    public StaticLayoutBuilderCompat setEllipsize(TextUtils.TruncateAt truncateAt) {
        this.ellipsize = truncateAt;
        return this;
    }

    public StaticLayoutBuilderCompat setStaticLayoutBuilderConfigurer(StaticLayoutBuilderConfigurer staticLayoutBuilderConfigurer) {
        this.staticLayoutBuilderConfigurer = staticLayoutBuilderConfigurer;
        return this;
    }

    public StaticLayout build() throws StaticLayoutBuilderCompatException {
        TextDirectionHeuristic textDirectionHeuristic;
        if (this.source == null) {
            this.source = "";
        }
        int iMax = Math.max(0, this.width);
        CharSequence charSequenceEllipsize = this.source;
        if (this.maxLines == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.paint, iMax, this.ellipsize);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.end);
        this.end = iMin;
        if (Build.VERSION.SDK_INT >= 23) {
            if (this.isRtl && this.maxLines == 1) {
                this.alignment = Layout.Alignment.ALIGN_OPPOSITE;
            }
            StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, this.start, iMin, this.paint, iMax);
            builderObtain.setAlignment(this.alignment);
            builderObtain.setIncludePad(this.includePad);
            if (this.isRtl) {
                textDirectionHeuristic = TextDirectionHeuristics.RTL;
            } else {
                textDirectionHeuristic = TextDirectionHeuristics.LTR;
            }
            builderObtain.setTextDirection(textDirectionHeuristic);
            TextUtils.TruncateAt truncateAt = this.ellipsize;
            if (truncateAt != null) {
                builderObtain.setEllipsize(truncateAt);
            }
            builderObtain.setMaxLines(this.maxLines);
            float f = this.lineSpacingAdd;
            if (f != 0.0f || this.lineSpacingMultiplier != 1.0f) {
                builderObtain.setLineSpacing(f, this.lineSpacingMultiplier);
            }
            if (this.maxLines > 1) {
                builderObtain.setHyphenationFrequency(this.hyphenationFrequency);
            }
            StaticLayoutBuilderConfigurer staticLayoutBuilderConfigurer = this.staticLayoutBuilderConfigurer;
            if (staticLayoutBuilderConfigurer != null) {
                staticLayoutBuilderConfigurer.configure(builderObtain);
            }
            return builderObtain.build();
        }
        createConstructorWithReflection();
        try {
            Constructor constructor2 = constructor;
            constructor2.getClass();
            Integer numValueOf = Integer.valueOf(this.start);
            Integer numValueOf2 = Integer.valueOf(this.end);
            TextPaint textPaint = this.paint;
            Integer numValueOf3 = Integer.valueOf(iMax);
            Layout.Alignment alignment = this.alignment;
            Object obj = textDirection;
            obj.getClass();
            return (StaticLayout) constructor2.newInstance(charSequenceEllipsize, numValueOf, numValueOf2, textPaint, numValueOf3, alignment, obj, Float.valueOf(1.0f), Float.valueOf(0.0f), Boolean.valueOf(this.includePad), null, Integer.valueOf(iMax), Integer.valueOf(this.maxLines));
        } catch (Exception e) {
            throw new StaticLayoutBuilderCompatException(e);
        }
    }

    private void createConstructorWithReflection() throws StaticLayoutBuilderCompatException {
        if (initialized) {
            return;
        }
        try {
            textDirection = this.isRtl && Build.VERSION.SDK_INT >= 23 ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Constructor declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
            constructor = declaredConstructor;
            declaredConstructor.setAccessible(true);
            initialized = true;
        } catch (Exception e) {
            throw new StaticLayoutBuilderCompatException(e);
        }
    }

    public StaticLayoutBuilderCompat setIsRtl(boolean z) {
        this.isRtl = z;
        return this;
    }

    public class StaticLayoutBuilderCompatException extends Exception {
        public StaticLayoutBuilderCompatException(Throwable th) {
            super("Error thrown initializing StaticLayout " + th.getMessage(), th);
        }
    }
}
