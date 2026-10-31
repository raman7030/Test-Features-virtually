package l;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ܶ᩵ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: UB7S */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC15438 {
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


    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Map f47268 = new HashMap();

    static {
        for (EnumC15438 enumC15438 : values()) {
            if (enumC15438 != UNSUPPORTED) {
                f47268.put(enumC15438.name().replace('_', '-'), enumC15438);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC15438 m36485(String str) {
        EnumC15438 enumC15438 = (EnumC15438) f47268.get(str);
        return enumC15438 != null ? enumC15438 : UNSUPPORTED;
    }
}
