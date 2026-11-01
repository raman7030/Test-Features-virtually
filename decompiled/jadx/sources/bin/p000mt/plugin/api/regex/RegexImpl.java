package bin.p000mt.plugin.api.regex;

import bin.p000mt.plugin.api.util.ServiceLoader;
import p067l.C13259;
import p067l.C15269;
import p067l.InterfaceC14226;

/* JADX INFO: loaded from: classes.dex */
public class RegexImpl implements InterfaceC14226 {
    public static void register() {
        ServiceLoader.register(InterfaceC14226.class, new RegexImpl());
    }

    @Override // p067l.InterfaceC14226
    public Pattern compileImpl(String str) {
        return C13259.m30304(str);
    }

    @Override // p067l.InterfaceC14226
    public Pattern compileImpl(String str, int i) {
        return C13259.m30303(i, str);
    }

    @Override // p067l.InterfaceC14226
    public void checkReplacementTemplateImpl(Pattern pattern, String str) {
        C15269.m34740((C13259) pattern, str);
    }
}
