package l;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ᩴ֫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 67O2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18442 extends Exception {
    public C18442(String str) {
        this(AbstractC14545.of((Object) C19322.m44519(str)));
    }

    public C18442(Iterable iterable) {
        super(((C19322) iterable.iterator().next()).toString());
        AbstractC14545.m34730(iterable);
    }

    static {
        Pattern.compile("\\R");
    }
}
