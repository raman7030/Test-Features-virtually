package p067l;

import java.nio.file.DirectoryStream;
import java.util.Set;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩶᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21801 implements DirectoryStream.Filter, Function {

    /* JADX INFO: renamed from: a */
    public static final C21801 f68619a = new C21801();

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
    public Object apply(Object obj) {
        Set set = C18743.f56028a;
        return ((C17776) obj).f53080b;
    }

    @Override // java.nio.file.DirectoryStream.Filter
    /* JADX INFO: renamed from: accept */
    public /* bridge */ /* synthetic */ boolean mo56507accept(Object obj) {
        return true;
    }
}
