package l;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.᩹֨ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: KB7N */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC21958 {
    svg,
    a,
    circle,
    clipPath,
    defs,
    desc,
    ellipse,
    g,
    image,
    line,
    linearGradient,
    marker,
    mask,
    path,
    pattern,
    polygon,
    polyline,
    radialGradient,
    rect,
    solidColor,
    stop,
    style,
    SWITCH,
    symbol,
    text,
    textPath,
    title,
    tref,
    tspan,
    use,
    view,
    UNSUPPORTED;


    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final Map f70322 = new HashMap();

    static {
        for (EnumC21958 enumC21958 : values()) {
            if (enumC21958 == SWITCH) {
                f70322.put("switch", enumC21958);
            } else if (enumC21958 != UNSUPPORTED) {
                f70322.put(enumC21958.name(), enumC21958);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC21958 m49445(String str) {
        EnumC21958 enumC21958 = (EnumC21958) f70322.get(str);
        return enumC21958 != null ? enumC21958 : UNSUPPORTED;
    }
}
