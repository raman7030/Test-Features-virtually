package p067l;

import java.util.HashMap;
import java.util.Map;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: l.᩸֨ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: KB7N */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC22567 {
    CLASS,
    clip,
    clip_path,
    clipPathUnits,
    clip_rule,
    color,
    cx,
    cy,
    direction,
    dx,
    dy,
    fx,
    fy,
    d,
    display,
    fill,
    fill_rule,
    fill_opacity,
    font,
    font_family,
    font_size,
    font_weight,
    font_style,
    gradientTransform,
    gradientUnits,
    height,
    href,
    image_rendering,
    marker,
    marker_start,
    marker_mid,
    marker_end,
    markerHeight,
    markerUnits,
    markerWidth,
    mask,
    maskContentUnits,
    maskUnits,
    media,
    offset,
    opacity,
    orient,
    overflow,
    pathLength,
    patternContentUnits,
    patternTransform,
    patternUnits,
    points,
    preserveAspectRatio,
    r,
    refX,
    refY,
    requiredFeatures,
    requiredExtensions,
    requiredFormats,
    requiredFonts,
    rx,
    ry,
    solid_color,
    solid_opacity,
    spreadMethod,
    startOffset,
    stop_color,
    stop_opacity,
    stroke,
    stroke_dasharray,
    stroke_dashoffset,
    stroke_linecap,
    stroke_linejoin,
    stroke_miterlimit,
    stroke_opacity,
    stroke_width,
    style,
    systemLanguage,
    text_anchor,
    text_decoration,
    transform,
    type,
    vector_effect,
    version,
    viewBox,
    width,
    x,
    y,
    x1,
    y1,
    x2,
    y2,
    viewport_fill,
    viewport_fill_opacity,
    visibility,
    UNSUPPORTED;


    /* JADX INFO: renamed from: ۙ */
    public static final Map f71177 = new HashMap();

    static {
        for (EnumC22567 enumC22567 : values()) {
            if (enumC22567 == CLASS) {
                f71177.put(Name.LABEL, enumC22567);
            } else if (enumC22567 != UNSUPPORTED) {
                f71177.put(enumC22567.name().replace('_', '-'), enumC22567);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC22567 m50588(String str) {
        EnumC22567 enumC22567 = (EnumC22567) f71177.get(str);
        return enumC22567 != null ? enumC22567 : UNSUPPORTED;
    }
}
