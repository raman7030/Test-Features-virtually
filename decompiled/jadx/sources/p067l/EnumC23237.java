package p067l;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.᩹֨ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: KB7N */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC23237 {
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


    /* JADX INFO: renamed from: ۗ */
    public static final Map f73033 = new HashMap();

    static {
        for (EnumC23237 enumC23237 : values()) {
            if (enumC23237 == SWITCH) {
                f73033.put("switch", enumC23237);
            } else if (enumC23237 != UNSUPPORTED) {
                f73033.put(enumC23237.name(), enumC23237);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC23237 m51782(String str) {
        EnumC23237 enumC23237 = (EnumC23237) f73033.get(str);
        return enumC23237 != null ? enumC23237 : UNSUPPORTED;
    }
}
