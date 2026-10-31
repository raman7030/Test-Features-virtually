package l;

import java.util.HashMap;
import java.util.Map;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: l.᩸֨ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: KB7N */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC21253 {
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


    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Map f68495 = new HashMap();

    static {
        for (EnumC21253 enumC21253 : values()) {
            if (enumC21253 == CLASS) {
                f68495.put(Name.LABEL, enumC21253);
            } else if (enumC21253 != UNSUPPORTED) {
                f68495.put(enumC21253.name().replace('_', '-'), enumC21253);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC21253 m48257(String str) {
        EnumC21253 enumC21253 = (EnumC21253) f68495.get(str);
        return enumC21253 != null ? enumC21253 : UNSUPPORTED;
    }
}
