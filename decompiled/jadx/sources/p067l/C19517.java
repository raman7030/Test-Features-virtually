package p067l;

import java.util.HashSet;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ᩳ۫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: W7SR */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C19517 implements Function {
    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo56417andThen(Function function) {
        return C22038.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C22038.$default$compose(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        C24881 c24881 = new C24881((C20188) obj);
        c24881.f79469 = new HashSet();
        return c24881;
    }
}
