package bin.mt.plugin.api.regex;

import bin.mt.plugin.api.util.ServiceLoader;
import l.InterfaceC12476;

/* JADX INFO: loaded from: classes.dex */
public final class Regex {
    public static Pattern compile(String str) {
        return ((InterfaceC12476) ServiceLoader.get(InterfaceC12476.class)).compileImpl(str);
    }

    public static Pattern compile(String str, int i) {
        return ((InterfaceC12476) ServiceLoader.get(InterfaceC12476.class)).compileImpl(str, i);
    }

    public static void checkReplacementTemplate(Pattern pattern, String str) {
        ((InterfaceC12476) ServiceLoader.get(InterfaceC12476.class)).checkReplacementTemplateImpl(pattern, str);
    }
}
