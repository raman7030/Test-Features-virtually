package com.google.android.material.color.utilities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Function;
import p067l.C22038;
import p067l.C7780;

/* JADX INFO: loaded from: classes.dex */
public final class DynamicColor {
    public final Function background;
    public final ContrastCurve contrastCurve;
    public final HashMap hctCache;
    public final boolean isBackground;
    public final String name;
    public final Function opacity;
    public final Function palette;
    public final Function secondBackground;
    public final Function tone;
    public final Function toneDeltaPair;

    public static /* synthetic */ TonalPalette lambda$fromArgb$0(TonalPalette tonalPalette, DynamicScheme dynamicScheme) {
        return tonalPalette;
    }

    public DynamicColor(String str, Function function, Function function2, boolean z, Function function3, Function function4, ContrastCurve contrastCurve, Function function5) {
        this.hctCache = new HashMap();
        this.name = str;
        this.palette = function;
        this.tone = function2;
        this.isBackground = z;
        this.background = function3;
        this.secondBackground = function4;
        this.contrastCurve = contrastCurve;
        this.toneDeltaPair = function5;
        this.opacity = null;
    }

    public DynamicColor(String str, Function function, Function function2, boolean z, Function function3, Function function4, ContrastCurve contrastCurve, Function function5, Function function6) {
        this.hctCache = new HashMap();
        this.name = str;
        this.palette = function;
        this.tone = function2;
        this.isBackground = z;
        this.background = function3;
        this.secondBackground = function4;
        this.contrastCurve = contrastCurve;
        this.toneDeltaPair = function5;
        this.opacity = function6;
    }

    public static DynamicColor fromPalette(String str, Function function, Function function2) {
        return new DynamicColor(str, function, function2, false, null, null, null, null);
    }

    public static DynamicColor fromPalette(String str, Function function, Function function2, boolean z) {
        return new DynamicColor(str, function, function2, z, null, null, null, null);
    }

    public static DynamicColor fromArgb(String str, int i) {
        Hct hctFromInt = Hct.fromInt(i);
        final TonalPalette tonalPaletteFromInt = TonalPalette.fromInt(i);
        return fromPalette(str, new Function() { // from class: com.google.android.material.color.utilities.DynamicColor$$ExternalSyntheticLambda0
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo56417andThen(Function function) {
                return C22038.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return DynamicColor.lambda$fromArgb$0(tonalPaletteFromInt, (DynamicScheme) obj);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C22038.$default$compose(this, function);
            }
        }, new C7780(1, hctFromInt));
    }

    public static /* synthetic */ Double lambda$fromArgb$1(Hct hct, DynamicScheme dynamicScheme) {
        return Double.valueOf(hct.getTone());
    }

    public int getArgb(DynamicScheme dynamicScheme) {
        int i = getHct(dynamicScheme).toInt();
        Function function = this.opacity;
        if (function == null) {
            return i;
        }
        return (MathUtils.clampInt(0, 255, (int) Math.round(((Double) function.apply(dynamicScheme)).doubleValue() * 255.0d)) << 24) | (i & 16777215);
    }

    public Hct getHct(DynamicScheme dynamicScheme) {
        Hct hct = (Hct) this.hctCache.get(dynamicScheme);
        if (hct != null) {
            return hct;
        }
        Hct hct2 = ((TonalPalette) this.palette.apply(dynamicScheme)).getHct(getTone(dynamicScheme));
        if (this.hctCache.size() > 4) {
            this.hctCache.clear();
        }
        this.hctCache.put(dynamicScheme, hct2);
        return hct2;
    }

    public double getTone(DynamicScheme dynamicScheme) {
        double dMin;
        double dMax;
        boolean z = dynamicScheme.contrastLevel < 0.0d;
        Function function = this.toneDeltaPair;
        if (function != null) {
            ToneDeltaPair toneDeltaPair = (ToneDeltaPair) function.apply(dynamicScheme);
            DynamicColor roleA = toneDeltaPair.getRoleA();
            DynamicColor roleB = toneDeltaPair.getRoleB();
            double delta = toneDeltaPair.getDelta();
            TonePolarity polarity = toneDeltaPair.getPolarity();
            boolean stayTogether = toneDeltaPair.getStayTogether();
            double tone = ((DynamicColor) this.background.apply(dynamicScheme)).getTone(dynamicScheme);
            boolean z2 = polarity == TonePolarity.NEARER || (polarity == TonePolarity.LIGHTER && !dynamicScheme.isDark) || (polarity == TonePolarity.DARKER && dynamicScheme.isDark);
            DynamicColor dynamicColor = z2 ? roleA : roleB;
            if (!z2) {
                roleB = roleA;
            }
            boolean zEquals = this.name.equals(dynamicColor.name);
            double d = dynamicScheme.isDark ? 1.0d : -1.0d;
            double d2 = 60.0d;
            double contrast = dynamicColor.contrastCurve.getContrast(dynamicScheme.contrastLevel);
            double contrast2 = roleB.contrastCurve.getContrast(dynamicScheme.contrastLevel);
            double dDoubleValue = ((Double) dynamicColor.tone.apply(dynamicScheme)).doubleValue();
            if (Contrast.ratioOfTones(tone, dDoubleValue) < contrast) {
                dDoubleValue = foregroundTone(tone, contrast);
            }
            double dClampDouble = dDoubleValue;
            double dDoubleValue2 = ((Double) roleB.tone.apply(dynamicScheme)).doubleValue();
            if (Contrast.ratioOfTones(tone, dDoubleValue2) < contrast2) {
                dDoubleValue2 = foregroundTone(tone, contrast2);
            }
            if (z) {
                dClampDouble = foregroundTone(tone, contrast);
                dDoubleValue2 = foregroundTone(tone, contrast2);
            }
            if ((dDoubleValue2 - dClampDouble) * d < delta) {
                double d3 = delta * d;
                dDoubleValue2 = MathUtils.clampDouble(0.0d, 100.0d, dClampDouble + d3);
                if ((dDoubleValue2 - dClampDouble) * d < delta) {
                    dClampDouble = MathUtils.clampDouble(0.0d, 100.0d, dDoubleValue2 - d3);
                }
            }
            if (50.0d > dClampDouble || dClampDouble >= 60.0d) {
                if (50.0d > dDoubleValue2 || dDoubleValue2 >= 60.0d) {
                    d2 = dDoubleValue2;
                } else if (stayTogether) {
                    if (d > 0.0d) {
                        dMax = Math.max(dDoubleValue2, (delta * d) + 60.0d);
                        dClampDouble = 60.0d;
                        d2 = dMax;
                    } else {
                        dMin = Math.min(dDoubleValue2, (delta * d) + 49.0d);
                        d2 = dMin;
                        dClampDouble = 49.0d;
                    }
                } else if (d <= 0.0d) {
                    d2 = 49.0d;
                }
            } else if (d > 0.0d) {
                dMax = Math.max(dDoubleValue2, (delta * d) + 60.0d);
                dClampDouble = 60.0d;
                d2 = dMax;
            } else {
                dMin = Math.min(dDoubleValue2, (delta * d) + 49.0d);
                d2 = dMin;
                dClampDouble = 49.0d;
            }
            return zEquals ? dClampDouble : d2;
        }
        double d4 = 60.0d;
        double dDoubleValue3 = ((Double) this.tone.apply(dynamicScheme)).doubleValue();
        Function function2 = this.background;
        if (function2 == null) {
            return dDoubleValue3;
        }
        double tone2 = ((DynamicColor) function2.apply(dynamicScheme)).getTone(dynamicScheme);
        double contrast3 = this.contrastCurve.getContrast(dynamicScheme.contrastLevel);
        if (Contrast.ratioOfTones(tone2, dDoubleValue3) < contrast3) {
            dDoubleValue3 = foregroundTone(tone2, contrast3);
        }
        if (z) {
            dDoubleValue3 = foregroundTone(tone2, contrast3);
        }
        if (!this.isBackground || 50.0d > dDoubleValue3 || dDoubleValue3 >= 60.0d) {
            d4 = dDoubleValue3;
        } else if (Contrast.ratioOfTones(49.0d, tone2) >= contrast3) {
            d4 = 49.0d;
        }
        if (this.secondBackground == null) {
            return d4;
        }
        double tone3 = ((DynamicColor) this.background.apply(dynamicScheme)).getTone(dynamicScheme);
        double tone4 = ((DynamicColor) this.secondBackground.apply(dynamicScheme)).getTone(dynamicScheme);
        double dMax2 = Math.max(tone3, tone4);
        double dMin2 = Math.min(tone3, tone4);
        if (Contrast.ratioOfTones(dMax2, d4) >= contrast3 && Contrast.ratioOfTones(dMin2, d4) >= contrast3) {
            return d4;
        }
        double dLighter = Contrast.lighter(dMax2, contrast3);
        double dDarker = Contrast.darker(dMin2, contrast3);
        ArrayList arrayList = new ArrayList();
        if (dLighter != -1.0d) {
            arrayList.add(Double.valueOf(dLighter));
        }
        if (dDarker != -1.0d) {
            arrayList.add(Double.valueOf(dDarker));
        }
        if (tonePrefersLightForeground(tone3) || tonePrefersLightForeground(tone4)) {
            if (dLighter == -1.0d) {
                return 100.0d;
            }
            return dLighter;
        }
        if (arrayList.size() == 1) {
            return ((Double) arrayList.get(0)).doubleValue();
        }
        if (dDarker == -1.0d) {
            return 0.0d;
        }
        return dDarker;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0044 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0045 A[RETURN] */
    public static double foregroundTone(double d, double d2) {
        double dLighterUnsafe = Contrast.lighterUnsafe(d, d2);
        double dDarkerUnsafe = Contrast.darkerUnsafe(d, d2);
        double dRatioOfTones = Contrast.ratioOfTones(dLighterUnsafe, d);
        double dRatioOfTones2 = Contrast.ratioOfTones(dDarkerUnsafe, d);
        if (!tonePrefersLightForeground(d)) {
            if (dRatioOfTones2 >= d2 || dRatioOfTones2 >= dRatioOfTones) {
                return dDarkerUnsafe;
            }
            return dLighterUnsafe;
        }
        boolean z = Math.abs(dRatioOfTones - dRatioOfTones2) < 0.1d && dRatioOfTones < d2 && dRatioOfTones2 < d2;
        if (dRatioOfTones >= d2 || dRatioOfTones >= dRatioOfTones2 || z) {
            return dLighterUnsafe;
        }
        return dDarkerUnsafe;
    }

    public static double enableLightForeground(double d) {
        if (!tonePrefersLightForeground(d) || toneAllowsLightForeground(d)) {
            return d;
        }
        return 49.0d;
    }

    public static boolean tonePrefersLightForeground(double d) {
        return Math.round(d) < 60;
    }

    public static boolean toneAllowsLightForeground(double d) {
        return Math.round(d) <= 49;
    }
}
