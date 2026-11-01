package bin.p000mt.plugin.api.regex;

import bin.p000mt.plugin.api.util.ServiceLoader;
import p067l.InterfaceC14226;

/* JADX INFO: loaded from: classes.dex */
public final class Regex {
    public static Pattern compile(String str) {
        return ((InterfaceC14226) ServiceLoader.get(InterfaceC14226.class)).compileImpl(str);
    }

    public static Pattern compile(String str, int i) {
        return ((InterfaceC14226) ServiceLoader.get(InterfaceC14226.class)).compileImpl(str, i);
    }

    public static void checkReplacementTemplate(Pattern pattern, String str) {
        ((InterfaceC14226) ServiceLoader.get(InterfaceC14226.class)).checkReplacementTemplateImpl(pattern, str);
    }
}
