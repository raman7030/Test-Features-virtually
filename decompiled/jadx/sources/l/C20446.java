package l;

import java.nio.file.DirectoryStream;
import java.util.Set;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩶᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20446 implements DirectoryStream.Filter, Function {
    public static final C20446 a = new C20446();

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo22274andThen(Function function) {
        return C20696.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C20696.$default$compose(this, function);
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        Set set = C17229.a;
        return ((C16211) obj).b;
    }

    @Override // java.nio.file.DirectoryStream.Filter
    /* JADX INFO: renamed from: accept */
    public /* bridge */ /* synthetic */ boolean mo39985accept(Object obj) {
        return true;
    }
}
