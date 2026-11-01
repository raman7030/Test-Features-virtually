package p067l;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ᩴ֫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 67O2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19895 extends Exception {
    public C19895(String str) {
        this(AbstractC16192.m36873of((Object) C20732.m46813(str)));
    }

    public C19895(Iterable iterable) {
        super(((C20732) iterable.iterator().next()).toString());
        AbstractC16192.m36879(iterable);
    }

    static {
        Pattern.compile("\\R");
    }
}
