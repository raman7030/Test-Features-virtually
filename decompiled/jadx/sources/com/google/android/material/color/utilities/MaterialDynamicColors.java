package com.google.android.material.color.utilities;

import com.umeng.analytics.pro.d;
import java.util.function.Function;
import l.C0519;
import l.C10420;
import l.C10985;
import l.C11213;
import l.C11539;
import l.C11653;
import l.C12247;
import l.C13216;
import l.C14205;
import l.C14436;
import l.C15420;
import l.C16599;
import l.C17576;
import l.C1775;
import l.C18554;
import l.C18865;
import l.C19415;
import l.C19694;
import l.C1981;
import l.C20528;
import l.C20696;
import l.C21670;
import l.C21673;
import l.C2225;
import l.C22536;
import l.C22827;
import l.C2286;
import l.C23147;
import l.C23519;
import l.C23853;
import l.C3053;
import l.C3433;
import l.C4331;
import l.C4563;
import l.C5748;
import l.C5812;
import l.C5851;
import l.C5894;
import l.C5901;
import l.C6161;
import l.C6416;
import l.C6639;
import l.C6779;
import l.C7033;
import l.C7680;
import l.C7915;
import l.C8011;
import l.C8069;
import l.C8155;
import l.C8264;
import l.C8554;
import l.C8888;
import l.C8916;
import l.C9022;

/* JADX INFO: loaded from: classes.dex */
public final class MaterialDynamicColors {
    public DynamicColor highestSurface(DynamicScheme dynamicScheme) {
        return dynamicScheme.isDark ? surfaceBright() : surfaceDim();
    }

    public DynamicColor primaryPaletteKeyColor() {
        return DynamicColor.fromPalette("primary_palette_key_color", new C23147(4), new C18865(2));
    }

    public static /* synthetic */ Double lambda$primaryPaletteKeyColor$1(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.primaryPalette.getKeyColor().getTone());
    }

    public DynamicColor secondaryPaletteKeyColor() {
        return DynamicColor.fromPalette("secondary_palette_key_color", new C8264(2), new C14205(4));
    }

    public static /* synthetic */ Double lambda$secondaryPaletteKeyColor$3(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.secondaryPalette.getKeyColor().getTone());
    }

    public DynamicColor tertiaryPaletteKeyColor() {
        return DynamicColor.fromPalette("tertiary_palette_key_color", new C7033(2), new C12247(4));
    }

    public static /* synthetic */ Double lambda$tertiaryPaletteKeyColor$5(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.tertiaryPalette.getKeyColor().getTone());
    }

    public DynamicColor neutralPaletteKeyColor() {
        return DynamicColor.fromPalette("neutral_palette_key_color", new C14436(2), new C7915(4));
    }

    public static /* synthetic */ Double lambda$neutralPaletteKeyColor$7(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.neutralPalette.getKeyColor().getTone());
    }

    public DynamicColor neutralVariantPaletteKeyColor() {
        return DynamicColor.fromPalette("neutral_variant_palette_key_color", new C3053(4), new C1981(6));
    }

    public static /* synthetic */ Double lambda$neutralVariantPaletteKeyColor$9(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.neutralVariantPalette.getKeyColor().getTone());
    }

    public DynamicColor background() {
        return new DynamicColor("background", new C1775(4), new C8011(5), true, null, null, null, null);
    }

    public static /* synthetic */ Double lambda$background$11(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 6.0d : 98.0d);
    }

    public DynamicColor onBackground() {
        return new DynamicColor("on_background", new C5894(3), new C14436(4), false, new C5812(2, this), null, new ContrastCurve(3.0d, 3.0d, 4.5d, 7.0d), null);
    }

    public static /* synthetic */ Double lambda$onBackground$13(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 90.0d : 10.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onBackground$14(DynamicScheme dynamicScheme) {
        return background();
    }

    public DynamicColor surface() {
        return new DynamicColor("surface", new C19694(4), new C11653(2), true, null, null, null, null);
    }

    public static /* synthetic */ Double lambda$surface$16(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 6.0d : 98.0d);
    }

    public DynamicColor surfaceDim() {
        return new DynamicColor("surface_dim", new C14205(3), new C7033(1), true, null, null, null, null);
    }

    public static /* synthetic */ Double lambda$surfaceDim$18(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 6.0d : 87.0d);
    }

    public DynamicColor surfaceBright() {
        return new DynamicColor("surface_bright", new C10420(5), new C13216(3), true, null, null, null, null);
    }

    public static /* synthetic */ Double lambda$surfaceBright$20(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 24.0d : 98.0d);
    }

    public DynamicColor surfaceContainerLowest() {
        return new DynamicColor("surface_container_lowest", new C8011(3), new C4563(5), true, null, null, null, null);
    }

    public static /* synthetic */ Double lambda$surfaceContainerLowest$22(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 4.0d : 100.0d);
    }

    public DynamicColor surfaceContainerLow() {
        return new DynamicColor("surface_container_low", new C21670(2), new C22536(4), true, null, null, null, null);
    }

    public static /* synthetic */ Double lambda$surfaceContainerLow$24(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 10.0d : 96.0d);
    }

    public DynamicColor surfaceContainer() {
        return new DynamicColor("surface_container", new C21673(2), new C6639(3), true, null, null, null, null);
    }

    public static /* synthetic */ Double lambda$surfaceContainer$26(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 12.0d : 94.0d);
    }

    public DynamicColor surfaceContainerHigh() {
        return new DynamicColor("surface_container_high", new C4563(7), new C7680(5), true, null, null, null, null);
    }

    public static /* synthetic */ Double lambda$surfaceContainerHigh$28(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 17.0d : 92.0d);
    }

    public DynamicColor surfaceContainerHighest() {
        return new DynamicColor("surface_container_highest", new C7680(6), new C14436(5), true, null, null, null, null);
    }

    public static /* synthetic */ Double lambda$surfaceContainerHighest$30(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 22.0d : 90.0d);
    }

    public DynamicColor onSurface() {
        return new DynamicColor("on_surface", new C8916(3), new C5894(4), false, new MaterialDynamicColors$$ExternalSyntheticLambda9(this), null, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    public static /* synthetic */ Double lambda$onSurface$32(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 90.0d : 10.0d);
    }

    public DynamicColor surfaceVariant() {
        return new DynamicColor("surface_variant", new C8069(5), new C2286(6), true, null, null, null, null);
    }

    public static /* synthetic */ Double lambda$surfaceVariant$34(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 30.0d : 90.0d);
    }

    public DynamicColor onSurfaceVariant() {
        return new DynamicColor("on_surface_variant", new C6779(1), new C10985(4), false, new MaterialDynamicColors$$ExternalSyntheticLambda9(this), null, new ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), null);
    }

    public static /* synthetic */ Double lambda$onSurfaceVariant$36(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 80.0d : 30.0d);
    }

    public DynamicColor inverseSurface() {
        return new DynamicColor("inverse_surface", new C8155(1), new C18554(5), false, null, null, null, null);
    }

    public static /* synthetic */ Double lambda$inverseSurface$38(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 90.0d : 20.0d);
    }

    public DynamicColor inverseOnSurface() {
        return new DynamicColor("inverse_on_surface", new C19415(2), new C5851(5), false, new MaterialDynamicColors$$ExternalSyntheticLambda56(this, 1), null, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    public static /* synthetic */ Double lambda$inverseOnSurface$40(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 20.0d : 95.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$inverseOnSurface$41(DynamicScheme dynamicScheme) {
        return inverseSurface();
    }

    public DynamicColor outline() {
        return new DynamicColor("outline", new C7680(4), new C5894(1), false, new MaterialDynamicColors$$ExternalSyntheticLambda9(this), null, new ContrastCurve(1.5d, 3.0d, 4.5d, 7.0d), null);
    }

    public static /* synthetic */ Double lambda$outline$43(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 60.0d : 50.0d);
    }

    public DynamicColor outlineVariant() {
        return new DynamicColor("outline_variant", new C20528(6), new C22827(3), false, new MaterialDynamicColors$$ExternalSyntheticLambda9(this), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 7.0d), null);
    }

    public static /* synthetic */ Double lambda$outlineVariant$45(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 30.0d : 80.0d);
    }

    public DynamicColor shadow() {
        return new DynamicColor("shadow", new C8011(6), new C4563(8), false, null, null, null, null);
    }

    public static /* synthetic */ Double lambda$shadow$47(DynamicScheme dynamicScheme) {
        return Double.valueOf(0.0d);
    }

    public DynamicColor scrim() {
        return new DynamicColor("scrim", new C6416(4), new C20528(5), false, null, null, null, null);
    }

    public static /* synthetic */ Double lambda$scrim$49(DynamicScheme dynamicScheme) {
        return Double.valueOf(0.0d);
    }

    public DynamicColor surfaceTint() {
        return new DynamicColor("surface_tint", new C11539(5), new C6416(3), true, null, null, null, null);
    }

    public static /* synthetic */ Double lambda$surfaceTint$51(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 80.0d : 40.0d);
    }

    public DynamicColor primary() {
        return new DynamicColor("primary", new C5894(2), new C14436(3), true, new MaterialDynamicColors$$ExternalSyntheticLambda9(this), null, new ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), new C5812(1, this));
    }

    public static /* synthetic */ Double lambda$primary$53(DynamicScheme dynamicScheme) {
        if (isMonochrome(dynamicScheme)) {
            return Double.valueOf(dynamicScheme.isDark ? 100.0d : 0.0d);
        }
        return Double.valueOf(dynamicScheme.isDark ? 80.0d : 40.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ToneDeltaPair lambda$primary$54(DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(primaryContainer(), primary(), 15.0d, TonePolarity.NEARER, false);
    }

    public DynamicColor onPrimary() {
        return new DynamicColor("on_primary", new C19415(3), new C5851(7), false, new MaterialDynamicColors$$ExternalSyntheticLambda56(this, 0), null, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    public static /* synthetic */ Double lambda$onPrimary$56(DynamicScheme dynamicScheme) {
        if (isMonochrome(dynamicScheme)) {
            return Double.valueOf(dynamicScheme.isDark ? 10.0d : 90.0d);
        }
        return Double.valueOf(dynamicScheme.isDark ? 20.0d : 100.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onPrimary$57(DynamicScheme dynamicScheme) {
        return primary();
    }

    public DynamicColor primaryContainer() {
        return new DynamicColor("primary_container", new C3053(3), new C1981(5), true, new MaterialDynamicColors$$ExternalSyntheticLambda9(this), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 7.0d), new MaterialDynamicColors$$ExternalSyntheticLambda42(this, 0));
    }

    public static /* synthetic */ Double lambda$primaryContainer$59(DynamicScheme dynamicScheme) {
        if (isFidelity(dynamicScheme)) {
            return Double.valueOf(performAlbers(dynamicScheme.sourceColorHct, dynamicScheme));
        }
        if (isMonochrome(dynamicScheme)) {
            return Double.valueOf(dynamicScheme.isDark ? 85.0d : 25.0d);
        }
        return Double.valueOf(dynamicScheme.isDark ? 30.0d : 90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ToneDeltaPair lambda$primaryContainer$60(DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(primaryContainer(), primary(), 15.0d, TonePolarity.NEARER, false);
    }

    public DynamicColor onPrimaryContainer() {
        return new DynamicColor("on_primary_container", new C10985(6), new C9022(2, this), false, new MaterialDynamicColors$$ExternalSyntheticLambda34(this, 1), null, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Double lambda$onPrimaryContainer$62(DynamicScheme dynamicScheme) {
        if (isFidelity(dynamicScheme)) {
            return Double.valueOf(DynamicColor.foregroundTone(((Double) primaryContainer().tone.apply(dynamicScheme)).doubleValue(), 4.5d));
        }
        if (isMonochrome(dynamicScheme)) {
            return Double.valueOf(dynamicScheme.isDark ? 0.0d : 100.0d);
        }
        return Double.valueOf(dynamicScheme.isDark ? 90.0d : 10.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onPrimaryContainer$63(DynamicScheme dynamicScheme) {
        return primaryContainer();
    }

    public DynamicColor inversePrimary() {
        int i = 5;
        return new DynamicColor("inverse_primary", new C15420(i), new C7915(i), false, new MaterialDynamicColors$$ExternalSyntheticLambda59(this, 0), null, new ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), null);
    }

    public static /* synthetic */ Double lambda$inversePrimary$65(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 40.0d : 80.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$inversePrimary$66(DynamicScheme dynamicScheme) {
        return inverseSurface();
    }

    public DynamicColor secondary() {
        int i = 1;
        return new DynamicColor("secondary", new C1981(3), new C8554(i), true, new MaterialDynamicColors$$ExternalSyntheticLambda9(this), null, new ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), new C23853(i, this));
    }

    public static /* synthetic */ Double lambda$secondary$68(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 80.0d : 40.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ToneDeltaPair lambda$secondary$69(DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(secondaryContainer(), secondary(), 15.0d, TonePolarity.NEARER, false);
    }

    public DynamicColor onSecondary() {
        return new DynamicColor("on_secondary", new C8069(2), new C2286(3), false, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda102
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo22274andThen(Function function) {
                return C20696.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f$0.lambda$onSecondary$72((DynamicScheme) obj);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C20696.$default$compose(this, function);
            }
        }, null, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    public static /* synthetic */ Double lambda$onSecondary$71(DynamicScheme dynamicScheme) {
        if (isMonochrome(dynamicScheme)) {
            return Double.valueOf(dynamicScheme.isDark ? 10.0d : 100.0d);
        }
        return Double.valueOf(dynamicScheme.isDark ? 20.0d : 100.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onSecondary$72(DynamicScheme dynamicScheme) {
        return secondary();
    }

    public DynamicColor secondaryContainer() {
        return new DynamicColor("secondary_container", new C17576(5), new C16599(4), true, new MaterialDynamicColors$$ExternalSyntheticLambda9(this), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 7.0d), new C2225(1, this));
    }

    public static /* synthetic */ Double lambda$secondaryContainer$74(DynamicScheme dynamicScheme) {
        double d = dynamicScheme.isDark ? 30.0d : 90.0d;
        if (isMonochrome(dynamicScheme)) {
            return Double.valueOf(dynamicScheme.isDark ? 30.0d : 85.0d);
        }
        if (!isFidelity(dynamicScheme)) {
            return Double.valueOf(d);
        }
        return Double.valueOf(performAlbers(dynamicScheme.secondaryPalette.getHct(findDesiredChromaByTone(dynamicScheme.secondaryPalette.getHue(), dynamicScheme.secondaryPalette.getChroma(), d, !dynamicScheme.isDark)), dynamicScheme));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ToneDeltaPair lambda$secondaryContainer$75(DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(secondaryContainer(), secondary(), 15.0d, TonePolarity.NEARER, false);
    }

    public DynamicColor onSecondaryContainer() {
        return new DynamicColor("on_secondary_container", new C23147(3), new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda123
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo22274andThen(Function function) {
                return C20696.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f$0.lambda$onSecondaryContainer$77((DynamicScheme) obj);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C20696.$default$compose(this, function);
            }
        }, false, new MaterialDynamicColors$$ExternalSyntheticLambda62(this, 1), null, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Double lambda$onSecondaryContainer$77(DynamicScheme dynamicScheme) {
        if (isFidelity(dynamicScheme)) {
            return Double.valueOf(DynamicColor.foregroundTone(((Double) secondaryContainer().tone.apply(dynamicScheme)).doubleValue(), 4.5d));
        }
        return Double.valueOf(dynamicScheme.isDark ? 90.0d : 10.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onSecondaryContainer$78(DynamicScheme dynamicScheme) {
        return secondaryContainer();
    }

    public DynamicColor tertiary() {
        return new DynamicColor("tertiary", new C11213(3), new C15420(4), true, new MaterialDynamicColors$$ExternalSyntheticLambda9(this), null, new ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), new C4331(1, this));
    }

    public static /* synthetic */ Double lambda$tertiary$80(DynamicScheme dynamicScheme) {
        if (isMonochrome(dynamicScheme)) {
            return Double.valueOf(dynamicScheme.isDark ? 90.0d : 25.0d);
        }
        return Double.valueOf(dynamicScheme.isDark ? 80.0d : 40.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ToneDeltaPair lambda$tertiary$81(DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(tertiaryContainer(), tertiary(), 15.0d, TonePolarity.NEARER, false);
    }

    public DynamicColor onTertiary() {
        return new DynamicColor("on_tertiary", new C6416(5), new C23519(7), false, new MaterialDynamicColors$$ExternalSyntheticLambda6(this, 0), null, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    public static /* synthetic */ Double lambda$onTertiary$83(DynamicScheme dynamicScheme) {
        if (isMonochrome(dynamicScheme)) {
            return Double.valueOf(dynamicScheme.isDark ? 10.0d : 90.0d);
        }
        return Double.valueOf(dynamicScheme.isDark ? 20.0d : 100.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onTertiary$84(DynamicScheme dynamicScheme) {
        return tertiary();
    }

    public DynamicColor tertiaryContainer() {
        return new DynamicColor("tertiary_container", new C19415(4), new C5851(8), true, new MaterialDynamicColors$$ExternalSyntheticLambda9(this), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 7.0d), new MaterialDynamicColors$$ExternalSyntheticLambda56(this, 2));
    }

    public static /* synthetic */ Double lambda$tertiaryContainer$86(DynamicScheme dynamicScheme) {
        if (isMonochrome(dynamicScheme)) {
            return Double.valueOf(dynamicScheme.isDark ? 60.0d : 49.0d);
        }
        if (isFidelity(dynamicScheme)) {
            return Double.valueOf(DislikeAnalyzer.fixIfDisliked(dynamicScheme.tertiaryPalette.getHct(performAlbers(dynamicScheme.tertiaryPalette.getHct(dynamicScheme.sourceColorHct.getTone()), dynamicScheme))).getTone());
        }
        return Double.valueOf(dynamicScheme.isDark ? 30.0d : 90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ToneDeltaPair lambda$tertiaryContainer$87(DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(tertiaryContainer(), tertiary(), 15.0d, TonePolarity.NEARER, false);
    }

    public DynamicColor onTertiaryContainer() {
        return new DynamicColor("on_tertiary_container", new C15420(3), new MaterialDynamicColors$$ExternalSyntheticLambda59(this, 1), false, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda121
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo22274andThen(Function function) {
                return C20696.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f$0.lambda$onTertiaryContainer$90((DynamicScheme) obj);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C20696.$default$compose(this, function);
            }
        }, null, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Double lambda$onTertiaryContainer$89(DynamicScheme dynamicScheme) {
        if (isMonochrome(dynamicScheme)) {
            return Double.valueOf(dynamicScheme.isDark ? 0.0d : 100.0d);
        }
        if (isFidelity(dynamicScheme)) {
            return Double.valueOf(DynamicColor.foregroundTone(((Double) tertiaryContainer().tone.apply(dynamicScheme)).doubleValue(), 4.5d));
        }
        return Double.valueOf(dynamicScheme.isDark ? 90.0d : 10.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onTertiaryContainer$90(DynamicScheme dynamicScheme) {
        return tertiaryContainer();
    }

    public DynamicColor error() {
        int i = 1;
        return new DynamicColor(d.O, new C8264(i), new C21670(i), true, new MaterialDynamicColors$$ExternalSyntheticLambda9(this), null, new ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), new MaterialDynamicColors$$ExternalSyntheticLambda6(this, i));
    }

    public static /* synthetic */ Double lambda$error$92(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 80.0d : 40.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ToneDeltaPair lambda$error$93(DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(errorContainer(), error(), 15.0d, TonePolarity.NEARER, false);
    }

    public DynamicColor onError() {
        return new DynamicColor("on_error", new C17576(6), new C16599(5), false, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda72
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo22274andThen(Function function) {
                return C20696.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f$0.lambda$onError$96((DynamicScheme) obj);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C20696.$default$compose(this, function);
            }
        }, null, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    public static /* synthetic */ Double lambda$onError$95(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 20.0d : 100.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onError$96(DynamicScheme dynamicScheme) {
        return error();
    }

    public DynamicColor errorContainer() {
        return new DynamicColor("error_container", new C3053(2), new C1981(4), true, new MaterialDynamicColors$$ExternalSyntheticLambda9(this), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 7.0d), new MaterialDynamicColors$$ExternalSyntheticLambda42(this, 1));
    }

    public static /* synthetic */ Double lambda$errorContainer$98(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 30.0d : 90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ToneDeltaPair lambda$errorContainer$99(DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(errorContainer(), error(), 15.0d, TonePolarity.NEARER, false);
    }

    public DynamicColor onErrorContainer() {
        int i = 1;
        return new DynamicColor("on_error_container", new C12247(3), new C8916(i), false, new MaterialDynamicColors$$ExternalSyntheticLambda80(this, i), null, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    public static /* synthetic */ Double lambda$onErrorContainer$101(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 90.0d : 10.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onErrorContainer$102(DynamicScheme dynamicScheme) {
        return errorContainer();
    }

    public DynamicColor primaryFixed() {
        int i = 6;
        return new DynamicColor("primary_fixed", new C11539(i), new C6416(i), true, new MaterialDynamicColors$$ExternalSyntheticLambda9(this), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 7.0d), new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda93
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo22274andThen(Function function) {
                return C20696.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f$0.lambda$primaryFixed$105((DynamicScheme) obj);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C20696.$default$compose(this, function);
            }
        });
    }

    public static /* synthetic */ Double lambda$primaryFixed$104(DynamicScheme dynamicScheme) {
        return Double.valueOf(isMonochrome(dynamicScheme) ? 40.0d : 90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ToneDeltaPair lambda$primaryFixed$105(DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(primaryFixed(), primaryFixedDim(), 10.0d, TonePolarity.LIGHTER, true);
    }

    public DynamicColor primaryFixedDim() {
        return new DynamicColor("primary_fixed_dim", new C22827(4), new C10420(6), true, new MaterialDynamicColors$$ExternalSyntheticLambda9(this), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 7.0d), new MaterialDynamicColors$$ExternalSyntheticLambda96(this, 0));
    }

    public static /* synthetic */ Double lambda$primaryFixedDim$107(DynamicScheme dynamicScheme) {
        return Double.valueOf(isMonochrome(dynamicScheme) ? 30.0d : 80.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ToneDeltaPair lambda$primaryFixedDim$108(DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(primaryFixed(), primaryFixedDim(), 10.0d, TonePolarity.LIGHTER, true);
    }

    public DynamicColor onPrimaryFixed() {
        int i = 1;
        return new DynamicColor("on_primary_fixed", new C0519(1), new C3433(2), false, new MaterialDynamicColors$$ExternalSyntheticLambda22(this, i), new MaterialDynamicColors$$ExternalSyntheticLambda23(this, i), new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    public static /* synthetic */ Double lambda$onPrimaryFixed$110(DynamicScheme dynamicScheme) {
        return Double.valueOf(isMonochrome(dynamicScheme) ? 100.0d : 10.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onPrimaryFixed$111(DynamicScheme dynamicScheme) {
        return primaryFixedDim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onPrimaryFixed$112(DynamicScheme dynamicScheme) {
        return primaryFixed();
    }

    public DynamicColor onPrimaryFixedVariant() {
        int i = 2;
        return new DynamicColor("on_primary_fixed_variant", new C0519(3), new C3433(4), false, new MaterialDynamicColors$$ExternalSyntheticLambda22(this, i), new MaterialDynamicColors$$ExternalSyntheticLambda23(this, i), new ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), null);
    }

    public static /* synthetic */ Double lambda$onPrimaryFixedVariant$114(DynamicScheme dynamicScheme) {
        return Double.valueOf(isMonochrome(dynamicScheme) ? 90.0d : 30.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onPrimaryFixedVariant$115(DynamicScheme dynamicScheme) {
        return primaryFixedDim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onPrimaryFixedVariant$116(DynamicScheme dynamicScheme) {
        return primaryFixed();
    }

    public DynamicColor secondaryFixed() {
        return new DynamicColor("secondary_fixed", new C23147(5), new C18865(3), true, new MaterialDynamicColors$$ExternalSyntheticLambda9(this), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 7.0d), new MaterialDynamicColors$$ExternalSyntheticLambda62(this, 0));
    }

    public static /* synthetic */ Double lambda$secondaryFixed$118(DynamicScheme dynamicScheme) {
        return Double.valueOf(isMonochrome(dynamicScheme) ? 80.0d : 90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ToneDeltaPair lambda$secondaryFixed$119(DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(secondaryFixed(), secondaryFixedDim(), 10.0d, TonePolarity.LIGHTER, true);
    }

    public DynamicColor secondaryFixedDim() {
        return new DynamicColor("secondary_fixed_dim", new C7033(3), new C12247(5), true, new MaterialDynamicColors$$ExternalSyntheticLambda9(this), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 7.0d), new MaterialDynamicColors$$ExternalSyntheticLambda80(this, 0));
    }

    public static /* synthetic */ Double lambda$secondaryFixedDim$121(DynamicScheme dynamicScheme) {
        return Double.valueOf(isMonochrome(dynamicScheme) ? 70.0d : 80.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ToneDeltaPair lambda$secondaryFixedDim$122(DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(secondaryFixed(), secondaryFixedDim(), 10.0d, TonePolarity.LIGHTER, true);
    }

    public DynamicColor onSecondaryFixed() {
        return new DynamicColor("on_secondary_fixed", new C20528(4), new C22827(1), false, new C5901(3, this), new MaterialDynamicColors$$ExternalSyntheticLambda96(this, 1), new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    public static /* synthetic */ Double lambda$onSecondaryFixed$124(DynamicScheme dynamicScheme) {
        return Double.valueOf(10.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onSecondaryFixed$125(DynamicScheme dynamicScheme) {
        return secondaryFixedDim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onSecondaryFixed$126(DynamicScheme dynamicScheme) {
        return secondaryFixed();
    }

    public DynamicColor onSecondaryFixedVariant() {
        int i = 2;
        return new DynamicColor("on_secondary_fixed_variant", new C22827(2), new C10420(4), false, new MaterialDynamicColors$$ExternalSyntheticLambda96(this, i), new C8888(i, this), new ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), null);
    }

    public static /* synthetic */ Double lambda$onSecondaryFixedVariant$128(DynamicScheme dynamicScheme) {
        return Double.valueOf(isMonochrome(dynamicScheme) ? 25.0d : 30.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onSecondaryFixedVariant$129(DynamicScheme dynamicScheme) {
        return secondaryFixedDim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onSecondaryFixedVariant$130(DynamicScheme dynamicScheme) {
        return secondaryFixed();
    }

    public DynamicColor tertiaryFixed() {
        return new DynamicColor("tertiary_fixed", new C1775(3), new C8011(4), true, new MaterialDynamicColors$$ExternalSyntheticLambda9(this), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 7.0d), new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda150
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo22274andThen(Function function) {
                return C20696.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f$0.lambda$tertiaryFixed$133((DynamicScheme) obj);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C20696.$default$compose(this, function);
            }
        });
    }

    public static /* synthetic */ Double lambda$tertiaryFixed$132(DynamicScheme dynamicScheme) {
        return Double.valueOf(isMonochrome(dynamicScheme) ? 40.0d : 90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ToneDeltaPair lambda$tertiaryFixed$133(DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(tertiaryFixed(), tertiaryFixedDim(), 10.0d, TonePolarity.LIGHTER, true);
    }

    public DynamicColor tertiaryFixedDim() {
        return new DynamicColor("tertiary_fixed_dim", new C8264(3), new C14205(5), true, new MaterialDynamicColors$$ExternalSyntheticLambda9(this), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 7.0d), new C5748(1, this));
    }

    public static /* synthetic */ Double lambda$tertiaryFixedDim$135(DynamicScheme dynamicScheme) {
        return Double.valueOf(isMonochrome(dynamicScheme) ? 30.0d : 80.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ToneDeltaPair lambda$tertiaryFixedDim$136(DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(tertiaryFixed(), tertiaryFixedDim(), 10.0d, TonePolarity.LIGHTER, true);
    }

    public DynamicColor onTertiaryFixed() {
        return new DynamicColor("on_tertiary_fixed", new C6779(2), new C10985(5), false, new C9022(1, this), new MaterialDynamicColors$$ExternalSyntheticLambda34(this, 0), new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    public static /* synthetic */ Double lambda$onTertiaryFixed$138(DynamicScheme dynamicScheme) {
        return Double.valueOf(isMonochrome(dynamicScheme) ? 100.0d : 10.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onTertiaryFixed$139(DynamicScheme dynamicScheme) {
        return tertiaryFixedDim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onTertiaryFixed$140(DynamicScheme dynamicScheme) {
        return tertiaryFixed();
    }

    public DynamicColor onTertiaryFixedVariant() {
        int i = 0;
        return new DynamicColor("on_tertiary_fixed_variant", new C0519(2), new C3433(3), false, new MaterialDynamicColors$$ExternalSyntheticLambda22(this, i), new MaterialDynamicColors$$ExternalSyntheticLambda23(this, i), new ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), null);
    }

    public static /* synthetic */ Double lambda$onTertiaryFixedVariant$142(DynamicScheme dynamicScheme) {
        return Double.valueOf(isMonochrome(dynamicScheme) ? 90.0d : 30.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onTertiaryFixedVariant$143(DynamicScheme dynamicScheme) {
        return tertiaryFixedDim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onTertiaryFixedVariant$144(DynamicScheme dynamicScheme) {
        return tertiaryFixed();
    }

    public DynamicColor controlActivated() {
        return DynamicColor.fromPalette("control_activated", new C6161(1), new C23519(6));
    }

    public static /* synthetic */ Double lambda$controlActivated$146(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 30.0d : 90.0d);
    }

    public DynamicColor controlNormal() {
        return DynamicColor.fromPalette("control_normal", new C4563(6), new C5851(6));
    }

    public static /* synthetic */ Double lambda$controlNormal$148(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 80.0d : 30.0d);
    }

    public DynamicColor controlHighlight() {
        return new DynamicColor("control_highlight", new C8916(2), new C19694(5), false, null, null, null, null, new C8069(4));
    }

    public static /* synthetic */ Double lambda$controlHighlight$150(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 100.0d : 0.0d);
    }

    public static /* synthetic */ Double lambda$controlHighlight$151(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 0.2d : 0.12d);
    }

    public DynamicColor textPrimaryInverse() {
        return DynamicColor.fromPalette("text_primary_inverse", new C17576(4), new C16599(3));
    }

    public static /* synthetic */ Double lambda$textPrimaryInverse$153(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 10.0d : 90.0d);
    }

    public DynamicColor textSecondaryAndTertiaryInverse() {
        return DynamicColor.fromPalette("text_secondary_and_tertiary_inverse", new C8069(3), new C2286(4));
    }

    public static /* synthetic */ Double lambda$textSecondaryAndTertiaryInverse$155(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 30.0d : 80.0d);
    }

    public DynamicColor textPrimaryInverseDisableOnly() {
        return DynamicColor.fromPalette("text_primary_inverse_disable_only", new C6639(4), new C6779(3));
    }

    public static /* synthetic */ Double lambda$textPrimaryInverseDisableOnly$157(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 10.0d : 90.0d);
    }

    public DynamicColor textSecondaryAndTertiaryInverseDisabled() {
        return DynamicColor.fromPalette("text_secondary_and_tertiary_inverse_disabled", new C21673(3), new C2286(5));
    }

    public static /* synthetic */ Double lambda$textSecondaryAndTertiaryInverseDisabled$159(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 10.0d : 90.0d);
    }

    public DynamicColor textHintInverse() {
        return DynamicColor.fromPalette("text_hint_inverse", new C8554(2), new C1775(5));
    }

    public static /* synthetic */ Double lambda$textHintInverse$161(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 10.0d : 90.0d);
    }

    public static ViewingConditions viewingConditionsForAlbers(DynamicScheme dynamicScheme) {
        return ViewingConditions.defaultWithBackgroundLstar(dynamicScheme.isDark ? 30.0d : 80.0d);
    }

    public static boolean isFidelity(DynamicScheme dynamicScheme) {
        Variant variant = dynamicScheme.variant;
        return variant == Variant.FIDELITY || variant == Variant.CONTENT;
    }

    public static boolean isMonochrome(DynamicScheme dynamicScheme) {
        return dynamicScheme.variant == Variant.MONOCHROME;
    }

    public static double findDesiredChromaByTone(double d, double d2, double d3, boolean z) {
        Hct hctFrom = Hct.from(d, d2, d3);
        if (hctFrom.getChroma() >= d2) {
            return d3;
        }
        Hct hct = hctFrom;
        double chroma = hctFrom.getChroma();
        double d4 = d3;
        while (hct.getChroma() < d2) {
            double d5 = d4 + (z ? -1.0d : 1.0d);
            Hct hctFrom2 = Hct.from(d, d2, d5);
            if (chroma > hctFrom2.getChroma() || Math.abs(hctFrom2.getChroma() - d2) < 0.4d) {
                return d5;
            }
            if (Math.abs(hctFrom2.getChroma() - d2) < Math.abs(hct.getChroma() - d2)) {
                hct = hctFrom2;
            }
            chroma = Math.max(chroma, hctFrom2.getChroma());
            d4 = d5;
        }
        return d4;
    }

    public static double performAlbers(Hct hct, DynamicScheme dynamicScheme) {
        Hct hctInViewingConditions = hct.inViewingConditions(viewingConditionsForAlbers(dynamicScheme));
        if (DynamicColor.tonePrefersLightForeground(hct.getTone()) && !DynamicColor.toneAllowsLightForeground(hctInViewingConditions.getTone())) {
            return DynamicColor.enableLightForeground(hct.getTone());
        }
        return DynamicColor.enableLightForeground(hctInViewingConditions.getTone());
    }
}
