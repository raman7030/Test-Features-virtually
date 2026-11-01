package p067l;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ܶ᩵ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: UB7S */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC17041 {
    target,
    root,
    nth_child,
    nth_last_child,
    nth_of_type,
    nth_last_of_type,
    first_child,
    last_child,
    first_of_type,
    last_of_type,
    only_child,
    only_of_type,
    empty,
    not,
    lang,
    link,
    visited,
    hover,
    active,
    focus,
    enabled,
    disabled,
    checked,
    indeterminate,
    UNSUPPORTED;


    /* JADX INFO: renamed from: ۙ */
    public static final Map f50397 = new HashMap();

    static {
        for (EnumC17041 enumC17041 : values()) {
            if (enumC17041 != UNSUPPORTED) {
                f50397.put(enumC17041.name().replace('_', '-'), enumC17041);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC17041 m38643(String str) {
        EnumC17041 enumC17041 = (EnumC17041) f50397.get(str);
        return enumC17041 != null ? enumC17041 : UNSUPPORTED;
    }
}
