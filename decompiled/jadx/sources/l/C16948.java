package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.ܽ᩺ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: B7FA */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C16948 implements Function {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13813 f52026;

    public /* synthetic */ C16948(C13813 c13813) {
        this.f52026 = c13813;
    }

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
    public final Object apply(Object obj) {
        return this.f52026.f37150.m9312((String) obj);
    }
}
