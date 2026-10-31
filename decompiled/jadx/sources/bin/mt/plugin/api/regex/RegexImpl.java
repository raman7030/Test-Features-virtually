package bin.mt.plugin.api.regex;

import bin.mt.plugin.api.util.ServiceLoader;
import l.C11459;
import l.C13574;
import l.InterfaceC12476;

/* JADX INFO: loaded from: classes.dex */
public class RegexImpl implements InterfaceC12476 {
    public static void register() {
        ServiceLoader.register(InterfaceC12476.class, new RegexImpl());
    }

    @Override // l.InterfaceC12476
    public Pattern compileImpl(String str) {
        return C11459.m28260(str);
    }

    @Override // l.InterfaceC12476
    public Pattern compileImpl(String str, int i) {
        return C11459.m28259(i, str);
    }

    @Override // l.InterfaceC12476
    public void checkReplacementTemplateImpl(Pattern pattern, String str) {
        C13574.m32628((C11459) pattern, str);
    }
}
