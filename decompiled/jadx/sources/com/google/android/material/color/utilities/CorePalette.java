package com.google.android.material.color.utilities;

/* JADX INFO: loaded from: classes.dex */
public final class CorePalette {

    /* JADX INFO: renamed from: a1 */
    public TonalPalette f2033a1;

    /* JADX INFO: renamed from: a2 */
    public TonalPalette f2034a2;

    /* JADX INFO: renamed from: a3 */
    public TonalPalette f2035a3;
    public TonalPalette error;

    /* JADX INFO: renamed from: n1 */
    public TonalPalette f2036n1;

    /* JADX INFO: renamed from: n2 */
    public TonalPalette f2037n2;

    /* JADX INFO: renamed from: of */
    public static CorePalette m1977of(int i) {
        return new CorePalette(i, false);
    }

    public static CorePalette contentOf(int i) {
        return new CorePalette(i, true);
    }

    public CorePalette(int i, boolean z) {
        Hct hctFromInt = Hct.fromInt(i);
        double hue = hctFromInt.getHue();
        double chroma = hctFromInt.getChroma();
        if (z) {
            this.f2033a1 = TonalPalette.fromHueAndChroma(hue, chroma);
            this.f2034a2 = TonalPalette.fromHueAndChroma(hue, chroma / 3.0d);
            this.f2035a3 = TonalPalette.fromHueAndChroma(60.0d + hue, chroma / 2.0d);
            this.f2036n1 = TonalPalette.fromHueAndChroma(hue, Math.min(chroma / 12.0d, 4.0d));
            this.f2037n2 = TonalPalette.fromHueAndChroma(hue, Math.min(chroma / 6.0d, 8.0d));
        } else {
            this.f2033a1 = TonalPalette.fromHueAndChroma(hue, Math.max(48.0d, chroma));
            this.f2034a2 = TonalPalette.fromHueAndChroma(hue, 16.0d);
            this.f2035a3 = TonalPalette.fromHueAndChroma(60.0d + hue, 24.0d);
            this.f2036n1 = TonalPalette.fromHueAndChroma(hue, 4.0d);
            this.f2037n2 = TonalPalette.fromHueAndChroma(hue, 8.0d);
        }
        this.error = TonalPalette.fromHueAndChroma(25.0d, 84.0d);
    }
}
