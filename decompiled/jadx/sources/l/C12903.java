package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.۬ۚۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 574A */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C12903 implements Function {
    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo22274andThen(Function function) {
        return C20696.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return new C12198((String) obj);
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C20696.$default$compose(this, function);
    }
}
